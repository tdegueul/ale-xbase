/**
 */
package model;

import activitydiagram.Activity;

import iot.IotActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TActivity Bind Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.IoTActivityBindActivity#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getIoTActivityBindActivity()
 * @model
 * @generated
 */
public interface IoTActivityBindActivity extends IotActivity {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Activity)
	 * @see model.ModelPackage#getIoTActivityBindActivity_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Activity getDelegate();

	/**
	 * Sets the value of the '{@link model.IoTActivityBindActivity#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Activity value);

} // IoTActivityBindActivity
