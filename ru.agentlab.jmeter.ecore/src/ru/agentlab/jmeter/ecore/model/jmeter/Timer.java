/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.Timer#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTimer()
 * @model
 * @generated
 */
public interface Timer extends EObject {
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
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getTimer_Delay()
	 * @model
	 * @generated
	 */
	String getDelay();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.Timer#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(String value);

} // Timer
