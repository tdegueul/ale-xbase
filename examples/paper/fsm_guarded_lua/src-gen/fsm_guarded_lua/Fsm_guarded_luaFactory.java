/**
 */
package fsm_guarded_lua;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsm_guarded_lua.Fsm_guarded_luaPackage
 * @generated
 */
public interface Fsm_guarded_luaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fsm_guarded_luaFactory eINSTANCE = fsm_guarded_lua.impl.Fsm_guarded_luaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Bind Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Bind Statement</em>'.
	 * @generated
	 */
	ActionBindStatement createActionBindStatement();

	/**
	 * Returns a new object of class '<em>Guard Bind Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Bind Expression</em>'.
	 * @generated
	 */
	GuardBindExpression createGuardBindExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fsm_guarded_luaPackage getFsm_guarded_luaPackage();

} //Fsm_guarded_luaFactory
