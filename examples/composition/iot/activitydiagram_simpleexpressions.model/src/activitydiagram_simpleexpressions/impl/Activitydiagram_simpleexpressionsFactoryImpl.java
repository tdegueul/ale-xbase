/**
 */
package activitydiagram_simpleexpressions.impl;

import activitydiagram_simpleexpressions.*;

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
public class Activitydiagram_simpleexpressionsFactoryImpl extends EFactoryImpl implements Activitydiagram_simpleexpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Activitydiagram_simpleexpressionsFactory init() {
		try {
			Activitydiagram_simpleexpressionsFactory theActivitydiagram_simpleexpressionsFactory = (Activitydiagram_simpleexpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(Activitydiagram_simpleexpressionsPackage.eNS_URI);
			if (theActivitydiagram_simpleexpressionsFactory != null) {
				return theActivitydiagram_simpleexpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Activitydiagram_simpleexpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activitydiagram_simpleexpressionsFactoryImpl() {
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
			case Activitydiagram_simpleexpressionsPackage.EXP_BIND_SE_EXPRESSION: return createExpBindSEExpression();
			case Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE: return createBooleanVariableBindSEBooleanVariable();
			case Activitydiagram_simpleexpressionsPackage.INTEGER_VARIABLE_BIND_SE_INTEGER_VARIABLE: return createIntegerVariableBindSEIntegerVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBindSEExpression createExpBindSEExpression() {
		ExpBindSEExpressionImpl expBindSEExpression = new ExpBindSEExpressionImpl();
		return expBindSEExpression;
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
	public Activitydiagram_simpleexpressionsPackage getActivitydiagram_simpleexpressionsPackage() {
		return (Activitydiagram_simpleexpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Activitydiagram_simpleexpressionsPackage getPackage() {
		return Activitydiagram_simpleexpressionsPackage.eINSTANCE;
	}

} //Activitydiagram_simpleexpressionsFactoryImpl
