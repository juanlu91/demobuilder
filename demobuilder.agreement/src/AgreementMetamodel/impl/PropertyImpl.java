/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.Feature;
import AgreementMetamodel.Metric;
import AgreementMetamodel.Property;
import AgreementMetamodel.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.PropertyImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.GLOBAL;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionReference() <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionReference()
	 * @generated
	 * @ordered
	 */
	protected String definitionReference = DEFINITION_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected Feature features;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metric metric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionReference() {
		return definitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionReference(String newDefinitionReference) {
		String oldDefinitionReference = definitionReference;
		definitionReference = newDefinitionReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__DEFINITION_REFERENCE, oldDefinitionReference, definitionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatures() {
		if (features != null && features.eIsProxy()) {
			InternalEObject oldFeatures = (InternalEObject)features;
			features = (Feature)eResolveProxy(oldFeatures);
			if (features != oldFeatures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementMetamodelPackage.PROPERTY__FEATURES, oldFeatures, features));
			}
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(Feature newFeatures) {
		Feature oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__FEATURES, oldFeatures, features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		if (metric != null && metric.eIsProxy()) {
			InternalEObject oldMetric = (InternalEObject)metric;
			metric = (Metric)eResolveProxy(oldMetric);
			if (metric != oldMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementMetamodelPackage.PROPERTY__METRIC, oldMetric, metric));
			}
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric basicGetMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		Metric oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.PROPERTY__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementMetamodelPackage.PROPERTY__EXPRESSION:
				return getExpression();
			case AgreementMetamodelPackage.PROPERTY__SCOPE:
				return getScope();
			case AgreementMetamodelPackage.PROPERTY__DEFINITION_REFERENCE:
				return getDefinitionReference();
			case AgreementMetamodelPackage.PROPERTY__ID:
				return getId();
			case AgreementMetamodelPackage.PROPERTY__FEATURES:
				if (resolve) return getFeatures();
				return basicGetFeatures();
			case AgreementMetamodelPackage.PROPERTY__METRIC:
				if (resolve) return getMetric();
				return basicGetMetric();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementMetamodelPackage.PROPERTY__EXPRESSION:
				setExpression((String)newValue);
				return;
			case AgreementMetamodelPackage.PROPERTY__SCOPE:
				setScope((Scope)newValue);
				return;
			case AgreementMetamodelPackage.PROPERTY__DEFINITION_REFERENCE:
				setDefinitionReference((String)newValue);
				return;
			case AgreementMetamodelPackage.PROPERTY__ID:
				setId((String)newValue);
				return;
			case AgreementMetamodelPackage.PROPERTY__FEATURES:
				setFeatures((Feature)newValue);
				return;
			case AgreementMetamodelPackage.PROPERTY__METRIC:
				setMetric((Metric)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.PROPERTY__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case AgreementMetamodelPackage.PROPERTY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.PROPERTY__DEFINITION_REFERENCE:
				setDefinitionReference(DEFINITION_REFERENCE_EDEFAULT);
				return;
			case AgreementMetamodelPackage.PROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case AgreementMetamodelPackage.PROPERTY__FEATURES:
				setFeatures((Feature)null);
				return;
			case AgreementMetamodelPackage.PROPERTY__METRIC:
				setMetric((Metric)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.PROPERTY__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case AgreementMetamodelPackage.PROPERTY__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case AgreementMetamodelPackage.PROPERTY__DEFINITION_REFERENCE:
				return DEFINITION_REFERENCE_EDEFAULT == null ? definitionReference != null : !DEFINITION_REFERENCE_EDEFAULT.equals(definitionReference);
			case AgreementMetamodelPackage.PROPERTY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AgreementMetamodelPackage.PROPERTY__FEATURES:
				return features != null;
			case AgreementMetamodelPackage.PROPERTY__METRIC:
				return metric != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expression: ");
		result.append(expression);
		result.append(", scope: ");
		result.append(scope);
		result.append(", definitionReference: ");
		result.append(definitionReference);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
