/**
 */
package prodSys;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodSys.Conveyor#getOutM <em>Out M</em>}</li>
 *   <li>{@link prodSys.Conveyor#getInM <em>In M</em>}</li>
 *   <li>{@link prodSys.Conveyor#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see prodSys.ProdSysPackage#getConveyor()
 * @model
 * @generated
 */
public interface Conveyor extends EObject {
	/**
	 * Returns the value of the '<em><b>Out M</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prodSys.Machine#getInC <em>In C</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out M</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out M</em>' reference.
	 * @see #setOutM(Machine)
	 * @see prodSys.ProdSysPackage#getConveyor_OutM()
	 * @see prodSys.Machine#getInC
	 * @model opposite="inC"
	 * @generated
	 */
	Machine getOutM();

	/**
	 * Sets the value of the '{@link prodSys.Conveyor#getOutM <em>Out M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out M</em>' reference.
	 * @see #getOutM()
	 * @generated
	 */
	void setOutM(Machine value);

	/**
	 * Returns the value of the '<em><b>In M</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link prodSys.Machine#getOutC <em>Out C</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In M</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In M</em>' reference.
	 * @see #setInM(Machine)
	 * @see prodSys.ProdSysPackage#getConveyor_InM()
	 * @see prodSys.Machine#getOutC
	 * @model opposite="outC"
	 * @generated
	 */
	Machine getInM();

	/**
	 * Sets the value of the '{@link prodSys.Conveyor#getInM <em>In M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In M</em>' reference.
	 * @see #getInM()
	 * @generated
	 */
	void setInM(Machine value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link prodSys.Part}.
	 * It is bidirectional and its opposite is '{@link prodSys.Part#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see prodSys.ProdSysPackage#getConveyor_Parts()
	 * @see prodSys.Part#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Part> getParts();

} // Conveyor
