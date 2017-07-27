/**
 */
package guardedfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guardedfsm.GuardedfsmPackage
 * @generated
 */
public interface GuardedfsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuardedfsmFactory eINSTANCE = guardedfsm.impl.GuardedfsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Guarded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded</em>'.
	 * @generated
	 */
	Guarded createGuarded();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuardedfsmPackage getGuardedfsmPackage();

} //GuardedfsmFactory
