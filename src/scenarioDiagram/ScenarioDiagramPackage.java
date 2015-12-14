/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	String eNS_URI = "es.us.lsi.sma.demobuilder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "es.us.lsi.sma.demobuilder";

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
	int SCENARIO_ELEMENT = 8;

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
	 * The meta object id for the '{@link scenarioDiagram.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.CustomerImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Need Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SERVICE_NEED_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ProviderImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Offer Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SERVICE_OFFER_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceNeedImpl <em>Service Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceNeedImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceNeed()
	 * @generated
	 */
	int SERVICE_NEED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Need Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__SERVICE_NEED_LINK = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agreement Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED__AGREEMENT_LINK = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceOfferImpl <em>Service Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceOfferImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceOffer()
	 * @generated
	 */
	int SERVICE_OFFER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Agreement Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__AGREEMENT_LINK = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Offer Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER__SERVICE_OFFER_LINKS = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.AgreementLinkImpl <em>Agreement Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.AgreementLinkImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getAgreementLink()
	 * @generated
	 */
	int AGREEMENT_LINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Need</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__SERVICE_NEED = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__SERVICE_OFFER = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agreement Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceNeedLinkImpl <em>Service Need Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceNeedLinkImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceNeedLink()
	 * @generated
	 */
	int SERVICE_NEED_LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_LINK__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Need</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_LINK__SERVICE_NEED = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_LINK__CUSTOMER = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Need Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NEED_LINK_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link scenarioDiagram.impl.ServiceOfferLinkImpl <em>Service Offer Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenarioDiagram.impl.ServiceOfferLinkImpl
	 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceOfferLink()
	 * @generated
	 */
	int SERVICE_OFFER_LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_LINK__NAME = SCENARIO_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_LINK__SERVICE_OFFER = SCENARIO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_LINK__PROVIDER = SCENARIO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Offer Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OFFER_LINK_FEATURE_COUNT = SCENARIO_ELEMENT_FEATURE_COUNT + 2;


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
	 * Returns the meta object for class '{@link scenarioDiagram.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see scenarioDiagram.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference list '{@link scenarioDiagram.Customer#getServiceNeedLinks <em>Service Need Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Need Links</em>'.
	 * @see scenarioDiagram.Customer#getServiceNeedLinks()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_ServiceNeedLinks();

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
	 * Returns the meta object for the reference list '{@link scenarioDiagram.Provider#getServiceOfferLinks <em>Service Offer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Offer Links</em>'.
	 * @see scenarioDiagram.Provider#getServiceOfferLinks()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_ServiceOfferLinks();

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
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceNeed#getServiceNeedLink <em>Service Need Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Need Link</em>'.
	 * @see scenarioDiagram.ServiceNeed#getServiceNeedLink()
	 * @see #getServiceNeed()
	 * @generated
	 */
	EReference getServiceNeed_ServiceNeedLink();

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
	 * Returns the meta object for the reference list '{@link scenarioDiagram.ServiceOffer#getServiceOfferLinks <em>Service Offer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Offer Links</em>'.
	 * @see scenarioDiagram.ServiceOffer#getServiceOfferLinks()
	 * @see #getServiceOffer()
	 * @generated
	 */
	EReference getServiceOffer_ServiceOfferLinks();

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
	 * Returns the meta object for the reference '{@link scenarioDiagram.AgreementLink#getServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Need</em>'.
	 * @see scenarioDiagram.AgreementLink#getServiceNeed()
	 * @see #getAgreementLink()
	 * @generated
	 */
	EReference getAgreementLink_ServiceNeed();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.AgreementLink#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Offer</em>'.
	 * @see scenarioDiagram.AgreementLink#getServiceOffer()
	 * @see #getAgreementLink()
	 * @generated
	 */
	EReference getAgreementLink_ServiceOffer();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceNeedLink <em>Service Need Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Need Link</em>'.
	 * @see scenarioDiagram.ServiceNeedLink
	 * @generated
	 */
	EClass getServiceNeedLink();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceNeedLink#getServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Need</em>'.
	 * @see scenarioDiagram.ServiceNeedLink#getServiceNeed()
	 * @see #getServiceNeedLink()
	 * @generated
	 */
	EReference getServiceNeedLink_ServiceNeed();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceNeedLink#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see scenarioDiagram.ServiceNeedLink#getCustomer()
	 * @see #getServiceNeedLink()
	 * @generated
	 */
	EReference getServiceNeedLink_Customer();

	/**
	 * Returns the meta object for class '{@link scenarioDiagram.ServiceOfferLink <em>Service Offer Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Offer Link</em>'.
	 * @see scenarioDiagram.ServiceOfferLink
	 * @generated
	 */
	EClass getServiceOfferLink();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceOfferLink#getServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Offer</em>'.
	 * @see scenarioDiagram.ServiceOfferLink#getServiceOffer()
	 * @see #getServiceOfferLink()
	 * @generated
	 */
	EReference getServiceOfferLink_ServiceOffer();

	/**
	 * Returns the meta object for the reference '{@link scenarioDiagram.ServiceOfferLink#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see scenarioDiagram.ServiceOfferLink#getProvider()
	 * @see #getServiceOfferLink()
	 * @generated
	 */
	EReference getServiceOfferLink_Provider();

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
		 * The meta object literal for the '{@link scenarioDiagram.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.CustomerImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Service Need Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__SERVICE_NEED_LINKS = eINSTANCE.getCustomer_ServiceNeedLinks();

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
		 * The meta object literal for the '<em><b>Service Offer Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__SERVICE_OFFER_LINKS = eINSTANCE.getProvider_ServiceOfferLinks();

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
		 * The meta object literal for the '<em><b>Service Need Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NEED__SERVICE_NEED_LINK = eINSTANCE.getServiceNeed_ServiceNeedLink();

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
		 * The meta object literal for the '<em><b>Agreement Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER__AGREEMENT_LINK = eINSTANCE.getServiceOffer_AgreementLink();

		/**
		 * The meta object literal for the '<em><b>Service Offer Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER__SERVICE_OFFER_LINKS = eINSTANCE.getServiceOffer_ServiceOfferLinks();

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
		 * The meta object literal for the '<em><b>Service Need</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_LINK__SERVICE_NEED = eINSTANCE.getAgreementLink_ServiceNeed();

		/**
		 * The meta object literal for the '<em><b>Service Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_LINK__SERVICE_OFFER = eINSTANCE.getAgreementLink_ServiceOffer();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceNeedLinkImpl <em>Service Need Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceNeedLinkImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceNeedLink()
		 * @generated
		 */
		EClass SERVICE_NEED_LINK = eINSTANCE.getServiceNeedLink();

		/**
		 * The meta object literal for the '<em><b>Service Need</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NEED_LINK__SERVICE_NEED = eINSTANCE.getServiceNeedLink_ServiceNeed();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_NEED_LINK__CUSTOMER = eINSTANCE.getServiceNeedLink_Customer();

		/**
		 * The meta object literal for the '{@link scenarioDiagram.impl.ServiceOfferLinkImpl <em>Service Offer Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenarioDiagram.impl.ServiceOfferLinkImpl
		 * @see scenarioDiagram.impl.ScenarioDiagramPackageImpl#getServiceOfferLink()
		 * @generated
		 */
		EClass SERVICE_OFFER_LINK = eINSTANCE.getServiceOfferLink();

		/**
		 * The meta object literal for the '<em><b>Service Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER_LINK__SERVICE_OFFER = eINSTANCE.getServiceOfferLink_ServiceOffer();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OFFER_LINK__PROVIDER = eINSTANCE.getServiceOfferLink_Provider();

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

	}

} //ScenarioDiagramPackage
