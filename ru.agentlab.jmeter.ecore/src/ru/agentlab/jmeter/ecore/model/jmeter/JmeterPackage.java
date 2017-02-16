/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory
 * @model kind="package"
 * @generated
 */
public interface JmeterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jmeter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/jmeter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jmeter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JmeterPackage eINSTANCE = ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl <em>Test Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTestPlan()
	 * @generated
	 */
	int TEST_PLAN = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Is Functional Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN__IS_FUNCTIONAL_MODE = 1;

	/**
	 * The feature id for the '<em><b>Serialize Thread Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN__SERIALIZE_THREAD_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>User Defined Classpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN__USER_DEFINED_CLASSPATH = 3;

	/**
	 * The feature id for the '<em><b>Threadgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN__THREADGROUP = 4;

	/**
	 * The number of structural features of the '<em>Test Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Test Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TimerImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 1;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__DELAY = 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.UniformRandomTimerImpl <em>Uniform Random Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.UniformRandomTimerImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getUniformRandomTimer()
	 * @generated
	 */
	int UNIFORM_RANDOM_TIMER = 2;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_RANDOM_TIMER__DELAY = TIMER__DELAY;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_RANDOM_TIMER__RANGE = TIMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uniform Random Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_RANDOM_TIMER_FEATURE_COUNT = TIMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uniform Random Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_RANDOM_TIMER_OPERATION_COUNT = TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl <em>Thread Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getThreadGroup()
	 * @generated
	 */
	int THREAD_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Error On Sample</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ERROR_ON_SAMPLE = 0;

	/**
	 * The feature id for the '<em><b>Threads Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__THREADS_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Ramp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__RAMP_TIME = 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__START_TIME = 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__END_TIME = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__DELAY = 6;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__TIMER = 7;

	/**
	 * The feature id for the '<em><b>Resultcollector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__RESULTCOLLECTOR = 8;

	/**
	 * The feature id for the '<em><b>Accesslogsampler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP__ACCESSLOGSAMPLER = 9;

	/**
	 * The number of structural features of the '<em>Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Thread Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl <em>Access Log Sampler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getAccessLogSampler()
	 * @generated
	 */
	int ACCESS_LOG_SAMPLER = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Image Parsing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER__IMAGE_PARSING = 1;

	/**
	 * The feature id for the '<em><b>Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER__LOG_FILE = 2;

	/**
	 * The feature id for the '<em><b>Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Port String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER__PORT_STRING = 4;

	/**
	 * The number of structural features of the '<em>Access Log Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Access Log Sampler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_SAMPLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ResultCollectorImpl <em>Result Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.ResultCollectorImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getResultCollector()
	 * @generated
	 */
	int RESULT_COLLECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_COLLECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_COLLECTOR__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_COLLECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_COLLECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TableResultCollectorImpl <em>Table Result Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TableResultCollectorImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTableResultCollector()
	 * @generated
	 */
	int TABLE_RESULT_COLLECTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RESULT_COLLECTOR__NAME = RESULT_COLLECTOR__NAME;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RESULT_COLLECTOR__FILE_NAME = RESULT_COLLECTOR__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Table Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RESULT_COLLECTOR_FEATURE_COUNT = RESULT_COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_RESULT_COLLECTOR_OPERATION_COUNT = RESULT_COLLECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.GraphResultCollectorImpl <em>Graph Result Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.GraphResultCollectorImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getGraphResultCollector()
	 * @generated
	 */
	int GRAPH_RESULT_COLLECTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RESULT_COLLECTOR__NAME = RESULT_COLLECTOR__NAME;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RESULT_COLLECTOR__FILE_NAME = RESULT_COLLECTOR__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Graph Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RESULT_COLLECTOR_FEATURE_COUNT = RESULT_COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_RESULT_COLLECTOR_OPERATION_COUNT = RESULT_COLLECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.StatResultCollectorImpl <em>Stat Result Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.StatResultCollectorImpl
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getStatResultCollector()
	 * @generated
	 */
	int STAT_RESULT_COLLECTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_RESULT_COLLECTOR__NAME = RESULT_COLLECTOR__NAME;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_RESULT_COLLECTOR__FILE_NAME = RESULT_COLLECTOR__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Stat Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_RESULT_COLLECTOR_FEATURE_COUNT = RESULT_COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stat Result Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_RESULT_COLLECTOR_OPERATION_COUNT = RESULT_COLLECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan <em>Test Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Plan</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan
	 * @generated
	 */
	EClass getTestPlan();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getComments()
	 * @see #getTestPlan()
	 * @generated
	 */
	EAttribute getTestPlan_Comments();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isIsFunctionalMode <em>Is Functional Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Functional Mode</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isIsFunctionalMode()
	 * @see #getTestPlan()
	 * @generated
	 */
	EAttribute getTestPlan_IsFunctionalMode();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isSerializeThreadGroups <em>Serialize Thread Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialize Thread Groups</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isSerializeThreadGroups()
	 * @see #getTestPlan()
	 * @generated
	 */
	EAttribute getTestPlan_SerializeThreadGroups();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getUserDefinedClasspath <em>User Defined Classpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Defined Classpath</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getUserDefinedClasspath()
	 * @see #getTestPlan()
	 * @generated
	 */
	EAttribute getTestPlan_UserDefinedClasspath();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getThreadgroup <em>Threadgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threadgroup</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getThreadgroup()
	 * @see #getTestPlan()
	 * @generated
	 */
	EReference getTestPlan_Threadgroup();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.Timer#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.Timer#getDelay()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_Delay();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer <em>Uniform Random Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Random Timer</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer
	 * @generated
	 */
	EClass getUniformRandomTimer();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer#getRange()
	 * @see #getUniformRandomTimer()
	 * @generated
	 */
	EAttribute getUniformRandomTimer_Range();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup <em>Thread Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Group</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup
	 * @generated
	 */
	EClass getThreadGroup();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getErrorOnSample <em>Error On Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error On Sample</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getErrorOnSample()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_ErrorOnSample();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getThreadsCount <em>Threads Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threads Count</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getThreadsCount()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_ThreadsCount();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getRampTime <em>Ramp Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ramp Time</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getRampTime()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_RampTime();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getStartTime()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getEndTime()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDuration()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_Duration();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getDelay()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EAttribute getThreadGroup_Delay();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timer</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getTimer()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EReference getThreadGroup_Timer();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getResultcollector <em>Resultcollector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resultcollector</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getResultcollector()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EReference getThreadGroup_Resultcollector();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getAccesslogsampler <em>Accesslogsampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accesslogsampler</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup#getAccesslogsampler()
	 * @see #getThreadGroup()
	 * @generated
	 */
	EReference getThreadGroup_Accesslogsampler();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler <em>Access Log Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Log Sampler</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler
	 * @generated
	 */
	EClass getAccessLogSampler();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getDomain()
	 * @see #getAccessLogSampler()
	 * @generated
	 */
	EAttribute getAccessLogSampler_Domain();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#isImageParsing <em>Image Parsing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Parsing</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#isImageParsing()
	 * @see #getAccessLogSampler()
	 * @generated
	 */
	EAttribute getAccessLogSampler_ImageParsing();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getLogFile <em>Log File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log File</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getLogFile()
	 * @see #getAccessLogSampler()
	 * @generated
	 */
	EAttribute getAccessLogSampler_LogFile();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getParserClassName <em>Parser Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parser Class Name</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getParserClassName()
	 * @see #getAccessLogSampler()
	 * @generated
	 */
	EAttribute getAccessLogSampler_ParserClassName();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getPortString <em>Port String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port String</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getPortString()
	 * @see #getAccessLogSampler()
	 * @generated
	 */
	EAttribute getAccessLogSampler_PortString();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector <em>Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Collector</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector
	 * @generated
	 */
	EClass getResultCollector();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getName()
	 * @see #getResultCollector()
	 * @generated
	 */
	EAttribute getResultCollector_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getFileName()
	 * @see #getResultCollector()
	 * @generated
	 */
	EAttribute getResultCollector_FileName();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector <em>Table Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Result Collector</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector
	 * @generated
	 */
	EClass getTableResultCollector();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector <em>Graph Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Result Collector</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector
	 * @generated
	 */
	EClass getGraphResultCollector();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector <em>Stat Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stat Result Collector</em>'.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector
	 * @generated
	 */
	EClass getStatResultCollector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JmeterFactory getJmeterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl <em>Test Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTestPlan()
		 * @generated
		 */
		EClass TEST_PLAN = eINSTANCE.getTestPlan();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PLAN__COMMENTS = eINSTANCE.getTestPlan_Comments();

		/**
		 * The meta object literal for the '<em><b>Is Functional Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PLAN__IS_FUNCTIONAL_MODE = eINSTANCE.getTestPlan_IsFunctionalMode();

		/**
		 * The meta object literal for the '<em><b>Serialize Thread Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PLAN__SERIALIZE_THREAD_GROUPS = eINSTANCE.getTestPlan_SerializeThreadGroups();

		/**
		 * The meta object literal for the '<em><b>User Defined Classpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PLAN__USER_DEFINED_CLASSPATH = eINSTANCE.getTestPlan_UserDefinedClasspath();

		/**
		 * The meta object literal for the '<em><b>Threadgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_PLAN__THREADGROUP = eINSTANCE.getTestPlan_Threadgroup();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TimerImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__DELAY = eINSTANCE.getTimer_Delay();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.UniformRandomTimerImpl <em>Uniform Random Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.UniformRandomTimerImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getUniformRandomTimer()
		 * @generated
		 */
		EClass UNIFORM_RANDOM_TIMER = eINSTANCE.getUniformRandomTimer();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_RANDOM_TIMER__RANGE = eINSTANCE.getUniformRandomTimer_Range();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl <em>Thread Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getThreadGroup()
		 * @generated
		 */
		EClass THREAD_GROUP = eINSTANCE.getThreadGroup();

		/**
		 * The meta object literal for the '<em><b>Error On Sample</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__ERROR_ON_SAMPLE = eINSTANCE.getThreadGroup_ErrorOnSample();

		/**
		 * The meta object literal for the '<em><b>Threads Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__THREADS_COUNT = eINSTANCE.getThreadGroup_ThreadsCount();

		/**
		 * The meta object literal for the '<em><b>Ramp Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__RAMP_TIME = eINSTANCE.getThreadGroup_RampTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__START_TIME = eINSTANCE.getThreadGroup_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__END_TIME = eINSTANCE.getThreadGroup_EndTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__DURATION = eINSTANCE.getThreadGroup_Duration();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_GROUP__DELAY = eINSTANCE.getThreadGroup_Delay();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_GROUP__TIMER = eINSTANCE.getThreadGroup_Timer();

		/**
		 * The meta object literal for the '<em><b>Resultcollector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_GROUP__RESULTCOLLECTOR = eINSTANCE.getThreadGroup_Resultcollector();

		/**
		 * The meta object literal for the '<em><b>Accesslogsampler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD_GROUP__ACCESSLOGSAMPLER = eINSTANCE.getThreadGroup_Accesslogsampler();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl <em>Access Log Sampler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getAccessLogSampler()
		 * @generated
		 */
		EClass ACCESS_LOG_SAMPLER = eINSTANCE.getAccessLogSampler();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG_SAMPLER__DOMAIN = eINSTANCE.getAccessLogSampler_Domain();

		/**
		 * The meta object literal for the '<em><b>Image Parsing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG_SAMPLER__IMAGE_PARSING = eINSTANCE.getAccessLogSampler_ImageParsing();

		/**
		 * The meta object literal for the '<em><b>Log File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG_SAMPLER__LOG_FILE = eINSTANCE.getAccessLogSampler_LogFile();

		/**
		 * The meta object literal for the '<em><b>Parser Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME = eINSTANCE.getAccessLogSampler_ParserClassName();

		/**
		 * The meta object literal for the '<em><b>Port String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG_SAMPLER__PORT_STRING = eINSTANCE.getAccessLogSampler_PortString();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ResultCollectorImpl <em>Result Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.ResultCollectorImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getResultCollector()
		 * @generated
		 */
		EClass RESULT_COLLECTOR = eINSTANCE.getResultCollector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_COLLECTOR__NAME = eINSTANCE.getResultCollector_Name();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_COLLECTOR__FILE_NAME = eINSTANCE.getResultCollector_FileName();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TableResultCollectorImpl <em>Table Result Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.TableResultCollectorImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getTableResultCollector()
		 * @generated
		 */
		EClass TABLE_RESULT_COLLECTOR = eINSTANCE.getTableResultCollector();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.GraphResultCollectorImpl <em>Graph Result Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.GraphResultCollectorImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getGraphResultCollector()
		 * @generated
		 */
		EClass GRAPH_RESULT_COLLECTOR = eINSTANCE.getGraphResultCollector();

		/**
		 * The meta object literal for the '{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.StatResultCollectorImpl <em>Stat Result Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.StatResultCollectorImpl
		 * @see ru.agentlab.jmeter.ecore.model.jmeter.impl.JmeterPackageImpl#getStatResultCollector()
		 * @generated
		 */
		EClass STAT_RESULT_COLLECTOR = eINSTANCE.getStatResultCollector();

	}

} //JmeterPackage
