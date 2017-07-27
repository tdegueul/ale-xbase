/**
 */
package adruntime.impl;

import adruntime.Action_Aspect;
import adruntime.ActivityEdge_Aspect;
import adruntime.ActivityFinalNode_Aspect;
import adruntime.ActivityNode_Aspect;
import adruntime.Activity_Aspect;
import adruntime.AdruntimeFactory;
import adruntime.AdruntimePackage;
import adruntime.BooleanBinaryExpression_Aspect;
import adruntime.BooleanExpression_Aspect;
import adruntime.BooleanUnaryExpression_Aspect;
import adruntime.BooleanVariable_Aspect;
import adruntime.ControlFlow_Aspect;
import adruntime.ControlNode_Aspect;
import adruntime.ControlToken;
import adruntime.DecisionNode_Aspect;
import adruntime.ExecutableNode_Aspect;
import adruntime.FinalNode_Aspect;
import adruntime.ForkNode_Aspect;
import adruntime.ForkedToken;
import adruntime.InitialNode_Aspect;
import adruntime.Input;
import adruntime.InputValue;
import adruntime.IntegerCalculationExpression_Aspect;
import adruntime.IntegerComparisonExpression_Aspect;
import adruntime.IntegerExpression_Aspect;
import adruntime.IntegerVariable_Aspect;
import adruntime.JoinNode_Aspect;
import adruntime.MergeNode_Aspect;
import adruntime.Offer;
import adruntime.OpaqueAction_Aspect;
import adruntime.Token;
import adruntime.Trace;
import adruntime.Variable_Aspect;

import adwithoutruntime.AdwithoutruntimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdruntimePackageImpl extends EPackageImpl implements AdruntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueAction_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activity_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass action_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerComparisonExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlow_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variable_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerCalculationExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpression_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariable_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariable_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdge_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNode_AspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNode_AspectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see adruntime.AdruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdruntimePackageImpl() {
		super(eNS_URI, AdruntimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdruntimePackage init() {
		if (isInited) return (AdruntimePackage)EPackage.Registry.INSTANCE.getEPackage(AdruntimePackage.eNS_URI);

		// Obtain or create and register package
		AdruntimePackageImpl theAdruntimePackage = (AdruntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdruntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdruntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AdwithoutruntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAdruntimePackage.createPackageContents();

		// Initialize created meta-data
		theAdruntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdruntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdruntimePackage.eNS_URI, theAdruntimePackage);
		return theAdruntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression_Aspect() {
		return booleanUnaryExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode_Aspect() {
		return joinNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression_Aspect() {
		return booleanExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction_Aspect() {
		return opaqueAction_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Holder() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode_Aspect() {
		return initialNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode_Aspect() {
		return controlNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode_Aspect() {
		return executableNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity_Aspect() {
		return activity_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Aspect_Trace() {
		return (EReference)activity_AspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction_Aspect() {
		return action_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ExecutedNodes() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerComparisonExpression_Aspect() {
		return integerComparisonExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode_Aspect() {
		return activityNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Aspect_HeldTokens() {
		return (EReference)activityNode_AspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Aspect_Running() {
		return (EAttribute)activityNode_AspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression_Aspect() {
		return booleanBinaryExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow_Aspect() {
		return controlFlow_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputValues() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffer_OfferedTokens() {
		return (EReference)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable_Aspect() {
		return variable_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Aspect_CurrentValue() {
		return (EReference)variable_AspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode_Aspect() {
		return activityFinalNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerCalculationExpression_Aspect() {
		return integerCalculationExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression_Aspect() {
		return integerExpression_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable_Aspect() {
		return integerVariable_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkedToken() {
		return forkedTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkedToken_BaseToken() {
		return (EReference)forkedTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkedToken_RemainingOffersCount() {
		return (EAttribute)forkedTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable_Aspect() {
		return booleanVariable_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge_Aspect() {
		return activityEdge_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Aspect_Offers() {
		return (EReference)activityEdge_AspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode_Aspect() {
		return forkNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode_Aspect() {
		return finalNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode_Aspect() {
		return decisionNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlToken() {
		return controlTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode_Aspect() {
		return mergeNode_AspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdruntimeFactory getAdruntimeFactory() {
		return (AdruntimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		booleanUnaryExpression_AspectEClass = createEClass(BOOLEAN_UNARY_EXPRESSION_ASPECT);

		joinNode_AspectEClass = createEClass(JOIN_NODE_ASPECT);

		booleanExpression_AspectEClass = createEClass(BOOLEAN_EXPRESSION_ASPECT);

		opaqueAction_AspectEClass = createEClass(OPAQUE_ACTION_ASPECT);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__HOLDER);

		initialNode_AspectEClass = createEClass(INITIAL_NODE_ASPECT);

		controlNode_AspectEClass = createEClass(CONTROL_NODE_ASPECT);

		executableNode_AspectEClass = createEClass(EXECUTABLE_NODE_ASPECT);

		activity_AspectEClass = createEClass(ACTIVITY_ASPECT);
		createEReference(activity_AspectEClass, ACTIVITY_ASPECT__TRACE);

		action_AspectEClass = createEClass(ACTION_ASPECT);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__EXECUTED_NODES);

		integerComparisonExpression_AspectEClass = createEClass(INTEGER_COMPARISON_EXPRESSION_ASPECT);

		activityNode_AspectEClass = createEClass(ACTIVITY_NODE_ASPECT);
		createEReference(activityNode_AspectEClass, ACTIVITY_NODE_ASPECT__HELD_TOKENS);
		createEAttribute(activityNode_AspectEClass, ACTIVITY_NODE_ASPECT__RUNNING);

		booleanBinaryExpression_AspectEClass = createEClass(BOOLEAN_BINARY_EXPRESSION_ASPECT);

		controlFlow_AspectEClass = createEClass(CONTROL_FLOW_ASPECT);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_VALUES);

		offerEClass = createEClass(OFFER);
		createEReference(offerEClass, OFFER__OFFERED_TOKENS);

		variable_AspectEClass = createEClass(VARIABLE_ASPECT);
		createEReference(variable_AspectEClass, VARIABLE_ASPECT__CURRENT_VALUE);

		activityFinalNode_AspectEClass = createEClass(ACTIVITY_FINAL_NODE_ASPECT);

		integerCalculationExpression_AspectEClass = createEClass(INTEGER_CALCULATION_EXPRESSION_ASPECT);

		integerExpression_AspectEClass = createEClass(INTEGER_EXPRESSION_ASPECT);

		integerVariable_AspectEClass = createEClass(INTEGER_VARIABLE_ASPECT);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VARIABLE);

		forkedTokenEClass = createEClass(FORKED_TOKEN);
		createEReference(forkedTokenEClass, FORKED_TOKEN__BASE_TOKEN);
		createEAttribute(forkedTokenEClass, FORKED_TOKEN__REMAINING_OFFERS_COUNT);

		booleanVariable_AspectEClass = createEClass(BOOLEAN_VARIABLE_ASPECT);

		activityEdge_AspectEClass = createEClass(ACTIVITY_EDGE_ASPECT);
		createEReference(activityEdge_AspectEClass, ACTIVITY_EDGE_ASPECT__OFFERS);

		forkNode_AspectEClass = createEClass(FORK_NODE_ASPECT);

		finalNode_AspectEClass = createEClass(FINAL_NODE_ASPECT);

		decisionNode_AspectEClass = createEClass(DECISION_NODE_ASPECT);

		controlTokenEClass = createEClass(CONTROL_TOKEN);

		mergeNode_AspectEClass = createEClass(MERGE_NODE_ASPECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdwithoutruntimePackage theAdwithoutruntimePackage = (AdwithoutruntimePackage)EPackage.Registry.INSTANCE.getEPackage(AdwithoutruntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		booleanUnaryExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getBooleanUnaryExpression());
		booleanUnaryExpression_AspectEClass.getESuperTypes().add(this.getBooleanExpression_Aspect());
		joinNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getJoinNode());
		joinNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());
		booleanExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getBooleanExpression());
		opaqueAction_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getOpaqueAction());
		opaqueAction_AspectEClass.getESuperTypes().add(this.getAction_Aspect());
		initialNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getInitialNode());
		initialNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());
		controlNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getControlNode());
		controlNode_AspectEClass.getESuperTypes().add(this.getActivityNode_Aspect());
		executableNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getExecutableNode());
		executableNode_AspectEClass.getESuperTypes().add(this.getActivityNode_Aspect());
		activity_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getActivity());
		action_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getAction());
		action_AspectEClass.getESuperTypes().add(this.getExecutableNode_Aspect());
		integerComparisonExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getIntegerComparisonExpression());
		integerComparisonExpression_AspectEClass.getESuperTypes().add(this.getIntegerExpression_Aspect());
		activityNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getActivityNode());
		booleanBinaryExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getBooleanBinaryExpression());
		booleanBinaryExpression_AspectEClass.getESuperTypes().add(this.getBooleanExpression_Aspect());
		controlFlow_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getControlFlow());
		controlFlow_AspectEClass.getESuperTypes().add(this.getActivityEdge_Aspect());
		variable_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getVariable());
		activityFinalNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getActivityFinalNode());
		activityFinalNode_AspectEClass.getESuperTypes().add(this.getFinalNode_Aspect());
		integerCalculationExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getIntegerCalculationExpression());
		integerCalculationExpression_AspectEClass.getESuperTypes().add(this.getIntegerExpression_Aspect());
		integerExpression_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getIntegerExpression());
		integerVariable_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getIntegerVariable());
		integerVariable_AspectEClass.getESuperTypes().add(this.getVariable_Aspect());
		forkedTokenEClass.getESuperTypes().add(this.getToken());
		booleanVariable_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getBooleanVariable());
		booleanVariable_AspectEClass.getESuperTypes().add(this.getVariable_Aspect());
		activityEdge_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getActivityEdge());
		forkNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getForkNode());
		forkNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());
		finalNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getFinalNode());
		finalNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());
		decisionNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getDecisionNode());
		decisionNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());
		controlTokenEClass.getESuperTypes().add(this.getToken());
		mergeNode_AspectEClass.getESuperTypes().add(theAdwithoutruntimePackage.getMergeNode());
		mergeNode_AspectEClass.getESuperTypes().add(this.getControlNode_Aspect());

		// Initialize classes, features, and operations; add parameters
		initEClass(booleanUnaryExpression_AspectEClass, BooleanUnaryExpression_Aspect.class, "BooleanUnaryExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNode_AspectEClass, JoinNode_Aspect.class, "JoinNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanExpression_AspectEClass, BooleanExpression_Aspect.class, "BooleanExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueAction_AspectEClass, OpaqueAction_Aspect.class, "OpaqueAction_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Holder(), theAdwithoutruntimePackage.getActivityNode(), null, "holder", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNode_AspectEClass, InitialNode_Aspect.class, "InitialNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlNode_AspectEClass, ControlNode_Aspect.class, "ControlNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNode_AspectEClass, ExecutableNode_Aspect.class, "ExecutableNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activity_AspectEClass, Activity_Aspect.class, "Activity_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Aspect_Trace(), this.getTrace(), null, "trace", null, 0, 1, Activity_Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(action_AspectEClass, Action_Aspect.class, "Action_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ExecutedNodes(), theAdwithoutruntimePackage.getActivityNode(), null, "executedNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerComparisonExpression_AspectEClass, IntegerComparisonExpression_Aspect.class, "IntegerComparisonExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityNode_AspectEClass, ActivityNode_Aspect.class, "ActivityNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Aspect_HeldTokens(), this.getToken(), null, "heldTokens", null, 0, -1, ActivityNode_Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_Aspect_Running(), ecorePackage.getEBoolean(), "running", null, 0, 1, ActivityNode_Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanBinaryExpression_AspectEClass, BooleanBinaryExpression_Aspect.class, "BooleanBinaryExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlow_AspectEClass, ControlFlow_Aspect.class, "ControlFlow_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputValues(), this.getInputValue(), null, "inputValues", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_OfferedTokens(), this.getToken(), null, "offeredTokens", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variable_AspectEClass, Variable_Aspect.class, "Variable_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Aspect_CurrentValue(), theAdwithoutruntimePackage.getValue(), null, "currentValue", null, 0, 1, Variable_Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityFinalNode_AspectEClass, ActivityFinalNode_Aspect.class, "ActivityFinalNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerCalculationExpression_AspectEClass, IntegerCalculationExpression_Aspect.class, "IntegerCalculationExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerExpression_AspectEClass, IntegerExpression_Aspect.class, "IntegerExpression_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariable_AspectEClass, IntegerVariable_Aspect.class, "IntegerVariable_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Value(), theAdwithoutruntimePackage.getValue(), null, "value", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_Variable(), theAdwithoutruntimePackage.getVariable(), null, "variable", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkedTokenEClass, ForkedToken.class, "ForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_BaseToken(), this.getToken(), null, "baseToken", null, 0, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkedToken_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 0, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVariable_AspectEClass, BooleanVariable_Aspect.class, "BooleanVariable_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEdge_AspectEClass, ActivityEdge_Aspect.class, "ActivityEdge_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Aspect_Offers(), this.getOffer(), null, "offers", null, 0, -1, ActivityEdge_Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkNode_AspectEClass, ForkNode_Aspect.class, "ForkNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNode_AspectEClass, FinalNode_Aspect.class, "FinalNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNode_AspectEClass, DecisionNode_Aspect.class, "DecisionNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlTokenEClass, ControlToken.class, "ControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNode_AspectEClass, MergeNode_Aspect.class, "MergeNode_Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AdruntimePackageImpl
