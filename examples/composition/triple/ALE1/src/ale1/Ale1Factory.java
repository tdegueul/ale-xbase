/**
 */
package ale1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ale1.Ale1Package
 * @generated
 */
public interface Ale1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ale1Factory eINSTANCE = ale1.impl.Ale1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A1</em>'.
	 * @generated
	 */
	A1 createA1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ale1Package getAle1Package();

} //Ale1Factory
