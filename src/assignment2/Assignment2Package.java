/**
 */
package assignment2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Assignment2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sales.org/assignment2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment2Package eINSTANCE = assignment2.impl.Assignment2PackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.NamedElementImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.CompanyImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Codice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__CODICE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ADDRESS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__STORE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__TRANSACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate Codice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY___VALIDATE_CODICE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link assignment2.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.AddressImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TELEPHONE = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.StoreImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getStore()
	 * @generated
	 */
	int STORE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ITEM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Company</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__COMPANY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.ItemImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Batch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BATCH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UOM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Available Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__AVAILABLE_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UNIT_PRICE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Store</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STORE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_ACTIVE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___IS_AVAILABLE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Active</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___IS_ACTIVE = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Item Not Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___ITEM_NOT_ZERO__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link assignment2.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.TransactionImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>Transaction Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Issued Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ISSUED_DATE = 1;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PAYMENT_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__GRAND_TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Total Items Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TOTAL_ITEMS_PURCHASED = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CASHIER = 7;

	/**
	 * The feature id for the '<em><b>Line Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LINE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CARD = 9;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PersonImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUR_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CUSTOMER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CASHIER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.CustomerImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER = PERSON__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CASHIER = PERSON__CASHIER;

	/**
	 * The feature id for the '<em><b>Identity Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__IDENTITY_NUMBER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CARD = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.CashierImpl <em>Cashier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.CashierImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getCashier()
	 * @generated
	 */
	int CASHIER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Sur Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__SUR_NAME = PERSON__SUR_NAME;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__CUSTOMER = PERSON__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__CASHIER = PERSON__CASHIER;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER__EMPLOYEE_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASHIER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.LineItemImpl <em>Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.LineItemImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getLineItem()
	 * @generated
	 */
	int LINE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__CODE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__SUB_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__ITEM = 3;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__TAX = 4;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__DISCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Additional Charge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM__ADDITIONAL_CHARGE = 6;

	/**
	 * The number of structural features of the '<em>Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Is Item In Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM___IS_ITEM_IN_STOCK = 0;

	/**
	 * The operation id for the '<em>Available Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM___AVAILABLE_ITEMS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ITEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link assignment2.impl.TaxImpl <em>Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.TaxImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getTax()
	 * @generated
	 */
	int TAX = 10;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Taxable Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAXABLE_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.DiscountImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.AdditionalChargeImpl <em>Additional Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.AdditionalChargeImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getAdditionalCharge()
	 * @generated
	 */
	int ADDITIONAL_CHARGE = 12;

	/**
	 * The feature id for the '<em><b>Service Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_CHARGE__SERVICE_CHARGE = 0;

	/**
	 * The number of structural features of the '<em>Additional Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_CHARGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Additional Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_CHARGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.CardImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getCard()
	 * @generated
	 */
	int CARD = 13;

	/**
	 * The feature id for the '<em><b>Card Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__CARD_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__EXPIRY_DATE = 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PriceImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 14;

	/**
	 * The feature id for the '<em><b>Selling Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__SELLING_PRICE = 0;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.PaymentMethod
	 * @see assignment2.impl.Assignment2PackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 15;

	/**
	 * The meta object id for the '{@link assignment2.TaxType <em>Tax Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.TaxType
	 * @see assignment2.impl.Assignment2PackageImpl#getTaxType()
	 * @generated
	 */
	int TAX_TYPE = 16;

	/**
	 * The meta object id for the '{@link assignment2.TransactionType <em>Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.TransactionType
	 * @see assignment2.impl.Assignment2PackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 17;

	/**
	 * The meta object id for the '{@link assignment2.UoM <em>Uo M</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.UoM
	 * @see assignment2.impl.Assignment2PackageImpl#getUoM()
	 * @generated
	 */
	int UO_M = 18;


	/**
	 * Returns the meta object for class '{@link assignment2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see assignment2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link assignment2.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see assignment2.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Company#getCodice <em>Codice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codice</em>'.
	 * @see assignment2.Company#getCodice()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Codice();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Company#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see assignment2.Company#getAddress()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment2.Company#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store</em>'.
	 * @see assignment2.Company#getStore()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Store();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment2.Company#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see assignment2.Company#getTransaction()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Transaction();

	/**
	 * Returns the meta object for the '{@link assignment2.Company#ValidateCodice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Codice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Codice</em>' operation.
	 * @see assignment2.Company#ValidateCodice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCompany__ValidateCodice__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link assignment2.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see assignment2.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see assignment2.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see assignment2.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see assignment2.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Address#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see assignment2.Address#getTelephone()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Telephone();

	/**
	 * Returns the meta object for class '{@link assignment2.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see assignment2.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment2.Store#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see assignment2.Store#getItem()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Item();

	/**
	 * Returns the meta object for the container reference '{@link assignment2.Store#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Company</em>'.
	 * @see assignment2.Store#getCompany()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Company();

	/**
	 * Returns the meta object for class '{@link assignment2.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see assignment2.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see assignment2.Item#getCode()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Code();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#getBatch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch</em>'.
	 * @see assignment2.Item#getBatch()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Batch();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assignment2.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom</em>'.
	 * @see assignment2.Item#getUom()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Uom();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#getAvailableNumber <em>Available Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Number</em>'.
	 * @see assignment2.Item#getAvailableNumber()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_AvailableNumber();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Item#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Price</em>'.
	 * @see assignment2.Item#getUnitPrice()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_UnitPrice();

	/**
	 * Returns the meta object for the container reference '{@link assignment2.Item#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Store</em>'.
	 * @see assignment2.Item#getStore()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Store();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Item#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see assignment2.Item#isIsActive()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsActive();

	/**
	 * Returns the meta object for the '{@link assignment2.Item#isAvailable() <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Available</em>' operation.
	 * @see assignment2.Item#isAvailable()
	 * @generated
	 */
	EOperation getItem__IsAvailable();

	/**
	 * Returns the meta object for the '{@link assignment2.Item#isActive() <em>Is Active</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Active</em>' operation.
	 * @see assignment2.Item#isActive()
	 * @generated
	 */
	EOperation getItem__IsActive();

	/**
	 * Returns the meta object for the '{@link assignment2.Item#ItemNotZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Item Not Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Not Zero</em>' operation.
	 * @see assignment2.Item#ItemNotZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getItem__ItemNotZero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link assignment2.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see assignment2.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getTransactionNumber <em>Transaction Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Number</em>'.
	 * @see assignment2.Transaction#getTransactionNumber()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TransactionNumber();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getIssuedDate <em>Issued Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued Date</em>'.
	 * @see assignment2.Transaction#getIssuedDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_IssuedDate();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see assignment2.Transaction#getTransactionType()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method</em>'.
	 * @see assignment2.Transaction#getPaymentMethod()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getGrandTotal <em>Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grand Total</em>'.
	 * @see assignment2.Transaction#getGrandTotal()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_GrandTotal();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Transaction#getTotalItemsPurchased <em>Total Items Purchased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Items Purchased</em>'.
	 * @see assignment2.Transaction#getTotalItemsPurchased()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_TotalItemsPurchased();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Transaction#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer</em>'.
	 * @see assignment2.Transaction#getCustomer()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Customer();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Transaction#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cashier</em>'.
	 * @see assignment2.Transaction#getCashier()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Cashier();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment2.Transaction#getLineItem <em>Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Item</em>'.
	 * @see assignment2.Transaction#getLineItem()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_LineItem();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Transaction#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card</em>'.
	 * @see assignment2.Transaction#getCard()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Card();

	/**
	 * Returns the meta object for class '{@link assignment2.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see assignment2.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Person#getSurName <em>Sur Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sur Name</em>'.
	 * @see assignment2.Person#getSurName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SurName();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Person#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer</em>'.
	 * @see assignment2.Person#getCustomer()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Customer();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Person#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cashier</em>'.
	 * @see assignment2.Person#getCashier()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Cashier();

	/**
	 * Returns the meta object for class '{@link assignment2.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see assignment2.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Customer#getIdentityNumber <em>Identity Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity Number</em>'.
	 * @see assignment2.Customer#getIdentityNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_IdentityNumber();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Customer#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see assignment2.Customer#getPhoneNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNumber();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Customer#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see assignment2.Customer#getCard()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Card();

	/**
	 * Returns the meta object for class '{@link assignment2.Cashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cashier</em>'.
	 * @see assignment2.Cashier
	 * @generated
	 */
	EClass getCashier();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Cashier#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see assignment2.Cashier#getEmployeeId()
	 * @see #getCashier()
	 * @generated
	 */
	EAttribute getCashier_EmployeeId();

	/**
	 * Returns the meta object for class '{@link assignment2.LineItem <em>Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Item</em>'.
	 * @see assignment2.LineItem
	 * @generated
	 */
	EClass getLineItem();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.LineItem#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see assignment2.LineItem#getCode()
	 * @see #getLineItem()
	 * @generated
	 */
	EAttribute getLineItem_Code();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.LineItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see assignment2.LineItem#getQuantity()
	 * @see #getLineItem()
	 * @generated
	 */
	EAttribute getLineItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.LineItem#getSubTotal <em>Sub Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Total</em>'.
	 * @see assignment2.LineItem#getSubTotal()
	 * @see #getLineItem()
	 * @generated
	 */
	EAttribute getLineItem_SubTotal();

	/**
	 * Returns the meta object for the reference '{@link assignment2.LineItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see assignment2.LineItem#getItem()
	 * @see #getLineItem()
	 * @generated
	 */
	EReference getLineItem_Item();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.LineItem#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see assignment2.LineItem#getTax()
	 * @see #getLineItem()
	 * @generated
	 */
	EReference getLineItem_Tax();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.LineItem#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discount</em>'.
	 * @see assignment2.LineItem#getDiscount()
	 * @see #getLineItem()
	 * @generated
	 */
	EReference getLineItem_Discount();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.LineItem#getAdditionalCharge <em>Additional Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Charge</em>'.
	 * @see assignment2.LineItem#getAdditionalCharge()
	 * @see #getLineItem()
	 * @generated
	 */
	EReference getLineItem_AdditionalCharge();

	/**
	 * Returns the meta object for the '{@link assignment2.LineItem#isItemInStock() <em>Is Item In Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Item In Stock</em>' operation.
	 * @see assignment2.LineItem#isItemInStock()
	 * @generated
	 */
	EOperation getLineItem__IsItemInStock();

	/**
	 * Returns the meta object for the '{@link assignment2.LineItem#AvailableItems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Available Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Available Items</em>' operation.
	 * @see assignment2.LineItem#AvailableItems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLineItem__AvailableItems__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link assignment2.Tax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax</em>'.
	 * @see assignment2.Tax
	 * @generated
	 */
	EClass getTax();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Tax#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see assignment2.Tax#getTaxType()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Tax#getTaxableAmount <em>Taxable Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxable Amount</em>'.
	 * @see assignment2.Tax#getTaxableAmount()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxableAmount();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Tax#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see assignment2.Tax#getTaxAmount()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxAmount();

	/**
	 * Returns the meta object for class '{@link assignment2.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see assignment2.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Discount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see assignment2.Discount#getPercentage()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Discount#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see assignment2.Discount#getAmount()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Amount();

	/**
	 * Returns the meta object for class '{@link assignment2.AdditionalCharge <em>Additional Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Charge</em>'.
	 * @see assignment2.AdditionalCharge
	 * @generated
	 */
	EClass getAdditionalCharge();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.AdditionalCharge#getServiceCharge <em>Service Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Charge</em>'.
	 * @see assignment2.AdditionalCharge#getServiceCharge()
	 * @see #getAdditionalCharge()
	 * @generated
	 */
	EAttribute getAdditionalCharge_ServiceCharge();

	/**
	 * Returns the meta object for class '{@link assignment2.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see assignment2.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Card#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Holder</em>'.
	 * @see assignment2.Card#getCardHolder()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_CardHolder();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Card#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see assignment2.Card#getCardNumber()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Card#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see assignment2.Card#getExpiryDate()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ExpiryDate();

	/**
	 * Returns the meta object for class '{@link assignment2.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see assignment2.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Price#getSellingPrice <em>Selling Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selling Price</em>'.
	 * @see assignment2.Price#getSellingPrice()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_SellingPrice();

	/**
	 * Returns the meta object for enum '{@link assignment2.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see assignment2.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the meta object for enum '{@link assignment2.TaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Type</em>'.
	 * @see assignment2.TaxType
	 * @generated
	 */
	EEnum getTaxType();

	/**
	 * Returns the meta object for enum '{@link assignment2.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type</em>'.
	 * @see assignment2.TransactionType
	 * @generated
	 */
	EEnum getTransactionType();

	/**
	 * Returns the meta object for enum '{@link assignment2.UoM <em>Uo M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uo M</em>'.
	 * @see assignment2.UoM
	 * @generated
	 */
	EEnum getUoM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment2Factory getAssignment2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.NamedElementImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link assignment2.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.CompanyImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Codice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__CODICE = eINSTANCE.getCompany_Codice();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__ADDRESS = eINSTANCE.getCompany_Address();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__STORE = eINSTANCE.getCompany_Store();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__TRANSACTION = eINSTANCE.getCompany_Transaction();

		/**
		 * The meta object literal for the '<em><b>Validate Codice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPANY___VALIDATE_CODICE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCompany__ValidateCodice__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link assignment2.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.AddressImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TELEPHONE = eINSTANCE.getAddress_Telephone();

		/**
		 * The meta object literal for the '{@link assignment2.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.StoreImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__ITEM = eINSTANCE.getStore_Item();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__COMPANY = eINSTANCE.getStore_Company();

		/**
		 * The meta object literal for the '{@link assignment2.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.ItemImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CODE = eINSTANCE.getItem_Code();

		/**
		 * The meta object literal for the '<em><b>Batch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__BATCH = eINSTANCE.getItem_Batch();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UOM = eINSTANCE.getItem_Uom();

		/**
		 * The meta object literal for the '<em><b>Available Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__AVAILABLE_NUMBER = eINSTANCE.getItem_AvailableNumber();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__UNIT_PRICE = eINSTANCE.getItem_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__STORE = eINSTANCE.getItem_Store();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_ACTIVE = eINSTANCE.getItem_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___IS_AVAILABLE = eINSTANCE.getItem__IsAvailable();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___IS_ACTIVE = eINSTANCE.getItem__IsActive();

		/**
		 * The meta object literal for the '<em><b>Item Not Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___ITEM_NOT_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getItem__ItemNotZero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link assignment2.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.TransactionImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TRANSACTION_NUMBER = eINSTANCE.getTransaction_TransactionNumber();

		/**
		 * The meta object literal for the '<em><b>Issued Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__ISSUED_DATE = eINSTANCE.getTransaction_IssuedDate();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TRANSACTION_TYPE = eINSTANCE.getTransaction_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PAYMENT_METHOD = eINSTANCE.getTransaction_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__GRAND_TOTAL = eINSTANCE.getTransaction_GrandTotal();

		/**
		 * The meta object literal for the '<em><b>Total Items Purchased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__TOTAL_ITEMS_PURCHASED = eINSTANCE.getTransaction_TotalItemsPurchased();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CUSTOMER = eINSTANCE.getTransaction_Customer();

		/**
		 * The meta object literal for the '<em><b>Cashier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CASHIER = eINSTANCE.getTransaction_Cashier();

		/**
		 * The meta object literal for the '<em><b>Line Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__LINE_ITEM = eINSTANCE.getTransaction_LineItem();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CARD = eINSTANCE.getTransaction_Card();

		/**
		 * The meta object literal for the '{@link assignment2.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PersonImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Sur Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUR_NAME = eINSTANCE.getPerson_SurName();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CUSTOMER = eINSTANCE.getPerson_Customer();

		/**
		 * The meta object literal for the '<em><b>Cashier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CASHIER = eINSTANCE.getPerson_Cashier();

		/**
		 * The meta object literal for the '{@link assignment2.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.CustomerImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Identity Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__IDENTITY_NUMBER = eINSTANCE.getCustomer_IdentityNumber();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NUMBER = eINSTANCE.getCustomer_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CARD = eINSTANCE.getCustomer_Card();

		/**
		 * The meta object literal for the '{@link assignment2.impl.CashierImpl <em>Cashier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.CashierImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getCashier()
		 * @generated
		 */
		EClass CASHIER = eINSTANCE.getCashier();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASHIER__EMPLOYEE_ID = eINSTANCE.getCashier_EmployeeId();

		/**
		 * The meta object literal for the '{@link assignment2.impl.LineItemImpl <em>Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.LineItemImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getLineItem()
		 * @generated
		 */
		EClass LINE_ITEM = eINSTANCE.getLineItem();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ITEM__CODE = eINSTANCE.getLineItem_Code();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ITEM__QUANTITY = eINSTANCE.getLineItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sub Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ITEM__SUB_TOTAL = eINSTANCE.getLineItem_SubTotal();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_ITEM__ITEM = eINSTANCE.getLineItem_Item();

		/**
		 * The meta object literal for the '<em><b>Tax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_ITEM__TAX = eINSTANCE.getLineItem_Tax();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_ITEM__DISCOUNT = eINSTANCE.getLineItem_Discount();

		/**
		 * The meta object literal for the '<em><b>Additional Charge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_ITEM__ADDITIONAL_CHARGE = eINSTANCE.getLineItem_AdditionalCharge();

		/**
		 * The meta object literal for the '<em><b>Is Item In Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_ITEM___IS_ITEM_IN_STOCK = eINSTANCE.getLineItem__IsItemInStock();

		/**
		 * The meta object literal for the '<em><b>Available Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_ITEM___AVAILABLE_ITEMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLineItem__AvailableItems__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link assignment2.impl.TaxImpl <em>Tax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.TaxImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getTax()
		 * @generated
		 */
		EClass TAX = eINSTANCE.getTax();

		/**
		 * The meta object literal for the '<em><b>Tax Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX__TAX_TYPE = eINSTANCE.getTax_TaxType();

		/**
		 * The meta object literal for the '<em><b>Taxable Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX__TAXABLE_AMOUNT = eINSTANCE.getTax_TaxableAmount();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX__TAX_AMOUNT = eINSTANCE.getTax_TaxAmount();

		/**
		 * The meta object literal for the '{@link assignment2.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.DiscountImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__PERCENTAGE = eINSTANCE.getDiscount_Percentage();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__AMOUNT = eINSTANCE.getDiscount_Amount();

		/**
		 * The meta object literal for the '{@link assignment2.impl.AdditionalChargeImpl <em>Additional Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.AdditionalChargeImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getAdditionalCharge()
		 * @generated
		 */
		EClass ADDITIONAL_CHARGE = eINSTANCE.getAdditionalCharge();

		/**
		 * The meta object literal for the '<em><b>Service Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_CHARGE__SERVICE_CHARGE = eINSTANCE.getAdditionalCharge_ServiceCharge();

		/**
		 * The meta object literal for the '{@link assignment2.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.CardImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Card Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__CARD_HOLDER = eINSTANCE.getCard_CardHolder();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__CARD_NUMBER = eINSTANCE.getCard_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__EXPIRY_DATE = eINSTANCE.getCard_ExpiryDate();

		/**
		 * The meta object literal for the '{@link assignment2.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PriceImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Selling Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__SELLING_PRICE = eINSTANCE.getPrice_SellingPrice();

		/**
		 * The meta object literal for the '{@link assignment2.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.PaymentMethod
		 * @see assignment2.impl.Assignment2PackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '{@link assignment2.TaxType <em>Tax Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.TaxType
		 * @see assignment2.impl.Assignment2PackageImpl#getTaxType()
		 * @generated
		 */
		EEnum TAX_TYPE = eINSTANCE.getTaxType();

		/**
		 * The meta object literal for the '{@link assignment2.TransactionType <em>Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.TransactionType
		 * @see assignment2.impl.Assignment2PackageImpl#getTransactionType()
		 * @generated
		 */
		EEnum TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '{@link assignment2.UoM <em>Uo M</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.UoM
		 * @see assignment2.impl.Assignment2PackageImpl#getUoM()
		 * @generated
		 */
		EEnum UO_M = eINSTANCE.getUoM();

	}

} //Assignment2Package
