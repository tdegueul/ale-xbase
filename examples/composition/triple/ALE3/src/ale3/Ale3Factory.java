/**
 */
package ale3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ale3.Ale3Package
 * @generated
 */
public interface Ale3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ale3Factory eINSTANCE = ale3.impl.Ale3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>C1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C1</em>'.
	 * @generated
	 */
	C1 createC1();

	/**
	 * Returns a new object of class '<em>C2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C2</em>'.
	 * @generated
	 */
	C2 createC2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ale3Package getAle3Package();

} //Ale3Factory
