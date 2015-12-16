/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifying Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.QualifyingCondition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getQualifyingCondition()
 * @model annotation="gmf.node label='expression' label.pattern='onlyIf({0})' label.icon='false' figure='rectangle' tool.name='Qualifying Condition' tool.description='Creates a new qualifying condition'"
 * @generated
 */
public interface QualifyingCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getQualifyingCondition_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.QualifyingCondition#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // QualifyingCondition
