package ale.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class AleEcoreUtil {
	public EPackage loadEPackageByEcorePath(final String path, final ResourceSet resSet) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		final URI createURI = URI.createURI(path);
		try {
			final Resource resource = resSet.getResource(createURI, true);
			EcoreUtil.resolveAll(resSet);
			final EList<EObject> contents = resource.getContents();
			if (contents.isEmpty() || !(contents.get(0) instanceof EPackage))
				return null;
			return (EPackage) contents.get(0);
		} catch (WrappedException e) {
			return null;
		}
	}

	// TODO: While most X.genmodel are next to their X.ecore, this might not always be the case.
	// So, we need to provide users with a way to specify where the genmodel(s) are located.
	// ALE's grammar should be updated accordingly, and the information used here.
	public GenModel loadGenmodelByEcorePath(final String path, final ResourceSet resSet) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		// FIXME: jajaja, ugly af
		String genmodelPath = path.substring(0, path.length() - 5) + "genmodel";
		final URI createURI = URI.createURI(genmodelPath);
		try {
			final Resource resource = resSet.getResource(createURI, true);
			EcoreUtil.resolveAll(resSet);
			final EList<EObject> contents = resource.getContents();
			if (contents.isEmpty() || !(contents.get(0) instanceof GenModel))
				return null;
			return (GenModel) contents.get(0);
		} catch (WrappedException e) {
			return null;
		}
	}

	public EPackage loadEPackage(final IFile file, ResourceSet resourceSet) {
		final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resourceSet);
		return (EPackage) resource.getContents().get(0);
	}

	public GenModel loadGenmodel(final IFile file, ResourceSet resourceSet) {
		final URI uri = URI.createPlatformResourceURI(file.getFullPath().removeFileExtension().addFileExtension("genmodel").toString(), true);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resourceSet);
		return (GenModel) resource.getContents().get(0);
	}
}
