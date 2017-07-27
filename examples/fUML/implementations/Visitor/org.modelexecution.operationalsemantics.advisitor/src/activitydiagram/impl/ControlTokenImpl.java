/**
 */
package activitydiagram.impl;

import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ControlToken;
import activitydiagram.visitor.ActivityDiagramVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ControlTokenImpl extends TokenImpl implements ControlToken {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.CONTROL_TOKEN;
	}
	
	/**
	 * @generated NOT
	 */
	public <T> T accept(ActivityDiagramVisitor<T> visitor, Object ctx) {
		return visitor.visitControlToken(this,ctx);
	}

} //ControlTokenImpl
