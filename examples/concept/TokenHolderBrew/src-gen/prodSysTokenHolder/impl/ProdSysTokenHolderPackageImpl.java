/**
 */
package prodSysTokenHolder.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import prodSys.ProdSysPackage;

import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.PBindMachine;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import prodSysTokenHolder.ProdSysTokenHolderPackage;
import prodSysTokenHolder.RBindRoot;
import prodSysTokenHolder.TBindPart;

import tokenHolder.TokenHolderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProdSysTokenHolderPackageImpl extends EPackageImpl implements ProdSysTokenHolderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hBindConveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rBindRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pBindMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBindPartEClass = null;

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
	 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProdSysTokenHolderPackageImpl() {
		super(eNS_URI, ProdSysTokenHolderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProdSysTokenHolderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProdSysTokenHolderPackage init() {
		if (isInited) return (ProdSysTokenHolderPackage)EPackage.Registry.INSTANCE.getEPackage(ProdSysTokenHolderPackage.eNS_URI);

		// Obtain or create and register package
		ProdSysTokenHolderPackageImpl theProdSysTokenHolderPackage = (ProdSysTokenHolderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProdSysTokenHolderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProdSysTokenHolderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TokenHolderPackage.eINSTANCE.eClass();
		ProdSysPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProdSysTokenHolderPackage.createPackageContents();

		// Initialize created meta-data
		theProdSysTokenHolderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProdSysTokenHolderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProdSysTokenHolderPackage.eNS_URI, theProdSysTokenHolderPackage);
		return theProdSysTokenHolderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHBindConveyor() {
		return hBindConveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHBindConveyor_Delegate() {
		return (EReference)hBindConveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBindRoot() {
		return rBindRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBindRoot_Delegate() {
		return (EReference)rBindRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPBindMachine() {
		return pBindMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPBindMachine_Delegate() {
		return (EReference)pBindMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBindPart() {
		return tBindPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBindPart_Delegate() {
		return (EReference)tBindPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdSysTokenHolderFactory getProdSysTokenHolderFactory() {
		return (ProdSysTokenHolderFactory)getEFactoryInstance();
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
		hBindConveyorEClass = createEClass(HBIND_CONVEYOR);
		createEReference(hBindConveyorEClass, HBIND_CONVEYOR__DELEGATE);

		rBindRootEClass = createEClass(RBIND_ROOT);
		createEReference(rBindRootEClass, RBIND_ROOT__DELEGATE);

		pBindMachineEClass = createEClass(PBIND_MACHINE);
		createEReference(pBindMachineEClass, PBIND_MACHINE__DELEGATE);

		tBindPartEClass = createEClass(TBIND_PART);
		createEReference(tBindPartEClass, TBIND_PART__DELEGATE);
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
		TokenHolderPackage theTokenHolderPackage = (TokenHolderPackage)EPackage.Registry.INSTANCE.getEPackage(TokenHolderPackage.eNS_URI);
		ProdSysPackage theProdSysPackage = (ProdSysPackage)EPackage.Registry.INSTANCE.getEPackage(ProdSysPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hBindConveyorEClass.getESuperTypes().add(theTokenHolderPackage.getH());
		rBindRootEClass.getESuperTypes().add(theTokenHolderPackage.getR());
		pBindMachineEClass.getESuperTypes().add(theTokenHolderPackage.getP());
		tBindPartEClass.getESuperTypes().add(theTokenHolderPackage.getT());

		// Initialize classes, features, and operations; add parameters
		initEClass(hBindConveyorEClass, HBindConveyor.class, "HBindConveyor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHBindConveyor_Delegate(), theProdSysPackage.getConveyor(), null, "delegate", null, 1, 1, HBindConveyor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rBindRootEClass, RBindRoot.class, "RBindRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBindRoot_Delegate(), theProdSysPackage.getRoot(), null, "delegate", null, 1, 1, RBindRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pBindMachineEClass, PBindMachine.class, "PBindMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPBindMachine_Delegate(), theProdSysPackage.getMachine(), null, "delegate", null, 1, 1, PBindMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBindPartEClass, TBindPart.class, "TBindPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBindPart_Delegate(), theProdSysPackage.getPart(), null, "delegate", null, 1, 1, TBindPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProdSysTokenHolderPackageImpl
