/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.AgreementLink#getSource <em>Source</em>}</li>
 *   <li>{@link scenarioDiagram.AgreementLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink()
 * @model annotation="gmf.link source='source' target='target' label='name' width='1' style='dash' tool.name='Agreement Link' tool.description='Creates an agreement link' color='0,0,0'"
 * @generated
 */
public interface AgreementLink extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceNeed#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ServiceNeed)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink_Source()
	 * @see scenarioDiagram.ServiceNeed#getAgreementLink
	 * @model opposite="agreementLink"
	 * @generated
	 */
	ServiceNeed getSource();

	/**
	 * Sets the value of the '{@link scenarioDiagram.AgreementLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ServiceNeed value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ServiceOffer)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getAgreementLink_Target()
	 * @see scenarioDiagram.ServiceOffer#getAgreementLink
	 * @model opposite="agreementLink"
	 * @generated
	 */
	ServiceOffer getTarget();

	/**
	 * Sets the value of the '{@link scenarioDiagram.AgreementLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ServiceOffer value);

} // AgreementLink
