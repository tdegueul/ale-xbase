/**
 */
package activitydiagramruntime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramruntime.Offer#getOfferedTokens <em>Offered Tokens</em>}</li>
 * </ul>
 *
 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getOffer()
 * @model
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Offered Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramruntime.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Tokens</em>' containment reference list.
	 * @see activitydiagramruntime.ActivitydiagramruntimePackage#getOffer_OfferedTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getOfferedTokens();

} // Offer
