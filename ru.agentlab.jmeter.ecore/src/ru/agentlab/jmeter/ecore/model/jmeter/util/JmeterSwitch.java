/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler;
import ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;
import ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.TestPlan;
import ru.agentlab.jmeter.ecore.model.jmeter.Timer;
import ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage
 * @generated
 */
public class JmeterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JmeterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmeterSwitch() {
		if (modelPackage == null) {
			modelPackage = JmeterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JmeterPackage.TEST_PLAN: {
				TestPlan testPlan = (TestPlan)theEObject;
				T result = caseTestPlan(testPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.TIMER: {
				Timer timer = (Timer)theEObject;
				T result = caseTimer(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.UNIFORM_RANDOM_TIMER: {
				UniformRandomTimer uniformRandomTimer = (UniformRandomTimer)theEObject;
				T result = caseUniformRandomTimer(uniformRandomTimer);
				if (result == null) result = caseTimer(uniformRandomTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.THREAD_GROUP: {
				ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup threadGroup = (ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup)theEObject;
				T result = caseThreadGroup(threadGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.ACCESS_LOG_SAMPLER: {
				AccessLogSampler accessLogSampler = (AccessLogSampler)theEObject;
				T result = caseAccessLogSampler(accessLogSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.RESULT_COLLECTOR: {
				ResultCollector resultCollector = (ResultCollector)theEObject;
				T result = caseResultCollector(resultCollector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.TABLE_RESULT_COLLECTOR: {
				TableResultCollector tableResultCollector = (TableResultCollector)theEObject;
				T result = caseTableResultCollector(tableResultCollector);
				if (result == null) result = caseResultCollector(tableResultCollector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.GRAPH_RESULT_COLLECTOR: {
				GraphResultCollector graphResultCollector = (GraphResultCollector)theEObject;
				T result = caseGraphResultCollector(graphResultCollector);
				if (result == null) result = caseResultCollector(graphResultCollector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JmeterPackage.STAT_RESULT_COLLECTOR: {
				StatResultCollector statResultCollector = (StatResultCollector)theEObject;
				T result = caseStatResultCollector(statResultCollector);
				if (result == null) result = caseResultCollector(statResultCollector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestPlan(TestPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Random Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Random Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniformRandomTimer(UniformRandomTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadGroup(ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Log Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Log Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLogSampler(AccessLogSampler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultCollector(ResultCollector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Result Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableResultCollector(TableResultCollector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Result Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphResultCollector(GraphResultCollector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stat Result Collector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stat Result Collector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatResultCollector(StatResultCollector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JmeterSwitch
