/**
 */
package idlmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idlmm.Container#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see idlmm.IdlmmPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends Contained {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link idlmm.Contained}.
	 * It is bidirectional and its opposite is '{@link idlmm.Contained#getDefinedIn <em>Defined In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see idlmm.IdlmmPackage#getContainer_Contains()
	 * @see idlmm.Contained#getDefinedIn
	 * @model opposite="definedIn" containment="true"
	 * @generated
	 */
	EList<Contained> getContains();

} // Container
