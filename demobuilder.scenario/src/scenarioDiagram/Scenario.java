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
 *   <li>{@link scenarioDiagram.Scenario#getScenarioElement <em>Scenario Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario Element</b></em>' containment reference list.
	 * The list contents are of type {@link scenarioDiagram.ScenarioElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Element</em>' containment reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getScenario_ScenarioElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioElement> getScenarioElement();

} // Scenario
