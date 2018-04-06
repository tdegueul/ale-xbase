/**
 */
package brew;

import ale2.RB;

import ale3.C2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RB Bind C2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brew.RBBindC2#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see brew.BrewPackage#getRBBindC2()
 * @model
 * @generated
 */
public interface RBBindC2 extends RB {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(C2)
	 * @see brew.BrewPackage#getRBBindC2_Delegate()
	 * @model required="true"
	 * @generated
	 */
	C2 getDelegate();

	/**
	 * Sets the value of the '{@link brew.RBBindC2#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(C2 value);

} // RBBindC2
