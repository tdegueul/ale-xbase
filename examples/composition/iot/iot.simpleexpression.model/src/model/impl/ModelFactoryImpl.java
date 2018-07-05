/**
 */
package model.impl;

import model.*;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.EXPRESSION_BIND_SE_EXPRESSION: return createExpressionBindSEExpression();
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE: return createBooleanVariableBindSEBooleanVariable();
			case ModelPackage.INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE: return createIntegerVariableBindSEIntegerVariable();
			case ModelPackage.EXPRESSION_BIND_OPERATION_DEF: return createExpressionBindOperationDef();
			case ModelPackage.IO_TACTIVITY_BIND_ACTIVITY: return createIoTActivityBindActivity();
			case ModelPackage.IOT_OPERATION_DEF_BIND_OPERATION_DEF: return createIotOperationDefBindOperationDef();
			case ModelPackage.IDL_STMT_BIND_BLOCK: return createIdlStmtBindBlock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindSEExpression createExpressionBindSEExpression() {
		ExpressionBindSEExpressionImpl expressionBindSEExpression = new ExpressionBindSEExpressionImpl();
		return expressionBindSEExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariableBindSEBooleanVariable createBooleanVariableBindSEBooleanVariable() {
		BooleanVariableBindSEBooleanVariableImpl booleanVariableBindSEBooleanVariable = new BooleanVariableBindSEBooleanVariableImpl();
		return booleanVariableBindSEBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariableBindSEIntegerVariable createIntegerVariableBindSEIntegerVariable() {
		IntegerVariableBindSEIntegerVariableImpl integerVariableBindSEIntegerVariable = new IntegerVariableBindSEIntegerVariableImpl();
		return integerVariableBindSEIntegerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBindOperationDef createExpressionBindOperationDef() {
		ExpressionBindOperationDefImpl expressionBindOperationDef = new ExpressionBindOperationDefImpl();
		return expressionBindOperationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTActivityBindActivity createIoTActivityBindActivity() {
		IoTActivityBindActivityImpl ioTActivityBindActivity = new IoTActivityBindActivityImpl();
		return ioTActivityBindActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotOperationDefBindOperationDef createIotOperationDefBindOperationDef() {
		IotOperationDefBindOperationDefImpl iotOperationDefBindOperationDef = new IotOperationDefBindOperationDefImpl();
		return iotOperationDefBindOperationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlStmtBindBlock createIdlStmtBindBlock() {
		IdlStmtBindBlockImpl idlStmtBindBlock = new IdlStmtBindBlockImpl();
		return idlStmtBindBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
