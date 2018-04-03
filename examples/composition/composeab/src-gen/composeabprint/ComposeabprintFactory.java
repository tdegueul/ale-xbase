/**
 */
package composeabprint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see composeabprint.ComposeabprintPackage
 * @generated
 */
public interface ComposeabprintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComposeabprintFactory eINSTANCE = composeabprint.impl.ComposeabprintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BBind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BBind</em>'.
	 * @generated
	 */
	BBind createBBind();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComposeabprintPackage getComposeabprintPackage();

} //ComposeabprintFactory
