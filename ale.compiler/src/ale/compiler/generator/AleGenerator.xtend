package ale.compiler.generator

import ale.compiler.generator.util.NamingUtils
import ale.xtext.ale.AleClass
import ale.xtext.ale.Root
import java.io.FileWriter
import java.io.IOException
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet

class AleGenerator {
	IProject project
	ResourceSet rs
	RevisitorGenerator generator
	extension NamingUtils = new NamingUtils()

	new(IProject project, ResourceSet rs) {
		this.project = project
		this.rs = rs
		this.generator = new RevisitorGenerator(rs)
	}
	
	def void saveRevisitorInterface(EPackage pkg, GenModel gm, ResourceSet rs) {
		val f = prepareFile(
			new Path("src/" + pkg.name + "/revisitor"),
			new Path(pkg.name.toFirstUpper + "Revisitor")
		)
		val content = generator.generateInterface(pkg, gm)

		saveContent(f, content)
	}

	def void saveRevisitorImpl(Root root, List<EPackage> pkgs, List<GenModel> gms) {
		val f = prepareFile(
			new Path("src/" + root.name + "/revisitor/impl"),
			new Path(root.name.toFirstUpper + "RevisitorImpl")
		)
		val content = generator.generateImpl(root, pkgs, gms)

		saveContent(f, content)
	}

	def void saveOperationInterface(EClass eClass, AleClass cls, List<EPackage> pkgs,
		Root root) {
		val aleName = cls.rootNameOrDefault
		val f = prepareFile(
			new Path("src/" + aleName + "/revisitor/operation"),
			new Path(aleName.toFirstUpper + eClass.name.toFirstUpper + "Operation")
		)
		val content = generator.generateOperationInterface(eClass, cls, pkgs, root)

		saveContent(f, content)
	}

	def void saveOperationImpl(EClass eClass, AleClass aleClass, List<EPackage> pkgs,
		Root root) {
		val aleName = aleClass.rootNameOrDefault
		val f = prepareFile(
			new Path("src/" + aleName + "/revisitor/operation/impl"),
			new Path(aleName.toFirstUpper + eClass.name.toFirstUpper + "OperationImpl")
		)
		val content = generator.generateOperationImpl(eClass, aleClass, pkgs, root)

		saveContent(f, content)
	}

	private def IPath prepareFile(IPath path, IPath filename) {
		val file = project.location.append(path)
		file.toFile().mkdirs()
		return file.append(filename).addFileExtension("java")
	}

	private def void saveContent(IPath target, String fileContent) {
		try {
			val fileWriter = new FileWriter(target.toFile())
			fileWriter.write(fileContent)
			fileWriter.close()
			project.refreshLocal(IResource::DEPTH_INFINITE, new NullProgressMonitor())
		} catch (IOException e) {
			e.printStackTrace()
		} catch (CoreException e) {
			e.printStackTrace()
		}
	}
}
