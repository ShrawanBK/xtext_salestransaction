/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Card;
import assignment2.Customer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.CardImpl#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link assignment2.impl.CardImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link assignment2.impl.CardImpl#getExpiryDate <em>Expiry Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The cached value of the '{@link #getCardHolder() <em>Card Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHolder()
	 * @generated
	 * @ordered
	 */
	protected Customer cardHolder;

	/**
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected String cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected String expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCardHolder() {
		if (cardHolder != null && cardHolder.eIsProxy()) {
			InternalEObject oldCardHolder = (InternalEObject)cardHolder;
			cardHolder = (Customer)eResolveProxy(oldCardHolder);
			if (cardHolder != oldCardHolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.CARD__CARD_HOLDER, oldCardHolder, cardHolder));
			}
		}
		return cardHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCardHolder() {
		return cardHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardHolder(Customer newCardHolder, NotificationChain msgs) {
		Customer oldCardHolder = cardHolder;
		cardHolder = newCardHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.CARD__CARD_HOLDER, oldCardHolder, newCardHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardHolder(Customer newCardHolder) {
		if (newCardHolder != cardHolder) {
			NotificationChain msgs = null;
			if (cardHolder != null)
				msgs = ((InternalEObject)cardHolder).eInverseRemove(this, Assignment2Package.CUSTOMER__CARD, Customer.class, msgs);
			if (newCardHolder != null)
				msgs = ((InternalEObject)newCardHolder).eInverseAdd(this, Assignment2Package.CUSTOMER__CARD, Customer.class, msgs);
			msgs = basicSetCardHolder(newCardHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CARD__CARD_HOLDER, newCardHolder, newCardHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumber(String newCardNumber) {
		String oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CARD__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryDate(String newExpiryDate) {
		String oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CARD__EXPIRY_DATE, oldExpiryDate, expiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.CARD__CARD_HOLDER:
				if (cardHolder != null)
					msgs = ((InternalEObject)cardHolder).eInverseRemove(this, Assignment2Package.CUSTOMER__CARD, Customer.class, msgs);
				return basicSetCardHolder((Customer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.CARD__CARD_HOLDER:
				return basicSetCardHolder(null, msgs);
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
			case Assignment2Package.CARD__CARD_HOLDER:
				if (resolve) return getCardHolder();
				return basicGetCardHolder();
			case Assignment2Package.CARD__CARD_NUMBER:
				return getCardNumber();
			case Assignment2Package.CARD__EXPIRY_DATE:
				return getExpiryDate();
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
			case Assignment2Package.CARD__CARD_HOLDER:
				setCardHolder((Customer)newValue);
				return;
			case Assignment2Package.CARD__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case Assignment2Package.CARD__EXPIRY_DATE:
				setExpiryDate((String)newValue);
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
			case Assignment2Package.CARD__CARD_HOLDER:
				setCardHolder((Customer)null);
				return;
			case Assignment2Package.CARD__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case Assignment2Package.CARD__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
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
			case Assignment2Package.CARD__CARD_HOLDER:
				return cardHolder != null;
			case Assignment2Package.CARD__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case Assignment2Package.CARD__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null ? expiryDate != null : !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
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
		result.append(" (cardNumber: ");
		result.append(cardNumber);
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(')');
		return result.toString();
	}

} //CardImpl
