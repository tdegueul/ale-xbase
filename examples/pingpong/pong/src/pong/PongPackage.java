/**
 */
package pong;

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
 * @see pong.PongFactory
 * @model kind="package"
 * @generated
 */
public interface PongPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pong";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pong";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pong";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PongPackage eINSTANCE = pong.impl.PongPackageImpl.init();

	/**
	 * The meta object id for the '{@link pong.impl.PPongImpl <em>PPong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pong.impl.PPongImpl
	 * @see pong.impl.PongPackageImpl#getPPong()
	 * @generated
	 */
	int PPONG = 0;

	/**
	 * The feature id for the '<em><b>Pping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPONG__PPING = 0;

	/**
	 * The number of structural features of the '<em>PPong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPONG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PPong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPONG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pong.PPing <em>PPing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pong.PPing
	 * @see pong.impl.PongPackageImpl#getPPing()
	 * @generated
	 */
	int PPING = 1;

	/**
	 * The number of structural features of the '<em>PPing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PPing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pong.PPong <em>PPong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPong</em>'.
	 * @see pong.PPong
	 * @generated
	 */
	EClass getPPong();

	/**
	 * Returns the meta object for the reference '{@link pong.PPong#getPping <em>Pping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pping</em>'.
	 * @see pong.PPong#getPping()
	 * @see #getPPong()
	 * @generated
	 */
	EReference getPPong_Pping();

	/**
	 * Returns the meta object for class '{@link pong.PPing <em>PPing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPing</em>'.
	 * @see pong.PPing
	 * @generated
	 */
	EClass getPPing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PongFactory getPongFactory();

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
		 * The meta object literal for the '{@link pong.impl.PPongImpl <em>PPong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pong.impl.PPongImpl
		 * @see pong.impl.PongPackageImpl#getPPong()
		 * @generated
		 */
		EClass PPONG = eINSTANCE.getPPong();

		/**
		 * The meta object literal for the '<em><b>Pping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PPONG__PPING = eINSTANCE.getPPong_Pping();

		/**
		 * The meta object literal for the '{@link pong.PPing <em>PPing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pong.PPing
		 * @see pong.impl.PongPackageImpl#getPPing()
		 * @generated
		 */
		EClass PPING = eINSTANCE.getPPing();

	}

} //PongPackage
