/**
 */
package AgreementMetamodel;

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
 * @see AgreementMetamodel.AgreementMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface AgreementMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AgreementMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://demobuilder.agreement.metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mmag";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementMetamodelPackage eINSTANCE = AgreementMetamodel.impl.AgreementMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.AgreementModelImpl <em>Agreement Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.AgreementModelImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAgreementModel()
	 * @generated
	 */
	int AGREEMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_MODEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_MODEL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_MODEL__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Ag Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_MODEL__AG_TERM = 3;

	/**
	 * The number of structural features of the '<em>Agreement Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ContextImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ACTORS = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__METRICS = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ActorImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.MetricImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ID = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.DomainImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 4;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.RangeImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 5;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.EnumeratedImpl <em>Enumerated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.EnumeratedImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED__VALUES = DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.AgreementTermImpl <em>Agreement Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.AgreementTermImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAgreementTerm()
	 * @generated
	 */
	int AGREEMENT_TERM = 7;

	/**
	 * The feature id for the '<em><b>Service Configurarion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__SERVICE_CONFIGURARION = 0;

	/**
	 * The feature id for the '<em><b>Monitorable Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__MONITORABLE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Guarantee Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__GUARANTEE_TERMS = 2;

	/**
	 * The number of structural features of the '<em>Agreement Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ServiceConfigurationImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getServiceConfiguration()
	 * @generated
	 */
	int SERVICE_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__ENDPOINT_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__DEFINITION_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Monitor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__MONITOR_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__SERVICE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.GuaranteeTermImpl <em>Guarantee Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.GuaranteeTermImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getGuaranteeTerm()
	 * @generated
	 */
	int GUARANTEE_TERM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__SLO = 2;

	/**
	 * The feature id for the '<em><b>Qualifying Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__QUALIFYING_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Compensations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM__COMPENSATIONS = 4;

	/**
	 * The number of structural features of the '<em>Guarantee Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTEE_TERM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.FeatureImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.PropertyImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFINITION_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__METRIC = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ConfigurationPropertyImpl <em>Configuration Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ConfigurationPropertyImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getConfigurationProperty()
	 * @generated
	 */
	int CONFIGURATION_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__EXPRESSION = PROPERTY__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__SCOPE = PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__DEFINITION_REFERENCE = PROPERTY__DEFINITION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__FEATURES = PROPERTY__FEATURES;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__METRIC = PROPERTY__METRIC;

	/**
	 * The number of structural features of the '<em>Configuration Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.MonitorablePropertyImpl <em>Monitorable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.MonitorablePropertyImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getMonitorableProperty()
	 * @generated
	 */
	int MONITORABLE_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__EXPRESSION = PROPERTY__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__SCOPE = PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__DEFINITION_REFERENCE = PROPERTY__DEFINITION_REFERENCE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__FEATURES = PROPERTY__FEATURES;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__METRIC = PROPERTY__METRIC;

	/**
	 * The feature id for the '<em><b>Monitor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY__MONITOR_REFERENCE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitorable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.SLOImpl <em>SLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.SLOImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getSLO()
	 * @generated
	 */
	int SLO = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.CompensationImpl <em>Compensation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.CompensationImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensation()
	 * @generated
	 */
	int COMPENSATION = 15;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Compensation Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__COMPENSATION_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Compensation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.QualifyingConditionImpl <em>Qualifying Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.QualifyingConditionImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getQualifyingCondition()
	 * @generated
	 */
	int QUALIFYING_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFYING_CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Qualifying Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFYING_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.CompensationElementImpl <em>Compensation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.CompensationElementImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensationElement()
	 * @generated
	 */
	int COMPENSATION_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_ELEMENT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_ELEMENT__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Compensation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ParameterImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.impl.ValueImpl
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.Role
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 20;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.RoleType
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 21;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.Datatype
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 22;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.Scope
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 23;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.AssessmentInterval <em>Assessment Interval</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.AssessmentInterval
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAssessmentInterval()
	 * @generated
	 */
	int ASSESSMENT_INTERVAL = 24;

	/**
	 * The meta object id for the '{@link AgreementMetamodel.CompensationType <em>Compensation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AgreementMetamodel.CompensationType
	 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensationType()
	 * @generated
	 */
	int COMPENSATION_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.AgreementModel <em>Agreement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Model</em>'.
	 * @see AgreementMetamodel.AgreementModel
	 * @generated
	 */
	EClass getAgreementModel();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.AgreementModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.AgreementModel#getId()
	 * @see #getAgreementModel()
	 * @generated
	 */
	EAttribute getAgreementModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.AgreementModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see AgreementMetamodel.AgreementModel#getVersion()
	 * @see #getAgreementModel()
	 * @generated
	 */
	EAttribute getAgreementModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.AgreementModel#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see AgreementMetamodel.AgreementModel#getContext()
	 * @see #getAgreementModel()
	 * @generated
	 */
	EReference getAgreementModel_Context();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.AgreementModel#getAgTerm <em>Ag Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ag Term</em>'.
	 * @see AgreementMetamodel.AgreementModel#getAgTerm()
	 * @see #getAgreementModel()
	 * @generated
	 */
	EReference getAgreementModel_AgTerm();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see AgreementMetamodel.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.Context#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see AgreementMetamodel.Context#getActors()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.Context#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see AgreementMetamodel.Context#getMetrics()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Metrics();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see AgreementMetamodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Actor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.Actor#getId()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Id();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Actor#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see AgreementMetamodel.Actor#getRole()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Role();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Actor#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type</em>'.
	 * @see AgreementMetamodel.Actor#getRoleType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_RoleType();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see AgreementMetamodel.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AgreementMetamodel.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Type();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Metric#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.Metric#getId()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Id();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.Metric#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see AgreementMetamodel.Metric#getDomain()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Domain();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see AgreementMetamodel.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see AgreementMetamodel.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Range#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see AgreementMetamodel.Range#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Range#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see AgreementMetamodel.Range#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated</em>'.
	 * @see AgreementMetamodel.Enumerated
	 * @generated
	 */
	EClass getEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.Enumerated#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see AgreementMetamodel.Enumerated#getValues()
	 * @see #getEnumerated()
	 * @generated
	 */
	EReference getEnumerated_Values();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.AgreementTerm <em>Agreement Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement Term</em>'.
	 * @see AgreementMetamodel.AgreementTerm
	 * @generated
	 */
	EClass getAgreementTerm();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.AgreementTerm#getServiceConfigurarion <em>Service Configurarion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Configurarion</em>'.
	 * @see AgreementMetamodel.AgreementTerm#getServiceConfigurarion()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_ServiceConfigurarion();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.AgreementTerm#getMonitorableProperties <em>Monitorable Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitorable Properties</em>'.
	 * @see AgreementMetamodel.AgreementTerm#getMonitorableProperties()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_MonitorableProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.AgreementTerm#getGuaranteeTerms <em>Guarantee Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guarantee Terms</em>'.
	 * @see AgreementMetamodel.AgreementTerm#getGuaranteeTerms()
	 * @see #getAgreementTerm()
	 * @generated
	 */
	EReference getAgreementTerm_GuaranteeTerms();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.ServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Configuration</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration
	 * @generated
	 */
	EClass getServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.ServiceConfiguration#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Reference</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getEndpointReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_EndpointReference();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.ServiceConfiguration#getDefinitionReference <em>Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Reference</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getDefinitionReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_DefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.ServiceConfiguration#getMonitorReference <em>Monitor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Reference</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getMonitorReference()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_MonitorReference();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.ServiceConfiguration#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getServiceName()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EAttribute getServiceConfiguration_ServiceName();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.ServiceConfiguration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getFeatures()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.ServiceConfiguration#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Properties</em>'.
	 * @see AgreementMetamodel.ServiceConfiguration#getConfigurationProperties()
	 * @see #getServiceConfiguration()
	 * @generated
	 */
	EReference getServiceConfiguration_ConfigurationProperties();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.GuaranteeTerm <em>Guarantee Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarantee Term</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm
	 * @generated
	 */
	EClass getGuaranteeTerm();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.GuaranteeTerm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm#getId()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_Id();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.GuaranteeTerm#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm#getRole()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EAttribute getGuaranteeTerm_Role();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.GuaranteeTerm#getSlo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slo</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm#getSlo()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EReference getGuaranteeTerm_Slo();

	/**
	 * Returns the meta object for the containment reference '{@link AgreementMetamodel.GuaranteeTerm#getQualifyingCondition <em>Qualifying Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifying Condition</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm#getQualifyingCondition()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EReference getGuaranteeTerm_QualifyingCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.GuaranteeTerm#getCompensations <em>Compensations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensations</em>'.
	 * @see AgreementMetamodel.GuaranteeTerm#getCompensations()
	 * @see #getGuaranteeTerm()
	 * @generated
	 */
	EReference getGuaranteeTerm_Compensations();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see AgreementMetamodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.Feature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see AgreementMetamodel.Feature#getParameters()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Parameters();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see AgreementMetamodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Property#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see AgreementMetamodel.Property#getExpression()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Expression();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Property#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see AgreementMetamodel.Property#getScope()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Scope();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Property#getDefinitionReference <em>Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Reference</em>'.
	 * @see AgreementMetamodel.Property#getDefinitionReference()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Property#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.Property#getId()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Id();

	/**
	 * Returns the meta object for the reference '{@link AgreementMetamodel.Property#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features</em>'.
	 * @see AgreementMetamodel.Property#getFeatures()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Features();

	/**
	 * Returns the meta object for the reference '{@link AgreementMetamodel.Property#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see AgreementMetamodel.Property#getMetric()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Metric();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.ConfigurationProperty <em>Configuration Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Property</em>'.
	 * @see AgreementMetamodel.ConfigurationProperty
	 * @generated
	 */
	EClass getConfigurationProperty();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.MonitorableProperty <em>Monitorable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitorable Property</em>'.
	 * @see AgreementMetamodel.MonitorableProperty
	 * @generated
	 */
	EClass getMonitorableProperty();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.MonitorableProperty#getMonitorReference <em>Monitor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Reference</em>'.
	 * @see AgreementMetamodel.MonitorableProperty#getMonitorReference()
	 * @see #getMonitorableProperty()
	 * @generated
	 */
	EAttribute getMonitorableProperty_MonitorReference();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.SLO <em>SLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLO</em>'.
	 * @see AgreementMetamodel.SLO
	 * @generated
	 */
	EClass getSLO();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.SLO#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see AgreementMetamodel.SLO#getExpression()
	 * @see #getSLO()
	 * @generated
	 */
	EAttribute getSLO_Expression();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Compensation <em>Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensation</em>'.
	 * @see AgreementMetamodel.Compensation
	 * @generated
	 */
	EClass getCompensation();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Compensation#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see AgreementMetamodel.Compensation#getInterval()
	 * @see #getCompensation()
	 * @generated
	 */
	EAttribute getCompensation_Interval();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Compensation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AgreementMetamodel.Compensation#getType()
	 * @see #getCompensation()
	 * @generated
	 */
	EAttribute getCompensation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link AgreementMetamodel.Compensation#getCompensationElements <em>Compensation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensation Elements</em>'.
	 * @see AgreementMetamodel.Compensation#getCompensationElements()
	 * @see #getCompensation()
	 * @generated
	 */
	EReference getCompensation_CompensationElements();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.QualifyingCondition <em>Qualifying Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifying Condition</em>'.
	 * @see AgreementMetamodel.QualifyingCondition
	 * @generated
	 */
	EClass getQualifyingCondition();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.QualifyingCondition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see AgreementMetamodel.QualifyingCondition#getExpression()
	 * @see #getQualifyingCondition()
	 * @generated
	 */
	EAttribute getQualifyingCondition_Expression();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.CompensationElement <em>Compensation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensation Element</em>'.
	 * @see AgreementMetamodel.CompensationElement
	 * @generated
	 */
	EClass getCompensationElement();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.CompensationElement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see AgreementMetamodel.CompensationElement#getExpression()
	 * @see #getCompensationElement()
	 * @generated
	 */
	EAttribute getCompensationElement_Expression();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.CompensationElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see AgreementMetamodel.CompensationElement#getCondition()
	 * @see #getCompensationElement()
	 * @generated
	 */
	EAttribute getCompensationElement_Condition();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see AgreementMetamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AgreementMetamodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link AgreementMetamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see AgreementMetamodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link AgreementMetamodel.Value#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AgreementMetamodel.Value#getId()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Id();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see AgreementMetamodel.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see AgreementMetamodel.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see AgreementMetamodel.Datatype
	 * @generated
	 */
	EEnum getDatatype();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see AgreementMetamodel.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.AssessmentInterval <em>Assessment Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assessment Interval</em>'.
	 * @see AgreementMetamodel.AssessmentInterval
	 * @generated
	 */
	EEnum getAssessmentInterval();

	/**
	 * Returns the meta object for enum '{@link AgreementMetamodel.CompensationType <em>Compensation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compensation Type</em>'.
	 * @see AgreementMetamodel.CompensationType
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
	AgreementMetamodelFactory getAgreementMetamodelFactory();

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
		 * The meta object literal for the '{@link AgreementMetamodel.impl.AgreementModelImpl <em>Agreement Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.AgreementModelImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAgreementModel()
		 * @generated
		 */
		EClass AGREEMENT_MODEL = eINSTANCE.getAgreementModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_MODEL__ID = eINSTANCE.getAgreementModel_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_MODEL__VERSION = eINSTANCE.getAgreementModel_Version();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_MODEL__CONTEXT = eINSTANCE.getAgreementModel_Context();

		/**
		 * The meta object literal for the '<em><b>Ag Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_MODEL__AG_TERM = eINSTANCE.getAgreementModel_AgTerm();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ContextImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ACTORS = eINSTANCE.getContext_Actors();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__METRICS = eINSTANCE.getContext_Metrics();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ActorImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ID = eINSTANCE.getActor_Id();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROLE = eINSTANCE.getActor_Role();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROLE_TYPE = eINSTANCE.getActor_RoleType();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.MetricImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__ID = eINSTANCE.getMetric_Id();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__DOMAIN = eINSTANCE.getMetric_Domain();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.DomainImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.RangeImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.EnumeratedImpl <em>Enumerated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.EnumeratedImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getEnumerated()
		 * @generated
		 */
		EClass ENUMERATED = eINSTANCE.getEnumerated();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED__VALUES = eINSTANCE.getEnumerated_Values();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.AgreementTermImpl <em>Agreement Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.AgreementTermImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAgreementTerm()
		 * @generated
		 */
		EClass AGREEMENT_TERM = eINSTANCE.getAgreementTerm();

		/**
		 * The meta object literal for the '<em><b>Service Configurarion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__SERVICE_CONFIGURARION = eINSTANCE.getAgreementTerm_ServiceConfigurarion();

		/**
		 * The meta object literal for the '<em><b>Monitorable Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__MONITORABLE_PROPERTIES = eINSTANCE.getAgreementTerm_MonitorableProperties();

		/**
		 * The meta object literal for the '<em><b>Guarantee Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREEMENT_TERM__GUARANTEE_TERMS = eINSTANCE.getAgreementTerm_GuaranteeTerms();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ServiceConfigurationImpl <em>Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ServiceConfigurationImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getServiceConfiguration()
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
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__FEATURES = eINSTANCE.getServiceConfiguration_Features();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONFIGURATION__CONFIGURATION_PROPERTIES = eINSTANCE.getServiceConfiguration_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.GuaranteeTermImpl <em>Guarantee Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.GuaranteeTermImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getGuaranteeTerm()
		 * @generated
		 */
		EClass GUARANTEE_TERM = eINSTANCE.getGuaranteeTerm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__ID = eINSTANCE.getGuaranteeTerm_Id();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARANTEE_TERM__ROLE = eINSTANCE.getGuaranteeTerm_Role();

		/**
		 * The meta object literal for the '<em><b>Slo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTEE_TERM__SLO = eINSTANCE.getGuaranteeTerm_Slo();

		/**
		 * The meta object literal for the '<em><b>Qualifying Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTEE_TERM__QUALIFYING_CONDITION = eINSTANCE.getGuaranteeTerm_QualifyingCondition();

		/**
		 * The meta object literal for the '<em><b>Compensations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTEE_TERM__COMPENSATIONS = eINSTANCE.getGuaranteeTerm_Compensations();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.FeatureImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PARAMETERS = eINSTANCE.getFeature_Parameters();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.PropertyImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__EXPRESSION = eINSTANCE.getProperty_Expression();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SCOPE = eINSTANCE.getProperty_Scope();

		/**
		 * The meta object literal for the '<em><b>Definition Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFINITION_REFERENCE = eINSTANCE.getProperty_DefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ID = eINSTANCE.getProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__FEATURES = eINSTANCE.getProperty_Features();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__METRIC = eINSTANCE.getProperty_Metric();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ConfigurationPropertyImpl <em>Configuration Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ConfigurationPropertyImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getConfigurationProperty()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTY = eINSTANCE.getConfigurationProperty();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.MonitorablePropertyImpl <em>Monitorable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.MonitorablePropertyImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getMonitorableProperty()
		 * @generated
		 */
		EClass MONITORABLE_PROPERTY = eINSTANCE.getMonitorableProperty();

		/**
		 * The meta object literal for the '<em><b>Monitor Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORABLE_PROPERTY__MONITOR_REFERENCE = eINSTANCE.getMonitorableProperty_MonitorReference();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.SLOImpl <em>SLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.SLOImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getSLO()
		 * @generated
		 */
		EClass SLO = eINSTANCE.getSLO();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO__EXPRESSION = eINSTANCE.getSLO_Expression();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.CompensationImpl <em>Compensation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.CompensationImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensation()
		 * @generated
		 */
		EClass COMPENSATION = eINSTANCE.getCompensation();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATION__INTERVAL = eINSTANCE.getCompensation_Interval();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATION__TYPE = eINSTANCE.getCompensation_Type();

		/**
		 * The meta object literal for the '<em><b>Compensation Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPENSATION__COMPENSATION_ELEMENTS = eINSTANCE.getCompensation_CompensationElements();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.QualifyingConditionImpl <em>Qualifying Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.QualifyingConditionImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getQualifyingCondition()
		 * @generated
		 */
		EClass QUALIFYING_CONDITION = eINSTANCE.getQualifyingCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFYING_CONDITION__EXPRESSION = eINSTANCE.getQualifyingCondition_Expression();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.CompensationElementImpl <em>Compensation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.CompensationElementImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensationElement()
		 * @generated
		 */
		EClass COMPENSATION_ELEMENT = eINSTANCE.getCompensationElement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATION_ELEMENT__EXPRESSION = eINSTANCE.getCompensationElement_Expression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATION_ELEMENT__CONDITION = eINSTANCE.getCompensationElement_Condition();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ParameterImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.impl.ValueImpl
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__ID = eINSTANCE.getValue_Id();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.Role
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.RoleType
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.Datatype
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.Scope
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.AssessmentInterval <em>Assessment Interval</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.AssessmentInterval
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getAssessmentInterval()
		 * @generated
		 */
		EEnum ASSESSMENT_INTERVAL = eINSTANCE.getAssessmentInterval();

		/**
		 * The meta object literal for the '{@link AgreementMetamodel.CompensationType <em>Compensation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AgreementMetamodel.CompensationType
		 * @see AgreementMetamodel.impl.AgreementMetamodelPackageImpl#getCompensationType()
		 * @generated
		 */
		EEnum COMPENSATION_TYPE = eINSTANCE.getCompensationType();

	}

} //AgreementMetamodelPackage
