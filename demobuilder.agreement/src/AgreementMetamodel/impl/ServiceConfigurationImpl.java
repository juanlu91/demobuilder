/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.ConfigurationProperty;
import AgreementMetamodel.Feature;
import AgreementMetamodel.ServiceConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getMonitorReference <em>Monitor Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ServiceConfigurationImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConfigurationImpl extends EObjectImpl implements ServiceConfiguration {
	/**
	 * The default value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected String endpointReference = ENDPOINT_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected String definitionReference = DEFINITION_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITOR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected String monitorReference = MONITOR_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getConfigurationProperties() <em>Configuration Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProperty> configurationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.SERVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointReference() {
		return endpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference(String newEndpointReference) {
		String oldEndpointReference = endpointReference;
		endpointReference = newEndpointReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE, oldEndpointReference, endpointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionReference(String newDefinitionReference) {
		String oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE, oldDefinitionReference, definitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonitorReference() {
		return monitorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorReference(String newMonitorReference) {
		String oldMonitorReference = monitorReference;
		monitorReference = newMonitorReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE, oldMonitorReference, monitorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.SERVICE_CONFIGURATION__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationProperty> getConfigurationProperties() {
		if (configurationProperties == null) {
			configurationProperties = new EObjectContainmentEList<ConfigurationProperty>(ConfigurationProperty.class, this, AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES);
		}
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES:
				return ((InternalEList<?>)getConfigurationProperties()).basicRemove(otherEnd, msgs);
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
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				return getMonitorReference();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return getServiceName();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES:
				return getFeatures();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES:
				return getConfigurationProperties();
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
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				setEndpointReference((String)newValue);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				setDefinitionReference((String)newValue);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				setMonitorReference((String)newValue);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
				getConfigurationProperties().addAll((Collection<? extends ConfigurationProperty>)newValue);
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
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				setEndpointReference(ENDPOINT_REFERENCE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				setDefinitionReference(DEFINITION_REFERENCE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				setMonitorReference(MONITOR_REFERENCE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES:
				getFeatures().clear();
				return;
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
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
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				return ENDPOINT_REFERENCE_EDEFAULT == null ? endpointReference != null : !ENDPOINT_REFERENCE_EDEFAULT.equals(endpointReference);
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				return DEFINITION_REFERENCE_EDEFAULT == null ? definitionReference != null : !DEFINITION_REFERENCE_EDEFAULT.equals(definitionReference);
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				return MONITOR_REFERENCE_EDEFAULT == null ? monitorReference != null : !MONITOR_REFERENCE_EDEFAULT.equals(monitorReference);
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__FEATURES:
				return features != null && !features.isEmpty();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES:
				return configurationProperties != null && !configurationProperties.isEmpty();
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
		result.append(" (endpointReference: ");
		result.append(endpointReference);
		result.append(", definitionReference: ");
		result.append(definitionReference);
		result.append(", monitorReference: ");
		result.append(monitorReference);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //ServiceConfigurationImpl
