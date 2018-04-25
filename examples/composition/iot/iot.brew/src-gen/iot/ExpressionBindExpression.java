/**
 */
package iot;

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
 *   <li>{@link iot.ExpressionBindExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getExpressionBindExpression()
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
	 * @see #setDelegate(simpleexpressions.Expression)
	 * @see iot.IotPackage#getExpressionBindExpression_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.Expression getDelegate();

	/**
	 * Sets the value of the '{@link iot.ExpressionBindExpression#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.Expression value);

} // ExpressionBindExpression
