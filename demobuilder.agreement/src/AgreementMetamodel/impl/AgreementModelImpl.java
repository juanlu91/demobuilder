/**
 */
package AgreementMetamodel.impl;

import AgreementMetamodel.AgreementMetamodelPackage;
import AgreementMetamodel.AgreementModel;
import AgreementMetamodel.AgreementTerm;
import AgreementMetamodel.Context;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AgreementMetamodel.impl.AgreementModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.AgreementModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.AgreementModelImpl#getContext <em>Context</em>}</li>
 *   <li>{@link AgreementMetamodel.impl.AgreementModelImpl#getAgTerm <em>Ag Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementModelImpl extends EObjectImpl implements AgreementModel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final double VERSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected double version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getAgTerm() <em>Ag Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgTerm()
	 * @generated
	 * @ordered
	 */
	protected AgreementTerm agTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementMetamodelPackage.Literals.AGREEMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(double newVersion) {
		double oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTerm getAgTerm() {
		return agTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgTerm(AgreementTerm newAgTerm, NotificationChain msgs) {
		AgreementTerm oldAgTerm = agTerm;
		agTerm = newAgTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM, oldAgTerm, newAgTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgTerm(AgreementTerm newAgTerm) {
		if (newAgTerm != agTerm) {
			NotificationChain msgs = null;
			if (agTerm != null)
				msgs = ((InternalEObject)agTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM, null, msgs);
			if (newAgTerm != null)
				msgs = ((InternalEObject)newAgTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM, null, msgs);
			msgs = basicSetAgTerm(newAgTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM, newAgTerm, newAgTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT:
				return basicSetContext(null, msgs);
			case AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM:
				return basicSetAgTerm(null, msgs);
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
			case AgreementMetamodelPackage.AGREEMENT_MODEL__ID:
				return getId();
			case AgreementMetamodelPackage.AGREEMENT_MODEL__VERSION:
				return getVersion();
			case AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT:
				return getContext();
			case AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM:
				return getAgTerm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementMetamodelPackage.AGREEMENT_MODEL__ID:
				setId((String)newValue);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__VERSION:
				setVersion((Double)newValue);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT:
				setContext((Context)newValue);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM:
				setAgTerm((AgreementTerm)newValue);
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
			case AgreementMetamodelPackage.AGREEMENT_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT:
				setContext((Context)null);
				return;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM:
				setAgTerm((AgreementTerm)null);
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
			case AgreementMetamodelPackage.AGREEMENT_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AgreementMetamodelPackage.AGREEMENT_MODEL__VERSION:
				return version != VERSION_EDEFAULT;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__CONTEXT:
				return context != null;
			case AgreementMetamodelPackage.AGREEMENT_MODEL__AG_TERM:
				return agTerm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AgreementModelImpl
