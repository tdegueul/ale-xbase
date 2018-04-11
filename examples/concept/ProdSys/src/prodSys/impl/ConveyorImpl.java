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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import prodSys.Conveyor;
import prodSys.Machine;
import prodSys.Part;
import prodSys.ProdSysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prodSys.impl.ConveyorImpl#getOutM <em>Out M</em>}</li>
 *   <li>{@link prodSys.impl.ConveyorImpl#getInM <em>In M</em>}</li>
 *   <li>{@link prodSys.impl.ConveyorImpl#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends MinimalEObjectImpl.Container implements Conveyor {
	/**
	 * The cached value of the '{@link #getOutM() <em>Out M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutM()
	 * @generated
	 * @ordered
	 */
	protected Machine outM;
	/**
	 * The cached value of the '{@link #getInM() <em>In M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInM()
	 * @generated
	 * @ordered
	 */
	protected Machine inM;
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProdSysPackage.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getOutM() {
		if (outM != null && outM.eIsProxy()) {
			InternalEObject oldOutM = (InternalEObject)outM;
			outM = (Machine)eResolveProxy(oldOutM);
			if (outM != oldOutM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProdSysPackage.CONVEYOR__OUT_M, oldOutM, outM));
			}
		}
		return outM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetOutM() {
		return outM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutM(Machine newOutM, NotificationChain msgs) {
		Machine oldOutM = outM;
		outM = newOutM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProdSysPackage.CONVEYOR__OUT_M, oldOutM, newOutM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutM(Machine newOutM) {
		if (newOutM != outM) {
			NotificationChain msgs = null;
			if (outM != null)
				msgs = ((InternalEObject)outM).eInverseRemove(this, ProdSysPackage.MACHINE__IN_C, Machine.class, msgs);
			if (newOutM != null)
				msgs = ((InternalEObject)newOutM).eInverseAdd(this, ProdSysPackage.MACHINE__IN_C, Machine.class, msgs);
			msgs = basicSetOutM(newOutM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysPackage.CONVEYOR__OUT_M, newOutM, newOutM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getInM() {
		if (inM != null && inM.eIsProxy()) {
			InternalEObject oldInM = (InternalEObject)inM;
			inM = (Machine)eResolveProxy(oldInM);
			if (inM != oldInM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProdSysPackage.CONVEYOR__IN_M, oldInM, inM));
			}
		}
		return inM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetInM() {
		return inM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInM(Machine newInM, NotificationChain msgs) {
		Machine oldInM = inM;
		inM = newInM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProdSysPackage.CONVEYOR__IN_M, oldInM, newInM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInM(Machine newInM) {
		if (newInM != inM) {
			NotificationChain msgs = null;
			if (inM != null)
				msgs = ((InternalEObject)inM).eInverseRemove(this, ProdSysPackage.MACHINE__OUT_C, Machine.class, msgs);
			if (newInM != null)
				msgs = ((InternalEObject)newInM).eInverseAdd(this, ProdSysPackage.MACHINE__OUT_C, Machine.class, msgs);
			msgs = basicSetInM(newInM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProdSysPackage.CONVEYOR__IN_M, newInM, newInM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<Part>(Part.class, this, ProdSysPackage.CONVEYOR__PARTS, ProdSysPackage.PART__OWNER);
		}
		return parts;
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				if (outM != null)
					msgs = ((InternalEObject)outM).eInverseRemove(this, ProdSysPackage.MACHINE__IN_C, Machine.class, msgs);
				return basicSetOutM((Machine)otherEnd, msgs);
			case ProdSysPackage.CONVEYOR__IN_M:
				if (inM != null)
					msgs = ((InternalEObject)inM).eInverseRemove(this, ProdSysPackage.MACHINE__OUT_C, Machine.class, msgs);
				return basicSetInM((Machine)otherEnd, msgs);
			case ProdSysPackage.CONVEYOR__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				return basicSetOutM(null, msgs);
			case ProdSysPackage.CONVEYOR__IN_M:
				return basicSetInM(null, msgs);
			case ProdSysPackage.CONVEYOR__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				if (resolve) return getOutM();
				return basicGetOutM();
			case ProdSysPackage.CONVEYOR__IN_M:
				if (resolve) return getInM();
				return basicGetInM();
			case ProdSysPackage.CONVEYOR__PARTS:
				return getParts();
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				setOutM((Machine)newValue);
				return;
			case ProdSysPackage.CONVEYOR__IN_M:
				setInM((Machine)newValue);
				return;
			case ProdSysPackage.CONVEYOR__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				setOutM((Machine)null);
				return;
			case ProdSysPackage.CONVEYOR__IN_M:
				setInM((Machine)null);
				return;
			case ProdSysPackage.CONVEYOR__PARTS:
				getParts().clear();
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
			case ProdSysPackage.CONVEYOR__OUT_M:
				return outM != null;
			case ProdSysPackage.CONVEYOR__IN_M:
				return inM != null;
			case ProdSysPackage.CONVEYOR__PARTS:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConveyorImpl
