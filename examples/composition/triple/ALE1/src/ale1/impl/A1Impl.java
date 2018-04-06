/**
 */
package ale1.impl;

import ale1.A1;
import ale1.Ale1Package;
import ale1.RA1;
import ale1.RA2;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ale1.impl.A1Impl#getRa1 <em>Ra1</em>}</li>
 *   <li>{@link ale1.impl.A1Impl#getRa2 <em>Ra2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A1Impl extends MinimalEObjectImpl.Container implements A1 {
	/**
	 * The cached value of the '{@link #getRa1() <em>Ra1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRa1()
	 * @generated
	 * @ordered
	 */
	protected EList<RA1> ra1;

	/**
	 * The cached value of the '{@link #getRa2() <em>Ra2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRa2()
	 * @generated
	 * @ordered
	 */
	protected EList<RA2> ra2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ale1Package.Literals.A1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RA1> getRa1() {
		if (ra1 == null) {
			ra1 = new EObjectContainmentEList<RA1>(RA1.class, this, Ale1Package.A1__RA1);
		}
		return ra1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RA2> getRa2() {
		if (ra2 == null) {
			ra2 = new EObjectContainmentEList<RA2>(RA2.class, this, Ale1Package.A1__RA2);
		}
		return ra2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ale1Package.A1__RA1:
				return ((InternalEList<?>)getRa1()).basicRemove(otherEnd, msgs);
			case Ale1Package.A1__RA2:
				return ((InternalEList<?>)getRa2()).basicRemove(otherEnd, msgs);
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
			case Ale1Package.A1__RA1:
				return getRa1();
			case Ale1Package.A1__RA2:
				return getRa2();
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
			case Ale1Package.A1__RA1:
				getRa1().clear();
				getRa1().addAll((Collection<? extends RA1>)newValue);
				return;
			case Ale1Package.A1__RA2:
				getRa2().clear();
				getRa2().addAll((Collection<? extends RA2>)newValue);
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
			case Ale1Package.A1__RA1:
				getRa1().clear();
				return;
			case Ale1Package.A1__RA2:
				getRa2().clear();
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
			case Ale1Package.A1__RA1:
				return ra1 != null && !ra1.isEmpty();
			case Ale1Package.A1__RA2:
				return ra2 != null && !ra2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //A1Impl
