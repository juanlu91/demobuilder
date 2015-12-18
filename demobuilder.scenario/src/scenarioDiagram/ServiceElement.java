/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceElement#getServiceLink <em>Service Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceElement()
 * @model
 * @generated
 */
public interface ServiceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceLink#getServiceElement <em>Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Link</em>' reference.
	 * @see #setServiceLink(ServiceLink)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceElement_ServiceLink()
	 * @see scenarioDiagram.ServiceLink#getServiceElement
	 * @model opposite="serviceElement"
	 * @generated
	 */
	ServiceLink getServiceLink();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceElement#getServiceLink <em>Service Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Link</em>' reference.
	 * @see #getServiceLink()
	 * @generated
	 */
	void setServiceLink(ServiceLink value);

} // ServiceElement
