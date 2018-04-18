/**
 */
package typesSort;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import sortingAlgorithm.SortingAlgorithmPackage;

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
 * @see typesSort.TypesSortFactory
 * @model kind="package"
 * @generated
 */
public interface TypesSortPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typesSort";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://typesSort";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typesSort";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesSortPackage eINSTANCE = typesSort.impl.TypesSortPackageImpl.init();

	/**
	 * The meta object id for the '{@link typesSort.impl.SortableBindIntWrapperImpl <em>Sortable Bind Int Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see typesSort.impl.SortableBindIntWrapperImpl
	 * @see typesSort.impl.TypesSortPackageImpl#getSortableBindIntWrapper()
	 * @generated
	 */
	int SORTABLE_BIND_INT_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTABLE_BIND_INT_WRAPPER__DELEGATE = SortingAlgorithmPackage.SORTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sortable Bind Int Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTABLE_BIND_INT_WRAPPER_FEATURE_COUNT = SortingAlgorithmPackage.SORTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sortable Bind Int Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTABLE_BIND_INT_WRAPPER_OPERATION_COUNT = SortingAlgorithmPackage.SORTABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link typesSort.SortableBindIntWrapper <em>Sortable Bind Int Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortable Bind Int Wrapper</em>'.
	 * @see typesSort.SortableBindIntWrapper
	 * @generated
	 */
	EClass getSortableBindIntWrapper();

	/**
	 * Returns the meta object for the reference '{@link typesSort.SortableBindIntWrapper#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see typesSort.SortableBindIntWrapper#getDelegate()
	 * @see #getSortableBindIntWrapper()
	 * @generated
	 */
	EReference getSortableBindIntWrapper_Delegate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesSortFactory getTypesSortFactory();

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
		 * The meta object literal for the '{@link typesSort.impl.SortableBindIntWrapperImpl <em>Sortable Bind Int Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see typesSort.impl.SortableBindIntWrapperImpl
		 * @see typesSort.impl.TypesSortPackageImpl#getSortableBindIntWrapper()
		 * @generated
		 */
		EClass SORTABLE_BIND_INT_WRAPPER = eINSTANCE.getSortableBindIntWrapper();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTABLE_BIND_INT_WRAPPER__DELEGATE = eINSTANCE.getSortableBindIntWrapper_Delegate();

	}

} //TypesSortPackage
