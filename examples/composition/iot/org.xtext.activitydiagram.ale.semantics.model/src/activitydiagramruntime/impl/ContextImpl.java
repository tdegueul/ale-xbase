/**
 */
package activitydiagramruntime.impl;

import activitydiagram.Activity;
import activitydiagram.InputValue;
import activitydiagram.JoinNode;

import activitydiagramruntime.ActivitydiagramruntimePackage;
import activitydiagramruntime.Context;
import activitydiagramruntime.Trace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramruntime.impl.ContextImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link activitydiagramruntime.impl.ContextImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagramruntime.impl.ContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link activitydiagramruntime.impl.ContextImpl#getInputValues <em>Input Values</em>}</li>
 *   <li>{@link activitydiagramruntime.impl.ContextImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Trace output;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Context parent;

	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected EList<InputValue> inputValues;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected JoinNode node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramruntimePackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Trace)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramruntimePackage.CONTEXT__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Trace newOutput) {
		Trace oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramruntimePackage.CONTEXT__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramruntimePackage.CONTEXT__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramruntimePackage.CONTEXT__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Context)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramruntimePackage.CONTEXT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Context newParent) {
		Context oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramruntimePackage.CONTEXT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputValue> getInputValues() {
		if (inputValues == null) {
			inputValues = new EObjectResolvingEList<InputValue>(InputValue.class, this, ActivitydiagramruntimePackage.CONTEXT__INPUT_VALUES);
		}
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (JoinNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramruntimePackage.CONTEXT__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(JoinNode newNode) {
		JoinNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramruntimePackage.CONTEXT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramruntimePackage.CONTEXT__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case ActivitydiagramruntimePackage.CONTEXT__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ActivitydiagramruntimePackage.CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ActivitydiagramruntimePackage.CONTEXT__INPUT_VALUES:
				return getInputValues();
			case ActivitydiagramruntimePackage.CONTEXT__NODE:
				if (resolve) return getNode();
				return basicGetNode();
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
			case ActivitydiagramruntimePackage.CONTEXT__OUTPUT:
				setOutput((Trace)newValue);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__PARENT:
				setParent((Context)newValue);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__INPUT_VALUES:
				getInputValues().clear();
				getInputValues().addAll((Collection<? extends InputValue>)newValue);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__NODE:
				setNode((JoinNode)newValue);
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
			case ActivitydiagramruntimePackage.CONTEXT__OUTPUT:
				setOutput((Trace)null);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__ACTIVITY:
				setActivity((Activity)null);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__PARENT:
				setParent((Context)null);
				return;
			case ActivitydiagramruntimePackage.CONTEXT__INPUT_VALUES:
				getInputValues().clear();
				return;
			case ActivitydiagramruntimePackage.CONTEXT__NODE:
				setNode((JoinNode)null);
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
			case ActivitydiagramruntimePackage.CONTEXT__OUTPUT:
				return output != null;
			case ActivitydiagramruntimePackage.CONTEXT__ACTIVITY:
				return activity != null;
			case ActivitydiagramruntimePackage.CONTEXT__PARENT:
				return parent != null;
			case ActivitydiagramruntimePackage.CONTEXT__INPUT_VALUES:
				return inputValues != null && !inputValues.isEmpty();
			case ActivitydiagramruntimePackage.CONTEXT__NODE:
				return node != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
