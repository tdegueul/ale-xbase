/**
 */
package brew;

import ale1.RA1;

import ale2.B;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RA1 Bind B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.RA1BindB#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see brew.BrewPackage#getRA1BindB()
 * @model
 * @generated
 */
public interface RA1BindB extends RA1 {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(B)
	 * @see brew.BrewPackage#getRA1BindB_Delegate()
	 * @model required="true"
	 * @generated
	 */
	B getDelegate();

	/**
	 * Sets the value of the '{@link brew.RA1BindB#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(B value);

} // RA1BindB
