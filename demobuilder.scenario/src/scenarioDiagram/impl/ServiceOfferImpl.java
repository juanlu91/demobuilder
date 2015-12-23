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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.PricingPlan;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ScenarioElement;
import scenarioDiagram.ServiceOffer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Offer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getName <em>Name</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getServiceEndpoint <em>Service Endpoint</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceOfferImpl#getPricingPlans <em>Pricing Plans</em>}</li>
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
	 * The default value of the '{@link #getServiceEndpoint() <em>Service Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceEndpoint() <em>Service Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String serviceEndpoint = SERVICE_ENDPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPricingPlans() <em>Pricing Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingPlan> pricingPlans;

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
	public String getServiceEndpoint() {
		return serviceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceEndpoint(String newServiceEndpoint) {
		String oldServiceEndpoint = serviceEndpoint;
		serviceEndpoint = newServiceEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_ENDPOINT, oldServiceEndpoint, serviceEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingPlan> getPricingPlans() {
		if (pricingPlans == null) {
			pricingPlans = new EObjectContainmentWithInverseEList<PricingPlan>(PricingPlan.class, this, ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS, ScenarioDiagramPackage.PRICING_PLAN__SERVICE_OFFER);
		}
		return pricingPlans;
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
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingPlans()).basicAdd(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				return ((InternalEList<?>)getPricingPlans()).basicRemove(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_ENDPOINT:
				return getServiceEndpoint();
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				return getPricingPlans();
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
			case ScenarioDiagramPackage.SERVICE_OFFER__NAME:
				setName((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_ENDPOINT:
				setServiceEndpoint((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				getPricingPlans().clear();
				getPricingPlans().addAll((Collection<? extends PricingPlan>)newValue);
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
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_ENDPOINT:
				setServiceEndpoint(SERVICE_ENDPOINT_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				getPricingPlans().clear();
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
			case ScenarioDiagramPackage.SERVICE_OFFER__SERVICE_ENDPOINT:
				return SERVICE_ENDPOINT_EDEFAULT == null ? serviceEndpoint != null : !SERVICE_ENDPOINT_EDEFAULT.equals(serviceEndpoint);
			case ScenarioDiagramPackage.SERVICE_OFFER__PRICING_PLANS:
				return pricingPlans != null && !pricingPlans.isEmpty();
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
		result.append(", serviceEndpoint: ");
		result.append(serviceEndpoint);
		result.append(')');
		return result.toString();
	}

} //ServiceOfferImpl
