/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.Customer;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceNeedLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.CustomerImpl#getServiceNeedLinks <em>Service Need Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends ScenarioElementImpl implements Customer {
	/**
	 * The cached value of the '{@link #getServiceNeedLinks() <em>Service Need Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNeedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceNeedLink> serviceNeedLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceNeedLink> getServiceNeedLinks() {
		if (serviceNeedLinks == null) {
			serviceNeedLinks = new EObjectWithInverseResolvingEList<ServiceNeedLink>(ServiceNeedLink.class, this, ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS, ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER);
		}
		return serviceNeedLinks;
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceNeedLinks()).basicAdd(otherEnd, msgs);
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				return ((InternalEList<?>)getServiceNeedLinks()).basicRemove(otherEnd, msgs);
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				return getServiceNeedLinks();
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				getServiceNeedLinks().clear();
				getServiceNeedLinks().addAll((Collection<? extends ServiceNeedLink>)newValue);
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				getServiceNeedLinks().clear();
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
			case ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS:
				return serviceNeedLinks != null && !serviceNeedLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerImpl
