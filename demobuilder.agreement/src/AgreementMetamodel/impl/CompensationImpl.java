/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.AssessmentInterval;
import AgreementMetamodel.Compensation;
import AgreementMetamodel.CompensationElement;
import AgreementMetamodel.CompensationType;

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
 * An implementation of the model object '<em><b>Compensation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.CompensationImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.CompensationImpl#getType <em>Type</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.CompensationImpl#getCompensationElements <em>Compensation Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompensationImpl extends EObjectImpl implements Compensation {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentInterval INTERVAL_EDEFAULT = AssessmentInterval.MONTHLY;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected AssessmentInterval interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CompensationType TYPE_EDEFAULT = CompensationType.REWARD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CompensationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompensationElements() <em>Compensation Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CompensationElement> compensationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompensationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.COMPENSATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentInterval getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(AssessmentInterval newInterval) {
		AssessmentInterval oldInterval = interval;
		interval = newInterval == null ? INTERVAL_EDEFAULT : newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.COMPENSATION__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CompensationType newType) {
		CompensationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.COMPENSATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompensationElement> getCompensationElements() {
		if (compensationElements == null) {
			compensationElements = new EObjectContainmentEList<CompensationElement>(CompensationElement.class, this, AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS);
		}
		return compensationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS:
				return ((InternalEList<?>)getCompensationElements()).basicRemove(otherEnd, msgs);
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
			case AgreementMetamodelPackage.COMPENSATION__INTERVAL:
				return getInterval();
			case AgreementMetamodelPackage.COMPENSATION__TYPE:
				return getType();
			case AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS:
				return getCompensationElements();
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
			case AgreementMetamodelPackage.COMPENSATION__INTERVAL:
				setInterval((AssessmentInterval)newValue);
				return;
			case AgreementMetamodelPackage.COMPENSATION__TYPE:
				setType((CompensationType)newValue);
				return;
			case AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS:
				getCompensationElements().clear();
				getCompensationElements().addAll((Collection<? extends CompensationElement>)newValue);
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
			case AgreementMetamodelPackage.COMPENSATION__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case AgreementMetamodelPackage.COMPENSATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS:
				getCompensationElements().clear();
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
			case AgreementMetamodelPackage.COMPENSATION__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case AgreementMetamodelPackage.COMPENSATION__TYPE:
				return type != TYPE_EDEFAULT;
			case AgreementMetamodelPackage.COMPENSATION__COMPENSATION_ELEMENTS:
				return compensationElements != null && !compensationElements.isEmpty();
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
		result.append(" (interval: ");
		result.append(interval);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CompensationImpl
