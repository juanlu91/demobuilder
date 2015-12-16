/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Compensation#getInterval <em>Interval</em>}</li>
 *   <li>{@link AgreementMetamodel.Compensation#getType <em>Type</em>}</li>
 *   <li>{@link AgreementMetamodel.Compensation#getCompensationElements <em>Compensation Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getCompensation()
 * @model annotation="gmf.node label='interval,type' label.pattern='with {0} {1}' label.icon='false' figure='rectangle' tool.name='Compensation' tool.description='Creates a new compensation'"
 * @generated
 */
public interface Compensation extends EObject {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * The default value is <code>"MONTHLY"</code>.
	 * The literals are from the enumeration {@link AgreementMetamodel.AssessmentInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see AgreementMetamodel.AssessmentInterval
	 * @see #setInterval(AssessmentInterval)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getCompensation_Interval()
	 * @model default="MONTHLY"
	 * @generated
	 */
	AssessmentInterval getInterval();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Compensation#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see AgreementMetamodel.AssessmentInterval
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(AssessmentInterval value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"REWARD"</code>.
	 * The literals are from the enumeration {@link AgreementMetamodel.CompensationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see AgreementMetamodel.CompensationType
	 * @see #setType(CompensationType)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getCompensation_Type()
	 * @model default="REWARD"
	 * @generated
	 */
	CompensationType getType();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Compensation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see AgreementMetamodel.CompensationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CompensationType value);

	/**
	 * Returns the value of the '<em><b>Compensation Elements</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.CompensationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Elements</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getCompensation_CompensationElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompensationElement> getCompensationElements();

} // Compensation
