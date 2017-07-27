/**
 */
package adruntime;

import adwithoutruntime.AdwithoutruntimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see adruntime.AdruntimeFactory
 * @model kind="package"
 * @generated
 */
public interface AdruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/adruntime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdruntimePackage eINSTANCE = adruntime.impl.AdruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link adruntime.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.BooleanUnaryExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getBooleanUnaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__ASSIGNEE = AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERAND = AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT__OPERATOR = AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Unary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.JoinNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getJoinNode_Aspect()
	 * @generated
	 */
	int JOIN_NODE_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__NAME = AdwithoutruntimePackage.JOIN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.JOIN_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.JOIN_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.JOIN_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.JOIN_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.JOIN_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.JOIN_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.JOIN_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.BooleanExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getBooleanExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_ASPECT = 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT__ASSIGNEE = AdwithoutruntimePackage.BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The number of structural features of the '<em>Boolean Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.OpaqueAction_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getOpaqueAction_Aspect()
	 * @generated
	 */
	int OPAQUE_ACTION_ASPECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__NAME = AdwithoutruntimePackage.OPAQUE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__OUTGOING = AdwithoutruntimePackage.OPAQUE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__INCOMING = AdwithoutruntimePackage.OPAQUE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__ACTIVITY = AdwithoutruntimePackage.OPAQUE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__EXPRESSIONS = AdwithoutruntimePackage.OPAQUE_ACTION__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.OPAQUE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT__RUNNING = AdwithoutruntimePackage.OPAQUE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.OPAQUE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Opaque Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.OPAQUE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.TokenImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.InitialNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getInitialNode_Aspect()
	 * @generated
	 */
	int INITIAL_NODE_ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__NAME = AdwithoutruntimePackage.INITIAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.INITIAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.INITIAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.INITIAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.INITIAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.INITIAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initial Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.INITIAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Initial Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.INITIAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ControlNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getControlNode_Aspect()
	 * @generated
	 */
	int CONTROL_NODE_ASPECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__NAME = AdwithoutruntimePackage.CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ExecutableNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getExecutableNode_Aspect()
	 * @generated
	 */
	int EXECUTABLE_NODE_ASPECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__NAME = AdwithoutruntimePackage.EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Executable Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.Activity_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getActivity_Aspect()
	 * @generated
	 */
	int ACTIVITY_ASPECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NAME = AdwithoutruntimePackage.ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__NODES = AdwithoutruntimePackage.ACTIVITY__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__EDGES = AdwithoutruntimePackage.ACTIVITY__EDGES;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__LOCALS = AdwithoutruntimePackage.ACTIVITY__LOCALS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__INPUTS = AdwithoutruntimePackage.ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT__TRACE = AdwithoutruntimePackage.ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.Action_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getAction_Aspect()
	 * @generated
	 */
	int ACTION_ASPECT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__NAME = AdwithoutruntimePackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__OUTGOING = AdwithoutruntimePackage.ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__INCOMING = AdwithoutruntimePackage.ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__ACTIVITY = AdwithoutruntimePackage.ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT__RUNNING = AdwithoutruntimePackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.TraceImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 10;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EXECUTED_NODES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.IntegerComparisonExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getIntegerComparisonExpression_Aspect()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT = 11;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND2 = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERAND1 = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__ASSIGNEE = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT__OPERATOR = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Comparison Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ActivityNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getActivityNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_NODE_ASPECT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__NAME = AdwithoutruntimePackage.ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.BooleanBinaryExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getBooleanBinaryExpression_Aspect()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT = 13;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__ASSIGNEE = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND1 = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERAND2 = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT__OPERATOR = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Binary Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ControlFlow_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getControlFlow_Aspect()
	 * @generated
	 */
	int CONTROL_FLOW_ASPECT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__NAME = AdwithoutruntimePackage.CONTROL_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__SOURCE = AdwithoutruntimePackage.CONTROL_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__TARGET = AdwithoutruntimePackage.CONTROL_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__GUARD = AdwithoutruntimePackage.CONTROL_FLOW__GUARD;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT__OFFERS = AdwithoutruntimePackage.CONTROL_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.CONTROL_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Flow Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.CONTROL_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.InputImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 15;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.OfferImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 16;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFERED_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.Variable_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getVariable_Aspect()
	 * @generated
	 */
	int VARIABLE_ASPECT = 17;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__INITIAL_VALUE = AdwithoutruntimePackage.VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__NAME = AdwithoutruntimePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT__CURRENT_VALUE = AdwithoutruntimePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ActivityFinalNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getActivityFinalNode_Aspect()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE_ASPECT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__NAME = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.ACTIVITY_FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.IntegerCalculationExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getIntegerCalculationExpression_Aspect()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT = 19;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND2 = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERAND1 = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__ASSIGNEE = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT__OPERATOR = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Calculation Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.IntegerExpression_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getIntegerExpression_Aspect()
	 * @generated
	 */
	int INTEGER_EXPRESSION_ASPECT = 20;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND2 = AdwithoutruntimePackage.INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT__OPERAND1 = AdwithoutruntimePackage.INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The number of structural features of the '<em>Integer Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Expression Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.IntegerVariable_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getIntegerVariable_Aspect()
	 * @generated
	 */
	int INTEGER_VARIABLE_ASPECT = 21;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__INITIAL_VALUE = AdwithoutruntimePackage.INTEGER_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__NAME = AdwithoutruntimePackage.INTEGER_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT__CURRENT_VALUE = AdwithoutruntimePackage.INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.InputValueImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ForkedTokenImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 23;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__REMAINING_OFFERS_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.BooleanVariable_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getBooleanVariable_Aspect()
	 * @generated
	 */
	int BOOLEAN_VARIABLE_ASPECT = 24;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__INITIAL_VALUE = AdwithoutruntimePackage.BOOLEAN_VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__NAME = AdwithoutruntimePackage.BOOLEAN_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT__CURRENT_VALUE = AdwithoutruntimePackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.BOOLEAN_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Variable Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.BOOLEAN_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ActivityEdge_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getActivityEdge_Aspect()
	 * @generated
	 */
	int ACTIVITY_EDGE_ASPECT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__NAME = AdwithoutruntimePackage.ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__SOURCE = AdwithoutruntimePackage.ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__TARGET = AdwithoutruntimePackage.ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT__OFFERS = AdwithoutruntimePackage.ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Edge Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Edge Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ForkNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getForkNode_Aspect()
	 * @generated
	 */
	int FORK_NODE_ASPECT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__NAME = AdwithoutruntimePackage.FORK_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.FORK_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.FORK_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.FORK_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.FORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.FORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.FORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fork Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.FORK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.FinalNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getFinalNode_Aspect()
	 * @generated
	 */
	int FINAL_NODE_ASPECT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__NAME = AdwithoutruntimePackage.FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.FINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.FINAL_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Final Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.DecisionNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getDecisionNode_Aspect()
	 * @generated
	 */
	int DECISION_NODE_ASPECT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__NAME = AdwithoutruntimePackage.DECISION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.DECISION_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.DECISION_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.DECISION_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.DECISION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.DECISION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.DECISION_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.DECISION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.ControlTokenImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 29;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adruntime.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adruntime.impl.MergeNode_AspectImpl
	 * @see adruntime.impl.AdruntimePackageImpl#getMergeNode_Aspect()
	 * @generated
	 */
	int MERGE_NODE_ASPECT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__NAME = AdwithoutruntimePackage.MERGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__OUTGOING = AdwithoutruntimePackage.MERGE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__INCOMING = AdwithoutruntimePackage.MERGE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__ACTIVITY = AdwithoutruntimePackage.MERGE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__HELD_TOKENS = AdwithoutruntimePackage.MERGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT__RUNNING = AdwithoutruntimePackage.MERGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT_FEATURE_COUNT = AdwithoutruntimePackage.MERGE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Merge Node Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_ASPECT_OPERATION_COUNT = AdwithoutruntimePackage.MERGE_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link adruntime.BooleanUnaryExpression_Aspect <em>Boolean Unary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression Aspect</em>'.
	 * @see adruntime.BooleanUnaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanUnaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.JoinNode_Aspect <em>Join Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Aspect</em>'.
	 * @see adruntime.JoinNode_Aspect
	 * @generated
	 */
	EClass getJoinNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.BooleanExpression_Aspect <em>Boolean Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression Aspect</em>'.
	 * @see adruntime.BooleanExpression_Aspect
	 * @generated
	 */
	EClass getBooleanExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.OpaqueAction_Aspect <em>Opaque Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action Aspect</em>'.
	 * @see adruntime.OpaqueAction_Aspect
	 * @generated
	 */
	EClass getOpaqueAction_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see adruntime.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link adruntime.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see adruntime.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link adruntime.InitialNode_Aspect <em>Initial Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node Aspect</em>'.
	 * @see adruntime.InitialNode_Aspect
	 * @generated
	 */
	EClass getInitialNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ControlNode_Aspect <em>Control Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Aspect</em>'.
	 * @see adruntime.ControlNode_Aspect
	 * @generated
	 */
	EClass getControlNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ExecutableNode_Aspect <em>Executable Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node Aspect</em>'.
	 * @see adruntime.ExecutableNode_Aspect
	 * @generated
	 */
	EClass getExecutableNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.Activity_Aspect <em>Activity Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Aspect</em>'.
	 * @see adruntime.Activity_Aspect
	 * @generated
	 */
	EClass getActivity_Aspect();

	/**
	 * Returns the meta object for the containment reference '{@link adruntime.Activity_Aspect#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see adruntime.Activity_Aspect#getTrace()
	 * @see #getActivity_Aspect()
	 * @generated
	 */
	EReference getActivity_Aspect_Trace();

	/**
	 * Returns the meta object for class '{@link adruntime.Action_Aspect <em>Action Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Aspect</em>'.
	 * @see adruntime.Action_Aspect
	 * @generated
	 */
	EClass getAction_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see adruntime.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link adruntime.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see adruntime.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for class '{@link adruntime.IntegerComparisonExpression_Aspect <em>Integer Comparison Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression Aspect</em>'.
	 * @see adruntime.IntegerComparisonExpression_Aspect
	 * @generated
	 */
	EClass getIntegerComparisonExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ActivityNode_Aspect <em>Activity Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Aspect</em>'.
	 * @see adruntime.ActivityNode_Aspect
	 * @generated
	 */
	EClass getActivityNode_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link adruntime.ActivityNode_Aspect#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see adruntime.ActivityNode_Aspect#getHeldTokens()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EReference getActivityNode_Aspect_HeldTokens();

	/**
	 * Returns the meta object for the attribute '{@link adruntime.ActivityNode_Aspect#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see adruntime.ActivityNode_Aspect#isRunning()
	 * @see #getActivityNode_Aspect()
	 * @generated
	 */
	EAttribute getActivityNode_Aspect_Running();

	/**
	 * Returns the meta object for class '{@link adruntime.BooleanBinaryExpression_Aspect <em>Boolean Binary Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression Aspect</em>'.
	 * @see adruntime.BooleanBinaryExpression_Aspect
	 * @generated
	 */
	EClass getBooleanBinaryExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ControlFlow_Aspect <em>Control Flow Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Aspect</em>'.
	 * @see adruntime.ControlFlow_Aspect
	 * @generated
	 */
	EClass getControlFlow_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see adruntime.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link adruntime.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see adruntime.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link adruntime.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see adruntime.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the reference list '{@link adruntime.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offered Tokens</em>'.
	 * @see adruntime.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for class '{@link adruntime.Variable_Aspect <em>Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Aspect</em>'.
	 * @see adruntime.Variable_Aspect
	 * @generated
	 */
	EClass getVariable_Aspect();

	/**
	 * Returns the meta object for the reference '{@link adruntime.Variable_Aspect#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Value</em>'.
	 * @see adruntime.Variable_Aspect#getCurrentValue()
	 * @see #getVariable_Aspect()
	 * @generated
	 */
	EReference getVariable_Aspect_CurrentValue();

	/**
	 * Returns the meta object for class '{@link adruntime.ActivityFinalNode_Aspect <em>Activity Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node Aspect</em>'.
	 * @see adruntime.ActivityFinalNode_Aspect
	 * @generated
	 */
	EClass getActivityFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.IntegerCalculationExpression_Aspect <em>Integer Calculation Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression Aspect</em>'.
	 * @see adruntime.IntegerCalculationExpression_Aspect
	 * @generated
	 */
	EClass getIntegerCalculationExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.IntegerExpression_Aspect <em>Integer Expression Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression Aspect</em>'.
	 * @see adruntime.IntegerExpression_Aspect
	 * @generated
	 */
	EClass getIntegerExpression_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.IntegerVariable_Aspect <em>Integer Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable Aspect</em>'.
	 * @see adruntime.IntegerVariable_Aspect
	 * @generated
	 */
	EClass getIntegerVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see adruntime.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link adruntime.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see adruntime.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link adruntime.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see adruntime.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link adruntime.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see adruntime.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link adruntime.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see adruntime.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link adruntime.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see adruntime.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the meta object for class '{@link adruntime.BooleanVariable_Aspect <em>Boolean Variable Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable Aspect</em>'.
	 * @see adruntime.BooleanVariable_Aspect
	 * @generated
	 */
	EClass getBooleanVariable_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ActivityEdge_Aspect <em>Activity Edge Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge Aspect</em>'.
	 * @see adruntime.ActivityEdge_Aspect
	 * @generated
	 */
	EClass getActivityEdge_Aspect();

	/**
	 * Returns the meta object for the containment reference list '{@link adruntime.ActivityEdge_Aspect#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see adruntime.ActivityEdge_Aspect#getOffers()
	 * @see #getActivityEdge_Aspect()
	 * @generated
	 */
	EReference getActivityEdge_Aspect_Offers();

	/**
	 * Returns the meta object for class '{@link adruntime.ForkNode_Aspect <em>Fork Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Aspect</em>'.
	 * @see adruntime.ForkNode_Aspect
	 * @generated
	 */
	EClass getForkNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.FinalNode_Aspect <em>Final Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Aspect</em>'.
	 * @see adruntime.FinalNode_Aspect
	 * @generated
	 */
	EClass getFinalNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.DecisionNode_Aspect <em>Decision Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node Aspect</em>'.
	 * @see adruntime.DecisionNode_Aspect
	 * @generated
	 */
	EClass getDecisionNode_Aspect();

	/**
	 * Returns the meta object for class '{@link adruntime.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see adruntime.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link adruntime.MergeNode_Aspect <em>Merge Node Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node Aspect</em>'.
	 * @see adruntime.MergeNode_Aspect
	 * @generated
	 */
	EClass getMergeNode_Aspect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdruntimeFactory getAdruntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link adruntime.impl.BooleanUnaryExpression_AspectImpl <em>Boolean Unary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.BooleanUnaryExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getBooleanUnaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanUnaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.JoinNode_AspectImpl <em>Join Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.JoinNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getJoinNode_Aspect()
		 * @generated
		 */
		EClass JOIN_NODE_ASPECT = eINSTANCE.getJoinNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.BooleanExpression_AspectImpl <em>Boolean Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.BooleanExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getBooleanExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION_ASPECT = eINSTANCE.getBooleanExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.OpaqueAction_AspectImpl <em>Opaque Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.OpaqueAction_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getOpaqueAction_Aspect()
		 * @generated
		 */
		EClass OPAQUE_ACTION_ASPECT = eINSTANCE.getOpaqueAction_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.TokenImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();

		/**
		 * The meta object literal for the '{@link adruntime.impl.InitialNode_AspectImpl <em>Initial Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.InitialNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getInitialNode_Aspect()
		 * @generated
		 */
		EClass INITIAL_NODE_ASPECT = eINSTANCE.getInitialNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ControlNode_AspectImpl <em>Control Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ControlNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getControlNode_Aspect()
		 * @generated
		 */
		EClass CONTROL_NODE_ASPECT = eINSTANCE.getControlNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ExecutableNode_AspectImpl <em>Executable Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ExecutableNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getExecutableNode_Aspect()
		 * @generated
		 */
		EClass EXECUTABLE_NODE_ASPECT = eINSTANCE.getExecutableNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.Activity_AspectImpl <em>Activity Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.Activity_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getActivity_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_ASPECT = eINSTANCE.getActivity_Aspect();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ASPECT__TRACE = eINSTANCE.getActivity_Aspect_Trace();

		/**
		 * The meta object literal for the '{@link adruntime.impl.Action_AspectImpl <em>Action Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.Action_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getAction_Aspect()
		 * @generated
		 */
		EClass ACTION_ASPECT = eINSTANCE.getAction_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.TraceImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EXECUTED_NODES = eINSTANCE.getTrace_ExecutedNodes();

		/**
		 * The meta object literal for the '{@link adruntime.impl.IntegerComparisonExpression_AspectImpl <em>Integer Comparison Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.IntegerComparisonExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getIntegerComparisonExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION_ASPECT = eINSTANCE.getIntegerComparisonExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ActivityNode_AspectImpl <em>Activity Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ActivityNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getActivityNode_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_NODE_ASPECT = eINSTANCE.getActivityNode_Aspect();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_ASPECT__HELD_TOKENS = eINSTANCE.getActivityNode_Aspect_HeldTokens();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_ASPECT__RUNNING = eINSTANCE.getActivityNode_Aspect_Running();

		/**
		 * The meta object literal for the '{@link adruntime.impl.BooleanBinaryExpression_AspectImpl <em>Boolean Binary Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.BooleanBinaryExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getBooleanBinaryExpression_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION_ASPECT = eINSTANCE.getBooleanBinaryExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ControlFlow_AspectImpl <em>Control Flow Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ControlFlow_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getControlFlow_Aspect()
		 * @generated
		 */
		EClass CONTROL_FLOW_ASPECT = eINSTANCE.getControlFlow_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.InputImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_VALUES = eINSTANCE.getInput_InputValues();

		/**
		 * The meta object literal for the '{@link adruntime.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.OfferImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__OFFERED_TOKENS = eINSTANCE.getOffer_OfferedTokens();

		/**
		 * The meta object literal for the '{@link adruntime.impl.Variable_AspectImpl <em>Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.Variable_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getVariable_Aspect()
		 * @generated
		 */
		EClass VARIABLE_ASPECT = eINSTANCE.getVariable_Aspect();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASPECT__CURRENT_VALUE = eINSTANCE.getVariable_Aspect_CurrentValue();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ActivityFinalNode_AspectImpl <em>Activity Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ActivityFinalNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getActivityFinalNode_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE_ASPECT = eINSTANCE.getActivityFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.IntegerCalculationExpression_AspectImpl <em>Integer Calculation Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.IntegerCalculationExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getIntegerCalculationExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION_ASPECT = eINSTANCE.getIntegerCalculationExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.IntegerExpression_AspectImpl <em>Integer Expression Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.IntegerExpression_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getIntegerExpression_Aspect()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION_ASPECT = eINSTANCE.getIntegerExpression_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.IntegerVariable_AspectImpl <em>Integer Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.IntegerVariable_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getIntegerVariable_Aspect()
		 * @generated
		 */
		EClass INTEGER_VARIABLE_ASPECT = eINSTANCE.getIntegerVariable_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.InputValueImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VALUE = eINSTANCE.getInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VARIABLE = eINSTANCE.getInputValue_Variable();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ForkedTokenImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getForkedToken_BaseToken();

		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_RemainingOffersCount();

		/**
		 * The meta object literal for the '{@link adruntime.impl.BooleanVariable_AspectImpl <em>Boolean Variable Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.BooleanVariable_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getBooleanVariable_Aspect()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE_ASPECT = eINSTANCE.getBooleanVariable_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ActivityEdge_AspectImpl <em>Activity Edge Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ActivityEdge_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getActivityEdge_Aspect()
		 * @generated
		 */
		EClass ACTIVITY_EDGE_ASPECT = eINSTANCE.getActivityEdge_Aspect();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE_ASPECT__OFFERS = eINSTANCE.getActivityEdge_Aspect_Offers();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ForkNode_AspectImpl <em>Fork Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ForkNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getForkNode_Aspect()
		 * @generated
		 */
		EClass FORK_NODE_ASPECT = eINSTANCE.getForkNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.FinalNode_AspectImpl <em>Final Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.FinalNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getFinalNode_Aspect()
		 * @generated
		 */
		EClass FINAL_NODE_ASPECT = eINSTANCE.getFinalNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.DecisionNode_AspectImpl <em>Decision Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.DecisionNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getDecisionNode_Aspect()
		 * @generated
		 */
		EClass DECISION_NODE_ASPECT = eINSTANCE.getDecisionNode_Aspect();

		/**
		 * The meta object literal for the '{@link adruntime.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.ControlTokenImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link adruntime.impl.MergeNode_AspectImpl <em>Merge Node Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adruntime.impl.MergeNode_AspectImpl
		 * @see adruntime.impl.AdruntimePackageImpl#getMergeNode_Aspect()
		 * @generated
		 */
		EClass MERGE_NODE_ASPECT = eINSTANCE.getMergeNode_Aspect();

	}

} //AdruntimePackage
