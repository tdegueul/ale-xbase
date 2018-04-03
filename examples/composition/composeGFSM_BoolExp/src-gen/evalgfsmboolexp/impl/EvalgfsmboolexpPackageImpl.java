/**
 */
package evalgfsmboolexp.impl;

import boolexp.BoolexpPackage;

import evalgfsmboolexp.EvalgfsmboolexpFactory;
import evalgfsmboolexp.EvalgfsmboolexpPackage;
import evalgfsmboolexp.GuardBind;

import gfsm.GfsmPackage;

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
public class EvalgfsmboolexpPackageImpl extends EPackageImpl implements EvalgfsmboolexpPackage {
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
	 * @see evalgfsmboolexp.EvalgfsmboolexpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvalgfsmboolexpPackageImpl() {
		super(eNS_URI, EvalgfsmboolexpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvalgfsmboolexpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvalgfsmboolexpPackage init() {
		if (isInited) return (EvalgfsmboolexpPackage)EPackage.Registry.INSTANCE.getEPackage(EvalgfsmboolexpPackage.eNS_URI);

		// Obtain or create and register package
		EvalgfsmboolexpPackageImpl theEvalgfsmboolexpPackage = (EvalgfsmboolexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvalgfsmboolexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvalgfsmboolexpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GfsmPackage.eINSTANCE.eClass();
		BoolexpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvalgfsmboolexpPackage.createPackageContents();

		// Initialize created meta-data
		theEvalgfsmboolexpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvalgfsmboolexpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvalgfsmboolexpPackage.eNS_URI, theEvalgfsmboolexpPackage);
		return theEvalgfsmboolexpPackage;
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
	public EvalgfsmboolexpFactory getEvalgfsmboolexpFactory() {
		return (EvalgfsmboolexpFactory)getEFactoryInstance();
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
		GfsmPackage theGfsmPackage = (GfsmPackage)EPackage.Registry.INSTANCE.getEPackage(GfsmPackage.eNS_URI);
		BoolexpPackage theBoolexpPackage = (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guardBindEClass.getESuperTypes().add(theGfsmPackage.getGuard());

		// Initialize classes, features, and operations; add parameters
		initEClass(guardBindEClass, GuardBind.class, "GuardBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardBind_Delegate(), theBoolexpPackage.getExp(), null, "delegate", null, 1, 1, GuardBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EvalgfsmboolexpPackageImpl
