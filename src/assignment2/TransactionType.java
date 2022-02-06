/**
 */
package assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transaction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package#getTransactionType()
 * @model
 * @generated
 */
public enum TransactionType implements Enumerator {
	/**
	 * The '<em><b>Cash Sales</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH_SALES_VALUE
	 * @generated
	 * @ordered
	 */
	CASH_SALES(0, "CashSales", "CashSales"),

	/**
	 * The '<em><b>Credit Sales</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_SALES_VALUE
	 * @generated
	 * @ordered
	 */
	CREDIT_SALES(1, "CreditSales", "CreditSales"),

	/**
	 * The '<em><b>Advance Payment Sales</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCE_PAYMENT_SALES_VALUE
	 * @generated
	 * @ordered
	 */
	ADVANCE_PAYMENT_SALES(3, "AdvancePaymentSales", "AdvancePaymentSales");

	/**
	 * The '<em><b>Cash Sales</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASH_SALES
	 * @model name="CashSales"
	 * @generated
	 * @ordered
	 */
	public static final int CASH_SALES_VALUE = 0;

	/**
	 * The '<em><b>Credit Sales</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_SALES
	 * @model name="CreditSales"
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_SALES_VALUE = 1;

	/**
	 * The '<em><b>Advance Payment Sales</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCE_PAYMENT_SALES
	 * @model name="AdvancePaymentSales"
	 * @generated
	 * @ordered
	 */
	public static final int ADVANCE_PAYMENT_SALES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransactionType[] VALUES_ARRAY =
		new TransactionType[] {
			CASH_SALES,
			CREDIT_SALES,
			ADVANCE_PAYMENT_SALES,
		};

	/**
	 * A public read-only list of all the '<em><b>Transaction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransactionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionType get(int value) {
		switch (value) {
			case CASH_SALES_VALUE: return CASH_SALES;
			case CREDIT_SALES_VALUE: return CREDIT_SALES;
			case ADVANCE_PAYMENT_SALES_VALUE: return ADVANCE_PAYMENT_SALES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TransactionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TransactionType
