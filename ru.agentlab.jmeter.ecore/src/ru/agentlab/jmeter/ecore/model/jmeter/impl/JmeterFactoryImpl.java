/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler;
import ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterFactory;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;
import ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.TestPlan;
import ru.agentlab.jmeter.ecore.model.jmeter.Timer;
import ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JmeterFactoryImpl extends EFactoryImpl implements JmeterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JmeterFactory init() {
		try {
			JmeterFactory theJmeterFactory = (JmeterFactory)EPackage.Registry.INSTANCE.getEFactory(JmeterPackage.eNS_URI);
			if (theJmeterFactory != null) {
				return theJmeterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JmeterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmeterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JmeterPackage.TEST_PLAN: return createTestPlan();
			case JmeterPackage.TIMER: return createTimer();
			case JmeterPackage.UNIFORM_RANDOM_TIMER: return createUniformRandomTimer();
			case JmeterPackage.THREAD_GROUP: return createThreadGroup();
			case JmeterPackage.ACCESS_LOG_SAMPLER: return createAccessLogSampler();
			case JmeterPackage.RESULT_COLLECTOR: return createResultCollector();
			case JmeterPackage.TABLE_RESULT_COLLECTOR: return createTableResultCollector();
			case JmeterPackage.GRAPH_RESULT_COLLECTOR: return createGraphResultCollector();
			case JmeterPackage.STAT_RESULT_COLLECTOR: return createStatResultCollector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPlan createTestPlan() {
		TestPlanImpl testPlan = new TestPlanImpl();
		return testPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timer createTimer() {
		TimerImpl timer = new TimerImpl();
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformRandomTimer createUniformRandomTimer() {
		UniformRandomTimerImpl uniformRandomTimer = new UniformRandomTimerImpl();
		return uniformRandomTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup createThreadGroup() {
		ThreadGroupImpl threadGroup = new ThreadGroupImpl();
		return threadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLogSampler createAccessLogSampler() {
		AccessLogSamplerImpl accessLogSampler = new AccessLogSamplerImpl();
		return accessLogSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultCollector createResultCollector() {
		ResultCollectorImpl resultCollector = new ResultCollectorImpl();
		return resultCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableResultCollector createTableResultCollector() {
		TableResultCollectorImpl tableResultCollector = new TableResultCollectorImpl();
		return tableResultCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphResultCollector createGraphResultCollector() {
		GraphResultCollectorImpl graphResultCollector = new GraphResultCollectorImpl();
		return graphResultCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatResultCollector createStatResultCollector() {
		StatResultCollectorImpl statResultCollector = new StatResultCollectorImpl();
		return statResultCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmeterPackage getJmeterPackage() {
		return (JmeterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JmeterPackage getPackage() {
		return JmeterPackage.eINSTANCE;
	}

} //JmeterFactoryImpl
