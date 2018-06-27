/**
 */
package iot_lua;

import activitydiagram.Activity;

import iot.IotActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iot Activity Bind Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.IotActivityBindActivity#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getIotActivityBindActivity()
 * @model
 * @generated
 */
public interface IotActivityBindActivity extends IotActivity {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(Activity)
	 * @see iot_lua.Iot_luaPackage#getIotActivityBindActivity_Delegate()
	 * @model containment="true"
	 * @generated
	 */
	Activity getDelegate();

	/**
	 * Sets the value of the '{@link iot_lua.IotActivityBindActivity#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Activity value);

} // IotActivityBindActivity
