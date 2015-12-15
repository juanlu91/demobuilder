/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.Provider#getServiceOfferLinks <em>Service Offer Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getProvider()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/demobuilder/icons/Provider.svg' label='name' tool.description='Provider' label.placement='external' label.icon='false' size='100,100' tool.small.bundle='demobuilder.edit' tool.small.path='/icons/full/obj16/Provider.gif' tool.large.bundle='demobuilder.edit' tool.large.path='/icons/full/obj32/Provider.gif'"
 * @generated
 */
public interface Provider extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Offer Links</b></em>' reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceOfferLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Offer Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Offer Links</em>' reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getProvider_ServiceOfferLinks()
	 * @model
	 * @generated
	 */
	EList<ServiceOfferLink> getServiceOfferLinks();

} // Provider
