/**
 */
package tokenHolder;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tokenHolder.TokenHolderFactory
 * @model kind="package"
 * @generated
 */
public interface TokenHolderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tokenHolder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tokenHolder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tokenHolder";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokenHolderPackage eINSTANCE = tokenHolder.impl.TokenHolderPackageImpl.init();

	/**
	 * The meta object id for the '{@link tokenHolder.H <em>H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tokenHolder.H
	 * @see tokenHolder.impl.TokenHolderPackageImpl#getH()
	 * @generated
	 */
	int H = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H__TOKENS = 0;

	/**
	 * The number of structural features of the '<em>H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tokenHolder.T <em>T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tokenHolder.T
	 * @see tokenHolder.impl.TokenHolderPackageImpl#getT()
	 * @generated
	 */
	int T = 1;

	/**
	 * The number of structural features of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tokenHolder.P <em>P</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tokenHolder.P
	 * @see tokenHolder.impl.TokenHolderPackageImpl#getP()
	 * @generated
	 */
	int P = 2;

	/**
	 * The feature id for the '<em><b>In Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__IN_HOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Out Holders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__OUT_HOLDERS = 1;

	/**
	 * The number of structural features of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>P</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link tokenHolder.R <em>R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tokenHolder.R
	 * @see tokenHolder.impl.TokenHolderPackageImpl#getR()
	 * @generated
	 */
	int R = 3;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R__H = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R__P = 1;

	/**
	 * The number of structural features of the '<em>R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int R_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tokenHolder.H <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H</em>'.
	 * @see tokenHolder.H
	 * @generated
	 */
	EClass getH();

	/**
	 * Returns the meta object for the containment reference list '{@link tokenHolder.H#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see tokenHolder.H#getTokens()
	 * @see #getH()
	 * @generated
	 */
	EReference getH_Tokens();

	/**
	 * Returns the meta object for class '{@link tokenHolder.T <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T</em>'.
	 * @see tokenHolder.T
	 * @generated
	 */
	EClass getT();

	/**
	 * Returns the meta object for class '{@link tokenHolder.P <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P</em>'.
	 * @see tokenHolder.P
	 * @generated
	 */
	EClass getP();

	/**
	 * Returns the meta object for the reference list '{@link tokenHolder.P#getInHolders <em>In Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Holders</em>'.
	 * @see tokenHolder.P#getInHolders()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_InHolders();

	/**
	 * Returns the meta object for the reference list '{@link tokenHolder.P#getOutHolders <em>Out Holders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Holders</em>'.
	 * @see tokenHolder.P#getOutHolders()
	 * @see #getP()
	 * @generated
	 */
	EReference getP_OutHolders();

	/**
	 * Returns the meta object for class '{@link tokenHolder.R <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>R</em>'.
	 * @see tokenHolder.R
	 * @generated
	 */
	EClass getR();

	/**
	 * Returns the meta object for the containment reference list '{@link tokenHolder.R#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H</em>'.
	 * @see tokenHolder.R#getH()
	 * @see #getR()
	 * @generated
	 */
	EReference getR_H();

	/**
	 * Returns the meta object for the containment reference list '{@link tokenHolder.R#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see tokenHolder.R#getP()
	 * @see #getR()
	 * @generated
	 */
	EReference getR_P();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokenHolderFactory getTokenHolderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tokenHolder.H <em>H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tokenHolder.H
		 * @see tokenHolder.impl.TokenHolderPackageImpl#getH()
		 * @generated
		 */
		EClass H = eINSTANCE.getH();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H__TOKENS = eINSTANCE.getH_Tokens();

		/**
		 * The meta object literal for the '{@link tokenHolder.T <em>T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tokenHolder.T
		 * @see tokenHolder.impl.TokenHolderPackageImpl#getT()
		 * @generated
		 */
		EClass T = eINSTANCE.getT();

		/**
		 * The meta object literal for the '{@link tokenHolder.P <em>P</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tokenHolder.P
		 * @see tokenHolder.impl.TokenHolderPackageImpl#getP()
		 * @generated
		 */
		EClass P = eINSTANCE.getP();

		/**
		 * The meta object literal for the '<em><b>In Holders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__IN_HOLDERS = eINSTANCE.getP_InHolders();

		/**
		 * The meta object literal for the '<em><b>Out Holders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P__OUT_HOLDERS = eINSTANCE.getP_OutHolders();

		/**
		 * The meta object literal for the '{@link tokenHolder.R <em>R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tokenHolder.R
		 * @see tokenHolder.impl.TokenHolderPackageImpl#getR()
		 * @generated
		 */
		EClass R = eINSTANCE.getR();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference R__H = eINSTANCE.getR_H();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference R__P = eINSTANCE.getR_P();

	}

} //TokenHolderPackage
