/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarantee Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getExpression <em>Expression</em>}</li>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getCondition <em>Condition</em>}</li>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getCompensationInterval <em>Compensation Interval</em>}</li>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getCompensationType <em>Compensation Type</em>}</li>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getCompensationExpression <em>Compensation Expression</em>}</li>
 *   <li>{@link scenarioDiagram.GuaranteeTerm#getCompensationCondition <em>Compensation Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='svg' svg.uri='platform:/plugin/demobuilder.scenario/icons/GuaranteeTerm.svg' tool.name='Guarantee Term' tool.description='Creates a new guarantee term' tool.small.bundle='demobuilder.scenario.edit' tool.small.path='/icons/full/obj16/GuaranteeTerm.gif' tool.large.bundle='demobuilder.scenario.edit' tool.large.path='/icons/full/obj32/GuaranteeTerm.gif'"
 * @generated
 */
public interface GuaranteeTerm extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_CompensationInterval()
	 * @model default="MONTHLY"
	 * @generated
	 */
	AssessmentInterval getCompensationInterval();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getCompensationInterval <em>Compensation Interval</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_CompensationType()
	 * @model default="REWARD"
	 * @generated
	 */
	CompensationType getCompensationType();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getCompensationType <em>Compensation Type</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_CompensationExpression()
	 * @model
	 * @generated
	 */
	String getCompensationExpression();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getCompensationExpression <em>Compensation Expression</em>}' attribute.
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
	 * @see scenarioDiagram.ScenarioDiagramPackage#getGuaranteeTerm_CompensationCondition()
	 * @model
	 * @generated
	 */
	String getCompensationCondition();

	/**
	 * Sets the value of the '{@link scenarioDiagram.GuaranteeTerm#getCompensationCondition <em>Compensation Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Condition</em>' attribute.
	 * @see #getCompensationCondition()
	 * @generated
	 */
	void setCompensationCondition(String value);

} // GuaranteeTerm
