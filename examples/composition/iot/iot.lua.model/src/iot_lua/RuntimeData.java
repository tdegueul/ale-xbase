/**
 */
package iot_lua;

import activitydiagramruntime.Token;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.RuntimeData#getAdr <em>Adr</em>}</li>
 * </ul>
 *
 * @see iot_lua.Iot_luaPackage#getRuntimeData()
 * @model
 * @generated
 */
public interface RuntimeData extends EObject {
	/**
	 * Returns the value of the '<em><b>Adr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adr</em>' reference.
	 * @see #setAdr(Token)
	 * @see iot_lua.Iot_luaPackage#getRuntimeData_Adr()
	 * @model
	 * @generated
	 */
	Token getAdr();

	/**
	 * Sets the value of the '{@link iot_lua.RuntimeData#getAdr <em>Adr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adr</em>' reference.
	 * @see #getAdr()
	 * @generated
	 */
	void setAdr(Token value);

} // RuntimeData
