/**
 */
package sortingAlgorithm;

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
 * @see sortingAlgorithm.SortingAlgorithmFactory
 * @model kind="package"
 * @generated
 */
public interface SortingAlgorithmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sortingAlgorithm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sortingAlgorithm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sortingAlgorithm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SortingAlgorithmPackage eINSTANCE = sortingAlgorithm.impl.SortingAlgorithmPackageImpl.init();

	/**
	 * The meta object id for the '{@link sortingAlgorithm.Sortable <em>Sortable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sortingAlgorithm.Sortable
	 * @see sortingAlgorithm.impl.SortingAlgorithmPackageImpl#getSortable()
	 * @generated
	 */
	int SORTABLE = 0;

	/**
	 * The number of structural features of the '<em>Sortable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sortable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sortingAlgorithm.Sortable <em>Sortable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortable</em>'.
	 * @see sortingAlgorithm.Sortable
	 * @generated
	 */
	EClass getSortable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SortingAlgorithmFactory getSortingAlgorithmFactory();

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
		 * The meta object literal for the '{@link sortingAlgorithm.Sortable <em>Sortable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sortingAlgorithm.Sortable
		 * @see sortingAlgorithm.impl.SortingAlgorithmPackageImpl#getSortable()
		 * @generated
		 */
		EClass SORTABLE = eINSTANCE.getSortable();

	}

} //SortingAlgorithmPackage
