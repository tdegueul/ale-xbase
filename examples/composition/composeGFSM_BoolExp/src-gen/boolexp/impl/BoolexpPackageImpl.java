/**
 */
package boolexp.impl;

import boolexp.And;
import boolexp.BinaryExp;
import boolexp.BoolexpFactory;
import boolexp.BoolexpPackage;
import boolexp.Exp;
import boolexp.Fals;
import boolexp.Lit;
import boolexp.Or;
import boolexp.Tru;

import gfsm.GfsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import printgfsmboolexp.PrintgfsmboolexpPackage;

import printgfsmboolexp.impl.PrintgfsmboolexpPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolexpPackageImpl extends EPackageImpl implements BoolexpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass litEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falsEClass = null;

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
	 * @see boolexp.BoolexpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoolexpPackageImpl() {
		super(eNS_URI, BoolexpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BoolexpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoolexpPackage init() {
		if (isInited) return (BoolexpPackage)EPackage.Registry.INSTANCE.getEPackage(BoolexpPackage.eNS_URI);

		// Obtain or create and register package
		BoolexpPackageImpl theBoolexpPackage = (BoolexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BoolexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BoolexpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GfsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PrintgfsmboolexpPackageImpl thePrintgfsmboolexpPackage = (PrintgfsmboolexpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrintgfsmboolexpPackage.eNS_URI) instanceof PrintgfsmboolexpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrintgfsmboolexpPackage.eNS_URI) : PrintgfsmboolexpPackage.eINSTANCE);

		// Create package meta-data objects
		theBoolexpPackage.createPackageContents();
		thePrintgfsmboolexpPackage.createPackageContents();

		// Initialize created meta-data
		theBoolexpPackage.initializePackageContents();
		thePrintgfsmboolexpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoolexpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoolexpPackage.eNS_URI, theBoolexpPackage);
		return theBoolexpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExp() {
		return expEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExp() {
		return binaryExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExp_Lhs() {
		return (EReference)binaryExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExp_Rhs() {
		return (EReference)binaryExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLit() {
		return litEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTru() {
		return truEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFals() {
		return falsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolexpFactory getBoolexpFactory() {
		return (BoolexpFactory)getEFactoryInstance();
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
		expEClass = createEClass(EXP);

		binaryExpEClass = createEClass(BINARY_EXP);
		createEReference(binaryExpEClass, BINARY_EXP__LHS);
		createEReference(binaryExpEClass, BINARY_EXP__RHS);

		litEClass = createEClass(LIT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		truEClass = createEClass(TRU);

		falsEClass = createEClass(FALS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryExpEClass.getESuperTypes().add(this.getExp());
		litEClass.getESuperTypes().add(this.getExp());
		andEClass.getESuperTypes().add(this.getBinaryExp());
		orEClass.getESuperTypes().add(this.getBinaryExp());
		truEClass.getESuperTypes().add(this.getLit());
		falsEClass.getESuperTypes().add(this.getLit());

		// Initialize classes, features, and operations; add parameters
		initEClass(expEClass, Exp.class, "Exp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryExpEClass, BinaryExp.class, "BinaryExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExp_Lhs(), this.getExp(), null, "lhs", null, 0, 1, BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExp_Rhs(), this.getExp(), null, "rhs", null, 0, 1, BinaryExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(litEClass, Lit.class, "Lit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truEClass, Tru.class, "Tru", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falsEClass, Fals.class, "Fals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BoolexpPackageImpl
