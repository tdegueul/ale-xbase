/**
 */
package simpleALEnv.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleALEnv.Assign;
import simpleALEnv.EqualityTest;
import simpleALEnv.IfStmt;
import simpleALEnv.SimpleALEnvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simpleALEnv.impl.IfStmtImpl#getIfBranch <em>If Branch</em>}</li>
 *   <li>{@link simpleALEnv.impl.IfStmtImpl#getElseBranch <em>Else Branch</em>}</li>
 *   <li>{@link simpleALEnv.impl.IfStmtImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtImpl extends StmtImpl implements IfStmt {
	/**
	 * The cached value of the '{@link #getIfBranch() <em>If Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBranch()
	 * @generated
	 * @ordered
	 */
	protected Assign ifBranch;

	/**
	 * The cached value of the '{@link #getElseBranch() <em>Else Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBranch()
	 * @generated
	 * @ordered
	 */
	protected Assign elseBranch;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EqualityTest test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleALEnvPackage.Literals.IF_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign getIfBranch() {
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBranch(Assign newIfBranch, NotificationChain msgs) {
		Assign oldIfBranch = ifBranch;
		ifBranch = newIfBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__IF_BRANCH, oldIfBranch, newIfBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBranch(Assign newIfBranch) {
		if (newIfBranch != ifBranch) {
			NotificationChain msgs = null;
			if (ifBranch != null)
				msgs = ((InternalEObject)ifBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__IF_BRANCH, null, msgs);
			if (newIfBranch != null)
				msgs = ((InternalEObject)newIfBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__IF_BRANCH, null, msgs);
			msgs = basicSetIfBranch(newIfBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__IF_BRANCH, newIfBranch, newIfBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign getElseBranch() {
		return elseBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBranch(Assign newElseBranch, NotificationChain msgs) {
		Assign oldElseBranch = elseBranch;
		elseBranch = newElseBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__ELSE_BRANCH, oldElseBranch, newElseBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBranch(Assign newElseBranch) {
		if (newElseBranch != elseBranch) {
			NotificationChain msgs = null;
			if (elseBranch != null)
				msgs = ((InternalEObject)elseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			if (newElseBranch != null)
				msgs = ((InternalEObject)newElseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__ELSE_BRANCH, null, msgs);
			msgs = basicSetElseBranch(newElseBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__ELSE_BRANCH, newElseBranch, newElseBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityTest getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest(EqualityTest newTest, NotificationChain msgs) {
		EqualityTest oldTest = test;
		test = newTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__TEST, oldTest, newTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(EqualityTest newTest) {
		if (newTest != test) {
			NotificationChain msgs = null;
			if (test != null)
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleALEnvPackage.IF_STMT__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleALEnvPackage.IF_STMT__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleALEnvPackage.IF_STMT__IF_BRANCH:
				return basicSetIfBranch(null, msgs);
			case SimpleALEnvPackage.IF_STMT__ELSE_BRANCH:
				return basicSetElseBranch(null, msgs);
			case SimpleALEnvPackage.IF_STMT__TEST:
				return basicSetTest(null, msgs);
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
			case SimpleALEnvPackage.IF_STMT__IF_BRANCH:
				return getIfBranch();
			case SimpleALEnvPackage.IF_STMT__ELSE_BRANCH:
				return getElseBranch();
			case SimpleALEnvPackage.IF_STMT__TEST:
				return getTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleALEnvPackage.IF_STMT__IF_BRANCH:
				setIfBranch((Assign)newValue);
				return;
			case SimpleALEnvPackage.IF_STMT__ELSE_BRANCH:
				setElseBranch((Assign)newValue);
				return;
			case SimpleALEnvPackage.IF_STMT__TEST:
				setTest((EqualityTest)newValue);
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
			case SimpleALEnvPackage.IF_STMT__IF_BRANCH:
				setIfBranch((Assign)null);
				return;
			case SimpleALEnvPackage.IF_STMT__ELSE_BRANCH:
				setElseBranch((Assign)null);
				return;
			case SimpleALEnvPackage.IF_STMT__TEST:
				setTest((EqualityTest)null);
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
			case SimpleALEnvPackage.IF_STMT__IF_BRANCH:
				return ifBranch != null;
			case SimpleALEnvPackage.IF_STMT__ELSE_BRANCH:
				return elseBranch != null;
			case SimpleALEnvPackage.IF_STMT__TEST:
				return test != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStmtImpl
