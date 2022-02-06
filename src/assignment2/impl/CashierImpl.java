/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Cashier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.CashierImpl#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierImpl extends PersonImpl implements Cashier {
	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.CASHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(String newEmployeeId) {
		String oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CASHIER__EMPLOYEE_ID, oldEmployeeId, employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment2Package.CASHIER__EMPLOYEE_ID:
				return getEmployeeId();
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
			case Assignment2Package.CASHIER__EMPLOYEE_ID:
				setEmployeeId((String)newValue);
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
			case Assignment2Package.CASHIER__EMPLOYEE_ID:
				setEmployeeId(EMPLOYEE_ID_EDEFAULT);
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
			case Assignment2Package.CASHIER__EMPLOYEE_ID:
				return EMPLOYEE_ID_EDEFAULT == null ? employeeId != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeId);
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
		result.append(" (employeeId: ");
		result.append(employeeId);
		result.append(')');
		return result.toString();
	}

} //CashierImpl
