/**
 */
package activitydiagramruntime.impl;

import activitydiagramruntime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramruntimeFactoryImpl extends EFactoryImpl implements ActivitydiagramruntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitydiagramruntimeFactory init() {
		try {
			ActivitydiagramruntimeFactory theActivitydiagramruntimeFactory = (ActivitydiagramruntimeFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitydiagramruntimePackage.eNS_URI);
			if (theActivitydiagramruntimeFactory != null) {
				return theActivitydiagramruntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitydiagramruntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramruntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivitydiagramruntimePackage.OFFER: return createOffer();
			case ActivitydiagramruntimePackage.CONTEXT: return createContext();
			case ActivitydiagramruntimePackage.TRACE: return createTrace();
			case ActivitydiagramruntimePackage.CONTROL_TOKEN: return createControlToken();
			case ActivitydiagramruntimePackage.FORKED_TOKEN: return createForkedToken();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlToken createControlToken() {
		ControlTokenImpl controlToken = new ControlTokenImpl();
		return controlToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkedToken createForkedToken() {
		ForkedTokenImpl forkedToken = new ForkedTokenImpl();
		return forkedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramruntimePackage getActivitydiagramruntimePackage() {
		return (ActivitydiagramruntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitydiagramruntimePackage getPackage() {
		return ActivitydiagramruntimePackage.eINSTANCE;
	}

} //ActivitydiagramruntimeFactoryImpl
