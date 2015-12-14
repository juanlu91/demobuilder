/**
 */
package scenarioDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.Customer#getServiceNeedLinks <em>Service Need Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getCustomer()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/demobuilder/icons/Customer.svg' label='name' tool.description='Customer' label.placement='external' label.icon='false' size='100,100' tool.small.bundle='demobuilder.edit' tool.small.path='/icons/full/obj16/Customer.gif' tool.large.bundle='demobuilder.edit' tool.large.path='/icons/full/obj32/Customer.gif'"
 * @generated
 */
public interface Customer extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Need Links</b></em>' reference list.
	 * The list contents are of type {@link scenarioDiagram.ServiceNeedLink}.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceNeedLink#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Need Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Need Links</em>' reference list.
	 * @see scenarioDiagram.ScenarioDiagramPackage#getCustomer_ServiceNeedLinks()
	 * @see scenarioDiagram.ServiceNeedLink#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<ServiceNeedLink> getServiceNeedLinks();

} // Customer
