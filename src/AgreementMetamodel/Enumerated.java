/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Enumerated#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getEnumerated()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='rectangle' tool.name='Enumerated' tool.description='Creates an enumerated domain'"
 * @generated
 */
public interface Enumerated extends Domain {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getEnumerated_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Enumerated
