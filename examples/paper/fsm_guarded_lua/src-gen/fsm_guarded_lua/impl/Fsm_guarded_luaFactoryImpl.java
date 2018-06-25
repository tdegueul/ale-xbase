/**
 */
package fsm_guarded_lua.impl;

import fsm_guarded_lua.*;

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
public class Fsm_guarded_luaFactoryImpl extends EFactoryImpl implements Fsm_guarded_luaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fsm_guarded_luaFactory init() {
		try {
			Fsm_guarded_luaFactory theFsm_guarded_luaFactory = (Fsm_guarded_luaFactory)EPackage.Registry.INSTANCE.getEFactory(Fsm_guarded_luaPackage.eNS_URI);
			if (theFsm_guarded_luaFactory != null) {
				return theFsm_guarded_luaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fsm_guarded_luaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_guarded_luaFactoryImpl() {
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
			case Fsm_guarded_luaPackage.ACTION_BIND_STATEMENT: return createActionBindStatement();
			case Fsm_guarded_luaPackage.GUARD_BIND_EXPRESSION: return createGuardBindExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBindStatement createActionBindStatement() {
		ActionBindStatementImpl actionBindStatement = new ActionBindStatementImpl();
		return actionBindStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardBindExpression createGuardBindExpression() {
		GuardBindExpressionImpl guardBindExpression = new GuardBindExpressionImpl();
		return guardBindExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_guarded_luaPackage getFsm_guarded_luaPackage() {
		return (Fsm_guarded_luaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fsm_guarded_luaPackage getPackage() {
		return Fsm_guarded_luaPackage.eINSTANCE;
	}

} //Fsm_guarded_luaFactoryImpl
