/**
 */
package iot;

import activitydiagram.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Bind Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.ValueBindValue#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getValueBindValue()
 * @model
 * @generated
 */
public interface ValueBindValue extends Value {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(simpleexpressions.Value)
	 * @see iot.IotPackage#getValueBindValue_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.Value getDelegate();

	/**
	 * Sets the value of the '{@link iot.ValueBindValue#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.Value value);

} // ValueBindValue
