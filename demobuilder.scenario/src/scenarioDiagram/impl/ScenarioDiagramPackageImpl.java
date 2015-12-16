/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scenarioDiagram.AgreementLink;
import scenarioDiagram.Customer;
import scenarioDiagram.Provider;
import scenarioDiagram.Scenario;
import scenarioDiagram.ScenarioDiagramFactory;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ScenarioElement;
import scenarioDiagram.ServiceNeed;
import scenarioDiagram.ServiceNeedLink;
import scenarioDiagram.ServiceOffer;
import scenarioDiagram.ServiceOfferLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioDiagramPackageImpl extends EPackageImpl implements ScenarioDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOfferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNeedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOfferLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see scenarioDiagram.ScenarioDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScenarioDiagramPackageImpl() {
		super(eNS_URI, ScenarioDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScenarioDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScenarioDiagramPackage init() {
		if (isInited) return (ScenarioDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioDiagramPackage.eNS_URI);

		// Obtain or create and register package
		ScenarioDiagramPackageImpl theScenarioDiagramPackage = (ScenarioDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScenarioDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScenarioDiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theScenarioDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theScenarioDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenarioDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScenarioDiagramPackage.eNS_URI, theScenarioDiagramPackage);
		return theScenarioDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ScenarioElement() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_ServiceNeedLinks() {
		return (EReference)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_ServiceOfferLinks() {
		return (EReference)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNeed() {
		return serviceNeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNeed_ServiceNeedLink() {
		return (EReference)serviceNeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNeed_AgreementLink() {
		return (EReference)serviceNeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOffer() {
		return serviceOfferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOffer_AgreementLink() {
		return (EReference)serviceOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOffer_ServiceOfferLinks() {
		return (EReference)serviceOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementLink() {
		return agreementLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementLink_ServiceNeed() {
		return (EReference)agreementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementLink_ServiceOffer() {
		return (EReference)agreementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNeedLink() {
		return serviceNeedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNeedLink_ServiceNeed() {
		return (EReference)serviceNeedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNeedLink_Customer() {
		return (EReference)serviceNeedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOfferLink() {
		return serviceOfferLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOfferLink_ServiceOffer() {
		return (EReference)serviceOfferLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOfferLink_Provider() {
		return (EReference)serviceOfferLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioElement() {
		return scenarioElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioElement_Name() {
		return (EAttribute)scenarioElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramFactory getScenarioDiagramFactory() {
		return (ScenarioDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__SCENARIO_ELEMENT);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__SERVICE_NEED_LINKS);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__SERVICE_OFFER_LINKS);

		serviceNeedEClass = createEClass(SERVICE_NEED);
		createEReference(serviceNeedEClass, SERVICE_NEED__SERVICE_NEED_LINK);
		createEReference(serviceNeedEClass, SERVICE_NEED__AGREEMENT_LINK);

		serviceOfferEClass = createEClass(SERVICE_OFFER);
		createEReference(serviceOfferEClass, SERVICE_OFFER__AGREEMENT_LINK);
		createEReference(serviceOfferEClass, SERVICE_OFFER__SERVICE_OFFER_LINKS);

		agreementLinkEClass = createEClass(AGREEMENT_LINK);
		createEReference(agreementLinkEClass, AGREEMENT_LINK__SERVICE_NEED);
		createEReference(agreementLinkEClass, AGREEMENT_LINK__SERVICE_OFFER);

		serviceNeedLinkEClass = createEClass(SERVICE_NEED_LINK);
		createEReference(serviceNeedLinkEClass, SERVICE_NEED_LINK__SERVICE_NEED);
		createEReference(serviceNeedLinkEClass, SERVICE_NEED_LINK__CUSTOMER);

		serviceOfferLinkEClass = createEClass(SERVICE_OFFER_LINK);
		createEReference(serviceOfferLinkEClass, SERVICE_OFFER_LINK__SERVICE_OFFER);
		createEReference(serviceOfferLinkEClass, SERVICE_OFFER_LINK__PROVIDER);

		scenarioElementEClass = createEClass(SCENARIO_ELEMENT);
		createEAttribute(scenarioElementEClass, SCENARIO_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customerEClass.getESuperTypes().add(this.getScenarioElement());
		providerEClass.getESuperTypes().add(this.getScenarioElement());
		serviceNeedEClass.getESuperTypes().add(this.getScenarioElement());
		serviceOfferEClass.getESuperTypes().add(this.getScenarioElement());
		agreementLinkEClass.getESuperTypes().add(this.getScenarioElement());
		serviceNeedLinkEClass.getESuperTypes().add(this.getScenarioElement());
		serviceOfferLinkEClass.getESuperTypes().add(this.getScenarioElement());

		// Initialize classes and features; add operations and parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_ScenarioElement(), this.getScenarioElement(), null, "scenarioElement", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_ServiceNeedLinks(), this.getServiceNeedLink(), this.getServiceNeedLink_Customer(), "serviceNeedLinks", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_ServiceOfferLinks(), this.getServiceOfferLink(), null, "serviceOfferLinks", null, 0, -1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNeedEClass, ServiceNeed.class, "ServiceNeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNeed_ServiceNeedLink(), this.getServiceNeedLink(), this.getServiceNeedLink_ServiceNeed(), "serviceNeedLink", null, 0, 1, ServiceNeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceNeed_AgreementLink(), this.getAgreementLink(), this.getAgreementLink_ServiceNeed(), "agreementLink", null, 0, 1, ServiceNeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOfferEClass, ServiceOffer.class, "ServiceOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOffer_AgreementLink(), this.getAgreementLink(), this.getAgreementLink_ServiceOffer(), "agreementLink", null, 0, 1, ServiceOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOffer_ServiceOfferLinks(), this.getServiceOfferLink(), this.getServiceOfferLink_ServiceOffer(), "serviceOfferLinks", null, 0, -1, ServiceOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementLinkEClass, AgreementLink.class, "AgreementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementLink_ServiceNeed(), this.getServiceNeed(), this.getServiceNeed_AgreementLink(), "serviceNeed", null, 0, 1, AgreementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementLink_ServiceOffer(), this.getServiceOffer(), this.getServiceOffer_AgreementLink(), "serviceOffer", null, 0, 1, AgreementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNeedLinkEClass, ServiceNeedLink.class, "ServiceNeedLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNeedLink_ServiceNeed(), this.getServiceNeed(), this.getServiceNeed_ServiceNeedLink(), "serviceNeed", null, 0, 1, ServiceNeedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceNeedLink_Customer(), this.getCustomer(), this.getCustomer_ServiceNeedLinks(), "customer", null, 0, 1, ServiceNeedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOfferLinkEClass, ServiceOfferLink.class, "ServiceOfferLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOfferLink_ServiceOffer(), this.getServiceOffer(), this.getServiceOffer_ServiceOfferLinks(), "serviceOffer", null, 0, 1, ServiceOfferLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOfferLink_Provider(), this.getProvider(), null, "provider", null, 0, 1, ServiceOfferLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioElementEClass, ScenarioElement.class, "ScenarioElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenarioElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScenarioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (scenarioEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (scenarioEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (customerEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/Customer.svg",
			 "label", "name",
			 "tool.description", "Customer",
			 "label.placement", "external",
			 "label.icon", "false",
			 "size", "100,100",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/Customer.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/Customer.gif"
		   });	
		addAnnotation
		  (providerEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/Provider.svg",
			 "label", "name",
			 "tool.description", "Provider",
			 "label.placement", "external",
			 "label.icon", "false",
			 "size", "100,100",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/Provider.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/Provider.gif"
		   });	
		addAnnotation
		  (serviceNeedEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/serviceNeed.svg",
			 "label", "name",
			 "label.placement", "external",
			 "label.icon", "false",
			 "tool.description", "Service Need",
			 "size", "50,50",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/ServiceNeed.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/ServiceNeed.gif"
		   });	
		addAnnotation
		  (serviceOfferEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/serviceOffer.svg",
			 "label", "name",
			 "label.placement", "external",
			 "label.icon", "false",
			 "tool.description", "Service Offer",
			 "size", "50,50",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/ServiceOffer.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/ServiceOffer.gif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (agreementLinkEClass, 
		   source, 
		   new String[] {
			 "source", "serviceNeed",
			 "label", "name",
			 "target", "serviceOffer",
			 "width", "1",
			 "style", "dash",
			 "tool.description", "Agreement link",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (serviceNeedLinkEClass, 
		   source, 
		   new String[] {
			 "source", "customer",
			 "label.placement", "none",
			 "target", "serviceNeed",
			 "target.decoration", "arrow",
			 "width", "2",
			 "style", "solid",
			 "tool.description", "Service needs link",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (serviceOfferLinkEClass, 
		   source, 
		   new String[] {
			 "source", "provider",
			 "label.placement", "none",
			 "target", "serviceOffer",
			 "target.decoration", "arrow",
			 "width", "2",
			 "style", "solid",
			 "tool.description", "Service offers link",
			 "color", "0,0,0"
		   });
	}

} //ScenarioDiagramPackageImpl
