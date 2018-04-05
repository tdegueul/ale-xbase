/**
 */
package basicFsmEnv.impl;

import basicFsmEnv.BasicFsmEnvPackage;
import basicFsmEnv.State;
import basicFsmEnv.Trans;
import basicFsmEnv.VarDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link basicFsmEnv.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link basicFsmEnv.impl.StateImpl#getIn <em>In</em>}</li>
 *   <li>{@link basicFsmEnv.impl.StateImpl#getOut <em>Out</em>}</li>
 *   <li>{@link basicFsmEnv.impl.StateImpl#getDecls <em>Decls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Trans> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Trans> out;

	/**
	 * The cached value of the '{@link #getDecls() <em>Decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDecl> decls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicFsmEnvPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicFsmEnvPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trans> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<Trans>(Trans.class, this, BasicFsmEnvPackage.STATE__IN, BasicFsmEnvPackage.TRANS__TGT);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trans> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<Trans>(Trans.class, this, BasicFsmEnvPackage.STATE__OUT, BasicFsmEnvPackage.TRANS__SRC);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDecl> getDecls() {
		if (decls == null) {
			decls = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, BasicFsmEnvPackage.STATE__DECLS);
		}
		return decls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicFsmEnvPackage.STATE__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
			case BasicFsmEnvPackage.STATE__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
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
			case BasicFsmEnvPackage.STATE__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case BasicFsmEnvPackage.STATE__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case BasicFsmEnvPackage.STATE__DECLS:
				return ((InternalEList<?>)getDecls()).basicRemove(otherEnd, msgs);
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
			case BasicFsmEnvPackage.STATE__NAME:
				return getName();
			case BasicFsmEnvPackage.STATE__IN:
				return getIn();
			case BasicFsmEnvPackage.STATE__OUT:
				return getOut();
			case BasicFsmEnvPackage.STATE__DECLS:
				return getDecls();
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
			case BasicFsmEnvPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case BasicFsmEnvPackage.STATE__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Trans>)newValue);
				return;
			case BasicFsmEnvPackage.STATE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Trans>)newValue);
				return;
			case BasicFsmEnvPackage.STATE__DECLS:
				getDecls().clear();
				getDecls().addAll((Collection<? extends VarDecl>)newValue);
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
			case BasicFsmEnvPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasicFsmEnvPackage.STATE__IN:
				getIn().clear();
				return;
			case BasicFsmEnvPackage.STATE__OUT:
				getOut().clear();
				return;
			case BasicFsmEnvPackage.STATE__DECLS:
				getDecls().clear();
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
			case BasicFsmEnvPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasicFsmEnvPackage.STATE__IN:
				return in != null && !in.isEmpty();
			case BasicFsmEnvPackage.STATE__OUT:
				return out != null && !out.isEmpty();
			case BasicFsmEnvPackage.STATE__DECLS:
				return decls != null && !decls.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
