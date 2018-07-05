/**
 */
package simpleexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleexpressions.SimpleexpressionsPackage
 * @generated
 */
public interface SimpleexpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleexpressionsFactory eINSTANCE = simpleexpressions.impl.SimpleexpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SE Integer Calculation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Integer Calculation Expression</em>'.
	 * @generated
	 */
	SEIntegerCalculationExpression createSEIntegerCalculationExpression();

	/**
	 * Returns a new object of class '<em>SE Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Integer Comparison Expression</em>'.
	 * @generated
	 */
	SEIntegerComparisonExpression createSEIntegerComparisonExpression();

	/**
	 * Returns a new object of class '<em>SE Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Boolean Value</em>'.
	 * @generated
	 */
	SEBooleanValue createSEBooleanValue();

	/**
	 * Returns a new object of class '<em>SE Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Integer Value</em>'.
	 * @generated
	 */
	SEIntegerValue createSEIntegerValue();

	/**
	 * Returns a new object of class '<em>SE Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Boolean Binary Expression</em>'.
	 * @generated
	 */
	SEBooleanBinaryExpression createSEBooleanBinaryExpression();

	/**
	 * Returns a new object of class '<em>SE Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Boolean Variable</em>'.
	 * @generated
	 */
	SEBooleanVariable createSEBooleanVariable();

	/**
	 * Returns a new object of class '<em>SE Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Integer Variable</em>'.
	 * @generated
	 */
	SEIntegerVariable createSEIntegerVariable();

	/**
	 * Returns a new object of class '<em>SE Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE Boolean Unary Expression</em>'.
	 * @generated
	 */
	SEBooleanUnaryExpression createSEBooleanUnaryExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleexpressionsPackage getSimpleexpressionsPackage();

} //SimpleexpressionsFactory
