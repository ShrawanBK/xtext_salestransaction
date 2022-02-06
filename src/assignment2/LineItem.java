/**
 */
package assignment2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.LineItem#getCode <em>Code</em>}</li>
 *   <li>{@link assignment2.LineItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link assignment2.LineItem#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link assignment2.LineItem#getItem <em>Item</em>}</li>
 *   <li>{@link assignment2.LineItem#getTax <em>Tax</em>}</li>
 *   <li>{@link assignment2.LineItem#getDiscount <em>Discount</em>}</li>
 *   <li>{@link assignment2.LineItem#getAdditionalCharge <em>Additional Charge</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getLineItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AvailableItems'"
 * @generated
 */
public interface LineItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see assignment2.Assignment2Package#getLineItem_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(double)
	 * @see assignment2.Assignment2Package#getLineItem_Quantity()
	 * @model required="true"
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

	/**
	 * Returns the value of the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Total</em>' attribute.
	 * @see #setSubTotal(double)
	 * @see assignment2.Assignment2Package#getLineItem_SubTotal()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	double getSubTotal();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getSubTotal <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Total</em>' attribute.
	 * @see #getSubTotal()
	 * @generated
	 */
	void setSubTotal(double value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see assignment2.Assignment2Package#getLineItem_Item()
	 * @model required="true"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

	/**
	 * Returns the value of the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax</em>' containment reference.
	 * @see #setTax(Tax)
	 * @see assignment2.Assignment2Package#getLineItem_Tax()
	 * @model containment="true"
	 * @generated
	 */
	Tax getTax();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getTax <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax</em>' containment reference.
	 * @see #getTax()
	 * @generated
	 */
	void setTax(Tax value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' containment reference.
	 * @see #setDiscount(Discount)
	 * @see assignment2.Assignment2Package#getLineItem_Discount()
	 * @model containment="true"
	 * @generated
	 */
	Discount getDiscount();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getDiscount <em>Discount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' containment reference.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(Discount value);

	/**
	 * Returns the value of the '<em><b>Additional Charge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Charge</em>' containment reference.
	 * @see #setAdditionalCharge(AdditionalCharge)
	 * @see assignment2.Assignment2Package#getLineItem_AdditionalCharge()
	 * @model containment="true"
	 * @generated
	 */
	AdditionalCharge getAdditionalCharge();

	/**
	 * Sets the value of the '{@link assignment2.LineItem#getAdditionalCharge <em>Additional Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Charge</em>' containment reference.
	 * @see #getAdditionalCharge()
	 * @generated
	 */
	void setAdditionalCharge(AdditionalCharge value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='item.availableNumber &gt; quantity'"
	 * @generated
	 */
	boolean isItemInStock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='item.availableNumber &gt; quantity'"
	 * @generated
	 */
	boolean AvailableItems(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LineItem
