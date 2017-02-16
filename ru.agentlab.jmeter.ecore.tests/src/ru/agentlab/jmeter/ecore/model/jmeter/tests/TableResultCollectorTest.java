/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Table Result Collector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableResultCollectorTest extends ResultCollectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableResultCollectorTest.class);
	}

	/**
	 * Constructs a new Table Result Collector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableResultCollectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Table Result Collector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TableResultCollector getFixture() {
		return (TableResultCollector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JmeterFactory.eINSTANCE.createTableResultCollector());
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

} //TableResultCollectorTest
