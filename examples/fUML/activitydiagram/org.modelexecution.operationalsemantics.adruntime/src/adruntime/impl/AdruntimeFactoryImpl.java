/**
 */
package adruntime.impl;

import adruntime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdruntimeFactoryImpl extends EFactoryImpl implements AdruntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdruntimeFactory init() {
		try {
			AdruntimeFactory theAdruntimeFactory = (AdruntimeFactory)EPackage.Registry.INSTANCE.getEFactory(AdruntimePackage.eNS_URI);
			if (theAdruntimeFactory != null) {
				return theAdruntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdruntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdruntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdruntimePackage.BOOLEAN_UNARY_EXPRESSION_ASPECT: return createBooleanUnaryExpression_Aspect();
			case AdruntimePackage.JOIN_NODE_ASPECT: return createJoinNode_Aspect();
			case AdruntimePackage.BOOLEAN_EXPRESSION_ASPECT: return createBooleanExpression_Aspect();
			case AdruntimePackage.OPAQUE_ACTION_ASPECT: return createOpaqueAction_Aspect();
			case AdruntimePackage.TOKEN: return createToken();
			case AdruntimePackage.INITIAL_NODE_ASPECT: return createInitialNode_Aspect();
			case AdruntimePackage.CONTROL_NODE_ASPECT: return createControlNode_Aspect();
			case AdruntimePackage.EXECUTABLE_NODE_ASPECT: return createExecutableNode_Aspect();
			case AdruntimePackage.ACTIVITY_ASPECT: return createActivity_Aspect();
			case AdruntimePackage.ACTION_ASPECT: return createAction_Aspect();
			case AdruntimePackage.TRACE: return createTrace();
			case AdruntimePackage.INTEGER_COMPARISON_EXPRESSION_ASPECT: return createIntegerComparisonExpression_Aspect();
			case AdruntimePackage.ACTIVITY_NODE_ASPECT: return createActivityNode_Aspect();
			case AdruntimePackage.BOOLEAN_BINARY_EXPRESSION_ASPECT: return createBooleanBinaryExpression_Aspect();
			case AdruntimePackage.CONTROL_FLOW_ASPECT: return createControlFlow_Aspect();
			case AdruntimePackage.INPUT: return createInput();
			case AdruntimePackage.OFFER: return createOffer();
			case AdruntimePackage.VARIABLE_ASPECT: return createVariable_Aspect();
			case AdruntimePackage.ACTIVITY_FINAL_NODE_ASPECT: return createActivityFinalNode_Aspect();
			case AdruntimePackage.INTEGER_CALCULATION_EXPRESSION_ASPECT: return createIntegerCalculationExpression_Aspect();
			case AdruntimePackage.INTEGER_EXPRESSION_ASPECT: return createIntegerExpression_Aspect();
			case AdruntimePackage.INTEGER_VARIABLE_ASPECT: return createIntegerVariable_Aspect();
			case AdruntimePackage.INPUT_VALUE: return createInputValue();
			case AdruntimePackage.FORKED_TOKEN: return createForkedToken();
			case AdruntimePackage.BOOLEAN_VARIABLE_ASPECT: return createBooleanVariable_Aspect();
			case AdruntimePackage.ACTIVITY_EDGE_ASPECT: return createActivityEdge_Aspect();
			case AdruntimePackage.FORK_NODE_ASPECT: return createForkNode_Aspect();
			case AdruntimePackage.FINAL_NODE_ASPECT: return createFinalNode_Aspect();
			case AdruntimePackage.DECISION_NODE_ASPECT: return createDecisionNode_Aspect();
			case AdruntimePackage.CONTROL_TOKEN: return createControlToken();
			case AdruntimePackage.MERGE_NODE_ASPECT: return createMergeNode_Aspect();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression_Aspect createBooleanUnaryExpression_Aspect() {
		BooleanUnaryExpression_AspectImpl booleanUnaryExpression_Aspect = new BooleanUnaryExpression_AspectImpl();
		return booleanUnaryExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode_Aspect createJoinNode_Aspect() {
		JoinNode_AspectImpl joinNode_Aspect = new JoinNode_AspectImpl();
		return joinNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression_Aspect createBooleanExpression_Aspect() {
		BooleanExpression_AspectImpl booleanExpression_Aspect = new BooleanExpression_AspectImpl();
		return booleanExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction_Aspect createOpaqueAction_Aspect() {
		OpaqueAction_AspectImpl opaqueAction_Aspect = new OpaqueAction_AspectImpl();
		return opaqueAction_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode_Aspect createInitialNode_Aspect() {
		InitialNode_AspectImpl initialNode_Aspect = new InitialNode_AspectImpl();
		return initialNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode_Aspect createControlNode_Aspect() {
		ControlNode_AspectImpl controlNode_Aspect = new ControlNode_AspectImpl();
		return controlNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode_Aspect createExecutableNode_Aspect() {
		ExecutableNode_AspectImpl executableNode_Aspect = new ExecutableNode_AspectImpl();
		return executableNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity_Aspect createActivity_Aspect() {
		Activity_AspectImpl activity_Aspect = new Activity_AspectImpl();
		return activity_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_Aspect createAction_Aspect() {
		Action_AspectImpl action_Aspect = new Action_AspectImpl();
		return action_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression_Aspect createIntegerComparisonExpression_Aspect() {
		IntegerComparisonExpression_AspectImpl integerComparisonExpression_Aspect = new IntegerComparisonExpression_AspectImpl();
		return integerComparisonExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode_Aspect createActivityNode_Aspect() {
		ActivityNode_AspectImpl activityNode_Aspect = new ActivityNode_AspectImpl();
		return activityNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression_Aspect createBooleanBinaryExpression_Aspect() {
		BooleanBinaryExpression_AspectImpl booleanBinaryExpression_Aspect = new BooleanBinaryExpression_AspectImpl();
		return booleanBinaryExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow_Aspect createControlFlow_Aspect() {
		ControlFlow_AspectImpl controlFlow_Aspect = new ControlFlow_AspectImpl();
		return controlFlow_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable_Aspect createVariable_Aspect() {
		Variable_AspectImpl variable_Aspect = new Variable_AspectImpl();
		return variable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode_Aspect createActivityFinalNode_Aspect() {
		ActivityFinalNode_AspectImpl activityFinalNode_Aspect = new ActivityFinalNode_AspectImpl();
		return activityFinalNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression_Aspect createIntegerCalculationExpression_Aspect() {
		IntegerCalculationExpression_AspectImpl integerCalculationExpression_Aspect = new IntegerCalculationExpression_AspectImpl();
		return integerCalculationExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression_Aspect createIntegerExpression_Aspect() {
		IntegerExpression_AspectImpl integerExpression_Aspect = new IntegerExpression_AspectImpl();
		return integerExpression_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable_Aspect createIntegerVariable_Aspect() {
		IntegerVariable_AspectImpl integerVariable_Aspect = new IntegerVariable_AspectImpl();
		return integerVariable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue createInputValue() {
		InputValueImpl inputValue = new InputValueImpl();
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken createForkedToken() {
		ForkedTokenImpl forkedToken = new ForkedTokenImpl();
		return forkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable_Aspect createBooleanVariable_Aspect() {
		BooleanVariable_AspectImpl booleanVariable_Aspect = new BooleanVariable_AspectImpl();
		return booleanVariable_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge_Aspect createActivityEdge_Aspect() {
		ActivityEdge_AspectImpl activityEdge_Aspect = new ActivityEdge_AspectImpl();
		return activityEdge_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode_Aspect createForkNode_Aspect() {
		ForkNode_AspectImpl forkNode_Aspect = new ForkNode_AspectImpl();
		return forkNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode_Aspect createFinalNode_Aspect() {
		FinalNode_AspectImpl finalNode_Aspect = new FinalNode_AspectImpl();
		return finalNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode_Aspect createDecisionNode_Aspect() {
		DecisionNode_AspectImpl decisionNode_Aspect = new DecisionNode_AspectImpl();
		return decisionNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlToken createControlToken() {
		ControlTokenImpl controlToken = new ControlTokenImpl();
		return controlToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode_Aspect createMergeNode_Aspect() {
		MergeNode_AspectImpl mergeNode_Aspect = new MergeNode_AspectImpl();
		return mergeNode_Aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdruntimePackage getAdruntimePackage() {
		return (AdruntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdruntimePackage getPackage() {
		return AdruntimePackage.eINSTANCE;
	}

} //AdruntimeFactoryImpl
