package scenario

import activitydiagram.ActivitydiagramFactory
import activitydiagram.ActivitydiagramPackage
import activitydiagramruntime.ActivitydiagramruntimeFactory
import activitydiagramruntime.ActivitydiagramruntimePackage
import iotlua.BooleanVariableBindExpression_VariableName
import iotlua.IotluaFactory
import iotlua.revisitor.impl.IotluaRevisitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl
import org.xtext.lua.lua.LuaFactory
import org.xtext.lua.lua.LuaPackage
import iotlua.IntegerVariableBindExpression_VariableName

class ScenarioIoTLua1 {
	def static createBooleanVariable(String name, boolean value,
		ResourceSet rs) {
		val extension iotluafactory = IotluaFactory::eINSTANCE
		val extension luafactory = LuaFactory::eINSTANCE

		val res = rs.createResource(URI.createURI('''bool_var_«name».xml'''))

//		val bvar = createBooleanVariable => [
//			it.name = name
//			initialValue = createBooleanValue => [
//				it.value = value
//			]
//		]
//		res.contents += bvar
//		createBooleanVariableBindBooleanVariable => [
//			it.name = name
//			delegate = bvar
//		]
		createBooleanVariableBindStatement_Assignment => [
			delegate = createStatement_Assignment => [
				variable += createExpression_VariableName => [
					variable = name
				]
				values += if(value) createExpression_True else createExpression_False
			]
		]
	}

	def static  createIntVariable(String name, Integer value,
		ResourceSet rs) {
		val extension iotluafactory = IotluaFactory::eINSTANCE
		val extension luafactory = LuaFactory::eINSTANCE

		val res = rs.createResource(URI.createURI('''int_var_«name».xml'''))
//		val ivar = createIntegerVariable => [
//			initialValue = createIntegerValue => [it.value = value]
//		]
//
//		res.contents += ivar
//
//		createIntegerVariableBindIntegerVariable => [
//			it.name = name
//			delegate = ivar
//		]
		createBooleanVariableBindStatement_Assignment => [
			delegate = createStatement_Assignment => [
				variable += createExpression_VariableName => [
					variable = name
				]
				values += createExpression_Number => [
					it.value = value
				]
			]
		]
	}

	def static void main(String[] args) {

		val sead = ActivitydiagramPackage::eINSTANCE
		val seadr = ActivitydiagramruntimePackage::eINSTANCE
		val sese = LuaPackage::eINSTANCE
		val seiot = IotluaFactory::eINSTANCE

		val extension activitydiagramfactory = ActivitydiagramFactory::eINSTANCE
		val extension activitydiagramruntimefactory = ActivitydiagramruntimeFactory::eINSTANCE
		val extension iotluafactory = IotluaFactory::eINSTANCE
		val extension luafactory = LuaFactory::eINSTANCE

		val rev = new IotluaRevisitor {
		}

		val rs = new ResourceSetImpl
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		val res = rs.createResource(URI.createURI("./iot.xml"));

		val tooHot = createBooleanVariable('tooHot', false, rs)
		val tooCold = createBooleanVariable('tooCold', false, rs)
		val tooBright = createBooleanVariable('tooBright', false, rs)
		val tooObscure = createBooleanVariable('tooObscure', false, rs)
		val stop = createBooleanVariable('stop', false, rs)
		val dontStop = createBooleanVariable('dontStop', true, rs)
		val temp = createIntVariable('temp', 0, rs)
		val tempThreshold = createIntVariable('tempThreshold', 21, rs)

		val e1 = createControlFlow => [name = 'e1'] // flow e1 from init to m1,
		val e2 = createControlFlow => [name = 'e2'] // flow e2 from m1 to f1,
		val e3 = createControlFlow => [name = 'e3'] // flow e3 from f1 to a1,
		val e4 = createControlFlow => [name = 'e4'] // flow e4 from f1 to a2,
		val e5 = createControlFlow => [name = 'e5'] // flow e5 from a1 to d1,
		val e6 = createControlFlow => [name = 'e6'] // flow e6 from a2 to d2,
		val e7 = createControlFlow => [name = 'e7'] // flow e7 from d1 to a3 [tooHot],
		val e8 = createControlFlow => [name = 'e8'] // flow e8 from d1 to a4 [tooCold],
		val e9 = createControlFlow => [name = 'e9'] // flow e9 from d2 to a5 [tooBright],
		val e10 = createControlFlow => [name = 'e10'] // flow e10 from d2 to a6 [tooObscure],
		val e11 = createControlFlow => [name = 'e11'] // flow e11 from a3 to m2,
		val e12 = createControlFlow => [name = 'e12'] // flow e12 from a4 to m2,
		val e13 = createControlFlow => [name = 'e13'] // flow e13 from a5 to m3,
		val e14 = createControlFlow => [name = 'e14'] // flow e14 from a6 to m3,
		val e15 = createControlFlow => [name = 'e15'] // flow e15 from m2 to j1,
		val e16 = createControlFlow => [name = 'e16'] // flow e16 from m3 to j1,
		val e17 = createControlFlow => [name = 'e17'] // flow e17 from j1 to computeIterations,
		val e18 = createControlFlow => [name = 'e18'] // flow e18 from d3 to fin [stop],
		val e19 = createControlFlow => [name = 'e19'] // flow e19 from d3 to m1 [dontStop],
		val e20 = createControlFlow => [name = 'e20'] // flow e20 from computeIterations to d3
		val initial = createInitialNode => [
			name = 'init'
			outgoing += e1
		]

		val m1 = createMergeNode => [
			name = 'm1'
			incoming += e1
			incoming += e19
			outgoing += e2
		]

		val f1 = createForkNode => [
			name = 'f1'
			incoming += e2
			outgoing += e3
			outgoing += e4
		]

		val getTemp = null

// 				action a1 comp { tooHot = temp >= tempThreshold, tooCold = temp < tempThreshold } in (e3) out (e5) service getTemp,
		val a1 = createOpaqueAction => [
			name = 'a1'
			incoming += e3
			outgoing += e5
			expressions += createExpressionBindStatement => [
				delegate = createStatement_Assignment => [
					variable += tooHot.delegate.variable.head
					values += createExpression_Larger_Equal => [
						left = temp.delegate.variable.head
						right = tempThreshold.delegate.variable.head
					]
				]
			]

			expressions += createExpressionBindStatement => [
				delegate = createStatement_Assignment => [
					variable += tooCold.delegate.variable.head
					values += createExpression_Smaller => [
						left = temp.delegate.variable.head
						right = tempThreshold.delegate.variable.head
					]
				]
			]
		]

//				action a2 comp { tooBright = lumen >= lumenThreshold, tooObscure = lumen < lumenThreshold } in (e4) out (e6) service getLuminosity,
		val a2 = createOpaqueAction => [
			name = 'a2'
			incoming += e2
			outgoing += e6
		]
//				decision d1 in (e5) out (e7, e8),
		val d1 = createDecisionNode => [
			name = 'd1'
			incoming += e5
			outgoing += e7
			outgoing += e8
		]
//				decision d2 in (e6) out (e9, e10),
		val d2 = createDecisionNode => [
			name = 'd2'
			incoming += e6
			outgoing += e9
			outgoing += e19
		]
//				action a3 in (e7) out (e11) service lowerTemp,
		val a3 = createOpaqueAction => [
			name = 'a3'
			incoming += e7
			outgoing += e11
		]
//				action a4 in (e8) out (e12) service raiseTemp,
		val a4 = createOpaqueAction => [
			name = 'a4'
			incoming += e8
			outgoing += e12
		]
//				action a5 in (e9) out (e13) service turnLightOff,
		val a5 = createOpaqueAction => [
			name = 'a5'
			incoming += e9
			outgoing += e13
		]

//				action a6 in (e10) out (e14) service turnLightOn,
		val a6 = createOpaqueAction => [
			name = 'a6'
			incoming += e10
			outgoing += e14
		]
//				merge m2 in (e11, e12) out (e15),
		val m2 = createMergeNode => [
			name = 'm2'
			incoming += e11
			incoming += e12
			outgoing += e15
		]
//				merge m3 in (e13, e14) out (e16),
		val m3 = createMergeNode => [
			name = 'm3'
			incoming += e13
			incoming += e14
			outgoing += e16
		]
//				join j1 in (e15, e16) out (e17),
		val j1 = createJoinNode => [
			name = 'j1'
			incoming += e15
			incoming += e16
			outgoing += e17
		]
//				action computeIterations comp { i = i + one, stop = i >= nbIter, dontStop = i < nbIter } in (e17) out (e20) service wait,
		val computeIterations = createOpaqueAction => [
			name = 'computeIterations'
			incoming += e17
			outgoing += e20
		]
//				decision d3 in (e20) out (e18, e19),
		val d3 = createDecisionNode => [
			name = 'd3'
			incoming += e20
			outgoing += e18
			outgoing += e19
		]
//				final fin in (e18)
		val fin = createActivityFinalNode => [
			name = 'fin'
			incoming += e18
		]

		val act = createActivity => [
			name = 'machine'
			nodes += #[initial, m1, f1, a1, a2, d1, d2, a3, a4, a5, a6, m2, m3, j1, computeIterations, d3, fin]
			edges += #[e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20]
			inputs += stop
			inputs += dontStop
			inputs += tooBright
			inputs += tooObscure
			inputs += tooHot
			inputs += tooCold
			inputs += temp
			inputs += createIntVariable('lumen', 0, rs)

			inputs += tempThreshold
			inputs += createIntVariable('lumenThreshold', 1600, rs)
			inputs += createIntVariable('i', 0, rs)
			inputs += createIntVariable('one', 1, rs)
			inputs += createIntVariable('nbIter', 15, rs)
			inputs += createIntVariable('waitingTime', 500, rs)

		]

		e1.source = initial
		e2.target = m1
		e2.source = m1
		e2.target = f1
		e3.source = f1
		e3.target = a1
		e4.source = f1
		e4.target = a2
		e5.source = a1
		e5.target = d1
		e6.source = a2
		e6.target = d2
		e7.source = d1
		e7.target = a3
		e7.guard = tooHot // [tooHot],
		e8.source = d1
		e8.target = a4 // [tooCold],
		e9.guard = tooCold
		e9.source = d2
		e9.target = a5 // [tooBright],
		e9.guard = tooBright
		e10.source = d2
		e10.target = a6 // [tooObscure],
		e10.guard = tooObscure
		e11.source = a3
		e11.target = m2
		e12.source = a4
		e12.target = m2
		e13.source = a5
		e13.target = m3
		e14.source = a6
		e14.target = m3
		e15.source = m2
		e15.target = j1
		e16.source = m3
		e16.target = j1
		e17.source = j1
		e17.target = computeIterations
		e18.source = d3
		e18.target = fin // [stop],
		e18.guard = stop
		e19.source = d3
		e19.target = m1 // [dontStop],
		e19.guard = dontStop
		e20.source = computeIterations
		e20.target = d3
		val tr = createTrace

		res.contents += act

//		res.save(newHashMap)
		val a = rev.$(act)
		a.execute(createContext => [
			output = tr

		])

		println('''
			Trace:
			«FOR t : tr.executedNodes»
				«t.name»
			«ENDFOR»
		''')

	}
}
