/**
 */
package assignment2.impl;

import assignment2.AdditionalCharge;
import assignment2.Assignment2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.AdditionalChargeImpl#getServiceCharge <em>Service Charge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalChargeImpl extends MinimalEObjectImpl.Container implements AdditionalCharge {
	/**
	 * The default value of the '{@link #getServiceCharge() <em>Service Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCharge()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICE_CHARGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServiceCharge() <em>Service Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceCharge()
	 * @generated
	 * @ordered
	 */
	protected double serviceCharge = SERVICE_CHARGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalChargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.ADDITIONAL_CHARGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getServiceCharge() {
		return serviceCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceCharge(double newServiceCharge) {
		double oldServiceCharge = serviceCharge;
		serviceCharge = newServiceCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ADDITIONAL_CHARGE__SERVICE_CHARGE, oldServiceCharge, serviceCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment2Package.ADDITIONAL_CHARGE__SERVICE_CHARGE:
				return getServiceCharge();
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
			case Assignment2Package.ADDITIONAL_CHARGE__SERVICE_CHARGE:
				setServiceCharge((Double)newValue);
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
			case Assignment2Package.ADDITIONAL_CHARGE__SERVICE_CHARGE:
				setServiceCharge(SERVICE_CHARGE_EDEFAULT);
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
			case Assignment2Package.ADDITIONAL_CHARGE__SERVICE_CHARGE:
				return serviceCharge != SERVICE_CHARGE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serviceCharge: ");
		result.append(serviceCharge);
		result.append(')');
		return result.toString();
	}

} //AdditionalChargeImpl
