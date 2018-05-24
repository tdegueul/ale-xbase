/**
 */
package iotlua;

import activitydiagram.Expression;

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
 *   <li>{@link iotlua.ExpressionBindStatement#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iotlua.IotluaPackage#getExpressionBindStatement()
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
	 * @see #setDelegate(Statement)
	 * @see iotlua.IotluaPackage#getExpressionBindStatement_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Statement getDelegate();

	/**
	 * Sets the value of the '{@link iotlua.ExpressionBindStatement#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Statement value);

} // ExpressionBindStatement
