/**
 */
package assignment2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Cashier#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getCashier()
 * @model
 * @generated
 */
public interface Cashier extends Person {
	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(String)
	 * @see assignment2.Assignment2Package#getCashier_EmployeeId()
	 * @model
	 * @generated
	 */
	String getEmployeeId();

	/**
	 * Sets the value of the '{@link assignment2.Cashier#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(String value);

} // Cashier
