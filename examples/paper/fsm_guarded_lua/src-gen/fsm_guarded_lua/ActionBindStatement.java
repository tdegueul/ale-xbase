/**
 */
package fsm_guarded_lua;

import basicFsmEnv.Action;

import org.xtext.lua.lua.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Bind Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm_guarded_lua.ActionBindStatement#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fsm_guarded_lua.Fsm_guarded_luaPackage#getActionBindStatement()
 * @model
 * @generated
 */
public interface ActionBindStatement extends Action {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Statement)
	 * @see fsm_guarded_lua.Fsm_guarded_luaPackage#getActionBindStatement_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Statement getDelegate();

	/**
	 * Sets the value of the '{@link fsm_guarded_lua.ActionBindStatement#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Statement value);

} // ActionBindStatement
