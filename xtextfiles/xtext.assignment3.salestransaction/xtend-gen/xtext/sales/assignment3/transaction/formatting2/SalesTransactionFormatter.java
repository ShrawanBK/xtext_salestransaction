/**
 * generated by Xtext 2.25.0
 */
package xtext.sales.assignment3.transaction.formatting2;

import assignment2.Address;
import assignment2.Company;
import assignment2.Item;
import assignment2.Store;
import assignment2.Transaction;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import xtext.sales.assignment3.transaction.services.SalesTransactionGrammarAccess;

@SuppressWarnings("all")
public class SalesTransactionFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private SalesTransactionGrammarAccess _salesTransactionGrammarAccess;
  
  protected void _format(final Company company, @Extension final IFormattableDocument document) {
    document.<Address>format(company.getAddress());
    EList<Store> _store = company.getStore();
    for (final Store store : _store) {
      document.<Store>format(store);
    }
    EList<Transaction> _transaction = company.getTransaction();
    for (final Transaction transaction : _transaction) {
      document.<Transaction>format(transaction);
    }
  }
  
  protected void _format(final Store store, @Extension final IFormattableDocument document) {
    EList<Item> _item = store.getItem();
    for (final Item item : _item) {
      document.<Item>format(item);
    }
  }
  
  public void format(final Object company, final IFormattableDocument document) {
    if (company instanceof XtextResource) {
      _format((XtextResource)company, document);
      return;
    } else if (company instanceof Company) {
      _format((Company)company, document);
      return;
    } else if (company instanceof Store) {
      _format((Store)company, document);
      return;
    } else if (company instanceof EObject) {
      _format((EObject)company, document);
      return;
    } else if (company == null) {
      _format((Void)null, document);
      return;
    } else if (company != null) {
      _format(company, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(company, document).toString());
    }
  }
}
