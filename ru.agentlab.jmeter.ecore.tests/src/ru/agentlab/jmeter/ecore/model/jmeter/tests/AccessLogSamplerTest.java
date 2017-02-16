/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Access Log Sampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessLogSamplerTest extends TestCase {

	/**
	 * The fixture for this Access Log Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLogSampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccessLogSamplerTest.class);
	}

	/**
	 * Constructs a new Access Log Sampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLogSamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Access Log Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AccessLogSampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Access Log Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLogSampler getFixture() {
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
		setFixture(JmeterFactory.eINSTANCE.createAccessLogSampler());
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

} //AccessLogSamplerTest
