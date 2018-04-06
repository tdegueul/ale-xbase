/**
 */
package ale1;

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
 * @see ale1.Ale1Factory
 * @model kind="package"
 * @generated
 */
public interface Ale1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ale1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ale1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ale1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ale1Package eINSTANCE = ale1.impl.Ale1PackageImpl.init();

	/**
	 * The meta object id for the '{@link ale1.impl.A1Impl <em>A1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ale1.impl.A1Impl
	 * @see ale1.impl.Ale1PackageImpl#getA1()
	 * @generated
	 */
	int A1 = 0;

	/**
	 * The feature id for the '<em><b>Ra1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1__RA1 = 0;

	/**
	 * The feature id for the '<em><b>Ra2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1__RA2 = 1;

	/**
	 * The number of structural features of the '<em>A1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>A1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ale1.RA1 <em>RA1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ale1.RA1
	 * @see ale1.impl.Ale1PackageImpl#getRA1()
	 * @generated
	 */
	int RA1 = 1;

	/**
	 * The number of structural features of the '<em>RA1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>RA1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ale1.RA2 <em>RA2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ale1.RA2
	 * @see ale1.impl.Ale1PackageImpl#getRA2()
	 * @generated
	 */
	int RA2 = 2;

	/**
	 * The number of structural features of the '<em>RA2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>RA2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RA2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ale1.A1 <em>A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A1</em>'.
	 * @see ale1.A1
	 * @generated
	 */
	EClass getA1();

	/**
	 * Returns the meta object for the containment reference list '{@link ale1.A1#getRa1 <em>Ra1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ra1</em>'.
	 * @see ale1.A1#getRa1()
	 * @see #getA1()
	 * @generated
	 */
	EReference getA1_Ra1();

	/**
	 * Returns the meta object for the containment reference list '{@link ale1.A1#getRa2 <em>Ra2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ra2</em>'.
	 * @see ale1.A1#getRa2()
	 * @see #getA1()
	 * @generated
	 */
	EReference getA1_Ra2();

	/**
	 * Returns the meta object for class '{@link ale1.RA1 <em>RA1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RA1</em>'.
	 * @see ale1.RA1
	 * @generated
	 */
	EClass getRA1();

	/**
	 * Returns the meta object for class '{@link ale1.RA2 <em>RA2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RA2</em>'.
	 * @see ale1.RA2
	 * @generated
	 */
	EClass getRA2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ale1Factory getAle1Factory();

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
		 * The meta object literal for the '{@link ale1.impl.A1Impl <em>A1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ale1.impl.A1Impl
		 * @see ale1.impl.Ale1PackageImpl#getA1()
		 * @generated
		 */
		EClass A1 = eINSTANCE.getA1();

		/**
		 * The meta object literal for the '<em><b>Ra1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A1__RA1 = eINSTANCE.getA1_Ra1();

		/**
		 * The meta object literal for the '<em><b>Ra2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A1__RA2 = eINSTANCE.getA1_Ra2();

		/**
		 * The meta object literal for the '{@link ale1.RA1 <em>RA1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ale1.RA1
		 * @see ale1.impl.Ale1PackageImpl#getRA1()
		 * @generated
		 */
		EClass RA1 = eINSTANCE.getRA1();

		/**
		 * The meta object literal for the '{@link ale1.RA2 <em>RA2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ale1.RA2
		 * @see ale1.impl.Ale1PackageImpl#getRA2()
		 * @generated
		 */
		EClass RA2 = eINSTANCE.getRA2();

	}

} //Ale1Package
