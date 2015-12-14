/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scenarioDiagram.ScenarioDiagramPackage
 * @generated
 */
public interface ScenarioDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScenarioDiagramFactory eINSTANCE = scenarioDiagram.impl.ScenarioDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Service Need</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Need</em>'.
	 * @generated
	 */
	ServiceNeed createServiceNeed();

	/**
	 * Returns a new object of class '<em>Service Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Offer</em>'.
	 * @generated
	 */
	ServiceOffer createServiceOffer();

	/**
	 * Returns a new object of class '<em>Agreement Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement Link</em>'.
	 * @generated
	 */
	AgreementLink createAgreementLink();

	/**
	 * Returns a new object of class '<em>Service Need Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Need Link</em>'.
	 * @generated
	 */
	ServiceNeedLink createServiceNeedLink();

	/**
	 * Returns a new object of class '<em>Service Offer Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Offer Link</em>'.
	 * @generated
	 */
	ServiceOfferLink createServiceOfferLink();

	/**
	 * Returns a new object of class '<em>Scenario Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Element</em>'.
	 * @generated
	 */
	ScenarioElement createScenarioElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScenarioDiagramPackage getScenarioDiagramPackage();

} //ScenarioDiagramFactory
