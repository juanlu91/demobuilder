/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.AgreementModel#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.AgreementModel#getVersion <em>Version</em>}</li>
 *   <li>{@link AgreementMetamodel.AgreementModel#getContext <em>Context</em>}</li>
 *   <li>{@link AgreementMetamodel.AgreementModel#getAgTerm <em>Ag Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementModel()
 * @model annotation="gmf.node label='id' label.icon='false' figure='rectangle' tool.name='Agreement' tool.description='Creates a new agreement'"
 * @generated
 */
public interface AgreementModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementModel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.AgreementModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(double)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementModel_Version()
	 * @model
	 * @generated
	 */
	double getVersion();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.AgreementModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(double value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementModel_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.AgreementModel#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Ag Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ag Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ag Term</em>' containment reference.
	 * @see #setAgTerm(AgreementTerm)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementModel_AgTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AgreementTerm getAgTerm();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.AgreementModel#getAgTerm <em>Ag Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ag Term</em>' containment reference.
	 * @see #getAgTerm()
	 * @generated
	 */
	void setAgTerm(AgreementTerm value);

} // AgreementModel
