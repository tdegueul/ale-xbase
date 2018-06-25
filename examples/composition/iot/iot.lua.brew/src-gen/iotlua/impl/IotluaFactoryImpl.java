/**
 */
package iotlua.impl;

import iotlua.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotluaFactoryImpl extends EFactoryImpl implements IotluaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IotluaFactory init() {
		try {
			IotluaFactory theIotluaFactory = (IotluaFactory)EPackage.Registry.INSTANCE.getEFactory(IotluaPackage.eNS_URI);
			if (theIotluaFactory != null) {
				return theIotluaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IotluaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotluaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IotluaPackage.EXPRESSION_BIND_STATEMENT: return createExpressionBindStatement();
			case IotluaPackage.VALUE_BIND_EXPRESSION: return createValueBindExpression();
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION: return createBooleanValueBindExpression();
			case IotluaPackage.BOOLEAN_VARIABLE_BIND_STATEMENT_ASSIGNMENT: return createBooleanVariableBindStatement_Assignment();
			case IotluaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT: return createIntegerVariableBindStatement_Assignment();
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER: return createIntegerValueBindExpression_Number();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindStatement createExpressionBindStatement() {
		ExpressionBindStatementImpl expressionBindStatement = new ExpressionBindStatementImpl();
		return expressionBindStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBindExpression createValueBindExpression() {
		ValueBindExpressionImpl valueBindExpression = new ValueBindExpressionImpl();
		return valueBindExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueBindExpression createBooleanValueBindExpression() {
		BooleanValueBindExpressionImpl booleanValueBindExpression = new BooleanValueBindExpressionImpl();
		return booleanValueBindExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableBindStatement_Assignment createBooleanVariableBindStatement_Assignment() {
		BooleanVariableBindStatement_AssignmentImpl booleanVariableBindStatement_Assignment = new BooleanVariableBindStatement_AssignmentImpl();
		return booleanVariableBindStatement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableBindStatement_Assignment createIntegerVariableBindStatement_Assignment() {
		IntegerVariableBindStatement_AssignmentImpl integerVariableBindStatement_Assignment = new IntegerVariableBindStatement_AssignmentImpl();
		return integerVariableBindStatement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueBindExpression_Number createIntegerValueBindExpression_Number() {
		IntegerValueBindExpression_NumberImpl integerValueBindExpression_Number = new IntegerValueBindExpression_NumberImpl();
		return integerValueBindExpression_Number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotluaPackage getIotluaPackage() {
		return (IotluaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IotluaPackage getPackage() {
		return IotluaPackage.eINSTANCE;
	}

} //IotluaFactoryImpl
