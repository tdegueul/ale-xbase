package fsm.main;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import evalfsm.revisitor.EvalfsmRevisitor;
import fsm.FsmPackage;
import fsm.Machine;
import fsm.dyn.Context;
import printfsm.revisitor.PrintfsmRevisitor;

public class Main {
	public static void main(String[] args) {
		Machine m = loadModel();

		printfsm.revisitor.operations.MachineOperation printSem = new PrintfsmRevisitor(){}.$(m);
		evalfsm.revisitor.operations.MachineOperation evalSem = new EvalfsmRevisitor(){}.$(m);

		System.out.println(printSem.print());

		String[] events = {"push", "coin", "coin", "push", "push", "coin", "push"};
		Context ctx = new Context();
		evalSem.execute(events, ctx);
		System.out.println("Trace: " +
			ctx.getTrace().stream()
			.map(s -> s.getName())
			.collect(Collectors.joining(" -> ")));
	}

	public static Machine loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("fsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage.eINSTANCE);

		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("model/Turnstile.fsm"), true);
		return (Machine) res.getContents().get(0);
	}
}
