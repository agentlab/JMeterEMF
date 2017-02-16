/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Log Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getDomain <em>Domain</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#isImageParsing <em>Image Parsing</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getLogFile <em>Log File</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getParserClassName <em>Parser Class Name</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getPortString <em>Port String</em>}</li>
 * </ul>
 *
 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler()
 * @model
 * @generated
 */
public interface AccessLogSampler extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Image Parsing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Parsing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Parsing</em>' attribute.
	 * @see #setImageParsing(boolean)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler_ImageParsing()
	 * @model
	 * @generated
	 */
	boolean isImageParsing();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#isImageParsing <em>Image Parsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Parsing</em>' attribute.
	 * @see #isImageParsing()
	 * @generated
	 */
	void setImageParsing(boolean value);

	/**
	 * Returns the value of the '<em><b>Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File</em>' attribute.
	 * @see #setLogFile(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler_LogFile()
	 * @model
	 * @generated
	 */
	String getLogFile();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getLogFile <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File</em>' attribute.
	 * @see #getLogFile()
	 * @generated
	 */
	void setLogFile(String value);

	/**
	 * Returns the value of the '<em><b>Parser Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parser Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parser Class Name</em>' attribute.
	 * @see #setParserClassName(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler_ParserClassName()
	 * @model
	 * @generated
	 */
	String getParserClassName();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getParserClassName <em>Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parser Class Name</em>' attribute.
	 * @see #getParserClassName()
	 * @generated
	 */
	void setParserClassName(String value);

	/**
	 * Returns the value of the '<em><b>Port String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port String</em>' attribute.
	 * @see #setPortString(String)
	 * @see ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage#getAccessLogSampler_PortString()
	 * @model
	 * @generated
	 */
	String getPortString();

	/**
	 * Sets the value of the '{@link ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler#getPortString <em>Port String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port String</em>' attribute.
	 * @see #getPortString()
	 * @generated
	 */
	void setPortString(String value);

} // AccessLogSampler
