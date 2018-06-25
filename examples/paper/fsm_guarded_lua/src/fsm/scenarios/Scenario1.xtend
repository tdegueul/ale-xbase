package fsm.scenarios

import basicFsmEnv.BasicFsmEnvFactory
import basicFsmEnv.runtime.Context
import fsm_guarded_lua.revisitor.impl.Fsm_guarded_luaRevisitor
import fsm_guarded_lua.Fsm_guarded_luaFactory
import org.xtext.lua.lua.LuaFactory

class Scenario1 {

	def static void main(String[] args) {
		val extension basicFsmEnvFactory = BasicFsmEnvFactory::eINSTANCE
		val extension fsmGuardedLuaFactory = Fsm_guarded_luaFactory::eINSTANCE
		val extension luaFactory = LuaFactory::eINSTANCE

		val rev = new Fsm_guarded_luaRevisitor {
		}

		val opened = createInitialState => [
			name = 'OPENED'
			decls += createVarDecl => [
				name = 'counter'
				value = 0d
			]
		]
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
			action = createActionBindStatement => [
				delegate = createStatement_Block => [
					block = createBlock => [
						statements += createStatement_CallFunction => [
							arguments = createFunctioncall_Arguments => [
								arguments += createExpression_VariableName => [variable = 'counter']
							]
							object = createExpression_VariableName => [variable = "print"]
						]
						statements += createExpression_Plus => [
							left = createExpression_Number => [value = 1]
							right = createExpression_VariableName => [variable = 'counter']
						]
					]

				]

			]

			guard = createGuardBindExpression => [
				delegate = createExpression_Smaller => [
					left = createExpression_VariableName => [variable = 'counter']
					right = createExpression_Number => [value = 3]
				]
			]
		]

		val cannotClose = createTrans => [
			event = 'close'
			src = opened
			src = opened
		]
		val m = createMachine => [
			states += opened
			states += closed
			trans += open
			trans += close
			trans += cannotClose
		]

		val c = new Context
		rev.$(m).exec(
			#['close', 'open', 'close', 'open', 'close', 'open', 'close', 'open', 'close', 'open', 'close', 'open',
				'close', 'open', 'close', 'open', 'close'], c)
		println('''
			«FOR t : c.trace»
				- «t.name»
			«ENDFOR»
		''')
	}
}
