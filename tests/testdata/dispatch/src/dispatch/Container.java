/**
 */
package dispatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dispatch.Container#getObjs <em>Objs</em>}</li>
 * </ul>
 *
 * @see dispatch.DispatchPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Objs</b></em>' containment reference list.
	 * The list contents are of type {@link dispatch.A}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objs</em>' containment reference list.
	 * @see dispatch.DispatchPackage#getContainer_Objs()
	 * @model containment="true"
	 * @generated
	 */
	EList<A> getObjs();

} // Container
