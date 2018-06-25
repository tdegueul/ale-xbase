/**
 */
package iot_lua;

import activitydiagram.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bind Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.ExpressionBindStatement#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getExpressionBindStatement()
 * @model
 * @generated
 */
public interface ExpressionBindStatement extends Expression {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(org.xtext.lua.lua.Statement)
	 * @see iot_lua.Iot_luaPackage#getExpressionBindStatement_Delegate()
	 * @model
	 * @generated
	 */
	org.xtext.lua.lua.Statement getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.ExpressionBindStatement#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(org.xtext.lua.lua.Statement value);

} // ExpressionBindStatement
