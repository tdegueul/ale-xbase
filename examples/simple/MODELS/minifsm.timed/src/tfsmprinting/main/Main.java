package tfsmprinting.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fsmprinting.revisitor.operations.MachineOperation;
import minifsm.Machine;
import tfsmprinting.revisitor.TfsmprintingRevisitor;
import timedminifsm.TimedminifsmPackage;

public class Main {
	public static void main(String[] args) {
		Machine m = loadModel();
		MachineOperation sem = new TfsmprintingRevisitor(){}.$(m);
		
		System.out.println("Printing TimedMiniFsm:");
		System.out.println(sem.print());
	}

	public static Machine loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("timedminifsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(TimedminifsmPackage.eNS_URI, TimedminifsmPackage.eINSTANCE);

		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("model/Simple.timedminifsm"), true);
		return (Machine) res.getContents().get(0);
	}
}
