/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.AgreementTerm#getServiceConfigurarion <em>Service Configurarion</em>}</li>
 *   <li>{@link AgreementMetamodel.AgreementTerm#getMonitorableProperties <em>Monitorable Properties</em>}</li>
 *   <li>{@link AgreementMetamodel.AgreementTerm#getGuaranteeTerms <em>Guarantee Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementTerm()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='rectangle' tool.name='Agreement Term' tool.description='Creates an agreement terms section'"
 * @generated
 */
public interface AgreementTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Configurarion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Configurarion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Configurarion</em>' containment reference.
	 * @see #setServiceConfigurarion(ServiceConfiguration)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementTerm_ServiceConfigurarion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceConfiguration getServiceConfigurarion();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.AgreementTerm#getServiceConfigurarion <em>Service Configurarion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Configurarion</em>' containment reference.
	 * @see #getServiceConfigurarion()
	 * @generated
	 */
	void setServiceConfigurarion(ServiceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Monitorable Properties</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.MonitorableProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitorable Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitorable Properties</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementTerm_MonitorableProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<MonitorableProperty> getMonitorableProperties();

	/**
	 * Returns the value of the '<em><b>Guarantee Terms</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.GuaranteeTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarantee Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarantee Terms</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementTerm_GuaranteeTerms()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuaranteeTerm> getGuaranteeTerms();

} // AgreementTerm
