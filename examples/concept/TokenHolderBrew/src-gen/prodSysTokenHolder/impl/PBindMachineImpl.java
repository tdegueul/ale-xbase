/**
 */
package prodSysTokenHolder.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import prodSys.Machine;

import prodSysTokenHolder.PBindMachine;
import prodSysTokenHolder.ProdSysTokenHolderPackage;

import tokenHolder.H;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PBind Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSysTokenHolder.impl.PBindMachineImpl#getInHolders <em>In Holders</em>}</li>
 *   <li>{@link prodSysTokenHolder.impl.PBindMachineImpl#getOutHolders <em>Out Holders</em>}</li>
 *   <li>{@link prodSysTokenHolder.impl.PBindMachineImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PBindMachineImpl extends EObjectImpl implements PBindMachine {
	/**
	 * The cached value of the '{@link #getInHolders() <em>In Holders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<H> inHolders;

	/**
	 * The cached value of the '{@link #getOutHolders() <em>Out Holders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutHolders()
	 * @generated
	 * @ordered
	 */
	protected EList<H> outHolders;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Machine delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PBindMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysTokenHolderPackage.Literals.PBIND_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H> getInHolders() {
		if (inHolders == null) {
			inHolders = new EObjectResolvingEList<H>(H.class, this, ProdSysTokenHolderPackage.PBIND_MACHINE__IN_HOLDERS);
		}
		return inHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H> getOutHolders() {
		if (outHolders == null) {
			outHolders = new EObjectResolvingEList<H>(H.class, this, ProdSysTokenHolderPackage.PBIND_MACHINE__OUT_HOLDERS);
		}
		return outHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Machine)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(Machine newDelegate) {
		Machine oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProdSysTokenHolderPackage.PBIND_MACHINE__IN_HOLDERS:
				return getInHolders();
			case ProdSysTokenHolderPackage.PBIND_MACHINE__OUT_HOLDERS:
				return getOutHolders();
			case ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE:
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
			case ProdSysTokenHolderPackage.PBIND_MACHINE__IN_HOLDERS:
				getInHolders().clear();
				getInHolders().addAll((Collection<? extends H>)newValue);
				return;
			case ProdSysTokenHolderPackage.PBIND_MACHINE__OUT_HOLDERS:
				getOutHolders().clear();
				getOutHolders().addAll((Collection<? extends H>)newValue);
				return;
			case ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE:
				setDelegate((Machine)newValue);
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
			case ProdSysTokenHolderPackage.PBIND_MACHINE__IN_HOLDERS:
				getInHolders().clear();
				return;
			case ProdSysTokenHolderPackage.PBIND_MACHINE__OUT_HOLDERS:
				getOutHolders().clear();
				return;
			case ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE:
				setDelegate((Machine)null);
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
			case ProdSysTokenHolderPackage.PBIND_MACHINE__IN_HOLDERS:
				return inHolders != null && !inHolders.isEmpty();
			case ProdSysTokenHolderPackage.PBIND_MACHINE__OUT_HOLDERS:
				return outHolders != null && !outHolders.isEmpty();
			case ProdSysTokenHolderPackage.PBIND_MACHINE__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //PBindMachineImpl
