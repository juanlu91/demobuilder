/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.Compensation;
import AgreementMetamodel.GuaranteeTerm;
import AgreementMetamodel.QualifyingCondition;
import AgreementMetamodel.Role;
import AgreementMetamodel.SLO;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guarantee Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.GuaranteeTermImpl#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.GuaranteeTermImpl#getRole <em>Role</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.GuaranteeTermImpl#getSlo <em>Slo</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.GuaranteeTermImpl#getQualifyingCondition <em>Qualifying Condition</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.GuaranteeTermImpl#getCompensations <em>Compensations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuaranteeTermImpl extends EObjectImpl implements GuaranteeTerm {
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
	 * The cached value of the '{@link #getSlo() <em>Slo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlo()
	 * @generated
	 * @ordered
	 */
	protected SLO slo;

	/**
	 * The cached value of the '{@link #getQualifyingCondition() <em>Qualifying Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifyingCondition()
	 * @generated
	 * @ordered
	 */
	protected QualifyingCondition qualifyingCondition;

	/**
	 * The cached value of the '{@link #getCompensations() <em>Compensations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensations()
	 * @generated
	 * @ordered
	 */
	protected EList<Compensation> compensations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuaranteeTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.GUARANTEE_TERM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLO getSlo() {
		return slo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlo(SLO newSlo, NotificationChain msgs) {
		SLO oldSlo = slo;
		slo = newSlo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__SLO, oldSlo, newSlo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlo(SLO newSlo) {
		if (newSlo != slo) {
			NotificationChain msgs = null;
			if (slo != null)
				msgs = ((InternalEObject)slo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.GUARANTEE_TERM__SLO, null, msgs);
			if (newSlo != null)
				msgs = ((InternalEObject)newSlo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.GUARANTEE_TERM__SLO, null, msgs);
			msgs = basicSetSlo(newSlo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__SLO, newSlo, newSlo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifyingCondition getQualifyingCondition() {
		return qualifyingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifyingCondition(QualifyingCondition newQualifyingCondition, NotificationChain msgs) {
		QualifyingCondition oldQualifyingCondition = qualifyingCondition;
		qualifyingCondition = newQualifyingCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION, oldQualifyingCondition, newQualifyingCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifyingCondition(QualifyingCondition newQualifyingCondition) {
		if (newQualifyingCondition != qualifyingCondition) {
			NotificationChain msgs = null;
			if (qualifyingCondition != null)
				msgs = ((InternalEObject)qualifyingCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION, null, msgs);
			if (newQualifyingCondition != null)
				msgs = ((InternalEObject)newQualifyingCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION, null, msgs);
			msgs = basicSetQualifyingCondition(newQualifyingCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION, newQualifyingCondition, newQualifyingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compensation> getCompensations() {
		if (compensations == null) {
			compensations = new EObjectContainmentEList<Compensation>(Compensation.class, this, AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS);
		}
		return compensations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.GUARANTEE_TERM__SLO:
				return basicSetSlo(null, msgs);
			case AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION:
				return basicSetQualifyingCondition(null, msgs);
			case AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS:
				return ((InternalEList<?>)getCompensations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementMetamodelPackage.GUARANTEE_TERM__ID:
				return getId();
			case AgreementMetamodelPackage.GUARANTEE_TERM__ROLE:
				return getRole();
			case AgreementMetamodelPackage.GUARANTEE_TERM__SLO:
				return getSlo();
			case AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION:
				return getQualifyingCondition();
			case AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS:
				return getCompensations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementMetamodelPackage.GUARANTEE_TERM__ID:
				setId((String)newValue);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__ROLE:
				setRole((Role)newValue);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__SLO:
				setSlo((SLO)newValue);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION:
				setQualifyingCondition((QualifyingCondition)newValue);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS:
				getCompensations().clear();
				getCompensations().addAll((Collection<? extends Compensation>)newValue);
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
			case AgreementMetamodelPackage.GUARANTEE_TERM__ID:
				setId(ID_EDEFAULT);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__SLO:
				setSlo((SLO)null);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION:
				setQualifyingCondition((QualifyingCondition)null);
				return;
			case AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS:
				getCompensations().clear();
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
			case AgreementMetamodelPackage.GUARANTEE_TERM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AgreementMetamodelPackage.GUARANTEE_TERM__ROLE:
				return role != ROLE_EDEFAULT;
			case AgreementMetamodelPackage.GUARANTEE_TERM__SLO:
				return slo != null;
			case AgreementMetamodelPackage.GUARANTEE_TERM__QUALIFYING_CONDITION:
				return qualifyingCondition != null;
			case AgreementMetamodelPackage.GUARANTEE_TERM__COMPENSATIONS:
				return compensations != null && !compensations.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //GuaranteeTermImpl
