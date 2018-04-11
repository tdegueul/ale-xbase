/**
 */
package prodSysTokenHolder;

import prodSys.Part;

import tokenHolder.T;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBind Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.TBindPart#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getTBindPart()
 * @model
 * @generated
 */
public interface TBindPart extends T {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Part)
	 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getTBindPart_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Part getDelegate();

	/**
	 * Sets the value of the '{@link prodSysTokenHolder.TBindPart#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Part value);

} // TBindPart
