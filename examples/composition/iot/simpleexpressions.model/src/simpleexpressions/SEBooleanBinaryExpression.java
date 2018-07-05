/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEBooleanBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link simpleexpressions.SEBooleanBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link simpleexpressions.SEBooleanBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanBinaryExpression()
 * @model
 * @generated
 */
public interface SEBooleanBinaryExpression extends SEBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(SEBooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanBinaryExpression_Operand1()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanVariable getOperand1();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanBinaryExpression#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(SEBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(SEBooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanBinaryExpression_Operand2()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanVariable getOperand2();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanBinaryExpression#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(SEBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleexpressions.SEBooleanBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEBooleanBinaryOperator
	 * @see #setOperator(SEBooleanBinaryOperator)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEBooleanBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SEBooleanBinaryOperator value);

} // SEBooleanBinaryExpression
