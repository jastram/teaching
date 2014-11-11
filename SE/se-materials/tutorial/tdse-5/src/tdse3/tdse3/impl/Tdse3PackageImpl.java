/**
 */
package tdse3.tdse3.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdse3.tdse3.CarLight;
import tdse3.tdse3.Controller;
import tdse3.tdse3.PedLight;
import tdse3.tdse3.Tdse3Factory;
import tdse3.tdse3.Tdse3Package;
import tdse3.tdse3.colors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tdse3PackageImpl extends EPackageImpl implements Tdse3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdse3.tdse3.Tdse3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tdse3PackageImpl() {
		super(eNS_URI, Tdse3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Tdse3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tdse3Package init() {
		if (isInited) return (Tdse3Package)EPackage.Registry.INSTANCE.getEPackage(Tdse3Package.eNS_URI);

		// Obtain or create and register package
		Tdse3PackageImpl theTdse3Package = (Tdse3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tdse3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tdse3PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTdse3Package.createPackageContents();

		// Initialize created meta-data
		theTdse3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTdse3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tdse3Package.eNS_URI, theTdse3Package);
		return theTdse3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_CarLight() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_PedLight() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getController__Tick() {
		return controllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarLight() {
		return carLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarLight_Colors() {
		return (EAttribute)carLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPedLight() {
		return pedLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPedLight_Colors() {
		return (EAttribute)pedLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcolors() {
		return colorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tdse3Factory getTdse3Factory() {
		return (Tdse3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__CAR_LIGHT);
		createEReference(controllerEClass, CONTROLLER__PED_LIGHT);
		createEOperation(controllerEClass, CONTROLLER___TICK);

		carLightEClass = createEClass(CAR_LIGHT);
		createEAttribute(carLightEClass, CAR_LIGHT__COLORS);

		pedLightEClass = createEClass(PED_LIGHT);
		createEAttribute(pedLightEClass, PED_LIGHT__COLORS);

		// Create enums
		colorsEEnum = createEEnum(COLORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_CarLight(), this.getCarLight(), null, "carLight", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_PedLight(), this.getPedLight(), null, "pedLight", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getController__Tick(), null, "tick", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(carLightEClass, CarLight.class, "CarLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarLight_Colors(), this.getcolors(), "colors", null, 0, 3, CarLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pedLightEClass, PedLight.class, "PedLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPedLight_Colors(), this.getcolors(), "colors", null, 0, 2, PedLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorsEEnum, colors.class, "colors");
		addEEnumLiteral(colorsEEnum, colors.RED);
		addEEnumLiteral(colorsEEnum, colors.YELLOW);
		addEEnumLiteral(colorsEEnum, colors.GREEN);

		// Create resource
		createResource(eNS_URI);
	}

} //Tdse3PackageImpl
