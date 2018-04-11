/**
 */
package prodSysTokenHolder.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import prodSysTokenHolder.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProdSysTokenHolderFactoryImpl extends EFactoryImpl implements ProdSysTokenHolderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProdSysTokenHolderFactory init() {
		try {
			ProdSysTokenHolderFactory theProdSysTokenHolderFactory = (ProdSysTokenHolderFactory)EPackage.Registry.INSTANCE.getEFactory(ProdSysTokenHolderPackage.eNS_URI);
			if (theProdSysTokenHolderFactory != null) {
				return theProdSysTokenHolderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProdSysTokenHolderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdSysTokenHolderFactoryImpl() {
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
			case ProdSysTokenHolderPackage.HBIND_CONVEYOR: return createHBindConveyor();
			case ProdSysTokenHolderPackage.RBIND_ROOT: return createRBindRoot();
			case ProdSysTokenHolderPackage.PBIND_MACHINE: return createPBindMachine();
			case ProdSysTokenHolderPackage.TBIND_PART: return createTBindPart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBindConveyor createHBindConveyor() {
		HBindConveyorImpl hBindConveyor = new HBindConveyorImpl();
		return hBindConveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBindRoot createRBindRoot() {
		RBindRootImpl rBindRoot = new RBindRootImpl();
		return rBindRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBindMachine createPBindMachine() {
		PBindMachineImpl pBindMachine = new PBindMachineImpl();
		return pBindMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBindPart createTBindPart() {
		TBindPartImpl tBindPart = new TBindPartImpl();
		return tBindPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdSysTokenHolderPackage getProdSysTokenHolderPackage() {
		return (ProdSysTokenHolderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProdSysTokenHolderPackage getPackage() {
		return ProdSysTokenHolderPackage.eINSTANCE;
	}

} //ProdSysTokenHolderFactoryImpl
