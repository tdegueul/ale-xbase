/**
 */
package pingpongsem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ping.PingPackage;

import pong.PongPackage;

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
 * @see pingpongsem.PingpongsemFactory
 * @model kind="package"
 * @generated
 */
public interface PingpongsemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pingpongsem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pingpongsem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pingpongsem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PingpongsemPackage eINSTANCE = pingpongsem.impl.PingpongsemPackageImpl.init();

	/**
	 * The meta object id for the '{@link pingpongsem.impl.PongBindPPongImpl <em>Pong Bind PPong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pingpongsem.impl.PongBindPPongImpl
	 * @see pingpongsem.impl.PingpongsemPackageImpl#getPongBindPPong()
	 * @generated
	 */
	int PONG_BIND_PPONG = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_BIND_PPONG__DELEGATE = PingPackage.PONG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pong Bind PPong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_BIND_PPONG_FEATURE_COUNT = PingPackage.PONG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pong Bind PPong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_BIND_PPONG_OPERATION_COUNT = PingPackage.PONG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pingpongsem.impl.PPingBindPingImpl <em>PPing Bind Ping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pingpongsem.impl.PPingBindPingImpl
	 * @see pingpongsem.impl.PingpongsemPackageImpl#getPPingBindPing()
	 * @generated
	 */
	int PPING_BIND_PING = 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPING_BIND_PING__DELEGATE = PongPackage.PPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PPing Bind Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPING_BIND_PING_FEATURE_COUNT = PongPackage.PPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PPing Bind Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPING_BIND_PING_OPERATION_COUNT = PongPackage.PPING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pingpongsem.PongBindPPong <em>Pong Bind PPong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pong Bind PPong</em>'.
	 * @see pingpongsem.PongBindPPong
	 * @generated
	 */
	EClass getPongBindPPong();

	/**
	 * Returns the meta object for the reference '{@link pingpongsem.PongBindPPong#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see pingpongsem.PongBindPPong#getDelegate()
	 * @see #getPongBindPPong()
	 * @generated
	 */
	EReference getPongBindPPong_Delegate();

	/**
	 * Returns the meta object for class '{@link pingpongsem.PPingBindPing <em>PPing Bind Ping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPing Bind Ping</em>'.
	 * @see pingpongsem.PPingBindPing
	 * @generated
	 */
	EClass getPPingBindPing();

	/**
	 * Returns the meta object for the reference '{@link pingpongsem.PPingBindPing#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see pingpongsem.PPingBindPing#getDelegate()
	 * @see #getPPingBindPing()
	 * @generated
	 */
	EReference getPPingBindPing_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PingpongsemFactory getPingpongsemFactory();

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
		 * The meta object literal for the '{@link pingpongsem.impl.PongBindPPongImpl <em>Pong Bind PPong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pingpongsem.impl.PongBindPPongImpl
		 * @see pingpongsem.impl.PingpongsemPackageImpl#getPongBindPPong()
		 * @generated
		 */
		EClass PONG_BIND_PPONG = eINSTANCE.getPongBindPPong();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PONG_BIND_PPONG__DELEGATE = eINSTANCE.getPongBindPPong_Delegate();

		/**
		 * The meta object literal for the '{@link pingpongsem.impl.PPingBindPingImpl <em>PPing Bind Ping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pingpongsem.impl.PPingBindPingImpl
		 * @see pingpongsem.impl.PingpongsemPackageImpl#getPPingBindPing()
		 * @generated
		 */
		EClass PPING_BIND_PING = eINSTANCE.getPPingBindPing();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPING_BIND_PING__DELEGATE = eINSTANCE.getPPingBindPing_Delegate();

	}

} //PingpongsemPackage
