/**
 */
package scenarioDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceLink#getActor <em>Actor</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceLink#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceLink()
 * @model annotation="gmf.link source='actor' target='serviceElement' label.placement='none' width='2' style='solid' tool.name='Service Link' tool.description='Creates a service link' color='0,0,0'"
 * @generated
 */
public interface ServiceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.Actor#getServiceLinks <em>Service Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceLink_Actor()
	 * @see scenarioDiagram.Actor#getServiceLinks
	 * @model opposite="serviceLinks"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceLink#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Service Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceElement#getServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Element</em>' reference.
	 * @see #setServiceElement(ServiceElement)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceLink_ServiceElement()
	 * @see scenarioDiagram.ServiceElement#getServiceLink
	 * @model opposite="serviceLink"
	 * @generated
	 */
	ServiceElement getServiceElement();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceLink#getServiceElement <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Element</em>' reference.
	 * @see #getServiceElement()
	 * @generated
	 */
	void setServiceElement(ServiceElement value);

} // ServiceLink
