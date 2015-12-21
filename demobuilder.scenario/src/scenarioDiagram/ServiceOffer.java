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
 *   <li>{@link scenarioDiagram.ServiceOffer#getServiceEndpoint <em>Service Endpoint</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceOffer#getGuaranteeTerms <em>Guarantee Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer()
 * @model annotation="gmf.node figure='rectangle' border.color='0,0,0' border.width='2' border.style='solid' size='50,50' label='name' label.icon='false' tool.name='Service Offer' tool.description='Creates a service offer' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/ServiceOffer.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/ServiceOffer.gif'"
 * @generated
 */
public interface ServiceOffer extends ServiceElement, ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Endpoint</em>' attribute.
	 * @see #setServiceEndpoint(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_ServiceEndpoint()
	 * @model
	 * @generated
	 */
	String getServiceEndpoint();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceOffer#getServiceEndpoint <em>Service Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Endpoint</em>' attribute.
	 * @see #getServiceEndpoint()
	 * @generated
	 */
	void setServiceEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Guarantee Terms</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.PricingPlan}.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.PricingPlan#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarantee Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarantee Terms</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOffer_GuaranteeTerms()
	 * @see scenarioDiagram.PricingPlan#getServiceOffer
	 * @model opposite="serviceOffer" containment="true"
	 * @generated
	 */
	EList<PricingPlan> getGuaranteeTerms();

} // ServiceOffer
