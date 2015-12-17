/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceConfiguration#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceConfiguration#getGuaranteTerms <em>Guarante Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='svg' svg.uri='platform:/plugin/demobuilder.scenario/icons/serviceConfiguration.svg' tool.name='Service Configuration' tool.description='Creates a service configuration section' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/ServiceConfiguration.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/ServiceConfiguration.gif'"
 * @generated
 */
public interface ServiceConfiguration extends ScenarioElement {
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration_EndpointReference()
	 * @model
	 * @generated
	 */
	String getEndpointReference();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration_DefinitionReference()
	 * @model
	 * @generated
	 */
	String getDefinitionReference();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration_MonitorReference()
	 * @model
	 * @generated
	 */
	String getMonitorReference();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceConfiguration#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Guarante Terms</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.GuaranteeTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarante Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarante Terms</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceConfiguration_GuaranteTerms()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuaranteeTerm> getGuaranteTerms();

} // ServiceConfiguration
