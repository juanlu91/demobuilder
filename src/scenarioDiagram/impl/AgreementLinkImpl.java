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
import scenarioDiagram.ServiceOffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.AgreementLinkImpl#getServiceNeed <em>Service Need</em>}</li>
 *   <li>{@link scenarioDiagram.impl.AgreementLinkImpl#getServiceOffer <em>Service Offer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementLinkImpl extends ScenarioElementImpl implements AgreementLink {
	/**
	 * The cached value of the '{@link #getServiceNeed() <em>Service Need</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNeed()
	 * @generated
	 * @ordered
	 */
	protected ServiceNeed serviceNeed;

	/**
	 * The cached value of the '{@link #getServiceOffer() <em>Service Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOffer()
	 * @generated
	 * @ordered
	 */
	protected ServiceOffer serviceOffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.AGREEMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed getServiceNeed() {
		if (serviceNeed != null && serviceNeed.eIsProxy()) {
			InternalEObject oldServiceNeed = (InternalEObject)serviceNeed;
			serviceNeed = (ServiceNeed)eResolveProxy(oldServiceNeed);
			if (serviceNeed != oldServiceNeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, oldServiceNeed, serviceNeed));
			}
		}
		return serviceNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed basicGetServiceNeed() {
		return serviceNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceNeed(ServiceNeed newServiceNeed, NotificationChain msgs) {
		ServiceNeed oldServiceNeed = serviceNeed;
		serviceNeed = newServiceNeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, oldServiceNeed, newServiceNeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNeed(ServiceNeed newServiceNeed) {
		if (newServiceNeed != serviceNeed) {
			NotificationChain msgs = null;
			if (serviceNeed != null)
				msgs = ((InternalEObject)serviceNeed).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
			if (newServiceNeed != null)
				msgs = ((InternalEObject)newServiceNeed).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
			msgs = basicSetServiceNeed(newServiceNeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED, newServiceNeed, newServiceNeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer getServiceOffer() {
		if (serviceOffer != null && serviceOffer.eIsProxy()) {
			InternalEObject oldServiceOffer = (InternalEObject)serviceOffer;
			serviceOffer = (ServiceOffer)eResolveProxy(oldServiceOffer);
			if (serviceOffer != oldServiceOffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, oldServiceOffer, serviceOffer));
			}
		}
		return serviceOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer basicGetServiceOffer() {
		return serviceOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceOffer(ServiceOffer newServiceOffer, NotificationChain msgs) {
		ServiceOffer oldServiceOffer = serviceOffer;
		serviceOffer = newServiceOffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, oldServiceOffer, newServiceOffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOffer(ServiceOffer newServiceOffer) {
		if (newServiceOffer != serviceOffer) {
			NotificationChain msgs = null;
			if (serviceOffer != null)
				msgs = ((InternalEObject)serviceOffer).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
			if (newServiceOffer != null)
				msgs = ((InternalEObject)newServiceOffer).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
			msgs = basicSetServiceOffer(newServiceOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, newServiceOffer, newServiceOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				if (serviceNeed != null)
					msgs = ((InternalEObject)serviceNeed).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__AGREEMENT_LINK, ServiceNeed.class, msgs);
				return basicSetServiceNeed((ServiceNeed)otherEnd, msgs);
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				if (serviceOffer != null)
					msgs = ((InternalEObject)serviceOffer).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK, ServiceOffer.class, msgs);
				return basicSetServiceOffer((ServiceOffer)otherEnd, msgs);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				return basicSetServiceNeed(null, msgs);
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				return basicSetServiceOffer(null, msgs);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				if (resolve) return getServiceNeed();
				return basicGetServiceNeed();
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				if (resolve) return getServiceOffer();
				return basicGetServiceOffer();
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				setServiceNeed((ServiceNeed)newValue);
				return;
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)newValue);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				setServiceNeed((ServiceNeed)null);
				return;
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)null);
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
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_NEED:
				return serviceNeed != null;
			case ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER:
				return serviceOffer != null;
		}
		return super.eIsSet(featureID);
	}

} //AgreementLinkImpl
