/**
 */
package pingpongsem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pingpongsem.PingpongsemPackage
 * @generated
 */
public interface PingpongsemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PingpongsemFactory eINSTANCE = pingpongsem.impl.PingpongsemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pong Bind PPong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pong Bind PPong</em>'.
	 * @generated
	 */
	PongBindPPong createPongBindPPong();

	/**
	 * Returns a new object of class '<em>PPing Bind Ping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPing Bind Ping</em>'.
	 * @generated
	 */
	PPingBindPing createPPingBindPing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PingpongsemPackage getPingpongsemPackage();

} //PingpongsemFactory
