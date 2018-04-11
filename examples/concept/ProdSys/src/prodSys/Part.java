/**
 */
package prodSys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSys.Part#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link prodSys.Part#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see prodSys.ProdSysPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(int)
	 * @see prodSys.ProdSysPackage#getPart_CreationTime()
	 * @model
	 * @generated
	 */
	int getCreationTime();

	/**
	 * Sets the value of the '{@link prodSys.Part#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link prodSys.Conveyor#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Conveyor)
	 * @see prodSys.ProdSysPackage#getPart_Owner()
	 * @see prodSys.Conveyor#getParts
	 * @model opposite="parts" transient="false"
	 * @generated
	 */
	Conveyor getOwner();

	/**
	 * Sets the value of the '{@link prodSys.Part#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Conveyor value);

} // Part
