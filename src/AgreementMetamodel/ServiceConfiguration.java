/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getFeatures <em>Features</em>}</li>
 *   <li>{@link AgreementMetamodel.ServiceConfiguration#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration()
 * @model annotation="gmf.node label='serviceName' label.icon='false' figure='rectangle' tool.name='Service Configuration' tool.description='Creates a service configuration section'"
 * @generated
 */
public interface ServiceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference</em>' attribute.
	 * @see #setEndpointReference(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_EndpointReference()
	 * @model
	 * @generated
	 */
	String getEndpointReference();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference</em>' attribute.
	 * @see #getEndpointReference()
	 * @generated
	 */
	void setEndpointReference(String value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Reference</em>' attribute.
	 * @see #setDefinitionReference(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_DefinitionReference()
	 * @model
	 * @generated
	 */
	String getDefinitionReference();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' attribute.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(String value);

	/**
	 * Returns the value of the '<em><b>Monitor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Reference</em>' attribute.
	 * @see #setMonitorReference(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_MonitorReference()
	 * @model
	 * @generated
	 */
	String getMonitorReference();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Reference</em>' attribute.
	 * @see #getMonitorReference()
	 * @generated
	 */
	void setMonitorReference(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.ServiceConfiguration#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.ConfigurationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Properties</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getServiceConfiguration_ConfigurationProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationProperty> getConfigurationProperties();

} // ServiceConfiguration
