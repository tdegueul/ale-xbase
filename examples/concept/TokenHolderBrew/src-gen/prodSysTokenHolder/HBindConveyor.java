/**
 */
package prodSysTokenHolder;

import prodSys.Conveyor;

import tokenHolder.H;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBind Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.HBindConveyor#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getHBindConveyor()
 * @model
 * @generated
 */
public interface HBindConveyor extends H {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Conveyor)
	 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getHBindConveyor_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Conveyor getDelegate();

	/**
	 * Sets the value of the '{@link prodSysTokenHolder.HBindConveyor#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Conveyor value);

} // HBindConveyor
