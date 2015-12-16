/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceOffer#getServiceOfferLinks <em>Service Offer Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/demobuilder.scenario/icons/serviceOffer.svg' label='name' label.placement='external' label.icon='false' tool.description='Service Offer' size='50,50' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/ServiceOffer.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/ServiceOffer.gif'"
 * @generated
 */
public interface ServiceOffer extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Agreement Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.AgreementLink#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Link</em>' reference.
	 * @see #setAgreementLink(AgreementLink)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_AgreementLink()
	 * @see scenarioDiagram.AgreementLink#getServiceOffer
	 * @model opposite="serviceOffer"
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

	/**
	 * Returns the value of the '<em><b>Service Offer Links</b></em>' reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceOfferLink}.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceOfferLink#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Offer Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Offer Links</em>' reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_ServiceOfferLinks()
	 * @see scenarioDiagram.ServiceOfferLink#getServiceOffer
	 * @model opposite="serviceOffer"
	 * @generated
	 */
	EList<ServiceOfferLink> getServiceOfferLinks();

} // ServiceOffer
