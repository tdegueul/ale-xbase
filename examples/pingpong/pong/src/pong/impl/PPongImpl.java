/**
 */
package pong.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pong.PPing;
import pong.PPong;
import pong.PongPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PPong</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pong.impl.PPongImpl#getPping <em>Pping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPongImpl extends MinimalEObjectImpl.Container implements PPong {
	/**
	 * The cached value of the '{@link #getPping() <em>Pping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPping()
	 * @generated
	 * @ordered
	 */
	protected PPing pping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PPongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PongPackage.Literals.PPONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPing getPping() {
		if (pping != null && pping.eIsProxy()) {
			InternalEObject oldPping = (InternalEObject)pping;
			pping = (PPing)eResolveProxy(oldPping);
			if (pping != oldPping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PongPackage.PPONG__PPING, oldPping, pping));
			}
		}
		return pping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPing basicGetPping() {
		return pping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPping(PPing newPping) {
		PPing oldPping = pping;
		pping = newPping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PongPackage.PPONG__PPING, oldPping, pping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PongPackage.PPONG__PPING:
				if (resolve) return getPping();
				return basicGetPping();
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
			case PongPackage.PPONG__PPING:
				setPping((PPing)newValue);
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
			case PongPackage.PPONG__PPING:
				setPping((PPing)null);
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
			case PongPackage.PPONG__PPING:
				return pping != null;
		}
		return super.eIsSet(featureID);
	}

} //PPongImpl
