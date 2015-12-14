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
import scenarioDiagram.ServiceNeed;
import scenarioDiagram.ServiceNeedLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceNeedImpl#getServiceNeedLink <em>Service Need Link</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceNeedImpl#getAgreementLink <em>Agreement Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNeedImpl extends ScenarioElementImpl implements ServiceNeed {
	/**
	 * The cached value of the '{@link #getServiceNeedLink() <em>Service Need Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNeedLink()
	 * @generated
	 * @ordered
	 */
	protected ServiceNeedLink serviceNeedLink;

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
	protected ServiceNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeedLink getServiceNeedLink() {
		if (serviceNeedLink != null && serviceNeedLink.eIsProxy()) {
			InternalEObject oldServiceNeedLink = (InternalEObject)serviceNeedLink;
			serviceNeedLink = (ServiceNeedLink)eResolveProxy(oldServiceNeedLink);
			if (serviceNeedLink != oldServiceNeedLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, oldServiceNeedLink, serviceNeedLink));
			}
		}
		return serviceNeedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeedLink basicGetServiceNeedLink() {
		return serviceNeedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceNeedLink(ServiceNeedLink newServiceNeedLink, NotificationChain msgs) {
		ServiceNeedLink oldServiceNeedLink = serviceNeedLink;
		serviceNeedLink = newServiceNeedLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, oldServiceNeedLink, newServiceNeedLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNeedLink(ServiceNeedLink newServiceNeedLink) {
		if (newServiceNeedLink != serviceNeedLink) {
			NotificationChain msgs = null;
			if (serviceNeedLink != null)
				msgs = ((InternalEObject)serviceNeedLink).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, ServiceNeedLink.class, msgs);
			if (newServiceNeedLink != null)
				msgs = ((InternalEObject)newServiceNeedLink).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, ServiceNeedLink.class, msgs);
			msgs = basicSetServiceNeedLink(newServiceNeedLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, newServiceNeedLink, newServiceNeedLink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, oldAgreementLink, agreementLink));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, oldAgreementLink, newAgreementLink);
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
				msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, AgreementLink.class, msgs);
			if (newAgreementLink != null)
				msgs = ((InternalEObject)newAgreementLink).eInverseAdd(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, AgreementLink.class, msgs);
			msgs = basicSetAgreementLink(newAgreementLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, newAgreementLink, newAgreementLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				if (serviceNeedLink != null)
					msgs = ((InternalEObject)serviceNeedLink).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, ServiceNeedLink.class, msgs);
				return basicSetServiceNeedLink((ServiceNeedLink)otherEnd, msgs);
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
				if (agreementLink != null)
					msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, AgreementLink.class, msgs);
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
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				return basicSetServiceNeedLink(null, msgs);
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
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
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				if (resolve) return getServiceNeedLink();
				return basicGetServiceNeedLink();
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
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
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				setServiceNeedLink((ServiceNeedLink)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
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
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				setServiceNeedLink((ServiceNeedLink)null);
				return;
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
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
			case ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK:
				return serviceNeedLink != null;
			case ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK:
				return agreementLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceNeedImpl
