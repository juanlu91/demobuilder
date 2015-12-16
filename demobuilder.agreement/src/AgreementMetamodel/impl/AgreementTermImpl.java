/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.AgreementTerm;
import AgreementMetamodel.GuaranteeTerm;
import AgreementMetamodel.MonitorableProperty;
import AgreementMetamodel.ServiceConfiguration;

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
 * An implementation of the model object '<em><b>Agreement Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.AgreementTermImpl#getServiceConfigurarion <em>Service Configurarion</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.AgreementTermImpl#getMonitorableProperties <em>Monitorable Properties</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.AgreementTermImpl#getGuaranteeTerms <em>Guarantee Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementTermImpl extends EObjectImpl implements AgreementTerm {
	/**
	 * The cached value of the '{@link #getServiceConfigurarion() <em>Service Configurarion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConfigurarion()
	 * @generated
	 * @ordered
	 */
	protected ServiceConfiguration serviceConfigurarion;

	/**
	 * The cached value of the '{@link #getMonitorableProperties() <em>Monitorable Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorableProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitorableProperty> monitorableProperties;

	/**
	 * The cached value of the '{@link #getGuaranteeTerms() <em>Guarantee Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuaranteeTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<GuaranteeTerm> guaranteeTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.AGREEMENT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfiguration getServiceConfigurarion() {
		return serviceConfigurarion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceConfigurarion(ServiceConfiguration newServiceConfigurarion, NotificationChain msgs) {
		ServiceConfiguration oldServiceConfigurarion = serviceConfigurarion;
		serviceConfigurarion = newServiceConfigurarion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION, oldServiceConfigurarion, newServiceConfigurarion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConfigurarion(ServiceConfiguration newServiceConfigurarion) {
		if (newServiceConfigurarion != serviceConfigurarion) {
			NotificationChain msgs = null;
			if (serviceConfigurarion != null)
				msgs = ((InternalEObject)serviceConfigurarion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION, null, msgs);
			if (newServiceConfigurarion != null)
				msgs = ((InternalEObject)newServiceConfigurarion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION, null, msgs);
			msgs = basicSetServiceConfigurarion(newServiceConfigurarion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION, newServiceConfigurarion, newServiceConfigurarion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitorableProperty> getMonitorableProperties() {
		if (monitorableProperties == null) {
			monitorableProperties = new EObjectContainmentEList<MonitorableProperty>(MonitorableProperty.class, this, AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES);
		}
		return monitorableProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuaranteeTerm> getGuaranteeTerms() {
		if (guaranteeTerms == null) {
			guaranteeTerms = new EObjectContainmentEList<GuaranteeTerm>(GuaranteeTerm.class, this, AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS);
		}
		return guaranteeTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION:
				return basicSetServiceConfigurarion(null, msgs);
			case AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES:
				return ((InternalEList<?>)getMonitorableProperties()).basicRemove(otherEnd, msgs);
			case AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS:
				return ((InternalEList<?>)getGuaranteeTerms()).basicRemove(otherEnd, msgs);
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
			case AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION:
				return getServiceConfigurarion();
			case AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES:
				return getMonitorableProperties();
			case AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS:
				return getGuaranteeTerms();
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
			case AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION:
				setServiceConfigurarion((ServiceConfiguration)newValue);
				return;
			case AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES:
				getMonitorableProperties().clear();
				getMonitorableProperties().addAll((Collection<? extends MonitorableProperty>)newValue);
				return;
			case AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS:
				getGuaranteeTerms().clear();
				getGuaranteeTerms().addAll((Collection<? extends GuaranteeTerm>)newValue);
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
			case AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION:
				setServiceConfigurarion((ServiceConfiguration)null);
				return;
			case AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES:
				getMonitorableProperties().clear();
				return;
			case AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS:
				getGuaranteeTerms().clear();
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
			case AgreementMetamodelPackage.AGREEMENT_TERM__SERVICE_CONFIGURARION:
				return serviceConfigurarion != null;
			case AgreementMetamodelPackage.AGREEMENT_TERM__MONITORABLE_PROPERTIES:
				return monitorableProperties != null && !monitorableProperties.isEmpty();
			case AgreementMetamodelPackage.AGREEMENT_TERM__GUARANTEE_TERMS:
				return guaranteeTerms != null && !guaranteeTerms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgreementTermImpl
