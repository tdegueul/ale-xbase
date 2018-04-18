/**
 */
package typesLib;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see typesLib.TypesLibFactory
 * @model kind="package"
 * @generated
 */
public interface TypesLibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typesLib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/typesLib";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typesLib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesLibPackage eINSTANCE = typesLib.impl.TypesLibPackageImpl.init();

	/**
	 * The meta object id for the '{@link typesLib.impl.IntWrapperImpl <em>Int Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typesLib.impl.IntWrapperImpl
	 * @see typesLib.impl.TypesLibPackageImpl#getIntWrapper()
	 * @generated
	 */
	int INT_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_WRAPPER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Int Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_WRAPPER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Int Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_WRAPPER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link typesLib.IntWrapper <em>Int Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Wrapper</em>'.
	 * @see typesLib.IntWrapper
	 * @generated
	 */
	EClass getIntWrapper();

	/**
	 * Returns the meta object for the attribute '{@link typesLib.IntWrapper#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see typesLib.IntWrapper#getValue()
	 * @see #getIntWrapper()
	 * @generated
	 */
	EAttribute getIntWrapper_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesLibFactory getTypesLibFactory();

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
		 * The meta object literal for the '{@link typesLib.impl.IntWrapperImpl <em>Int Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typesLib.impl.IntWrapperImpl
		 * @see typesLib.impl.TypesLibPackageImpl#getIntWrapper()
		 * @generated
		 */
		EClass INT_WRAPPER = eINSTANCE.getIntWrapper();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_WRAPPER__VALUE = eINSTANCE.getIntWrapper_Value();

	}

} //TypesLibPackage
