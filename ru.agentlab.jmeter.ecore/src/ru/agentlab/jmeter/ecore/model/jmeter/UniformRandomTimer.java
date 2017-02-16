/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform Random Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getUniformRandomTimer()
 * @model
 * @generated
 */
public interface UniformRandomTimer extends Timer {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getUniformRandomTimer_Range()
	 * @model
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.UniformRandomTimer#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

} // UniformRandomTimer
