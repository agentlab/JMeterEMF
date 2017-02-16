/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.TestPlan;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Plan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPlanTest extends TestCase {

	/**
	 * The fixture for this Test Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestPlanTest.class);
	}

	/**
	 * Constructs a new Test Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Test Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TestPlan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Test Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlan getFixture() {
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
		setFixture(JmeterFactory.eINSTANCE.createTestPlan());
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

} //TestPlanTest
