/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Result Collector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultCollectorTest extends TestCase {

	/**
	 * The fixture for this Result Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultCollector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResultCollectorTest.class);
	}

	/**
	 * Constructs a new Result Collector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultCollectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Result Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResultCollector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Result Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultCollector getFixture() {
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
		setFixture(JmeterFactory.eINSTANCE.createResultCollector());
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

} //ResultCollectorTest
