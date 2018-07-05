/**
 */
package simpleexpressions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEVariable#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link simpleexpressions.SEVariable#getName <em>Name</em>}</li>
 *   <li>{@link simpleexpressions.SEVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEVariable()
 * @model abstract="true"
 * @generated
 */
public interface SEVariable extends SEExpression {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(SEValue)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEVariable_CurrentValue()
	 * @model
	 * @generated
	 */
	SEValue getCurrentValue();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEVariable#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(SEValue value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(SEValue)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEVariable_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	SEValue getInitialValue();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEVariable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(SEValue value);

} // SEVariable
