/**
 */
package activitydiagram_simpleexpressions.impl;

import activitydiagram.impl.VariableImpl;

import activitydiagram_simpleexpressions.Activitydiagram_simpleexpressionsPackage;
import activitydiagram_simpleexpressions.BooleanVariableBindSEBooleanVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleexpressions.SEBooleanVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable Bind SE Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram_simpleexpressions.impl.BooleanVariableBindSEBooleanVariableImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanVariableBindSEBooleanVariableImpl extends VariableImpl implements BooleanVariableBindSEBooleanVariable {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected SEBooleanVariable delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableBindSEBooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Activitydiagram_simpleexpressionsPackage.Literals.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanVariable getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (SEBooleanVariable)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanVariable basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(SEBooleanVariable newDelegate) {
		SEBooleanVariable oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
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
			case Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				setDelegate((SEBooleanVariable)newValue);
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
			case Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				setDelegate((SEBooleanVariable)null);
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
			case Activitydiagram_simpleexpressionsPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanVariableBindSEBooleanVariableImpl
