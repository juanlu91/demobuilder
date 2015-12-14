/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import scenarioDiagram.Provider;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceOfferLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ProviderImpl#getServiceOfferLinks <em>Service Offer Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderImpl extends ScenarioElementImpl implements Provider {
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
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOfferLink> getServiceOfferLinks() {
		if (serviceOfferLinks == null) {
			serviceOfferLinks = new EObjectResolvingEList<ServiceOfferLink>(ServiceOfferLink.class, this, ScenarioDiagramPackage.PROVIDER__SERVICE_OFFER_LINKS);
		}
		return serviceOfferLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioDiagramPackage.PROVIDER__SERVICE_OFFER_LINKS:
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
			case ScenarioDiagramPackage.PROVIDER__SERVICE_OFFER_LINKS:
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
			case ScenarioDiagramPackage.PROVIDER__SERVICE_OFFER_LINKS:
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
			case ScenarioDiagramPackage.PROVIDER__SERVICE_OFFER_LINKS:
				return serviceOfferLinks != null && !serviceOfferLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProviderImpl
