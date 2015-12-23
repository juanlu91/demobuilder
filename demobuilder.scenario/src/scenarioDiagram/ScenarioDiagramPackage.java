/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scenarioDiagram.ScenarioDiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ScenarioDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenarioDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "es.us.lsi.sma.demobuilder.scenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.us.lsi.sma.demobuilder.scenario";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioDiagramPackage eINSTANCE = scenarioDiagram.impl.ScenarioDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ScenarioImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Scenario Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Agreement Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__AGREEMENT_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SERVICE_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ScenarioElementImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getScenarioElement()
	 * @generated
	 */
	int SCENARIO_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Scenario Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ActorImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SERVICE_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ConsumerImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICE_LINKS = ACTOR__SERVICE_LINKS;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.PricingPlanImpl <em>Pricing Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.PricingPlanImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getPricingPlan()
	 * @generated
	 */
	int PRICING_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Pricing Plan Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN__PRICING_PLAN_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Agreement Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN__AGREEMENT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Service Offer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN__SERVICE_OFFER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN__NAME = 3;

	/**
	 * The number of structural features of the '<em>Pricing Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.PricingPlanElementImpl <em>Pricing Plan Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.PricingPlanElementImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getPricingPlanElement()
	 * @generated
	 */
	int PRICING_PLAN_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>SLO Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__SLO_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Qualifying Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Compensation Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Compensation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__COMPENSATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Compensation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Compensation Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION = 5;

	/**
	 * The number of structural features of the '<em>Pricing Plan Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_PLAN_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ProviderImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SERVICE_LINKS = ACTOR__SERVICE_LINKS;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceElementImpl <em>Service Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceElementImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceElement()
	 * @generated
	 */
	int SERVICE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Service Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__SERVICE_LINK = 0;

	/**
	 * The number of structural features of the '<em>Service Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceNeedImpl <em>Service Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceNeedImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceNeed()
	 * @generated
	 */
	int SERVICE_NEED = 5;

	/**
	 * The feature id for the '<em><b>Service Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__SERVICE_LINK = SERVICE_ELEMENT__SERVICE_LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__NAME = SERVICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agreement Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__AGREEMENT_LINK = SERVICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_FEATURE_COUNT = SERVICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceOfferImpl <em>Service Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceOfferImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceOffer()
	 * @generated
	 */
	int SERVICE_OFFER = 6;

	/**
	 * The feature id for the '<em><b>Service Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__SERVICE_LINK = SERVICE_ELEMENT__SERVICE_LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__NAME = SERVICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__SERVICE_ENDPOINT = SERVICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pricing Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__PRICING_PLANS = SERVICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_FEATURE_COUNT = SERVICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.AgreementLinkImpl <em>Agreement Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.AgreementLinkImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getAgreementLink()
	 * @generated
	 */
	int AGREEMENT_LINK = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__NAME = 2;

	/**
	 * The number of structural features of the '<em>Agreement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceLinkImpl <em>Service Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceLinkImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceLink()
	 * @generated
	 */
	int SERVICE_LINK = 8;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Service Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__SERVICE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Service Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.Role
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 12;

	/**
	 * The meta object id for the '{@link scenarioDiagram.AssessmentInterval <em>Assessment Interval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.AssessmentInterval
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getAssessmentInterval()
	 * @generated
	 */
	int ASSESSMENT_INTERVAL = 13;

	/**
	 * The meta object id for the '{@link scenarioDiagram.CompensationType <em>Compensation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.CompensationType
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getCompensationType()
	 * @generated
	 */
	int COMPENSATION_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link scenarioDiagram.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see scenarioDiagram.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.Scenario#getScenarioElements <em>Scenario Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Elements</em>'.
	 * @see scenarioDiagram.Scenario#getScenarioElements()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ScenarioElements();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.Scenario#getAgreementLinks <em>Agreement Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agreement Links</em>'.
	 * @see scenarioDiagram.Scenario#getAgreementLinks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_AgreementLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.Scenario#getServiceLinks <em>Service Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Links</em>'.
	 * @see scenarioDiagram.Scenario#getServiceLinks()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ServiceLinks();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see scenarioDiagram.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.PricingPlan <em>Pricing Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing Plan</em>'.
	 * @see scenarioDiagram.PricingPlan
	 * @generated
	 */
	EClass getPricingPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.PricingPlan#getPricingPlanElements <em>Pricing Plan Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pricing Plan Elements</em>'.
	 * @see scenarioDiagram.PricingPlan#getPricingPlanElements()
	 * @see #getPricingPlan()
	 * @generated
	 */
	EReference getPricingPlan_PricingPlanElements();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.PricingPlan#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Link</em>'.
	 * @see scenarioDiagram.PricingPlan#getAgreementLink()
	 * @see #getPricingPlan()
	 * @generated
	 */
	EReference getPricingPlan_AgreementLink();

	/**
	 * Returns the meta object for the container reference '{@link scenarioDiagram.PricingPlan#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Offer</em>'.
	 * @see scenarioDiagram.PricingPlan#getServiceOffer()
	 * @see #getPricingPlan()
	 * @generated
	 */
	EReference getPricingPlan_ServiceOffer();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenarioDiagram.PricingPlan#getName()
	 * @see #getPricingPlan()
	 * @generated
	 */
	EAttribute getPricingPlan_Name();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.PricingPlanElement <em>Pricing Plan Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing Plan Element</em>'.
	 * @see scenarioDiagram.PricingPlanElement
	 * @generated
	 */
	EClass getPricingPlanElement();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getSLOExpression <em>SLO Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SLO Expression</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getSLOExpression()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_SLOExpression();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getQualifyingCondition <em>Qualifying Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifying Condition</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getQualifyingCondition()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_QualifyingCondition();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getCompensationInterval <em>Compensation Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Interval</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getCompensationInterval()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_CompensationInterval();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getCompensationType <em>Compensation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Type</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getCompensationType()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_CompensationType();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getCompensationExpression <em>Compensation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Expression</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getCompensationExpression()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_CompensationExpression();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.PricingPlanElement#getCompensationCondition <em>Compensation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Condition</em>'.
	 * @see scenarioDiagram.PricingPlanElement#getCompensationCondition()
	 * @see #getPricingPlanElement()
	 * @generated
	 */
	EAttribute getPricingPlanElement_CompensationCondition();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see scenarioDiagram.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Need</em>'.
	 * @see scenarioDiagram.ServiceNeed
	 * @generated
	 */
	EClass getServiceNeed();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceNeed#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Link</em>'.
	 * @see scenarioDiagram.ServiceNeed#getAgreementLink()
	 * @see #getServiceNeed()
	 * @generated
	 */
	EReference getServiceNeed_AgreementLink();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Offer</em>'.
	 * @see scenarioDiagram.ServiceOffer
	 * @generated
	 */
	EClass getServiceOffer();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ServiceOffer#getServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Endpoint</em>'.
	 * @see scenarioDiagram.ServiceOffer#getServiceEndpoint()
	 * @see #getServiceOffer()
	 * @generated
	 */
	EAttribute getServiceOffer_ServiceEndpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.ServiceOffer#getPricingPlans <em>Pricing Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pricing Plans</em>'.
	 * @see scenarioDiagram.ServiceOffer#getPricingPlans()
	 * @see #getServiceOffer()
	 * @generated
	 */
	EReference getServiceOffer_PricingPlans();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.AgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Link</em>'.
	 * @see scenarioDiagram.AgreementLink
	 * @generated
	 */
	EClass getAgreementLink();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.AgreementLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see scenarioDiagram.AgreementLink#getSource()
	 * @see #getAgreementLink()
	 * @generated
	 */
	EReference getAgreementLink_Source();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.AgreementLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see scenarioDiagram.AgreementLink#getTarget()
	 * @see #getAgreementLink()
	 * @generated
	 */
	EReference getAgreementLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.AgreementLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenarioDiagram.AgreementLink#getName()
	 * @see #getAgreementLink()
	 * @generated
	 */
	EAttribute getAgreementLink_Name();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Link</em>'.
	 * @see scenarioDiagram.ServiceLink
	 * @generated
	 */
	EClass getServiceLink();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceLink#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see scenarioDiagram.ServiceLink#getActor()
	 * @see #getServiceLink()
	 * @generated
	 */
	EReference getServiceLink_Actor();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceLink#getServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Element</em>'.
	 * @see scenarioDiagram.ServiceLink#getServiceElement()
	 * @see #getServiceLink()
	 * @generated
	 */
	EReference getServiceLink_ServiceElement();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ScenarioElement <em>Scenario Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Element</em>'.
	 * @see scenarioDiagram.ScenarioElement
	 * @generated
	 */
	EClass getScenarioElement();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ScenarioElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenarioDiagram.ScenarioElement#getName()
	 * @see #getScenarioElement()
	 * @generated
	 */
	EAttribute getScenarioElement_Name();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Element</em>'.
	 * @see scenarioDiagram.ServiceElement
	 * @generated
	 */
	EClass getServiceElement();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceElement#getServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Link</em>'.
	 * @see scenarioDiagram.ServiceElement#getServiceLink()
	 * @see #getServiceElement()
	 * @generated
	 */
	EReference getServiceElement_ServiceLink();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see scenarioDiagram.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link scenarioDiagram.Actor#getServiceLinks <em>Service Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Links</em>'.
	 * @see scenarioDiagram.Actor#getServiceLinks()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ServiceLinks();

	/**
	 * Returns the meta object for enum '{@link scenarioDiagram.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see scenarioDiagram.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link scenarioDiagram.AssessmentInterval <em>Assessment Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assessment Interval</em>'.
	 * @see scenarioDiagram.AssessmentInterval
	 * @generated
	 */
	EEnum getAssessmentInterval();

	/**
	 * Returns the meta object for enum '{@link scenarioDiagram.CompensationType <em>Compensation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compensation Type</em>'.
	 * @see scenarioDiagram.CompensationType
	 * @generated
	 */
	EEnum getCompensationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenarioDiagramFactory getScenarioDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ScenarioImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCENARIO_ELEMENTS = eINSTANCE.getScenario_ScenarioElements();

		/**
		 * The meta object literal for the '<em><b>Agreement Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__AGREEMENT_LINKS = eINSTANCE.getScenario_AgreementLinks();

		/**
		 * The meta object literal for the '<em><b>Service Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SERVICE_LINKS = eINSTANCE.getScenario_ServiceLinks();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ConsumerImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.PricingPlanImpl <em>Pricing Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.PricingPlanImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getPricingPlan()
		 * @generated
		 */
		EClass PRICING_PLAN = eINSTANCE.getPricingPlan();

		/**
		 * The meta object literal for the '<em><b>Pricing Plan Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_PLAN__PRICING_PLAN_ELEMENTS = eINSTANCE.getPricingPlan_PricingPlanElements();

		/**
		 * The meta object literal for the '<em><b>Agreement Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_PLAN__AGREEMENT_LINK = eINSTANCE.getPricingPlan_AgreementLink();

		/**
		 * The meta object literal for the '<em><b>Service Offer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_PLAN__SERVICE_OFFER = eINSTANCE.getPricingPlan_ServiceOffer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN__NAME = eINSTANCE.getPricingPlan_Name();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.PricingPlanElementImpl <em>Pricing Plan Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.PricingPlanElementImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getPricingPlanElement()
		 * @generated
		 */
		EClass PRICING_PLAN_ELEMENT = eINSTANCE.getPricingPlanElement();

		/**
		 * The meta object literal for the '<em><b>SLO Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__SLO_EXPRESSION = eINSTANCE.getPricingPlanElement_SLOExpression();

		/**
		 * The meta object literal for the '<em><b>Qualifying Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION = eINSTANCE.getPricingPlanElement_QualifyingCondition();

		/**
		 * The meta object literal for the '<em><b>Compensation Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL = eINSTANCE.getPricingPlanElement_CompensationInterval();

		/**
		 * The meta object literal for the '<em><b>Compensation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__COMPENSATION_TYPE = eINSTANCE.getPricingPlanElement_CompensationType();

		/**
		 * The meta object literal for the '<em><b>Compensation Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION = eINSTANCE.getPricingPlanElement_CompensationExpression();

		/**
		 * The meta object literal for the '<em><b>Compensation Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION = eINSTANCE.getPricingPlanElement_CompensationCondition();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ProviderImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceNeedImpl <em>Service Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceNeedImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceNeed()
		 * @generated
		 */
		EClass SERVICE_NEED = eINSTANCE.getServiceNeed();

		/**
		 * The meta object literal for the '<em><b>Agreement Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NEED__AGREEMENT_LINK = eINSTANCE.getServiceNeed_AgreementLink();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceOfferImpl <em>Service Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceOfferImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceOffer()
		 * @generated
		 */
		EClass SERVICE_OFFER = eINSTANCE.getServiceOffer();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OFFER__SERVICE_ENDPOINT = eINSTANCE.getServiceOffer_ServiceEndpoint();

		/**
		 * The meta object literal for the '<em><b>Pricing Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER__PRICING_PLANS = eINSTANCE.getServiceOffer_PricingPlans();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.AgreementLinkImpl <em>Agreement Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.AgreementLinkImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getAgreementLink()
		 * @generated
		 */
		EClass AGREEMENT_LINK = eINSTANCE.getAgreementLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_LINK__SOURCE = eINSTANCE.getAgreementLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_LINK__TARGET = eINSTANCE.getAgreementLink_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_LINK__NAME = eINSTANCE.getAgreementLink_Name();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceLinkImpl <em>Service Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceLinkImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceLink()
		 * @generated
		 */
		EClass SERVICE_LINK = eINSTANCE.getServiceLink();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LINK__ACTOR = eINSTANCE.getServiceLink_Actor();

		/**
		 * The meta object literal for the '<em><b>Service Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LINK__SERVICE_ELEMENT = eINSTANCE.getServiceLink_ServiceElement();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ScenarioElementImpl <em>Scenario Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ScenarioElementImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getScenarioElement()
		 * @generated
		 */
		EClass SCENARIO_ELEMENT = eINSTANCE.getScenarioElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_ELEMENT__NAME = eINSTANCE.getScenarioElement_Name();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceElementImpl <em>Service Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceElementImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceElement()
		 * @generated
		 */
		EClass SERVICE_ELEMENT = eINSTANCE.getServiceElement();

		/**
		 * The meta object literal for the '<em><b>Service Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ELEMENT__SERVICE_LINK = eINSTANCE.getServiceElement_ServiceLink();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ActorImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Service Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SERVICE_LINKS = eINSTANCE.getActor_ServiceLinks();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.Role
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.AssessmentInterval <em>Assessment Interval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.AssessmentInterval
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getAssessmentInterval()
		 * @generated
		 */
		EEnum ASSESSMENT_INTERVAL = eINSTANCE.getAssessmentInterval();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.CompensationType <em>Compensation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.CompensationType
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getCompensationType()
		 * @generated
		 */
		EEnum COMPENSATION_TYPE = eINSTANCE.getCompensationType();

	}

} //ScenarioDiagramPackage
