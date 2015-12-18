/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scenarioDiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioDiagramFactoryImpl extends EFactoryImpl implements ScenarioDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenarioDiagramFactory init() {
		try {
			ScenarioDiagramFactory theScenarioDiagramFactory = (ScenarioDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ScenarioDiagramPackage.eNS_URI);
			if (theScenarioDiagramFactory != null) {
				return theScenarioDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenarioDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScenarioDiagramPackage.SCENARIO: return createScenario();
			case ScenarioDiagramPackage.CONSUMER: return createConsumer();
			case ScenarioDiagramPackage.PRICING_PLAN: return createPricingPlan();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT: return createPricingPlanElement();
			case ScenarioDiagramPackage.PROVIDER: return createProvider();
			case ScenarioDiagramPackage.SERVICE_NEED: return createServiceNeed();
			case ScenarioDiagramPackage.SERVICE_OFFER: return createServiceOffer();
			case ScenarioDiagramPackage.AGREEMENT_LINK: return createAgreementLink();
			case ScenarioDiagramPackage.SERVICE_LINK: return createServiceLink();
			case ScenarioDiagramPackage.SCENARIO_ELEMENT: return createScenarioElement();
			case ScenarioDiagramPackage.SERVICE_ELEMENT: return createServiceElement();
			case ScenarioDiagramPackage.ACTOR: return createActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScenarioDiagramPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case ScenarioDiagramPackage.ASSESSMENT_INTERVAL:
				return createAssessmentIntervalFromString(eDataType, initialValue);
			case ScenarioDiagramPackage.COMPENSATION_TYPE:
				return createCompensationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScenarioDiagramPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case ScenarioDiagramPackage.ASSESSMENT_INTERVAL:
				return convertAssessmentIntervalToString(eDataType, instanceValue);
			case ScenarioDiagramPackage.COMPENSATION_TYPE:
				return convertCompensationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingPlan createPricingPlan() {
		PricingPlanImpl pricingPlan = new PricingPlanImpl();
		return pricingPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingPlanElement createPricingPlanElement() {
		PricingPlanElementImpl pricingPlanElement = new PricingPlanElementImpl();
		return pricingPlanElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed createServiceNeed() {
		ServiceNeedImpl serviceNeed = new ServiceNeedImpl();
		return serviceNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer createServiceOffer() {
		ServiceOfferImpl serviceOffer = new ServiceOfferImpl();
		return serviceOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementLink createAgreementLink() {
		AgreementLinkImpl agreementLink = new AgreementLinkImpl();
		return agreementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLink createServiceLink() {
		ServiceLinkImpl serviceLink = new ServiceLinkImpl();
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioElement createScenarioElement() {
		ScenarioElementImpl scenarioElement = new ScenarioElementImpl();
		return scenarioElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceElement createServiceElement() {
		ServiceElementImpl serviceElement = new ServiceElementImpl();
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentInterval createAssessmentIntervalFromString(EDataType eDataType, String initialValue) {
		AssessmentInterval result = AssessmentInterval.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssessmentIntervalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensationType createCompensationTypeFromString(EDataType eDataType, String initialValue) {
		CompensationType result = CompensationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompensationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramPackage getScenarioDiagramPackage() {
		return (ScenarioDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioDiagramPackage getPackage() {
		return ScenarioDiagramPackage.eINSTANCE;
	}

} //ScenarioDiagramFactoryImpl
