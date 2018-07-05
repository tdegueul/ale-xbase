/**
 */
package simpleexpressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simpleexpressions.SEIntegerExpression;
import simpleexpressions.SEIntegerVariable;
import simpleexpressions.SimpleexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SE Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.impl.SEIntegerExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link simpleexpressions.impl.SEIntegerExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SEIntegerExpressionImpl extends SEExpressionImpl implements SEIntegerExpression {
	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected SEIntegerVariable operand2;

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected SEIntegerVariable operand1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SEIntegerExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleexpressionsPackage.Literals.SE_INTEGER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerVariable getOperand2() {
		if (operand2 != null && operand2.eIsProxy()) {
			InternalEObject oldOperand2 = (InternalEObject)operand2;
			operand2 = (SEIntegerVariable)eResolveProxy(oldOperand2);
			if (operand2 != oldOperand2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2, oldOperand2, operand2));
			}
		}
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerVariable basicGetOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(SEIntegerVariable newOperand2) {
		SEIntegerVariable oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2, oldOperand2, operand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerVariable getOperand1() {
		if (operand1 != null && operand1.eIsProxy()) {
			InternalEObject oldOperand1 = (InternalEObject)operand1;
			operand1 = (SEIntegerVariable)eResolveProxy(oldOperand1);
			if (operand1 != oldOperand1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1, oldOperand1, operand1));
			}
		}
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIntegerVariable basicGetOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(SEIntegerVariable newOperand1) {
		SEIntegerVariable oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1, oldOperand1, operand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2:
				if (resolve) return getOperand2();
				return basicGetOperand2();
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1:
				if (resolve) return getOperand1();
				return basicGetOperand1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2:
				setOperand2((SEIntegerVariable)newValue);
				return;
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1:
				setOperand1((SEIntegerVariable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2:
				setOperand2((SEIntegerVariable)null);
				return;
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1:
				setOperand1((SEIntegerVariable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND2:
				return operand2 != null;
			case SimpleexpressionsPackage.SE_INTEGER_EXPRESSION__OPERAND1:
				return operand1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SEIntegerExpressionImpl
