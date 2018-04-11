/**
 */
package prodSysTokenHolder.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prodSys.Conveyor;

import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.ProdSysTokenHolderPackage;

import tokenHolder.T;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBind Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.impl.HBindConveyorImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link prodSysTokenHolder.impl.HBindConveyorImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HBindConveyorImpl extends EObjectImpl implements HBindConveyor {
	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<T> tokens;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Conveyor delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBindConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysTokenHolderPackage.Literals.HBIND_CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<T>(T.class, this, ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Conveyor)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Conveyor newDelegate) {
		Conveyor oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
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
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS:
				return getTokens();
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends T>)newValue);
				return;
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE:
				setDelegate((Conveyor)newValue);
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
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS:
				getTokens().clear();
				return;
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE:
				setDelegate((Conveyor)null);
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
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //HBindConveyorImpl
