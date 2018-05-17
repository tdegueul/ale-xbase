/**
 */
package iotlua.impl;

import iotlua.IntegerValueBindExpression_Number;
import iotlua.IotluaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.xtext.lua.lua.Expression_Number;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Value Bind Expression Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotlua.impl.IntegerValueBindExpression_NumberImpl#getValue <em>Value</em>}</li>
 *   <li>{@link iotlua.impl.IntegerValueBindExpression_NumberImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerValueBindExpression_NumberImpl extends EObjectImpl implements IntegerValueBindExpression_Number {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Expression_Number delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValueBindExpression_NumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotluaPackage.Literals.INTEGER_VALUE_BIND_EXPRESSION_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Number getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Expression_Number)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Number basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Expression_Number newDelegate) {
		Expression_Number oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE:
				return getValue();
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
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
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE:
				setValue((Integer)newValue);
				return;
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE:
				setDelegate((Expression_Number)newValue);
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
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE:
				setDelegate((Expression_Number)null);
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
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__VALUE:
				return value != VALUE_EDEFAULT;
			case IotluaPackage.INTEGER_VALUE_BIND_EXPRESSION_NUMBER__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntegerValueBindExpression_NumberImpl
