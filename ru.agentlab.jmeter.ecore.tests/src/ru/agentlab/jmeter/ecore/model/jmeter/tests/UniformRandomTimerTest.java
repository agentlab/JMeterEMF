/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uniform Random Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniformRandomTimerTest extends TimerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniformRandomTimerTest.class);
	}

	/**
	 * Constructs a new Uniform Random Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformRandomTimerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uniform Random Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniformRandomTimer getFixture() {
		return (UniformRandomTimer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JmeterFactory.eINSTANCE.createUniformRandomTimer());
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

} //UniformRandomTimerTest
