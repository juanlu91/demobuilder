/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scenarioDiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioDiagramFactoryImpl extends EFactoryImpl implements ScenarioDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScenarioDiagramFactory init() {
		try {
			ScenarioDiagramFactory theScenarioDiagramFactory = (ScenarioDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ScenarioDiagramPackage.eNS_URI);
			if (theScenarioDiagramFactory != null) {
				return theScenarioDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenarioDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramFactoryImpl() {
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
			case ScenarioDiagramPackage.SCENARIO: return createScenario();
			case ScenarioDiagramPackage.CUSTOMER: return createCustomer();
			case ScenarioDiagramPackage.PROVIDER: return createProvider();
			case ScenarioDiagramPackage.SERVICE_NEED: return createServiceNeed();
			case ScenarioDiagramPackage.SERVICE_OFFER: return createServiceOffer();
			case ScenarioDiagramPackage.AGREEMENT_LINK: return createAgreementLink();
			case ScenarioDiagramPackage.SERVICE_NEED_LINK: return createServiceNeedLink();
			case ScenarioDiagramPackage.SERVICE_OFFER_LINK: return createServiceOfferLink();
			case ScenarioDiagramPackage.SCENARIO_ELEMENT: return createScenarioElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeed createServiceNeed() {
		ServiceNeedImpl serviceNeed = new ServiceNeedImpl();
		return serviceNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOffer createServiceOffer() {
		ServiceOfferImpl serviceOffer = new ServiceOfferImpl();
		return serviceOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementLink createAgreementLink() {
		AgreementLinkImpl agreementLink = new AgreementLinkImpl();
		return agreementLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNeedLink createServiceNeedLink() {
		ServiceNeedLinkImpl serviceNeedLink = new ServiceNeedLinkImpl();
		return serviceNeedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOfferLink createServiceOfferLink() {
		ServiceOfferLinkImpl serviceOfferLink = new ServiceOfferLinkImpl();
		return serviceOfferLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioElement createScenarioElement() {
		ScenarioElementImpl scenarioElement = new ScenarioElementImpl();
		return scenarioElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramPackage getScenarioDiagramPackage() {
		return (ScenarioDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioDiagramPackage getPackage() {
		return ScenarioDiagramPackage.eINSTANCE;
	}

} //ScenarioDiagramFactoryImpl
