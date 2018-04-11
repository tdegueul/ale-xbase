/**
 */
package prodSys.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.ProdSysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSys.impl.MachineImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link prodSys.impl.MachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link prodSys.impl.MachineImpl#getInC <em>In C</em>}</li>
 *   <li>{@link prodSys.impl.MachineImpl#getOutC <em>Out C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends MinimalEObjectImpl.Container implements Machine {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInC() <em>In C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInC()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> inC;

	/**
	 * The cached value of the '{@link #getOutC() <em>Out C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutC()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> outC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysPackage.MACHINE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysPackage.MACHINE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getInC() {
		if (inC == null) {
			inC = new EObjectWithInverseResolvingEList<Conveyor>(Conveyor.class, this, ProdSysPackage.MACHINE__IN_C, ProdSysPackage.CONVEYOR__OUT_M);
		}
		return inC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getOutC() {
		if (outC == null) {
			outC = new EObjectWithInverseResolvingEList<Conveyor>(Conveyor.class, this, ProdSysPackage.MACHINE__OUT_C, ProdSysPackage.CONVEYOR__IN_M);
		}
		return outC;
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
			case ProdSysPackage.MACHINE__IN_C:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInC()).basicAdd(otherEnd, msgs);
			case ProdSysPackage.MACHINE__OUT_C:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutC()).basicAdd(otherEnd, msgs);
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
			case ProdSysPackage.MACHINE__IN_C:
				return ((InternalEList<?>)getInC()).basicRemove(otherEnd, msgs);
			case ProdSysPackage.MACHINE__OUT_C:
				return ((InternalEList<?>)getOutC()).basicRemove(otherEnd, msgs);
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
			case ProdSysPackage.MACHINE__REF:
				return getRef();
			case ProdSysPackage.MACHINE__TYPE:
				return getType();
			case ProdSysPackage.MACHINE__IN_C:
				return getInC();
			case ProdSysPackage.MACHINE__OUT_C:
				return getOutC();
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
			case ProdSysPackage.MACHINE__REF:
				setRef((String)newValue);
				return;
			case ProdSysPackage.MACHINE__TYPE:
				setType((String)newValue);
				return;
			case ProdSysPackage.MACHINE__IN_C:
				getInC().clear();
				getInC().addAll((Collection<? extends Conveyor>)newValue);
				return;
			case ProdSysPackage.MACHINE__OUT_C:
				getOutC().clear();
				getOutC().addAll((Collection<? extends Conveyor>)newValue);
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
			case ProdSysPackage.MACHINE__REF:
				setRef(REF_EDEFAULT);
				return;
			case ProdSysPackage.MACHINE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProdSysPackage.MACHINE__IN_C:
				getInC().clear();
				return;
			case ProdSysPackage.MACHINE__OUT_C:
				getOutC().clear();
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
			case ProdSysPackage.MACHINE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case ProdSysPackage.MACHINE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ProdSysPackage.MACHINE__IN_C:
				return inC != null && !inC.isEmpty();
			case ProdSysPackage.MACHINE__OUT_C:
				return outC != null && !outC.isEmpty();
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
