/**
 */
package simpleb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleb.SimplebPackage
 * @generated
 */
public interface SimplebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplebFactory eINSTANCE = simpleb.impl.SimplebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>B1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>B1</em>'.
	 * @generated
	 */
	B1 createB1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplebPackage getSimplebPackage();

} //SimplebFactory
