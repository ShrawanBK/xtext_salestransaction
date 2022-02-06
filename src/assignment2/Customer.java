/**
 */
package assignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Customer#getIdentityNumber <em>Identity Number</em>}</li>
 *   <li>{@link assignment2.Customer#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link assignment2.Customer#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Identity Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Number</em>' attribute.
	 * @see #setIdentityNumber(String)
	 * @see assignment2.Assignment2Package#getCustomer_IdentityNumber()
	 * @model
	 * @generated
	 */
	String getIdentityNumber();

	/**
	 * Sets the value of the '{@link assignment2.Customer#getIdentityNumber <em>Identity Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Number</em>' attribute.
	 * @see #getIdentityNumber()
	 * @generated
	 */
	void setIdentityNumber(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see assignment2.Assignment2Package#getCustomer_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link assignment2.Customer#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment2.Card#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(Card)
	 * @see assignment2.Assignment2Package#getCustomer_Card()
	 * @see assignment2.Card#getCardHolder
	 * @model opposite="cardHolder"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link assignment2.Customer#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

} // Customer
