/**
 */
package adruntime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adruntime.AdruntimePackage
 * @generated
 */
public interface AdruntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdruntimeFactory eINSTANCE = adruntime.impl.AdruntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Unary Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Unary Expression Aspect</em>'.
	 * @generated
	 */
	BooleanUnaryExpression_Aspect createBooleanUnaryExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Join Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node Aspect</em>'.
	 * @generated
	 */
	JoinNode_Aspect createJoinNode_Aspect();

	/**
	 * Returns a new object of class '<em>Boolean Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression Aspect</em>'.
	 * @generated
	 */
	BooleanExpression_Aspect createBooleanExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Opaque Action Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action Aspect</em>'.
	 * @generated
	 */
	OpaqueAction_Aspect createOpaqueAction_Aspect();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Initial Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node Aspect</em>'.
	 * @generated
	 */
	InitialNode_Aspect createInitialNode_Aspect();

	/**
	 * Returns a new object of class '<em>Control Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Node Aspect</em>'.
	 * @generated
	 */
	ControlNode_Aspect createControlNode_Aspect();

	/**
	 * Returns a new object of class '<em>Executable Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Node Aspect</em>'.
	 * @generated
	 */
	ExecutableNode_Aspect createExecutableNode_Aspect();

	/**
	 * Returns a new object of class '<em>Activity Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Aspect</em>'.
	 * @generated
	 */
	Activity_Aspect createActivity_Aspect();

	/**
	 * Returns a new object of class '<em>Action Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Aspect</em>'.
	 * @generated
	 */
	Action_Aspect createAction_Aspect();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Integer Comparison Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Comparison Expression Aspect</em>'.
	 * @generated
	 */
	IntegerComparisonExpression_Aspect createIntegerComparisonExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Activity Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node Aspect</em>'.
	 * @generated
	 */
	ActivityNode_Aspect createActivityNode_Aspect();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression Aspect</em>'.
	 * @generated
	 */
	BooleanBinaryExpression_Aspect createBooleanBinaryExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Control Flow Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Aspect</em>'.
	 * @generated
	 */
	ControlFlow_Aspect createControlFlow_Aspect();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Aspect</em>'.
	 * @generated
	 */
	Variable_Aspect createVariable_Aspect();

	/**
	 * Returns a new object of class '<em>Activity Final Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Final Node Aspect</em>'.
	 * @generated
	 */
	ActivityFinalNode_Aspect createActivityFinalNode_Aspect();

	/**
	 * Returns a new object of class '<em>Integer Calculation Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculation Expression Aspect</em>'.
	 * @generated
	 */
	IntegerCalculationExpression_Aspect createIntegerCalculationExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Integer Expression Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Expression Aspect</em>'.
	 * @generated
	 */
	IntegerExpression_Aspect createIntegerExpression_Aspect();

	/**
	 * Returns a new object of class '<em>Integer Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable Aspect</em>'.
	 * @generated
	 */
	IntegerVariable_Aspect createIntegerVariable_Aspect();

	/**
	 * Returns a new object of class '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value</em>'.
	 * @generated
	 */
	InputValue createInputValue();

	/**
	 * Returns a new object of class '<em>Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token</em>'.
	 * @generated
	 */
	ForkedToken createForkedToken();

	/**
	 * Returns a new object of class '<em>Boolean Variable Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Aspect</em>'.
	 * @generated
	 */
	BooleanVariable_Aspect createBooleanVariable_Aspect();

	/**
	 * Returns a new object of class '<em>Activity Edge Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Edge Aspect</em>'.
	 * @generated
	 */
	ActivityEdge_Aspect createActivityEdge_Aspect();

	/**
	 * Returns a new object of class '<em>Fork Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node Aspect</em>'.
	 * @generated
	 */
	ForkNode_Aspect createForkNode_Aspect();

	/**
	 * Returns a new object of class '<em>Final Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Node Aspect</em>'.
	 * @generated
	 */
	FinalNode_Aspect createFinalNode_Aspect();

	/**
	 * Returns a new object of class '<em>Decision Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node Aspect</em>'.
	 * @generated
	 */
	DecisionNode_Aspect createDecisionNode_Aspect();

	/**
	 * Returns a new object of class '<em>Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Token</em>'.
	 * @generated
	 */
	ControlToken createControlToken();

	/**
	 * Returns a new object of class '<em>Merge Node Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node Aspect</em>'.
	 * @generated
	 */
	MergeNode_Aspect createMergeNode_Aspect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdruntimePackage getAdruntimePackage();

} //AdruntimeFactory
