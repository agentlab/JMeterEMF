/**
 */
package ru.agentlab.jmeter.ecore.model.jmeter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.agentlab.jmeter.ecore.model.jmeter.AccessLogSampler;
import ru.agentlab.jmeter.ecore.model.jmeter.JmeterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Log Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl#isImageParsing <em>Image Parsing</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl#getLogFile <em>Log File</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl#getParserClassName <em>Parser Class Name</em>}</li>
 *   <li>{@link ru.agentlab.jmeter.ecore.model.jmeter.impl.AccessLogSamplerImpl#getPortString <em>Port String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessLogSamplerImpl extends MinimalEObjectImpl.Container implements AccessLogSampler {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isImageParsing() <em>Image Parsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageParsing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMAGE_PARSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImageParsing() <em>Image Parsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImageParsing()
	 * @generated
	 * @ordered
	 */
	protected boolean imageParsing = IMAGE_PARSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogFile() <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFile()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogFile() <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFile()
	 * @generated
	 * @ordered
	 */
	protected String logFile = LOG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParserClassName() <em>Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARSER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParserClassName() <em>Parser Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserClassName()
	 * @generated
	 * @ordered
	 */
	protected String parserClassName = PARSER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortString() <em>Port String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortString()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortString() <em>Port String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortString()
	 * @generated
	 * @ordered
	 */
	protected String portString = PORT_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLogSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JmeterPackage.Literals.ACCESS_LOG_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.ACCESS_LOG_SAMPLER__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImageParsing() {
		return imageParsing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageParsing(boolean newImageParsing) {
		boolean oldImageParsing = imageParsing;
		imageParsing = newImageParsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.ACCESS_LOG_SAMPLER__IMAGE_PARSING, oldImageParsing, imageParsing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogFile() {
		return logFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogFile(String newLogFile) {
		String oldLogFile = logFile;
		logFile = newLogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.ACCESS_LOG_SAMPLER__LOG_FILE, oldLogFile, logFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParserClassName() {
		return parserClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserClassName(String newParserClassName) {
		String oldParserClassName = parserClassName;
		parserClassName = newParserClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME, oldParserClassName, parserClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortString() {
		return portString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortString(String newPortString) {
		String oldPortString = portString;
		portString = newPortString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JmeterPackage.ACCESS_LOG_SAMPLER__PORT_STRING, oldPortString, portString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JmeterPackage.ACCESS_LOG_SAMPLER__DOMAIN:
				return getDomain();
			case JmeterPackage.ACCESS_LOG_SAMPLER__IMAGE_PARSING:
				return isImageParsing();
			case JmeterPackage.ACCESS_LOG_SAMPLER__LOG_FILE:
				return getLogFile();
			case JmeterPackage.ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME:
				return getParserClassName();
			case JmeterPackage.ACCESS_LOG_SAMPLER__PORT_STRING:
				return getPortString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JmeterPackage.ACCESS_LOG_SAMPLER__DOMAIN:
				setDomain((String)newValue);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__IMAGE_PARSING:
				setImageParsing((Boolean)newValue);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__LOG_FILE:
				setLogFile((String)newValue);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME:
				setParserClassName((String)newValue);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__PORT_STRING:
				setPortString((String)newValue);
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
			case JmeterPackage.ACCESS_LOG_SAMPLER__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__IMAGE_PARSING:
				setImageParsing(IMAGE_PARSING_EDEFAULT);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__LOG_FILE:
				setLogFile(LOG_FILE_EDEFAULT);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME:
				setParserClassName(PARSER_CLASS_NAME_EDEFAULT);
				return;
			case JmeterPackage.ACCESS_LOG_SAMPLER__PORT_STRING:
				setPortString(PORT_STRING_EDEFAULT);
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
			case JmeterPackage.ACCESS_LOG_SAMPLER__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case JmeterPackage.ACCESS_LOG_SAMPLER__IMAGE_PARSING:
				return imageParsing != IMAGE_PARSING_EDEFAULT;
			case JmeterPackage.ACCESS_LOG_SAMPLER__LOG_FILE:
				return LOG_FILE_EDEFAULT == null ? logFile != null : !LOG_FILE_EDEFAULT.equals(logFile);
			case JmeterPackage.ACCESS_LOG_SAMPLER__PARSER_CLASS_NAME:
				return PARSER_CLASS_NAME_EDEFAULT == null ? parserClassName != null : !PARSER_CLASS_NAME_EDEFAULT.equals(parserClassName);
			case JmeterPackage.ACCESS_LOG_SAMPLER__PORT_STRING:
				return PORT_STRING_EDEFAULT == null ? portString != null : !PORT_STRING_EDEFAULT.equals(portString);
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", imageParsing: ");
		result.append(imageParsing);
		result.append(", logFile: ");
		result.append(logFile);
		result.append(", parserClassName: ");
		result.append(parserClassName);
		result.append(", portString: ");
		result.append(portString);
		result.append(')');
		return result.toString();
	}

} //AccessLogSamplerImpl
