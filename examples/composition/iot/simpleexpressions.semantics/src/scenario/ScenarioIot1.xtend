package scenario

import simpleexpressions.BooleanBinaryOperator
import simpleexpressions_exec.revisitor.Simpleexpressions_execRevisitor

import static simpleexpressions.SimpleexpressionsFactory.eINSTANCE

class ScenarioIot1 {
	def static void main(String[] args) {
		val extension simpleExpressionFactory = eINSTANCE

		val rev = new Simpleexpressions_execRevisitor() {
		}

		val model = createBooleanBinaryExpression => [
			operator = BooleanBinaryOperator::AND
			operand1 = createBooleanVariable => [
				currentValue = createBooleanValue => [
					value = true
				]
			]
			operand2 = createBooleanVariable => [
				currentValue = createBooleanValue => [
					value = false
				]
			]
			assignee = createBooleanVariable => [
				currentValue = createBooleanValue
				name = 'scenario1'
			]
		]

		rev.$(model).execute
		println(rev.$(model.assignee).print)
	}
}
