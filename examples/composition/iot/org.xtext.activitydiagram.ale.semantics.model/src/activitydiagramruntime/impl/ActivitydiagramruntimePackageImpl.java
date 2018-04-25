/**
 */
package activitydiagramruntime.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagramruntime.ActivitydiagramruntimeFactory;
import activitydiagramruntime.ActivitydiagramruntimePackage;
import activitydiagramruntime.Context;
import activitydiagramruntime.ControlToken;
import activitydiagramruntime.ForkedToken;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Token;

import activitydiagramruntime.Trace;
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
public class ActivitydiagramruntimePackageImpl extends EPackageImpl implements ActivitydiagramruntimePackage {
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
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

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
	private EClass controlTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkedTokenEClass = null;

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
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitydiagramruntimePackageImpl() {
		super(eNS_URI, ActivitydiagramruntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitydiagramruntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitydiagramruntimePackage init() {
		if (isInited) return (ActivitydiagramruntimePackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramruntimePackage.eNS_URI);

		// Obtain or create and register package
		ActivitydiagramruntimePackageImpl theActivitydiagramruntimePackage = (ActivitydiagramruntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitydiagramruntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitydiagramruntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theActivitydiagramruntimePackage.createPackageContents();

		// Initialize created meta-data
		theActivitydiagramruntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitydiagramruntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitydiagramruntimePackage.eNS_URI, theActivitydiagramruntimePackage);
		return theActivitydiagramruntimePackage;
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
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Output() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Activity() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Parent() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_InputValues() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Node() {
		return (EReference)contextEClass.getEStructuralFeatures().get(4);
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
	public EClass getControlToken() {
		return controlTokenEClass;
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
	public ActivitydiagramruntimeFactory getActivitydiagramruntimeFactory() {
		return (ActivitydiagramruntimeFactory)getEFactoryInstance();
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
		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__HOLDER);

		offerEClass = createEClass(OFFER);
		createEReference(offerEClass, OFFER__OFFERED_TOKENS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__OUTPUT);
		createEReference(contextEClass, CONTEXT__ACTIVITY);
		createEReference(contextEClass, CONTEXT__PARENT);
		createEReference(contextEClass, CONTEXT__INPUT_VALUES);
		createEReference(contextEClass, CONTEXT__NODE);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__EXECUTED_NODES);

		controlTokenEClass = createEClass(CONTROL_TOKEN);

		forkedTokenEClass = createEClass(FORKED_TOKEN);
		createEReference(forkedTokenEClass, FORKED_TOKEN__BASE_TOKEN);
		createEAttribute(forkedTokenEClass, FORKED_TOKEN__REMAINING_OFFERS_COUNT);
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
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlTokenEClass.getESuperTypes().add(this.getToken());
		forkedTokenEClass.getESuperTypes().add(this.getToken());

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenEClass, Token.class, "Token", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Holder(), theActivitydiagramPackage.getActivityNode(), null, "holder", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffer_OfferedTokens(), this.getToken(), null, "offeredTokens", null, 0, -1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Output(), this.getTrace(), null, "output", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Activity(), theActivitydiagramPackage.getActivity(), null, "activity", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Parent(), this.getContext(), null, "parent", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_InputValues(), theActivitydiagramPackage.getInputValue(), null, "inputValues", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Node(), theActivitydiagramPackage.getJoinNode(), null, "node", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_ExecutedNodes(), theActivitydiagramPackage.getActivityNode(), null, "executedNodes", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlTokenEClass, ControlToken.class, "ControlToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkedTokenEClass, ForkedToken.class, "ForkedToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkedToken_BaseToken(), this.getToken(), null, "baseToken", null, 0, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkedToken_RemainingOffersCount(), ecorePackage.getEInt(), "remainingOffersCount", null, 0, 1, ForkedToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivitydiagramruntimePackageImpl
