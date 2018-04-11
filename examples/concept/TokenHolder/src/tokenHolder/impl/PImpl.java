/**
 */
package tokenHolder.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tokenHolder.H;
import tokenHolder.P;
import tokenHolder.TokenHolderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tokenHolder.impl.PImpl#getInHolders <em>In Holders</em>}</li>
 *   <li>{@link tokenHolder.impl.PImpl#getOutHolders <em>Out Holders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PImpl extends MinimalEObjectImpl.Container implements P {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TokenHolderPackage.Literals.P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H> getInHolders() {
		if (inHolders == null) {
			inHolders = new EObjectResolvingEList<H>(H.class, this, TokenHolderPackage.P__IN_HOLDERS);
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
			outHolders = new EObjectResolvingEList<H>(H.class, this, TokenHolderPackage.P__OUT_HOLDERS);
		}
		return outHolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TokenHolderPackage.P__IN_HOLDERS:
				return getInHolders();
			case TokenHolderPackage.P__OUT_HOLDERS:
				return getOutHolders();
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
			case TokenHolderPackage.P__IN_HOLDERS:
				getInHolders().clear();
				getInHolders().addAll((Collection<? extends H>)newValue);
				return;
			case TokenHolderPackage.P__OUT_HOLDERS:
				getOutHolders().clear();
				getOutHolders().addAll((Collection<? extends H>)newValue);
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
			case TokenHolderPackage.P__IN_HOLDERS:
				getInHolders().clear();
				return;
			case TokenHolderPackage.P__OUT_HOLDERS:
				getOutHolders().clear();
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
			case TokenHolderPackage.P__IN_HOLDERS:
				return inHolders != null && !inHolders.isEmpty();
			case TokenHolderPackage.P__OUT_HOLDERS:
				return outHolders != null && !outHolders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PImpl
