/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scenarioDiagram.Actor;
import scenarioDiagram.AgreementLink;
import scenarioDiagram.AssessmentInterval;
import scenarioDiagram.CompensationType;
import scenarioDiagram.Consumer;
import scenarioDiagram.GuaranteeTerm;
import scenarioDiagram.Provider;
import scenarioDiagram.Role;
import scenarioDiagram.Scenario;
import scenarioDiagram.ScenarioDiagramFactory;
import scenarioDiagram.ScenarioDiagramPackage;
import scenarioDiagram.ScenarioElement;
import scenarioDiagram.ServiceConfiguration;
import scenarioDiagram.ServiceElement;
import scenarioDiagram.ServiceLink;
import scenarioDiagram.ServiceNeed;
import scenarioDiagram.ServiceOffer;

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
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guaranteeTermEClass = null;

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
	private EClass serviceConfigurationEClass = null;

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
	private EClass serviceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assessmentIntervalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compensationTypeEEnum = null;

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
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuaranteeTerm() {
		return guaranteeTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_Expression() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_Condition() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_CompensationInterval() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_CompensationType() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_CompensationExpression() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_CompensationCondition() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(5);
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
	public EClass getServiceNeed() {
		return serviceNeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNeed_AgreementLink() {
		return (EReference)serviceNeedEClass.getEStructuralFeatures().get(0);
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
	public EReference getServiceOffer_ServiceConfiguration() {
		return (EReference)serviceOfferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceOffer_AgreementLink() {
		return (EReference)serviceOfferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConfiguration() {
		return serviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_EndpointReference() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_DefinitionReference() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_MonitorReference() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConfiguration_ServiceName() {
		return (EAttribute)serviceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfiguration_GuaranteTerms() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(4);
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
	public EReference getAgreementLink_Source() {
		return (EReference)agreementLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementLink_Target() {
		return (EReference)agreementLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLink() {
		return serviceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLink_Actor() {
		return (EReference)serviceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceLink_ServiceElement() {
		return (EReference)serviceLinkEClass.getEStructuralFeatures().get(1);
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
	public EClass getServiceElement() {
		return serviceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceElement_ServiceLinks() {
		return (EReference)serviceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ServiceLinks() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssessmentInterval() {
		return assessmentIntervalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompensationType() {
		return compensationTypeEEnum;
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

		consumerEClass = createEClass(CONSUMER);

		guaranteeTermEClass = createEClass(GUARANTEE_TERM);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__EXPRESSION);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__CONDITION);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__COMPENSATION_INTERVAL);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__COMPENSATION_TYPE);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__COMPENSATION_EXPRESSION);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__COMPENSATION_CONDITION);

		providerEClass = createEClass(PROVIDER);

		serviceNeedEClass = createEClass(SERVICE_NEED);
		createEReference(serviceNeedEClass, SERVICE_NEED__AGREEMENT_LINK);

		serviceOfferEClass = createEClass(SERVICE_OFFER);
		createEReference(serviceOfferEClass, SERVICE_OFFER__SERVICE_CONFIGURATION);
		createEReference(serviceOfferEClass, SERVICE_OFFER__AGREEMENT_LINK);

		serviceConfigurationEClass = createEClass(SERVICE_CONFIGURATION);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__ENDPOINT_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__DEFINITION_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__MONITOR_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__SERVICE_NAME);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__GUARANTE_TERMS);

		agreementLinkEClass = createEClass(AGREEMENT_LINK);
		createEReference(agreementLinkEClass, AGREEMENT_LINK__SOURCE);
		createEReference(agreementLinkEClass, AGREEMENT_LINK__TARGET);

		serviceLinkEClass = createEClass(SERVICE_LINK);
		createEReference(serviceLinkEClass, SERVICE_LINK__ACTOR);
		createEReference(serviceLinkEClass, SERVICE_LINK__SERVICE_ELEMENT);

		scenarioElementEClass = createEClass(SCENARIO_ELEMENT);
		createEAttribute(scenarioElementEClass, SCENARIO_ELEMENT__NAME);

		serviceElementEClass = createEClass(SERVICE_ELEMENT);
		createEReference(serviceElementEClass, SERVICE_ELEMENT__SERVICE_LINKS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__SERVICE_LINKS);

		// Create enums
		roleEEnum = createEEnum(ROLE);
		assessmentIntervalEEnum = createEEnum(ASSESSMENT_INTERVAL);
		compensationTypeEEnum = createEEnum(COMPENSATION_TYPE);
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
		consumerEClass.getESuperTypes().add(this.getScenarioElement());
		consumerEClass.getESuperTypes().add(this.getActor());
		guaranteeTermEClass.getESuperTypes().add(this.getScenarioElement());
		providerEClass.getESuperTypes().add(this.getScenarioElement());
		providerEClass.getESuperTypes().add(this.getActor());
		serviceNeedEClass.getESuperTypes().add(this.getServiceElement());
		serviceNeedEClass.getESuperTypes().add(this.getScenarioElement());
		serviceOfferEClass.getESuperTypes().add(this.getServiceElement());
		serviceOfferEClass.getESuperTypes().add(this.getScenarioElement());
		serviceConfigurationEClass.getESuperTypes().add(this.getScenarioElement());
		agreementLinkEClass.getESuperTypes().add(this.getScenarioElement());
		serviceLinkEClass.getESuperTypes().add(this.getScenarioElement());

		// Initialize classes and features; add operations and parameters
		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_ScenarioElement(), this.getScenarioElement(), null, "scenarioElement", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guaranteeTermEClass, GuaranteeTerm.class, "GuaranteeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuaranteeTerm_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_CompensationInterval(), this.getAssessmentInterval(), "compensationInterval", "MONTHLY", 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_CompensationType(), this.getCompensationType(), "compensationType", "REWARD", 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_CompensationExpression(), ecorePackage.getEString(), "compensationExpression", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_CompensationCondition(), ecorePackage.getEString(), "compensationCondition", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceNeedEClass, ServiceNeed.class, "ServiceNeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNeed_AgreementLink(), this.getAgreementLink(), this.getAgreementLink_Source(), "agreementLink", null, 0, 1, ServiceNeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOfferEClass, ServiceOffer.class, "ServiceOffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOffer_ServiceConfiguration(), this.getServiceConfiguration(), null, "serviceConfiguration", null, 0, 1, ServiceOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOffer_AgreementLink(), this.getAgreementLink(), this.getAgreementLink_Target(), "agreementLink", null, 0, 1, ServiceOffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigurationEClass, ServiceConfiguration.class, "ServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceConfiguration_EndpointReference(), ecorePackage.getEString(), "endpointReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_DefinitionReference(), ecorePackage.getEString(), "definitionReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_MonitorReference(), ecorePackage.getEString(), "monitorReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfiguration_GuaranteTerms(), this.getGuaranteeTerm(), null, "guaranteTerms", null, 0, -1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementLinkEClass, AgreementLink.class, "AgreementLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementLink_Source(), this.getServiceNeed(), this.getServiceNeed_AgreementLink(), "source", null, 0, 1, AgreementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementLink_Target(), this.getServiceOffer(), this.getServiceOffer_AgreementLink(), "target", null, 0, 1, AgreementLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLinkEClass, ServiceLink.class, "ServiceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLink_Actor(), this.getActor(), this.getActor_ServiceLinks(), "actor", null, 0, 1, ServiceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLink_ServiceElement(), this.getServiceElement(), this.getServiceElement_ServiceLinks(), "serviceElement", null, 0, 1, ServiceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioElementEClass, ScenarioElement.class, "ScenarioElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenarioElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScenarioElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceElementEClass, ServiceElement.class, "ServiceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceElement_ServiceLinks(), this.getServiceLink(), this.getServiceLink_ServiceElement(), "serviceLinks", null, 0, -1, ServiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_ServiceLinks(), this.getServiceLink(), this.getServiceLink_Actor(), "serviceLinks", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.PROVIDER);
		addEEnumLiteral(roleEEnum, Role.CONSUMER);

		initEEnum(assessmentIntervalEEnum, AssessmentInterval.class, "AssessmentInterval");
		addEEnumLiteral(assessmentIntervalEEnum, AssessmentInterval.YEARLY);
		addEEnumLiteral(assessmentIntervalEEnum, AssessmentInterval.MONTHLY);
		addEEnumLiteral(assessmentIntervalEEnum, AssessmentInterval.WEEKLY);
		addEEnumLiteral(assessmentIntervalEEnum, AssessmentInterval.DAILY);
		addEEnumLiteral(assessmentIntervalEEnum, AssessmentInterval.HOURLY);

		initEEnum(compensationTypeEEnum, CompensationType.class, "CompensationType");
		addEEnumLiteral(compensationTypeEEnum, CompensationType.PENALTY);
		addEEnumLiteral(compensationTypeEEnum, CompensationType.REWARD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.affixed
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
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
		  (consumerEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/Consumer.svg",
			 "label", "name",
			 "tool.name", "Consumer",
			 "tool.description", "Creates a consumer",
			 "label.placement", "external",
			 "label.icon", "false",
			 "size", "100,100",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/Consumer.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/Consumer.gif"
		   });	
		addAnnotation
		  (guaranteeTermEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/GuaranteeTerm.svg",
			 "tool.name", "Guarantee Term",
			 "tool.description", "Creates a new guarantee term",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/GuaranteeTerm.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/GuaranteeTerm.gif"
		   });	
		addAnnotation
		  (providerEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/Provider.svg",
			 "label", "name",
			 "tool.name", "Provider",
			 "tool.description", "Creates a provider",
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
			 "tool.name", "Service Need",
			 "tool.description", "Creates a service need",
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
			 "tool.name", "Service Offer",
			 "tool.description", "Creates a service offer",
			 "size", "50,50",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/ServiceOffer.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/ServiceOffer.gif"
		   });	
		addAnnotation
		  (serviceConfigurationEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/demobuilder.scenario/icons/serviceConfiguration.svg",
			 "tool.name", "Service Configuration",
			 "tool.description", "Creates a service configuration section",
			 "tool.small.bundle", "demobuilder.scenario.edit",
			 "tool.small.path", "/icons/full/obj16/ServiceConfiguration.gif",
			 "tool.large.bundle", "demobuilder.scenario.edit",
			 "tool.large.path", "/icons/full/obj32/ServiceConfiguration.gif"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.affixed";	
		addAnnotation
		  (getServiceOffer_ServiceConfiguration(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getServiceConfiguration_GuaranteTerms(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (agreementLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "label", "name",
			 "width", "1",
			 "style", "dash",
			 "tool.name", "Agreement Link",
			 "tool.description", "Creates an agreement link",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (serviceLinkEClass, 
		   source, 
		   new String[] {
			 "source", "actor",
			 "target", "serviceElement",
			 "label.placement", "none",
			 "width", "2",
			 "style", "solid",
			 "tool.name", "Service Link",
			 "tool.description", "Creates a service link",
			 "color", "0,0,0"
		   });
	}

} //ScenarioDiagramPackageImpl
