/**
 */
package AgreementMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Compositor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AgreementMetamodel.AgreementCompositor#getAgreements <em>Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementCompositor()
 * @model
 * @generated
 */
public interface AgreementCompositor extends EObject {
	/**
	 * Returns the value of the '<em><b>Agreements</b></em>' containment reference list.
	 * The list contents are of type {@link AgreementMetamodel.AgreementModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreements</em>' containment reference list.
	 * @see AgreementMetamodel.AgreementMetamodelPackage#getAgreementCompositor_Agreements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgreementModel> getAgreements();

} // AgreementCompositor
