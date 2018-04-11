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

import prodSys.Root;

import prodSysTokenHolder.ProdSysTokenHolderPackage;
import prodSysTokenHolder.RBindRoot;

import tokenHolder.H;
import tokenHolder.P;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBind Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.impl.RBindRootImpl#getH <em>H</em>}</li>
 *   <li>{@link prodSysTokenHolder.impl.RBindRootImpl#getP <em>P</em>}</li>
 *   <li>{@link prodSysTokenHolder.impl.RBindRootImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBindRootImpl extends EObjectImpl implements RBindRoot {
	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected EList<H> h;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected EList<P> p;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Root delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBindRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysTokenHolderPackage.Literals.RBIND_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H> getH() {
		if (h == null) {
			h = new EObjectContainmentEList<H>(H.class, this, ProdSysTokenHolderPackage.RBIND_ROOT__H);
		}
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<P> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<P>(P.class, this, ProdSysTokenHolderPackage.RBIND_ROOT__P);
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Root)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Root newDelegate) {
		Root oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProdSysTokenHolderPackage.RBIND_ROOT__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case ProdSysTokenHolderPackage.RBIND_ROOT__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case ProdSysTokenHolderPackage.RBIND_ROOT__H:
				return getH();
			case ProdSysTokenHolderPackage.RBIND_ROOT__P:
				return getP();
			case ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE:
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
			case ProdSysTokenHolderPackage.RBIND_ROOT__H:
				getH().clear();
				getH().addAll((Collection<? extends H>)newValue);
				return;
			case ProdSysTokenHolderPackage.RBIND_ROOT__P:
				getP().clear();
				getP().addAll((Collection<? extends P>)newValue);
				return;
			case ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE:
				setDelegate((Root)newValue);
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
			case ProdSysTokenHolderPackage.RBIND_ROOT__H:
				getH().clear();
				return;
			case ProdSysTokenHolderPackage.RBIND_ROOT__P:
				getP().clear();
				return;
			case ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE:
				setDelegate((Root)null);
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
			case ProdSysTokenHolderPackage.RBIND_ROOT__H:
				return h != null && !h.isEmpty();
			case ProdSysTokenHolderPackage.RBIND_ROOT__P:
				return p != null && !p.isEmpty();
			case ProdSysTokenHolderPackage.RBIND_ROOT__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //RBindRootImpl
