package ale.xtext.ui.hyperlink

import ale.xtext.ale.AlePackage
import ale.xtext.ale.EcoreImport
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.text.Region
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor
import org.eclipse.xtext.xbase.ui.navigation.XbaseHyperLinkHelper

class AleHyperlinkHelper extends XbaseHyperLinkHelper {
	override createHyperlinksByOffset(XtextResource res, int offset, IHyperlinkAcceptor acceptor) {
		val elem = EObjectAtOffsetHelper.resolveElementAt(res, offset)
		val nodes = NodeModelUtils::findNodesForFeature(elem, AlePackage.Literals::ECORE_IMPORT__URI)
		val region = nodes.map[textRegion].filter[contains(offset)].head

		if (elem instanceof EcoreImport) {
			val uriConverter = res.resourceSet.URIConverter
			val uri = URI::createURI(elem.uri)

			acceptor.accept(hyperlinkProvider.get() => [
				hyperlinkRegion = new Region(region.offset, region.length)
				URI = if (uri.isPlatformResource) uri else uriConverter.normalize(uri)
				hyperlinkText = "Open Ecore file"
			])
		}
	}
}
