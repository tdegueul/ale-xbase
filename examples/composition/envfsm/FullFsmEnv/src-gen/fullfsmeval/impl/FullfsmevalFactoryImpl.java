/**
 */
package fullfsmeval.impl;

import fullfsmeval.*;

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
public class FullfsmevalFactoryImpl extends EFactoryImpl implements FullfsmevalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullfsmevalFactory init() {
		try {
			FullfsmevalFactory theFullfsmevalFactory = (FullfsmevalFactory)EPackage.Registry.INSTANCE.getEFactory(FullfsmevalPackage.eNS_URI);
			if (theFullfsmevalFactory != null) {
				return theFullfsmevalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FullfsmevalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmevalFactoryImpl() {
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
			case FullfsmevalPackage.ACTION_BIND_BLOCK: return createActionBindBlock();
			case FullfsmevalPackage.GUARD_BIND_EXP: return createGuardBindExp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBindBlock createActionBindBlock() {
		ActionBindBlockImpl actionBindBlock = new ActionBindBlockImpl();
		return actionBindBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardBindExp createGuardBindExp() {
		GuardBindExpImpl guardBindExp = new GuardBindExpImpl();
		return guardBindExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullfsmevalPackage getFullfsmevalPackage() {
		return (FullfsmevalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FullfsmevalPackage getPackage() {
		return FullfsmevalPackage.eINSTANCE;
	}

} //FullfsmevalFactoryImpl
