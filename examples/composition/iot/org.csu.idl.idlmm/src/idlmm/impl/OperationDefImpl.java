/**
 */
package idlmm.impl;

import idlmm.ExceptionDef;
import idlmm.IdlStmt;
import idlmm.IdlmmPackage;
import idlmm.OperationDef;
import idlmm.ParameterDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idlmm.impl.OperationDefImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link idlmm.impl.OperationDefImpl#isIsOneway <em>Is Oneway</em>}</li>
 *   <li>{@link idlmm.impl.OperationDefImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link idlmm.impl.OperationDefImpl#getCanRaise <em>Can Raise</em>}</li>
 *   <li>{@link idlmm.impl.OperationDefImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefImpl extends ContainedImpl implements OperationDef {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDef> parameters;

	/**
	 * The default value of the '{@link #isIsOneway() <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOneway()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ONEWAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOneway() <em>Is Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOneway()
	 * @generated
	 * @ordered
	 */
	protected boolean isOneway = IS_ONEWAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contexts;

	/**
	 * The cached value of the '{@link #getCanRaise() <em>Can Raise</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanRaise()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionDef> canRaise;

	/**
	 * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStmt()
	 * @generated
	 * @ordered
	 */
	protected IdlStmt stmt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdlmmPackage.Literals.OPERATION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDef> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDef>(ParameterDef.class, this, IdlmmPackage.OPERATION_DEF__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOneway() {
		return isOneway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOneway(boolean newIsOneway) {
		boolean oldIsOneway = isOneway;
		isOneway = newIsOneway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__IS_ONEWAY, oldIsOneway, isOneway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContexts() {
		if (contexts == null) {
			contexts = new EDataTypeUniqueEList<String>(String.class, this, IdlmmPackage.OPERATION_DEF__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionDef> getCanRaise() {
		if (canRaise == null) {
			canRaise = new EObjectResolvingEList<ExceptionDef>(ExceptionDef.class, this, IdlmmPackage.OPERATION_DEF__CAN_RAISE);
		}
		return canRaise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlStmt getStmt() {
		return stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStmt(IdlStmt newStmt, NotificationChain msgs) {
		IdlStmt oldStmt = stmt;
		stmt = newStmt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__STMT, oldStmt, newStmt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStmt(IdlStmt newStmt) {
		if (newStmt != stmt) {
			NotificationChain msgs = null;
			if (stmt != null)
				msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.OPERATION_DEF__STMT, null, msgs);
			if (newStmt != null)
				msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdlmmPackage.OPERATION_DEF__STMT, null, msgs);
			msgs = basicSetStmt(newStmt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdlmmPackage.OPERATION_DEF__STMT, newStmt, newStmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case IdlmmPackage.OPERATION_DEF__STMT:
				return basicSetStmt(null, msgs);
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
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return getParameters();
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				return isIsOneway();
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				return getContexts();
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				return getCanRaise();
			case IdlmmPackage.OPERATION_DEF__STMT:
				return getStmt();
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
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDef>)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				setIsOneway((Boolean)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends String>)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				getCanRaise().clear();
				getCanRaise().addAll((Collection<? extends ExceptionDef>)newValue);
				return;
			case IdlmmPackage.OPERATION_DEF__STMT:
				setStmt((IdlStmt)newValue);
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
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				getParameters().clear();
				return;
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				setIsOneway(IS_ONEWAY_EDEFAULT);
				return;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				getContexts().clear();
				return;
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				getCanRaise().clear();
				return;
			case IdlmmPackage.OPERATION_DEF__STMT:
				setStmt((IdlStmt)null);
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
			case IdlmmPackage.OPERATION_DEF__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case IdlmmPackage.OPERATION_DEF__IS_ONEWAY:
				return isOneway != IS_ONEWAY_EDEFAULT;
			case IdlmmPackage.OPERATION_DEF__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case IdlmmPackage.OPERATION_DEF__CAN_RAISE:
				return canRaise != null && !canRaise.isEmpty();
			case IdlmmPackage.OPERATION_DEF__STMT:
				return stmt != null;
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
		result.append(" (isOneway: ");
		result.append(isOneway);
		result.append(", contexts: ");
		result.append(contexts);
		result.append(')');
		return result.toString();
	}

} //OperationDefImpl
