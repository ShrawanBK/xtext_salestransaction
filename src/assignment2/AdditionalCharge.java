/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.AdditionalCharge#getServiceCharge <em>Service Charge</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getAdditionalCharge()
 * @model
 * @generated
 */
public interface AdditionalCharge extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Charge</em>' attribute.
	 * @see #setServiceCharge(double)
	 * @see assignment2.Assignment2Package#getAdditionalCharge_ServiceCharge()
	 * @model required="true"
	 * @generated
	 */
	double getServiceCharge();

	/**
	 * Sets the value of the '{@link assignment2.AdditionalCharge#getServiceCharge <em>Service Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Charge</em>' attribute.
	 * @see #getServiceCharge()
	 * @generated
	 */
	void setServiceCharge(double value);

} // AdditionalCharge
