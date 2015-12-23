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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.PricingPlan;
import scenarioDiagram.PricingPlanElement;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceOffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.PricingPlanImpl#getPricingPlanElements <em>Pricing Plan Elements</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanImpl#getAgreementLink <em>Agreement Link</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanImpl#getServiceOffer <em>Service Offer</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PricingPlanImpl extends EObjectImpl implements PricingPlan {
	/**
	 * The cached value of the '{@link #getPricingPlanElements() <em>Pricing Plan Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingPlanElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingPlanElement> pricingPlanElements;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.PRICING_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingPlanElement> getPricingPlanElements() {
		if (pricingPlanElements == null) {
			pricingPlanElements = new EObjectContainmentEList<PricingPlanElement>(PricingPlanElement.class, this, ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS);
		}
		return pricingPlanElements;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK, oldAgreementLink, agreementLink));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK, oldAgreementLink, newAgreementLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK, newAgreementLink, newAgreementLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer getServiceOffer() {
		if (eContainerFeatureID() != ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER) return null;
		return (ServiceOffer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceOffer(ServiceOffer newServiceOffer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceOffer, ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOffer(ServiceOffer newServiceOffer) {
		if (newServiceOffer != eInternalContainer() || (eContainerFeatureID() != ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER && newServiceOffer != null)) {
			if (EcoreUtil.isAncestor(this, newServiceOffer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceOffer != null)
				msgs = ((InternalEObject)newServiceOffer).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS, ServiceOffer.class, msgs);
			msgs = basicSetServiceOffer(newServiceOffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER, newServiceOffer, newServiceOffer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				if (agreementLink != null)
					msgs = ((InternalEObject)agreementLink).eInverseRemove(this, ScenarioDiagramPackage.AGREEMENT_LINK__TARGET, AgreementLink.class, msgs);
				return basicSetAgreementLink((AgreementLink)otherEnd, msgs);
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS:
				return ((InternalEList<?>)getPricingPlanElements()).basicRemove(otherEnd, msgs);
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				return basicSetAgreementLink(null, msgs);
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				return eInternalContainer().eInverseRemove(this, ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS, ServiceOffer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS:
				return getPricingPlanElements();
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				if (resolve) return getAgreementLink();
				return basicGetAgreementLink();
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				return getServiceOffer();
			case ScenarioDiagramPackage.PRICING_PLAN__NAME:
				return getName();
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
			case ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS:
				getPricingPlanElements().clear();
				getPricingPlanElements().addAll((Collection<? extends PricingPlanElement>)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__NAME:
				setName((String)newValue);
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
			case ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS:
				getPricingPlanElements().clear();
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				setAgreementLink((AgreementLink)null);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				setServiceOffer((ServiceOffer)null);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN__NAME:
				setName(NAME_EDEFAULT);
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
			case ScenarioDiagramPackage.PRICING_PLAN__PRICING_PLAN_ELEMENTS:
				return pricingPlanElements != null && !pricingPlanElements.isEmpty();
			case ScenarioDiagramPackage.PRICING_PLAN__AGREEMENT_LINK:
				return agreementLink != null;
			case ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER:
				return getServiceOffer() != null;
			case ScenarioDiagramPackage.PRICING_PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PricingPlanImpl
