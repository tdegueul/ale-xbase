/**
 */
package org.csu.idl.idlmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.csu.idl.idlmm.IdlmmPackage
 * @generated
 */
public interface IdlmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlmmFactory eINSTANCE = org.csu.idl.idlmm.impl.IdlmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Def</em>'.
	 * @generated
	 */
	OperationDef createOperationDef();

	/**
	 * Returns a new object of class '<em>Parameter Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Def</em>'.
	 * @generated
	 */
	ParameterDef createParameterDef();

	/**
	 * Returns a new object of class '<em>Exception Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Def</em>'.
	 * @generated
	 */
	ExceptionDef createExceptionDef();

	/**
	 * Returns a new object of class '<em>Field I</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field I</em>'.
	 * @generated
	 */
	FieldI createFieldI();

	/**
	 * Returns a new object of class '<em>Primitive Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Def</em>'.
	 * @generated
	 */
	PrimitiveDef createPrimitiveDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdlmmPackage getIdlmmPackage();

} //IdlmmFactory
