/**
 */
package ping;

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
 * @see ping.PingFactory
 * @model kind="package"
 * @generated
 */
public interface PingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PingPackage eINSTANCE = ping.impl.PingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ping.impl.PingImpl <em>Ping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ping.impl.PingImpl
	 * @see ping.impl.PingPackageImpl#getPing()
	 * @generated
	 */
	int PING = 0;

	/**
	 * The feature id for the '<em><b>Pong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING__PONG = 0;

	/**
	 * The feature id for the '<em><b>Cptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING__CPTR = 1;

	/**
	 * The number of structural features of the '<em>Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ping.Pong <em>Pong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ping.Pong
	 * @see ping.impl.PingPackageImpl#getPong()
	 * @generated
	 */
	int PONG = 1;

	/**
	 * The number of structural features of the '<em>Pong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PONG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ping.Ping <em>Ping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ping</em>'.
	 * @see ping.Ping
	 * @generated
	 */
	EClass getPing();

	/**
	 * Returns the meta object for the containment reference '{@link ping.Ping#getPong <em>Pong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pong</em>'.
	 * @see ping.Ping#getPong()
	 * @see #getPing()
	 * @generated
	 */
	EReference getPing_Pong();

	/**
	 * Returns the meta object for the attribute '{@link ping.Ping#getCptr <em>Cptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cptr</em>'.
	 * @see ping.Ping#getCptr()
	 * @see #getPing()
	 * @generated
	 */
	EAttribute getPing_Cptr();

	/**
	 * Returns the meta object for class '{@link ping.Pong <em>Pong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pong</em>'.
	 * @see ping.Pong
	 * @generated
	 */
	EClass getPong();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PingFactory getPingFactory();

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
		 * The meta object literal for the '{@link ping.impl.PingImpl <em>Ping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ping.impl.PingImpl
		 * @see ping.impl.PingPackageImpl#getPing()
		 * @generated
		 */
		EClass PING = eINSTANCE.getPing();

		/**
		 * The meta object literal for the '<em><b>Pong</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PING__PONG = eINSTANCE.getPing_Pong();

		/**
		 * The meta object literal for the '<em><b>Cptr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PING__CPTR = eINSTANCE.getPing_Cptr();

		/**
		 * The meta object literal for the '{@link ping.Pong <em>Pong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ping.Pong
		 * @see ping.impl.PingPackageImpl#getPong()
		 * @generated
		 */
		EClass PONG = eINSTANCE.getPong();

	}

} //PingPackage
