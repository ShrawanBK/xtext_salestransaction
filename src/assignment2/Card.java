/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Card#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link assignment2.Card#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link assignment2.Card#getExpiryDate <em>Expiry Date</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Holder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment2.Customer#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Holder</em>' reference.
	 * @see #setCardHolder(Customer)
	 * @see assignment2.Assignment2Package#getCard_CardHolder()
	 * @see assignment2.Customer#getCard
	 * @model opposite="card" required="true"
	 * @generated
	 */
	Customer getCardHolder();

	/**
	 * Sets the value of the '{@link assignment2.Card#getCardHolder <em>Card Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Holder</em>' reference.
	 * @see #getCardHolder()
	 * @generated
	 */
	void setCardHolder(Customer value);

	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see assignment2.Assignment2Package#getCard_CardNumber()
	 * @model
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link assignment2.Card#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(String)
	 * @see assignment2.Assignment2Package#getCard_ExpiryDate()
	 * @model
	 * @generated
	 */
	String getExpiryDate();

	/**
	 * Sets the value of the '{@link assignment2.Card#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(String value);

} // Card
