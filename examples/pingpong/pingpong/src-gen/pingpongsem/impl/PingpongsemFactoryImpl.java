/**
 */
package pingpongsem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pingpongsem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PingpongsemFactoryImpl extends EFactoryImpl implements PingpongsemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PingpongsemFactory init() {
		try {
			PingpongsemFactory thePingpongsemFactory = (PingpongsemFactory)EPackage.Registry.INSTANCE.getEFactory(PingpongsemPackage.eNS_URI);
			if (thePingpongsemFactory != null) {
				return thePingpongsemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PingpongsemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PingpongsemFactoryImpl() {
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
			case PingpongsemPackage.PONG_BIND_PPONG: return createPongBindPPong();
			case PingpongsemPackage.PPING_BIND_PING: return createPPingBindPing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PongBindPPong createPongBindPPong() {
		PongBindPPongImpl pongBindPPong = new PongBindPPongImpl();
		return pongBindPPong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPingBindPing createPPingBindPing() {
		PPingBindPingImpl pPingBindPing = new PPingBindPingImpl();
		return pPingBindPing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PingpongsemPackage getPingpongsemPackage() {
		return (PingpongsemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PingpongsemPackage getPackage() {
		return PingpongsemPackage.eINSTANCE;
	}

} //PingpongsemFactoryImpl
