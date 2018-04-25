/**
 */
package composeabprint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import simplea.SimpleaPackage;

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
 * @see composeabprint.ComposeabprintFactory
 * @model kind="package"
 * @generated
 */
public interface ComposeabprintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "composeabprint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://composeabprint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "composeabprint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComposeabprintPackage eINSTANCE = composeabprint.impl.ComposeabprintPackageImpl.init();

	/**
	 * The meta object id for the '{@link composeabprint.impl.BBindB1Impl <em>BBind B1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composeabprint.impl.BBindB1Impl
	 * @see composeabprint.impl.ComposeabprintPackageImpl#getBBindB1()
	 * @generated
	 */
	int BBIND_B1 = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND_B1__DELEGATE = SimpleaPackage.B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BBind B1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND_B1_FEATURE_COUNT = SimpleaPackage.B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BBind B1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND_B1_OPERATION_COUNT = SimpleaPackage.B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link composeabprint.BBindB1 <em>BBind B1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBind B1</em>'.
	 * @see composeabprint.BBindB1
	 * @generated
	 */
	EClass getBBindB1();

	/**
	 * Returns the meta object for the reference '{@link composeabprint.BBindB1#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see composeabprint.BBindB1#getDelegate()
	 * @see #getBBindB1()
	 * @generated
	 */
	EReference getBBindB1_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComposeabprintFactory getComposeabprintFactory();

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
		 * The meta object literal for the '{@link composeabprint.impl.BBindB1Impl <em>BBind B1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composeabprint.impl.BBindB1Impl
		 * @see composeabprint.impl.ComposeabprintPackageImpl#getBBindB1()
		 * @generated
		 */
		EClass BBIND_B1 = eINSTANCE.getBBindB1();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIND_B1__DELEGATE = eINSTANCE.getBBindB1_Delegate();

	}

} //ComposeabprintPackage
