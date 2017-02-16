/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thread Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadGroupTest extends TestCase {

	/**
	 * The fixture for this Thread Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreadGroupTest.class);
	}

	/**
	 * Constructs a new Thread Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Thread Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Thread Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup getFixture() {
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
		setFixture(JmeterFactory.eINSTANCE.createThreadGroup());
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

} //ThreadGroupTest
