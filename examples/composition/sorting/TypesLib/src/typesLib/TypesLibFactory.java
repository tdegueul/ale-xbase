/**
 */
package typesLib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typesLib.TypesLibPackage
 * @generated
 */
public interface TypesLibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesLibFactory eINSTANCE = typesLib.impl.TypesLibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Wrapper</em>'.
	 * @generated
	 */
	IntWrapper createIntWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesLibPackage getTypesLibPackage();

} //TypesLibFactory
