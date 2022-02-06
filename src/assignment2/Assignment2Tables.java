/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /xtext.sales.assignment3/emf.assignment2/metamodel/assignment2.ecore
 * using:
 *   /xtext.sales.assignment3/emf.assignment2/metamodel/assignment2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package assignment2;

// import assignment2.Assignment2Package;
// import assignment2.Assignment2Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Assignment2Tables provides the dispatch tables for the assignment2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Assignment2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Assignment2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_sales_org_s_assignment2 = IdManager.getNsURIPackageId("http://www.sales.org/assignment2", null, Assignment2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AdditionalCharge = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("AdditionalCharge", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Address = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Address", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Card = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Card", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Cashier = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Cashier", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Company = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Company", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Customer = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Discount = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Discount", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_LineItem = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("LineItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Person = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Person", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Price = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Price", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Store = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Store", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tax = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Tax", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Transaction = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getClassId("Transaction", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Assignment2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = Assignment2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Assignment2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentMethod = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getEnumerationId("PaymentMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TaxType = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getEnumerationId("TaxType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TransactionType = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getEnumerationId("TransactionType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_UoM = Assignment2Tables.PACKid_http_c_s_s_www_sales_org_s_assignment2.getEnumerationId("UoM");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_13 = ValueUtil.integerValueOf("13");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_LineItem = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_LineItem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Item = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_LineItem = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_LineItem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Store = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Store);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Transaction = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Transaction);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EDouble = TypeId.SEQUENCE.getSpecializedId(Assignment2Tables.DATAid_EDouble);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Assignment2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AdditionalCharge = new EcoreExecutorType(Assignment2Package.Literals.ADDITIONAL_CHARGE, PACKAGE, 0);
		public static final EcoreExecutorType _Address = new EcoreExecutorType(Assignment2Package.Literals.ADDRESS, PACKAGE, 0);
		public static final EcoreExecutorType _Card = new EcoreExecutorType(Assignment2Package.Literals.CARD, PACKAGE, 0);
		public static final EcoreExecutorType _Cashier = new EcoreExecutorType(Assignment2Package.Literals.CASHIER, PACKAGE, 0);
		public static final EcoreExecutorType _Company = new EcoreExecutorType(Assignment2Package.Literals.COMPANY, PACKAGE, 0);
		public static final EcoreExecutorType _Customer = new EcoreExecutorType(Assignment2Package.Literals.CUSTOMER, PACKAGE, 0);
		public static final EcoreExecutorType _Discount = new EcoreExecutorType(Assignment2Package.Literals.DISCOUNT, PACKAGE, 0);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(Assignment2Package.Literals.ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _LineItem = new EcoreExecutorType(Assignment2Package.Literals.LINE_ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(Assignment2Package.Literals.NAMED_ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentMethod = new EcoreExecutorEnumeration(Assignment2Package.Literals.PAYMENT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorType _Person = new EcoreExecutorType(Assignment2Package.Literals.PERSON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Price = new EcoreExecutorType(Assignment2Package.Literals.PRICE, PACKAGE, 0);
		public static final EcoreExecutorType _Store = new EcoreExecutorType(Assignment2Package.Literals.STORE, PACKAGE, 0);
		public static final EcoreExecutorType _Tax = new EcoreExecutorType(Assignment2Package.Literals.TAX, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TaxType = new EcoreExecutorEnumeration(Assignment2Package.Literals.TAX_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Transaction = new EcoreExecutorType(Assignment2Package.Literals.TRANSACTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TransactionType = new EcoreExecutorEnumeration(Assignment2Package.Literals.TRANSACTION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _UoM = new EcoreExecutorEnumeration(Assignment2Package.Literals.UO_M, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AdditionalCharge,
			_Address,
			_Card,
			_Cashier,
			_Company,
			_Customer,
			_Discount,
			_Item,
			_LineItem,
			_NamedElement,
			_PaymentMethod,
			_Person,
			_Price,
			_Store,
			_Tax,
			_TaxType,
			_Transaction,
			_TransactionType,
			_UoM
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AdditionalCharge__AdditionalCharge = new ExecutorFragment(Types._AdditionalCharge, Assignment2Tables.Types._AdditionalCharge);
		private static final ExecutorFragment _AdditionalCharge__OclAny = new ExecutorFragment(Types._AdditionalCharge, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AdditionalCharge__OclElement = new ExecutorFragment(Types._AdditionalCharge, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Address__Address = new ExecutorFragment(Types._Address, Assignment2Tables.Types._Address);
		private static final ExecutorFragment _Address__OclAny = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Address__OclElement = new ExecutorFragment(Types._Address, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Card__Card = new ExecutorFragment(Types._Card, Assignment2Tables.Types._Card);
		private static final ExecutorFragment _Card__OclAny = new ExecutorFragment(Types._Card, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Card__OclElement = new ExecutorFragment(Types._Card, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Cashier__Cashier = new ExecutorFragment(Types._Cashier, Assignment2Tables.Types._Cashier);
		private static final ExecutorFragment _Cashier__NamedElement = new ExecutorFragment(Types._Cashier, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Cashier__OclAny = new ExecutorFragment(Types._Cashier, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cashier__OclElement = new ExecutorFragment(Types._Cashier, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Cashier__Person = new ExecutorFragment(Types._Cashier, Assignment2Tables.Types._Person);

		private static final ExecutorFragment _Company__Company = new ExecutorFragment(Types._Company, Assignment2Tables.Types._Company);
		private static final ExecutorFragment _Company__NamedElement = new ExecutorFragment(Types._Company, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Company__OclAny = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Company__OclElement = new ExecutorFragment(Types._Company, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, Assignment2Tables.Types._Customer);
		private static final ExecutorFragment _Customer__NamedElement = new ExecutorFragment(Types._Customer, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Customer__Person = new ExecutorFragment(Types._Customer, Assignment2Tables.Types._Person);

		private static final ExecutorFragment _Discount__Discount = new ExecutorFragment(Types._Discount, Assignment2Tables.Types._Discount);
		private static final ExecutorFragment _Discount__OclAny = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Discount__OclElement = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, Assignment2Tables.Types._Item);
		private static final ExecutorFragment _Item__NamedElement = new ExecutorFragment(Types._Item, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LineItem__LineItem = new ExecutorFragment(Types._LineItem, Assignment2Tables.Types._LineItem);
		private static final ExecutorFragment _LineItem__OclAny = new ExecutorFragment(Types._LineItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LineItem__OclElement = new ExecutorFragment(Types._LineItem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PaymentMethod__OclAny = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentMethod__OclElement = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentMethod__OclEnumeration = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentMethod__OclType = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentMethod__PaymentMethod = new ExecutorFragment(Types._PaymentMethod, Assignment2Tables.Types._PaymentMethod);

		private static final ExecutorFragment _Person__NamedElement = new ExecutorFragment(Types._Person, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Person__OclAny = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Person__OclElement = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Person__Person = new ExecutorFragment(Types._Person, Assignment2Tables.Types._Person);

		private static final ExecutorFragment _Price__OclAny = new ExecutorFragment(Types._Price, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Price__OclElement = new ExecutorFragment(Types._Price, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Price__Price = new ExecutorFragment(Types._Price, Assignment2Tables.Types._Price);

		private static final ExecutorFragment _Store__NamedElement = new ExecutorFragment(Types._Store, Assignment2Tables.Types._NamedElement);
		private static final ExecutorFragment _Store__OclAny = new ExecutorFragment(Types._Store, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Store__OclElement = new ExecutorFragment(Types._Store, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Store__Store = new ExecutorFragment(Types._Store, Assignment2Tables.Types._Store);

		private static final ExecutorFragment _Tax__OclAny = new ExecutorFragment(Types._Tax, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tax__OclElement = new ExecutorFragment(Types._Tax, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tax__Tax = new ExecutorFragment(Types._Tax, Assignment2Tables.Types._Tax);

		private static final ExecutorFragment _TaxType__OclAny = new ExecutorFragment(Types._TaxType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TaxType__OclElement = new ExecutorFragment(Types._TaxType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TaxType__OclEnumeration = new ExecutorFragment(Types._TaxType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TaxType__OclType = new ExecutorFragment(Types._TaxType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TaxType__TaxType = new ExecutorFragment(Types._TaxType, Assignment2Tables.Types._TaxType);

		private static final ExecutorFragment _Transaction__OclAny = new ExecutorFragment(Types._Transaction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Transaction__OclElement = new ExecutorFragment(Types._Transaction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Transaction__Transaction = new ExecutorFragment(Types._Transaction, Assignment2Tables.Types._Transaction);

		private static final ExecutorFragment _TransactionType__OclAny = new ExecutorFragment(Types._TransactionType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransactionType__OclElement = new ExecutorFragment(Types._TransactionType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransactionType__OclEnumeration = new ExecutorFragment(Types._TransactionType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TransactionType__OclType = new ExecutorFragment(Types._TransactionType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _TransactionType__TransactionType = new ExecutorFragment(Types._TransactionType, Assignment2Tables.Types._TransactionType);

		private static final ExecutorFragment _UoM__OclAny = new ExecutorFragment(Types._UoM, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UoM__OclElement = new ExecutorFragment(Types._UoM, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UoM__OclEnumeration = new ExecutorFragment(Types._UoM, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _UoM__OclType = new ExecutorFragment(Types._UoM, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _UoM__UoM = new ExecutorFragment(Types._UoM, Assignment2Tables.Types._UoM);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Item__isActive = new ExecutorOperation("isActive", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Item,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Item__isAvailable = new ExecutorOperation("isAvailable", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Item,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _LineItem__isItemInStock = new ExecutorOperation("isItemInStock", TypeUtil.EMPTY_PARAMETER_TYPES, Types._LineItem,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AdditionalCharge__serviceCharge = new EcoreExecutorProperty(Assignment2Package.Literals.ADDITIONAL_CHARGE__SERVICE_CHARGE, Types._AdditionalCharge, 0);
		public static final ExecutorProperty _AdditionalCharge__LineItem__additionalCharge = new ExecutorPropertyWithImplementation("LineItem", Types._AdditionalCharge, 1, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LINE_ITEM__ADDITIONAL_CHARGE));

		public static final ExecutorProperty _Address__city = new EcoreExecutorProperty(Assignment2Package.Literals.ADDRESS__CITY, Types._Address, 0);
		public static final ExecutorProperty _Address__country = new EcoreExecutorProperty(Assignment2Package.Literals.ADDRESS__COUNTRY, Types._Address, 1);
		public static final ExecutorProperty _Address__street = new EcoreExecutorProperty(Assignment2Package.Literals.ADDRESS__STREET, Types._Address, 2);
		public static final ExecutorProperty _Address__telephone = new EcoreExecutorProperty(Assignment2Package.Literals.ADDRESS__TELEPHONE, Types._Address, 3);
		public static final ExecutorProperty _Address__Company__address = new ExecutorPropertyWithImplementation("Company", Types._Address, 4, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.COMPANY__ADDRESS));

		public static final ExecutorProperty _Card__cardHolder = new EcoreExecutorProperty(Assignment2Package.Literals.CARD__CARD_HOLDER, Types._Card, 0);
		public static final ExecutorProperty _Card__cardNumber = new EcoreExecutorProperty(Assignment2Package.Literals.CARD__CARD_NUMBER, Types._Card, 1);
		public static final ExecutorProperty _Card__expiryDate = new EcoreExecutorProperty(Assignment2Package.Literals.CARD__EXPIRY_DATE, Types._Card, 2);
		public static final ExecutorProperty _Card__Transaction__card = new ExecutorPropertyWithImplementation("Transaction", Types._Card, 3, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.TRANSACTION__CARD));

		public static final ExecutorProperty _Cashier__employeeId = new EcoreExecutorProperty(Assignment2Package.Literals.CASHIER__EMPLOYEE_ID, Types._Cashier, 0);
		public static final ExecutorProperty _Cashier__Person__cashier = new ExecutorPropertyWithImplementation("Person", Types._Cashier, 1, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.PERSON__CASHIER));
		public static final ExecutorProperty _Cashier__Transaction__cashier = new ExecutorPropertyWithImplementation("Transaction", Types._Cashier, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.TRANSACTION__CASHIER));

		public static final ExecutorProperty _Company__address = new EcoreExecutorProperty(Assignment2Package.Literals.COMPANY__ADDRESS, Types._Company, 0);
		public static final ExecutorProperty _Company__codice = new EcoreExecutorProperty(Assignment2Package.Literals.COMPANY__CODICE, Types._Company, 1);
		public static final ExecutorProperty _Company__store = new EcoreExecutorProperty(Assignment2Package.Literals.COMPANY__STORE, Types._Company, 2);
		public static final ExecutorProperty _Company__transaction = new EcoreExecutorProperty(Assignment2Package.Literals.COMPANY__TRANSACTION, Types._Company, 3);

		public static final ExecutorProperty _Customer__card = new EcoreExecutorProperty(Assignment2Package.Literals.CUSTOMER__CARD, Types._Customer, 0);
		public static final ExecutorProperty _Customer__identityNumber = new EcoreExecutorProperty(Assignment2Package.Literals.CUSTOMER__IDENTITY_NUMBER, Types._Customer, 1);
		public static final ExecutorProperty _Customer__phoneNumber = new EcoreExecutorProperty(Assignment2Package.Literals.CUSTOMER__PHONE_NUMBER, Types._Customer, 2);
		public static final ExecutorProperty _Customer__Person__customer = new ExecutorPropertyWithImplementation("Person", Types._Customer, 3, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.PERSON__CUSTOMER));
		public static final ExecutorProperty _Customer__Transaction__customer = new ExecutorPropertyWithImplementation("Transaction", Types._Customer, 4, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.TRANSACTION__CUSTOMER));

		public static final ExecutorProperty _Discount__amount = new EcoreExecutorProperty(Assignment2Package.Literals.DISCOUNT__AMOUNT, Types._Discount, 0);
		public static final ExecutorProperty _Discount__percentage = new EcoreExecutorProperty(Assignment2Package.Literals.DISCOUNT__PERCENTAGE, Types._Discount, 1);
		public static final ExecutorProperty _Discount__LineItem__discount = new ExecutorPropertyWithImplementation("LineItem", Types._Discount, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LINE_ITEM__DISCOUNT));

		public static final ExecutorProperty _Item__availableNumber = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__AVAILABLE_NUMBER, Types._Item, 0);
		public static final ExecutorProperty _Item__batch = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__BATCH, Types._Item, 1);
		public static final ExecutorProperty _Item__code = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__CODE, Types._Item, 2);
		public static final ExecutorProperty _Item__description = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__DESCRIPTION, Types._Item, 3);
		public static final ExecutorProperty _Item__isActive = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__IS_ACTIVE, Types._Item, 4);
		public static final ExecutorProperty _Item__store = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__STORE, Types._Item, 5);
		public static final ExecutorProperty _Item__unitPrice = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__UNIT_PRICE, Types._Item, 6);
		public static final ExecutorProperty _Item__uom = new EcoreExecutorProperty(Assignment2Package.Literals.ITEM__UOM, Types._Item, 7);
		public static final ExecutorProperty _Item__LineItem__item = new ExecutorPropertyWithImplementation("LineItem", Types._Item, 8, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LINE_ITEM__ITEM));

		public static final ExecutorProperty _LineItem__additionalCharge = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__ADDITIONAL_CHARGE, Types._LineItem, 0);
		public static final ExecutorProperty _LineItem__code = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__CODE, Types._LineItem, 1);
		public static final ExecutorProperty _LineItem__discount = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__DISCOUNT, Types._LineItem, 2);
		public static final ExecutorProperty _LineItem__item = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__ITEM, Types._LineItem, 3);
		public static final ExecutorProperty _LineItem__quantity = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__QUANTITY, Types._LineItem, 4);
		public static final ExecutorProperty _LineItem__subTotal = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__SUB_TOTAL, Types._LineItem, 5);
		public static final ExecutorProperty _LineItem__tax = new EcoreExecutorProperty(Assignment2Package.Literals.LINE_ITEM__TAX, Types._LineItem, 6);
		public static final ExecutorProperty _LineItem__Transaction__lineItem = new ExecutorPropertyWithImplementation("Transaction", Types._LineItem, 7, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.TRANSACTION__LINE_ITEM));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(Assignment2Package.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Person__cashier = new EcoreExecutorProperty(Assignment2Package.Literals.PERSON__CASHIER, Types._Person, 0);
		public static final ExecutorProperty _Person__customer = new EcoreExecutorProperty(Assignment2Package.Literals.PERSON__CUSTOMER, Types._Person, 1);
		public static final ExecutorProperty _Person__surName = new EcoreExecutorProperty(Assignment2Package.Literals.PERSON__SUR_NAME, Types._Person, 2);

		public static final ExecutorProperty _Price__sellingPrice = new EcoreExecutorProperty(Assignment2Package.Literals.PRICE__SELLING_PRICE, Types._Price, 0);
		public static final ExecutorProperty _Price__Item__unitPrice = new ExecutorPropertyWithImplementation("Item", Types._Price, 1, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.ITEM__UNIT_PRICE));

		public static final ExecutorProperty _Store__company = new EcoreExecutorProperty(Assignment2Package.Literals.STORE__COMPANY, Types._Store, 0);
		public static final ExecutorProperty _Store__item = new EcoreExecutorProperty(Assignment2Package.Literals.STORE__ITEM, Types._Store, 1);

		public static final ExecutorProperty _Tax__taxAmount = new EcoreExecutorProperty(Assignment2Package.Literals.TAX__TAX_AMOUNT, Types._Tax, 0);
		public static final ExecutorProperty _Tax__taxType = new EcoreExecutorProperty(Assignment2Package.Literals.TAX__TAX_TYPE, Types._Tax, 1);
		public static final ExecutorProperty _Tax__taxableAmount = new EcoreExecutorProperty(Assignment2Package.Literals.TAX__TAXABLE_AMOUNT, Types._Tax, 2);
		public static final ExecutorProperty _Tax__LineItem__tax = new ExecutorPropertyWithImplementation("LineItem", Types._Tax, 3, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LINE_ITEM__TAX));

		public static final ExecutorProperty _Transaction__card = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__CARD, Types._Transaction, 0);
		public static final ExecutorProperty _Transaction__cashier = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__CASHIER, Types._Transaction, 1);
		public static final ExecutorProperty _Transaction__customer = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__CUSTOMER, Types._Transaction, 2);
		public static final ExecutorProperty _Transaction__grandTotal = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__GRAND_TOTAL, Types._Transaction, 3);
		public static final ExecutorProperty _Transaction__issuedDate = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__ISSUED_DATE, Types._Transaction, 4);
		public static final ExecutorProperty _Transaction__lineItem = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__LINE_ITEM, Types._Transaction, 5);
		public static final ExecutorProperty _Transaction__paymentMethod = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__PAYMENT_METHOD, Types._Transaction, 6);
		public static final ExecutorProperty _Transaction__totalItemsPurchased = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__TOTAL_ITEMS_PURCHASED, Types._Transaction, 7);
		public static final ExecutorProperty _Transaction__transactionNumber = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__TRANSACTION_NUMBER, Types._Transaction, 8);
		public static final ExecutorProperty _Transaction__transactionType = new EcoreExecutorProperty(Assignment2Package.Literals.TRANSACTION__TRANSACTION_TYPE, Types._Transaction, 9);
		public static final ExecutorProperty _Transaction__Company__transaction = new ExecutorPropertyWithImplementation("Company", Types._Transaction, 10, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.COMPANY__TRANSACTION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AdditionalCharge =
			{
				Fragments._AdditionalCharge__OclAny /* 0 */,
				Fragments._AdditionalCharge__OclElement /* 1 */,
				Fragments._AdditionalCharge__AdditionalCharge /* 2 */
			};
		private static final int /*@NonNull*/ [] __AdditionalCharge = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Address =
			{
				Fragments._Address__OclAny /* 0 */,
				Fragments._Address__OclElement /* 1 */,
				Fragments._Address__Address /* 2 */
			};
		private static final int /*@NonNull*/ [] __Address = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Card =
			{
				Fragments._Card__OclAny /* 0 */,
				Fragments._Card__OclElement /* 1 */,
				Fragments._Card__Card /* 2 */
			};
		private static final int /*@NonNull*/ [] __Card = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Cashier =
			{
				Fragments._Cashier__OclAny /* 0 */,
				Fragments._Cashier__OclElement /* 1 */,
				Fragments._Cashier__NamedElement /* 2 */,
				Fragments._Cashier__Person /* 3 */,
				Fragments._Cashier__Cashier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Cashier = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Company =
			{
				Fragments._Company__OclAny /* 0 */,
				Fragments._Company__OclElement /* 1 */,
				Fragments._Company__NamedElement /* 2 */,
				Fragments._Company__Company /* 3 */
			};
		private static final int /*@NonNull*/ [] __Company = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Customer =
			{
				Fragments._Customer__OclAny /* 0 */,
				Fragments._Customer__OclElement /* 1 */,
				Fragments._Customer__NamedElement /* 2 */,
				Fragments._Customer__Person /* 3 */,
				Fragments._Customer__Customer /* 4 */
			};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Discount =
			{
				Fragments._Discount__OclAny /* 0 */,
				Fragments._Discount__OclElement /* 1 */,
				Fragments._Discount__Discount /* 2 */
			};
		private static final int /*@NonNull*/ [] __Discount = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__NamedElement /* 2 */,
				Fragments._Item__Item /* 3 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LineItem =
			{
				Fragments._LineItem__OclAny /* 0 */,
				Fragments._LineItem__OclElement /* 1 */,
				Fragments._LineItem__LineItem /* 2 */
			};
		private static final int /*@NonNull*/ [] __LineItem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentMethod =
			{
				Fragments._PaymentMethod__OclAny /* 0 */,
				Fragments._PaymentMethod__OclElement /* 1 */,
				Fragments._PaymentMethod__OclType /* 2 */,
				Fragments._PaymentMethod__OclEnumeration /* 3 */,
				Fragments._PaymentMethod__PaymentMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentMethod = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Person =
			{
				Fragments._Person__OclAny /* 0 */,
				Fragments._Person__OclElement /* 1 */,
				Fragments._Person__NamedElement /* 2 */,
				Fragments._Person__Person /* 3 */
			};
		private static final int /*@NonNull*/ [] __Person = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Price =
			{
				Fragments._Price__OclAny /* 0 */,
				Fragments._Price__OclElement /* 1 */,
				Fragments._Price__Price /* 2 */
			};
		private static final int /*@NonNull*/ [] __Price = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Store =
			{
				Fragments._Store__OclAny /* 0 */,
				Fragments._Store__OclElement /* 1 */,
				Fragments._Store__NamedElement /* 2 */,
				Fragments._Store__Store /* 3 */
			};
		private static final int /*@NonNull*/ [] __Store = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tax =
			{
				Fragments._Tax__OclAny /* 0 */,
				Fragments._Tax__OclElement /* 1 */,
				Fragments._Tax__Tax /* 2 */
			};
		private static final int /*@NonNull*/ [] __Tax = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TaxType =
			{
				Fragments._TaxType__OclAny /* 0 */,
				Fragments._TaxType__OclElement /* 1 */,
				Fragments._TaxType__OclType /* 2 */,
				Fragments._TaxType__OclEnumeration /* 3 */,
				Fragments._TaxType__TaxType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TaxType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Transaction =
			{
				Fragments._Transaction__OclAny /* 0 */,
				Fragments._Transaction__OclElement /* 1 */,
				Fragments._Transaction__Transaction /* 2 */
			};
		private static final int /*@NonNull*/ [] __Transaction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransactionType =
			{
				Fragments._TransactionType__OclAny /* 0 */,
				Fragments._TransactionType__OclElement /* 1 */,
				Fragments._TransactionType__OclType /* 2 */,
				Fragments._TransactionType__OclEnumeration /* 3 */,
				Fragments._TransactionType__TransactionType /* 4 */
			};
		private static final int /*@NonNull*/ [] __TransactionType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UoM =
			{
				Fragments._UoM__OclAny /* 0 */,
				Fragments._UoM__OclElement /* 1 */,
				Fragments._UoM__OclType /* 2 */,
				Fragments._UoM__OclEnumeration /* 3 */,
				Fragments._UoM__UoM /* 4 */
			};
		private static final int /*@NonNull*/ [] __UoM = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AdditionalCharge.initFragments(_AdditionalCharge, __AdditionalCharge);
			Types._Address.initFragments(_Address, __Address);
			Types._Card.initFragments(_Card, __Card);
			Types._Cashier.initFragments(_Cashier, __Cashier);
			Types._Company.initFragments(_Company, __Company);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._Discount.initFragments(_Discount, __Discount);
			Types._Item.initFragments(_Item, __Item);
			Types._LineItem.initFragments(_LineItem, __LineItem);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._PaymentMethod.initFragments(_PaymentMethod, __PaymentMethod);
			Types._Person.initFragments(_Person, __Person);
			Types._Price.initFragments(_Price, __Price);
			Types._Store.initFragments(_Store, __Store);
			Types._Tax.initFragments(_Tax, __Tax);
			Types._TaxType.initFragments(_TaxType, __TaxType);
			Types._Transaction.initFragments(_Transaction, __Transaction);
			Types._TransactionType.initFragments(_TransactionType, __TransactionType);
			Types._UoM.initFragments(_UoM, __UoM);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AdditionalCharge__AdditionalCharge = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdditionalCharge__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AdditionalCharge__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Address__Address = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Address__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Address__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Card__Card = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Card__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Card__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Cashier__Cashier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cashier__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cashier__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cashier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cashier__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Company__Company = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Company__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Discount__Discount = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {
			Assignment2Tables.Operations._Item__isActive /* isActive() */,
			Assignment2Tables.Operations._Item__isAvailable /* isAvailable() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LineItem__LineItem = {
			Assignment2Tables.Operations._LineItem__isItemInStock /* isItemInStock() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LineItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LineItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__PaymentMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Person__Person = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Price__Price = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Price__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Price__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Store__Store = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Store__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Store__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Store__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Tax__Tax = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tax__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Tax__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TaxType__TaxType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TaxType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaxType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaxType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TaxType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Transaction__Transaction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Transaction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Transaction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransactionType__TransactionType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransactionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransactionType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransactionType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransactionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UoM__UoM = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UoM__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UoM__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UoM__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UoM__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AdditionalCharge__AdditionalCharge.initOperations(_AdditionalCharge__AdditionalCharge);
			Fragments._AdditionalCharge__OclAny.initOperations(_AdditionalCharge__OclAny);
			Fragments._AdditionalCharge__OclElement.initOperations(_AdditionalCharge__OclElement);

			Fragments._Address__Address.initOperations(_Address__Address);
			Fragments._Address__OclAny.initOperations(_Address__OclAny);
			Fragments._Address__OclElement.initOperations(_Address__OclElement);

			Fragments._Card__Card.initOperations(_Card__Card);
			Fragments._Card__OclAny.initOperations(_Card__OclAny);
			Fragments._Card__OclElement.initOperations(_Card__OclElement);

			Fragments._Cashier__Cashier.initOperations(_Cashier__Cashier);
			Fragments._Cashier__NamedElement.initOperations(_Cashier__NamedElement);
			Fragments._Cashier__OclAny.initOperations(_Cashier__OclAny);
			Fragments._Cashier__OclElement.initOperations(_Cashier__OclElement);
			Fragments._Cashier__Person.initOperations(_Cashier__Person);

			Fragments._Company__Company.initOperations(_Company__Company);
			Fragments._Company__NamedElement.initOperations(_Company__NamedElement);
			Fragments._Company__OclAny.initOperations(_Company__OclAny);
			Fragments._Company__OclElement.initOperations(_Company__OclElement);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__NamedElement.initOperations(_Customer__NamedElement);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);
			Fragments._Customer__Person.initOperations(_Customer__Person);

			Fragments._Discount__Discount.initOperations(_Discount__Discount);
			Fragments._Discount__OclAny.initOperations(_Discount__OclAny);
			Fragments._Discount__OclElement.initOperations(_Discount__OclElement);

			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__NamedElement.initOperations(_Item__NamedElement);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._LineItem__LineItem.initOperations(_LineItem__LineItem);
			Fragments._LineItem__OclAny.initOperations(_LineItem__OclAny);
			Fragments._LineItem__OclElement.initOperations(_LineItem__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._PaymentMethod__OclAny.initOperations(_PaymentMethod__OclAny);
			Fragments._PaymentMethod__OclElement.initOperations(_PaymentMethod__OclElement);
			Fragments._PaymentMethod__OclEnumeration.initOperations(_PaymentMethod__OclEnumeration);
			Fragments._PaymentMethod__OclType.initOperations(_PaymentMethod__OclType);
			Fragments._PaymentMethod__PaymentMethod.initOperations(_PaymentMethod__PaymentMethod);

			Fragments._Person__NamedElement.initOperations(_Person__NamedElement);
			Fragments._Person__OclAny.initOperations(_Person__OclAny);
			Fragments._Person__OclElement.initOperations(_Person__OclElement);
			Fragments._Person__Person.initOperations(_Person__Person);

			Fragments._Price__OclAny.initOperations(_Price__OclAny);
			Fragments._Price__OclElement.initOperations(_Price__OclElement);
			Fragments._Price__Price.initOperations(_Price__Price);

			Fragments._Store__NamedElement.initOperations(_Store__NamedElement);
			Fragments._Store__OclAny.initOperations(_Store__OclAny);
			Fragments._Store__OclElement.initOperations(_Store__OclElement);
			Fragments._Store__Store.initOperations(_Store__Store);

			Fragments._Tax__OclAny.initOperations(_Tax__OclAny);
			Fragments._Tax__OclElement.initOperations(_Tax__OclElement);
			Fragments._Tax__Tax.initOperations(_Tax__Tax);

			Fragments._TaxType__OclAny.initOperations(_TaxType__OclAny);
			Fragments._TaxType__OclElement.initOperations(_TaxType__OclElement);
			Fragments._TaxType__OclEnumeration.initOperations(_TaxType__OclEnumeration);
			Fragments._TaxType__OclType.initOperations(_TaxType__OclType);
			Fragments._TaxType__TaxType.initOperations(_TaxType__TaxType);

			Fragments._Transaction__OclAny.initOperations(_Transaction__OclAny);
			Fragments._Transaction__OclElement.initOperations(_Transaction__OclElement);
			Fragments._Transaction__Transaction.initOperations(_Transaction__Transaction);

			Fragments._TransactionType__OclAny.initOperations(_TransactionType__OclAny);
			Fragments._TransactionType__OclElement.initOperations(_TransactionType__OclElement);
			Fragments._TransactionType__OclEnumeration.initOperations(_TransactionType__OclEnumeration);
			Fragments._TransactionType__OclType.initOperations(_TransactionType__OclType);
			Fragments._TransactionType__TransactionType.initOperations(_TransactionType__TransactionType);

			Fragments._UoM__OclAny.initOperations(_UoM__OclAny);
			Fragments._UoM__OclElement.initOperations(_UoM__OclElement);
			Fragments._UoM__OclEnumeration.initOperations(_UoM__OclEnumeration);
			Fragments._UoM__OclType.initOperations(_UoM__OclType);
			Fragments._UoM__UoM.initOperations(_UoM__UoM);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AdditionalCharge = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._AdditionalCharge__serviceCharge
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Address = {
			Assignment2Tables.Properties._Address__city,
			Assignment2Tables.Properties._Address__country,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Address__street,
			Assignment2Tables.Properties._Address__telephone
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Card = {
			Assignment2Tables.Properties._Card__cardHolder,
			Assignment2Tables.Properties._Card__cardNumber,
			Assignment2Tables.Properties._Card__expiryDate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Cashier = {
			Assignment2Tables.Properties._Person__cashier,
			Assignment2Tables.Properties._Person__customer,
			Assignment2Tables.Properties._Cashier__employeeId,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Person__surName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Company = {
			Assignment2Tables.Properties._Company__address,
			Assignment2Tables.Properties._Company__codice,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Company__store,
			Assignment2Tables.Properties._Company__transaction
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Customer = {
			Assignment2Tables.Properties._Customer__card,
			Assignment2Tables.Properties._Person__cashier,
			Assignment2Tables.Properties._Person__customer,
			Assignment2Tables.Properties._Customer__identityNumber,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Customer__phoneNumber,
			Assignment2Tables.Properties._Person__surName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Discount = {
			Assignment2Tables.Properties._Discount__amount,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Discount__percentage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			Assignment2Tables.Properties._Item__availableNumber,
			Assignment2Tables.Properties._Item__batch,
			Assignment2Tables.Properties._Item__code,
			Assignment2Tables.Properties._Item__description,
			Assignment2Tables.Properties._Item__isActive,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Item__store,
			Assignment2Tables.Properties._Item__unitPrice,
			Assignment2Tables.Properties._Item__uom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LineItem = {
			Assignment2Tables.Properties._LineItem__additionalCharge,
			Assignment2Tables.Properties._LineItem__code,
			Assignment2Tables.Properties._LineItem__discount,
			Assignment2Tables.Properties._LineItem__item,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._LineItem__quantity,
			Assignment2Tables.Properties._LineItem__subTotal,
			Assignment2Tables.Properties._LineItem__tax
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Person = {
			Assignment2Tables.Properties._Person__cashier,
			Assignment2Tables.Properties._Person__customer,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Person__surName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Price = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Price__sellingPrice
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Store = {
			Assignment2Tables.Properties._Store__company,
			Assignment2Tables.Properties._Store__item,
			Assignment2Tables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tax = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Tax__taxAmount,
			Assignment2Tables.Properties._Tax__taxType,
			Assignment2Tables.Properties._Tax__taxableAmount
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TaxType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Transaction = {
			Assignment2Tables.Properties._Transaction__card,
			Assignment2Tables.Properties._Transaction__cashier,
			Assignment2Tables.Properties._Transaction__customer,
			Assignment2Tables.Properties._Transaction__grandTotal,
			Assignment2Tables.Properties._Transaction__issuedDate,
			Assignment2Tables.Properties._Transaction__lineItem,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Transaction__paymentMethod,
			Assignment2Tables.Properties._Transaction__totalItemsPurchased,
			Assignment2Tables.Properties._Transaction__transactionNumber,
			Assignment2Tables.Properties._Transaction__transactionType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransactionType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UoM = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AdditionalCharge__AdditionalCharge.initProperties(_AdditionalCharge);
			Fragments._Address__Address.initProperties(_Address);
			Fragments._Card__Card.initProperties(_Card);
			Fragments._Cashier__Cashier.initProperties(_Cashier);
			Fragments._Company__Company.initProperties(_Company);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._Discount__Discount.initProperties(_Discount);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._LineItem__LineItem.initProperties(_LineItem);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._PaymentMethod__PaymentMethod.initProperties(_PaymentMethod);
			Fragments._Person__Person.initProperties(_Person);
			Fragments._Price__Price.initProperties(_Price);
			Fragments._Store__Store.initProperties(_Store);
			Fragments._Tax__Tax.initProperties(_Tax);
			Fragments._TaxType__TaxType.initProperties(_TaxType);
			Fragments._Transaction__Transaction.initProperties(_Transaction);
			Fragments._TransactionType__TransactionType.initProperties(_TransactionType);
			Fragments._UoM__UoM.initProperties(_UoM);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__Cash = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.PAYMENT_METHOD.getEEnumLiteral("Cash"), Types._PaymentMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__Card = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.PAYMENT_METHOD.getEEnumLiteral("Card"), Types._PaymentMethod, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentMethod = {
			_PaymentMethod__Cash,
			_PaymentMethod__Card
		};

		public static final EcoreExecutorEnumerationLiteral _TaxType__TaxExempt = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TAX_TYPE.getEEnumLiteral("TaxExempt"), Types._TaxType, 0);
		public static final EcoreExecutorEnumerationLiteral _TaxType__IncomeTax = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TAX_TYPE.getEEnumLiteral("IncomeTax"), Types._TaxType, 1);
		public static final EcoreExecutorEnumerationLiteral _TaxType__CorporateTax = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TAX_TYPE.getEEnumLiteral("CorporateTax"), Types._TaxType, 2);
		public static final EcoreExecutorEnumerationLiteral _TaxType__VAT = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TAX_TYPE.getEEnumLiteral("VAT"), Types._TaxType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TaxType = {
			_TaxType__TaxExempt,
			_TaxType__IncomeTax,
			_TaxType__CorporateTax,
			_TaxType__VAT
		};

		public static final EcoreExecutorEnumerationLiteral _TransactionType__CashSales = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TRANSACTION_TYPE.getEEnumLiteral("CashSales"), Types._TransactionType, 0);
		public static final EcoreExecutorEnumerationLiteral _TransactionType__CreditSales = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TRANSACTION_TYPE.getEEnumLiteral("CreditSales"), Types._TransactionType, 1);
		public static final EcoreExecutorEnumerationLiteral _TransactionType__AdvancePaymentSales = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.TRANSACTION_TYPE.getEEnumLiteral("AdvancePaymentSales"), Types._TransactionType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TransactionType = {
			_TransactionType__CashSales,
			_TransactionType__CreditSales,
			_TransactionType__AdvancePaymentSales
		};

		public static final EcoreExecutorEnumerationLiteral _UoM__PCS = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.UO_M.getEEnumLiteral("PCS"), Types._UoM, 0);
		public static final EcoreExecutorEnumerationLiteral _UoM__KG = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.UO_M.getEEnumLiteral("KG"), Types._UoM, 1);
		public static final EcoreExecutorEnumerationLiteral _UoM__LTR = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.UO_M.getEEnumLiteral("LTR"), Types._UoM, 2);
		public static final EcoreExecutorEnumerationLiteral _UoM__M = new EcoreExecutorEnumerationLiteral(Assignment2Package.Literals.UO_M.getEEnumLiteral("M"), Types._UoM, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _UoM = {
			_UoM__PCS,
			_UoM__KG,
			_UoM__LTR,
			_UoM__M
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._PaymentMethod.initLiterals(_PaymentMethod);
			Types._TaxType.initLiterals(_TaxType);
			Types._TransactionType.initLiterals(_TransactionType);
			Types._UoM.initLiterals(_UoM);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Assignment2Tables();
	}

	private Assignment2Tables() {
		super(Assignment2Package.eNS_URI);
	}
}
