/**
 */
package iot.impl;

import iot.*;

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
public class IotFactoryImpl extends EFactoryImpl implements IotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IotFactory init() {
		try {
			IotFactory theIotFactory = (IotFactory)EPackage.Registry.INSTANCE.getEFactory(IotPackage.eNS_URI);
			if (theIotFactory != null) {
				return theIotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotFactoryImpl() {
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
			case IotPackage.EXPRESSION_BIND_EXPRESSION: return createExpressionBindExpression();
			case IotPackage.VALUE_BIND_VALUE: return createValueBindValue();
			case IotPackage.BOOLEAN_VALUE_BIND_BOOLEAN_VALUE: return createBooleanValueBindBooleanValue();
			case IotPackage.BOOLEAN_VARIABLE_BIND_BOOLEAN_VARIABLE: return createBooleanVariableBindBooleanVariable();
			case IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE: return createIntegerVariableBindIntegerVariable();
			case IotPackage.INTEGER_VALUE_BIND_INTEGER_VALUE: return createIntegerValueBindIntegerValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindExpression createExpressionBindExpression() {
		ExpressionBindExpressionImpl expressionBindExpression = new ExpressionBindExpressionImpl();
		return expressionBindExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBindValue createValueBindValue() {
		ValueBindValueImpl valueBindValue = new ValueBindValueImpl();
		return valueBindValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueBindBooleanValue createBooleanValueBindBooleanValue() {
		BooleanValueBindBooleanValueImpl booleanValueBindBooleanValue = new BooleanValueBindBooleanValueImpl();
		return booleanValueBindBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableBindBooleanVariable createBooleanVariableBindBooleanVariable() {
		BooleanVariableBindBooleanVariableImpl booleanVariableBindBooleanVariable = new BooleanVariableBindBooleanVariableImpl();
		return booleanVariableBindBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableBindIntegerVariable createIntegerVariableBindIntegerVariable() {
		IntegerVariableBindIntegerVariableImpl integerVariableBindIntegerVariable = new IntegerVariableBindIntegerVariableImpl();
		return integerVariableBindIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueBindIntegerValue createIntegerValueBindIntegerValue() {
		IntegerValueBindIntegerValueImpl integerValueBindIntegerValue = new IntegerValueBindIntegerValueImpl();
		return integerValueBindIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotPackage getIotPackage() {
		return (IotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IotPackage getPackage() {
		return IotPackage.eINSTANCE;
	}

} //IotFactoryImpl
