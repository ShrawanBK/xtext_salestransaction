/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Assignment2Tables;
import assignment2.Item;
import assignment2.Price;
import assignment2.Store;
import assignment2.UoM;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

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
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.ItemImpl#getCode <em>Code</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getBatch <em>Batch</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getUom <em>Uom</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getAvailableNumber <em>Available Number</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#getStore <em>Store</em>}</li>
 *   <li>{@link assignment2.impl.ItemImpl#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends NamedElementImpl implements Item {
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
	 * The default value of the '{@link #getBatch() <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected String batch = BATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final UoM UOM_EDEFAULT = UoM.PCS;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected UoM uom = UOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableNumber() <em>Available Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableNumber()
	 * @generated
	 * @ordered
	 */
	protected static final double AVAILABLE_NUMBER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAvailableNumber() <em>Available Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableNumber()
	 * @generated
	 * @ordered
	 */
	protected double availableNumber = AVAILABLE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Price unitPrice;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBatch() {
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatch(String newBatch) {
		String oldBatch = batch;
		batch = newBatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__BATCH, oldBatch, batch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoM getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUom(UoM newUom) {
		UoM oldUom = uom;
		uom = newUom == null ? UOM_EDEFAULT : newUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__UOM, oldUom, uom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAvailableNumber() {
		return availableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableNumber(double newAvailableNumber) {
		double oldAvailableNumber = availableNumber;
		availableNumber = newAvailableNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__AVAILABLE_NUMBER, oldAvailableNumber, availableNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitPrice(Price newUnitPrice, NotificationChain msgs) {
		Price oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__UNIT_PRICE, oldUnitPrice, newUnitPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Price newUnitPrice) {
		if (newUnitPrice != unitPrice) {
			NotificationChain msgs = null;
			if (unitPrice != null)
				msgs = ((InternalEObject)unitPrice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.ITEM__UNIT_PRICE, null, msgs);
			if (newUnitPrice != null)
				msgs = ((InternalEObject)newUnitPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.ITEM__UNIT_PRICE, null, msgs);
			msgs = basicSetUnitPrice(newUnitPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__UNIT_PRICE, newUnitPrice, newUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store getStore() {
		if (eContainerFeatureID() != Assignment2Package.ITEM__STORE) return null;
		return (Store)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(Store newStore, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStore, Assignment2Package.ITEM__STORE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(Store newStore) {
		if (newStore != eInternalContainer() || (eContainerFeatureID() != Assignment2Package.ITEM__STORE && newStore != null)) {
			if (EcoreUtil.isAncestor(this, newStore))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStore != null)
				msgs = ((InternalEObject)newStore).eInverseAdd(this, Assignment2Package.STORE__ITEM, Store.class, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__STORE, newStore, newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ITEM__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		/**
		 * self.availableNumber > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ double availableNumber = this.getAvailableNumber();
		final /*@NonInvalid*/ RealValue BOXED_availableNumber = ValueUtil.realValueOf(availableNumber);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_availableNumber, Assignment2Tables.INT_0).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		/**
		 * self.isActive
		 */
		final /*@NonInvalid*/ boolean isActive = this.isIsActive();
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ItemNotZero(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Item::ItemNotZero";
		try {
			/**
			 *
			 * inv ItemNotZero:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = availableNumber <> 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Assignment2Package.Literals.ITEM___ITEM_NOT_ZERO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Assignment2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ double availableNumber = this.getAvailableNumber();
				final /*@NonInvalid*/ RealValue BOXED_availableNumber = ValueUtil.realValueOf(availableNumber);
				final /*@NonInvalid*/ boolean result = !BOXED_availableNumber.equals(Assignment2Tables.INT_0);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.ITEM__STORE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStore((Store)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.ITEM__UNIT_PRICE:
				return basicSetUnitPrice(null, msgs);
			case Assignment2Package.ITEM__STORE:
				return basicSetStore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Assignment2Package.ITEM__STORE:
				return eInternalContainer().eInverseRemove(this, Assignment2Package.STORE__ITEM, Store.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment2Package.ITEM__CODE:
				return getCode();
			case Assignment2Package.ITEM__BATCH:
				return getBatch();
			case Assignment2Package.ITEM__DESCRIPTION:
				return getDescription();
			case Assignment2Package.ITEM__UOM:
				return getUom();
			case Assignment2Package.ITEM__AVAILABLE_NUMBER:
				return getAvailableNumber();
			case Assignment2Package.ITEM__UNIT_PRICE:
				return getUnitPrice();
			case Assignment2Package.ITEM__STORE:
				return getStore();
			case Assignment2Package.ITEM__IS_ACTIVE:
				return isIsActive();
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
			case Assignment2Package.ITEM__CODE:
				setCode((String)newValue);
				return;
			case Assignment2Package.ITEM__BATCH:
				setBatch((String)newValue);
				return;
			case Assignment2Package.ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Assignment2Package.ITEM__UOM:
				setUom((UoM)newValue);
				return;
			case Assignment2Package.ITEM__AVAILABLE_NUMBER:
				setAvailableNumber((Double)newValue);
				return;
			case Assignment2Package.ITEM__UNIT_PRICE:
				setUnitPrice((Price)newValue);
				return;
			case Assignment2Package.ITEM__STORE:
				setStore((Store)newValue);
				return;
			case Assignment2Package.ITEM__IS_ACTIVE:
				setIsActive((Boolean)newValue);
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
			case Assignment2Package.ITEM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Assignment2Package.ITEM__BATCH:
				setBatch(BATCH_EDEFAULT);
				return;
			case Assignment2Package.ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Assignment2Package.ITEM__UOM:
				setUom(UOM_EDEFAULT);
				return;
			case Assignment2Package.ITEM__AVAILABLE_NUMBER:
				setAvailableNumber(AVAILABLE_NUMBER_EDEFAULT);
				return;
			case Assignment2Package.ITEM__UNIT_PRICE:
				setUnitPrice((Price)null);
				return;
			case Assignment2Package.ITEM__STORE:
				setStore((Store)null);
				return;
			case Assignment2Package.ITEM__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
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
			case Assignment2Package.ITEM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Assignment2Package.ITEM__BATCH:
				return BATCH_EDEFAULT == null ? batch != null : !BATCH_EDEFAULT.equals(batch);
			case Assignment2Package.ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Assignment2Package.ITEM__UOM:
				return uom != UOM_EDEFAULT;
			case Assignment2Package.ITEM__AVAILABLE_NUMBER:
				return availableNumber != AVAILABLE_NUMBER_EDEFAULT;
			case Assignment2Package.ITEM__UNIT_PRICE:
				return unitPrice != null;
			case Assignment2Package.ITEM__STORE:
				return getStore() != null;
			case Assignment2Package.ITEM__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
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
			case Assignment2Package.ITEM___IS_AVAILABLE:
				return isAvailable();
			case Assignment2Package.ITEM___IS_ACTIVE:
				return isActive();
			case Assignment2Package.ITEM___ITEM_NOT_ZERO__DIAGNOSTICCHAIN_MAP:
				return ItemNotZero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", batch: ");
		result.append(batch);
		result.append(", description: ");
		result.append(description);
		result.append(", uom: ");
		result.append(uom);
		result.append(", availableNumber: ");
		result.append(availableNumber);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
