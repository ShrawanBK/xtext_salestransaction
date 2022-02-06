/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Tax#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link assignment2.Tax#getTaxableAmount <em>Taxable Amount</em>}</li>
 *   <li>{@link assignment2.Tax#getTaxAmount <em>Tax Amount</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getTax()
 * @model
 * @generated
 */
public interface Tax extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment2.TaxType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Type</em>' attribute.
	 * @see assignment2.TaxType
	 * @see #setTaxType(TaxType)
	 * @see assignment2.Assignment2Package#getTax_TaxType()
	 * @model required="true"
	 * @generated
	 */
	TaxType getTaxType();

	/**
	 * Sets the value of the '{@link assignment2.Tax#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Type</em>' attribute.
	 * @see assignment2.TaxType
	 * @see #getTaxType()
	 * @generated
	 */
	void setTaxType(TaxType value);

	/**
	 * Returns the value of the '<em><b>Taxable Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxable Amount</em>' attribute.
	 * @see #setTaxableAmount(double)
	 * @see assignment2.Assignment2Package#getTax_TaxableAmount()
	 * @model required="true"
	 * @generated
	 */
	double getTaxableAmount();

	/**
	 * Sets the value of the '{@link assignment2.Tax#getTaxableAmount <em>Taxable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable Amount</em>' attribute.
	 * @see #getTaxableAmount()
	 * @generated
	 */
	void setTaxableAmount(double value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(double)
	 * @see assignment2.Assignment2Package#getTax_TaxAmount()
	 * @model required="true"
	 * @generated
	 */
	double getTaxAmount();

	/**
	 * Sets the value of the '{@link assignment2.Tax#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(double value);

} // Tax
