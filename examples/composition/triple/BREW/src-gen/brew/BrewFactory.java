/**
 */
package brew;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see brew.BrewPackage
 * @generated
 */
public interface BrewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrewFactory eINSTANCE = brew.impl.BrewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RA1 Bind B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RA1 Bind B</em>'.
	 * @generated
	 */
	RA1BindB createRA1BindB();

	/**
	 * Returns a new object of class '<em>RA2 Bind C1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RA2 Bind C1</em>'.
	 * @generated
	 */
	RA2BindC1 createRA2BindC1();

	/**
	 * Returns a new object of class '<em>RB Bind C1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RB Bind C1</em>'.
	 * @generated
	 */
	RBBindC1 createRBBindC1();

	/**
	 * Returns a new object of class '<em>RB Bind C2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RB Bind C2</em>'.
	 * @generated
	 */
	RBBindC2 createRBBindC2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BrewPackage getBrewPackage();

} //BrewFactory
