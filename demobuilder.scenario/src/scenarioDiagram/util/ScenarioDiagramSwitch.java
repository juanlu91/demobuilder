/**
 */
package scenarioDiagram.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import scenarioDiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see scenarioDiagram.ScenarioDiagramPackage
 * @generated
 */
public class ScenarioDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ScenarioDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScenarioDiagramPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.CONSUMER: {
				Consumer consumer = (Consumer)theEObject;
				T result = caseConsumer(consumer);
				if (result == null) result = caseScenarioElement(consumer);
				if (result == null) result = caseActor(consumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.GUARANTEE_TERM: {
				GuaranteeTerm guaranteeTerm = (GuaranteeTerm)theEObject;
				T result = caseGuaranteeTerm(guaranteeTerm);
				if (result == null) result = caseScenarioElement(guaranteeTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = caseScenarioElement(provider);
				if (result == null) result = caseActor(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SERVICE_NEED: {
				ServiceNeed serviceNeed = (ServiceNeed)theEObject;
				T result = caseServiceNeed(serviceNeed);
				if (result == null) result = caseServiceElement(serviceNeed);
				if (result == null) result = caseScenarioElement(serviceNeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SERVICE_OFFER: {
				ServiceOffer serviceOffer = (ServiceOffer)theEObject;
				T result = caseServiceOffer(serviceOffer);
				if (result == null) result = caseServiceElement(serviceOffer);
				if (result == null) result = caseScenarioElement(serviceOffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SERVICE_CONFIGURATION: {
				ServiceConfiguration serviceConfiguration = (ServiceConfiguration)theEObject;
				T result = caseServiceConfiguration(serviceConfiguration);
				if (result == null) result = caseScenarioElement(serviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.AGREEMENT_LINK: {
				AgreementLink agreementLink = (AgreementLink)theEObject;
				T result = caseAgreementLink(agreementLink);
				if (result == null) result = caseScenarioElement(agreementLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SERVICE_LINK: {
				ServiceLink serviceLink = (ServiceLink)theEObject;
				T result = caseServiceLink(serviceLink);
				if (result == null) result = caseScenarioElement(serviceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SCENARIO_ELEMENT: {
				ScenarioElement scenarioElement = (ScenarioElement)theEObject;
				T result = caseScenarioElement(scenarioElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.SERVICE_ELEMENT: {
				ServiceElement serviceElement = (ServiceElement)theEObject;
				T result = caseServiceElement(serviceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScenarioDiagramPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumer(Consumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guarantee Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guarantee Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuaranteeTerm(GuaranteeTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Need</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Need</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNeed(ServiceNeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOffer(ServiceOffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConfiguration(ServiceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agreement Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agreement Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgreementLink(AgreementLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLink(ServiceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioElement(ScenarioElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceElement(ServiceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScenarioDiagramSwitch
