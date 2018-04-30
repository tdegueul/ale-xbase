package scenario

import activitydiagram.ActivitydiagramFactory
import activitydiagramruntime.ActivitydiagramruntimeFactory
import iot.revisitor.impl.IotRevisitor
import simpleexpressions.SimpleexpressionsFactory
import activitydiagramruntime.Context

class Scenario1 {

	def static void main(String[] args) {

		val extension activitydiagramfactory = ActivitydiagramFactory::eINSTANCE
		val extension activitydiagramruntimefactory = ActivitydiagramruntimeFactory::eINSTANCE
		val extension simpleexpressionsfactory = SimpleexpressionsFactory::eINSTANCE

		val rev = new IotRevisitor() {
		}

		val i1 = createInitialNode => [
			name = 'i1'
		]

		val a1 = createActivity => [
			name = 'a1'
			nodes += i1
		]
		
		
		rev.$(a1).execute(createContext => [
			activity = a1
		])
	}
}
