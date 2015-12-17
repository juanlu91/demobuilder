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
	 * The feature id for the '<em><b>Scenario Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 1;

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
	int CONSUMER__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICE_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.GuaranteeTermImpl <em>Guarantee Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.GuaranteeTermImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getGuaranteeTerm()
	 * @generated
	 */
	int GUARANTEE_TERM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__EXPRESSION = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__CONDITION = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensation Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__COMPENSATION_INTERVAL = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__COMPENSATION_TYPE = SCENARIO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__COMPENSATION_EXPRESSION = SCENARIO_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compensation Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__COMPENSATION_CONDITION = SCENARIO_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Guarantee Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ProviderImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SERVICE_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ELEMENT__SERVICE_LINKS = 0;

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
	int SERVICE_NEED = 4;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__SERVICE_LINKS = SERVICE_ELEMENT__SERVICE_LINKS;

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
	int SERVICE_OFFER = 5;

	/**
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__SERVICE_LINKS = SERVICE_ELEMENT__SERVICE_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__NAME = SERVICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__SERVICE_CONFIGURATION = SERVICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agreement Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__AGREEMENT_LINK = SERVICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_FEATURE_COUNT = SERVICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceConfigurationImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceConfiguration()
	 * @generated
	 */
	int SERVICE_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__ENDPOINT_REFERENCE = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__DEFINITION_REFERENCE = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__MONITOR_REFERENCE = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__SERVICE_NAME = SCENARIO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guarante Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__GUARANTE_TERMS = SCENARIO_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__SOURCE = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__TARGET = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agreement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__ACTOR = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK__SERVICE_ELEMENT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LINK_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Service Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SERVICE_LINKS = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

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
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.Scenario#getScenarioElement <em>Scenario Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Element</em>'.
	 * @see scenarioDiagram.Scenario#getScenarioElement()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ScenarioElement();

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
	 * Returns the meta object for class '{@link scenarioDiagram.GuaranteeTerm <em>Guarantee Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarantee Term</em>'.
	 * @see scenarioDiagram.GuaranteeTerm
	 * @generated
	 */
	EClass getGuaranteeTerm();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getExpression()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_Expression();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getCondition()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_Condition();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getCompensationInterval <em>Compensation Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Interval</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getCompensationInterval()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_CompensationInterval();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getCompensationType <em>Compensation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Type</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getCompensationType()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_CompensationType();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getCompensationExpression <em>Compensation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Expression</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getCompensationExpression()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_CompensationExpression();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.GuaranteeTerm#getCompensationCondition <em>Compensation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Condition</em>'.
	 * @see scenarioDiagram.GuaranteeTerm#getCompensationCondition()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_CompensationCondition();

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
	 * Returns the meta object for the containment reference '{@link scenarioDiagram.ServiceOffer#getServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Configuration</em>'.
	 * @see scenarioDiagram.ServiceOffer#getServiceConfiguration()
	 * @see #getServiceOffer()
	 * @generated
	 */
	EReference getServiceOffer_ServiceConfiguration();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceOffer#getAgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agreement Link</em>'.
	 * @see scenarioDiagram.ServiceOffer#getAgreementLink()
	 * @see #getServiceOffer()
	 * @generated
	 */
	EReference getServiceOffer_AgreementLink();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Configuration</em>'.
	 * @see scenarioDiagram.ServiceConfiguration
	 * @generated
	 */
	EClass getServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Reference</em>'.
	 * @see scenarioDiagram.ServiceConfiguration#getEndpointReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_EndpointReference();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Reference</em>'.
	 * @see scenarioDiagram.ServiceConfiguration#getDefinitionReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_DefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Reference</em>'.
	 * @see scenarioDiagram.ServiceConfiguration#getMonitorReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_MonitorReference();

	/**
	 * Returns the meta object for the attribute '{@link scenarioDiagram.ServiceConfiguration#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see scenarioDiagram.ServiceConfiguration#getServiceName()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_ServiceName();

	/**
	 * Returns the meta object for the containment reference list '{@link scenarioDiagram.ServiceConfiguration#getGuaranteTerms <em>Guarante Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guarante Terms</em>'.
	 * @see scenarioDiagram.ServiceConfiguration#getGuaranteTerms()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_GuaranteTerms();

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
	 * Returns the meta object for the reference list '{@link scenarioDiagram.ServiceElement#getServiceLinks <em>Service Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Links</em>'.
	 * @see scenarioDiagram.ServiceElement#getServiceLinks()
	 * @see #getServiceElement()
	 * @generated
	 */
	EReference getServiceElement_ServiceLinks();

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
		 * The meta object literal for the '<em><b>Scenario Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SCENARIO_ELEMENT = eINSTANCE.getScenario_ScenarioElement();

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
		 * The meta object literal for the '{@link scenarioDiagram.impl.GuaranteeTermImpl <em>Guarantee Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.GuaranteeTermImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getGuaranteeTerm()
		 * @generated
		 */
		EClass GUARANTEE_TERM = eINSTANCE.getGuaranteeTerm();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__EXPRESSION = eINSTANCE.getGuaranteeTerm_Expression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__CONDITION = eINSTANCE.getGuaranteeTerm_Condition();

		/**
		 * The meta object literal for the '<em><b>Compensation Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__COMPENSATION_INTERVAL = eINSTANCE.getGuaranteeTerm_CompensationInterval();

		/**
		 * The meta object literal for the '<em><b>Compensation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__COMPENSATION_TYPE = eINSTANCE.getGuaranteeTerm_CompensationType();

		/**
		 * The meta object literal for the '<em><b>Compensation Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__COMPENSATION_EXPRESSION = eINSTANCE.getGuaranteeTerm_CompensationExpression();

		/**
		 * The meta object literal for the '<em><b>Compensation Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__COMPENSATION_CONDITION = eINSTANCE.getGuaranteeTerm_CompensationCondition();

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
		 * The meta object literal for the '<em><b>Service Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER__SERVICE_CONFIGURATION = eINSTANCE.getServiceOffer_ServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Agreement Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER__AGREEMENT_LINK = eINSTANCE.getServiceOffer_AgreementLink();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceConfigurationImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceConfiguration()
		 * @generated
		 */
		EClass SERVICE_CONFIGURATION = eINSTANCE.getServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Endpoint Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__ENDPOINT_REFERENCE = eINSTANCE.getServiceConfiguration_EndpointReference();

		/**
		 * The meta object literal for the '<em><b>Definition Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__DEFINITION_REFERENCE = eINSTANCE.getServiceConfiguration_DefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Monitor Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__MONITOR_REFERENCE = eINSTANCE.getServiceConfiguration_MonitorReference();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONFIGURATION__SERVICE_NAME = eINSTANCE.getServiceConfiguration_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Guarante Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__GUARANTE_TERMS = eINSTANCE.getServiceConfiguration_GuaranteTerms();

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
		 * The meta object literal for the '<em><b>Service Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_ELEMENT__SERVICE_LINKS = eINSTANCE.getServiceElement_ServiceLinks();

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
