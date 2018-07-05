/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEBooleanExpression#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanExpression()
 * @model abstract="true"
 * @generated
 */
public interface SEBooleanExpression extends SEExpression {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(SEBooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(SEBooleanVariable value);

} // SEBooleanExpression
