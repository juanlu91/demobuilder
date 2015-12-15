/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Actor#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.Actor#getRole <em>Role</em>}</li>
 *   <li>{@link AgreementMetamodel.Actor#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getActor()
 * @model annotation="gmf.node label='id' label.icon='false' figure='rectangle' tool.name='Actor' tool.description='Creates a new actor'"
 * @generated
 */
public interface Actor extends EObject {
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
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getActor_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Actor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getActor_Role()
	 * @model default="PROVIDER"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Actor#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see AgreementMetamodel.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' attribute.
	 * The default value is <code>"RESPONDER"</code>.
	 * The literals are from the enumeration {@link AgreementMetamodel.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' attribute.
	 * @see AgreementMetamodel.RoleType
	 * @see #setRoleType(RoleType)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getActor_RoleType()
	 * @model default="RESPONDER"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Actor#getRoleType <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' attribute.
	 * @see AgreementMetamodel.RoleType
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // Actor
