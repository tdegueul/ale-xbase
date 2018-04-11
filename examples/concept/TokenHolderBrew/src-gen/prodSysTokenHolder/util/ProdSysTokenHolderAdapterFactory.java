/**
 */
package prodSysTokenHolder.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import prodSysTokenHolder.*;

import tokenHolder.H;
import tokenHolder.P;
import tokenHolder.R;
import tokenHolder.T;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage
 * @generated
 */
public class ProdSysTokenHolderAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProdSysTokenHolderPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdSysTokenHolderAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProdSysTokenHolderPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdSysTokenHolderSwitch<Adapter> modelSwitch =
		new ProdSysTokenHolderSwitch<Adapter>() {
			@Override
			public Adapter caseHBindConveyor(HBindConveyor object) {
				return createHBindConveyorAdapter();
			}
			@Override
			public Adapter caseRBindRoot(RBindRoot object) {
				return createRBindRootAdapter();
			}
			@Override
			public Adapter casePBindMachine(PBindMachine object) {
				return createPBindMachineAdapter();
			}
			@Override
			public Adapter caseTBindPart(TBindPart object) {
				return createTBindPartAdapter();
			}
			@Override
			public Adapter caseH(H object) {
				return createHAdapter();
			}
			@Override
			public Adapter caseR(R object) {
				return createRAdapter();
			}
			@Override
			public Adapter caseP(P object) {
				return createPAdapter();
			}
			@Override
			public Adapter caseT(T object) {
				return createTAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link prodSysTokenHolder.HBindConveyor <em>HBind Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prodSysTokenHolder.HBindConveyor
	 * @generated
	 */
	public Adapter createHBindConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prodSysTokenHolder.RBindRoot <em>RBind Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prodSysTokenHolder.RBindRoot
	 * @generated
	 */
	public Adapter createRBindRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prodSysTokenHolder.PBindMachine <em>PBind Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prodSysTokenHolder.PBindMachine
	 * @generated
	 */
	public Adapter createPBindMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link prodSysTokenHolder.TBindPart <em>TBind Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see prodSysTokenHolder.TBindPart
	 * @generated
	 */
	public Adapter createTBindPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tokenHolder.H <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tokenHolder.H
	 * @generated
	 */
	public Adapter createHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tokenHolder.R <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tokenHolder.R
	 * @generated
	 */
	public Adapter createRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tokenHolder.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tokenHolder.P
	 * @generated
	 */
	public Adapter createPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tokenHolder.T <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tokenHolder.T
	 * @generated
	 */
	public Adapter createTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProdSysTokenHolderAdapterFactory
