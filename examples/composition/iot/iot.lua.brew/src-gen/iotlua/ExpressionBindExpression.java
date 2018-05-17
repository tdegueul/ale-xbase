/**
 */
package iotlua;

import activitydiagram.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bind Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iotlua.ExpressionBindExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iotlua.IotluaPackage#getExpressionBindExpression()
 * @model
 * @generated
 */
public interface ExpressionBindExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(org.xtext.lua.lua.Expression)
	 * @see iotlua.IotluaPackage#getExpressionBindExpression_Delegate()
	 * @model required="true"
	 * @generated
	 */
	org.xtext.lua.lua.Expression getDelegate();

	/**
	 * Sets the value of the '{@link iotlua.ExpressionBindExpression#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(org.xtext.lua.lua.Expression value);

} // ExpressionBindExpression
