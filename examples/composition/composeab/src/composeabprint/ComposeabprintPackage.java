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
	 * The meta object id for the '{@link composeabprint.impl.BBindImpl <em>BBind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see composeabprint.impl.BBindImpl
	 * @see composeabprint.impl.ComposeabprintPackageImpl#getBBind()
	 * @generated
	 */
	int BBIND = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND__DELEGATE = SimpleaPackage.B_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BBind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND_FEATURE_COUNT = SimpleaPackage.B_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BBind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIND_OPERATION_COUNT = SimpleaPackage.B_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link composeabprint.BBind <em>BBind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBind</em>'.
	 * @see composeabprint.BBind
	 * @generated
	 */
	EClass getBBind();

	/**
	 * Returns the meta object for the reference '{@link composeabprint.BBind#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see composeabprint.BBind#getDelegate()
	 * @see #getBBind()
	 * @generated
	 */
	EReference getBBind_Delegate();

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
		 * The meta object literal for the '{@link composeabprint.impl.BBindImpl <em>BBind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see composeabprint.impl.BBindImpl
		 * @see composeabprint.impl.ComposeabprintPackageImpl#getBBind()
		 * @generated
		 */
		EClass BBIND = eINSTANCE.getBBind();
		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIND__DELEGATE = eINSTANCE.getBBind_Delegate();

	}

} //ComposeabprintPackage
