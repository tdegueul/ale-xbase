/**
 */
package adruntime;

import adwithoutruntime.ActivityEdge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adruntime.ActivityEdge_Aspect#getOffers <em>Offers</em>}</li>
 * </ul>
 *
 * @see adruntime.AdruntimePackage#getActivityEdge_Aspect()
 * @model
 * @generated
 */
public interface ActivityEdge_Aspect extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Offers</b></em>' containment reference list.
	 * The list contents are of type {@link adruntime.Offer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' containment reference list.
	 * @see adruntime.AdruntimePackage#getActivityEdge_Aspect_Offers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Offer> getOffers();

} // ActivityEdge_Aspect
