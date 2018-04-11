/**
 */
package tokenHolder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tokenHolder.P#getInHolders <em>In Holders</em>}</li>
 *   <li>{@link tokenHolder.P#getOutHolders <em>Out Holders</em>}</li>
 * </ul>
 *
 * @see tokenHolder.TokenHolderPackage#getP()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface P extends EObject {
	/**
	 * Returns the value of the '<em><b>In Holders</b></em>' reference list.
	 * The list contents are of type {@link tokenHolder.H}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Holders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Holders</em>' reference list.
	 * @see tokenHolder.TokenHolderPackage#getP_InHolders()
	 * @model
	 * @generated
	 */
	EList<H> getInHolders();

	/**
	 * Returns the value of the '<em><b>Out Holders</b></em>' reference list.
	 * The list contents are of type {@link tokenHolder.H}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Holders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Holders</em>' reference list.
	 * @see tokenHolder.TokenHolderPackage#getP_OutHolders()
	 * @model
	 * @generated
	 */
	EList<H> getOutHolders();

} // P
