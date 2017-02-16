/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage
 * @generated
 */
public class JmeterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JmeterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmeterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JmeterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JmeterSwitch<Adapter> modelSwitch =
		new JmeterSwitch<Adapter>() {
			@Override
			public Adapter caseTestPlan(TestPlan object) {
				return createTestPlanAdapter();
			}
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseUniformRandomTimer(UniformRandomTimer object) {
				return createUniformRandomTimerAdapter();
			}
			@Override
			public Adapter caseThreadGroup(ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup object) {
				return createThreadGroupAdapter();
			}
			@Override
			public Adapter caseAccessLogSampler(AccessLogSampler object) {
				return createAccessLogSamplerAdapter();
			}
			@Override
			public Adapter caseResultCollector(ResultCollector object) {
				return createResultCollectorAdapter();
			}
			@Override
			public Adapter caseTableResultCollector(TableResultCollector object) {
				return createTableResultCollectorAdapter();
			}
			@Override
			public Adapter caseGraphResultCollector(GraphResultCollector object) {
				return createGraphResultCollectorAdapter();
			}
			@Override
			public Adapter caseStatResultCollector(StatResultCollector object) {
				return createStatResultCollectorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan <em>Test Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TestPlan
	 * @generated
	 */
	public Adapter createTestPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer <em>Uniform Random Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer
	 * @generated
	 */
	public Adapter createUniformRandomTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup <em>Thread Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup
	 * @generated
	 */
	public Adapter createThreadGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler <em>Access Log Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler
	 * @generated
	 */
	public Adapter createAccessLogSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector <em>Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector
	 * @generated
	 */
	public Adapter createResultCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector <em>Table Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.TableResultCollector
	 * @generated
	 */
	public Adapter createTableResultCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector <em>Graph Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.GraphResultCollector
	 * @generated
	 */
	public Adapter createGraphResultCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector <em>Stat Result Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.StatResultCollector
	 * @generated
	 */
	public Adapter createStatResultCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JmeterAdapterFactory
