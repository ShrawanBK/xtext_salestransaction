/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Tax;
import assignment2.TaxType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.TaxImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link assignment2.impl.TaxImpl#getTaxableAmount <em>Taxable Amount</em>}</li>
 *   <li>{@link assignment2.impl.TaxImpl#getTaxAmount <em>Tax Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxImpl extends MinimalEObjectImpl.Container implements Tax {
	/**
	 * The default value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final TaxType TAX_TYPE_EDEFAULT = TaxType.TAX_EXEMPT;

	/**
	 * The cached value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected TaxType taxType = TAX_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxableAmount() <em>Taxable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxableAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double TAXABLE_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTaxableAmount() <em>Taxable Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxableAmount()
	 * @generated
	 * @ordered
	 */
	protected double taxableAmount = TAXABLE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double TAX_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected double taxAmount = TAX_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.TAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxType getTaxType() {
		return taxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(TaxType newTaxType) {
		TaxType oldTaxType = taxType;
		taxType = newTaxType == null ? TAX_TYPE_EDEFAULT : newTaxType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TAX__TAX_TYPE, oldTaxType, taxType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTaxableAmount() {
		return taxableAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxableAmount(double newTaxableAmount) {
		double oldTaxableAmount = taxableAmount;
		taxableAmount = newTaxableAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TAX__TAXABLE_AMOUNT, oldTaxableAmount, taxableAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTaxAmount() {
		return taxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(double newTaxAmount) {
		double oldTaxAmount = taxAmount;
		taxAmount = newTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.TAX__TAX_AMOUNT, oldTaxAmount, taxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment2Package.TAX__TAX_TYPE:
				return getTaxType();
			case Assignment2Package.TAX__TAXABLE_AMOUNT:
				return getTaxableAmount();
			case Assignment2Package.TAX__TAX_AMOUNT:
				return getTaxAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Assignment2Package.TAX__TAX_TYPE:
				setTaxType((TaxType)newValue);
				return;
			case Assignment2Package.TAX__TAXABLE_AMOUNT:
				setTaxableAmount((Double)newValue);
				return;
			case Assignment2Package.TAX__TAX_AMOUNT:
				setTaxAmount((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Assignment2Package.TAX__TAX_TYPE:
				setTaxType(TAX_TYPE_EDEFAULT);
				return;
			case Assignment2Package.TAX__TAXABLE_AMOUNT:
				setTaxableAmount(TAXABLE_AMOUNT_EDEFAULT);
				return;
			case Assignment2Package.TAX__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Assignment2Package.TAX__TAX_TYPE:
				return taxType != TAX_TYPE_EDEFAULT;
			case Assignment2Package.TAX__TAXABLE_AMOUNT:
				return taxableAmount != TAXABLE_AMOUNT_EDEFAULT;
			case Assignment2Package.TAX__TAX_AMOUNT:
				return taxAmount != TAX_AMOUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (taxType: ");
		result.append(taxType);
		result.append(", taxableAmount: ");
		result.append(taxableAmount);
		result.append(", taxAmount: ");
		result.append(taxAmount);
		result.append(')');
		return result.toString();
	}

} //TaxImpl
