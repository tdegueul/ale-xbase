package fsm.scenarios

import fsm.revisitor.impl.FsmRevisitor
import basicFsmEnv.BasicFsmEnvFactory
import basicFsmEnv.runtime.Context

class Scenario1 {

	def static void main(String[] args) {
		val extension basicFsmEnvFactory = BasicFsmEnvFactory::eINSTANCE

		val rev = new FsmRevisitor {
		}

		val opened = createInitialState => [name = 'OPENED']
		val closed = createState => [name = 'CLOSED']
		val open = createTrans => [
			event = 'open'
			src = closed
			tgt = opened
		]

		val close = createTrans => [
			event = 'close'
			src = opened
			tgt = closed
		]
		val m = createMachine => [
			states += opened
			states += closed
			trans += open
			trans += close
		]

		val c = new Context
		rev.$(m).exec(#['close', 'open', 'close'], c)
		println('''
			«FOR t : c.trace»
				- «t.name»
			«ENDFOR»
		''')
	}
}
