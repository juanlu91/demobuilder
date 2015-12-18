/**
 */
package scenarioDiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.Scenario;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ScenarioElement;
import scenarioDiagram.ServiceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.ScenarioImpl#getScenarioElements <em>Scenario Elements</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ScenarioImpl#getAgreementLinks <em>Agreement Links</em>}</li>
 *   <li>{@link scenarioDiagram.impl.ScenarioImpl#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends EObjectImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getScenarioElements() <em>Scenario Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioElement> scenarioElements;

	/**
	 * The cached value of the '{@link #getAgreementLinks() <em>Agreement Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AgreementLink> agreementLinks;

	/**
	 * The cached value of the '{@link #getServiceLinks() <em>Service Links</em>}' containment reference list.
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
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioElement> getScenarioElements() {
		if (scenarioElements == null) {
			scenarioElements = new EObjectContainmentEList<ScenarioElement>(ScenarioElement.class, this, ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS);
		}
		return scenarioElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgreementLink> getAgreementLinks() {
		if (agreementLinks == null) {
			agreementLinks = new EObjectContainmentEList<AgreementLink>(AgreementLink.class, this, ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS);
		}
		return agreementLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceLink> getServiceLinks() {
		if (serviceLinks == null) {
			serviceLinks = new EObjectContainmentEList<ServiceLink>(ServiceLink.class, this, ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS);
		}
		return serviceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS:
				return ((InternalEList<?>)getScenarioElements()).basicRemove(otherEnd, msgs);
			case ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS:
				return ((InternalEList<?>)getAgreementLinks()).basicRemove(otherEnd, msgs);
			case ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS:
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
			case ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS:
				return getScenarioElements();
			case ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS:
				return getAgreementLinks();
			case ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS:
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
			case ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS:
				getScenarioElements().clear();
				getScenarioElements().addAll((Collection<? extends ScenarioElement>)newValue);
				return;
			case ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS:
				getAgreementLinks().clear();
				getAgreementLinks().addAll((Collection<? extends AgreementLink>)newValue);
				return;
			case ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS:
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
			case ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS:
				getScenarioElements().clear();
				return;
			case ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS:
				getAgreementLinks().clear();
				return;
			case ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS:
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
			case ScenarioDiagramPackage.SCENARIO__SCENARIO_ELEMENTS:
				return scenarioElements != null && !scenarioElements.isEmpty();
			case ScenarioDiagramPackage.SCENARIO__AGREEMENT_LINKS:
				return agreementLinks != null && !agreementLinks.isEmpty();
			case ScenarioDiagramPackage.SCENARIO__SERVICE_LINKS:
				return serviceLinks != null && !serviceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
