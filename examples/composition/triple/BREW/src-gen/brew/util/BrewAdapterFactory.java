/**
 */
package brew.util;

import ale1.RA1;
import ale1.RA2;

import ale2.RB;

import brew.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see brew.BrewPackage
 * @generated
 */
public class BrewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BrewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BrewPackage.eINSTANCE;
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
	protected BrewSwitch<Adapter> modelSwitch =
		new BrewSwitch<Adapter>() {
			@Override
			public Adapter caseRA1BindB(RA1BindB object) {
				return createRA1BindBAdapter();
			}
			@Override
			public Adapter caseRA2BindC1(RA2BindC1 object) {
				return createRA2BindC1Adapter();
			}
			@Override
			public Adapter caseRBBindC1(RBBindC1 object) {
				return createRBBindC1Adapter();
			}
			@Override
			public Adapter caseRBBindC2(RBBindC2 object) {
				return createRBBindC2Adapter();
			}
			@Override
			public Adapter caseRA1(RA1 object) {
				return createRA1Adapter();
			}
			@Override
			public Adapter caseRA2(RA2 object) {
				return createRA2Adapter();
			}
			@Override
			public Adapter caseRB(RB object) {
				return createRBAdapter();
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
	 * Creates a new adapter for an object of class '{@link brew.RA1BindB <em>RA1 Bind B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brew.RA1BindB
	 * @generated
	 */
	public Adapter createRA1BindBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brew.RA2BindC1 <em>RA2 Bind C1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brew.RA2BindC1
	 * @generated
	 */
	public Adapter createRA2BindC1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brew.RBBindC1 <em>RB Bind C1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brew.RBBindC1
	 * @generated
	 */
	public Adapter createRBBindC1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brew.RBBindC2 <em>RB Bind C2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brew.RBBindC2
	 * @generated
	 */
	public Adapter createRBBindC2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ale1.RA1 <em>RA1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ale1.RA1
	 * @generated
	 */
	public Adapter createRA1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ale1.RA2 <em>RA2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ale1.RA2
	 * @generated
	 */
	public Adapter createRA2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ale2.RB <em>RB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ale2.RB
	 * @generated
	 */
	public Adapter createRBAdapter() {
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

} //BrewAdapterFactory
