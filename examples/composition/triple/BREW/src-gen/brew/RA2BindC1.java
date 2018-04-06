/**
 */
package brew;

import ale1.RA2;

import ale3.C1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RA2 Bind C1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.RA2BindC1#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see brew.BrewPackage#getRA2BindC1()
 * @model
 * @generated
 */
public interface RA2BindC1 extends RA2 {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(C1)
	 * @see brew.BrewPackage#getRA2BindC1_Delegate()
	 * @model required="true"
	 * @generated
	 */
	C1 getDelegate();

	/**
	 * Sets the value of the '{@link brew.RA2BindC1#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(C1 value);

} // RA2BindC1
