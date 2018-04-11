/**
 */
package prodSysTokenHolder;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see prodSysTokenHolder.ProdSysTokenHolderPackage
 * @generated
 */
public interface ProdSysTokenHolderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProdSysTokenHolderFactory eINSTANCE = prodSysTokenHolder.impl.ProdSysTokenHolderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HBind Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HBind Conveyor</em>'.
	 * @generated
	 */
	HBindConveyor createHBindConveyor();

	/**
	 * Returns a new object of class '<em>RBind Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RBind Root</em>'.
	 * @generated
	 */
	RBindRoot createRBindRoot();

	/**
	 * Returns a new object of class '<em>PBind Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PBind Machine</em>'.
	 * @generated
	 */
	PBindMachine createPBindMachine();

	/**
	 * Returns a new object of class '<em>TBind Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBind Part</em>'.
	 * @generated
	 */
	TBindPart createTBindPart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProdSysTokenHolderPackage getProdSysTokenHolderPackage();

} //ProdSysTokenHolderFactory
