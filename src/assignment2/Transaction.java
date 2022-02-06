/**
 */
package assignment2;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Transaction#getTransactionNumber <em>Transaction Number</em>}</li>
 *   <li>{@link assignment2.Transaction#getIssuedDate <em>Issued Date</em>}</li>
 *   <li>{@link assignment2.Transaction#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link assignment2.Transaction#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link assignment2.Transaction#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link assignment2.Transaction#getTotalItemsPurchased <em>Total Items Purchased</em>}</li>
 *   <li>{@link assignment2.Transaction#getCustomer <em>Customer</em>}</li>
 *   <li>{@link assignment2.Transaction#getCashier <em>Cashier</em>}</li>
 *   <li>{@link assignment2.Transaction#getLineItem <em>Line Item</em>}</li>
 *   <li>{@link assignment2.Transaction#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Number</em>' attribute.
	 * @see #setTransactionNumber(String)
	 * @see assignment2.Assignment2Package#getTransaction_TransactionNumber()
	 * @model
	 * @generated
	 */
	String getTransactionNumber();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getTransactionNumber <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Number</em>' attribute.
	 * @see #getTransactionNumber()
	 * @generated
	 */
	void setTransactionNumber(String value);

	/**
	 * Returns the value of the '<em><b>Issued Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Date</em>' attribute.
	 * @see #setIssuedDate(Date)
	 * @see assignment2.Assignment2Package#getTransaction_IssuedDate()
	 * @model
	 * @generated
	 */
	Date getIssuedDate();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getIssuedDate <em>Issued Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Date</em>' attribute.
	 * @see #getIssuedDate()
	 * @generated
	 */
	void setIssuedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment2.TransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see assignment2.TransactionType
	 * @see #setTransactionType(TransactionType)
	 * @see assignment2.Assignment2Package#getTransaction_TransactionType()
	 * @model required="true"
	 * @generated
	 */
	TransactionType getTransactionType();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see assignment2.TransactionType
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionType value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment2.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see assignment2.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see assignment2.Assignment2Package#getTransaction_PaymentMethod()
	 * @model required="true"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see assignment2.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see #setGrandTotal(double)
	 * @see assignment2.Assignment2Package#getTransaction_GrandTotal()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	double getGrandTotal();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(double value);

	/**
	 * Returns the value of the '<em><b>Total Items Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Items Purchased</em>' attribute.
	 * @see #setTotalItemsPurchased(int)
	 * @see assignment2.Assignment2Package#getTransaction_TotalItemsPurchased()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalItemsPurchased();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getTotalItemsPurchased <em>Total Items Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Items Purchased</em>' attribute.
	 * @see #getTotalItemsPurchased()
	 * @generated
	 */
	void setTotalItemsPurchased(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(Customer)
	 * @see assignment2.Assignment2Package#getTransaction_Customer()
	 * @model containment="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Cashier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier</em>' containment reference.
	 * @see #setCashier(Cashier)
	 * @see assignment2.Assignment2Package#getTransaction_Cashier()
	 * @model containment="true"
	 * @generated
	 */
	Cashier getCashier();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getCashier <em>Cashier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier</em>' containment reference.
	 * @see #getCashier()
	 * @generated
	 */
	void setCashier(Cashier value);

	/**
	 * Returns the value of the '<em><b>Line Item</b></em>' containment reference list.
	 * The list contents are of type {@link assignment2.LineItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Item</em>' containment reference list.
	 * @see assignment2.Assignment2Package#getTransaction_LineItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LineItem> getLineItem();

	/**
	 * Returns the value of the '<em><b>Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' containment reference.
	 * @see #setCard(Card)
	 * @see assignment2.Assignment2Package#getTransaction_Card()
	 * @model containment="true"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link assignment2.Transaction#getCard <em>Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' containment reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

} // Transaction
