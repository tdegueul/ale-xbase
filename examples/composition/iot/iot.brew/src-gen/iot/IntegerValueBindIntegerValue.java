/**
 */
package iot;

import activitydiagram.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value Bind Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.IntegerValueBindIntegerValue#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot.IotPackage#getIntegerValueBindIntegerValue()
 * @model
 * @generated
 */
public interface IntegerValueBindIntegerValue extends IntegerValue {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(simpleexpressions.IntegerValue)
	 * @see iot.IotPackage#getIntegerValueBindIntegerValue_Delegate()
	 * @model required="true"
	 * @generated
	 */
	simpleexpressions.IntegerValue getDelegate();

	/**
	 * Sets the value of the '{@link iot.IntegerValueBindIntegerValue#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(simpleexpressions.IntegerValue value);

} // IntegerValueBindIntegerValue
