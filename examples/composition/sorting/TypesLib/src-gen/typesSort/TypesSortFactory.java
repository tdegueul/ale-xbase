/**
 */
package typesSort;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see typesSort.TypesSortPackage
 * @generated
 */
public interface TypesSortFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesSortFactory eINSTANCE = typesSort.impl.TypesSortFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sortable Bind Int Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortable Bind Int Wrapper</em>'.
	 * @generated
	 */
	SortableBindIntWrapper createSortableBindIntWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesSortPackage getTypesSortPackage();

} //TypesSortFactory
