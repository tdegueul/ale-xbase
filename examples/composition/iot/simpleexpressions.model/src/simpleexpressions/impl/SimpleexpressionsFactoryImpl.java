/**
 */
package simpleexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleexpressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleexpressionsFactoryImpl extends EFactoryImpl implements SimpleexpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleexpressionsFactory init() {
		try {
			SimpleexpressionsFactory theSimpleexpressionsFactory = (SimpleexpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleexpressionsPackage.eNS_URI);
			if (theSimpleexpressionsFactory != null) {
				return theSimpleexpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleexpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleexpressionsFactoryImpl() {
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
			case SimpleexpressionsPackage.SE_INTEGER_CALCULATION_EXPRESSION: return createSEIntegerCalculationExpression();
			case SimpleexpressionsPackage.SE_INTEGER_COMPARISON_EXPRESSION: return createSEIntegerComparisonExpression();
			case SimpleexpressionsPackage.SE_BOOLEAN_VALUE: return createSEBooleanValue();
			case SimpleexpressionsPackage.SE_INTEGER_VALUE: return createSEIntegerValue();
			case SimpleexpressionsPackage.SE_BOOLEAN_BINARY_EXPRESSION: return createSEBooleanBinaryExpression();
			case SimpleexpressionsPackage.SE_BOOLEAN_VARIABLE: return createSEBooleanVariable();
			case SimpleexpressionsPackage.SE_INTEGER_VARIABLE: return createSEIntegerVariable();
			case SimpleexpressionsPackage.SE_BOOLEAN_UNARY_EXPRESSION: return createSEBooleanUnaryExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimpleexpressionsPackage.SE_INTEGER_CALCULATION_OPERATOR:
				return createSEIntegerCalculationOperatorFromString(eDataType, initialValue);
			case SimpleexpressionsPackage.SE_INTEGER_COMPARISON_OPERATOR:
				return createSEIntegerComparisonOperatorFromString(eDataType, initialValue);
			case SimpleexpressionsPackage.SE_BOOLEAN_UNARY_OPERATOR:
				return createSEBooleanUnaryOperatorFromString(eDataType, initialValue);
			case SimpleexpressionsPackage.SE_BOOLEAN_BINARY_OPERATOR:
				return createSEBooleanBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimpleexpressionsPackage.SE_INTEGER_CALCULATION_OPERATOR:
				return convertSEIntegerCalculationOperatorToString(eDataType, instanceValue);
			case SimpleexpressionsPackage.SE_INTEGER_COMPARISON_OPERATOR:
				return convertSEIntegerComparisonOperatorToString(eDataType, instanceValue);
			case SimpleexpressionsPackage.SE_BOOLEAN_UNARY_OPERATOR:
				return convertSEBooleanUnaryOperatorToString(eDataType, instanceValue);
			case SimpleexpressionsPackage.SE_BOOLEAN_BINARY_OPERATOR:
				return convertSEBooleanBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerCalculationExpression createSEIntegerCalculationExpression() {
		SEIntegerCalculationExpressionImpl seIntegerCalculationExpression = new SEIntegerCalculationExpressionImpl();
		return seIntegerCalculationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerComparisonExpression createSEIntegerComparisonExpression() {
		SEIntegerComparisonExpressionImpl seIntegerComparisonExpression = new SEIntegerComparisonExpressionImpl();
		return seIntegerComparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanValue createSEBooleanValue() {
		SEBooleanValueImpl seBooleanValue = new SEBooleanValueImpl();
		return seBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerValue createSEIntegerValue() {
		SEIntegerValueImpl seIntegerValue = new SEIntegerValueImpl();
		return seIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanBinaryExpression createSEBooleanBinaryExpression() {
		SEBooleanBinaryExpressionImpl seBooleanBinaryExpression = new SEBooleanBinaryExpressionImpl();
		return seBooleanBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanVariable createSEBooleanVariable() {
		SEBooleanVariableImpl seBooleanVariable = new SEBooleanVariableImpl();
		return seBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerVariable createSEIntegerVariable() {
		SEIntegerVariableImpl seIntegerVariable = new SEIntegerVariableImpl();
		return seIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanUnaryExpression createSEBooleanUnaryExpression() {
		SEBooleanUnaryExpressionImpl seBooleanUnaryExpression = new SEBooleanUnaryExpressionImpl();
		return seBooleanUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerCalculationOperator createSEIntegerCalculationOperatorFromString(EDataType eDataType, String initialValue) {
		SEIntegerCalculationOperator result = SEIntegerCalculationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSEIntegerCalculationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerComparisonOperator createSEIntegerComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		SEIntegerComparisonOperator result = SEIntegerComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSEIntegerComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanUnaryOperator createSEBooleanUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		SEBooleanUnaryOperator result = SEBooleanUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSEBooleanUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanBinaryOperator createSEBooleanBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		SEBooleanBinaryOperator result = SEBooleanBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSEBooleanBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleexpressionsPackage getSimpleexpressionsPackage() {
		return (SimpleexpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleexpressionsPackage getPackage() {
		return SimpleexpressionsPackage.eINSTANCE;
	}

} //SimpleexpressionsFactoryImpl
