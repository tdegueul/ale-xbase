/**
 */
package iot_lua.impl;

import activitydiagramruntime.Token;

import iot_lua.Iot_luaPackage;
import iot_lua.RuntimeData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot_lua.impl.RuntimeDataImpl#getAdr <em>Adr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeDataImpl extends MinimalEObjectImpl.Container implements RuntimeData {
	/**
	 * The cached value of the '{@link #getAdr() <em>Adr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdr()
	 * @generated
	 * @ordered
	 */
	protected Token adr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iot_luaPackage.Literals.RUNTIME_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getAdr() {
		if (adr != null && adr.eIsProxy()) {
			InternalEObject oldAdr = (InternalEObject)adr;
			adr = (Token)eResolveProxy(oldAdr);
			if (adr != oldAdr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iot_luaPackage.RUNTIME_DATA__ADR, oldAdr, adr));
			}
		}
		return adr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetAdr() {
		return adr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdr(Token newAdr) {
		Token oldAdr = adr;
		adr = newAdr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iot_luaPackage.RUNTIME_DATA__ADR, oldAdr, adr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iot_luaPackage.RUNTIME_DATA__ADR:
				if (resolve) return getAdr();
				return basicGetAdr();
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
			case Iot_luaPackage.RUNTIME_DATA__ADR:
				setAdr((Token)newValue);
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
			case Iot_luaPackage.RUNTIME_DATA__ADR:
				setAdr((Token)null);
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
			case Iot_luaPackage.RUNTIME_DATA__ADR:
				return adr != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeDataImpl
