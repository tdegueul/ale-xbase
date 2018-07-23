/**
 */
package fullhierarchicalfsmeval.impl;

import fullhierarchicalfsmeval.*;

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
public class FullhierarchicalfsmevalFactoryImpl extends EFactoryImpl implements FullhierarchicalfsmevalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullhierarchicalfsmevalFactory init() {
		try {
			FullhierarchicalfsmevalFactory theFullhierarchicalfsmevalFactory = (FullhierarchicalfsmevalFactory)EPackage.Registry.INSTANCE.getEFactory(FullhierarchicalfsmevalPackage.eNS_URI);
			if (theFullhierarchicalfsmevalFactory != null) {
				return theFullhierarchicalfsmevalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FullhierarchicalfsmevalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullhierarchicalfsmevalFactoryImpl() {
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
			case FullhierarchicalfsmevalPackage.ACTION_BIND_BLOCK: return createActionBindBlock();
			case FullhierarchicalfsmevalPackage.GUARD_BIND_EXP: return createGuardBindExp();
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
	public FullhierarchicalfsmevalPackage getFullhierarchicalfsmevalPackage() {
		return (FullhierarchicalfsmevalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FullhierarchicalfsmevalPackage getPackage() {
		return FullhierarchicalfsmevalPackage.eINSTANCE;
	}

} //FullhierarchicalfsmevalFactoryImpl
