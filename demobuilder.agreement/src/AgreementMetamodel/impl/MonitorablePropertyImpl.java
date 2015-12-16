/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.MonitorableProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitorable Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.MonitorablePropertyImpl#getMonitorReference <em>Monitor Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorablePropertyImpl extends PropertyImpl implements MonitorableProperty {
	/**
	 * The default value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITOR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected String monitorReference = MONITOR_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorablePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.MONITORABLE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonitorReference() {
		return monitorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorReference(String newMonitorReference) {
		String oldMonitorReference = monitorReference;
		monitorReference = newMonitorReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.MONITORABLE_PROPERTY__MONITOR_REFERENCE, oldMonitorReference, monitorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementMetamodelPackage.MONITORABLE_PROPERTY__MONITOR_REFERENCE:
				return getMonitorReference();
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
			case AgreementMetamodelPackage.MONITORABLE_PROPERTY__MONITOR_REFERENCE:
				setMonitorReference((String)newValue);
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
			case AgreementMetamodelPackage.MONITORABLE_PROPERTY__MONITOR_REFERENCE:
				setMonitorReference(MONITOR_REFERENCE_EDEFAULT);
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
			case AgreementMetamodelPackage.MONITORABLE_PROPERTY__MONITOR_REFERENCE:
				return MONITOR_REFERENCE_EDEFAULT == null ? monitorReference != null : !MONITOR_REFERENCE_EDEFAULT.equals(monitorReference);
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
		result.append(" (monitorReference: ");
		result.append(monitorReference);
		result.append(')');
		return result.toString();
	}

} //MonitorablePropertyImpl
