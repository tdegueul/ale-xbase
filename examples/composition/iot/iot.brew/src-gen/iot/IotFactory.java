/**
 */
package iot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iot.IotPackage
 * @generated
 */
public interface IotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotFactory eINSTANCE = iot.impl.IotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Bind Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind Expression</em>'.
	 * @generated
	 */
	ExpressionBindExpression createExpressionBindExpression();

	/**
	 * Returns a new object of class '<em>Value Bind Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Bind Value</em>'.
	 * @generated
	 */
	ValueBindValue createValueBindValue();

	/**
	 * Returns a new object of class '<em>Boolean Value Bind Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Bind Boolean Value</em>'.
	 * @generated
	 */
	BooleanValueBindBooleanValue createBooleanValueBindBooleanValue();

	/**
	 * Returns a new object of class '<em>Boolean Variable Bind Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Bind Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariableBindBooleanVariable createBooleanVariableBindBooleanVariable();

	/**
	 * Returns a new object of class '<em>Integer Variable Bind Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable Bind Integer Variable</em>'.
	 * @generated
	 */
	IntegerVariableBindIntegerVariable createIntegerVariableBindIntegerVariable();

	/**
	 * Returns a new object of class '<em>Integer Value Bind Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Bind Integer Value</em>'.
	 * @generated
	 */
	IntegerValueBindIntegerValue createIntegerValueBindIntegerValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IotPackage getIotPackage();

} //IotFactory
