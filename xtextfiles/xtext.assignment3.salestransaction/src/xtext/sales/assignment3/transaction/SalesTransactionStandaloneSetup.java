/*
 * generated by Xtext 2.25.0
 */
package xtext.sales.assignment3.transaction;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SalesTransactionStandaloneSetup extends SalesTransactionStandaloneSetupGenerated {

	public static void doSetup() {
		new SalesTransactionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
