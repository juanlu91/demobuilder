/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenarioDiagram.Provider;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceOffer;
import scenarioDiagram.ServiceOfferLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Offer Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferLinkImpl#getServiceOffer <em>Service Offer</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferLinkImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOfferLinkImpl extends ScenarioElementImpl implements ServiceOfferLink {
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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOfferLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_OFFER_LINK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER, oldServiceOffer, serviceOffer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER, oldServiceOffer, newServiceOffer);
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
				msgs = ((InternalEObject)serviceOffer).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS, ServiceOffer.class, msgs);
			if (newServiceOffer != null)
				msgs = ((InternalEObject)newServiceOffer).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS, ServiceOffer.class, msgs);
			msgs = basicSetServiceOffer(newServiceOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER, newServiceOffer, newServiceOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Provider)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Provider newProvider) {
		Provider oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
				if (serviceOffer != null)
					msgs = ((InternalEObject)serviceOffer).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS, ServiceOffer.class, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
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
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
				if (resolve) return getServiceOffer();
				return basicGetServiceOffer();
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
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
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER:
				setProvider((Provider)newValue);
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
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)null);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER:
				setProvider((Provider)null);
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
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER:
				return serviceOffer != null;
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK__PROVIDER:
				return provider != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOfferLinkImpl
