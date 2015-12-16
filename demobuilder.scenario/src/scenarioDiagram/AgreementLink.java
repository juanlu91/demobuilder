/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.AgreementLink#getServiceNeed <em>Service Need</em>}</li>
 *   <li>{@link scenarioDiagram.AgreementLink#getServiceOffer <em>Service Offer</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink()
 * @model annotation="gmf.link source='serviceNeed' label='name' target='serviceOffer' width='1' style='dash' tool.description='Agreement link' color='0,0,0'"
 * @generated
 */
public interface AgreementLink extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Need</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceNeed#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Need</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Need</em>' reference.
	 * @see #setServiceNeed(ServiceNeed)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink_ServiceNeed()
	 * @see scenarioDiagram.ServiceNeed#getAgreementLink
	 * @model opposite="agreementLink"
	 * @generated
	 */
	ServiceNeed getServiceNeed();

	/**
	 * Sets the value of the '{@link scenarioDiagram.AgreementLink#getServiceNeed <em>Service Need</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Need</em>' reference.
	 * @see #getServiceNeed()
	 * @generated
	 */
	void setServiceNeed(ServiceNeed value);

	/**
	 * Returns the value of the '<em><b>Service Offer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Offer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Offer</em>' reference.
	 * @see #setServiceOffer(ServiceOffer)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink_ServiceOffer()
	 * @see scenarioDiagram.ServiceOffer#getAgreementLink
	 * @model opposite="agreementLink"
	 * @generated
	 */
	ServiceOffer getServiceOffer();

	/**
	 * Sets the value of the '{@link scenarioDiagram.AgreementLink#getServiceOffer <em>Service Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Offer</em>' reference.
	 * @see #getServiceOffer()
	 * @generated
	 */
	void setServiceOffer(ServiceOffer value);

} // AgreementLink
