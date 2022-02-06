/**
 */
package assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tax Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package#getTaxType()
 * @model
 * @generated
 */
public enum TaxType implements Enumerator {
	/**
	 * The '<em><b>Tax Exempt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT(0, "TaxExempt", "TaxExempt"),

	/**
	 * The '<em><b>Income Tax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOME_TAX_VALUE
	 * @generated
	 * @ordered
	 */
	INCOME_TAX(5, "IncomeTax", "IncomeTax"),

	/**
	 * The '<em><b>Corporate Tax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORPORATE_TAX_VALUE
	 * @generated
	 * @ordered
	 */
	CORPORATE_TAX(10, "CorporateTax", "CorporateTax"),

	/**
	 * The '<em><b>VAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAT_VALUE
	 * @generated
	 * @ordered
	 */
	VAT(15, "VAT", "VAT");

	/**
	 * The '<em><b>Tax Exempt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT
	 * @model name="TaxExempt"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_VALUE = 0;

	/**
	 * The '<em><b>Income Tax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOME_TAX
	 * @model name="IncomeTax"
	 * @generated
	 * @ordered
	 */
	public static final int INCOME_TAX_VALUE = 5;

	/**
	 * The '<em><b>Corporate Tax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORPORATE_TAX
	 * @model name="CorporateTax"
	 * @generated
	 * @ordered
	 */
	public static final int CORPORATE_TAX_VALUE = 10;

	/**
	 * The '<em><b>VAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAT_VALUE = 15;

	/**
	 * An array of all the '<em><b>Tax Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaxType[] VALUES_ARRAY =
		new TaxType[] {
			TAX_EXEMPT,
			INCOME_TAX,
			CORPORATE_TAX,
			VAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Tax Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaxType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tax Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaxType get(int value) {
		switch (value) {
			case TAX_EXEMPT_VALUE: return TAX_EXEMPT;
			case INCOME_TAX_VALUE: return INCOME_TAX;
			case CORPORATE_TAX_VALUE: return CORPORATE_TAX;
			case VAT_VALUE: return VAT;
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
	private TaxType(int value, String name, String literal) {
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
	
} //TaxType
