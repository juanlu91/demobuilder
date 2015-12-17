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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import scenarioDiagram.GuaranteeTerm;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ServiceConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ServiceConfigurationImpl#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceConfigurationImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceConfigurationImpl#getMonitorReference <em>Monitor Reference</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceConfigurationImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ServiceConfigurationImpl#getGuaranteTerms <em>Guarante Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConfigurationImpl extends ScenarioElementImpl implements ServiceConfiguration {
	/**
	 * The default value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointReference() <em>Endpoint Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointReference()
	 * @generated
	 * @ordered
	 */
	protected String endpointReference = ENDPOINT_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected String definitionReference = DEFINITION_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITOR_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitorReference() <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorReference()
	 * @generated
	 * @ordered
	 */
	protected String monitorReference = MONITOR_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuaranteTerms() <em>Guarante Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuaranteTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<GuaranteeTerm> guaranteTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SERVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointReference() {
		return endpointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointReference(String newEndpointReference) {
		String oldEndpointReference = endpointReference;
		endpointReference = newEndpointReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE, oldEndpointReference, endpointReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionReference(String newDefinitionReference) {
		String oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE, oldDefinitionReference, definitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonitorReference() {
		return monitorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorReference(String newMonitorReference) {
		String oldMonitorReference = monitorReference;
		monitorReference = newMonitorReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE, oldMonitorReference, monitorReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.SERVICE_CONFIGURATION__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuaranteeTerm> getGuaranteTerms() {
		if (guaranteTerms == null) {
			guaranteTerms = new EObjectContainmentEList<GuaranteeTerm>(GuaranteeTerm.class, this, ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS);
		}
		return guaranteTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS:
				return ((InternalEList<?>)getGuaranteTerms()).basicRemove(otherEnd, msgs);
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
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				return getEndpointReference();
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				return getMonitorReference();
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return getServiceName();
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS:
				return getGuaranteTerms();
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
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				setEndpointReference((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				setDefinitionReference((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				setMonitorReference((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS:
				getGuaranteTerms().clear();
				getGuaranteTerms().addAll((Collection<? extends GuaranteeTerm>)newValue);
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
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				setEndpointReference(ENDPOINT_REFERENCE_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				setDefinitionReference(DEFINITION_REFERENCE_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				setMonitorReference(MONITOR_REFERENCE_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS:
				getGuaranteTerms().clear();
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
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__ENDPOINT_REFERENCE:
				return ENDPOINT_REFERENCE_EDEFAULT == null ? endpointReference != null : !ENDPOINT_REFERENCE_EDEFAULT.equals(endpointReference);
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__DEFINITION_REFERENCE:
				return DEFINITION_REFERENCE_EDEFAULT == null ? definitionReference != null : !DEFINITION_REFERENCE_EDEFAULT.equals(definitionReference);
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__MONITOR_REFERENCE:
				return MONITOR_REFERENCE_EDEFAULT == null ? monitorReference != null : !MONITOR_REFERENCE_EDEFAULT.equals(monitorReference);
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION__GUARANTE_TERMS:
				return guaranteTerms != null && !guaranteTerms.isEmpty();
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
		result.append(" (endpointReference: ");
		result.append(endpointReference);
		result.append(", definitionReference: ");
		result.append(definitionReference);
		result.append(", monitorReference: ");
		result.append(monitorReference);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //ServiceConfigurationImpl
