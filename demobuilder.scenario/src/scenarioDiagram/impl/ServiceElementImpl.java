/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 *   <li>{@link scenarioDiagram.impl.ServiceElementImpl#getServiceLink <em>Service Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceElementImpl extends EObjectImpl implements ServiceElement {
	/**
	 * The cached value of the '{@link #getServiceLink() <em>Service Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLink()
	 * @generated
	 * @ordered
	 */
	protected ServiceLink serviceLink;

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
	public ServiceLink getServiceLink() {
		if (serviceLink != null && serviceLink.eIsProxy()) {
			InternalEObject oldServiceLink = (InternalEObject)serviceLink;
			serviceLink = (ServiceLink)eResolveProxy(oldServiceLink);
			if (serviceLink != oldServiceLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, oldServiceLink, serviceLink));
			}
		}
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLink basicGetServiceLink() {
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceLink(ServiceLink newServiceLink, NotificationChain msgs) {
		ServiceLink oldServiceLink = serviceLink;
		serviceLink = newServiceLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, oldServiceLink, newServiceLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLink(ServiceLink newServiceLink) {
		if (newServiceLink != serviceLink) {
			NotificationChain msgs = null;
			if (serviceLink != null)
				msgs = ((InternalEObject)serviceLink).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, ServiceLink.class, msgs);
			if (newServiceLink != null)
				msgs = ((InternalEObject)newServiceLink).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, ServiceLink.class, msgs);
			msgs = basicSetServiceLink(newServiceLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, newServiceLink, newServiceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				if (serviceLink != null)
					msgs = ((InternalEObject)serviceLink).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, ServiceLink.class, msgs);
				return basicSetServiceLink((ServiceLink)otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				return basicSetServiceLink(null, msgs);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				if (resolve) return getServiceLink();
				return basicGetServiceLink();
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				setServiceLink((ServiceLink)newValue);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				setServiceLink((ServiceLink)null);
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
			case ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK:
				return serviceLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceElementImpl
