/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceElement#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceElement()
 * @model
 * @generated
 */
public interface ServiceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Links</b></em>' reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceLink}.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceLink#getServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Links</em>' reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceElement_ServiceLinks()
	 * @see scenarioDiagram.ServiceLink#getServiceElement
	 * @model opposite="serviceElement"
	 * @generated
	 */
	EList<ServiceLink> getServiceLinks();

} // ServiceElement
