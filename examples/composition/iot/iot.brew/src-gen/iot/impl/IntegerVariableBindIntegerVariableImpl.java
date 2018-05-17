/**
 */
package iot.impl;

import activitydiagram.impl.VariableImpl;

import iot.IntegerVariableBindIntegerVariable;
import iot.IotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleexpressions.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable Bind Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.impl.IntegerVariableBindIntegerVariableImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerVariableBindIntegerVariableImpl extends VariableImpl implements IntegerVariableBindIntegerVariable {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected IntegerVariable delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableBindIntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (IntegerVariable)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(IntegerVariable newDelegate) {
		IntegerVariable oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE:
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
			case IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE:
				setDelegate((IntegerVariable)newValue);
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
			case IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE:
				setDelegate((IntegerVariable)null);
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
			case IotPackage.INTEGER_VARIABLE_BIND_INTEGER_VARIABLE__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerVariableBindIntegerVariableImpl
