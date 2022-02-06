/**
 */
package assignment2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Item#getCode <em>Code</em>}</li>
 *   <li>{@link assignment2.Item#getBatch <em>Batch</em>}</li>
 *   <li>{@link assignment2.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link assignment2.Item#getUom <em>Uom</em>}</li>
 *   <li>{@link assignment2.Item#getAvailableNumber <em>Available Number</em>}</li>
 *   <li>{@link assignment2.Item#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link assignment2.Item#getStore <em>Store</em>}</li>
 *   <li>{@link assignment2.Item#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ItemNotZero'"
 * @generated
 */
public interface Item extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see assignment2.Assignment2Package#getItem_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link assignment2.Item#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch</em>' attribute.
	 * @see #setBatch(String)
	 * @see assignment2.Assignment2Package#getItem_Batch()
	 * @model
	 * @generated
	 */
	String getBatch();

	/**
	 * Sets the value of the '{@link assignment2.Item#getBatch <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch</em>' attribute.
	 * @see #getBatch()
	 * @generated
	 */
	void setBatch(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see assignment2.Assignment2Package#getItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assignment2.Item#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment2.UoM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see assignment2.UoM
	 * @see #setUom(UoM)
	 * @see assignment2.Assignment2Package#getItem_Uom()
	 * @model required="true"
	 * @generated
	 */
	UoM getUom();

	/**
	 * Sets the value of the '{@link assignment2.Item#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see assignment2.UoM
	 * @see #getUom()
	 * @generated
	 */
	void setUom(UoM value);

	/**
	 * Returns the value of the '<em><b>Available Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Number</em>' attribute.
	 * @see #setAvailableNumber(double)
	 * @see assignment2.Assignment2Package#getItem_AvailableNumber()
	 * @model required="true"
	 * @generated
	 */
	double getAvailableNumber();

	/**
	 * Sets the value of the '{@link assignment2.Item#getAvailableNumber <em>Available Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Number</em>' attribute.
	 * @see #getAvailableNumber()
	 * @generated
	 */
	void setAvailableNumber(double value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Price)
	 * @see assignment2.Assignment2Package#getItem_UnitPrice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Price getUnitPrice();

	/**
	 * Sets the value of the '{@link assignment2.Item#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Price value);

	/**
	 * Returns the value of the '<em><b>Store</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment2.Store#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' container reference.
	 * @see #setStore(Store)
	 * @see assignment2.Assignment2Package#getItem_Store()
	 * @see assignment2.Store#getItem
	 * @model opposite="item" transient="false"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link assignment2.Item#getStore <em>Store</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' container reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see assignment2.Assignment2Package#getItem_IsActive()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link assignment2.Item#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.availableNumber &gt; 0'"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.isActive = true'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='availableNumber\t&lt;&gt; 0'"
	 * @generated
	 */
	boolean ItemNotZero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Item
