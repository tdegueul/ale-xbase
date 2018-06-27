/**
 */
package iot_lua;

import activitydiagram.BooleanValue;

import org.xtext.lua.lua.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value Bind Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.BooleanValueBindExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getBooleanValueBindExpression()
 * @model
 * @generated
 */
public interface BooleanValueBindExpression extends BooleanValue {
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
	 * @see iot_lua.Iot_luaPackage#getBooleanValueBindExpression_Delegate()
	 * @model
	 * @generated
	 */
	Expression getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.BooleanValueBindExpression#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Expression value);

} // BooleanValueBindExpression
