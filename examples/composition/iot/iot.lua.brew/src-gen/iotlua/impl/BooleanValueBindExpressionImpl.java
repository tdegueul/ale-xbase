/**
 */
package iotlua.impl;

import iotlua.BooleanValueBindExpression;
import iotlua.IotluaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.xtext.lua.lua.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value Bind Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotlua.impl.BooleanValueBindExpressionImpl#isValue <em>Value</em>}</li>
 *   <li>{@link iotlua.impl.BooleanValueBindExpressionImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanValueBindExpressionImpl extends EObjectImpl implements BooleanValueBindExpression {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Expression delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueBindExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotluaPackage.Literals.BOOLEAN_VALUE_BIND_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Expression)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Expression newDelegate) {
		Expression oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__VALUE:
				return isValue();
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE:
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
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__VALUE:
				setValue((Boolean)newValue);
				return;
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE:
				setDelegate((Expression)newValue);
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
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE:
				setDelegate((Expression)null);
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
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__VALUE:
				return value != VALUE_EDEFAULT;
			case IotluaPackage.BOOLEAN_VALUE_BIND_EXPRESSION__DELEGATE:
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

} //BooleanValueBindExpressionImpl
