/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Discount#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link assignment2.Discount#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getDiscount()
 * @model
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(double)
	 * @see assignment2.Assignment2Package#getDiscount_Percentage()
	 * @model required="true"
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link assignment2.Discount#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see assignment2.Assignment2Package#getDiscount_Amount()
	 * @model required="true"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link assignment2.Discount#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // Discount
