/**
 */
package iot_lua;

import activitydiagram.Exp;

import org.xtext.lua.lua.Statement;

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
public interface ExpressionBindStatement extends Exp {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Statement)
	 * @see iot_lua.Iot_luaPackage#getExpressionBindStatement_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Statement getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.ExpressionBindStatement#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Statement value);

} // ExpressionBindStatement
