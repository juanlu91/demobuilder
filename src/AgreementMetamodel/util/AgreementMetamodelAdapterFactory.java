/**
 */
package AgreementMetamodel.util;

import AgreementMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AgreementMetamodel.AgreementMetamodelPackage
 * @generated
 */
public class AgreementMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AgreementMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AgreementMetamodelPackage.eINSTANCE;
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
	protected AgreementMetamodelSwitch<Adapter> modelSwitch =
		new AgreementMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAgreementModel(AgreementModel object) {
				return createAgreementModelAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseEnumerated(Enumerated object) {
				return createEnumeratedAdapter();
			}
			@Override
			public Adapter caseAgreementTerm(AgreementTerm object) {
				return createAgreementTermAdapter();
			}
			@Override
			public Adapter caseServiceConfiguration(ServiceConfiguration object) {
				return createServiceConfigurationAdapter();
			}
			@Override
			public Adapter caseGuaranteeTerm(GuaranteeTerm object) {
				return createGuaranteeTermAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseConfigurationProperty(ConfigurationProperty object) {
				return createConfigurationPropertyAdapter();
			}
			@Override
			public Adapter caseMonitorableProperty(MonitorableProperty object) {
				return createMonitorablePropertyAdapter();
			}
			@Override
			public Adapter caseSLO(SLO object) {
				return createSLOAdapter();
			}
			@Override
			public Adapter caseCompensation(Compensation object) {
				return createCompensationAdapter();
			}
			@Override
			public Adapter caseQualifyingCondition(QualifyingCondition object) {
				return createQualifyingConditionAdapter();
			}
			@Override
			public Adapter caseCompensationElement(CompensationElement object) {
				return createCompensationElementAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.AgreementModel <em>Agreement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.AgreementModel
	 * @generated
	 */
	public Adapter createAgreementModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Enumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Enumerated
	 * @generated
	 */
	public Adapter createEnumeratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.AgreementTerm <em>Agreement Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.AgreementTerm
	 * @generated
	 */
	public Adapter createAgreementTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.ServiceConfiguration <em>Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.ServiceConfiguration
	 * @generated
	 */
	public Adapter createServiceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.GuaranteeTerm <em>Guarantee Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.GuaranteeTerm
	 * @generated
	 */
	public Adapter createGuaranteeTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.ConfigurationProperty <em>Configuration Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.ConfigurationProperty
	 * @generated
	 */
	public Adapter createConfigurationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.MonitorableProperty <em>Monitorable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.MonitorableProperty
	 * @generated
	 */
	public Adapter createMonitorablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.SLO <em>SLO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.SLO
	 * @generated
	 */
	public Adapter createSLOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Compensation <em>Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Compensation
	 * @generated
	 */
	public Adapter createCompensationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.QualifyingCondition <em>Qualifying Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.QualifyingCondition
	 * @generated
	 */
	public Adapter createQualifyingConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.CompensationElement <em>Compensation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.CompensationElement
	 * @generated
	 */
	public Adapter createCompensationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AgreementMetamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AgreementMetamodel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
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

} //AgreementMetamodelAdapterFactory
