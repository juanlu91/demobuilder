/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceOffer#getServiceConfiguration <em>Service Configuration</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/demobuilder.scenario/icons/serviceOffer.svg' label='name' label.placement='external' label.icon='false' tool.name='Service Offer' tool.description='Creates a service offer' size='50,50' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/ServiceOffer.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/ServiceOffer.gif'"
 * @generated
 */
public interface ServiceOffer extends ServiceElement, ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Configuration</em>' containment reference.
	 * @see #setServiceConfiguration(ServiceConfiguration)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_ServiceConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	ServiceConfiguration getServiceConfiguration();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceOffer#getServiceConfiguration <em>Service Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Configuration</em>' containment reference.
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	void setServiceConfiguration(ServiceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Agreement Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.AgreementLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Link</em>' reference.
	 * @see #setAgreementLink(AgreementLink)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_AgreementLink()
	 * @see scenarioDiagram.AgreementLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	AgreementLink getAgreementLink();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Link</em>' reference.
	 * @see #getAgreementLink()
	 * @generated
	 */
	void setAgreementLink(AgreementLink value);

} // ServiceOffer
