/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementCompositor;
import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.AgreementModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Compositor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.AgreementCompositorImpl#getAgreements <em>Agreements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementCompositorImpl extends EObjectImpl implements AgreementCompositor {
	/**
	 * The cached value of the '{@link #getAgreements() <em>Agreements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<AgreementModel> agreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementCompositorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.AGREEMENT_COMPOSITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgreementModel> getAgreements() {
		if (agreements == null) {
			agreements = new EObjectContainmentEList<AgreementModel>(AgreementModel.class, this, AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS);
		}
		return agreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS:
				return ((InternalEList<?>)getAgreements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS:
				return getAgreements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS:
				getAgreements().clear();
				getAgreements().addAll((Collection<? extends AgreementModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS:
				getAgreements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_COMPOSITOR__AGREEMENTS:
				return agreements != null && !agreements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgreementCompositorImpl
