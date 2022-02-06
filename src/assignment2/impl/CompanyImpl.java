/**
 */
package assignment2.impl;

import assignment2.Address;
import assignment2.Assignment2Package;
import assignment2.Assignment2Tables;
import assignment2.Company;
import assignment2.Store;
import assignment2.Transaction;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.CompanyImpl#getCodice <em>Codice</em>}</li>
 *   <li>{@link assignment2.impl.CompanyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link assignment2.impl.CompanyImpl#getStore <em>Store</em>}</li>
 *   <li>{@link assignment2.impl.CompanyImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends NamedElementImpl implements Company {
	/**
	 * The default value of the '{@link #getCodice() <em>Codice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodice()
	 * @generated
	 * @ordered
	 */
	protected static final String CODICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodice() <em>Codice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodice()
	 * @generated
	 * @ordered
	 */
	protected String codice = CODICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected EList<Store> store;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodice(String newCodice) {
		String oldCodice = codice;
		codice = newCodice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.COMPANY__CODICE, oldCodice, codice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment2Package.COMPANY__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.COMPANY__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment2Package.COMPANY__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.COMPANY__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Store> getStore() {
		if (store == null) {
			store = new EObjectContainmentWithInverseEList<Store>(Store.class, this, Assignment2Package.COMPANY__STORE, Assignment2Package.STORE__COMPANY);
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransaction() {
		if (transaction == null) {
			transaction = new EObjectContainmentEList<Transaction>(Transaction.class, this, Assignment2Package.COMPANY__TRANSACTION);
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ValidateCodice(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Company::ValidateCodice";
		try {
			/**
			 *
			 * inv ValidateCodice:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = codice.size() = 13
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Assignment2Package.Literals.COMPANY___VALIDATE_CODICE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Assignment2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String codice = this.getCodice();
					if (codice == null) {
						throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(codice);
					final /*@Thrown*/ boolean result = size.equals(Assignment2Tables.INT_13);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, Assignment2Tables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment2Package.COMPANY__STORE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStore()).basicAdd(otherEnd, msgs);
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
			case Assignment2Package.COMPANY__ADDRESS:
				return basicSetAddress(null, msgs);
			case Assignment2Package.COMPANY__STORE:
				return ((InternalEList<?>)getStore()).basicRemove(otherEnd, msgs);
			case Assignment2Package.COMPANY__TRANSACTION:
				return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
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
			case Assignment2Package.COMPANY__CODICE:
				return getCodice();
			case Assignment2Package.COMPANY__ADDRESS:
				return getAddress();
			case Assignment2Package.COMPANY__STORE:
				return getStore();
			case Assignment2Package.COMPANY__TRANSACTION:
				return getTransaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Assignment2Package.COMPANY__CODICE:
				setCodice((String)newValue);
				return;
			case Assignment2Package.COMPANY__ADDRESS:
				setAddress((Address)newValue);
				return;
			case Assignment2Package.COMPANY__STORE:
				getStore().clear();
				getStore().addAll((Collection<? extends Store>)newValue);
				return;
			case Assignment2Package.COMPANY__TRANSACTION:
				getTransaction().clear();
				getTransaction().addAll((Collection<? extends Transaction>)newValue);
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
			case Assignment2Package.COMPANY__CODICE:
				setCodice(CODICE_EDEFAULT);
				return;
			case Assignment2Package.COMPANY__ADDRESS:
				setAddress((Address)null);
				return;
			case Assignment2Package.COMPANY__STORE:
				getStore().clear();
				return;
			case Assignment2Package.COMPANY__TRANSACTION:
				getTransaction().clear();
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
			case Assignment2Package.COMPANY__CODICE:
				return CODICE_EDEFAULT == null ? codice != null : !CODICE_EDEFAULT.equals(codice);
			case Assignment2Package.COMPANY__ADDRESS:
				return address != null;
			case Assignment2Package.COMPANY__STORE:
				return store != null && !store.isEmpty();
			case Assignment2Package.COMPANY__TRANSACTION:
				return transaction != null && !transaction.isEmpty();
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
			case Assignment2Package.COMPANY___VALIDATE_CODICE__DIAGNOSTICCHAIN_MAP:
				return ValidateCodice((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (codice: ");
		result.append(codice);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
