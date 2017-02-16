/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.Timer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimerTest extends TestCase {

	/**
	 * The fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimerTest.class);
	}

	/**
	 * Constructs a new Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Timer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Timer getFixture() {
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
		setFixture(JmeterFactory.eINSTANCE.createTimer());
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

} //TimerTest
