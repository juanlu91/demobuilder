/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgreementMetamodelFactoryImpl extends EFactoryImpl implements AgreementMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgreementMetamodelFactory init() {
		try {
			AgreementMetamodelFactory theAgreementMetamodelFactory = (AgreementMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(AgreementMetamodelPackage.eNS_URI);
			if (theAgreementMetamodelFactory != null) {
				return theAgreementMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgreementMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementMetamodelFactoryImpl() {
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
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR: return createAgreementCompositor();
			case AgreementMetamodelPackage.AGREEMENT_MODEL: return createAgreementModel();
			case AgreementMetamodelPackage.CONTEXT: return createContext();
			case AgreementMetamodelPackage.ACTOR: return createActor();
			case AgreementMetamodelPackage.METRIC: return createMetric();
			case AgreementMetamodelPackage.RANGE: return createRange();
			case AgreementMetamodelPackage.ENUMERATED: return createEnumerated();
			case AgreementMetamodelPackage.AGREEMENT_TERM: return createAgreementTerm();
			case AgreementMetamodelPackage.SERVICE_CONFIGURATION: return createServiceConfiguration();
			case AgreementMetamodelPackage.GUARANTEE_TERM: return createGuaranteeTerm();
			case AgreementMetamodelPackage.FEATURE: return createFeature();
			case AgreementMetamodelPackage.CONFIGURATION_PROPERTY: return createConfigurationProperty();
			case AgreementMetamodelPackage.MONITORABLE_PROPERTY: return createMonitorableProperty();
			case AgreementMetamodelPackage.SLO: return createSLO();
			case AgreementMetamodelPackage.COMPENSATION: return createCompensation();
			case AgreementMetamodelPackage.QUALIFYING_CONDITION: return createQualifyingCondition();
			case AgreementMetamodelPackage.COMPENSATION_ELEMENT: return createCompensationElement();
			case AgreementMetamodelPackage.PARAMETER: return createParameter();
			case AgreementMetamodelPackage.VALUE: return createValue();
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
			case AgreementMetamodelPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			case AgreementMetamodelPackage.ROLE_TYPE:
				return createRoleTypeFromString(eDataType, initialValue);
			case AgreementMetamodelPackage.DATATYPE:
				return createDatatypeFromString(eDataType, initialValue);
			case AgreementMetamodelPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case AgreementMetamodelPackage.ASSESSMENT_INTERVAL:
				return createAssessmentIntervalFromString(eDataType, initialValue);
			case AgreementMetamodelPackage.COMPENSATION_TYPE:
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
			case AgreementMetamodelPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			case AgreementMetamodelPackage.ROLE_TYPE:
				return convertRoleTypeToString(eDataType, instanceValue);
			case AgreementMetamodelPackage.DATATYPE:
				return convertDatatypeToString(eDataType, instanceValue);
			case AgreementMetamodelPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case AgreementMetamodelPackage.ASSESSMENT_INTERVAL:
				return convertAssessmentIntervalToString(eDataType, instanceValue);
			case AgreementMetamodelPackage.COMPENSATION_TYPE:
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
	public AgreementCompositor createAgreementCompositor() {
		AgreementCompositorImpl agreementCompositor = new AgreementCompositorImpl();
		return agreementCompositor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementModel createAgreementModel() {
		AgreementModelImpl agreementModel = new AgreementModelImpl();
		return agreementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
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
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerated createEnumerated() {
		EnumeratedImpl enumerated = new EnumeratedImpl();
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTerm createAgreementTerm() {
		AgreementTermImpl agreementTerm = new AgreementTermImpl();
		return agreementTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfiguration createServiceConfiguration() {
		ServiceConfigurationImpl serviceConfiguration = new ServiceConfigurationImpl();
		return serviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuaranteeTerm createGuaranteeTerm() {
		GuaranteeTermImpl guaranteeTerm = new GuaranteeTermImpl();
		return guaranteeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProperty createConfigurationProperty() {
		ConfigurationPropertyImpl configurationProperty = new ConfigurationPropertyImpl();
		return configurationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorableProperty createMonitorableProperty() {
		MonitorablePropertyImpl monitorableProperty = new MonitorablePropertyImpl();
		return monitorableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLO createSLO() {
		SLOImpl slo = new SLOImpl();
		return slo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensation createCompensation() {
		CompensationImpl compensation = new CompensationImpl();
		return compensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifyingCondition createQualifyingCondition() {
		QualifyingConditionImpl qualifyingCondition = new QualifyingConditionImpl();
		return qualifyingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensationElement createCompensationElement() {
		CompensationElementImpl compensationElement = new CompensationElementImpl();
		return compensationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
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
	public RoleType createRoleTypeFromString(EDataType eDataType, String initialValue) {
		RoleType result = RoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeFromString(EDataType eDataType, String initialValue) {
		Datatype result = Datatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
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
	public AgreementMetamodelPackage getAgreementMetamodelPackage() {
		return (AgreementMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AgreementMetamodelPackage getPackage() {
		return AgreementMetamodelPackage.eINSTANCE;
	}

} //AgreementMetamodelFactoryImpl
