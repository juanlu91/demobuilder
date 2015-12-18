/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import scenarioDiagram.Actor;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceElement;
import scenarioDiagram.ServiceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceLinkImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceLinkImpl#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLinkImpl extends EObjectImpl implements ServiceLink {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actor;

	/**
	 * The cached value of the '{@link #getServiceElement() <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceElement()
	 * @generated
	 * @ordered
	 */
	protected ServiceElement serviceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Actor)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_LINK__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(Actor newActor, NotificationChain msgs) {
		Actor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_LINK__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, ScenarioDiagramPackage.ACTOR__SERVICE_LINKS, Actor.class, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, ScenarioDiagramPackage.ACTOR__SERVICE_LINKS, Actor.class, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_LINK__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceElement getServiceElement() {
		if (serviceElement != null && serviceElement.eIsProxy()) {
			InternalEObject oldServiceElement = (InternalEObject)serviceElement;
			serviceElement = (ServiceElement)eResolveProxy(oldServiceElement);
			if (serviceElement != oldServiceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, oldServiceElement, serviceElement));
			}
		}
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceElement basicGetServiceElement() {
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceElement(ServiceElement newServiceElement, NotificationChain msgs) {
		ServiceElement oldServiceElement = serviceElement;
		serviceElement = newServiceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, oldServiceElement, newServiceElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceElement(ServiceElement newServiceElement) {
		if (newServiceElement != serviceElement) {
			NotificationChain msgs = null;
			if (serviceElement != null)
				msgs = ((InternalEObject)serviceElement).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, ServiceElement.class, msgs);
			if (newServiceElement != null)
				msgs = ((InternalEObject)newServiceElement).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, ServiceElement.class, msgs);
			msgs = basicSetServiceElement(newServiceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT, newServiceElement, newServiceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				if (actor != null)
					msgs = ((InternalEObject)actor).eInverseRemove(this, ScenarioDiagramPackage.ACTOR__SERVICE_LINKS, Actor.class, msgs);
				return basicSetActor((Actor)otherEnd, msgs);
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				if (serviceElement != null)
					msgs = ((InternalEObject)serviceElement).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_ELEMENT__SERVICE_LINK, ServiceElement.class, msgs);
				return basicSetServiceElement((ServiceElement)otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				return basicSetActor(null, msgs);
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				return basicSetServiceElement(null, msgs);
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
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				if (resolve) return getServiceElement();
				return basicGetServiceElement();
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
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				setActor((Actor)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				setServiceElement((ServiceElement)newValue);
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
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				setActor((Actor)null);
				return;
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				setServiceElement((ServiceElement)null);
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
			case ScenarioDiagramPackage.SERVICE_LINK__ACTOR:
				return actor != null;
			case ScenarioDiagramPackage.SERVICE_LINK__SERVICE_ELEMENT:
				return serviceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceLinkImpl
