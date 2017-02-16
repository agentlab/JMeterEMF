/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getName <em>Name</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getResultCollector()
 * @model
 * @generated
 */
public interface ResultCollector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getResultCollector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getResultCollector_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.ResultCollector#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // ResultCollector
