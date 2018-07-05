/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Integer Calculation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEIntegerCalculationExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link simpleexpressions.SEIntegerCalculationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerCalculationExpression()
 * @model
 * @generated
 */
public interface SEIntegerCalculationExpression extends SEIntegerExpression {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(SEIntegerVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerCalculationExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	SEIntegerVariable getAssignee();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerCalculationExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(SEIntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleexpressions.SEIntegerCalculationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEIntegerCalculationOperator
	 * @see #setOperator(SEIntegerCalculationOperator)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerCalculationExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	SEIntegerCalculationOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerCalculationExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEIntegerCalculationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SEIntegerCalculationOperator value);

} // SEIntegerCalculationExpression
