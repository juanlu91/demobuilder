/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.Scenario#getScenarioElements <em>Scenario Elements</em>}</li>
 *   <li>{@link scenarioDiagram.Scenario#getAgreementLinks <em>Agreement Links</em>}</li>
 *   <li>{@link scenarioDiagram.Scenario#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario Elements</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.ScenarioElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Elements</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario_ScenarioElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioElement> getScenarioElements();

	/**
	 * Returns the value of the '<em><b>Agreement Links</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.AgreementLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Links</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario_AgreementLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgreementLink> getAgreementLinks();

	/**
	 * Returns the value of the '<em><b>Service Links</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Links</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario_ServiceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLink> getServiceLinks();

} // Scenario
