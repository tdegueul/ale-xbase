/**
 */
package simpleALEnv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleALEnv.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleALEnvFactoryImpl extends EFactoryImpl implements SimpleALEnvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleALEnvFactory init() {
		try {
			SimpleALEnvFactory theSimpleALEnvFactory = (SimpleALEnvFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleALEnvPackage.eNS_URI);
			if (theSimpleALEnvFactory != null) {
				return theSimpleALEnvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleALEnvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleALEnvFactoryImpl() {
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
			case SimpleALEnvPackage.BLOCK: return createBlock();
			case SimpleALEnvPackage.AL_VAR_REF: return createALVarRef();
			case SimpleALEnvPackage.ARITH_LIT: return createArithLit();
			case SimpleALEnvPackage.ARITH_PLUS: return createArithPlus();
			case SimpleALEnvPackage.ARITH_MINUS: return createArithMinus();
			case SimpleALEnvPackage.PRINT: return createPrint();
			case SimpleALEnvPackage.ASSIGN: return createAssign();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALVarRef createALVarRef() {
		ALVarRefImpl alVarRef = new ALVarRefImpl();
		return alVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithLit createArithLit() {
		ArithLitImpl arithLit = new ArithLitImpl();
		return arithLit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithPlus createArithPlus() {
		ArithPlusImpl arithPlus = new ArithPlusImpl();
		return arithPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithMinus createArithMinus() {
		ArithMinusImpl arithMinus = new ArithMinusImpl();
		return arithMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleALEnvPackage getSimpleALEnvPackage() {
		return (SimpleALEnvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleALEnvPackage getPackage() {
		return SimpleALEnvPackage.eINSTANCE;
	}

} //SimpleALEnvFactoryImpl
