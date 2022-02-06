/**
 */
package assignment2.util;

import assignment2.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package
 * @generated
 */
public class Assignment2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment2Validator INSTANCE = new Assignment2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Codice' of 'Company'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPANY__VALIDATE_CODICE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Item Not Zero' of 'Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM__ITEM_NOT_ZERO = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Available Items' of 'Line Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINE_ITEM__AVAILABLE_ITEMS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Assignment2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Assignment2Package.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case Assignment2Package.COMPANY:
				return validateCompany((Company)value, diagnostics, context);
			case Assignment2Package.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case Assignment2Package.STORE:
				return validateStore((Store)value, diagnostics, context);
			case Assignment2Package.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case Assignment2Package.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case Assignment2Package.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case Assignment2Package.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case Assignment2Package.CASHIER:
				return validateCashier((Cashier)value, diagnostics, context);
			case Assignment2Package.LINE_ITEM:
				return validateLineItem((LineItem)value, diagnostics, context);
			case Assignment2Package.TAX:
				return validateTax((Tax)value, diagnostics, context);
			case Assignment2Package.DISCOUNT:
				return validateDiscount((Discount)value, diagnostics, context);
			case Assignment2Package.ADDITIONAL_CHARGE:
				return validateAdditionalCharge((AdditionalCharge)value, diagnostics, context);
			case Assignment2Package.CARD:
				return validateCard((Card)value, diagnostics, context);
			case Assignment2Package.PRICE:
				return validatePrice((Price)value, diagnostics, context);
			case Assignment2Package.PAYMENT_METHOD:
				return validatePaymentMethod((PaymentMethod)value, diagnostics, context);
			case Assignment2Package.TAX_TYPE:
				return validateTaxType((TaxType)value, diagnostics, context);
			case Assignment2Package.TRANSACTION_TYPE:
				return validateTransactionType((TransactionType)value, diagnostics, context);
			case Assignment2Package.UO_M:
				return validateUoM((UoM)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany(Company company, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(company, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(company, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(company, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompany_ValidateCodice(company, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidateCodice constraint of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompany_ValidateCodice(Company company, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return company.ValidateCodice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(store, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_ItemNotZero(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemNotZero constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_ItemNotZero(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return item.ItemNotZero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCashier(Cashier cashier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cashier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineItem(LineItem lineItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lineItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lineItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineItem_AvailableItems(lineItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AvailableItems constraint of '<em>Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineItem_AvailableItems(LineItem lineItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lineItem.AvailableItems(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTax(Tax tax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalCharge(AdditionalCharge additionalCharge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalCharge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard(Card card, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(card, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrice(Price price, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(price, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMethod(PaymentMethod paymentMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxType(TaxType taxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionType(TransactionType transactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUoM(UoM uoM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Assignment2Validator
