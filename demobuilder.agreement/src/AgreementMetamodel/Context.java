/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.Context#getActors <em>Actors</em>}</li>
 *   <li>{@link AgreementMetamodel.Context#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getContext()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='rectangle' tool.name='Context' tool.description='Creates a new context section'"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getContext_Actors()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getContext_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

} // Context
