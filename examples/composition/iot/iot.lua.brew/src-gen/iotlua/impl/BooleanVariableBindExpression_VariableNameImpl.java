/**
 */
package iotlua.impl;

import activitydiagram.impl.VariableImpl;

import iotlua.BooleanVariableBindExpression_VariableName;
import iotlua.IotluaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lua.lua.Expression_VariableName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable Bind Expression Variable Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iotlua.impl.BooleanVariableBindExpression_VariableNameImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanVariableBindExpression_VariableNameImpl extends VariableImpl implements BooleanVariableBindExpression_VariableName {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Expression_VariableName delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableBindExpression_VariableNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotluaPackage.Literals.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VariableName getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Expression_VariableName)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VariableName basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Expression_VariableName newDelegate) {
		Expression_VariableName oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE:
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
			case IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE:
				setDelegate((Expression_VariableName)newValue);
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
			case IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE:
				setDelegate((Expression_VariableName)null);
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
			case IotluaPackage.BOOLEAN_VARIABLE_BIND_EXPRESSION_VARIABLE_NAME__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanVariableBindExpression_VariableNameImpl
