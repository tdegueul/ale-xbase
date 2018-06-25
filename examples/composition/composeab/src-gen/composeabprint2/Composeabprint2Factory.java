/**
 */
package composeabprint2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see composeabprint2.Composeabprint2Package
 * @generated
 */
public interface Composeabprint2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Composeabprint2Factory eINSTANCE = composeabprint2.impl.Composeabprint2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BBind B1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBind B1</em>'.
	 * @generated
	 */
	BBindB1 createBBindB1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Composeabprint2Package getComposeabprint2Package();

} //Composeabprint2Factory
