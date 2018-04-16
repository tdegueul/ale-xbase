/**
 */
package ping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ping.Ping;
import ping.PingPackage;
import ping.Pong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ping.impl.PingImpl#getPong <em>Pong</em>}</li>
 *   <li>{@link ping.impl.PingImpl#getCptr <em>Cptr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PingImpl extends MinimalEObjectImpl.Container implements Ping {
	/**
	 * The cached value of the '{@link #getPong() <em>Pong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPong()
	 * @generated
	 * @ordered
	 */
	protected Pong pong;

	/**
	 * The default value of the '{@link #getCptr() <em>Cptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCptr()
	 * @generated
	 * @ordered
	 */
	protected static final int CPTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCptr() <em>Cptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCptr()
	 * @generated
	 * @ordered
	 */
	protected int cptr = CPTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PingPackage.Literals.PING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pong getPong() {
		return pong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPong(Pong newPong, NotificationChain msgs) {
		Pong oldPong = pong;
		pong = newPong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PingPackage.PING__PONG, oldPong, newPong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPong(Pong newPong) {
		if (newPong != pong) {
			NotificationChain msgs = null;
			if (pong != null)
				msgs = ((InternalEObject)pong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PingPackage.PING__PONG, null, msgs);
			if (newPong != null)
				msgs = ((InternalEObject)newPong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PingPackage.PING__PONG, null, msgs);
			msgs = basicSetPong(newPong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PingPackage.PING__PONG, newPong, newPong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCptr() {
		return cptr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCptr(int newCptr) {
		int oldCptr = cptr;
		cptr = newCptr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PingPackage.PING__CPTR, oldCptr, cptr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PingPackage.PING__PONG:
				return basicSetPong(null, msgs);
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
			case PingPackage.PING__PONG:
				return getPong();
			case PingPackage.PING__CPTR:
				return getCptr();
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
			case PingPackage.PING__PONG:
				setPong((Pong)newValue);
				return;
			case PingPackage.PING__CPTR:
				setCptr((Integer)newValue);
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
			case PingPackage.PING__PONG:
				setPong((Pong)null);
				return;
			case PingPackage.PING__CPTR:
				setCptr(CPTR_EDEFAULT);
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
			case PingPackage.PING__PONG:
				return pong != null;
			case PingPackage.PING__CPTR:
				return cptr != CPTR_EDEFAULT;
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
		result.append(" (cptr: ");
		result.append(cptr);
		result.append(')');
		return result.toString();
	}

} //PingImpl
