/**
 */
package activitydiagram_simpleexpressions;

import activitydiagram.Exp;

import simpleexpressions.SEExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Bind SE Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram_simpleexpressions.ExpBindSEExpression#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage#getExpBindSEExpression()
 * @model
 * @generated
 */
public interface ExpBindSEExpression extends Exp {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(SEExpression)
	 * @see activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage#getExpBindSEExpression_Delegate()
	 * @model
	 * @generated
	 */
	SEExpression getDelegate();

	/**
	 * Sets the value of the '{@link activitydiagram_simpleexpressions.ExpBindSEExpression#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(SEExpression value);

} // ExpBindSEExpression
