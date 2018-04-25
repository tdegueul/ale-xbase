/**
 */
package iot;

import activitydiagram.BooleanValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value Bind Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.BooleanValueBindBooleanValue#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getBooleanValueBindBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValueBindBooleanValue extends BooleanValue {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(simpleexpressions.BooleanValue)
	 * @see iot.IotPackage#getBooleanValueBindBooleanValue_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.BooleanValue getDelegate();

	/**
	 * Sets the value of the '{@link iot.BooleanValueBindBooleanValue#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.BooleanValue value);

} // BooleanValueBindBooleanValue
