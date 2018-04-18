/**
 */
package sortingAlgorithm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sortingAlgorithm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SortingAlgorithmFactoryImpl extends EFactoryImpl implements SortingAlgorithmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingAlgorithmFactory init() {
		try {
			SortingAlgorithmFactory theSortingAlgorithmFactory = (SortingAlgorithmFactory)EPackage.Registry.INSTANCE.getEFactory(SortingAlgorithmPackage.eNS_URI);
			if (theSortingAlgorithmFactory != null) {
				return theSortingAlgorithmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SortingAlgorithmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingAlgorithmFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingAlgorithmPackage getSortingAlgorithmPackage() {
		return (SortingAlgorithmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SortingAlgorithmPackage getPackage() {
		return SortingAlgorithmPackage.eINSTANCE;
	}

} //SortingAlgorithmFactoryImpl
