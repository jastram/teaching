/**
 */
package tdse3.tdse3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdse3.tdse3.CarLight;
import tdse3.tdse3.Tdse3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Car Light</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarLightTest extends TestCase {

	/**
	 * The fixture for this Car Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLight fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarLightTest.class);
	}

	/**
	 * Constructs a new Car Light test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarLightTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Car Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CarLight fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Car Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLight getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Tdse3Factory.eINSTANCE.createCarLight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CarLightTest
