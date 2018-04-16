/**
 */
package basicFsmEnv.impl;

import basicFsmEnv.Action;
import basicFsmEnv.BasicFsmEnvPackage;
import basicFsmEnv.Guard;
import basicFsmEnv.State;
import basicFsmEnv.Trans;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link basicFsmEnv.impl.TransImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link basicFsmEnv.impl.TransImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link basicFsmEnv.impl.TransImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link basicFsmEnv.impl.TransImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link basicFsmEnv.impl.TransImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransImpl extends MinimalEObjectImpl.Container implements Trans {
	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected State tgt;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected State src;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicFsmEnvPackage.Literals.TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject)tgt;
			tgt = (State)eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicFsmEnvPackage.TRANS__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(State newTgt, NotificationChain msgs) {
		State oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__TGT, oldTgt, newTgt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgt(State newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject)tgt).eInverseRemove(this, BasicFsmEnvPackage.STATE__IN, State.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject)newTgt).eInverseAdd(this, BasicFsmEnvPackage.STATE__IN, State.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (State)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicFsmEnvPackage.TRANS__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(State newSrc, NotificationChain msgs) {
		State oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__SRC, oldSrc, newSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(State newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject)src).eInverseRemove(this, BasicFsmEnvPackage.STATE__OUT, State.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, BasicFsmEnvPackage.STATE__OUT, State.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (Guard)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicFsmEnvPackage.TRANS__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicFsmEnvPackage.TRANS__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.TRANS__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicFsmEnvPackage.TRANS__TGT:
				if (tgt != null)
					msgs = ((InternalEObject)tgt).eInverseRemove(this, BasicFsmEnvPackage.STATE__IN, State.class, msgs);
				return basicSetTgt((State)otherEnd, msgs);
			case BasicFsmEnvPackage.TRANS__SRC:
				if (src != null)
					msgs = ((InternalEObject)src).eInverseRemove(this, BasicFsmEnvPackage.STATE__OUT, State.class, msgs);
				return basicSetSrc((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicFsmEnvPackage.TRANS__TGT:
				return basicSetTgt(null, msgs);
			case BasicFsmEnvPackage.TRANS__SRC:
				return basicSetSrc(null, msgs);
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
			case BasicFsmEnvPackage.TRANS__TGT:
				if (resolve) return getTgt();
				return basicGetTgt();
			case BasicFsmEnvPackage.TRANS__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case BasicFsmEnvPackage.TRANS__EVENT:
				return getEvent();
			case BasicFsmEnvPackage.TRANS__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case BasicFsmEnvPackage.TRANS__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case BasicFsmEnvPackage.TRANS__TGT:
				setTgt((State)newValue);
				return;
			case BasicFsmEnvPackage.TRANS__SRC:
				setSrc((State)newValue);
				return;
			case BasicFsmEnvPackage.TRANS__EVENT:
				setEvent((String)newValue);
				return;
			case BasicFsmEnvPackage.TRANS__GUARD:
				setGuard((Guard)newValue);
				return;
			case BasicFsmEnvPackage.TRANS__ACTION:
				setAction((Action)newValue);
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
			case BasicFsmEnvPackage.TRANS__TGT:
				setTgt((State)null);
				return;
			case BasicFsmEnvPackage.TRANS__SRC:
				setSrc((State)null);
				return;
			case BasicFsmEnvPackage.TRANS__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case BasicFsmEnvPackage.TRANS__GUARD:
				setGuard((Guard)null);
				return;
			case BasicFsmEnvPackage.TRANS__ACTION:
				setAction((Action)null);
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
			case BasicFsmEnvPackage.TRANS__TGT:
				return tgt != null;
			case BasicFsmEnvPackage.TRANS__SRC:
				return src != null;
			case BasicFsmEnvPackage.TRANS__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
			case BasicFsmEnvPackage.TRANS__GUARD:
				return guard != null;
			case BasicFsmEnvPackage.TRANS__ACTION:
				return action != null;
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
		result.append(" (event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //TransImpl
