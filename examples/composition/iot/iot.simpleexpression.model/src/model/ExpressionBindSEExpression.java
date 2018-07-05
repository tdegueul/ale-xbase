/**
 */
package model;

import activitydiagram.Exp;

import simpleexpressions.SEExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Bind SE Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ExpressionBindSEExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getExpressionBindSEExpression()
 * @model
 * @generated
 */
public interface ExpressionBindSEExpression extends Exp {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(SEExpression)
	 * @see model.ModelPackage#getExpressionBindSEExpression_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	SEExpression getDelegate();

	/**
	 * Sets the value of the '{@link model.ExpressionBindSEExpression#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(SEExpression value);

} // ExpressionBindSEExpression
