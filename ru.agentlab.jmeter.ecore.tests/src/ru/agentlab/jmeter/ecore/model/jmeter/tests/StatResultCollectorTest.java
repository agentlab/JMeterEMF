/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stat Result Collector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatResultCollectorTest extends ResultCollectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatResultCollectorTest.class);
	}

	/**
	 * Constructs a new Stat Result Collector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatResultCollectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stat Result Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StatResultCollector getFixture() {
		return (StatResultCollector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JmeterFactory.eINSTANCE.createStatResultCollector());
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

} //StatResultCollectorTest
