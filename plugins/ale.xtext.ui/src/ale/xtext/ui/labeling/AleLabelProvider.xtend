package ale.xtext.ui.labeling

import ale.xtext.ale.AleMethod
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class AleLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def String text(AleMethod it)
		'''«name»(«params.map[name].join(", ")»)'''

}
