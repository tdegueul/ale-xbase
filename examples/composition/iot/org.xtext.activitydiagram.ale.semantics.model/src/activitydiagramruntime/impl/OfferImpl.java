/**
 */
package activitydiagramruntime.impl;

import activitydiagram.ActivityEdge;
import activitydiagramruntime.ActivitydiagramruntimePackage;
import activitydiagramruntime.Offer;
import activitydiagramruntime.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramruntime.impl.OfferImpl#getOfferedTokens <em>Offered Tokens</em>}</li>
 *   <li>{@link activitydiagramruntime.impl.OfferImpl#getOwned <em>Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfferImpl extends MinimalEObjectImpl.Container implements Offer {
	/**
	 * The cached value of the '{@link #getOfferedTokens() <em>Offered Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> offeredTokens;

	/**
	 * The cached value of the '{@link #getOwned() <em>Owned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned()
	 * @generated
	 * @ordered
	 */
	protected ActivityEdge owned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramruntimePackage.Literals.OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getOfferedTokens() {
		if (offeredTokens == null) {
			offeredTokens = new EObjectContainmentEList<Token>(Token.class, this, ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS);
		}
		return offeredTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge getOwned() {
		if (owned != null && owned.eIsProxy()) {
			InternalEObject oldOwned = (InternalEObject)owned;
			owned = (ActivityEdge)eResolveProxy(oldOwned);
			if (owned != oldOwned) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramruntimePackage.OFFER__OWNED, oldOwned, owned));
			}
		}
		return owned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge basicGetOwned() {
		return owned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwned(ActivityEdge newOwned) {
		ActivityEdge oldOwned = owned;
		owned = newOwned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramruntimePackage.OFFER__OWNED, oldOwned, owned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS:
				return ((InternalEList<?>)getOfferedTokens()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS:
				return getOfferedTokens();
			case ActivitydiagramruntimePackage.OFFER__OWNED:
				if (resolve) return getOwned();
				return basicGetOwned();
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
			case ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
				getOfferedTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case ActivitydiagramruntimePackage.OFFER__OWNED:
				setOwned((ActivityEdge)newValue);
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
			case ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS:
				getOfferedTokens().clear();
				return;
			case ActivitydiagramruntimePackage.OFFER__OWNED:
				setOwned((ActivityEdge)null);
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
			case ActivitydiagramruntimePackage.OFFER__OFFERED_TOKENS:
				return offeredTokens != null && !offeredTokens.isEmpty();
			case ActivitydiagramruntimePackage.OFFER__OWNED:
				return owned != null;
		}
		return super.eIsSet(featureID);
	}

} //OfferImpl
