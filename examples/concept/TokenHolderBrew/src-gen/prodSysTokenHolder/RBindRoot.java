/**
 */
package prodSysTokenHolder;

import prodSys.Root;

import tokenHolder.R;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBind Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.RBindRoot#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getRBindRoot()
 * @model
 * @generated
 */
public interface RBindRoot extends R {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Root)
	 * @see prodSysTokenHolder.ProdSysTokenHolderPackage#getRBindRoot_Delegate()
	 * @model required="true"
	 * @generated
	 */
	Root getDelegate();

	/**
	 * Sets the value of the '{@link prodSysTokenHolder.RBindRoot#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Root value);

} // RBindRoot
