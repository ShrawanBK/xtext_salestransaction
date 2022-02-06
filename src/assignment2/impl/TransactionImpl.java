/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Assignment2Tables;
import assignment2.Card;
import assignment2.Cashier;
import assignment2.Customer;
import assignment2.LineItem;
import assignment2.PaymentMethod;
import assignment2.Transaction;
import assignment2.TransactionType;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.TransactionImpl#getTransactionNumber <em>Transaction Number</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getIssuedDate <em>Issued Date</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getTotalItemsPurchased <em>Total Items Purchased</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getCashier <em>Cashier</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link assignment2.impl.TransactionImpl#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction {
	/**
	 * The default value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected String transactionNumber = TRANSACTION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuedDate() <em>Issued Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuedDate() <em>Issued Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuedDate()
	 * @generated
	 * @ordered
	 */
	protected Date issuedDate = ISSUED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionType TRANSACTION_TYPE_EDEFAULT = TransactionType.CASH_SALES;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected TransactionType transactionType = TRANSACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = PaymentMethod.CASH;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double GRAND_TOTAL_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTotalItemsPurchased() <em>Total Items Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalItemsPurchased()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_ITEMS_PURCHASED_EDEFAULT = 0;

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
	 * The cached value of the '{@link #getLineItem() <em>Line Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineItem()
	 * @generated
	 * @ordered
	 */
	protected EList<LineItem> lineItem;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference.
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
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionNumber(String newTransactionNumber) {
		String oldTransactionNumber = transactionNumber;
		transactionNumber = newTransactionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__TRANSACTION_NUMBER, oldTransactionNumber, transactionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssuedDate() {
		return issuedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuedDate(Date newIssuedDate) {
		Date oldIssuedDate = issuedDate;
		issuedDate = newIssuedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__ISSUED_DATE, oldIssuedDate, issuedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionType newTransactionType) {
		TransactionType oldTransactionType = transactionType;
		transactionType = newTransactionType == null ? TRANSACTION_TYPE_EDEFAULT : newTransactionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__TRANSACTION_TYPE, oldTransactionType, transactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		PaymentMethod oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGrandTotal() {
		/**
		 * lineItem.subTotal->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<LineItem> lineItem = this.getLineItem();
		final /*@NonInvalid*/ OrderedSetValue BOXED_lineItem = idResolver.createOrderedSetOfAll(Assignment2Tables.ORD_CLSSid_LineItem, lineItem);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(Assignment2Tables.SEQ_DATAid_EDouble);
		Iterator<Object> ITERATOR__1 = BOXED_lineItem.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ LineItem _1 = (LineItem)ITERATOR__1.next();
			/**
			 * subTotal
			 */
			final /*@NonInvalid*/ double subTotal = _1.getSubTotal();
			final /*@NonInvalid*/ RealValue BOXED_subTotal = ValueUtil.realValueOf(subTotal);
			//
			accumulator.add(BOXED_subTotal);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, Assignment2Tables.DATAid_EDouble, collect);
		final /*@NonInvalid*/ double ECORE_sum = ValueUtil.doubleValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandTotal(double newGrandTotal) {
		// TODO: implement this method to set the 'Grand Total' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalItemsPurchased() {
		/**
		 * lineItem->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<LineItem> lineItem = this.getLineItem();
		final /*@NonInvalid*/ OrderedSetValue BOXED_lineItem = idResolver.createOrderedSetOfAll(Assignment2Tables.ORD_CLSSid_LineItem, lineItem);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_lineItem);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalItemsPurchased(int newTotalItemsPurchased) {
		// TODO: implement this method to set the 'Total Items Purchased' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CUSTOMER, oldCustomer, newCustomer);
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
				msgs = ((InternalEObject)customer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CUSTOMER, null, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CUSTOMER, null, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CUSTOMER, newCustomer, newCustomer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CASHIER, oldCashier, newCashier);
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
				msgs = ((InternalEObject)cashier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CASHIER, null, msgs);
			if (newCashier != null)
				msgs = ((InternalEObject)newCashier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CASHIER, null, msgs);
			msgs = basicSetCashier(newCashier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CASHIER, newCashier, newCashier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineItem> getLineItem() {
		if (lineItem == null) {
			lineItem = new EObjectContainmentEList<LineItem>(LineItem.class, this, Assignment2Package.TRANSACTION__LINE_ITEM);
		}
		return lineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getCard() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CARD, oldCard, newCard);
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
				msgs = ((InternalEObject)card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CARD, null, msgs);
			if (newCard != null)
				msgs = ((InternalEObject)newCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.TRANSACTION__CARD, null, msgs);
			msgs = basicSetCard(newCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TRANSACTION__CARD, newCard, newCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.TRANSACTION__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case Assignment2Package.TRANSACTION__CASHIER:
				return basicSetCashier(null, msgs);
			case Assignment2Package.TRANSACTION__LINE_ITEM:
				return ((InternalEList<?>)getLineItem()).basicRemove(otherEnd, msgs);
			case Assignment2Package.TRANSACTION__CARD:
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
			case Assignment2Package.TRANSACTION__TRANSACTION_NUMBER:
				return getTransactionNumber();
			case Assignment2Package.TRANSACTION__ISSUED_DATE:
				return getIssuedDate();
			case Assignment2Package.TRANSACTION__TRANSACTION_TYPE:
				return getTransactionType();
			case Assignment2Package.TRANSACTION__PAYMENT_METHOD:
				return getPaymentMethod();
			case Assignment2Package.TRANSACTION__GRAND_TOTAL:
				return getGrandTotal();
			case Assignment2Package.TRANSACTION__TOTAL_ITEMS_PURCHASED:
				return getTotalItemsPurchased();
			case Assignment2Package.TRANSACTION__CUSTOMER:
				return getCustomer();
			case Assignment2Package.TRANSACTION__CASHIER:
				return getCashier();
			case Assignment2Package.TRANSACTION__LINE_ITEM:
				return getLineItem();
			case Assignment2Package.TRANSACTION__CARD:
				return getCard();
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
			case Assignment2Package.TRANSACTION__TRANSACTION_NUMBER:
				setTransactionNumber((String)newValue);
				return;
			case Assignment2Package.TRANSACTION__ISSUED_DATE:
				setIssuedDate((Date)newValue);
				return;
			case Assignment2Package.TRANSACTION__TRANSACTION_TYPE:
				setTransactionType((TransactionType)newValue);
				return;
			case Assignment2Package.TRANSACTION__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
				return;
			case Assignment2Package.TRANSACTION__GRAND_TOTAL:
				setGrandTotal((Double)newValue);
				return;
			case Assignment2Package.TRANSACTION__TOTAL_ITEMS_PURCHASED:
				setTotalItemsPurchased((Integer)newValue);
				return;
			case Assignment2Package.TRANSACTION__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case Assignment2Package.TRANSACTION__CASHIER:
				setCashier((Cashier)newValue);
				return;
			case Assignment2Package.TRANSACTION__LINE_ITEM:
				getLineItem().clear();
				getLineItem().addAll((Collection<? extends LineItem>)newValue);
				return;
			case Assignment2Package.TRANSACTION__CARD:
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
			case Assignment2Package.TRANSACTION__TRANSACTION_NUMBER:
				setTransactionNumber(TRANSACTION_NUMBER_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__ISSUED_DATE:
				setIssuedDate(ISSUED_DATE_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__GRAND_TOTAL:
				setGrandTotal(GRAND_TOTAL_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__TOTAL_ITEMS_PURCHASED:
				setTotalItemsPurchased(TOTAL_ITEMS_PURCHASED_EDEFAULT);
				return;
			case Assignment2Package.TRANSACTION__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case Assignment2Package.TRANSACTION__CASHIER:
				setCashier((Cashier)null);
				return;
			case Assignment2Package.TRANSACTION__LINE_ITEM:
				getLineItem().clear();
				return;
			case Assignment2Package.TRANSACTION__CARD:
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
			case Assignment2Package.TRANSACTION__TRANSACTION_NUMBER:
				return TRANSACTION_NUMBER_EDEFAULT == null ? transactionNumber != null : !TRANSACTION_NUMBER_EDEFAULT.equals(transactionNumber);
			case Assignment2Package.TRANSACTION__ISSUED_DATE:
				return ISSUED_DATE_EDEFAULT == null ? issuedDate != null : !ISSUED_DATE_EDEFAULT.equals(issuedDate);
			case Assignment2Package.TRANSACTION__TRANSACTION_TYPE:
				return transactionType != TRANSACTION_TYPE_EDEFAULT;
			case Assignment2Package.TRANSACTION__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
			case Assignment2Package.TRANSACTION__GRAND_TOTAL:
				return getGrandTotal() != GRAND_TOTAL_EDEFAULT;
			case Assignment2Package.TRANSACTION__TOTAL_ITEMS_PURCHASED:
				return getTotalItemsPurchased() != TOTAL_ITEMS_PURCHASED_EDEFAULT;
			case Assignment2Package.TRANSACTION__CUSTOMER:
				return customer != null;
			case Assignment2Package.TRANSACTION__CASHIER:
				return cashier != null;
			case Assignment2Package.TRANSACTION__LINE_ITEM:
				return lineItem != null && !lineItem.isEmpty();
			case Assignment2Package.TRANSACTION__CARD:
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
		result.append(" (transactionNumber: ");
		result.append(transactionNumber);
		result.append(", issuedDate: ");
		result.append(issuedDate);
		result.append(", transactionType: ");
		result.append(transactionType);
		result.append(", paymentMethod: ");
		result.append(paymentMethod);
		result.append(')');
		return result.toString();
	}

} //TransactionImpl
