/**
 */
package iot_lua.impl;

import activitydiagram.impl.VariableImpl;

import iot_lua.IntegerVariableBindStatement_Assignment;
import iot_lua.Iot_luaPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable Bind Statement Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.impl.IntegerVariableBindStatement_AssignmentImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerVariableBindStatement_AssignmentImpl extends VariableImpl implements IntegerVariableBindStatement_Assignment {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected org.xtext.lua.lua.Statement_Assignment delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableBindStatement_AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot_luaPackage.Literals.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.lua.lua.Statement_Assignment getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (org.xtext.lua.lua.Statement_Assignment)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.xtext.lua.lua.Statement_Assignment basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(org.xtext.lua.lua.Statement_Assignment newDelegate) {
		org.xtext.lua.lua.Statement_Assignment oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE:
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
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE:
				setDelegate((org.xtext.lua.lua.Statement_Assignment)newValue);
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
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE:
				setDelegate((org.xtext.lua.lua.Statement_Assignment)null);
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
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerVariableBindStatement_AssignmentImpl
