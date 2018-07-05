/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Bind SE Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind SE Expression</em>'.
	 * @generated
	 */
	ExpressionBindSEExpression createExpressionBindSEExpression();

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
	 * Returns a new object of class '<em>Expression Bind Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind Operation Def</em>'.
	 * @generated
	 */
	ExpressionBindOperationDef createExpressionBindOperationDef();

	/**
	 * Returns a new object of class '<em>Io TActivity Bind Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TActivity Bind Activity</em>'.
	 * @generated
	 */
	IoTActivityBindActivity createIoTActivityBindActivity();

	/**
	 * Returns a new object of class '<em>Iot Operation Def Bind Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot Operation Def Bind Operation Def</em>'.
	 * @generated
	 */
	IotOperationDefBindOperationDef createIotOperationDefBindOperationDef();

	/**
	 * Returns a new object of class '<em>Idl Stmt Bind Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idl Stmt Bind Block</em>'.
	 * @generated
	 */
	IdlStmtBindBlock createIdlStmtBindBlock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
