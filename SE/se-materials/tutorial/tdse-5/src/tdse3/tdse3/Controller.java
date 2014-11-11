/**
 */
package tdse3.tdse3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tdse3.tdse3.Controller#getCarLight <em>Car Light</em>}</li>
 *   <li>{@link tdse3.tdse3.Controller#getPedLight <em>Ped Light</em>}</li>
 * </ul>
 * </p>
 *
 * @see tdse3.tdse3.Tdse3Package#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Car Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Car Light</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car Light</em>' containment reference.
	 * @see #setCarLight(CarLight)
	 * @see tdse3.tdse3.Tdse3Package#getController_CarLight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CarLight getCarLight();

	/**
	 * Sets the value of the '{@link tdse3.tdse3.Controller#getCarLight <em>Car Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car Light</em>' containment reference.
	 * @see #getCarLight()
	 * @generated
	 */
	void setCarLight(CarLight value);

	/**
	 * Returns the value of the '<em><b>Ped Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ped Light</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ped Light</em>' containment reference.
	 * @see #setPedLight(PedLight)
	 * @see tdse3.tdse3.Tdse3Package#getController_PedLight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PedLight getPedLight();

	/**
	 * Sets the value of the '{@link tdse3.tdse3.Controller#getPedLight <em>Ped Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ped Light</em>' containment reference.
	 * @see #getPedLight()
	 * @generated
	 */
	void setPedLight(PedLight value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void tick();

} // Controller
