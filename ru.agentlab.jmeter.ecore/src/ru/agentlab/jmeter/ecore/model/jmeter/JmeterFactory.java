/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage
 * @generated
 */
public interface JmeterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JmeterFactory eINSTANCE = ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Plan</em>'.
	 * @generated
	 */
	TestPlan createTestPlan();

	/**
	 * Returns a new object of class '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer</em>'.
	 * @generated
	 */
	Timer createTimer();

	/**
	 * Returns a new object of class '<em>Uniform Random Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform Random Timer</em>'.
	 * @generated
	 */
	UniformRandomTimer createUniformRandomTimer();

	/**
	 * Returns a new object of class '<em>Thread Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Group</em>'.
	 * @generated
	 */
	ThreadGroup createThreadGroup();

	/**
	 * Returns a new object of class '<em>Access Log Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Log Sampler</em>'.
	 * @generated
	 */
	AccessLogSampler createAccessLogSampler();

	/**
	 * Returns a new object of class '<em>Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Collector</em>'.
	 * @generated
	 */
	ResultCollector createResultCollector();

	/**
	 * Returns a new object of class '<em>Table Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Result Collector</em>'.
	 * @generated
	 */
	TableResultCollector createTableResultCollector();

	/**
	 * Returns a new object of class '<em>Graph Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Result Collector</em>'.
	 * @generated
	 */
	GraphResultCollector createGraphResultCollector();

	/**
	 * Returns a new object of class '<em>Stat Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stat Result Collector</em>'.
	 * @generated
	 */
	StatResultCollector createStatResultCollector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JmeterPackage getJmeterPackage();

} //JmeterFactory
