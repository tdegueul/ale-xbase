/**
 */
package fsm_guarded_lua.impl;

import basicFsmEnv.BasicFsmEnvPackage;

import fsm_guarded_lua.ActionBindStatement;
import fsm_guarded_lua.Fsm_guarded_luaFactory;
import fsm_guarded_lua.Fsm_guarded_luaPackage;
import fsm_guarded_lua.GuardBindExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.lua.lua.LuaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fsm_guarded_luaPackageImpl extends EPackageImpl implements Fsm_guarded_luaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBindStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardBindExpressionEClass = null;

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
	 * @see fsm_guarded_lua.Fsm_guarded_luaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fsm_guarded_luaPackageImpl() {
		super(eNS_URI, Fsm_guarded_luaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Fsm_guarded_luaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fsm_guarded_luaPackage init() {
		if (isInited) return (Fsm_guarded_luaPackage)EPackage.Registry.INSTANCE.getEPackage(Fsm_guarded_luaPackage.eNS_URI);

		// Obtain or create and register package
		Fsm_guarded_luaPackageImpl theFsm_guarded_luaPackage = (Fsm_guarded_luaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Fsm_guarded_luaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Fsm_guarded_luaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicFsmEnvPackage.eINSTANCE.eClass();
		LuaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFsm_guarded_luaPackage.createPackageContents();

		// Initialize created meta-data
		theFsm_guarded_luaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsm_guarded_luaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fsm_guarded_luaPackage.eNS_URI, theFsm_guarded_luaPackage);
		return theFsm_guarded_luaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBindStatement() {
		return actionBindStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBindStatement_Delegate() {
		return (EReference)actionBindStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardBindExpression() {
		return guardBindExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuardBindExpression_Delegate() {
		return (EReference)guardBindExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_guarded_luaFactory getFsm_guarded_luaFactory() {
		return (Fsm_guarded_luaFactory)getEFactoryInstance();
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
		actionBindStatementEClass = createEClass(ACTION_BIND_STATEMENT);
		createEReference(actionBindStatementEClass, ACTION_BIND_STATEMENT__DELEGATE);

		guardBindExpressionEClass = createEClass(GUARD_BIND_EXPRESSION);
		createEReference(guardBindExpressionEClass, GUARD_BIND_EXPRESSION__DELEGATE);
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
		LuaPackage theLuaPackage = (LuaPackage)EPackage.Registry.INSTANCE.getEPackage(LuaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionBindStatementEClass.getESuperTypes().add(theBasicFsmEnvPackage.getAction());
		guardBindExpressionEClass.getESuperTypes().add(theBasicFsmEnvPackage.getGuard());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionBindStatementEClass, ActionBindStatement.class, "ActionBindStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBindStatement_Delegate(), theLuaPackage.getStatement(), null, "delegate", null, 1, 1, ActionBindStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guardBindExpressionEClass, GuardBindExpression.class, "GuardBindExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuardBindExpression_Delegate(), theLuaPackage.getExpression(), null, "delegate", null, 1, 1, GuardBindExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// @BrewRequires
		create_BrewRequiresAnnotations();
	}

	/**
	 * Initializes the annotations for <b>@BrewRequires</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_BrewRequiresAnnotations() {
		String source = "@BrewRequires";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "platform:/resource/BasicFsmEnv/model/basicFsmEnv.ecore", "ecoreUrl",
			 "platform:/resource/org.xtext.lua/model/generated/Lua.ecore", "ecoreUrl"
		   });
	}

} //Fsm_guarded_luaPackageImpl
