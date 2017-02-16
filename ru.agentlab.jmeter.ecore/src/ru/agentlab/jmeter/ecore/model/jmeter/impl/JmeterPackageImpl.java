/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JmeterPackageImpl extends EPackageImpl implements JmeterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformRandomTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLogSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableResultCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphResultCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statResultCollectorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JmeterPackageImpl() {
		super(eNS_URI, JmeterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JmeterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JmeterPackage init() {
		if (isInited) return (JmeterPackage)EPackage.Registry.INSTANCE.getEPackage(JmeterPackage.eNS_URI);

		// Obtain or create and register package
		JmeterPackageImpl theJmeterPackage = (JmeterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JmeterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JmeterPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJmeterPackage.createPackageContents();

		// Initialize created meta-data
		theJmeterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJmeterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JmeterPackage.eNS_URI, theJmeterPackage);
		return theJmeterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestPlan() {
		return testPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestPlan_Comments() {
		return (EAttribute)testPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestPlan_IsFunctionalMode() {
		return (EAttribute)testPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestPlan_SerializeThreadGroups() {
		return (EAttribute)testPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestPlan_UserDefinedClasspath() {
		return (EAttribute)testPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestPlan_Threadgroup() {
		return (EReference)testPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_Delay() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformRandomTimer() {
		return uniformRandomTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniformRandomTimer_Range() {
		return (EAttribute)uniformRandomTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadGroup() {
		return threadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_ErrorOnSample() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_ThreadsCount() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_RampTime() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_StartTime() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_EndTime() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_Duration() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadGroup_Delay() {
		return (EAttribute)threadGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadGroup_Timer() {
		return (EReference)threadGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadGroup_Resultcollector() {
		return (EReference)threadGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreadGroup_Accesslogsampler() {
		return (EReference)threadGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessLogSampler() {
		return accessLogSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLogSampler_Domain() {
		return (EAttribute)accessLogSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLogSampler_ImageParsing() {
		return (EAttribute)accessLogSamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLogSampler_LogFile() {
		return (EAttribute)accessLogSamplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLogSampler_ParserClassName() {
		return (EAttribute)accessLogSamplerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLogSampler_PortString() {
		return (EAttribute)accessLogSamplerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultCollector() {
		return resultCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultCollector_Name() {
		return (EAttribute)resultCollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultCollector_FileName() {
		return (EAttribute)resultCollectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableResultCollector() {
		return tableResultCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphResultCollector() {
		return graphResultCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatResultCollector() {
		return statResultCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmeterFactory getJmeterFactory() {
		return (JmeterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testPlanEClass = createEClass(TEST_PLAN);
		createEAttribute(testPlanEClass, TEST_PLAN__COMMENTS);
		createEAttribute(testPlanEClass, TEST_PLAN__IS_FUNCTIONAL_MODE);
		createEAttribute(testPlanEClass, TEST_PLAN__SERIALIZE_THREAD_GROUPS);
		createEAttribute(testPlanEClass, TEST_PLAN__USER_DEFINED_CLASSPATH);
		createEReference(testPlanEClass, TEST_PLAN__THREADGROUP);

		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__DELAY);

		uniformRandomTimerEClass = createEClass(UNIFORM_RANDOM_TIMER);
		createEAttribute(uniformRandomTimerEClass, UNIFORM_RANDOM_TIMER__RANGE);

		threadGroupEClass = createEClass(THREAD_GROUP);
		createEAttribute(threadGroupEClass, THREAD_GROUP__ERROR_ON_SAMPLE);
		createEAttribute(threadGroupEClass, THREAD_GROUP__THREADS_COUNT);
		createEAttribute(threadGroupEClass, THREAD_GROUP__RAMP_TIME);
		createEAttribute(threadGroupEClass, THREAD_GROUP__START_TIME);
		createEAttribute(threadGroupEClass, THREAD_GROUP__END_TIME);
		createEAttribute(threadGroupEClass, THREAD_GROUP__DURATION);
		createEAttribute(threadGroupEClass, THREAD_GROUP__DELAY);
		createEReference(threadGroupEClass, THREAD_GROUP__TIMER);
		createEReference(threadGroupEClass, THREAD_GROUP__RESULTCOLLECTOR);
		createEReference(threadGroupEClass, THREAD_GROUP__ACCESSLOGSAMPLER);

		accessLogSamplerEClass = createEClass(ACCESS_LOG_SAMPLER);
		createEAttribute(accessLogSamplerEClass, ACCESS_LOG_SAMPLER__DOMAIN);
		createEAttribute(accessLogSamplerEClass, ACCESS_LOG_SAMPLER__IMAGE_PARSING);
		createEAttribute(accessLogSamplerEClass, ACCESS_LOG_SAMPLER__LOG_FILE);
		createEAttribute(accessLogSamplerEClass, ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME);
		createEAttribute(accessLogSamplerEClass, ACCESS_LOG_SAMPLER__PORT_STRING);

		resultCollectorEClass = createEClass(RESULT_COLLECTOR);
		createEAttribute(resultCollectorEClass, RESULT_COLLECTOR__NAME);
		createEAttribute(resultCollectorEClass, RESULT_COLLECTOR__FILE_NAME);

		tableResultCollectorEClass = createEClass(TABLE_RESULT_COLLECTOR);

		graphResultCollectorEClass = createEClass(GRAPH_RESULT_COLLECTOR);

		statResultCollectorEClass = createEClass(STAT_RESULT_COLLECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uniformRandomTimerEClass.getESuperTypes().add(this.getTimer());
		tableResultCollectorEClass.getESuperTypes().add(this.getResultCollector());
		graphResultCollectorEClass.getESuperTypes().add(this.getResultCollector());
		statResultCollectorEClass.getESuperTypes().add(this.getResultCollector());

		// Initialize classes, features, and operations; add parameters
		initEClass(testPlanEClass, TestPlan.class, "TestPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestPlan_Comments(), ecorePackage.getEString(), "Comments", null, 0, 1, TestPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestPlan_IsFunctionalMode(), ecorePackage.getEBoolean(), "isFunctionalMode", null, 0, 1, TestPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestPlan_SerializeThreadGroups(), ecorePackage.getEBoolean(), "serializeThreadGroups", null, 0, 1, TestPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestPlan_UserDefinedClasspath(), ecorePackage.getEString(), "userDefinedClasspath", null, 0, 1, TestPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestPlan_Threadgroup(), this.getThreadGroup(), null, "threadgroup", null, 0, -1, TestPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_Delay(), ecorePackage.getEString(), "delay", null, 0, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformRandomTimerEClass, UniformRandomTimer.class, "UniformRandomTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniformRandomTimer_Range(), ecorePackage.getEString(), "range", null, 0, 1, UniformRandomTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadGroupEClass, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, "ThreadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadGroup_ErrorOnSample(), ecorePackage.getEString(), "errorOnSample", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_ThreadsCount(), ecorePackage.getEString(), "threadsCount", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_RampTime(), ecorePackage.getEString(), "rampTime", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_StartTime(), ecorePackage.getELong(), "startTime", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_EndTime(), ecorePackage.getELong(), "endTime", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_Duration(), ecorePackage.getEString(), "duration", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadGroup_Delay(), ecorePackage.getEString(), "delay", null, 0, 1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreadGroup_Timer(), this.getTimer(), null, "timer", null, 0, -1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreadGroup_Resultcollector(), this.getResultCollector(), null, "resultcollector", null, 0, -1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreadGroup_Accesslogsampler(), this.getAccessLogSampler(), null, "accesslogsampler", null, 0, -1, ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessLogSamplerEClass, AccessLogSampler.class, "AccessLogSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessLogSampler_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, AccessLogSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogSampler_ImageParsing(), ecorePackage.getEBoolean(), "imageParsing", null, 0, 1, AccessLogSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogSampler_LogFile(), ecorePackage.getEString(), "logFile", null, 0, 1, AccessLogSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogSampler_ParserClassName(), ecorePackage.getEString(), "parserClassName", null, 0, 1, AccessLogSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessLogSampler_PortString(), ecorePackage.getEString(), "portString", null, 0, 1, AccessLogSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultCollectorEClass, ResultCollector.class, "ResultCollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultCollector_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResultCollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultCollector_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, ResultCollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableResultCollectorEClass, TableResultCollector.class, "TableResultCollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphResultCollectorEClass, GraphResultCollector.class, "GraphResultCollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statResultCollectorEClass, StatResultCollector.class, "StatResultCollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JmeterPackageImpl
