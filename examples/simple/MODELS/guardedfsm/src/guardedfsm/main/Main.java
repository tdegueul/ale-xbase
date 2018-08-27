package guardedfsm.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import guardedfsm.GuardedfsmPackage;
import guardedfsmprinting.revisitor.impl.GuardedfsmprintingRevisitor;
import guardedfsmprinting.revisitor.operations.guardedfsmprinting.MachineOperation;
import minifsm.Machine;

public class Main {
	public static void main(String[] args) {
		Machine m = loadModel();
		MachineOperation sem = new GuardedfsmprintingRevisitor(){}.$(m);
		
		System.out.println(sem.print());
	}

	public static Machine loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("guardedfsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(GuardedfsmPackage.eNS_URI, GuardedfsmPackage.eINSTANCE);

		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("model/Simple.guardedfsm"), true);
		return (Machine) res.getContents().get(0);
	}
}
