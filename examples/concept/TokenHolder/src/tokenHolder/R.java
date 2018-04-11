/**
 */
package tokenHolder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tokenHolder.R#getH <em>H</em>}</li>
 *   <li>{@link tokenHolder.R#getP <em>P</em>}</li>
 * </ul>
 *
 * @see tokenHolder.TokenHolderPackage#getR()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface R extends EObject {
	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference list.
	 * The list contents are of type {@link tokenHolder.H}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference list.
	 * @see tokenHolder.TokenHolderPackage#getR_H()
	 * @model containment="true"
	 * @generated
	 */
	EList<H> getH();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link tokenHolder.P}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see tokenHolder.TokenHolderPackage#getR_P()
	 * @model containment="true"
	 * @generated
	 */
	EList<P> getP();

} // R
