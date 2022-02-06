/**
 */
package assignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Person#getSurName <em>Sur Name</em>}</li>
 *   <li>{@link assignment2.Person#getCustomer <em>Customer</em>}</li>
 *   <li>{@link assignment2.Person#getCashier <em>Cashier</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sur Name</em>' attribute.
	 * @see #setSurName(String)
	 * @see assignment2.Assignment2Package#getPerson_SurName()
	 * @model
	 * @generated
	 */
	String getSurName();

	/**
	 * Sets the value of the '{@link assignment2.Person#getSurName <em>Sur Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sur Name</em>' attribute.
	 * @see #getSurName()
	 * @generated
	 */
	void setSurName(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(Customer)
	 * @see assignment2.Assignment2Package#getPerson_Customer()
	 * @model containment="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link assignment2.Person#getCustomer <em>Customer</em>}' containment reference.
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
	 * @see assignment2.Assignment2Package#getPerson_Cashier()
	 * @model containment="true"
	 * @generated
	 */
	Cashier getCashier();

	/**
	 * Sets the value of the '{@link assignment2.Person#getCashier <em>Cashier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashier</em>' containment reference.
	 * @see #getCashier()
	 * @generated
	 */
	void setCashier(Cashier value);

} // Person
