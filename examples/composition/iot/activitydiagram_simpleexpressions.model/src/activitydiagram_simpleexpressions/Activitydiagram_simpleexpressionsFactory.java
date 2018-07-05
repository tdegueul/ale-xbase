/**
 */
package activitydiagram_simpleexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage
 * @generated
 */
public interface Activitydiagram_simpleexpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Activitydiagram_simpleexpressionsFactory eINSTANCE = activitydiagram_simpleexpressions.impl.Activitydiagram_simpleexpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exp Bind SE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exp Bind SE Expression</em>'.
	 * @generated
	 */
	ExpBindSEExpression createExpBindSEExpression();

	/**
	 * Returns a new object of class '<em>Boolean Variable Bind SE Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Bind SE Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariableBindSEBooleanVariable createBooleanVariableBindSEBooleanVariable();

	/**
	 * Returns a new object of class '<em>Integer Variable Bind SE Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable Bind SE Integer Variable</em>'.
	 * @generated
	 */
	IntegerVariableBindSEIntegerVariable createIntegerVariableBindSEIntegerVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Activitydiagram_simpleexpressionsPackage getActivitydiagram_simpleexpressionsPackage();

} //Activitydiagram_simpleexpressionsFactory
