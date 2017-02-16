/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getComments <em>Comments</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isIsFunctionalMode <em>Is Functional Mode</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isSerializeThreadGroups <em>Serialize Thread Groups</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getUserDefinedClasspath <em>User Defined Classpath</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getThreadgroup <em>Threadgroup</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan()
 * @model
 * @generated
 */
public interface TestPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Is Functional Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Functional Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Functional Mode</em>' attribute.
	 * @see #setIsFunctionalMode(boolean)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan_IsFunctionalMode()
	 * @model
	 * @generated
	 */
	boolean isIsFunctionalMode();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isIsFunctionalMode <em>Is Functional Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Functional Mode</em>' attribute.
	 * @see #isIsFunctionalMode()
	 * @generated
	 */
	void setIsFunctionalMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Serialize Thread Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialize Thread Groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialize Thread Groups</em>' attribute.
	 * @see #setSerializeThreadGroups(boolean)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan_SerializeThreadGroups()
	 * @model
	 * @generated
	 */
	boolean isSerializeThreadGroups();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#isSerializeThreadGroups <em>Serialize Thread Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialize Thread Groups</em>' attribute.
	 * @see #isSerializeThreadGroups()
	 * @generated
	 */
	void setSerializeThreadGroups(boolean value);

	/**
	 * Returns the value of the '<em><b>User Defined Classpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Classpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Classpath</em>' attribute.
	 * @see #setUserDefinedClasspath(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan_UserDefinedClasspath()
	 * @model
	 * @generated
	 */
	String getUserDefinedClasspath();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.TestPlan#getUserDefinedClasspath <em>User Defined Classpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Classpath</em>' attribute.
	 * @see #getUserDefinedClasspath()
	 * @generated
	 */
	void setUserDefinedClasspath(String value);

	/**
	 * Returns the value of the '<em><b>Threadgroup</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threadgroup</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threadgroup</em>' containment reference list.
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTestPlan_Threadgroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ru.agentlab.jmeter.ecore.model.jmeter.ThreadGroup> getThreadgroup();

} // TestPlan
