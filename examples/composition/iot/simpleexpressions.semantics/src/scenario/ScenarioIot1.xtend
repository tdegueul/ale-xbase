package scenario

import simpleexpressions.SEBooleanBinaryOperator
import simpleexpressions_exec.revisitor.impl.Simpleexpressions_execRevisitor

import static simpleexpressions.SimpleexpressionsFactory.eINSTANCE

class ScenarioIot1 {
	def static void main(String[] args) {
		val extension simpleExpressionFactory = eINSTANCE

		val rev = new Simpleexpressions_execRevisitor() {
		}

		val model = createSEBooleanBinaryExpression => [
			operator = SEBooleanBinaryOperator::AND
			operand1 = createSEBooleanVariable => [
				currentValue = createSEBooleanValue => [
					value = true
				]
			]
			operand2 = createSEBooleanVariable => [
				currentValue = createSEBooleanValue => [
					value = false
				]
			]
			assignee = createSEBooleanVariable => [
				currentValue = createSEBooleanValue
				name = 'scenario1'
			]
		]

		rev.$(model).execute
		println(rev.$(model.assignee).print)
	}
}
