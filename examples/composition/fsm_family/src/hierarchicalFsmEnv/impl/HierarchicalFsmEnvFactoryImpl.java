/**
 */
package hierarchicalFsmEnv.impl;

import hierarchicalFsmEnv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalFsmEnvFactoryImpl extends EFactoryImpl implements HierarchicalFsmEnvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HierarchicalFsmEnvFactory init() {
		try {
			HierarchicalFsmEnvFactory theHierarchicalFsmEnvFactory = (HierarchicalFsmEnvFactory)EPackage.Registry.INSTANCE.getEFactory(HierarchicalFsmEnvPackage.eNS_URI);
			if (theHierarchicalFsmEnvFactory != null) {
				return theHierarchicalFsmEnvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HierarchicalFsmEnvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchicalFsmEnvFactoryImpl() {
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
			case HierarchicalFsmEnvPackage.COMPOSITE_STATE: return createCompositeState();
			case HierarchicalFsmEnvPackage.REGION: return createRegion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState createCompositeState() {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchicalFsmEnvPackage getHierarchicalFsmEnvPackage() {
		return (HierarchicalFsmEnvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HierarchicalFsmEnvPackage getPackage() {
		return HierarchicalFsmEnvPackage.eINSTANCE;
	}

} //HierarchicalFsmEnvFactoryImpl
