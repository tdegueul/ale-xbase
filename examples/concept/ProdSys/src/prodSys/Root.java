/**
 */
package prodSys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSys.Root#getMachine <em>Machine</em>}</li>
 *   <li>{@link prodSys.Root#getConveyor <em>Conveyor</em>}</li>
 * </ul>
 *
 * @see prodSys.ProdSysPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Machine</b></em>' containment reference list.
	 * The list contents are of type {@link prodSys.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' containment reference list.
	 * @see prodSys.ProdSysPackage#getRoot_Machine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getMachine();

	/**
	 * Returns the value of the '<em><b>Conveyor</b></em>' containment reference list.
	 * The list contents are of type {@link prodSys.Conveyor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conveyor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveyor</em>' containment reference list.
	 * @see prodSys.ProdSysPackage#getRoot_Conveyor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conveyor> getConveyor();

} // Root
