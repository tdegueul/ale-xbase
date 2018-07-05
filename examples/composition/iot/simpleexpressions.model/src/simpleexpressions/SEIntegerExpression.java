/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEIntegerExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link simpleexpressions.SEIntegerExpression#getOperand1 <em>Operand1</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerExpression()
 * @model abstract="true"
 * @generated
 */
public interface SEIntegerExpression extends SEExpression {
	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(SEIntegerVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerExpression_Operand2()
	 * @model
	 * @generated
	 */
	SEIntegerVariable getOperand2();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerExpression#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(SEIntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(SEIntegerVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEIntegerExpression_Operand1()
	 * @model
	 * @generated
	 */
	SEIntegerVariable getOperand1();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEIntegerExpression#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(SEIntegerVariable value);

} // SEIntegerExpression
