/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.PricingPlan#getPricingPlanElements <em>Pricing Plan Elements</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlan#getAgreementLink <em>Agreement Link</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlan#getServiceOffer <em>Service Offer</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlan#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlan()
 * @model annotation="gmf.node label='name' border.color='0,0,0' border.width='1' border.style='solid' label.icon='false' figure='rectangle' tool.name='Pricing Plan' tool.description='Creates a new pricing plan' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/PricingPlan.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/PricingPlan.gif'"
 * @generated
 */
public interface PricingPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Pricing Plan Elements</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.PricingPlanElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Plan Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Plan Elements</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlan_PricingPlanElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PricingPlanElement> getPricingPlanElements();

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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlan_AgreementLink()
	 * @see scenarioDiagram.AgreementLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	AgreementLink getAgreementLink();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlan#getAgreementLink <em>Agreement Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Link</em>' reference.
	 * @see #getAgreementLink()
	 * @generated
	 */
	void setAgreementLink(AgreementLink value);

	/**
	 * Returns the value of the '<em><b>Service Offer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceOffer#getGuaranteeTerms <em>Guarantee Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Offer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Offer</em>' container reference.
	 * @see #setServiceOffer(ServiceOffer)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlan_ServiceOffer()
	 * @see scenarioDiagram.ServiceOffer#getGuaranteeTerms
	 * @model opposite="guaranteeTerms" transient="false"
	 * @generated
	 */
	ServiceOffer getServiceOffer();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlan#getServiceOffer <em>Service Offer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Offer</em>' container reference.
	 * @see #getServiceOffer()
	 * @generated
	 */
	void setServiceOffer(ServiceOffer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PricingPlan
