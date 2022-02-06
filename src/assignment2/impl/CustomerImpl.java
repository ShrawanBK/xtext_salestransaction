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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.CustomerImpl#getIdentityNumber <em>Identity Number</em>}</li>
 *   <li>{@link assignment2.impl.CustomerImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link assignment2.impl.CustomerImpl#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getIdentityNumber() <em>Identity Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentityNumber() <em>Identity Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityNumber()
	 * @generated
	 * @ordered
	 */
	protected String identityNumber = IDENTITY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected Card card;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentityNumber() {
		return identityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentityNumber(String newIdentityNumber) {
		String oldIdentityNumber = identityNumber;
		identityNumber = newIdentityNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CUSTOMER__IDENTITY_NUMBER, oldIdentityNumber, identityNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CUSTOMER__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getCard() {
		if (card != null && card.eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (Card)eResolveProxy(oldCard);
			if (card != oldCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.CUSTOMER__CARD, oldCard, card));
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCard(Card newCard, NotificationChain msgs) {
		Card oldCard = card;
		card = newCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.CUSTOMER__CARD, oldCard, newCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(Card newCard) {
		if (newCard != card) {
			NotificationChain msgs = null;
			if (card != null)
				msgs = ((InternalEObject)card).eInverseRemove(this, Assignment2Package.CARD__CARD_HOLDER, Card.class, msgs);
			if (newCard != null)
				msgs = ((InternalEObject)newCard).eInverseAdd(this, Assignment2Package.CARD__CARD_HOLDER, Card.class, msgs);
			msgs = basicSetCard(newCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.CUSTOMER__CARD, newCard, newCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.CUSTOMER__CARD:
				if (card != null)
					msgs = ((InternalEObject)card).eInverseRemove(this, Assignment2Package.CARD__CARD_HOLDER, Card.class, msgs);
				return basicSetCard((Card)otherEnd, msgs);
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
			case Assignment2Package.CUSTOMER__CARD:
				return basicSetCard(null, msgs);
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
			case Assignment2Package.CUSTOMER__IDENTITY_NUMBER:
				return getIdentityNumber();
			case Assignment2Package.CUSTOMER__PHONE_NUMBER:
				return getPhoneNumber();
			case Assignment2Package.CUSTOMER__CARD:
				if (resolve) return getCard();
				return basicGetCard();
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
			case Assignment2Package.CUSTOMER__IDENTITY_NUMBER:
				setIdentityNumber((String)newValue);
				return;
			case Assignment2Package.CUSTOMER__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case Assignment2Package.CUSTOMER__CARD:
				setCard((Card)newValue);
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
			case Assignment2Package.CUSTOMER__IDENTITY_NUMBER:
				setIdentityNumber(IDENTITY_NUMBER_EDEFAULT);
				return;
			case Assignment2Package.CUSTOMER__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case Assignment2Package.CUSTOMER__CARD:
				setCard((Card)null);
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
			case Assignment2Package.CUSTOMER__IDENTITY_NUMBER:
				return IDENTITY_NUMBER_EDEFAULT == null ? identityNumber != null : !IDENTITY_NUMBER_EDEFAULT.equals(identityNumber);
			case Assignment2Package.CUSTOMER__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case Assignment2Package.CUSTOMER__CARD:
				return card != null;
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
		result.append(" (identityNumber: ");
		result.append(identityNumber);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
