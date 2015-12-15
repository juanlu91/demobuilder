/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Value#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getValue()
 * @model annotation="gmf.node label='id' label.icon='false' figure='rectangle' tool.name='Value' tool.description='Creates a new value'"
 * @generated
 */
public interface Value extends EObject {
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
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getValue_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Value#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Value
