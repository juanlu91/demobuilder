/**
 */
package scenarioDiagram.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import scenarioDiagram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see scenarioDiagram.ScenarioDiagramPackage
 * @generated
 */
public class ScenarioDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScenarioDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScenarioDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioDiagramSwitch<Adapter> modelSwitch =
		new ScenarioDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseConsumer(Consumer object) {
				return createConsumerAdapter();
			}
			@Override
			public Adapter casePricingPlan(PricingPlan object) {
				return createPricingPlanAdapter();
			}
			@Override
			public Adapter casePricingPlanElement(PricingPlanElement object) {
				return createPricingPlanElementAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseServiceNeed(ServiceNeed object) {
				return createServiceNeedAdapter();
			}
			@Override
			public Adapter caseServiceOffer(ServiceOffer object) {
				return createServiceOfferAdapter();
			}
			@Override
			public Adapter caseAgreementLink(AgreementLink object) {
				return createAgreementLinkAdapter();
			}
			@Override
			public Adapter caseServiceLink(ServiceLink object) {
				return createServiceLinkAdapter();
			}
			@Override
			public Adapter caseScenarioElement(ScenarioElement object) {
				return createScenarioElementAdapter();
			}
			@Override
			public Adapter caseServiceElement(ServiceElement object) {
				return createServiceElementAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.Consumer
	 * @generated
	 */
	public Adapter createConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.PricingPlan <em>Pricing Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.PricingPlan
	 * @generated
	 */
	public Adapter createPricingPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.PricingPlanElement <em>Pricing Plan Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.PricingPlanElement
	 * @generated
	 */
	public Adapter createPricingPlanElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.ServiceNeed <em>Service Need</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.ServiceNeed
	 * @generated
	 */
	public Adapter createServiceNeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.ServiceOffer <em>Service Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.ServiceOffer
	 * @generated
	 */
	public Adapter createServiceOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.AgreementLink <em>Agreement Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.AgreementLink
	 * @generated
	 */
	public Adapter createAgreementLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.ServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.ServiceLink
	 * @generated
	 */
	public Adapter createServiceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.ScenarioElement <em>Scenario Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.ScenarioElement
	 * @generated
	 */
	public Adapter createScenarioElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.ServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.ServiceElement
	 * @generated
	 */
	public Adapter createServiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenarioDiagram.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenarioDiagram.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScenarioDiagramAdapterFactory
