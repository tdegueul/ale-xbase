/**
 */
package fullfsmeval;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fullfsmeval.FullfsmevalPackage
 * @generated
 */
public interface FullfsmevalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FullfsmevalFactory eINSTANCE = fullfsmeval.impl.FullfsmevalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Bind Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Bind Block</em>'.
	 * @generated
	 */
	ActionBindBlock createActionBindBlock();

	/**
	 * Returns a new object of class '<em>Guard Bind Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Bind Exp</em>'.
	 * @generated
	 */
	GuardBindExp createGuardBindExp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FullfsmevalPackage getFullfsmevalPackage();

} //FullfsmevalFactory
