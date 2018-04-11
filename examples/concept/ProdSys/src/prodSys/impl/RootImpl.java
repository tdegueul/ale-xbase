/**
 */
package prodSys.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.ProdSysPackage;
import prodSys.Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSys.impl.RootImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link prodSys.impl.RootImpl#getConveyor <em>Conveyor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machine;

	/**
	 * The cached value of the '{@link #getConveyor() <em>Conveyor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyor()
	 * @generated
	 * @ordered
	 */
	protected EList<Conveyor> conveyor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachine() {
		if (machine == null) {
			machine = new EObjectContainmentEList<Machine>(Machine.class, this, ProdSysPackage.ROOT__MACHINE);
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conveyor> getConveyor() {
		if (conveyor == null) {
			conveyor = new EObjectContainmentEList<Conveyor>(Conveyor.class, this, ProdSysPackage.ROOT__CONVEYOR);
		}
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProdSysPackage.ROOT__MACHINE:
				return ((InternalEList<?>)getMachine()).basicRemove(otherEnd, msgs);
			case ProdSysPackage.ROOT__CONVEYOR:
				return ((InternalEList<?>)getConveyor()).basicRemove(otherEnd, msgs);
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
			case ProdSysPackage.ROOT__MACHINE:
				return getMachine();
			case ProdSysPackage.ROOT__CONVEYOR:
				return getConveyor();
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
			case ProdSysPackage.ROOT__MACHINE:
				getMachine().clear();
				getMachine().addAll((Collection<? extends Machine>)newValue);
				return;
			case ProdSysPackage.ROOT__CONVEYOR:
				getConveyor().clear();
				getConveyor().addAll((Collection<? extends Conveyor>)newValue);
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
			case ProdSysPackage.ROOT__MACHINE:
				getMachine().clear();
				return;
			case ProdSysPackage.ROOT__CONVEYOR:
				getConveyor().clear();
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
			case ProdSysPackage.ROOT__MACHINE:
				return machine != null && !machine.isEmpty();
			case ProdSysPackage.ROOT__CONVEYOR:
				return conveyor != null && !conveyor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
