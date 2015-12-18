/**
 */
package scenarioDiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import scenarioDiagram.AssessmentInterval;
import scenarioDiagram.CompensationType;
import scenarioDiagram.PricingPlanElement;
import scenarioDiagram.ScenarioDiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Plan Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getSLOExpression <em>SLO Expression</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getQualifyingCondition <em>Qualifying Condition</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getCompensationInterval <em>Compensation Interval</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getCompensationType <em>Compensation Type</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getCompensationExpression <em>Compensation Expression</em>}</li>
 *   <li>{@link scenarioDiagram.impl.PricingPlanElementImpl#getCompensationCondition <em>Compensation Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PricingPlanElementImpl extends EObjectImpl implements PricingPlanElement {
	/**
	 * The default value of the '{@link #getSLOExpression() <em>SLO Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLOExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SLO_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSLOExpression() <em>SLO Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLOExpression()
	 * @generated
	 * @ordered
	 */
	protected String sloExpression = SLO_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifyingCondition() <em>Qualifying Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifyingCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFYING_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifyingCondition() <em>Qualifying Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifyingCondition()
	 * @generated
	 * @ordered
	 */
	protected String qualifyingCondition = QUALIFYING_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensationInterval() <em>Compensation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentInterval COMPENSATION_INTERVAL_EDEFAULT = AssessmentInterval.MONTHLY;

	/**
	 * The cached value of the '{@link #getCompensationInterval() <em>Compensation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationInterval()
	 * @generated
	 * @ordered
	 */
	protected AssessmentInterval compensationInterval = COMPENSATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensationType() <em>Compensation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationType()
	 * @generated
	 * @ordered
	 */
	protected static final CompensationType COMPENSATION_TYPE_EDEFAULT = CompensationType.REWARD;

	/**
	 * The cached value of the '{@link #getCompensationType() <em>Compensation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationType()
	 * @generated
	 * @ordered
	 */
	protected CompensationType compensationType = COMPENSATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensationExpression() <em>Compensation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensationExpression() <em>Compensation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationExpression()
	 * @generated
	 * @ordered
	 */
	protected String compensationExpression = COMPENSATION_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensationCondition() <em>Compensation Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATION_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensationCondition() <em>Compensation Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationCondition()
	 * @generated
	 * @ordered
	 */
	protected String compensationCondition = COMPENSATION_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingPlanElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioDiagramPackage.Literals.PRICING_PLAN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSLOExpression() {
		return sloExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSLOExpression(String newSLOExpression) {
		String oldSLOExpression = sloExpression;
		sloExpression = newSLOExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__SLO_EXPRESSION, oldSLOExpression, sloExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifyingCondition() {
		return qualifyingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifyingCondition(String newQualifyingCondition) {
		String oldQualifyingCondition = qualifyingCondition;
		qualifyingCondition = newQualifyingCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION, oldQualifyingCondition, qualifyingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentInterval getCompensationInterval() {
		return compensationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationInterval(AssessmentInterval newCompensationInterval) {
		AssessmentInterval oldCompensationInterval = compensationInterval;
		compensationInterval = newCompensationInterval == null ? COMPENSATION_INTERVAL_EDEFAULT : newCompensationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL, oldCompensationInterval, compensationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensationType getCompensationType() {
		return compensationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationType(CompensationType newCompensationType) {
		CompensationType oldCompensationType = compensationType;
		compensationType = newCompensationType == null ? COMPENSATION_TYPE_EDEFAULT : newCompensationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_TYPE, oldCompensationType, compensationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensationExpression() {
		return compensationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationExpression(String newCompensationExpression) {
		String oldCompensationExpression = compensationExpression;
		compensationExpression = newCompensationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION, oldCompensationExpression, compensationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensationCondition() {
		return compensationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationCondition(String newCompensationCondition) {
		String oldCompensationCondition = compensationCondition;
		compensationCondition = newCompensationCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION, oldCompensationCondition, compensationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__SLO_EXPRESSION:
				return getSLOExpression();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION:
				return getQualifyingCondition();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL:
				return getCompensationInterval();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_TYPE:
				return getCompensationType();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION:
				return getCompensationExpression();
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION:
				return getCompensationCondition();
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
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__SLO_EXPRESSION:
				setSLOExpression((String)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION:
				setQualifyingCondition((String)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL:
				setCompensationInterval((AssessmentInterval)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_TYPE:
				setCompensationType((CompensationType)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION:
				setCompensationExpression((String)newValue);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION:
				setCompensationCondition((String)newValue);
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
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__SLO_EXPRESSION:
				setSLOExpression(SLO_EXPRESSION_EDEFAULT);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION:
				setQualifyingCondition(QUALIFYING_CONDITION_EDEFAULT);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL:
				setCompensationInterval(COMPENSATION_INTERVAL_EDEFAULT);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_TYPE:
				setCompensationType(COMPENSATION_TYPE_EDEFAULT);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION:
				setCompensationExpression(COMPENSATION_EXPRESSION_EDEFAULT);
				return;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION:
				setCompensationCondition(COMPENSATION_CONDITION_EDEFAULT);
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
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__SLO_EXPRESSION:
				return SLO_EXPRESSION_EDEFAULT == null ? sloExpression != null : !SLO_EXPRESSION_EDEFAULT.equals(sloExpression);
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__QUALIFYING_CONDITION:
				return QUALIFYING_CONDITION_EDEFAULT == null ? qualifyingCondition != null : !QUALIFYING_CONDITION_EDEFAULT.equals(qualifyingCondition);
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_INTERVAL:
				return compensationInterval != COMPENSATION_INTERVAL_EDEFAULT;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_TYPE:
				return compensationType != COMPENSATION_TYPE_EDEFAULT;
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_EXPRESSION:
				return COMPENSATION_EXPRESSION_EDEFAULT == null ? compensationExpression != null : !COMPENSATION_EXPRESSION_EDEFAULT.equals(compensationExpression);
			case ScenarioDiagramPackage.PRICING_PLAN_ELEMENT__COMPENSATION_CONDITION:
				return COMPENSATION_CONDITION_EDEFAULT == null ? compensationCondition != null : !COMPENSATION_CONDITION_EDEFAULT.equals(compensationCondition);
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
		result.append(" (SLOExpression: ");
		result.append(sloExpression);
		result.append(", qualifyingCondition: ");
		result.append(qualifyingCondition);
		result.append(", compensationInterval: ");
		result.append(compensationInterval);
		result.append(", compensationType: ");
		result.append(compensationType);
		result.append(", compensationExpression: ");
		result.append(compensationExpression);
		result.append(", compensationCondition: ");
		result.append(compensationCondition);
		result.append(')');
		return result.toString();
	}

} //PricingPlanElementImpl
