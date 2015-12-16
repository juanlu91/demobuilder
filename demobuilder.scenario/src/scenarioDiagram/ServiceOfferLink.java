/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Offer Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceOfferLink#getServiceOffer <em>Service Offer</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceOfferLink#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOfferLink()
 * @model annotation="gmf.link source='provider' label.placement='none' target='serviceOffer' target.decoration='arrow' width='2' style='solid' tool.description='Service offers link' color='0,0,0'"
 * @generated
 */
public interface ServiceOfferLink extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Offer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceOffer#getServiceOfferLinks <em>Service Offer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Offer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Offer</em>' reference.
	 * @see #setServiceOffer(ServiceOffer)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOfferLink_ServiceOffer()
	 * @see scenarioDiagram.ServiceOffer#getServiceOfferLinks
	 * @model opposite="serviceOfferLinks"
	 * @generated
	 */
	ServiceOffer getServiceOffer();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceOfferLink#getServiceOffer <em>Service Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Offer</em>' reference.
	 * @see #getServiceOffer()
	 * @generated
	 */
	void setServiceOffer(ServiceOffer value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Provider)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceOfferLink_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceOfferLink#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

} // ServiceOfferLink
