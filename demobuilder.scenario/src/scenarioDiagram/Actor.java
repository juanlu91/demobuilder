/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.Actor#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Links</b></em>' reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceLink}.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceLink#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Links</em>' reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getActor_ServiceLinks()
	 * @see scenarioDiagram.ServiceLink#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<ServiceLink> getServiceLinks();

} // Actor
