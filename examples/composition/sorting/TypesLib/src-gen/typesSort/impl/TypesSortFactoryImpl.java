/**
 */
package typesSort.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import typesSort.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesSortFactoryImpl extends EFactoryImpl implements TypesSortFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesSortFactory init() {
		try {
			TypesSortFactory theTypesSortFactory = (TypesSortFactory)EPackage.Registry.INSTANCE.getEFactory(TypesSortPackage.eNS_URI);
			if (theTypesSortFactory != null) {
				return theTypesSortFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesSortFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSortFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesSortPackage.SORTABLE_BIND_INT_WRAPPER: return createSortableBindIntWrapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortableBindIntWrapper createSortableBindIntWrapper() {
		SortableBindIntWrapperImpl sortableBindIntWrapper = new SortableBindIntWrapperImpl();
		return sortableBindIntWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSortPackage getTypesSortPackage() {
		return (TypesSortPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesSortPackage getPackage() {
		return TypesSortPackage.eINSTANCE;
	}

} //TypesSortFactoryImpl
