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
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;
import ru.agentlab.jmeter.ecore.model.jmeter.TestPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl#isIsFunctionalMode <em>Is Functional Mode</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl#isSerializeThreadGroups <em>Serialize Thread Groups</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl#getUserDefinedClasspath <em>User Defined Classpath</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.TestPlanImpl#getThreadgroup <em>Threadgroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestPlanImpl extends MinimalEObjectImpl.Container implements TestPlan {
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFunctionalMode() <em>Is Functional Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunctionalMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FUNCTIONAL_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFunctionalMode() <em>Is Functional Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunctionalMode()
	 * @generated
	 * @ordered
	 */
	protected boolean isFunctionalMode = IS_FUNCTIONAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSerializeThreadGroups() <em>Serialize Thread Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializeThreadGroups()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZE_THREAD_GROUPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSerializeThreadGroups() <em>Serialize Thread Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializeThreadGroups()
	 * @generated
	 * @ordered
	 */
	protected boolean serializeThreadGroups = SERIALIZE_THREAD_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedClasspath() <em>User Defined Classpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedClasspath()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_CLASSPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedClasspath() <em>User Defined Classpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedClasspath()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedClasspath = USER_DEFINED_CLASSPATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreadgroup() <em>Threadgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup> threadgroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JmeterPackage.Literals.TEST_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.TEST_PLAN__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFunctionalMode() {
		return isFunctionalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFunctionalMode(boolean newIsFunctionalMode) {
		boolean oldIsFunctionalMode = isFunctionalMode;
		isFunctionalMode = newIsFunctionalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.TEST_PLAN__IS_FUNCTIONAL_MODE, oldIsFunctionalMode, isFunctionalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializeThreadGroups() {
		return serializeThreadGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializeThreadGroups(boolean newSerializeThreadGroups) {
		boolean oldSerializeThreadGroups = serializeThreadGroups;
		serializeThreadGroups = newSerializeThreadGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.TEST_PLAN__SERIALIZE_THREAD_GROUPS, oldSerializeThreadGroups, serializeThreadGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedClasspath() {
		return userDefinedClasspath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedClasspath(String newUserDefinedClasspath) {
		String oldUserDefinedClasspath = userDefinedClasspath;
		userDefinedClasspath = newUserDefinedClasspath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.TEST_PLAN__USER_DEFINED_CLASSPATH, oldUserDefinedClasspath, userDefinedClasspath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup> getThreadgroup() {
		if (threadgroup == null) {
			threadgroup = new EObjectContainmentEList<ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup>(ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup.class, this, JmeterPackage.TEST_PLAN__THREADGROUP);
		}
		return threadgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JmeterPackage.TEST_PLAN__THREADGROUP:
				return ((InternalEList<?>)getThreadgroup()).basicRemove(otherEnd, msgs);
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
			case JmeterPackage.TEST_PLAN__COMMENTS:
				return getComments();
			case JmeterPackage.TEST_PLAN__IS_FUNCTIONAL_MODE:
				return isIsFunctionalMode();
			case JmeterPackage.TEST_PLAN__SERIALIZE_THREAD_GROUPS:
				return isSerializeThreadGroups();
			case JmeterPackage.TEST_PLAN__USER_DEFINED_CLASSPATH:
				return getUserDefinedClasspath();
			case JmeterPackage.TEST_PLAN__THREADGROUP:
				return getThreadgroup();
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
			case JmeterPackage.TEST_PLAN__COMMENTS:
				setComments((String)newValue);
				return;
			case JmeterPackage.TEST_PLAN__IS_FUNCTIONAL_MODE:
				setIsFunctionalMode((Boolean)newValue);
				return;
			case JmeterPackage.TEST_PLAN__SERIALIZE_THREAD_GROUPS:
				setSerializeThreadGroups((Boolean)newValue);
				return;
			case JmeterPackage.TEST_PLAN__USER_DEFINED_CLASSPATH:
				setUserDefinedClasspath((String)newValue);
				return;
			case JmeterPackage.TEST_PLAN__THREADGROUP:
				getThreadgroup().clear();
				getThreadgroup().addAll((Collection<? extends ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup>)newValue);
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
			case JmeterPackage.TEST_PLAN__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case JmeterPackage.TEST_PLAN__IS_FUNCTIONAL_MODE:
				setIsFunctionalMode(IS_FUNCTIONAL_MODE_EDEFAULT);
				return;
			case JmeterPackage.TEST_PLAN__SERIALIZE_THREAD_GROUPS:
				setSerializeThreadGroups(SERIALIZE_THREAD_GROUPS_EDEFAULT);
				return;
			case JmeterPackage.TEST_PLAN__USER_DEFINED_CLASSPATH:
				setUserDefinedClasspath(USER_DEFINED_CLASSPATH_EDEFAULT);
				return;
			case JmeterPackage.TEST_PLAN__THREADGROUP:
				getThreadgroup().clear();
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
			case JmeterPackage.TEST_PLAN__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case JmeterPackage.TEST_PLAN__IS_FUNCTIONAL_MODE:
				return isFunctionalMode != IS_FUNCTIONAL_MODE_EDEFAULT;
			case JmeterPackage.TEST_PLAN__SERIALIZE_THREAD_GROUPS:
				return serializeThreadGroups != SERIALIZE_THREAD_GROUPS_EDEFAULT;
			case JmeterPackage.TEST_PLAN__USER_DEFINED_CLASSPATH:
				return USER_DEFINED_CLASSPATH_EDEFAULT == null ? userDefinedClasspath != null : !USER_DEFINED_CLASSPATH_EDEFAULT.equals(userDefinedClasspath);
			case JmeterPackage.TEST_PLAN__THREADGROUP:
				return threadgroup != null && !threadgroup.isEmpty();
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
		result.append(" (Comments: ");
		result.append(comments);
		result.append(", isFunctionalMode: ");
		result.append(isFunctionalMode);
		result.append(", serializeThreadGroups: ");
		result.append(serializeThreadGroups);
		result.append(", userDefinedClasspath: ");
		result.append(userDefinedClasspath);
		result.append(')');
		return result.toString();
	}

} //TestPlanImpl
