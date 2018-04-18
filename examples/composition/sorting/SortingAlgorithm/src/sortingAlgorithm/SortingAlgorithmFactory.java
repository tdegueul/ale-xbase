/**
 */
package sortingAlgorithm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sortingAlgorithm.SortingAlgorithmPackage
 * @generated
 */
public interface SortingAlgorithmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SortingAlgorithmFactory eINSTANCE = sortingAlgorithm.impl.SortingAlgorithmFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SortingAlgorithmPackage getSortingAlgorithmPackage();

} //SortingAlgorithmFactory
