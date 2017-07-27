package minifsm.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fsmprinting.revisitor.FsmprintingRevisitor;
import fsmprinting.revisitor.operations.MachineOperation;
import minifsm.Machine;
import minifsm.MinifsmPackage;

public class Main {
	public static void main(String[] args) {
		Machine m = loadModel();
		MachineOperation sem = new FsmprintingRevisitor(){}.$(m);
		
		System.out.println("Printing MiniFsm:");
		System.out.println(sem.print());
	}

	public static Machine loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("minifsm", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(MinifsmPackage.eNS_URI, MinifsmPackage.eINSTANCE);

		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("model/Simple.minifsm"), true);
		return (Machine) res.getContents().get(0);
	}
}
