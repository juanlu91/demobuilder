/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.Actor;
import AgreementMetamodel.AgreementCompositor;
import AgreementMetamodel.AgreementMetamodelFactory;
import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.AgreementModel;
import AgreementMetamodel.AgreementTerm;
import AgreementMetamodel.AssessmentInterval;
import AgreementMetamodel.Compensation;
import AgreementMetamodel.CompensationElement;
import AgreementMetamodel.CompensationType;
import AgreementMetamodel.ConfigurationProperty;
import AgreementMetamodel.Context;
import AgreementMetamodel.Datatype;
import AgreementMetamodel.Domain;
import AgreementMetamodel.Enumerated;
import AgreementMetamodel.Feature;
import AgreementMetamodel.GuaranteeTerm;
import AgreementMetamodel.Metric;
import AgreementMetamodel.MonitorableProperty;
import AgreementMetamodel.Parameter;
import AgreementMetamodel.Property;
import AgreementMetamodel.QualifyingCondition;
import AgreementMetamodel.Range;
import AgreementMetamodel.Role;
import AgreementMetamodel.RoleType;
import AgreementMetamodel.Scope;
import AgreementMetamodel.ServiceConfiguration;
import AgreementMetamodel.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgreementMetamodelPackageImpl extends EPackageImpl implements AgreementMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementCompositorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

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
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementTermEClass = null;

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
	private EClass guaranteeTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compensationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifyingConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compensationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	private EEnum roleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

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
	 * @see AgreementMetamodel.AgreementMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgreementMetamodelPackageImpl() {
		super(eNS_URI, AgreementMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgreementMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgreementMetamodelPackage init() {
		if (isInited) return (AgreementMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		AgreementMetamodelPackageImpl theAgreementMetamodelPackage = (AgreementMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AgreementMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AgreementMetamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAgreementMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAgreementMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgreementMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgreementMetamodelPackage.eNS_URI, theAgreementMetamodelPackage);
		return theAgreementMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementCompositor() {
		return agreementCompositorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementCompositor_Agreements() {
		return (EReference)agreementCompositorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementModel() {
		return agreementModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreementModel_Id() {
		return (EAttribute)agreementModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreementModel_Version() {
		return (EAttribute)agreementModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementModel_Context() {
		return (EReference)agreementModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementModel_AgTerm() {
		return (EReference)agreementModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Actors() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Metrics() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getActor_Id() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Role() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_RoleType() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Type() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Id() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Domain() {
		return (EReference)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Min() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Max() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerated() {
		return enumeratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerated_Values() {
		return (EReference)enumeratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreementTerm() {
		return agreementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementTerm_ServiceConfigurarion() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementTerm_MonitorableProperties() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgreementTerm_GuaranteeTerms() {
		return (EReference)agreementTermEClass.getEStructuralFeatures().get(2);
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
	public EReference getServiceConfiguration_Features() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConfiguration_ConfigurationProperties() {
		return (EReference)serviceConfigurationEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getGuaranteeTerm_Id() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuaranteeTerm_Role() {
		return (EAttribute)guaranteeTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuaranteeTerm_Slo() {
		return (EReference)guaranteeTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuaranteeTerm_QualifyingCondition() {
		return (EReference)guaranteeTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuaranteeTerm_Compensations() {
		return (EReference)guaranteeTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Id() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Parameters() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Expression() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Scope() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_DefinitionReference() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Id() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Features() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Metric() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationProperty() {
		return configurationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitorableProperty() {
		return monitorablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitorableProperty_MonitorReference() {
		return (EAttribute)monitorablePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLO() {
		return sloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLO_Expression() {
		return (EAttribute)sloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompensation() {
		return compensationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensation_Interval() {
		return (EAttribute)compensationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensation_Type() {
		return (EAttribute)compensationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompensation_CompensationElements() {
		return (EReference)compensationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifyingCondition() {
		return qualifyingConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifyingCondition_Expression() {
		return (EAttribute)qualifyingConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompensationElement() {
		return compensationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensationElement_Expression() {
		return (EAttribute)compensationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensationElement_Condition() {
		return (EAttribute)compensationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Id() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
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
	public EEnum getRoleType() {
		return roleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatype() {
		return datatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
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
	public AgreementMetamodelFactory getAgreementMetamodelFactory() {
		return (AgreementMetamodelFactory)getEFactoryInstance();
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
		agreementCompositorEClass = createEClass(AGREEMENT_COMPOSITOR);
		createEReference(agreementCompositorEClass, AGREEMENT_COMPOSITOR__AGREEMENTS);

		agreementModelEClass = createEClass(AGREEMENT_MODEL);
		createEAttribute(agreementModelEClass, AGREEMENT_MODEL__ID);
		createEAttribute(agreementModelEClass, AGREEMENT_MODEL__VERSION);
		createEReference(agreementModelEClass, AGREEMENT_MODEL__CONTEXT);
		createEReference(agreementModelEClass, AGREEMENT_MODEL__AG_TERM);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__ACTORS);
		createEReference(contextEClass, CONTEXT__METRICS);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ID);
		createEAttribute(actorEClass, ACTOR__ROLE);
		createEAttribute(actorEClass, ACTOR__ROLE_TYPE);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__TYPE);
		createEAttribute(metricEClass, METRIC__ID);
		createEReference(metricEClass, METRIC__DOMAIN);

		domainEClass = createEClass(DOMAIN);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__MIN);
		createEAttribute(rangeEClass, RANGE__MAX);

		enumeratedEClass = createEClass(ENUMERATED);
		createEReference(enumeratedEClass, ENUMERATED__VALUES);

		agreementTermEClass = createEClass(AGREEMENT_TERM);
		createEReference(agreementTermEClass, AGREEMENT_TERM__SERVICE_CONFIGURARION);
		createEReference(agreementTermEClass, AGREEMENT_TERM__MONITORABLE_PROPERTIES);
		createEReference(agreementTermEClass, AGREEMENT_TERM__GUARANTEE_TERMS);

		serviceConfigurationEClass = createEClass(SERVICE_CONFIGURATION);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__ENDPOINT_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__DEFINITION_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__MONITOR_REFERENCE);
		createEAttribute(serviceConfigurationEClass, SERVICE_CONFIGURATION__SERVICE_NAME);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__FEATURES);
		createEReference(serviceConfigurationEClass, SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES);

		guaranteeTermEClass = createEClass(GUARANTEE_TERM);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__ID);
		createEAttribute(guaranteeTermEClass, GUARANTEE_TERM__ROLE);
		createEReference(guaranteeTermEClass, GUARANTEE_TERM__SLO);
		createEReference(guaranteeTermEClass, GUARANTEE_TERM__QUALIFYING_CONDITION);
		createEReference(guaranteeTermEClass, GUARANTEE_TERM__COMPENSATIONS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__ID);
		createEReference(featureEClass, FEATURE__PARAMETERS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__EXPRESSION);
		createEAttribute(propertyEClass, PROPERTY__SCOPE);
		createEAttribute(propertyEClass, PROPERTY__DEFINITION_REFERENCE);
		createEAttribute(propertyEClass, PROPERTY__ID);
		createEReference(propertyEClass, PROPERTY__FEATURES);
		createEReference(propertyEClass, PROPERTY__METRIC);

		configurationPropertyEClass = createEClass(CONFIGURATION_PROPERTY);

		monitorablePropertyEClass = createEClass(MONITORABLE_PROPERTY);
		createEAttribute(monitorablePropertyEClass, MONITORABLE_PROPERTY__MONITOR_REFERENCE);

		sloEClass = createEClass(SLO);
		createEAttribute(sloEClass, SLO__EXPRESSION);

		compensationEClass = createEClass(COMPENSATION);
		createEAttribute(compensationEClass, COMPENSATION__INTERVAL);
		createEAttribute(compensationEClass, COMPENSATION__TYPE);
		createEReference(compensationEClass, COMPENSATION__COMPENSATION_ELEMENTS);

		qualifyingConditionEClass = createEClass(QUALIFYING_CONDITION);
		createEAttribute(qualifyingConditionEClass, QUALIFYING_CONDITION__EXPRESSION);

		compensationElementEClass = createEClass(COMPENSATION_ELEMENT);
		createEAttribute(compensationElementEClass, COMPENSATION_ELEMENT__EXPRESSION);
		createEAttribute(compensationElementEClass, COMPENSATION_ELEMENT__CONDITION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__ID);

		// Create enums
		roleEEnum = createEEnum(ROLE);
		roleTypeEEnum = createEEnum(ROLE_TYPE);
		datatypeEEnum = createEEnum(DATATYPE);
		scopeEEnum = createEEnum(SCOPE);
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
		rangeEClass.getESuperTypes().add(this.getDomain());
		enumeratedEClass.getESuperTypes().add(this.getDomain());
		configurationPropertyEClass.getESuperTypes().add(this.getProperty());
		monitorablePropertyEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(agreementCompositorEClass, AgreementCompositor.class, "AgreementCompositor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementCompositor_Agreements(), this.getAgreementModel(), null, "agreements", null, 0, -1, AgreementCompositor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementModelEClass, AgreementModel.class, "AgreementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreementModel_Id(), ecorePackage.getEString(), "id", null, 0, 1, AgreementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreementModel_Version(), ecorePackage.getEDouble(), "version", null, 0, 1, AgreementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementModel_Context(), this.getContext(), null, "context", null, 1, 1, AgreementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementModel_AgTerm(), this.getAgreementTerm(), null, "agTerm", null, 1, 1, AgreementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Actors(), this.getActor(), null, "actors", null, 1, 2, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Id(), ecorePackage.getEString(), "id", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Role(), this.getRole(), "role", "PROVIDER", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_RoleType(), this.getRoleType(), "roleType", "RESPONDER", 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Type(), this.getDatatype(), "type", "INTEGER", 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Id(), ecorePackage.getEString(), "id", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Domain(), this.getDomain(), null, "domain", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Min(), ecorePackage.getEIntegerObject(), "min", "1", 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Max(), ecorePackage.getEIntegerObject(), "max", "100", 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedEClass, Enumerated.class, "Enumerated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerated_Values(), this.getValue(), null, "values", null, 0, -1, Enumerated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agreementTermEClass, AgreementTerm.class, "AgreementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgreementTerm_ServiceConfigurarion(), this.getServiceConfiguration(), null, "serviceConfigurarion", null, 1, 1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_MonitorableProperties(), this.getMonitorableProperty(), null, "monitorableProperties", null, 0, -1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgreementTerm_GuaranteeTerms(), this.getGuaranteeTerm(), null, "guaranteeTerms", null, 0, -1, AgreementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConfigurationEClass, ServiceConfiguration.class, "ServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceConfiguration_EndpointReference(), ecorePackage.getEString(), "endpointReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_DefinitionReference(), ecorePackage.getEString(), "definitionReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_MonitorReference(), ecorePackage.getEString(), "monitorReference", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConfiguration_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfiguration_Features(), this.getFeature(), null, "features", null, 0, -1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConfiguration_ConfigurationProperties(), this.getConfigurationProperty(), null, "configurationProperties", null, 0, -1, ServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guaranteeTermEClass, GuaranteeTerm.class, "GuaranteeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuaranteeTerm_Id(), ecorePackage.getEString(), "id", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuaranteeTerm_Role(), this.getRole(), "role", "PROVIDER", 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuaranteeTerm_Slo(), this.getSLO(), null, "slo", null, 1, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuaranteeTerm_QualifyingCondition(), this.getQualifyingCondition(), null, "qualifyingCondition", null, 0, 1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuaranteeTerm_Compensations(), this.getCompensation(), null, "compensations", null, 0, -1, GuaranteeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Scope(), this.getScope(), "scope", "GLOBAL", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_DefinitionReference(), ecorePackage.getEString(), "definitionReference", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Id(), ecorePackage.getEString(), "id", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Features(), this.getFeature(), null, "features", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Metric(), this.getMetric(), null, "metric", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyEClass, ConfigurationProperty.class, "ConfigurationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitorablePropertyEClass, MonitorableProperty.class, "MonitorableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitorableProperty_MonitorReference(), ecorePackage.getEString(), "monitorReference", null, 0, 1, MonitorableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sloEClass, AgreementMetamodel.SLO.class, "SLO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLO_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, AgreementMetamodel.SLO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compensationEClass, Compensation.class, "Compensation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompensation_Interval(), this.getAssessmentInterval(), "interval", "MONTHLY", 0, 1, Compensation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompensation_Type(), this.getCompensationType(), "type", "REWARD", 0, 1, Compensation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompensation_CompensationElements(), this.getCompensationElement(), null, "compensationElements", null, 0, -1, Compensation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifyingConditionEClass, QualifyingCondition.class, "QualifyingCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifyingCondition_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, QualifyingCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compensationElementEClass, CompensationElement.class, "CompensationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompensationElement_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, CompensationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompensationElement_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, CompensationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Id(), ecorePackage.getEString(), "id", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.PROVIDER);
		addEEnumLiteral(roleEEnum, Role.CONSUMER);

		initEEnum(roleTypeEEnum, RoleType.class, "RoleType");
		addEEnumLiteral(roleTypeEEnum, RoleType.INITIATOR);
		addEEnumLiteral(roleTypeEEnum, RoleType.RESPONDER);

		initEEnum(datatypeEEnum, Datatype.class, "Datatype");
		addEEnumLiteral(datatypeEEnum, Datatype.INTEGER);
		addEEnumLiteral(datatypeEEnum, Datatype.FLOAT);
		addEEnumLiteral(datatypeEEnum, Datatype.NATURAL);
		addEEnumLiteral(datatypeEEnum, Datatype.NUMBER);
		addEEnumLiteral(datatypeEEnum, Datatype.BOOLEAN);
		addEEnumLiteral(datatypeEEnum, Datatype.SET);
		addEEnumLiteral(datatypeEEnum, Datatype.ENUM);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.GLOBAL);
		addEEnumLiteral(scopeEEnum, Scope.LOCAL);

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
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.node
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
		  (this, 
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
		  (agreementCompositorEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getAgreementCompositor_Agreements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAgreementModel_Context(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAgreementModel_AgTerm(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getContext_Actors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getContext_Metrics(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMetric_Domain(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerated_Values(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAgreementTerm_ServiceConfigurarion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAgreementTerm_MonitorableProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAgreementTerm_GuaranteeTerms(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getServiceConfiguration_Features(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getServiceConfiguration_ConfigurationProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGuaranteeTerm_Slo(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGuaranteeTerm_QualifyingCondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGuaranteeTerm_Compensations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFeature_Parameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCompensation_CompensationElements(), 
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
	protected void createGmf_3Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (agreementModelEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Agreement",
			 "tool.description", "Creates a new agreement"
		   });	
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Context",
			 "tool.description", "Creates a new context section"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Actor",
			 "tool.description", "Creates a new actor"
		   });	
		addAnnotation
		  (metricEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Metric",
			 "tool.description", "Creates a new metric"
		   });	
		addAnnotation
		  (rangeEClass, 
		   source, 
		   new String[] {
			 "label", "min,max",
			 "label.pattern", "[{0}..{1}]",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Range",
			 "tool.description", "Creates a range domain"
		   });	
		addAnnotation
		  (enumeratedEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Enumerated",
			 "tool.description", "Creates an enumerated domain"
		   });	
		addAnnotation
		  (agreementTermEClass, 
		   source, 
		   new String[] {
			 "label.placement", "none",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Agreement Term",
			 "tool.description", "Creates an agreement terms section"
		   });	
		addAnnotation
		  (serviceConfigurationEClass, 
		   source, 
		   new String[] {
			 "label", "serviceName",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Service Configuration",
			 "tool.description", "Creates a service configuration section"
		   });	
		addAnnotation
		  (guaranteeTermEClass, 
		   source, 
		   new String[] {
			 "label", "id,role",
			 "label.pattern", "{0} - {1}",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Guarantee Term",
			 "tool.description", "Creates a new guarantee term"
		   });	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Feature",
			 "tool.description", "Creates a new feature"
		   });	
		addAnnotation
		  (configurationPropertyEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Configuration Property",
			 "tool.description", "Creates a new configuration property"
		   });	
		addAnnotation
		  (monitorablePropertyEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Monitorable Property",
			 "tool.description", "Creates a new monitorable property"
		   });	
		addAnnotation
		  (sloEClass, 
		   source, 
		   new String[] {
			 "label", "expression",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "SLO",
			 "tool.description", "Creates a new service level objective"
		   });	
		addAnnotation
		  (compensationEClass, 
		   source, 
		   new String[] {
			 "label", "interval,type",
			 "label.pattern", "with {0} {1}",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Compensation",
			 "tool.description", "Creates a new compensation"
		   });	
		addAnnotation
		  (qualifyingConditionEClass, 
		   source, 
		   new String[] {
			 "label", "expression",
			 "label.pattern", "onlyIf({0})",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Qualifying Condition",
			 "tool.description", "Creates a new qualifying condition"
		   });	
		addAnnotation
		  (compensationElementEClass, 
		   source, 
		   new String[] {
			 "label", "expression,condition",
			 "label.pattern", "of {1} if {0}",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Compensation Element",
			 "tool.description", "Creates a new compensation element"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Parameter",
			 "tool.description", "Creates a new parameter"
		   });	
		addAnnotation
		  (valueEClass, 
		   source, 
		   new String[] {
			 "label", "id",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "tool.name", "Value",
			 "tool.description", "Creates a new value"
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
		  (getProperty_Features(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Metric(), 
		   source, 
		   new String[] {
		   });
	}

} //AgreementMetamodelPackageImpl
