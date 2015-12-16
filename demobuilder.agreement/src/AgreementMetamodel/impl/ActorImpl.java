/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.Actor;
import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.Role;
import AgreementMetamodel.RoleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.ActorImpl#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ActorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.ActorImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends EObjectImpl implements Actor {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.PROVIDER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected static final RoleType ROLE_TYPE_EDEFAULT = RoleType.RESPONDER;

	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleType = ROLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.ACTOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.ACTOR__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleType() {
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(RoleType newRoleType) {
		RoleType oldRoleType = roleType;
		roleType = newRoleType == null ? ROLE_TYPE_EDEFAULT : newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.ACTOR__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementMetamodelPackage.ACTOR__ID:
				return getId();
			case AgreementMetamodelPackage.ACTOR__ROLE:
				return getRole();
			case AgreementMetamodelPackage.ACTOR__ROLE_TYPE:
				return getRoleType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementMetamodelPackage.ACTOR__ID:
				setId((String)newValue);
				return;
			case AgreementMetamodelPackage.ACTOR__ROLE:
				setRole((Role)newValue);
				return;
			case AgreementMetamodelPackage.ACTOR__ROLE_TYPE:
				setRoleType((RoleType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.ACTOR__ID:
				setId(ID_EDEFAULT);
				return;
			case AgreementMetamodelPackage.ACTOR__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.ACTOR__ROLE_TYPE:
				setRoleType(ROLE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.ACTOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AgreementMetamodelPackage.ACTOR__ROLE:
				return role != ROLE_EDEFAULT;
			case AgreementMetamodelPackage.ACTOR__ROLE_TYPE:
				return roleType != ROLE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", role: ");
		result.append(role);
		result.append(", roleType: ");
		result.append(roleType);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
