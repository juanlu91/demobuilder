/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarantee Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.GuaranteeTerm#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.GuaranteeTerm#getRole <em>Role</em>}</li>
 *   <li>{@link AgreementMetamodel.GuaranteeTerm#getSlo <em>Slo</em>}</li>
 *   <li>{@link AgreementMetamodel.GuaranteeTerm#getQualifyingCondition <em>Qualifying Condition</em>}</li>
 *   <li>{@link AgreementMetamodel.GuaranteeTerm#getCompensations <em>Compensations</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm()
 * @model annotation="gmf.node label='id,role' label.pattern='{0} - {1}' label.icon='false' figure='rectangle' tool.name='Guarantee Term' tool.description='Creates a new guarantee term'"
 * @generated
 */
public interface GuaranteeTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"PROVIDER"</code>.
	 * The literals are from the enumeration {@link AgreementMetamodel.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see AgreementMetamodel.Role
	 * @see #setRole(Role)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm_Role()
	 * @model default="PROVIDER"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.GuaranteeTerm#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see AgreementMetamodel.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

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
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.GuaranteeTerm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Slo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo</em>' containment reference.
	 * @see #setSlo(SLO)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm_Slo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SLO getSlo();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.GuaranteeTerm#getSlo <em>Slo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo</em>' containment reference.
	 * @see #getSlo()
	 * @generated
	 */
	void setSlo(SLO value);

	/**
	 * Returns the value of the '<em><b>Qualifying Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifying Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifying Condition</em>' containment reference.
	 * @see #setQualifyingCondition(QualifyingCondition)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm_QualifyingCondition()
	 * @model containment="true"
	 * @generated
	 */
	QualifyingCondition getQualifyingCondition();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.GuaranteeTerm#getQualifyingCondition <em>Qualifying Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifying Condition</em>' containment reference.
	 * @see #getQualifyingCondition()
	 * @generated
	 */
	void setQualifyingCondition(QualifyingCondition value);

	/**
	 * Returns the value of the '<em><b>Compensations</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.Compensation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensations</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getGuaranteeTerm_Compensations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compensation> getCompensations();

} // GuaranteeTerm
