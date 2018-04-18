/**
 */
package typesSort;

import sortingAlgorithm.Sortable;

import typesLib.IntWrapper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortable Bind Int Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typesSort.SortableBindIntWrapper#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see typesSort.TypesSortPackage#getSortableBindIntWrapper()
 * @model
 * @generated
 */
public interface SortableBindIntWrapper extends Sortable {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(IntWrapper)
	 * @see typesSort.TypesSortPackage#getSortableBindIntWrapper_Delegate()
	 * @model required="true"
	 * @generated
	 */
	IntWrapper getDelegate();

	/**
	 * Sets the value of the '{@link typesSort.SortableBindIntWrapper#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(IntWrapper value);

} // SortableBindIntWrapper
