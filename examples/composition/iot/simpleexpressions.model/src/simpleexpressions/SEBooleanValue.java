/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.SEBooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanValue()
 * @model
 * @generated
 */
public interface SEBooleanValue extends SEValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see simpleexpressions.SimpleexpressionsPackage#getSEBooleanValue_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link simpleexpressions.SEBooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // SEBooleanValue
