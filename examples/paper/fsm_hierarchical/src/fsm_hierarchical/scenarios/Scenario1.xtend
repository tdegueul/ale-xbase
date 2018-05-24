package fsm_hierarchical.scenarios

import basicFsmEnv.BasicFsmEnvFactory
import basicFsmEnv.runtime.Context
import fsm_hierarchical.revisitor.impl.Fsm_hierarchicalRevisitor
import hierarchicalFsmEnv.HierarchicalFsmEnvFactory

class Scenario1 {

	def static void main(String[] args) {
		val extension basicFsmEnvFactory = BasicFsmEnvFactory::eINSTANCE
		val extension hierarchicalFsmEnvFactory = HierarchicalFsmEnvFactory::eINSTANCE

		val rev = new Fsm_hierarchicalRevisitor {
		}

		val locked = createInitialState => [name = 'LOCKED']
		val unlocked = createState => [name = 'UNLOCKED']
		val opened = createInitialState => [name = 'OPENED']
		val closed = createCompositeState => [
			name = 'CLOSED'
			regions += createRegion => [
				states += #[locked, unlocked]
			]
		]
		val open = createTrans => [
			event = 'open'
			src = unlocked
			tgt = opened
		]

		val close = createTrans => [
			event = 'close'
			src = opened
			tgt = closed
		]

		val unlock = createTrans => [
			event = 'unlock'
			src = locked
			tgt = unlocked
		]
		val m = createMachine => [
			states += #[opened, closed]
			trans += #[open, close, unlock]
		]

		val c = new Context
		try {
			rev.$(m).exec(#['close', 'unlock', 'open'], c)
		} catch (RuntimeException e) {
			println(e)
		} finally {
			println('''
				«FOR t : c.trace»
					- «t.name»
				«ENDFOR»
			''')
		}
	}
}
