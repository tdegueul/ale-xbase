/**
 */
package ale1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale1.A1#getRa1 <em>Ra1</em>}</li>
 *   <li>{@link ale1.A1#getRa2 <em>Ra2</em>}</li>
 * </ul>
 *
 * @see ale1.Ale1Package#getA1()
 * @model
 * @generated
 */
public interface A1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ra1</b></em>' containment reference list.
	 * The list contents are of type {@link ale1.RA1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ra1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ra1</em>' containment reference list.
	 * @see ale1.Ale1Package#getA1_Ra1()
	 * @model containment="true"
	 * @generated
	 */
	EList<RA1> getRa1();

	/**
	 * Returns the value of the '<em><b>Ra2</b></em>' containment reference list.
	 * The list contents are of type {@link ale1.RA2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ra2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ra2</em>' containment reference list.
	 * @see ale1.Ale1Package#getA1_Ra2()
	 * @model containment="true"
	 * @generated
	 */
	EList<RA2> getRa2();

} // A1
