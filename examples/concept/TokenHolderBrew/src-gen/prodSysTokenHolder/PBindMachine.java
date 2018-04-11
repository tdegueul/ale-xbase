/**
 */
package prodSysTokenHolder;

import prodSys.Machine;

import tokenHolder.P;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PBind Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.PBindMachine#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getPBindMachine()
 * @model
 * @generated
 */
public interface PBindMachine extends P {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Machine)
	 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getPBindMachine_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Machine getDelegate();

	/**
	 * Sets the value of the '{@link prodSysTokenHolder.PBindMachine#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Machine value);

} // PBindMachine
