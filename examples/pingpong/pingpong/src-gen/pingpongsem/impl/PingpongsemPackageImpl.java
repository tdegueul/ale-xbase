/**
 */
package pingpongsem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ping.PingPackage;

import pingpongsem.PPingBindPing;
import pingpongsem.PingpongsemFactory;
import pingpongsem.PingpongsemPackage;
import pingpongsem.PongBindPPong;

import pong.PongPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PingpongsemPackageImpl extends EPackageImpl implements PingpongsemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pongBindPPongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPingBindPingEClass = null;

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
	 * @see pingpongsem.PingpongsemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PingpongsemPackageImpl() {
		super(eNS_URI, PingpongsemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PingpongsemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PingpongsemPackage init() {
		if (isInited) return (PingpongsemPackage)EPackage.Registry.INSTANCE.getEPackage(PingpongsemPackage.eNS_URI);

		// Obtain or create and register package
		PingpongsemPackageImpl thePingpongsemPackage = (PingpongsemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PingpongsemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PingpongsemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PingPackage.eINSTANCE.eClass();
		PongPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePingpongsemPackage.createPackageContents();

		// Initialize created meta-data
		thePingpongsemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePingpongsemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PingpongsemPackage.eNS_URI, thePingpongsemPackage);
		return thePingpongsemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPongBindPPong() {
		return pongBindPPongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPongBindPPong_Delegate() {
		return (EReference)pongBindPPongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPingBindPing() {
		return pPingBindPingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPPingBindPing_Delegate() {
		return (EReference)pPingBindPingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PingpongsemFactory getPingpongsemFactory() {
		return (PingpongsemFactory)getEFactoryInstance();
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
		pongBindPPongEClass = createEClass(PONG_BIND_PPONG);
		createEReference(pongBindPPongEClass, PONG_BIND_PPONG__DELEGATE);

		pPingBindPingEClass = createEClass(PPING_BIND_PING);
		createEReference(pPingBindPingEClass, PPING_BIND_PING__DELEGATE);
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
		PingPackage thePingPackage = (PingPackage)EPackage.Registry.INSTANCE.getEPackage(PingPackage.eNS_URI);
		PongPackage thePongPackage = (PongPackage)EPackage.Registry.INSTANCE.getEPackage(PongPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pongBindPPongEClass.getESuperTypes().add(thePingPackage.getPong());
		pPingBindPingEClass.getESuperTypes().add(thePongPackage.getPPing());

		// Initialize classes, features, and operations; add parameters
		initEClass(pongBindPPongEClass, PongBindPPong.class, "PongBindPPong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPongBindPPong_Delegate(), thePongPackage.getPPong(), null, "delegate", null, 1, 1, PongBindPPong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pPingBindPingEClass, PPingBindPing.class, "PPingBindPing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPPingBindPing_Delegate(), thePingPackage.getPing(), null, "delegate", null, 1, 1, PPingBindPing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PingpongsemPackageImpl
