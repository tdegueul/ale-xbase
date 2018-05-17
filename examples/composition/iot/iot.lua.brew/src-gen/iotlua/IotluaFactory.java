/**
 */
package iotlua;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iotlua.IotluaPackage
 * @generated
 */
public interface IotluaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotluaFactory eINSTANCE = iotlua.impl.IotluaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Bind Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind Expression</em>'.
	 * @generated
	 */
	ExpressionBindExpression createExpressionBindExpression();

	/**
	 * Returns a new object of class '<em>Value Bind Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Bind Expression</em>'.
	 * @generated
	 */
	ValueBindExpression createValueBindExpression();

	/**
	 * Returns a new object of class '<em>Boolean Value Bind Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Bind Expression</em>'.
	 * @generated
	 */
	BooleanValueBindExpression createBooleanValueBindExpression();

	/**
	 * Returns a new object of class '<em>Boolean Variable Bind Expression Variable Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Bind Expression Variable Name</em>'.
	 * @generated
	 */
	BooleanVariableBindExpression_VariableName createBooleanVariableBindExpression_VariableName();

	/**
	 * Returns a new object of class '<em>Integer Value Bind Expression Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Bind Expression Number</em>'.
	 * @generated
	 */
	IntegerValueBindExpression_Number createIntegerValueBindExpression_Number();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IotluaPackage getIotluaPackage();

} //IotluaFactory
