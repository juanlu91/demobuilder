/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenarioDiagram.Customer;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceNeed;
import scenarioDiagram.ServiceNeedLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Need Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceNeedLinkImpl#getServiceNeed <em>Service Need</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceNeedLinkImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNeedLinkImpl extends ScenarioElementImpl implements ServiceNeedLink {
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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNeedLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_NEED_LINK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, oldServiceNeed, serviceNeed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, oldServiceNeed, newServiceNeed);
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
				msgs = ((InternalEObject)serviceNeed).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, ServiceNeed.class, msgs);
			if (newServiceNeed != null)
				msgs = ((InternalEObject)newServiceNeed).eInverseAdd(this, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, ServiceNeed.class, msgs);
			msgs = basicSetServiceNeed(newServiceNeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED, newServiceNeed, newServiceNeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				if (serviceNeed != null)
					msgs = ((InternalEObject)serviceNeed).eInverseRemove(this, ScenarioDiagramPackage.SERVICE_NEED__SERVICE_NEED_LINK, ServiceNeed.class, msgs);
				return basicSetServiceNeed((ServiceNeed)otherEnd, msgs);
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, ScenarioDiagramPackage.CUSTOMER__SERVICE_NEED_LINKS, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				return basicSetServiceNeed(null, msgs);
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				return basicSetCustomer(null, msgs);
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
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				if (resolve) return getServiceNeed();
				return basicGetServiceNeed();
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
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
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				setServiceNeed((ServiceNeed)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				setCustomer((Customer)newValue);
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
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				setServiceNeed((ServiceNeed)null);
				return;
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				setCustomer((Customer)null);
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
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__SERVICE_NEED:
				return serviceNeed != null;
			case ScenarioDiagramPackage.SERVICE_NEED_LINK__CUSTOMER:
				return customer != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceNeedLinkImpl
