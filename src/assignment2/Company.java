/**
 */
package assignment2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Company#getCodice <em>Codice</em>}</li>
 *   <li>{@link assignment2.Company#getAddress <em>Address</em>}</li>
 *   <li>{@link assignment2.Company#getStore <em>Store</em>}</li>
 *   <li>{@link assignment2.Company#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getCompany()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidateCodice'"
 * @generated
 */
public interface Company extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Codice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codice</em>' attribute.
	 * @see #setCodice(String)
	 * @see assignment2.Assignment2Package#getCompany_Codice()
	 * @model
	 * @generated
	 */
	String getCodice();

	/**
	 * Sets the value of the '{@link assignment2.Company#getCodice <em>Codice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codice</em>' attribute.
	 * @see #getCodice()
	 * @generated
	 */
	void setCodice(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see assignment2.Assignment2Package#getCompany_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link assignment2.Company#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' containment reference list.
	 * The list contents are of type {@link assignment2.Store}.
	 * It is bidirectional and its opposite is '{@link assignment2.Store#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' containment reference list.
	 * @see assignment2.Assignment2Package#getCompany_Store()
	 * @see assignment2.Store#getCompany
	 * @model opposite="company" containment="true" required="true"
	 * @generated
	 */
	EList<Store> getStore();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link assignment2.Transaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see assignment2.Assignment2Package#getCompany_Transaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction> getTransaction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='codice.size() = 13'"
	 * @generated
	 */
	boolean ValidateCodice(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Company
