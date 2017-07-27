/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.IntegerValue;
import activitydiagram.IntegerVariable;
import activitydiagram.Value;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IntegerVariableImpl extends VariableImpl implements IntegerVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.INTEGER_VARIABLE;
	}

	IntegerValue currentValue = ActivitydiagramFactory.eINSTANCE.createIntegerValue();
	
	@Override
	public Value getCurrentValue() {
		return currentValue;
	}

	@Override
	public void setCurrentValue(Value value) {
		if(value instanceof IntegerValue) {
			IntegerValue integerValue = (IntegerValue) value;
			currentValue.setValue(integerValue.getValue());
		}
	}

} //IntegerVariableImpl
