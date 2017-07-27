/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.BooleanValue;
import activitydiagram.BooleanVariable;
import activitydiagram.Value;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BooleanVariableImpl extends VariableImpl implements BooleanVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.BOOLEAN_VARIABLE;
	}

	private BooleanValue currentValue = ActivitydiagramFactory.eINSTANCE.createBooleanValue();
	
	@Override
	public Value getCurrentValue() {
		return currentValue;
	}

	@Override
	public void setCurrentValue(Value value) {
		if(value instanceof BooleanValue) {
			BooleanValue booleanValue = (BooleanValue) value;
			currentValue.setValue(booleanValue.isValue());
		}
	}

} //BooleanVariableImpl
