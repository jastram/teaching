/**
 */
package tdse3.tdse3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see tdse3.tdse3.Tdse3Factory
 * @model kind="package"
 * @generated
 */
public interface Tdse3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tdse3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tdse3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdse3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tdse3Package eINSTANCE = tdse3.tdse3.impl.Tdse3PackageImpl.init();

	/**
	 * The meta object id for the '{@link tdse3.tdse3.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdse3.tdse3.impl.ControllerImpl
	 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Car Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CAR_LIGHT = 0;

	/**
	 * The feature id for the '<em><b>Ped Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PED_LIGHT = 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Tick</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___TICK = 0;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tdse3.tdse3.impl.CarLightImpl <em>Car Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdse3.tdse3.impl.CarLightImpl
	 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getCarLight()
	 * @generated
	 */
	int CAR_LIGHT = 1;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT__COLORS = 0;

	/**
	 * The number of structural features of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Car Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdse3.tdse3.impl.PedLightImpl <em>Ped Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdse3.tdse3.impl.PedLightImpl
	 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getPedLight()
	 * @generated
	 */
	int PED_LIGHT = 2;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT__COLORS = 0;

	/**
	 * The number of structural features of the '<em>Ped Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ped Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PED_LIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdse3.tdse3.colors <em>colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdse3.tdse3.colors
	 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getcolors()
	 * @generated
	 */
	int COLORS = 3;


	/**
	 * Returns the meta object for class '{@link tdse3.tdse3.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see tdse3.tdse3.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference '{@link tdse3.tdse3.Controller#getCarLight <em>Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Car Light</em>'.
	 * @see tdse3.tdse3.Controller#getCarLight()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_CarLight();

	/**
	 * Returns the meta object for the containment reference '{@link tdse3.tdse3.Controller#getPedLight <em>Ped Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ped Light</em>'.
	 * @see tdse3.tdse3.Controller#getPedLight()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_PedLight();

	/**
	 * Returns the meta object for the '{@link tdse3.tdse3.Controller#tick() <em>Tick</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tick</em>' operation.
	 * @see tdse3.tdse3.Controller#tick()
	 * @generated
	 */
	EOperation getController__Tick();

	/**
	 * Returns the meta object for class '{@link tdse3.tdse3.CarLight <em>Car Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car Light</em>'.
	 * @see tdse3.tdse3.CarLight
	 * @generated
	 */
	EClass getCarLight();

	/**
	 * Returns the meta object for the attribute list '{@link tdse3.tdse3.CarLight#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Colors</em>'.
	 * @see tdse3.tdse3.CarLight#getColors()
	 * @see #getCarLight()
	 * @generated
	 */
	EAttribute getCarLight_Colors();

	/**
	 * Returns the meta object for class '{@link tdse3.tdse3.PedLight <em>Ped Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ped Light</em>'.
	 * @see tdse3.tdse3.PedLight
	 * @generated
	 */
	EClass getPedLight();

	/**
	 * Returns the meta object for the attribute list '{@link tdse3.tdse3.PedLight#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Colors</em>'.
	 * @see tdse3.tdse3.PedLight#getColors()
	 * @see #getPedLight()
	 * @generated
	 */
	EAttribute getPedLight_Colors();

	/**
	 * Returns the meta object for enum '{@link tdse3.tdse3.colors <em>colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>colors</em>'.
	 * @see tdse3.tdse3.colors
	 * @generated
	 */
	EEnum getcolors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tdse3Factory getTdse3Factory();

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
		 * The meta object literal for the '{@link tdse3.tdse3.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdse3.tdse3.impl.ControllerImpl
		 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Car Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__CAR_LIGHT = eINSTANCE.getController_CarLight();

		/**
		 * The meta object literal for the '<em><b>Ped Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PED_LIGHT = eINSTANCE.getController_PedLight();

		/**
		 * The meta object literal for the '<em><b>Tick</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___TICK = eINSTANCE.getController__Tick();

		/**
		 * The meta object literal for the '{@link tdse3.tdse3.impl.CarLightImpl <em>Car Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdse3.tdse3.impl.CarLightImpl
		 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getCarLight()
		 * @generated
		 */
		EClass CAR_LIGHT = eINSTANCE.getCarLight();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR_LIGHT__COLORS = eINSTANCE.getCarLight_Colors();

		/**
		 * The meta object literal for the '{@link tdse3.tdse3.impl.PedLightImpl <em>Ped Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdse3.tdse3.impl.PedLightImpl
		 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getPedLight()
		 * @generated
		 */
		EClass PED_LIGHT = eINSTANCE.getPedLight();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PED_LIGHT__COLORS = eINSTANCE.getPedLight_Colors();

		/**
		 * The meta object literal for the '{@link tdse3.tdse3.colors <em>colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdse3.tdse3.colors
		 * @see tdse3.tdse3.impl.Tdse3PackageImpl#getcolors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getcolors();

	}

} //Tdse3Package
