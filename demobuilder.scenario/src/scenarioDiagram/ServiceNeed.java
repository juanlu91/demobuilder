/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceNeed#getServiceNeedLink <em>Service Need Link</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceNeed#getAgreementLink <em>Agreement Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeed()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/demobuilder.scenario/icons/serviceNeed.svg' label='name' label.placement='external' label.icon='false' tool.description='Service Need' size='50,50' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/ServiceNeed.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/ServiceNeed.gif'"
 * @generated
 */
public interface ServiceNeed extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Need Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceNeedLink#getServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Need Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Need Link</em>' reference.
	 * @see #setServiceNeedLink(ServiceNeedLink)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeed_ServiceNeedLink()
	 * @see scenarioDiagram.ServiceNeedLink#getServiceNeed
	 * @model opposite="serviceNeed"
	 * @generated
	 */
	ServiceNeedLink getServiceNeedLink();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceNeed#getServiceNeedLink <em>Service Need Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Need Link</em>' reference.
	 * @see #getServiceNeedLink()
	 * @generated
	 */
	void setServiceNeedLink(ServiceNeedLink value);

	/**
	 * Returns the value of the '<em><b>Agreement Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.AgreementLink#getServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Link</em>' reference.
	 * @see #setAgreementLink(AgreementLink)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeed_AgreementLink()
	 * @see scenarioDiagram.AgreementLink#getServiceNeed
	 * @model opposite="serviceNeed"
	 * @generated
	 */
	AgreementLink getAgreementLink();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceNeed#getAgreementLink <em>Agreement Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Link</em>' reference.
	 * @see #getAgreementLink()
	 * @generated
	 */
	void setAgreementLink(AgreementLink value);

} // ServiceNeed
