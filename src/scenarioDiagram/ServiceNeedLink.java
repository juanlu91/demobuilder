/**
 */
package scenarioDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Need Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link scenarioDiagram.ServiceNeedLink#getServiceNeed <em>Service Need</em>}</li>
 *   <li>{@link scenarioDiagram.ServiceNeedLink#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeedLink()
 * @model annotation="gmf.link source='customer' label.placement='none' target='serviceNeed' target.decoration='arrow' width='2' style='solid' tool.description='Service needs link' color='0,0,0'"
 * @generated
 */
public interface ServiceNeedLink extends ScenarioElement {
	/**
	 * Returns the value of the '<em><b>Service Need</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.ServiceNeed#getServiceNeedLink <em>Service Need Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Need</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Need</em>' reference.
	 * @see #setServiceNeed(ServiceNeed)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeedLink_ServiceNeed()
	 * @see scenarioDiagram.ServiceNeed#getServiceNeedLink
	 * @model opposite="serviceNeedLink"
	 * @generated
	 */
	ServiceNeed getServiceNeed();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceNeedLink#getServiceNeed <em>Service Need</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Need</em>' reference.
	 * @see #getServiceNeed()
	 * @generated
	 */
	void setServiceNeed(ServiceNeed value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scenarioDiagram.Customer#getServiceNeedLinks <em>Service Need Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see scenarioDiagram.ScenarioDiagramPackage#getServiceNeedLink_Customer()
	 * @see scenarioDiagram.Customer#getServiceNeedLinks
	 * @model opposite="serviceNeedLinks"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link scenarioDiagram.ServiceNeedLink#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // ServiceNeedLink
