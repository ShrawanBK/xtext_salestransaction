/**
 */
package assignment2.impl;

import assignment2.AdditionalCharge;
import assignment2.Assignment2Package;
import assignment2.Assignment2Tables;
import assignment2.Discount;
import assignment2.Item;
import assignment2.LineItem;
import assignment2.Price;
import assignment2.Tax;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.LineItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getSubTotal <em>Sub Total</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getTax <em>Tax</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link assignment2.impl.LineItemImpl#getAdditionalCharge <em>Additional Charge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineItemImpl extends MinimalEObjectImpl.Container implements LineItem {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected double quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubTotal() <em>Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double SUB_TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

	/**
	 * The cached value of the '{@link #getTax() <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax()
	 * @generated
	 * @ordered
	 */
	protected Tax tax;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected Discount discount;

	/**
	 * The cached value of the '{@link #getAdditionalCharge() <em>Additional Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCharge()
	 * @generated
	 * @ordered
	 */
	protected AdditionalCharge additionalCharge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.LINE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(double newQuantity) {
		double oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSubTotal() {
		/**
		 * item.unitPrice.sellingPrice * quantity
		 */
		final /*@NonInvalid*/ Item item = this.getItem();
		final /*@NonInvalid*/ Price unitPrice = item.getUnitPrice();
		final /*@NonInvalid*/ double sellingPrice = unitPrice.getSellingPrice();
		final /*@NonInvalid*/ RealValue BOXED_sellingPrice = ValueUtil.realValueOf(sellingPrice);
		final /*@NonInvalid*/ double quantity = this.getQuantity();
		final /*@NonInvalid*/ RealValue BOXED_quantity = ValueUtil.realValueOf(quantity);
		final /*@NonInvalid*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(BOXED_sellingPrice, BOXED_quantity);
		final /*@NonInvalid*/ double ECORE_prod = ValueUtil.doubleValueOf(prod);
		return ECORE_prod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubTotal(double newSubTotal) {
		// TODO: implement this method to set the 'Sub Total' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (Item)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.LINE_ITEM__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Item newItem) {
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax getTax() {
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(Tax newTax, NotificationChain msgs) {
		Tax oldTax = tax;
		tax = newTax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__TAX, oldTax, newTax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTax(Tax newTax) {
		if (newTax != tax) {
			NotificationChain msgs = null;
			if (tax != null)
				msgs = ((InternalEObject)tax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__TAX, null, msgs);
			if (newTax != null)
				msgs = ((InternalEObject)newTax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__TAX, null, msgs);
			msgs = basicSetTax(newTax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__TAX, newTax, newTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscount(Discount newDiscount, NotificationChain msgs) {
		Discount oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__DISCOUNT, oldDiscount, newDiscount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(Discount newDiscount) {
		if (newDiscount != discount) {
			NotificationChain msgs = null;
			if (discount != null)
				msgs = ((InternalEObject)discount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__DISCOUNT, null, msgs);
			if (newDiscount != null)
				msgs = ((InternalEObject)newDiscount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__DISCOUNT, null, msgs);
			msgs = basicSetDiscount(newDiscount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__DISCOUNT, newDiscount, newDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalCharge getAdditionalCharge() {
		return additionalCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalCharge(AdditionalCharge newAdditionalCharge, NotificationChain msgs) {
		AdditionalCharge oldAdditionalCharge = additionalCharge;
		additionalCharge = newAdditionalCharge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE, oldAdditionalCharge, newAdditionalCharge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalCharge(AdditionalCharge newAdditionalCharge) {
		if (newAdditionalCharge != additionalCharge) {
			NotificationChain msgs = null;
			if (additionalCharge != null)
				msgs = ((InternalEObject)additionalCharge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE, null, msgs);
			if (newAdditionalCharge != null)
				msgs = ((InternalEObject)newAdditionalCharge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE, null, msgs);
			msgs = basicSetAdditionalCharge(newAdditionalCharge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE, newAdditionalCharge, newAdditionalCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItemInStock() {
		/**
		 * item.availableNumber > quantity
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ Item item = this.getItem();
		final /*@NonInvalid*/ double availableNumber = item.getAvailableNumber();
		final /*@NonInvalid*/ RealValue BOXED_availableNumber = ValueUtil.realValueOf(availableNumber);
		final /*@NonInvalid*/ double quantity = this.getQuantity();
		final /*@NonInvalid*/ RealValue BOXED_quantity = ValueUtil.realValueOf(quantity);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_availableNumber, BOXED_quantity).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AvailableItems(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "LineItem::AvailableItems";
		try {
			/**
			 *
			 * inv AvailableItems:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = item.availableNumber > quantity
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Assignment2Package.Literals.LINE_ITEM___AVAILABLE_ITEMS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Assignment2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ Item item = this.getItem();
				final /*@NonInvalid*/ double availableNumber = item.getAvailableNumber();
				final /*@NonInvalid*/ RealValue BOXED_availableNumber = ValueUtil.realValueOf(availableNumber);
				final /*@NonInvalid*/ double quantity = this.getQuantity();
				final /*@NonInvalid*/ RealValue BOXED_quantity = ValueUtil.realValueOf(quantity);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_availableNumber, BOXED_quantity).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Assignment2Tables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.LINE_ITEM__TAX:
				return basicSetTax(null, msgs);
			case Assignment2Package.LINE_ITEM__DISCOUNT:
				return basicSetDiscount(null, msgs);
			case Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE:
				return basicSetAdditionalCharge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment2Package.LINE_ITEM__CODE:
				return getCode();
			case Assignment2Package.LINE_ITEM__QUANTITY:
				return getQuantity();
			case Assignment2Package.LINE_ITEM__SUB_TOTAL:
				return getSubTotal();
			case Assignment2Package.LINE_ITEM__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case Assignment2Package.LINE_ITEM__TAX:
				return getTax();
			case Assignment2Package.LINE_ITEM__DISCOUNT:
				return getDiscount();
			case Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE:
				return getAdditionalCharge();
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
			case Assignment2Package.LINE_ITEM__CODE:
				setCode((String)newValue);
				return;
			case Assignment2Package.LINE_ITEM__QUANTITY:
				setQuantity((Double)newValue);
				return;
			case Assignment2Package.LINE_ITEM__SUB_TOTAL:
				setSubTotal((Double)newValue);
				return;
			case Assignment2Package.LINE_ITEM__ITEM:
				setItem((Item)newValue);
				return;
			case Assignment2Package.LINE_ITEM__TAX:
				setTax((Tax)newValue);
				return;
			case Assignment2Package.LINE_ITEM__DISCOUNT:
				setDiscount((Discount)newValue);
				return;
			case Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE:
				setAdditionalCharge((AdditionalCharge)newValue);
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
			case Assignment2Package.LINE_ITEM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Assignment2Package.LINE_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case Assignment2Package.LINE_ITEM__SUB_TOTAL:
				setSubTotal(SUB_TOTAL_EDEFAULT);
				return;
			case Assignment2Package.LINE_ITEM__ITEM:
				setItem((Item)null);
				return;
			case Assignment2Package.LINE_ITEM__TAX:
				setTax((Tax)null);
				return;
			case Assignment2Package.LINE_ITEM__DISCOUNT:
				setDiscount((Discount)null);
				return;
			case Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE:
				setAdditionalCharge((AdditionalCharge)null);
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
			case Assignment2Package.LINE_ITEM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Assignment2Package.LINE_ITEM__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case Assignment2Package.LINE_ITEM__SUB_TOTAL:
				return getSubTotal() != SUB_TOTAL_EDEFAULT;
			case Assignment2Package.LINE_ITEM__ITEM:
				return item != null;
			case Assignment2Package.LINE_ITEM__TAX:
				return tax != null;
			case Assignment2Package.LINE_ITEM__DISCOUNT:
				return discount != null;
			case Assignment2Package.LINE_ITEM__ADDITIONAL_CHARGE:
				return additionalCharge != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Assignment2Package.LINE_ITEM___IS_ITEM_IN_STOCK:
				return isItemInStock();
			case Assignment2Package.LINE_ITEM___AVAILABLE_ITEMS__DIAGNOSTICCHAIN_MAP:
				return AvailableItems((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //LineItemImpl
