/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;
import ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector;
import ru.agentlab.jmeter.ecore.model.jmeter.Timer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getErrorOnSample <em>Error On Sample</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getThreadsCount <em>Threads Count</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getRampTime <em>Ramp Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getResultcollector <em>Resultcollector</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.ThreadGroupImpl#getAccesslogsampler <em>Accesslogsampler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadGroupImpl extends MinimalEObjectImpl.Container implements ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup {
	/**
	 * The default value of the '{@link #getErrorOnSample() <em>Error On Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorOnSample()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_ON_SAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorOnSample() <em>Error On Sample</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorOnSample()
	 * @generated
	 * @ordered
	 */
	protected String errorOnSample = ERROR_ON_SAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadsCount() <em>Threads Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadsCount()
	 * @generated
	 * @ordered
	 */
	protected static final String THREADS_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadsCount() <em>Threads Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadsCount()
	 * @generated
	 * @ordered
	 */
	protected String threadsCount = THREADS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRampTime() <em>Ramp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RAMP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRampTime() <em>Ramp Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRampTime()
	 * @generated
	 * @ordered
	 */
	protected String rampTime = RAMP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected long startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final long END_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected long endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected EList<Timer> timer;

	/**
	 * The cached value of the '{@link #getResultcollector() <em>Resultcollector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultcollector()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultCollector> resultcollector;

	/**
	 * The cached value of the '{@link #getAccesslogsampler() <em>Accesslogsampler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesslogsampler()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessLogSampler> accesslogsampler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JmeterPackage.Literals.THREAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorOnSample() {
		return errorOnSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorOnSample(String newErrorOnSample) {
		String oldErrorOnSample = errorOnSample;
		errorOnSample = newErrorOnSample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE, oldErrorOnSample, errorOnSample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreadsCount() {
		return threadsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadsCount(String newThreadsCount) {
		String oldThreadsCount = threadsCount;
		threadsCount = newThreadsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__THREADS_COUNT, oldThreadsCount, threadsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRampTime() {
		return rampTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRampTime(String newRampTime) {
		String oldRampTime = rampTime;
		rampTime = newRampTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__RAMP_TIME, oldRampTime, rampTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(long newStartTime) {
		long oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(long newEndTime) {
		long oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.THREAD_GROUP__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timer> getTimer() {
		if (timer == null) {
			timer = new EObjectContainmentEList<Timer>(Timer.class, this, JmeterPackage.THREAD_GROUP__TIMER);
		}
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultCollector> getResultcollector() {
		if (resultcollector == null) {
			resultcollector = new EObjectContainmentEList<ResultCollector>(ResultCollector.class, this, JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR);
		}
		return resultcollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessLogSampler> getAccesslogsampler() {
		if (accesslogsampler == null) {
			accesslogsampler = new EObjectContainmentEList<AccessLogSampler>(AccessLogSampler.class, this, JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER);
		}
		return accesslogsampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JmeterPackage.THREAD_GROUP__TIMER:
				return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
				return ((InternalEList<?>)getResultcollector()).basicRemove(otherEnd, msgs);
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				return ((InternalEList<?>)getAccesslogsampler()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE:
				return getErrorOnSample();
			case JmeterPackage.THREAD_GROUP__THREADS_COUNT:
				return getThreadsCount();
			case JmeterPackage.THREAD_GROUP__RAMP_TIME:
				return getRampTime();
			case JmeterPackage.THREAD_GROUP__START_TIME:
				return getStartTime();
			case JmeterPackage.THREAD_GROUP__END_TIME:
				return getEndTime();
			case JmeterPackage.THREAD_GROUP__DURATION:
				return getDuration();
			case JmeterPackage.THREAD_GROUP__DELAY:
				return getDelay();
			case JmeterPackage.THREAD_GROUP__TIMER:
				return getTimer();
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
				return getResultcollector();
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				return getAccesslogsampler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE:
				setErrorOnSample((String)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__THREADS_COUNT:
				setThreadsCount((String)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__RAMP_TIME:
				setRampTime((String)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__START_TIME:
				setStartTime((Long)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__END_TIME:
				setEndTime((Long)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__DURATION:
				setDuration((String)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__DELAY:
				setDelay((String)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__TIMER:
				getTimer().clear();
				getTimer().addAll((Collection<? extends Timer>)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
				getResultcollector().clear();
				getResultcollector().addAll((Collection<? extends ResultCollector>)newValue);
				return;
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				getAccesslogsampler().clear();
				getAccesslogsampler().addAll((Collection<? extends AccessLogSampler>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE:
				setErrorOnSample(ERROR_ON_SAMPLE_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__THREADS_COUNT:
				setThreadsCount(THREADS_COUNT_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__RAMP_TIME:
				setRampTime(RAMP_TIME_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case JmeterPackage.THREAD_GROUP__TIMER:
				getTimer().clear();
				return;
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
				getResultcollector().clear();
				return;
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				getAccesslogsampler().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JmeterPackage.THREAD_GROUP__ERROR_ON_SAMPLE:
				return ERROR_ON_SAMPLE_EDEFAULT == null ? errorOnSample != null : !ERROR_ON_SAMPLE_EDEFAULT.equals(errorOnSample);
			case JmeterPackage.THREAD_GROUP__THREADS_COUNT:
				return THREADS_COUNT_EDEFAULT == null ? threadsCount != null : !THREADS_COUNT_EDEFAULT.equals(threadsCount);
			case JmeterPackage.THREAD_GROUP__RAMP_TIME:
				return RAMP_TIME_EDEFAULT == null ? rampTime != null : !RAMP_TIME_EDEFAULT.equals(rampTime);
			case JmeterPackage.THREAD_GROUP__START_TIME:
				return startTime != START_TIME_EDEFAULT;
			case JmeterPackage.THREAD_GROUP__END_TIME:
				return endTime != END_TIME_EDEFAULT;
			case JmeterPackage.THREAD_GROUP__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case JmeterPackage.THREAD_GROUP__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case JmeterPackage.THREAD_GROUP__TIMER:
				return timer != null && !timer.isEmpty();
			case JmeterPackage.THREAD_GROUP__RESULTCOLLECTOR:
				return resultcollector != null && !resultcollector.isEmpty();
			case JmeterPackage.THREAD_GROUP__ACCESSLOGSAMPLER:
				return accesslogsampler != null && !accesslogsampler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorOnSample: ");
		result.append(errorOnSample);
		result.append(", threadsCount: ");
		result.append(threadsCount);
		result.append(", rampTime: ");
		result.append(rampTime);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(", delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //ThreadGroupImpl
