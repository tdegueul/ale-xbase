/**
 */
package fullfsmeval.impl;

import basicFsmEnv.BasicFsmEnvPackage;

import boolExpEnv.BoolExpEnvPackage;

import fullfsmeval.ActionBind;
import fullfsmeval.FullfsmevalFactory;
import fullfsmeval.FullfsmevalPackage;
import fullfsmeval.GuardBind;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleALEnv.SimpleALEnvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullfsmevalPackageImpl extends EPackageImpl implements FullfsmevalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardBindEClass = null;

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
	 * @see fullfsmeval.FullfsmevalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FullfsmevalPackageImpl() {
		super(eNS_URI, FullfsmevalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FullfsmevalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FullfsmevalPackage init() {
		if (isInited) return (FullfsmevalPackage)EPackage.Registry.INSTANCE.getEPackage(FullfsmevalPackage.eNS_URI);

		// Obtain or create and register package
		FullfsmevalPackageImpl theFullfsmevalPackage = (FullfsmevalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FullfsmevalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FullfsmevalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicFsmEnvPackage.eINSTANCE.eClass();
		BoolExpEnvPackage.eINSTANCE.eClass();
		SimpleALEnvPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFullfsmevalPackage.createPackageContents();

		// Initialize created meta-data
		theFullfsmevalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFullfsmevalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FullfsmevalPackage.eNS_URI, theFullfsmevalPackage);
		return theFullfsmevalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBind() {
		return actionBindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBind_Delegate() {
		return (EReference)actionBindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardBind() {
		return guardBindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardBind_Delegate() {
		return (EReference)guardBindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmevalFactory getFullfsmevalFactory() {
		return (FullfsmevalFactory)getEFactoryInstance();
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
		actionBindEClass = createEClass(ACTION_BIND);
		createEReference(actionBindEClass, ACTION_BIND__DELEGATE);

		guardBindEClass = createEClass(GUARD_BIND);
		createEReference(guardBindEClass, GUARD_BIND__DELEGATE);
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
		BasicFsmEnvPackage theBasicFsmEnvPackage = (BasicFsmEnvPackage)EPackage.Registry.INSTANCE.getEPackage(BasicFsmEnvPackage.eNS_URI);
		SimpleALEnvPackage theSimpleALEnvPackage = (SimpleALEnvPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleALEnvPackage.eNS_URI);
		BoolExpEnvPackage theBoolExpEnvPackage = (BoolExpEnvPackage)EPackage.Registry.INSTANCE.getEPackage(BoolExpEnvPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionBindEClass.getESuperTypes().add(theBasicFsmEnvPackage.getAction());
		guardBindEClass.getESuperTypes().add(theBasicFsmEnvPackage.getGuard());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionBindEClass, ActionBind.class, "ActionBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBind_Delegate(), theSimpleALEnvPackage.getBlock(), null, "delegate", null, 1, 1, ActionBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardBindEClass, GuardBind.class, "GuardBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardBind_Delegate(), theBoolExpEnvPackage.getExp(), null, "delegate", null, 1, 1, GuardBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FullfsmevalPackageImpl
