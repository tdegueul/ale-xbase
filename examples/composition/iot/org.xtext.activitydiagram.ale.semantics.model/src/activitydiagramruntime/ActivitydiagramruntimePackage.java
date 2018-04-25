/**
 */
package activitydiagramruntime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activitydiagramruntime.ActivitydiagramruntimeFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramruntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagramruntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/activitydiagramruntime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagramruntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramruntimePackage eINSTANCE = activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.TokenImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.OfferImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 1;

	/**
	 * The feature id for the '<em><b>Offered Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFERED_TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.ContextImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INPUT_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NODE = 4;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.TraceImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 3;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__EXECUTED_NODES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.ControlTokenImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activitydiagramruntime.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activitydiagramruntime.impl.ForkedTokenImpl
	 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__HOLDER = TOKEN__HOLDER;

	/**
	 * The feature id for the '<em><b>Base Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__BASE_TOKEN = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remaining Offers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN__REMAINING_OFFERS_COUNT = TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see activitydiagramruntime.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see activitydiagramruntime.Token#getHolder()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Holder();

	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see activitydiagramruntime.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the containment reference list '{@link activitydiagramruntime.Offer#getOfferedTokens <em>Offered Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Tokens</em>'.
	 * @see activitydiagramruntime.Offer#getOfferedTokens()
	 * @see #getOffer()
	 * @generated
	 */
	EReference getOffer_OfferedTokens();

	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see activitydiagramruntime.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.Context#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see activitydiagramruntime.Context#getOutput()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Output();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.Context#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see activitydiagramruntime.Context#getActivity()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Activity();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.Context#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see activitydiagramruntime.Context#getParent()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Parent();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramruntime.Context#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Values</em>'.
	 * @see activitydiagramruntime.Context#getInputValues()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_InputValues();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.Context#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see activitydiagramruntime.Context#getNode()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Node();

	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see activitydiagramruntime.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link activitydiagramruntime.Trace#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Nodes</em>'.
	 * @see activitydiagramruntime.Trace#getExecutedNodes()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ExecutedNodes();

	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see activitydiagramruntime.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link activitydiagramruntime.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see activitydiagramruntime.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for the reference '{@link activitydiagramruntime.ForkedToken#getBaseToken <em>Base Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Token</em>'.
	 * @see activitydiagramruntime.ForkedToken#getBaseToken()
	 * @see #getForkedToken()
	 * @generated
	 */
	EReference getForkedToken_BaseToken();

	/**
	 * Returns the meta object for the attribute '{@link activitydiagramruntime.ForkedToken#getRemainingOffersCount <em>Remaining Offers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Offers Count</em>'.
	 * @see activitydiagramruntime.ForkedToken#getRemainingOffersCount()
	 * @see #getForkedToken()
	 * @generated
	 */
	EAttribute getForkedToken_RemainingOffersCount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramruntimeFactory getActivitydiagramruntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.TokenImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();
		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__HOLDER = eINSTANCE.getToken_Holder();
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.OfferImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();
		/**
		 * The meta object literal for the '<em><b>Offered Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER__OFFERED_TOKENS = eINSTANCE.getOffer_OfferedTokens();
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.ContextImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();
		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OUTPUT = eINSTANCE.getContext_Output();
		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ACTIVITY = eINSTANCE.getContext_Activity();
		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT = eINSTANCE.getContext_Parent();
		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INPUT_VALUES = eINSTANCE.getContext_InputValues();
		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__NODE = eINSTANCE.getContext_Node();
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.TraceImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();
		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__EXECUTED_NODES = eINSTANCE.getTrace_ExecutedNodes();
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.ControlTokenImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();
		/**
		 * The meta object literal for the '{@link activitydiagramruntime.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activitydiagramruntime.impl.ForkedTokenImpl
		 * @see activitydiagramruntime.impl.ActivitydiagramruntimePackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();
		/**
		 * The meta object literal for the '<em><b>Base Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_TOKEN__BASE_TOKEN = eINSTANCE.getForkedToken_BaseToken();
		/**
		 * The meta object literal for the '<em><b>Remaining Offers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORKED_TOKEN__REMAINING_OFFERS_COUNT = eINSTANCE.getForkedToken_RemainingOffersCount();

	}

} //ActivitydiagramruntimePackage
