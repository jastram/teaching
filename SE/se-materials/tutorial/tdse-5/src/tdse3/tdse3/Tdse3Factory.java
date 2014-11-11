/**
 */
package tdse3.tdse3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdse3.tdse3.Tdse3Package
 * @generated
 */
public interface Tdse3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tdse3Factory eINSTANCE = tdse3.tdse3.impl.Tdse3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
	Controller createController();

	/**
	 * Returns a new object of class '<em>Car Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car Light</em>'.
	 * @generated
	 */
	CarLight createCarLight();

	/**
	 * Returns a new object of class '<em>Ped Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ped Light</em>'.
	 * @generated
	 */
	PedLight createPedLight();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tdse3Package getTdse3Package();

} //Tdse3Factory
