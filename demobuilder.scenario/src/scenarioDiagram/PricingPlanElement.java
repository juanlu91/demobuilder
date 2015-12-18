/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Plan Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getSLOExpression <em>SLO Expression</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getQualifyingCondition <em>Qualifying Condition</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getCompensationInterval <em>Compensation Interval</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getCompensationType <em>Compensation Type</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getCompensationExpression <em>Compensation Expression</em>}</li>
 *   <li>{@link scenarioDiagram.PricingPlanElement#getCompensationCondition <em>Compensation Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement()
 * @model annotation="gmf.node label='SLOExpression' label.icon='false' border.color='0,0,0' figure='rectangle' border.width='1' border.style='dot' tool.name='Pricing Plan Element' tool.description='Creates a new pricing plan' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/PricingPlanElement.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/PricingPlanElement.gif'"
 * @generated
 */
public interface PricingPlanElement extends EObject {
	/**
	 * Returns the value of the '<em><b>SLO Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SLO Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SLO Expression</em>' attribute.
	 * @see #setSLOExpression(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_SLOExpression()
	 * @model
	 * @generated
	 */
	String getSLOExpression();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getSLOExpression <em>SLO Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SLO Expression</em>' attribute.
	 * @see #getSLOExpression()
	 * @generated
	 */
	void setSLOExpression(String value);

	/**
	 * Returns the value of the '<em><b>Qualifying Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifying Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifying Condition</em>' attribute.
	 * @see #setQualifyingCondition(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_QualifyingCondition()
	 * @model
	 * @generated
	 */
	String getQualifyingCondition();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getQualifyingCondition <em>Qualifying Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifying Condition</em>' attribute.
	 * @see #getQualifyingCondition()
	 * @generated
	 */
	void setQualifyingCondition(String value);

	/**
	 * Returns the value of the '<em><b>Compensation Interval</b></em>' attribute.
	 * The default value is <code>"MONTHLY"</code>.
	 * The literals are from the enumeration {@link scenarioDiagram.AssessmentInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Interval</em>' attribute.
	 * @see scenarioDiagram.AssessmentInterval
	 * @see #setCompensationInterval(AssessmentInterval)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_CompensationInterval()
	 * @model default="MONTHLY"
	 * @generated
	 */
	AssessmentInterval getCompensationInterval();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getCompensationInterval <em>Compensation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Interval</em>' attribute.
	 * @see scenarioDiagram.AssessmentInterval
	 * @see #getCompensationInterval()
	 * @generated
	 */
	void setCompensationInterval(AssessmentInterval value);

	/**
	 * Returns the value of the '<em><b>Compensation Type</b></em>' attribute.
	 * The default value is <code>"REWARD"</code>.
	 * The literals are from the enumeration {@link scenarioDiagram.CompensationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Type</em>' attribute.
	 * @see scenarioDiagram.CompensationType
	 * @see #setCompensationType(CompensationType)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_CompensationType()
	 * @model default="REWARD"
	 * @generated
	 */
	CompensationType getCompensationType();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getCompensationType <em>Compensation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Type</em>' attribute.
	 * @see scenarioDiagram.CompensationType
	 * @see #getCompensationType()
	 * @generated
	 */
	void setCompensationType(CompensationType value);

	/**
	 * Returns the value of the '<em><b>Compensation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Expression</em>' attribute.
	 * @see #setCompensationExpression(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_CompensationExpression()
	 * @model
	 * @generated
	 */
	String getCompensationExpression();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getCompensationExpression <em>Compensation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Expression</em>' attribute.
	 * @see #getCompensationExpression()
	 * @generated
	 */
	void setCompensationExpression(String value);

	/**
	 * Returns the value of the '<em><b>Compensation Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Condition</em>' attribute.
	 * @see #setCompensationCondition(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getPricingPlanElement_CompensationCondition()
	 * @model
	 * @generated
	 */
	String getCompensationCondition();

	/**
	 * Sets the value of the '{@link scenarioDiagram.PricingPlanElement#getCompensationCondition <em>Compensation Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Condition</em>' attribute.
	 * @see #getCompensationCondition()
	 * @generated
	 */
	void setCompensationCondition(String value);

} // PricingPlanElement
