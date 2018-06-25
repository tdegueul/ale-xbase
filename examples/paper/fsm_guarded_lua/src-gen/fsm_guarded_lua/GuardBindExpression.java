/**
 */
package fsm_guarded_lua;

import basicFsmEnv.Guard;

import org.xtext.lua.lua.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Bind Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsm_guarded_lua.GuardBindExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see fsm_guarded_lua.Fsm_guarded_luaPackage#getGuardBindExpression()
 * @model
 * @generated
 */
public interface GuardBindExpression extends Guard {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Expression)
	 * @see fsm_guarded_lua.Fsm_guarded_luaPackage#getGuardBindExpression_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Expression getDelegate();

	/**
	 * Sets the value of the '{@link fsm_guarded_lua.GuardBindExpression#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Expression value);

} // GuardBindExpression
