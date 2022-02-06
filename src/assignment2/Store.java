/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Store#getItem <em>Item</em>}</li>
 *   <li>{@link assignment2.Store#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getStore()
 * @model
 * @generated
 */
public interface Store extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link assignment2.Item}.
	 * It is bidirectional and its opposite is '{@link assignment2.Item#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see assignment2.Assignment2Package#getStore_Item()
	 * @see assignment2.Item#getStore
	 * @model opposite="store" containment="true"
	 * @generated
	 */
	EList<Item> getItem();

	/**
	 * Returns the value of the '<em><b>Company</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment2.Company#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' container reference.
	 * @see #setCompany(Company)
	 * @see assignment2.Assignment2Package#getStore_Company()
	 * @see assignment2.Company#getStore
	 * @model opposite="store" transient="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link assignment2.Store#getCompany <em>Company</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' container reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(Company value);

} // Store
