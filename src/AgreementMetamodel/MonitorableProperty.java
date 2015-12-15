/**
 */
package AgreementMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitorable Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.MonitorableProperty#getMonitorReference <em>Monitor Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getMonitorableProperty()
 * @model annotation="gmf.node label='id' label.icon='false' figure='rectangle' tool.name='Monitorable Property' tool.description='Creates a new monitorable property'"
 * @generated
 */
public interface MonitorableProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Monitor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Reference</em>' attribute.
	 * @see #setMonitorReference(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getMonitorableProperty_MonitorReference()
	 * @model
	 * @generated
	 */
	String getMonitorReference();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.MonitorableProperty#getMonitorReference <em>Monitor Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Reference</em>' attribute.
	 * @see #getMonitorReference()
	 * @generated
	 */
	void setMonitorReference(String value);

} // MonitorableProperty
