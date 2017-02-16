/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getErrorOnSample <em>Error On Sample</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getThreadsCount <em>Threads Count</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getRampTime <em>Ramp Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDuration <em>Duration</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDelay <em>Delay</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getTimer <em>Timer</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getResultcollector <em>Resultcollector</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getAccesslogsampler <em>Accesslogsampler</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup()
 * @model
 * @generated
 */
public interface ThreadGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Error On Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error On Sample</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error On Sample</em>' attribute.
	 * @see #setErrorOnSample(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_ErrorOnSample()
	 * @model
	 * @generated
	 */
	String getErrorOnSample();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getErrorOnSample <em>Error On Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error On Sample</em>' attribute.
	 * @see #getErrorOnSample()
	 * @generated
	 */
	void setErrorOnSample(String value);

	/**
	 * Returns the value of the '<em><b>Threads Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads Count</em>' attribute.
	 * @see #setThreadsCount(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_ThreadsCount()
	 * @model
	 * @generated
	 */
	String getThreadsCount();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getThreadsCount <em>Threads Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threads Count</em>' attribute.
	 * @see #getThreadsCount()
	 * @generated
	 */
	void setThreadsCount(String value);

	/**
	 * Returns the value of the '<em><b>Ramp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp Time</em>' attribute.
	 * @see #setRampTime(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_RampTime()
	 * @model
	 * @generated
	 */
	String getRampTime();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getRampTime <em>Ramp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp Time</em>' attribute.
	 * @see #getRampTime()
	 * @generated
	 */
	void setRampTime(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(long)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_StartTime()
	 * @model
	 * @generated
	 */
	long getStartTime();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(long)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_EndTime()
	 * @model
	 * @generated
	 */
	long getEndTime();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_Delay()
	 * @model
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.jmeter.ecore.model.jmeter.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference list.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_Timer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Timer> getTimer();

	/**
	 * Returns the value of the '<em><b>Resultcollector</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultcollector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultcollector</em>' containment reference list.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_Resultcollector()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultCollector> getResultcollector();

	/**
	 * Returns the value of the '<em><b>Accesslogsampler</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesslogsampler</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesslogsampler</em>' containment reference list.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getThreadGroup_Accesslogsampler()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessLogSampler> getAccesslogsampler();

} // ThreadGroup
