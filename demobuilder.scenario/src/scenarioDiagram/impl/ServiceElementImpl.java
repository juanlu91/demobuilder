/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceElement;
import scenarioDiagram.ServiceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceElementImpl#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceElementImpl extends EObjectImpl implements ServiceElement {
	/**
	 * The cached value of the '{@link #getServiceLinks() <em>Service Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceLink> serviceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLink> getServiceLinks() {
		if (serviceLinks == null) {
			serviceLinks = new EObjectWithInverseResolvingEList<ServiceLink>(ServiceLink.class, this, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT);
		}
		return serviceLinks;
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceLinks()).basicAdd(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				return ((InternalEList<?>)getServiceLinks()).basicRemove(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				return getServiceLinks();
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				getServiceLinks().clear();
				getServiceLinks().addAll((Collection<? extends ServiceLink>)newValue);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				getServiceLinks().clear();
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINKS:
				return serviceLinks != null && !serviceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceElementImpl
