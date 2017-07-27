package ale.xtext.ui.outline

import ale.xtext.ale.AleMethod
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.xtype.XImportSection

class AleOutlineTreeProvider extends DefaultOutlineTreeProvider {
	protected def void _createNode(IOutlineNode parent, XImportSection it) {
		// Nope
	}

	// Don't show method bodies
	protected def boolean _isLeaf(AleMethod m) {
		return true
	}
}
