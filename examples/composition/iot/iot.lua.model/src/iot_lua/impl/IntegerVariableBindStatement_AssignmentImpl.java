/**
 */
package iot_lua.impl;

import activitydiagram.impl.VariableImpl;

import iot_lua.IntegerVariableBindStatement_Assignment;
import iot_lua.Iot_luaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.xtext.lua.lua.Statement_FunctioncallOrAssignment;

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
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Statement_FunctioncallOrAssignment delegate;

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
	public Statement_FunctioncallOrAssignment getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegate(Statement_FunctioncallOrAssignment newDelegate, NotificationChain msgs) {
		Statement_FunctioncallOrAssignment oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, oldDelegate, newDelegate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Statement_FunctioncallOrAssignment newDelegate) {
		if (newDelegate != delegate) {
			NotificationChain msgs = null;
			if (delegate != null)
				msgs = ((InternalEObject)delegate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, null, msgs);
			if (newDelegate != null)
				msgs = ((InternalEObject)newDelegate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, null, msgs);
			msgs = basicSetDelegate(newDelegate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE, newDelegate, newDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iot_luaPackage.INTEGER_VARIABLE_BIND_STATEMENT_ASSIGNMENT__DELEGATE:
				return basicSetDelegate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getDelegate();
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
				setDelegate((Statement_FunctioncallOrAssignment)newValue);
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
				setDelegate((Statement_FunctioncallOrAssignment)null);
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
