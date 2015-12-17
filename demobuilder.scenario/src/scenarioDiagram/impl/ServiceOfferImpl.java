/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ScenarioElement;
import scenarioDiagram.ServiceConfiguration;
import scenarioDiagram.ServiceOffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getName <em>Name</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getServiceConfiguration <em>Service Configuration</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getAgreementLink <em>Agreement Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOfferImpl extends ServiceElementImpl implements ServiceOffer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceConfiguration() <em>Service Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ServiceConfiguration serviceConfiguration;

	/**
	 * The cached value of the '{@link #getAgreementLink() <em>Agreement Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementLink()
	 * @generated
	 * @ordered
	 */
	protected AgreementLink agreementLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOfferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_OFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfiguration getServiceConfiguration() {
		return serviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceConfiguration(ServiceConfiguration newServiceConfiguration, NotificationChain msgs) {
		ServiceConfiguration oldServiceConfiguration = serviceConfiguration;
		serviceConfiguration = newServiceConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION, oldServiceConfiguration, newServiceConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConfiguration(ServiceConfiguration newServiceConfiguration) {
		if (newServiceConfiguration != serviceConfiguration) {
			NotificationChain msgs = null;
			if (serviceConfiguration != null)
				msgs = ((InternalEObject)serviceConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION, null, msgs);
			if (newServiceConfiguration != null)
				msgs = ((InternalEObject)newServiceConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION, null, msgs);
			msgs = basicSetServiceConfiguration(newServiceConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION, newServiceConfiguration, newServiceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementLink getAgreementLink() {
		if (agreementLink != null && agreementLink.eIsProxy()) {
			InternalEObject oldAgreementLink = (InternalEObject)agreementLink;
			agreementLink = (AgreementLink)eResolveProxy(oldAgreementLink);
			if (agreementLink != oldAgreementLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, oldAgreementLink, agreementLink));
			}
		}
		return agreementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementLink basicGetAgreementLink() {
		return agreementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgreementLink(AgreementLink newAgreementLink, NotificationChain msgs) {
		AgreementLink oldAgreementLink = agreementLink;
		agreementLink = newAgreementLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, oldAgreementLink, newAgreementLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementLink(AgreementLink newAgreementLink) {
		if (newAgreementLink != agreementLink) {
			NotificationChain msgs = null;
			if (agreementLink != null)
				msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, AgreementLink.class, msgs);
			if (newAgreementLink != null)
				msgs = ((InternalEObject)newAgreementLink).eInverseAdd(this, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, AgreementLink.class, msgs);
			msgs = basicSetAgreementLink(newAgreementLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, newAgreementLink, newAgreementLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				if (agreementLink != null)
					msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, AgreementLink.class, msgs);
				return basicSetAgreementLink((AgreementLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION:
				return basicSetServiceConfiguration(null, msgs);
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				return basicSetAgreementLink(null, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__NAME:
				return getName();
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION:
				return getServiceConfiguration();
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				if (resolve) return getAgreementLink();
				return basicGetAgreementLink();
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
			case ScenarioDiagramPackage.SERVICE_OFFER__NAME:
				setName((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION:
				setServiceConfiguration((ServiceConfiguration)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)newValue);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION:
				setServiceConfiguration((ServiceConfiguration)null);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)null);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_CONFIGURATION:
				return serviceConfiguration != null;
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				return agreementLink != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ScenarioElement.class) {
			switch (derivedFeatureID) {
				case ScenarioDiagramPackage.SERVICE_OFFER__NAME: return ScenarioDiagramPackage.SCENARIO_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ScenarioElement.class) {
			switch (baseFeatureID) {
				case ScenarioDiagramPackage.SCENARIO_ELEMENT__NAME: return ScenarioDiagramPackage.SERVICE_OFFER__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceOfferImpl
