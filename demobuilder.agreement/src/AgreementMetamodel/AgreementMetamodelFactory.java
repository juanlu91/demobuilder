/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AgreementMetamodel.AgreementMetamodelPackage
 * @generated
 */
public interface AgreementMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgreementMetamodelFactory eINSTANCE = AgreementMetamodel.impl.AgreementMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agreement Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement Model</em>'.
	 * @generated
	 */
	AgreementModel createAgreementModel();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns a new object of class '<em>Enumerated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated</em>'.
	 * @generated
	 */
	Enumerated createEnumerated();

	/**
	 * Returns a new object of class '<em>Agreement Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement Term</em>'.
	 * @generated
	 */
	AgreementTerm createAgreementTerm();

	/**
	 * Returns a new object of class '<em>Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Configuration</em>'.
	 * @generated
	 */
	ServiceConfiguration createServiceConfiguration();

	/**
	 * Returns a new object of class '<em>Guarantee Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarantee Term</em>'.
	 * @generated
	 */
	GuaranteeTerm createGuaranteeTerm();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Configuration Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Property</em>'.
	 * @generated
	 */
	ConfigurationProperty createConfigurationProperty();

	/**
	 * Returns a new object of class '<em>Monitorable Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitorable Property</em>'.
	 * @generated
	 */
	MonitorableProperty createMonitorableProperty();

	/**
	 * Returns a new object of class '<em>SLO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLO</em>'.
	 * @generated
	 */
	SLO createSLO();

	/**
	 * Returns a new object of class '<em>Compensation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compensation</em>'.
	 * @generated
	 */
	Compensation createCompensation();

	/**
	 * Returns a new object of class '<em>Qualifying Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifying Condition</em>'.
	 * @generated
	 */
	QualifyingCondition createQualifyingCondition();

	/**
	 * Returns a new object of class '<em>Compensation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compensation Element</em>'.
	 * @generated
	 */
	CompensationElement createCompensationElement();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AgreementMetamodelPackage getAgreementMetamodelPackage();

} //AgreementMetamodelFactory
