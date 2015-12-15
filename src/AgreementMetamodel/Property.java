/**
 */
package AgreementMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Property#getExpression <em>Expression</em>}</li>
 *   <li>{@link AgreementMetamodel.Property#getScope <em>Scope</em>}</li>
 *   <li>{@link AgreementMetamodel.Property#getDefinitionReference <em>Definition Reference</em>}</li>
 *   <li>{@link AgreementMetamodel.Property#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.Property#getFeatures <em>Features</em>}</li>
 *   <li>{@link AgreementMetamodel.Property#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"GLOBAL"</code>.
	 * The literals are from the enumeration {@link AgreementMetamodel.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see AgreementMetamodel.Scope
	 * @see #setScope(Scope)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_Scope()
	 * @model default="GLOBAL"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see AgreementMetamodel.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Definition Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Reference</em>' attribute.
	 * @see #setDefinitionReference(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_DefinitionReference()
	 * @model
	 * @generated
	 */
	String getDefinitionReference();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getDefinitionReference <em>Definition Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Reference</em>' attribute.
	 * @see #getDefinitionReference()
	 * @generated
	 */
	void setDefinitionReference(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference.
	 * @see #setFeatures(Feature)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_Features()
	 * @model
	 * @generated
	 */
	Feature getFeatures();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getFeatures <em>Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(Feature value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getProperty_Metric()
	 * @model
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link AgreementMetamodel.Property#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

} // Property
