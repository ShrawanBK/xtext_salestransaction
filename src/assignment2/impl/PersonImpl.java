/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Cashier;
import assignment2.Customer;
import assignment2.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.PersonImpl#getSurName <em>Sur Name</em>}</li>
 *   <li>{@link assignment2.impl.PersonImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link assignment2.impl.PersonImpl#getCashier <em>Cashier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends NamedElementImpl implements Person {
	/**
	 * The default value of the '{@link #getSurName() <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurName() <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurName()
	 * @generated
	 * @ordered
	 */
	protected String surName = SUR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getCashier() <em>Cashier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashier()
	 * @generated
	 * @ordered
	 */
	protected Cashier cashier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurName(String newSurName) {
		String oldSurName = surName;
		surName = newSurName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PERSON__SUR_NAME, oldSurName, surName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.PERSON__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.PERSON__CUSTOMER, null, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.PERSON__CUSTOMER, null, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PERSON__CUSTOMER, newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cashier getCashier() {
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCashier(Cashier newCashier, NotificationChain msgs) {
		Cashier oldCashier = cashier;
		cashier = newCashier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.PERSON__CASHIER, oldCashier, newCashier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashier(Cashier newCashier) {
		if (newCashier != cashier) {
			NotificationChain msgs = null;
			if (cashier != null)
				msgs = ((InternalEObject)cashier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.PERSON__CASHIER, null, msgs);
			if (newCashier != null)
				msgs = ((InternalEObject)newCashier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.PERSON__CASHIER, null, msgs);
			msgs = basicSetCashier(newCashier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PERSON__CASHIER, newCashier, newCashier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.PERSON__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case Assignment2Package.PERSON__CASHIER:
				return basicSetCashier(null, msgs);
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
			case Assignment2Package.PERSON__SUR_NAME:
				return getSurName();
			case Assignment2Package.PERSON__CUSTOMER:
				return getCustomer();
			case Assignment2Package.PERSON__CASHIER:
				return getCashier();
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
			case Assignment2Package.PERSON__SUR_NAME:
				setSurName((String)newValue);
				return;
			case Assignment2Package.PERSON__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case Assignment2Package.PERSON__CASHIER:
				setCashier((Cashier)newValue);
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
			case Assignment2Package.PERSON__SUR_NAME:
				setSurName(SUR_NAME_EDEFAULT);
				return;
			case Assignment2Package.PERSON__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case Assignment2Package.PERSON__CASHIER:
				setCashier((Cashier)null);
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
			case Assignment2Package.PERSON__SUR_NAME:
				return SUR_NAME_EDEFAULT == null ? surName != null : !SUR_NAME_EDEFAULT.equals(surName);
			case Assignment2Package.PERSON__CUSTOMER:
				return customer != null;
			case Assignment2Package.PERSON__CASHIER:
				return cashier != null;
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
		result.append(" (surName: ");
		result.append(surName);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
