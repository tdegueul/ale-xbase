/**
 */
package iot_lua;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iot_lua.Iot_luaPackage
 * @generated
 */
public interface Iot_luaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Iot_luaFactory eINSTANCE = iot_lua.impl.Iot_luaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Bind Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind Statement</em>'.
	 * @generated
	 */
	ExpressionBindStatement createExpressionBindStatement();

	/**
	 * Returns a new object of class '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable Bind Statement Assignment</em>'.
	 * @generated
	 */
	BooleanVariableBindStatement_Assignment createBooleanVariableBindStatement_Assignment();

	/**
	 * Returns a new object of class '<em>Integer Variable Bind Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable Bind Statement Assignment</em>'.
	 * @generated
	 */
	IntegerVariableBindStatement_Assignment createIntegerVariableBindStatement_Assignment();

	/**
	 * Returns a new object of class '<em>Expression Bind Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Bind Operation Def</em>'.
	 * @generated
	 */
	ExpressionBindOperationDef createExpressionBindOperationDef();

	/**
	 * Returns a new object of class '<em>Iot Activity Bind Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iot Activity Bind Activity</em>'.
	 * @generated
	 */
	IotActivityBindActivity createIotActivityBindActivity();

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
	 * Returns a new object of class '<em>Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Data</em>'.
	 * @generated
	 */
	RuntimeData createRuntimeData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Iot_luaPackage getIot_luaPackage();

} //Iot_luaFactory
