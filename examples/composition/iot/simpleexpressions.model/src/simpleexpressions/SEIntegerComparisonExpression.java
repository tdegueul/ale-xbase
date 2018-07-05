/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Integer Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEIntegerComparisonExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link simpleexpressions.SEIntegerComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerComparisonExpression()
 * @model
 * @generated
 */
public interface SEIntegerComparisonExpression extends SEIntegerExpression {
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
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerComparisonExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerComparisonExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(SEBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleexpressions.SEIntegerComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEIntegerComparisonOperator
	 * @see #setOperator(SEIntegerComparisonOperator)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerComparisonExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	SEIntegerComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEIntegerComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SEIntegerComparisonOperator value);

} // SEIntegerComparisonExpression
