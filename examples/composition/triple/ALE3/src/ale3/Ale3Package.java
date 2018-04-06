/**
 */
package ale3;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ale3.Ale3Factory
 * @model kind="package"
 * @generated
 */
public interface Ale3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ale3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ale3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ale3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ale3Package eINSTANCE = ale3.impl.Ale3PackageImpl.init();

	/**
	 * The meta object id for the '{@link ale3.impl.C1Impl <em>C1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ale3.impl.C1Impl
	 * @see ale3.impl.Ale3PackageImpl#getC1()
	 * @generated
	 */
	int C1 = 0;

	/**
	 * The number of structural features of the '<em>C1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>C1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ale3.impl.C2Impl <em>C2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ale3.impl.C2Impl
	 * @see ale3.impl.Ale3PackageImpl#getC2()
	 * @generated
	 */
	int C2 = 1;

	/**
	 * The number of structural features of the '<em>C2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>C2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ale3.C1 <em>C1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C1</em>'.
	 * @see ale3.C1
	 * @generated
	 */
	EClass getC1();

	/**
	 * Returns the meta object for class '{@link ale3.C2 <em>C2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2</em>'.
	 * @see ale3.C2
	 * @generated
	 */
	EClass getC2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ale3Factory getAle3Factory();

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
		 * The meta object literal for the '{@link ale3.impl.C1Impl <em>C1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ale3.impl.C1Impl
		 * @see ale3.impl.Ale3PackageImpl#getC1()
		 * @generated
		 */
		EClass C1 = eINSTANCE.getC1();
		/**
		 * The meta object literal for the '{@link ale3.impl.C2Impl <em>C2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ale3.impl.C2Impl
		 * @see ale3.impl.Ale3PackageImpl#getC2()
		 * @generated
		 */
		EClass C2 = eINSTANCE.getC2();

	}

} //Ale3Package
