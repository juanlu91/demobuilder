/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceOffer;
import scenarioDiagram.ServiceOfferLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getAgreementLink <em>Agreement Link</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getServiceOfferLinks <em>Service Offer Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOfferImpl extends ScenarioElementImpl implements ServiceOffer {
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
	 * The cached value of the '{@link #getServiceOfferLinks() <em>Service Offer Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOfferLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOfferLink> serviceOfferLinks;

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
				msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, AgreementLink.class, msgs);
			if (newAgreementLink != null)
				msgs = ((InternalEObject)newAgreementLink).eInverseAdd(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, AgreementLink.class, msgs);
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
	public EList<ServiceOfferLink> getServiceOfferLinks() {
		if (serviceOfferLinks == null) {
			serviceOfferLinks = new EObjectWithInverseResolvingEList<ServiceOfferLink>(ServiceOfferLink.class, this, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS, ScenarioDiagramPackage.SERVICE_OFFER_LINK__SERVICE_OFFER);
		}
		return serviceOfferLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				if (agreementLink != null)
					msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__SERVICE_OFFER, AgreementLink.class, msgs);
				return basicSetAgreementLink((AgreementLink)otherEnd, msgs);
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceOfferLinks()).basicAdd(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				return basicSetAgreementLink(null, msgs);
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				return ((InternalEList<?>)getServiceOfferLinks()).basicRemove(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				if (resolve) return getAgreementLink();
				return basicGetAgreementLink();
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				return getServiceOfferLinks();
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
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				getServiceOfferLinks().clear();
				getServiceOfferLinks().addAll((Collection<? extends ServiceOfferLink>)newValue);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)null);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				getServiceOfferLinks().clear();
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
			case ScenarioDiagramPackage.SERVICE_OFFER__AGREEMENT_LINK:
				return agreementLink != null;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_OFFER_LINKS:
				return serviceOfferLinks != null && !serviceOfferLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceOfferImpl
