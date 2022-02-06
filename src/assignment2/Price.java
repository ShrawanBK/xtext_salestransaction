/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Price#getSellingPrice <em>Selling Price</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getPrice()
 * @model
 * @generated
 */
public interface Price extends EObject {
	/**
	 * Returns the value of the '<em><b>Selling Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selling Price</em>' attribute.
	 * @see #setSellingPrice(double)
	 * @see assignment2.Assignment2Package#getPrice_SellingPrice()
	 * @model required="true"
	 * @generated
	 */
	double getSellingPrice();

	/**
	 * Sets the value of the '{@link assignment2.Price#getSellingPrice <em>Selling Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selling Price</em>' attribute.
	 * @see #getSellingPrice()
	 * @generated
	 */
	void setSellingPrice(double value);

} // Price
