/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEBooleanUnaryExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link simpleexpressions.SEBooleanUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanUnaryExpression()
 * @model
 * @generated
 */
public interface SEBooleanUnaryExpression extends SEBooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(SEBooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanUnaryExpression_Operand()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanVariable getOperand();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanUnaryExpression#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(SEBooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleexpressions.SEBooleanUnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEBooleanUnaryOperator
	 * @see #setOperator(SEBooleanUnaryOperator)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	SEBooleanUnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanUnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.SEBooleanUnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SEBooleanUnaryOperator value);

} // SEBooleanUnaryExpression
