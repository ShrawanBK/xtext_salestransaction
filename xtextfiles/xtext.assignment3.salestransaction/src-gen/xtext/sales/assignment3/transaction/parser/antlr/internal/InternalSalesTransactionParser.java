package xtext.sales.assignment3.transaction.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.sales.assignment3.transaction.services.SalesTransactionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalesTransactionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'company'", "'{'", "'codice'", "'stores'", "','", "'}'", "'transactions'", "'address'", "'street'", "'city'", "'country'", "'telephone'", "'store'", "'items'", "'transaction'", "'transactionNumber'", "'issuedDate'", "'transactionType'", "'paymentMethod'", "'lineItems'", "'item'", "'code'", "'batch'", "'description'", "'uom'", "'availableNumber'", "'isActive'", "'unitPrice'", "'-'", "'.'", "'E'", "'e'", "'price'", "'sellingPrice'", "'true'", "'false'", "'EDate'", "'customer'", "'surName'", "'identityNumber'", "'phoneNumber'", "'cashier'", "'employeeId'", "'lineItem'", "'quantity'", "'tax'", "'discount'", "'additionalCharge'", "'card'", "'cardNumber'", "'expiryDate'", "'cardHolder'", "'taxType'", "'taxableAmount'", "'taxAmount'", "'percentage'", "'amount'", "'serviceCharge'", "'PCS'", "'KG'", "'LTR'", "'M'", "'CashSales'", "'CreditSales'", "'AdvancePaymentSales'", "'Cash'", "'Card'", "'TaxExempt'", "'IncomeTax'", "'CorporateTax'", "'VAT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSalesTransactionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSalesTransactionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSalesTransactionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSalesTransaction.g"; }



     	private SalesTransactionGrammarAccess grammarAccess;

        public InternalSalesTransactionParser(TokenStream input, SalesTransactionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected SalesTransactionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalSalesTransaction.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalSalesTransaction.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalSalesTransaction.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalSalesTransaction.g:72:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'company' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )? ( (lv_address_5_0= ruleAddress ) )? otherlv_6= 'stores' otherlv_7= '{' ( (lv_store_8_0= ruleStore ) ) (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )* otherlv_11= '}' (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_codice_4_0 = null;

        EObject lv_address_5_0 = null;

        EObject lv_store_8_0 = null;

        EObject lv_store_10_0 = null;

        EObject lv_transaction_14_0 = null;

        EObject lv_transaction_16_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:78:2: ( (otherlv_0= 'company' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )? ( (lv_address_5_0= ruleAddress ) )? otherlv_6= 'stores' otherlv_7= '{' ( (lv_store_8_0= ruleStore ) ) (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )* otherlv_11= '}' (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSalesTransaction.g:79:2: (otherlv_0= 'company' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )? ( (lv_address_5_0= ruleAddress ) )? otherlv_6= 'stores' otherlv_7= '{' ( (lv_store_8_0= ruleStore ) ) (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )* otherlv_11= '}' (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSalesTransaction.g:79:2: (otherlv_0= 'company' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )? ( (lv_address_5_0= ruleAddress ) )? otherlv_6= 'stores' otherlv_7= '{' ( (lv_store_8_0= ruleStore ) ) (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )* otherlv_11= '}' (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSalesTransaction.g:80:3: otherlv_0= 'company' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )? ( (lv_address_5_0= ruleAddress ) )? otherlv_6= 'stores' otherlv_7= '{' ( (lv_store_8_0= ruleStore ) ) (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )* otherlv_11= '}' (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalSalesTransaction.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSalesTransaction.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalSalesTransaction.g:85:4: (lv_name_1_0= ruleEString )
            // InternalSalesTransaction.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSalesTransaction.g:107:3: (otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSalesTransaction.g:108:4: otherlv_3= 'codice' ( (lv_codice_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getCodiceKeyword_3_0());
                    			
                    // InternalSalesTransaction.g:112:4: ( (lv_codice_4_0= ruleEString ) )
                    // InternalSalesTransaction.g:113:5: (lv_codice_4_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:113:5: (lv_codice_4_0= ruleEString )
                    // InternalSalesTransaction.g:114:6: lv_codice_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getCodiceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_codice_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						set(
                    							current,
                    							"codice",
                    							lv_codice_4_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:132:3: ( (lv_address_5_0= ruleAddress ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSalesTransaction.g:133:4: (lv_address_5_0= ruleAddress )
                    {
                    // InternalSalesTransaction.g:133:4: (lv_address_5_0= ruleAddress )
                    // InternalSalesTransaction.g:134:5: lv_address_5_0= ruleAddress
                    {

                    					newCompositeNode(grammarAccess.getCompanyAccess().getAddressAddressParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_address_5_0=ruleAddress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompanyRule());
                    					}
                    					set(
                    						current,
                    						"address",
                    						lv_address_5_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Address");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCompanyAccess().getStoresKeyword_5());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSalesTransaction.g:159:3: ( (lv_store_8_0= ruleStore ) )
            // InternalSalesTransaction.g:160:4: (lv_store_8_0= ruleStore )
            {
            // InternalSalesTransaction.g:160:4: (lv_store_8_0= ruleStore )
            // InternalSalesTransaction.g:161:5: lv_store_8_0= ruleStore
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_store_8_0=ruleStore();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					add(
            						current,
            						"store",
            						lv_store_8_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.Store");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSalesTransaction.g:178:3: (otherlv_9= ',' ( (lv_store_10_0= ruleStore ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSalesTransaction.g:179:4: otherlv_9= ',' ( (lv_store_10_0= ruleStore ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCompanyAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSalesTransaction.g:183:4: ( (lv_store_10_0= ruleStore ) )
            	    // InternalSalesTransaction.g:184:5: (lv_store_10_0= ruleStore )
            	    {
            	    // InternalSalesTransaction.g:184:5: (lv_store_10_0= ruleStore )
            	    // InternalSalesTransaction.g:185:6: lv_store_10_0= ruleStore
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_store_10_0=ruleStore();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"store",
            	    							lv_store_10_0,
            	    							"xtext.sales.assignment3.transaction.SalesTransaction.Store");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalSalesTransaction.g:207:3: (otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSalesTransaction.g:208:4: otherlv_12= 'transactions' otherlv_13= '{' ( (lv_transaction_14_0= ruleTransaction ) ) (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCompanyAccess().getTransactionsKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSalesTransaction.g:216:4: ( (lv_transaction_14_0= ruleTransaction ) )
                    // InternalSalesTransaction.g:217:5: (lv_transaction_14_0= ruleTransaction )
                    {
                    // InternalSalesTransaction.g:217:5: (lv_transaction_14_0= ruleTransaction )
                    // InternalSalesTransaction.g:218:6: lv_transaction_14_0= ruleTransaction
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_transaction_14_0=ruleTransaction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						add(
                    							current,
                    							"transaction",
                    							lv_transaction_14_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.Transaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSalesTransaction.g:235:4: (otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSalesTransaction.g:236:5: otherlv_15= ',' ( (lv_transaction_16_0= ruleTransaction ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCompanyAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalSalesTransaction.g:240:5: ( (lv_transaction_16_0= ruleTransaction ) )
                    	    // InternalSalesTransaction.g:241:6: (lv_transaction_16_0= ruleTransaction )
                    	    {
                    	    // InternalSalesTransaction.g:241:6: (lv_transaction_16_0= ruleTransaction )
                    	    // InternalSalesTransaction.g:242:7: lv_transaction_16_0= ruleTransaction
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_transaction_16_0=ruleTransaction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompanyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transaction",
                    	    								lv_transaction_16_0,
                    	    								"xtext.sales.assignment3.transaction.SalesTransaction.Transaction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEString"
    // InternalSalesTransaction.g:273:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSalesTransaction.g:273:47: (iv_ruleEString= ruleEString EOF )
            // InternalSalesTransaction.g:274:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSalesTransaction.g:280:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:286:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSalesTransaction.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSalesTransaction.g:287:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSalesTransaction.g:288:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:296:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAddress"
    // InternalSalesTransaction.g:307:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalSalesTransaction.g:307:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalSalesTransaction.g:308:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalSalesTransaction.g:314:1: ruleAddress returns [EObject current=null] : ( () otherlv_1= 'address' otherlv_2= '{' (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )? (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )? (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )? (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_street_4_0 = null;

        AntlrDatatypeRuleToken lv_city_6_0 = null;

        AntlrDatatypeRuleToken lv_country_8_0 = null;

        AntlrDatatypeRuleToken lv_telephone_10_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:320:2: ( ( () otherlv_1= 'address' otherlv_2= '{' (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )? (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )? (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )? (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalSalesTransaction.g:321:2: ( () otherlv_1= 'address' otherlv_2= '{' (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )? (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )? (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )? (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalSalesTransaction.g:321:2: ( () otherlv_1= 'address' otherlv_2= '{' (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )? (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )? (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )? (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalSalesTransaction.g:322:3: () otherlv_1= 'address' otherlv_2= '{' (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )? (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )? (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )? (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalSalesTransaction.g:322:3: ()
            // InternalSalesTransaction.g:323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddressAccess().getAddressAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressAccess().getAddressKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSalesTransaction.g:337:3: (otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSalesTransaction.g:338:4: otherlv_3= 'street' ( (lv_street_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getStreetKeyword_3_0());
                    			
                    // InternalSalesTransaction.g:342:4: ( (lv_street_4_0= ruleEString ) )
                    // InternalSalesTransaction.g:343:5: (lv_street_4_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:343:5: (lv_street_4_0= ruleEString )
                    // InternalSalesTransaction.g:344:6: lv_street_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddressAccess().getStreetEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_street_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressRule());
                    						}
                    						set(
                    							current,
                    							"street",
                    							lv_street_4_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:362:3: (otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSalesTransaction.g:363:4: otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getCityKeyword_4_0());
                    			
                    // InternalSalesTransaction.g:367:4: ( (lv_city_6_0= ruleEString ) )
                    // InternalSalesTransaction.g:368:5: (lv_city_6_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:368:5: (lv_city_6_0= ruleEString )
                    // InternalSalesTransaction.g:369:6: lv_city_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddressAccess().getCityEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_city_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressRule());
                    						}
                    						set(
                    							current,
                    							"city",
                    							lv_city_6_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:387:3: (otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSalesTransaction.g:388:4: otherlv_7= 'country' ( (lv_country_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getCountryKeyword_5_0());
                    			
                    // InternalSalesTransaction.g:392:4: ( (lv_country_8_0= ruleEString ) )
                    // InternalSalesTransaction.g:393:5: (lv_country_8_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:393:5: (lv_country_8_0= ruleEString )
                    // InternalSalesTransaction.g:394:6: lv_country_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddressAccess().getCountryEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_country_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressRule());
                    						}
                    						set(
                    							current,
                    							"country",
                    							lv_country_8_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:412:3: (otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSalesTransaction.g:413:4: otherlv_9= 'telephone' ( (lv_telephone_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAddressAccess().getTelephoneKeyword_6_0());
                    			
                    // InternalSalesTransaction.g:417:4: ( (lv_telephone_10_0= ruleEString ) )
                    // InternalSalesTransaction.g:418:5: (lv_telephone_10_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:418:5: (lv_telephone_10_0= ruleEString )
                    // InternalSalesTransaction.g:419:6: lv_telephone_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddressAccess().getTelephoneEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_telephone_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddressRule());
                    						}
                    						set(
                    							current,
                    							"telephone",
                    							lv_telephone_10_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleStore"
    // InternalSalesTransaction.g:445:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalSalesTransaction.g:445:46: (iv_ruleStore= ruleStore EOF )
            // InternalSalesTransaction.g:446:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalSalesTransaction.g:452:1: ruleStore returns [EObject current=null] : ( () otherlv_1= 'store' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_item_6_0 = null;

        EObject lv_item_8_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:458:2: ( ( () otherlv_1= 'store' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSalesTransaction.g:459:2: ( () otherlv_1= 'store' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSalesTransaction.g:459:2: ( () otherlv_1= 'store' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSalesTransaction.g:460:3: () otherlv_1= 'store' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSalesTransaction.g:460:3: ()
            // InternalSalesTransaction.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoreAccess().getStoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getStoreKeyword_1());
            		
            // InternalSalesTransaction.g:471:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSalesTransaction.g:472:4: (lv_name_2_0= ruleEString )
            {
            // InternalSalesTransaction.g:472:4: (lv_name_2_0= ruleEString )
            // InternalSalesTransaction.g:473:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSalesTransaction.g:494:3: (otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSalesTransaction.g:495:4: otherlv_4= 'items' otherlv_5= '{' ( (lv_item_6_0= ruleItem ) ) (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getItemsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSalesTransaction.g:503:4: ( (lv_item_6_0= ruleItem ) )
                    // InternalSalesTransaction.g:504:5: (lv_item_6_0= ruleItem )
                    {
                    // InternalSalesTransaction.g:504:5: (lv_item_6_0= ruleItem )
                    // InternalSalesTransaction.g:505:6: lv_item_6_0= ruleItem
                    {

                    						newCompositeNode(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_item_6_0=ruleItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStoreRule());
                    						}
                    						add(
                    							current,
                    							"item",
                    							lv_item_6_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.Item");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSalesTransaction.g:522:4: (otherlv_7= ',' ( (lv_item_8_0= ruleItem ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSalesTransaction.g:523:5: otherlv_7= ',' ( (lv_item_8_0= ruleItem ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSalesTransaction.g:527:5: ( (lv_item_8_0= ruleItem ) )
                    	    // InternalSalesTransaction.g:528:6: (lv_item_8_0= ruleItem )
                    	    {
                    	    // InternalSalesTransaction.g:528:6: (lv_item_8_0= ruleItem )
                    	    // InternalSalesTransaction.g:529:7: lv_item_8_0= ruleItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_item_8_0=ruleItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStoreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"item",
                    	    								lv_item_8_0,
                    	    								"xtext.sales.assignment3.transaction.SalesTransaction.Item");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleTransaction"
    // InternalSalesTransaction.g:560:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalSalesTransaction.g:560:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalSalesTransaction.g:561:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalSalesTransaction.g:567:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'transaction' otherlv_1= '{' (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )? (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )? otherlv_6= 'transactionType' ( (lv_transactionType_7_0= ruleTransactionType ) ) otherlv_8= 'paymentMethod' ( (lv_paymentMethod_9_0= rulePaymentMethod ) ) ( (lv_customer_10_0= ruleCustomer ) )? ( (lv_cashier_11_0= ruleCashier ) )? otherlv_12= 'lineItems' otherlv_13= '{' ( (lv_lineItem_14_0= ruleLineItem ) ) (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )* otherlv_17= '}' ( (lv_card_18_0= ruleCard ) )? otherlv_19= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_transactionNumber_3_0 = null;

        AntlrDatatypeRuleToken lv_issuedDate_5_0 = null;

        Enumerator lv_transactionType_7_0 = null;

        Enumerator lv_paymentMethod_9_0 = null;

        EObject lv_customer_10_0 = null;

        EObject lv_cashier_11_0 = null;

        EObject lv_lineItem_14_0 = null;

        EObject lv_lineItem_16_0 = null;

        EObject lv_card_18_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:573:2: ( (otherlv_0= 'transaction' otherlv_1= '{' (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )? (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )? otherlv_6= 'transactionType' ( (lv_transactionType_7_0= ruleTransactionType ) ) otherlv_8= 'paymentMethod' ( (lv_paymentMethod_9_0= rulePaymentMethod ) ) ( (lv_customer_10_0= ruleCustomer ) )? ( (lv_cashier_11_0= ruleCashier ) )? otherlv_12= 'lineItems' otherlv_13= '{' ( (lv_lineItem_14_0= ruleLineItem ) ) (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )* otherlv_17= '}' ( (lv_card_18_0= ruleCard ) )? otherlv_19= '}' ) )
            // InternalSalesTransaction.g:574:2: (otherlv_0= 'transaction' otherlv_1= '{' (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )? (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )? otherlv_6= 'transactionType' ( (lv_transactionType_7_0= ruleTransactionType ) ) otherlv_8= 'paymentMethod' ( (lv_paymentMethod_9_0= rulePaymentMethod ) ) ( (lv_customer_10_0= ruleCustomer ) )? ( (lv_cashier_11_0= ruleCashier ) )? otherlv_12= 'lineItems' otherlv_13= '{' ( (lv_lineItem_14_0= ruleLineItem ) ) (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )* otherlv_17= '}' ( (lv_card_18_0= ruleCard ) )? otherlv_19= '}' )
            {
            // InternalSalesTransaction.g:574:2: (otherlv_0= 'transaction' otherlv_1= '{' (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )? (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )? otherlv_6= 'transactionType' ( (lv_transactionType_7_0= ruleTransactionType ) ) otherlv_8= 'paymentMethod' ( (lv_paymentMethod_9_0= rulePaymentMethod ) ) ( (lv_customer_10_0= ruleCustomer ) )? ( (lv_cashier_11_0= ruleCashier ) )? otherlv_12= 'lineItems' otherlv_13= '{' ( (lv_lineItem_14_0= ruleLineItem ) ) (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )* otherlv_17= '}' ( (lv_card_18_0= ruleCard ) )? otherlv_19= '}' )
            // InternalSalesTransaction.g:575:3: otherlv_0= 'transaction' otherlv_1= '{' (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )? (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )? otherlv_6= 'transactionType' ( (lv_transactionType_7_0= ruleTransactionType ) ) otherlv_8= 'paymentMethod' ( (lv_paymentMethod_9_0= rulePaymentMethod ) ) ( (lv_customer_10_0= ruleCustomer ) )? ( (lv_cashier_11_0= ruleCashier ) )? otherlv_12= 'lineItems' otherlv_13= '{' ( (lv_lineItem_14_0= ruleLineItem ) ) (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )* otherlv_17= '}' ( (lv_card_18_0= ruleCard ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSalesTransaction.g:583:3: (otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSalesTransaction.g:584:4: otherlv_2= 'transactionNumber' ( (lv_transactionNumber_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getTransactionNumberKeyword_2_0());
                    			
                    // InternalSalesTransaction.g:588:4: ( (lv_transactionNumber_3_0= ruleEString ) )
                    // InternalSalesTransaction.g:589:5: (lv_transactionNumber_3_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:589:5: (lv_transactionNumber_3_0= ruleEString )
                    // InternalSalesTransaction.g:590:6: lv_transactionNumber_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransactionAccess().getTransactionNumberEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_transactionNumber_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransactionRule());
                    						}
                    						set(
                    							current,
                    							"transactionNumber",
                    							lv_transactionNumber_3_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:608:3: (otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSalesTransaction.g:609:4: otherlv_4= 'issuedDate' ( (lv_issuedDate_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransactionAccess().getIssuedDateKeyword_3_0());
                    			
                    // InternalSalesTransaction.g:613:4: ( (lv_issuedDate_5_0= ruleEDate ) )
                    // InternalSalesTransaction.g:614:5: (lv_issuedDate_5_0= ruleEDate )
                    {
                    // InternalSalesTransaction.g:614:5: (lv_issuedDate_5_0= ruleEDate )
                    // InternalSalesTransaction.g:615:6: lv_issuedDate_5_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getTransactionAccess().getIssuedDateEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_issuedDate_5_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransactionRule());
                    						}
                    						set(
                    							current,
                    							"issuedDate",
                    							lv_issuedDate_5_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getTransactionAccess().getTransactionTypeKeyword_4());
            		
            // InternalSalesTransaction.g:637:3: ( (lv_transactionType_7_0= ruleTransactionType ) )
            // InternalSalesTransaction.g:638:4: (lv_transactionType_7_0= ruleTransactionType )
            {
            // InternalSalesTransaction.g:638:4: (lv_transactionType_7_0= ruleTransactionType )
            // InternalSalesTransaction.g:639:5: lv_transactionType_7_0= ruleTransactionType
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getTransactionTypeTransactionTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_transactionType_7_0=ruleTransactionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					set(
            						current,
            						"transactionType",
            						lv_transactionType_7_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.TransactionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getTransactionAccess().getPaymentMethodKeyword_6());
            		
            // InternalSalesTransaction.g:660:3: ( (lv_paymentMethod_9_0= rulePaymentMethod ) )
            // InternalSalesTransaction.g:661:4: (lv_paymentMethod_9_0= rulePaymentMethod )
            {
            // InternalSalesTransaction.g:661:4: (lv_paymentMethod_9_0= rulePaymentMethod )
            // InternalSalesTransaction.g:662:5: lv_paymentMethod_9_0= rulePaymentMethod
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getPaymentMethodPaymentMethodEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_paymentMethod_9_0=rulePaymentMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					set(
            						current,
            						"paymentMethod",
            						lv_paymentMethod_9_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.PaymentMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSalesTransaction.g:679:3: ( (lv_customer_10_0= ruleCustomer ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSalesTransaction.g:680:4: (lv_customer_10_0= ruleCustomer )
                    {
                    // InternalSalesTransaction.g:680:4: (lv_customer_10_0= ruleCustomer )
                    // InternalSalesTransaction.g:681:5: lv_customer_10_0= ruleCustomer
                    {

                    					newCompositeNode(grammarAccess.getTransactionAccess().getCustomerCustomerParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_customer_10_0=ruleCustomer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransactionRule());
                    					}
                    					set(
                    						current,
                    						"customer",
                    						lv_customer_10_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Customer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:698:3: ( (lv_cashier_11_0= ruleCashier ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSalesTransaction.g:699:4: (lv_cashier_11_0= ruleCashier )
                    {
                    // InternalSalesTransaction.g:699:4: (lv_cashier_11_0= ruleCashier )
                    // InternalSalesTransaction.g:700:5: lv_cashier_11_0= ruleCashier
                    {

                    					newCompositeNode(grammarAccess.getTransactionAccess().getCashierCashierParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_cashier_11_0=ruleCashier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransactionRule());
                    					}
                    					set(
                    						current,
                    						"cashier",
                    						lv_cashier_11_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Cashier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getTransactionAccess().getLineItemsKeyword_10());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_13, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalSalesTransaction.g:725:3: ( (lv_lineItem_14_0= ruleLineItem ) )
            // InternalSalesTransaction.g:726:4: (lv_lineItem_14_0= ruleLineItem )
            {
            // InternalSalesTransaction.g:726:4: (lv_lineItem_14_0= ruleLineItem )
            // InternalSalesTransaction.g:727:5: lv_lineItem_14_0= ruleLineItem
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_lineItem_14_0=ruleLineItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					add(
            						current,
            						"lineItem",
            						lv_lineItem_14_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.LineItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSalesTransaction.g:744:3: (otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSalesTransaction.g:745:4: otherlv_15= ',' ( (lv_lineItem_16_0= ruleLineItem ) )
            	    {
            	    otherlv_15=(Token)match(input,15,FOLLOW_29); 

            	    				newLeafNode(otherlv_15, grammarAccess.getTransactionAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalSalesTransaction.g:749:4: ( (lv_lineItem_16_0= ruleLineItem ) )
            	    // InternalSalesTransaction.g:750:5: (lv_lineItem_16_0= ruleLineItem )
            	    {
            	    // InternalSalesTransaction.g:750:5: (lv_lineItem_16_0= ruleLineItem )
            	    // InternalSalesTransaction.g:751:6: lv_lineItem_16_0= ruleLineItem
            	    {

            	    						newCompositeNode(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_lineItem_16_0=ruleLineItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransactionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lineItem",
            	    							lv_lineItem_16_0,
            	    							"xtext.sales.assignment3.transaction.SalesTransaction.LineItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_17=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_17, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalSalesTransaction.g:773:3: ( (lv_card_18_0= ruleCard ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSalesTransaction.g:774:4: (lv_card_18_0= ruleCard )
                    {
                    // InternalSalesTransaction.g:774:4: (lv_card_18_0= ruleCard )
                    // InternalSalesTransaction.g:775:5: lv_card_18_0= ruleCard
                    {

                    					newCompositeNode(grammarAccess.getTransactionAccess().getCardCardParserRuleCall_15_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_card_18_0=ruleCard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransactionRule());
                    					}
                    					set(
                    						current,
                    						"card",
                    						lv_card_18_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Card");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleItem"
    // InternalSalesTransaction.g:800:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalSalesTransaction.g:800:45: (iv_ruleItem= ruleItem EOF )
            // InternalSalesTransaction.g:801:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalSalesTransaction.g:807:1: ruleItem returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )? (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'uom' ( (lv_uom_10_0= ruleUoM ) ) otherlv_11= 'availableNumber' ( (lv_availableNumber_12_0= ruleEDouble ) ) otherlv_13= 'isActive' ( (lv_isActive_14_0= ruleEBoolean ) ) otherlv_15= 'unitPrice' ( (lv_unitPrice_16_0= rulePrice ) ) otherlv_17= '}' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_code_4_0 = null;

        AntlrDatatypeRuleToken lv_batch_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        Enumerator lv_uom_10_0 = null;

        AntlrDatatypeRuleToken lv_availableNumber_12_0 = null;

        AntlrDatatypeRuleToken lv_isActive_14_0 = null;

        EObject lv_unitPrice_16_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:813:2: ( (otherlv_0= 'item' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )? (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'uom' ( (lv_uom_10_0= ruleUoM ) ) otherlv_11= 'availableNumber' ( (lv_availableNumber_12_0= ruleEDouble ) ) otherlv_13= 'isActive' ( (lv_isActive_14_0= ruleEBoolean ) ) otherlv_15= 'unitPrice' ( (lv_unitPrice_16_0= rulePrice ) ) otherlv_17= '}' ) )
            // InternalSalesTransaction.g:814:2: (otherlv_0= 'item' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )? (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'uom' ( (lv_uom_10_0= ruleUoM ) ) otherlv_11= 'availableNumber' ( (lv_availableNumber_12_0= ruleEDouble ) ) otherlv_13= 'isActive' ( (lv_isActive_14_0= ruleEBoolean ) ) otherlv_15= 'unitPrice' ( (lv_unitPrice_16_0= rulePrice ) ) otherlv_17= '}' )
            {
            // InternalSalesTransaction.g:814:2: (otherlv_0= 'item' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )? (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'uom' ( (lv_uom_10_0= ruleUoM ) ) otherlv_11= 'availableNumber' ( (lv_availableNumber_12_0= ruleEDouble ) ) otherlv_13= 'isActive' ( (lv_isActive_14_0= ruleEBoolean ) ) otherlv_15= 'unitPrice' ( (lv_unitPrice_16_0= rulePrice ) ) otherlv_17= '}' )
            // InternalSalesTransaction.g:815:3: otherlv_0= 'item' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )? (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'uom' ( (lv_uom_10_0= ruleUoM ) ) otherlv_11= 'availableNumber' ( (lv_availableNumber_12_0= ruleEDouble ) ) otherlv_13= 'isActive' ( (lv_isActive_14_0= ruleEBoolean ) ) otherlv_15= 'unitPrice' ( (lv_unitPrice_16_0= rulePrice ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAccess().getItemKeyword_0());
            		
            // InternalSalesTransaction.g:819:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSalesTransaction.g:820:4: (lv_name_1_0= ruleEString )
            {
            // InternalSalesTransaction.g:820:4: (lv_name_1_0= ruleEString )
            // InternalSalesTransaction.g:821:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSalesTransaction.g:842:3: (otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSalesTransaction.g:843:4: otherlv_3= 'code' ( (lv_code_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getItemAccess().getCodeKeyword_3_0());
                    			
                    // InternalSalesTransaction.g:847:4: ( (lv_code_4_0= ruleEString ) )
                    // InternalSalesTransaction.g:848:5: (lv_code_4_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:848:5: (lv_code_4_0= ruleEString )
                    // InternalSalesTransaction.g:849:6: lv_code_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemAccess().getCodeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_code_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemRule());
                    						}
                    						set(
                    							current,
                    							"code",
                    							lv_code_4_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:867:3: (otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSalesTransaction.g:868:4: otherlv_5= 'batch' ( (lv_batch_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getItemAccess().getBatchKeyword_4_0());
                    			
                    // InternalSalesTransaction.g:872:4: ( (lv_batch_6_0= ruleEString ) )
                    // InternalSalesTransaction.g:873:5: (lv_batch_6_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:873:5: (lv_batch_6_0= ruleEString )
                    // InternalSalesTransaction.g:874:6: lv_batch_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemAccess().getBatchEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_batch_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemRule());
                    						}
                    						set(
                    							current,
                    							"batch",
                    							lv_batch_6_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:892:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSalesTransaction.g:893:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getItemAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalSalesTransaction.g:897:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalSalesTransaction.g:898:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:898:5: (lv_description_8_0= ruleEString )
                    // InternalSalesTransaction.g:899:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getItemAccess().getUomKeyword_6());
            		
            // InternalSalesTransaction.g:921:3: ( (lv_uom_10_0= ruleUoM ) )
            // InternalSalesTransaction.g:922:4: (lv_uom_10_0= ruleUoM )
            {
            // InternalSalesTransaction.g:922:4: (lv_uom_10_0= ruleUoM )
            // InternalSalesTransaction.g:923:5: lv_uom_10_0= ruleUoM
            {

            					newCompositeNode(grammarAccess.getItemAccess().getUomUoMEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_36);
            lv_uom_10_0=ruleUoM();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"uom",
            						lv_uom_10_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.UoM");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getItemAccess().getAvailableNumberKeyword_8());
            		
            // InternalSalesTransaction.g:944:3: ( (lv_availableNumber_12_0= ruleEDouble ) )
            // InternalSalesTransaction.g:945:4: (lv_availableNumber_12_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:945:4: (lv_availableNumber_12_0= ruleEDouble )
            // InternalSalesTransaction.g:946:5: lv_availableNumber_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getItemAccess().getAvailableNumberEDoubleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_38);
            lv_availableNumber_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"availableNumber",
            						lv_availableNumber_12_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_39); 

            			newLeafNode(otherlv_13, grammarAccess.getItemAccess().getIsActiveKeyword_10());
            		
            // InternalSalesTransaction.g:967:3: ( (lv_isActive_14_0= ruleEBoolean ) )
            // InternalSalesTransaction.g:968:4: (lv_isActive_14_0= ruleEBoolean )
            {
            // InternalSalesTransaction.g:968:4: (lv_isActive_14_0= ruleEBoolean )
            // InternalSalesTransaction.g:969:5: lv_isActive_14_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getItemAccess().getIsActiveEBooleanParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_40);
            lv_isActive_14_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"isActive",
            						lv_isActive_14_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,38,FOLLOW_41); 

            			newLeafNode(otherlv_15, grammarAccess.getItemAccess().getUnitPriceKeyword_12());
            		
            // InternalSalesTransaction.g:990:3: ( (lv_unitPrice_16_0= rulePrice ) )
            // InternalSalesTransaction.g:991:4: (lv_unitPrice_16_0= rulePrice )
            {
            // InternalSalesTransaction.g:991:4: (lv_unitPrice_16_0= rulePrice )
            // InternalSalesTransaction.g:992:5: lv_unitPrice_16_0= rulePrice
            {

            					newCompositeNode(grammarAccess.getItemAccess().getUnitPricePriceParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_unitPrice_16_0=rulePrice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"unitPrice",
            						lv_unitPrice_16_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.Price");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getItemAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleEDouble"
    // InternalSalesTransaction.g:1017:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSalesTransaction.g:1017:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSalesTransaction.g:1018:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSalesTransaction.g:1024:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:1030:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSalesTransaction.g:1031:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSalesTransaction.g:1031:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSalesTransaction.g:1032:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSalesTransaction.g:1032:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSalesTransaction.g:1033:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSalesTransaction.g:1039:3: (this_INT_1= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSalesTransaction.g:1040:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_43); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,40,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_45); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSalesTransaction.g:1060:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSalesTransaction.g:1061:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSalesTransaction.g:1061:4: (kw= 'E' | kw= 'e' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==41) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==42) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSalesTransaction.g:1062:5: kw= 'E'
                            {
                            kw=(Token)match(input,41,FOLLOW_46); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSalesTransaction.g:1068:5: kw= 'e'
                            {
                            kw=(Token)match(input,42,FOLLOW_46); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSalesTransaction.g:1074:4: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==39) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSalesTransaction.g:1075:5: kw= '-'
                            {
                            kw=(Token)match(input,39,FOLLOW_44); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePrice"
    // InternalSalesTransaction.g:1093:1: entryRulePrice returns [EObject current=null] : iv_rulePrice= rulePrice EOF ;
    public final EObject entryRulePrice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrice = null;


        try {
            // InternalSalesTransaction.g:1093:46: (iv_rulePrice= rulePrice EOF )
            // InternalSalesTransaction.g:1094:2: iv_rulePrice= rulePrice EOF
            {
             newCompositeNode(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrice=rulePrice();

            state._fsp--;

             current =iv_rulePrice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrice"


    // $ANTLR start "rulePrice"
    // InternalSalesTransaction.g:1100:1: rulePrice returns [EObject current=null] : (otherlv_0= 'price' otherlv_1= '{' otherlv_2= 'sellingPrice' ( (lv_sellingPrice_3_0= ruleEDouble ) ) otherlv_4= '}' ) ;
    public final EObject rulePrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sellingPrice_3_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1106:2: ( (otherlv_0= 'price' otherlv_1= '{' otherlv_2= 'sellingPrice' ( (lv_sellingPrice_3_0= ruleEDouble ) ) otherlv_4= '}' ) )
            // InternalSalesTransaction.g:1107:2: (otherlv_0= 'price' otherlv_1= '{' otherlv_2= 'sellingPrice' ( (lv_sellingPrice_3_0= ruleEDouble ) ) otherlv_4= '}' )
            {
            // InternalSalesTransaction.g:1107:2: (otherlv_0= 'price' otherlv_1= '{' otherlv_2= 'sellingPrice' ( (lv_sellingPrice_3_0= ruleEDouble ) ) otherlv_4= '}' )
            // InternalSalesTransaction.g:1108:3: otherlv_0= 'price' otherlv_1= '{' otherlv_2= 'sellingPrice' ( (lv_sellingPrice_3_0= ruleEDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPriceAccess().getPriceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getPriceAccess().getSellingPriceKeyword_2());
            		
            // InternalSalesTransaction.g:1120:3: ( (lv_sellingPrice_3_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1121:4: (lv_sellingPrice_3_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1121:4: (lv_sellingPrice_3_0= ruleEDouble )
            // InternalSalesTransaction.g:1122:5: lv_sellingPrice_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPriceAccess().getSellingPriceEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_sellingPrice_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPriceRule());
            					}
            					set(
            						current,
            						"sellingPrice",
            						lv_sellingPrice_3_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrice"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSalesTransaction.g:1147:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSalesTransaction.g:1147:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSalesTransaction.g:1148:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSalesTransaction.g:1154:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:1160:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSalesTransaction.g:1161:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSalesTransaction.g:1161:2: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSalesTransaction.g:1162:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:1168:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDate"
    // InternalSalesTransaction.g:1177:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalSalesTransaction.g:1177:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalSalesTransaction.g:1178:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalSalesTransaction.g:1184:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:1190:2: (kw= 'EDate' )
            // InternalSalesTransaction.g:1191:2: kw= 'EDate'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleCustomer"
    // InternalSalesTransaction.g:1199:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalSalesTransaction.g:1199:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalSalesTransaction.g:1200:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalSalesTransaction.g:1206:1: ruleCustomer returns [EObject current=null] : ( () otherlv_1= 'customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )? ( ( ruleEString ) )? ( (lv_customer_11_0= ruleCustomer ) )? ( (lv_cashier_12_0= ruleCashier ) )? otherlv_13= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_surName_5_0 = null;

        AntlrDatatypeRuleToken lv_identityNumber_7_0 = null;

        AntlrDatatypeRuleToken lv_phoneNumber_9_0 = null;

        EObject lv_customer_11_0 = null;

        EObject lv_cashier_12_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1212:2: ( ( () otherlv_1= 'customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )? ( ( ruleEString ) )? ( (lv_customer_11_0= ruleCustomer ) )? ( (lv_cashier_12_0= ruleCashier ) )? otherlv_13= '}' ) )
            // InternalSalesTransaction.g:1213:2: ( () otherlv_1= 'customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )? ( ( ruleEString ) )? ( (lv_customer_11_0= ruleCustomer ) )? ( (lv_cashier_12_0= ruleCashier ) )? otherlv_13= '}' )
            {
            // InternalSalesTransaction.g:1213:2: ( () otherlv_1= 'customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )? ( ( ruleEString ) )? ( (lv_customer_11_0= ruleCustomer ) )? ( (lv_cashier_12_0= ruleCashier ) )? otherlv_13= '}' )
            // InternalSalesTransaction.g:1214:3: () otherlv_1= 'customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )? (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )? ( ( ruleEString ) )? ( (lv_customer_11_0= ruleCustomer ) )? ( (lv_cashier_12_0= ruleCashier ) )? otherlv_13= '}'
            {
            // InternalSalesTransaction.g:1214:3: ()
            // InternalSalesTransaction.g:1215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomerAccess().getCustomerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomerAccess().getCustomerKeyword_1());
            		
            // InternalSalesTransaction.g:1225:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSalesTransaction.g:1226:4: (lv_name_2_0= ruleEString )
            {
            // InternalSalesTransaction.g:1226:4: (lv_name_2_0= ruleEString )
            // InternalSalesTransaction.g:1227:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSalesTransaction.g:1248:3: (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSalesTransaction.g:1249:4: otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getSurNameKeyword_4_0());
                    			
                    // InternalSalesTransaction.g:1253:4: ( (lv_surName_5_0= ruleEString ) )
                    // InternalSalesTransaction.g:1254:5: (lv_surName_5_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1254:5: (lv_surName_5_0= ruleEString )
                    // InternalSalesTransaction.g:1255:6: lv_surName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getSurNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_surName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"surName",
                    							lv_surName_5_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1273:3: (otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSalesTransaction.g:1274:4: otherlv_6= 'identityNumber' ( (lv_identityNumber_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getIdentityNumberKeyword_5_0());
                    			
                    // InternalSalesTransaction.g:1278:4: ( (lv_identityNumber_7_0= ruleEString ) )
                    // InternalSalesTransaction.g:1279:5: (lv_identityNumber_7_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1279:5: (lv_identityNumber_7_0= ruleEString )
                    // InternalSalesTransaction.g:1280:6: lv_identityNumber_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getIdentityNumberEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_identityNumber_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"identityNumber",
                    							lv_identityNumber_7_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1298:3: (otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSalesTransaction.g:1299:4: otherlv_8= 'phoneNumber' ( (lv_phoneNumber_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustomerAccess().getPhoneNumberKeyword_6_0());
                    			
                    // InternalSalesTransaction.g:1303:4: ( (lv_phoneNumber_9_0= ruleEString ) )
                    // InternalSalesTransaction.g:1304:5: (lv_phoneNumber_9_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1304:5: (lv_phoneNumber_9_0= ruleEString )
                    // InternalSalesTransaction.g:1305:6: lv_phoneNumber_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getPhoneNumberEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_phoneNumber_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_9_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1323:3: ( ( ruleEString ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSalesTransaction.g:1324:4: ( ruleEString )
                    {
                    // InternalSalesTransaction.g:1324:4: ( ruleEString )
                    // InternalSalesTransaction.g:1325:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCustomerRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getCustomerAccess().getCardCardCrossReference_7_0());
                    				
                    pushFollow(FOLLOW_52);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1339:3: ( (lv_customer_11_0= ruleCustomer ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSalesTransaction.g:1340:4: (lv_customer_11_0= ruleCustomer )
                    {
                    // InternalSalesTransaction.g:1340:4: (lv_customer_11_0= ruleCustomer )
                    // InternalSalesTransaction.g:1341:5: lv_customer_11_0= ruleCustomer
                    {

                    					newCompositeNode(grammarAccess.getCustomerAccess().getCustomerCustomerParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_customer_11_0=ruleCustomer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCustomerRule());
                    					}
                    					set(
                    						current,
                    						"customer",
                    						lv_customer_11_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Customer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1358:3: ( (lv_cashier_12_0= ruleCashier ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSalesTransaction.g:1359:4: (lv_cashier_12_0= ruleCashier )
                    {
                    // InternalSalesTransaction.g:1359:4: (lv_cashier_12_0= ruleCashier )
                    // InternalSalesTransaction.g:1360:5: lv_cashier_12_0= ruleCashier
                    {

                    					newCompositeNode(grammarAccess.getCustomerAccess().getCashierCashierParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_cashier_12_0=ruleCashier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCustomerRule());
                    					}
                    					set(
                    						current,
                    						"cashier",
                    						lv_cashier_12_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Cashier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleCashier"
    // InternalSalesTransaction.g:1385:1: entryRuleCashier returns [EObject current=null] : iv_ruleCashier= ruleCashier EOF ;
    public final EObject entryRuleCashier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCashier = null;


        try {
            // InternalSalesTransaction.g:1385:48: (iv_ruleCashier= ruleCashier EOF )
            // InternalSalesTransaction.g:1386:2: iv_ruleCashier= ruleCashier EOF
            {
             newCompositeNode(grammarAccess.getCashierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCashier=ruleCashier();

            state._fsp--;

             current =iv_ruleCashier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCashier"


    // $ANTLR start "ruleCashier"
    // InternalSalesTransaction.g:1392:1: ruleCashier returns [EObject current=null] : ( () otherlv_1= 'cashier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )? ( (lv_customer_8_0= ruleCustomer ) )? ( (lv_cashier_9_0= ruleCashier ) )? otherlv_10= '}' ) ;
    public final EObject ruleCashier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_surName_5_0 = null;

        AntlrDatatypeRuleToken lv_employeeId_7_0 = null;

        EObject lv_customer_8_0 = null;

        EObject lv_cashier_9_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1398:2: ( ( () otherlv_1= 'cashier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )? ( (lv_customer_8_0= ruleCustomer ) )? ( (lv_cashier_9_0= ruleCashier ) )? otherlv_10= '}' ) )
            // InternalSalesTransaction.g:1399:2: ( () otherlv_1= 'cashier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )? ( (lv_customer_8_0= ruleCustomer ) )? ( (lv_cashier_9_0= ruleCashier ) )? otherlv_10= '}' )
            {
            // InternalSalesTransaction.g:1399:2: ( () otherlv_1= 'cashier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )? ( (lv_customer_8_0= ruleCustomer ) )? ( (lv_cashier_9_0= ruleCashier ) )? otherlv_10= '}' )
            // InternalSalesTransaction.g:1400:3: () otherlv_1= 'cashier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )? (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )? ( (lv_customer_8_0= ruleCustomer ) )? ( (lv_cashier_9_0= ruleCashier ) )? otherlv_10= '}'
            {
            // InternalSalesTransaction.g:1400:3: ()
            // InternalSalesTransaction.g:1401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCashierAccess().getCashierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCashierAccess().getCashierKeyword_1());
            		
            // InternalSalesTransaction.g:1411:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSalesTransaction.g:1412:4: (lv_name_2_0= ruleEString )
            {
            // InternalSalesTransaction.g:1412:4: (lv_name_2_0= ruleEString )
            // InternalSalesTransaction.g:1413:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCashierAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCashierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getCashierAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSalesTransaction.g:1434:3: (otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSalesTransaction.g:1435:4: otherlv_4= 'surName' ( (lv_surName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCashierAccess().getSurNameKeyword_4_0());
                    			
                    // InternalSalesTransaction.g:1439:4: ( (lv_surName_5_0= ruleEString ) )
                    // InternalSalesTransaction.g:1440:5: (lv_surName_5_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1440:5: (lv_surName_5_0= ruleEString )
                    // InternalSalesTransaction.g:1441:6: lv_surName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCashierAccess().getSurNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_surName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCashierRule());
                    						}
                    						set(
                    							current,
                    							"surName",
                    							lv_surName_5_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1459:3: (otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSalesTransaction.g:1460:4: otherlv_6= 'employeeId' ( (lv_employeeId_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCashierAccess().getEmployeeIdKeyword_5_0());
                    			
                    // InternalSalesTransaction.g:1464:4: ( (lv_employeeId_7_0= ruleEString ) )
                    // InternalSalesTransaction.g:1465:5: (lv_employeeId_7_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1465:5: (lv_employeeId_7_0= ruleEString )
                    // InternalSalesTransaction.g:1466:6: lv_employeeId_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCashierAccess().getEmployeeIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_employeeId_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCashierRule());
                    						}
                    						set(
                    							current,
                    							"employeeId",
                    							lv_employeeId_7_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1484:3: ( (lv_customer_8_0= ruleCustomer ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSalesTransaction.g:1485:4: (lv_customer_8_0= ruleCustomer )
                    {
                    // InternalSalesTransaction.g:1485:4: (lv_customer_8_0= ruleCustomer )
                    // InternalSalesTransaction.g:1486:5: lv_customer_8_0= ruleCustomer
                    {

                    					newCompositeNode(grammarAccess.getCashierAccess().getCustomerCustomerParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_customer_8_0=ruleCustomer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCashierRule());
                    					}
                    					set(
                    						current,
                    						"customer",
                    						lv_customer_8_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Customer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1503:3: ( (lv_cashier_9_0= ruleCashier ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSalesTransaction.g:1504:4: (lv_cashier_9_0= ruleCashier )
                    {
                    // InternalSalesTransaction.g:1504:4: (lv_cashier_9_0= ruleCashier )
                    // InternalSalesTransaction.g:1505:5: lv_cashier_9_0= ruleCashier
                    {

                    					newCompositeNode(grammarAccess.getCashierAccess().getCashierCashierParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_cashier_9_0=ruleCashier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCashierRule());
                    					}
                    					set(
                    						current,
                    						"cashier",
                    						lv_cashier_9_0,
                    						"xtext.sales.assignment3.transaction.SalesTransaction.Cashier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCashierAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCashier"


    // $ANTLR start "entryRuleLineItem"
    // InternalSalesTransaction.g:1530:1: entryRuleLineItem returns [EObject current=null] : iv_ruleLineItem= ruleLineItem EOF ;
    public final EObject entryRuleLineItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineItem = null;


        try {
            // InternalSalesTransaction.g:1530:49: (iv_ruleLineItem= ruleLineItem EOF )
            // InternalSalesTransaction.g:1531:2: iv_ruleLineItem= ruleLineItem EOF
            {
             newCompositeNode(grammarAccess.getLineItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineItem=ruleLineItem();

            state._fsp--;

             current =iv_ruleLineItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineItem"


    // $ANTLR start "ruleLineItem"
    // InternalSalesTransaction.g:1537:1: ruleLineItem returns [EObject current=null] : (otherlv_0= 'lineItem' otherlv_1= '{' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= 'quantity' ( (lv_quantity_5_0= ruleEDouble ) ) otherlv_6= 'item' ( ( ruleEString ) ) (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )? (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )? (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleLineItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_code_3_0 = null;

        AntlrDatatypeRuleToken lv_quantity_5_0 = null;

        EObject lv_tax_9_0 = null;

        EObject lv_discount_11_0 = null;

        EObject lv_additionalCharge_13_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1543:2: ( (otherlv_0= 'lineItem' otherlv_1= '{' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= 'quantity' ( (lv_quantity_5_0= ruleEDouble ) ) otherlv_6= 'item' ( ( ruleEString ) ) (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )? (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )? (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )? otherlv_14= '}' ) )
            // InternalSalesTransaction.g:1544:2: (otherlv_0= 'lineItem' otherlv_1= '{' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= 'quantity' ( (lv_quantity_5_0= ruleEDouble ) ) otherlv_6= 'item' ( ( ruleEString ) ) (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )? (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )? (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )? otherlv_14= '}' )
            {
            // InternalSalesTransaction.g:1544:2: (otherlv_0= 'lineItem' otherlv_1= '{' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= 'quantity' ( (lv_quantity_5_0= ruleEDouble ) ) otherlv_6= 'item' ( ( ruleEString ) ) (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )? (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )? (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )? otherlv_14= '}' )
            // InternalSalesTransaction.g:1545:3: otherlv_0= 'lineItem' otherlv_1= '{' (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )? otherlv_4= 'quantity' ( (lv_quantity_5_0= ruleEDouble ) ) otherlv_6= 'item' ( ( ruleEString ) ) (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )? (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )? (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLineItemAccess().getLineItemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getLineItemAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSalesTransaction.g:1553:3: (otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSalesTransaction.g:1554:4: otherlv_2= 'code' ( (lv_code_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLineItemAccess().getCodeKeyword_2_0());
                    			
                    // InternalSalesTransaction.g:1558:4: ( (lv_code_3_0= ruleEString ) )
                    // InternalSalesTransaction.g:1559:5: (lv_code_3_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1559:5: (lv_code_3_0= ruleEString )
                    // InternalSalesTransaction.g:1560:6: lv_code_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLineItemAccess().getCodeEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_code_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineItemRule());
                    						}
                    						set(
                    							current,
                    							"code",
                    							lv_code_3_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getLineItemAccess().getQuantityKeyword_3());
            		
            // InternalSalesTransaction.g:1582:3: ( (lv_quantity_5_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1583:4: (lv_quantity_5_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1583:4: (lv_quantity_5_0= ruleEDouble )
            // InternalSalesTransaction.g:1584:5: lv_quantity_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLineItemAccess().getQuantityEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_quantity_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineItemRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_5_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getLineItemAccess().getItemKeyword_5());
            		
            // InternalSalesTransaction.g:1605:3: ( ( ruleEString ) )
            // InternalSalesTransaction.g:1606:4: ( ruleEString )
            {
            // InternalSalesTransaction.g:1606:4: ( ruleEString )
            // InternalSalesTransaction.g:1607:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLineItemAccess().getItemItemCrossReference_6_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSalesTransaction.g:1621:3: (otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSalesTransaction.g:1622:4: otherlv_8= 'tax' ( (lv_tax_9_0= ruleTax ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_59); 

                    				newLeafNode(otherlv_8, grammarAccess.getLineItemAccess().getTaxKeyword_7_0());
                    			
                    // InternalSalesTransaction.g:1626:4: ( (lv_tax_9_0= ruleTax ) )
                    // InternalSalesTransaction.g:1627:5: (lv_tax_9_0= ruleTax )
                    {
                    // InternalSalesTransaction.g:1627:5: (lv_tax_9_0= ruleTax )
                    // InternalSalesTransaction.g:1628:6: lv_tax_9_0= ruleTax
                    {

                    						newCompositeNode(grammarAccess.getLineItemAccess().getTaxTaxParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_tax_9_0=ruleTax();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineItemRule());
                    						}
                    						set(
                    							current,
                    							"tax",
                    							lv_tax_9_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.Tax");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1646:3: (otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSalesTransaction.g:1647:4: otherlv_10= 'discount' ( (lv_discount_11_0= ruleDiscount ) )
                    {
                    otherlv_10=(Token)match(input,57,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getLineItemAccess().getDiscountKeyword_8_0());
                    			
                    // InternalSalesTransaction.g:1651:4: ( (lv_discount_11_0= ruleDiscount ) )
                    // InternalSalesTransaction.g:1652:5: (lv_discount_11_0= ruleDiscount )
                    {
                    // InternalSalesTransaction.g:1652:5: (lv_discount_11_0= ruleDiscount )
                    // InternalSalesTransaction.g:1653:6: lv_discount_11_0= ruleDiscount
                    {

                    						newCompositeNode(grammarAccess.getLineItemAccess().getDiscountDiscountParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_discount_11_0=ruleDiscount();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineItemRule());
                    						}
                    						set(
                    							current,
                    							"discount",
                    							lv_discount_11_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.Discount");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1671:3: (otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSalesTransaction.g:1672:4: otherlv_12= 'additionalCharge' ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_12, grammarAccess.getLineItemAccess().getAdditionalChargeKeyword_9_0());
                    			
                    // InternalSalesTransaction.g:1676:4: ( (lv_additionalCharge_13_0= ruleAdditionalCharge ) )
                    // InternalSalesTransaction.g:1677:5: (lv_additionalCharge_13_0= ruleAdditionalCharge )
                    {
                    // InternalSalesTransaction.g:1677:5: (lv_additionalCharge_13_0= ruleAdditionalCharge )
                    // InternalSalesTransaction.g:1678:6: lv_additionalCharge_13_0= ruleAdditionalCharge
                    {

                    						newCompositeNode(grammarAccess.getLineItemAccess().getAdditionalChargeAdditionalChargeParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalCharge_13_0=ruleAdditionalCharge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineItemRule());
                    						}
                    						set(
                    							current,
                    							"additionalCharge",
                    							lv_additionalCharge_13_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.AdditionalCharge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getLineItemAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineItem"


    // $ANTLR start "entryRuleCard"
    // InternalSalesTransaction.g:1704:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // InternalSalesTransaction.g:1704:45: (iv_ruleCard= ruleCard EOF )
            // InternalSalesTransaction.g:1705:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalSalesTransaction.g:1711:1: ruleCard returns [EObject current=null] : (otherlv_0= 'card' otherlv_1= '{' (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )? (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )? otherlv_6= 'cardHolder' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_cardNumber_3_0 = null;

        AntlrDatatypeRuleToken lv_expiryDate_5_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1717:2: ( (otherlv_0= 'card' otherlv_1= '{' (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )? (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )? otherlv_6= 'cardHolder' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalSalesTransaction.g:1718:2: (otherlv_0= 'card' otherlv_1= '{' (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )? (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )? otherlv_6= 'cardHolder' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalSalesTransaction.g:1718:2: (otherlv_0= 'card' otherlv_1= '{' (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )? (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )? otherlv_6= 'cardHolder' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalSalesTransaction.g:1719:3: otherlv_0= 'card' otherlv_1= '{' (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )? (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )? otherlv_6= 'cardHolder' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCardAccess().getCardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSalesTransaction.g:1727:3: (otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSalesTransaction.g:1728:4: otherlv_2= 'cardNumber' ( (lv_cardNumber_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCardAccess().getCardNumberKeyword_2_0());
                    			
                    // InternalSalesTransaction.g:1732:4: ( (lv_cardNumber_3_0= ruleEString ) )
                    // InternalSalesTransaction.g:1733:5: (lv_cardNumber_3_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1733:5: (lv_cardNumber_3_0= ruleEString )
                    // InternalSalesTransaction.g:1734:6: lv_cardNumber_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCardAccess().getCardNumberEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_cardNumber_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardRule());
                    						}
                    						set(
                    							current,
                    							"cardNumber",
                    							lv_cardNumber_3_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalesTransaction.g:1752:3: (otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==61) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSalesTransaction.g:1753:4: otherlv_4= 'expiryDate' ( (lv_expiryDate_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCardAccess().getExpiryDateKeyword_3_0());
                    			
                    // InternalSalesTransaction.g:1757:4: ( (lv_expiryDate_5_0= ruleEString ) )
                    // InternalSalesTransaction.g:1758:5: (lv_expiryDate_5_0= ruleEString )
                    {
                    // InternalSalesTransaction.g:1758:5: (lv_expiryDate_5_0= ruleEString )
                    // InternalSalesTransaction.g:1759:6: lv_expiryDate_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCardAccess().getExpiryDateEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_expiryDate_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCardRule());
                    						}
                    						set(
                    							current,
                    							"expiryDate",
                    							lv_expiryDate_5_0,
                    							"xtext.sales.assignment3.transaction.SalesTransaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCardAccess().getCardHolderKeyword_4());
            		
            // InternalSalesTransaction.g:1781:3: ( ( ruleEString ) )
            // InternalSalesTransaction.g:1782:4: ( ruleEString )
            {
            // InternalSalesTransaction.g:1782:4: ( ruleEString )
            // InternalSalesTransaction.g:1783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCardAccess().getCardHolderCustomerCrossReference_5_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleTax"
    // InternalSalesTransaction.g:1805:1: entryRuleTax returns [EObject current=null] : iv_ruleTax= ruleTax EOF ;
    public final EObject entryRuleTax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTax = null;


        try {
            // InternalSalesTransaction.g:1805:44: (iv_ruleTax= ruleTax EOF )
            // InternalSalesTransaction.g:1806:2: iv_ruleTax= ruleTax EOF
            {
             newCompositeNode(grammarAccess.getTaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTax=ruleTax();

            state._fsp--;

             current =iv_ruleTax; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTax"


    // $ANTLR start "ruleTax"
    // InternalSalesTransaction.g:1812:1: ruleTax returns [EObject current=null] : (otherlv_0= 'tax' otherlv_1= '{' otherlv_2= 'taxType' ( (lv_taxType_3_0= ruleTaxType ) ) otherlv_4= 'taxableAmount' ( (lv_taxableAmount_5_0= ruleEDouble ) ) otherlv_6= 'taxAmount' ( (lv_taxAmount_7_0= ruleEDouble ) ) otherlv_8= '}' ) ;
    public final EObject ruleTax() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_taxType_3_0 = null;

        AntlrDatatypeRuleToken lv_taxableAmount_5_0 = null;

        AntlrDatatypeRuleToken lv_taxAmount_7_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1818:2: ( (otherlv_0= 'tax' otherlv_1= '{' otherlv_2= 'taxType' ( (lv_taxType_3_0= ruleTaxType ) ) otherlv_4= 'taxableAmount' ( (lv_taxableAmount_5_0= ruleEDouble ) ) otherlv_6= 'taxAmount' ( (lv_taxAmount_7_0= ruleEDouble ) ) otherlv_8= '}' ) )
            // InternalSalesTransaction.g:1819:2: (otherlv_0= 'tax' otherlv_1= '{' otherlv_2= 'taxType' ( (lv_taxType_3_0= ruleTaxType ) ) otherlv_4= 'taxableAmount' ( (lv_taxableAmount_5_0= ruleEDouble ) ) otherlv_6= 'taxAmount' ( (lv_taxAmount_7_0= ruleEDouble ) ) otherlv_8= '}' )
            {
            // InternalSalesTransaction.g:1819:2: (otherlv_0= 'tax' otherlv_1= '{' otherlv_2= 'taxType' ( (lv_taxType_3_0= ruleTaxType ) ) otherlv_4= 'taxableAmount' ( (lv_taxableAmount_5_0= ruleEDouble ) ) otherlv_6= 'taxAmount' ( (lv_taxAmount_7_0= ruleEDouble ) ) otherlv_8= '}' )
            // InternalSalesTransaction.g:1820:3: otherlv_0= 'tax' otherlv_1= '{' otherlv_2= 'taxType' ( (lv_taxType_3_0= ruleTaxType ) ) otherlv_4= 'taxableAmount' ( (lv_taxableAmount_5_0= ruleEDouble ) ) otherlv_6= 'taxAmount' ( (lv_taxAmount_7_0= ruleEDouble ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaxAccess().getTaxKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getTaxAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,63,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getTaxAccess().getTaxTypeKeyword_2());
            		
            // InternalSalesTransaction.g:1832:3: ( (lv_taxType_3_0= ruleTaxType ) )
            // InternalSalesTransaction.g:1833:4: (lv_taxType_3_0= ruleTaxType )
            {
            // InternalSalesTransaction.g:1833:4: (lv_taxType_3_0= ruleTaxType )
            // InternalSalesTransaction.g:1834:5: lv_taxType_3_0= ruleTaxType
            {

            					newCompositeNode(grammarAccess.getTaxAccess().getTaxTypeTaxTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_69);
            lv_taxType_3_0=ruleTaxType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaxRule());
            					}
            					set(
            						current,
            						"taxType",
            						lv_taxType_3_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.TaxType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,64,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getTaxAccess().getTaxableAmountKeyword_4());
            		
            // InternalSalesTransaction.g:1855:3: ( (lv_taxableAmount_5_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1856:4: (lv_taxableAmount_5_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1856:4: (lv_taxableAmount_5_0= ruleEDouble )
            // InternalSalesTransaction.g:1857:5: lv_taxableAmount_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getTaxAccess().getTaxableAmountEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_70);
            lv_taxableAmount_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaxRule());
            					}
            					set(
            						current,
            						"taxableAmount",
            						lv_taxableAmount_5_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,65,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getTaxAccess().getTaxAmountKeyword_6());
            		
            // InternalSalesTransaction.g:1878:3: ( (lv_taxAmount_7_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1879:4: (lv_taxAmount_7_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1879:4: (lv_taxAmount_7_0= ruleEDouble )
            // InternalSalesTransaction.g:1880:5: lv_taxAmount_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getTaxAccess().getTaxAmountEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_taxAmount_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaxRule());
            					}
            					set(
            						current,
            						"taxAmount",
            						lv_taxAmount_7_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTaxAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTax"


    // $ANTLR start "entryRuleDiscount"
    // InternalSalesTransaction.g:1905:1: entryRuleDiscount returns [EObject current=null] : iv_ruleDiscount= ruleDiscount EOF ;
    public final EObject entryRuleDiscount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscount = null;


        try {
            // InternalSalesTransaction.g:1905:49: (iv_ruleDiscount= ruleDiscount EOF )
            // InternalSalesTransaction.g:1906:2: iv_ruleDiscount= ruleDiscount EOF
            {
             newCompositeNode(grammarAccess.getDiscountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscount=ruleDiscount();

            state._fsp--;

             current =iv_ruleDiscount; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscount"


    // $ANTLR start "ruleDiscount"
    // InternalSalesTransaction.g:1912:1: ruleDiscount returns [EObject current=null] : (otherlv_0= 'discount' otherlv_1= '{' otherlv_2= 'percentage' ( (lv_percentage_3_0= ruleEDouble ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleEDouble ) ) otherlv_6= '}' ) ;
    public final EObject ruleDiscount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_percentage_3_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1918:2: ( (otherlv_0= 'discount' otherlv_1= '{' otherlv_2= 'percentage' ( (lv_percentage_3_0= ruleEDouble ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleEDouble ) ) otherlv_6= '}' ) )
            // InternalSalesTransaction.g:1919:2: (otherlv_0= 'discount' otherlv_1= '{' otherlv_2= 'percentage' ( (lv_percentage_3_0= ruleEDouble ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleEDouble ) ) otherlv_6= '}' )
            {
            // InternalSalesTransaction.g:1919:2: (otherlv_0= 'discount' otherlv_1= '{' otherlv_2= 'percentage' ( (lv_percentage_3_0= ruleEDouble ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleEDouble ) ) otherlv_6= '}' )
            // InternalSalesTransaction.g:1920:3: otherlv_0= 'discount' otherlv_1= '{' otherlv_2= 'percentage' ( (lv_percentage_3_0= ruleEDouble ) ) otherlv_4= 'amount' ( (lv_amount_5_0= ruleEDouble ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDiscountAccess().getDiscountKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getDiscountAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDiscountAccess().getPercentageKeyword_2());
            		
            // InternalSalesTransaction.g:1932:3: ( (lv_percentage_3_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1933:4: (lv_percentage_3_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1933:4: (lv_percentage_3_0= ruleEDouble )
            // InternalSalesTransaction.g:1934:5: lv_percentage_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDiscountAccess().getPercentageEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
            lv_percentage_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscountRule());
            					}
            					set(
            						current,
            						"percentage",
            						lv_percentage_3_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,67,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getDiscountAccess().getAmountKeyword_4());
            		
            // InternalSalesTransaction.g:1955:3: ( (lv_amount_5_0= ruleEDouble ) )
            // InternalSalesTransaction.g:1956:4: (lv_amount_5_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:1956:4: (lv_amount_5_0= ruleEDouble )
            // InternalSalesTransaction.g:1957:5: lv_amount_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDiscountAccess().getAmountEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_amount_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscountRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_5_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDiscountAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscount"


    // $ANTLR start "entryRuleAdditionalCharge"
    // InternalSalesTransaction.g:1982:1: entryRuleAdditionalCharge returns [EObject current=null] : iv_ruleAdditionalCharge= ruleAdditionalCharge EOF ;
    public final EObject entryRuleAdditionalCharge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalCharge = null;


        try {
            // InternalSalesTransaction.g:1982:57: (iv_ruleAdditionalCharge= ruleAdditionalCharge EOF )
            // InternalSalesTransaction.g:1983:2: iv_ruleAdditionalCharge= ruleAdditionalCharge EOF
            {
             newCompositeNode(grammarAccess.getAdditionalChargeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalCharge=ruleAdditionalCharge();

            state._fsp--;

             current =iv_ruleAdditionalCharge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalCharge"


    // $ANTLR start "ruleAdditionalCharge"
    // InternalSalesTransaction.g:1989:1: ruleAdditionalCharge returns [EObject current=null] : (otherlv_0= 'additionalCharge' otherlv_1= '{' otherlv_2= 'serviceCharge' ( (lv_serviceCharge_3_0= ruleEDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleAdditionalCharge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_serviceCharge_3_0 = null;



        	enterRule();

        try {
            // InternalSalesTransaction.g:1995:2: ( (otherlv_0= 'additionalCharge' otherlv_1= '{' otherlv_2= 'serviceCharge' ( (lv_serviceCharge_3_0= ruleEDouble ) ) otherlv_4= '}' ) )
            // InternalSalesTransaction.g:1996:2: (otherlv_0= 'additionalCharge' otherlv_1= '{' otherlv_2= 'serviceCharge' ( (lv_serviceCharge_3_0= ruleEDouble ) ) otherlv_4= '}' )
            {
            // InternalSalesTransaction.g:1996:2: (otherlv_0= 'additionalCharge' otherlv_1= '{' otherlv_2= 'serviceCharge' ( (lv_serviceCharge_3_0= ruleEDouble ) ) otherlv_4= '}' )
            // InternalSalesTransaction.g:1997:3: otherlv_0= 'additionalCharge' otherlv_1= '{' otherlv_2= 'serviceCharge' ( (lv_serviceCharge_3_0= ruleEDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdditionalChargeAccess().getAdditionalChargeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalChargeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,68,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getAdditionalChargeAccess().getServiceChargeKeyword_2());
            		
            // InternalSalesTransaction.g:2009:3: ( (lv_serviceCharge_3_0= ruleEDouble ) )
            // InternalSalesTransaction.g:2010:4: (lv_serviceCharge_3_0= ruleEDouble )
            {
            // InternalSalesTransaction.g:2010:4: (lv_serviceCharge_3_0= ruleEDouble )
            // InternalSalesTransaction.g:2011:5: lv_serviceCharge_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getAdditionalChargeAccess().getServiceChargeEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_serviceCharge_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalChargeRule());
            					}
            					set(
            						current,
            						"serviceCharge",
            						lv_serviceCharge_3_0,
            						"xtext.sales.assignment3.transaction.SalesTransaction.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAdditionalChargeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalCharge"


    // $ANTLR start "ruleUoM"
    // InternalSalesTransaction.g:2036:1: ruleUoM returns [Enumerator current=null] : ( (enumLiteral_0= 'PCS' ) | (enumLiteral_1= 'KG' ) | (enumLiteral_2= 'LTR' ) | (enumLiteral_3= 'M' ) ) ;
    public final Enumerator ruleUoM() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:2042:2: ( ( (enumLiteral_0= 'PCS' ) | (enumLiteral_1= 'KG' ) | (enumLiteral_2= 'LTR' ) | (enumLiteral_3= 'M' ) ) )
            // InternalSalesTransaction.g:2043:2: ( (enumLiteral_0= 'PCS' ) | (enumLiteral_1= 'KG' ) | (enumLiteral_2= 'LTR' ) | (enumLiteral_3= 'M' ) )
            {
            // InternalSalesTransaction.g:2043:2: ( (enumLiteral_0= 'PCS' ) | (enumLiteral_1= 'KG' ) | (enumLiteral_2= 'LTR' ) | (enumLiteral_3= 'M' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt44=1;
                }
                break;
            case 70:
                {
                alt44=2;
                }
                break;
            case 71:
                {
                alt44=3;
                }
                break;
            case 72:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSalesTransaction.g:2044:3: (enumLiteral_0= 'PCS' )
                    {
                    // InternalSalesTransaction.g:2044:3: (enumLiteral_0= 'PCS' )
                    // InternalSalesTransaction.g:2045:4: enumLiteral_0= 'PCS'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getUoMAccess().getPCSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUoMAccess().getPCSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:2052:3: (enumLiteral_1= 'KG' )
                    {
                    // InternalSalesTransaction.g:2052:3: (enumLiteral_1= 'KG' )
                    // InternalSalesTransaction.g:2053:4: enumLiteral_1= 'KG'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getUoMAccess().getKGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUoMAccess().getKGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:2060:3: (enumLiteral_2= 'LTR' )
                    {
                    // InternalSalesTransaction.g:2060:3: (enumLiteral_2= 'LTR' )
                    // InternalSalesTransaction.g:2061:4: enumLiteral_2= 'LTR'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getUoMAccess().getLTREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUoMAccess().getLTREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSalesTransaction.g:2068:3: (enumLiteral_3= 'M' )
                    {
                    // InternalSalesTransaction.g:2068:3: (enumLiteral_3= 'M' )
                    // InternalSalesTransaction.g:2069:4: enumLiteral_3= 'M'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getUoMAccess().getMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUoMAccess().getMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUoM"


    // $ANTLR start "ruleTransactionType"
    // InternalSalesTransaction.g:2079:1: ruleTransactionType returns [Enumerator current=null] : ( (enumLiteral_0= 'CashSales' ) | (enumLiteral_1= 'CreditSales' ) | (enumLiteral_2= 'AdvancePaymentSales' ) ) ;
    public final Enumerator ruleTransactionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:2085:2: ( ( (enumLiteral_0= 'CashSales' ) | (enumLiteral_1= 'CreditSales' ) | (enumLiteral_2= 'AdvancePaymentSales' ) ) )
            // InternalSalesTransaction.g:2086:2: ( (enumLiteral_0= 'CashSales' ) | (enumLiteral_1= 'CreditSales' ) | (enumLiteral_2= 'AdvancePaymentSales' ) )
            {
            // InternalSalesTransaction.g:2086:2: ( (enumLiteral_0= 'CashSales' ) | (enumLiteral_1= 'CreditSales' ) | (enumLiteral_2= 'AdvancePaymentSales' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt45=1;
                }
                break;
            case 74:
                {
                alt45=2;
                }
                break;
            case 75:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSalesTransaction.g:2087:3: (enumLiteral_0= 'CashSales' )
                    {
                    // InternalSalesTransaction.g:2087:3: (enumLiteral_0= 'CashSales' )
                    // InternalSalesTransaction.g:2088:4: enumLiteral_0= 'CashSales'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getTransactionTypeAccess().getCashSalesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransactionTypeAccess().getCashSalesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:2095:3: (enumLiteral_1= 'CreditSales' )
                    {
                    // InternalSalesTransaction.g:2095:3: (enumLiteral_1= 'CreditSales' )
                    // InternalSalesTransaction.g:2096:4: enumLiteral_1= 'CreditSales'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getTransactionTypeAccess().getCreditSalesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransactionTypeAccess().getCreditSalesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:2103:3: (enumLiteral_2= 'AdvancePaymentSales' )
                    {
                    // InternalSalesTransaction.g:2103:3: (enumLiteral_2= 'AdvancePaymentSales' )
                    // InternalSalesTransaction.g:2104:4: enumLiteral_2= 'AdvancePaymentSales'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getTransactionTypeAccess().getAdvancePaymentSalesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTransactionTypeAccess().getAdvancePaymentSalesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransactionType"


    // $ANTLR start "rulePaymentMethod"
    // InternalSalesTransaction.g:2114:1: rulePaymentMethod returns [Enumerator current=null] : ( (enumLiteral_0= 'Cash' ) | (enumLiteral_1= 'Card' ) ) ;
    public final Enumerator rulePaymentMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:2120:2: ( ( (enumLiteral_0= 'Cash' ) | (enumLiteral_1= 'Card' ) ) )
            // InternalSalesTransaction.g:2121:2: ( (enumLiteral_0= 'Cash' ) | (enumLiteral_1= 'Card' ) )
            {
            // InternalSalesTransaction.g:2121:2: ( (enumLiteral_0= 'Cash' ) | (enumLiteral_1= 'Card' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==76) ) {
                alt46=1;
            }
            else if ( (LA46_0==77) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSalesTransaction.g:2122:3: (enumLiteral_0= 'Cash' )
                    {
                    // InternalSalesTransaction.g:2122:3: (enumLiteral_0= 'Cash' )
                    // InternalSalesTransaction.g:2123:4: enumLiteral_0= 'Cash'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getPaymentMethodAccess().getCashEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPaymentMethodAccess().getCashEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:2130:3: (enumLiteral_1= 'Card' )
                    {
                    // InternalSalesTransaction.g:2130:3: (enumLiteral_1= 'Card' )
                    // InternalSalesTransaction.g:2131:4: enumLiteral_1= 'Card'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getPaymentMethodAccess().getCardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPaymentMethodAccess().getCardEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaymentMethod"


    // $ANTLR start "ruleTaxType"
    // InternalSalesTransaction.g:2141:1: ruleTaxType returns [Enumerator current=null] : ( (enumLiteral_0= 'TaxExempt' ) | (enumLiteral_1= 'IncomeTax' ) | (enumLiteral_2= 'CorporateTax' ) | (enumLiteral_3= 'VAT' ) ) ;
    public final Enumerator ruleTaxType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSalesTransaction.g:2147:2: ( ( (enumLiteral_0= 'TaxExempt' ) | (enumLiteral_1= 'IncomeTax' ) | (enumLiteral_2= 'CorporateTax' ) | (enumLiteral_3= 'VAT' ) ) )
            // InternalSalesTransaction.g:2148:2: ( (enumLiteral_0= 'TaxExempt' ) | (enumLiteral_1= 'IncomeTax' ) | (enumLiteral_2= 'CorporateTax' ) | (enumLiteral_3= 'VAT' ) )
            {
            // InternalSalesTransaction.g:2148:2: ( (enumLiteral_0= 'TaxExempt' ) | (enumLiteral_1= 'IncomeTax' ) | (enumLiteral_2= 'CorporateTax' ) | (enumLiteral_3= 'VAT' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt47=1;
                }
                break;
            case 79:
                {
                alt47=2;
                }
                break;
            case 80:
                {
                alt47=3;
                }
                break;
            case 81:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalSalesTransaction.g:2149:3: (enumLiteral_0= 'TaxExempt' )
                    {
                    // InternalSalesTransaction.g:2149:3: (enumLiteral_0= 'TaxExempt' )
                    // InternalSalesTransaction.g:2150:4: enumLiteral_0= 'TaxExempt'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getTaxTypeAccess().getTaxExemptEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaxTypeAccess().getTaxExemptEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:2157:3: (enumLiteral_1= 'IncomeTax' )
                    {
                    // InternalSalesTransaction.g:2157:3: (enumLiteral_1= 'IncomeTax' )
                    // InternalSalesTransaction.g:2158:4: enumLiteral_1= 'IncomeTax'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getTaxTypeAccess().getIncomeTaxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaxTypeAccess().getIncomeTaxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:2165:3: (enumLiteral_2= 'CorporateTax' )
                    {
                    // InternalSalesTransaction.g:2165:3: (enumLiteral_2= 'CorporateTax' )
                    // InternalSalesTransaction.g:2166:4: enumLiteral_2= 'CorporateTax'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getTaxTypeAccess().getCorporateTaxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaxTypeAccess().getCorporateTaxEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSalesTransaction.g:2173:3: (enumLiteral_3= 'VAT' )
                    {
                    // InternalSalesTransaction.g:2173:3: (enumLiteral_3= 'VAT' )
                    // InternalSalesTransaction.g:2174:4: enumLiteral_3= 'VAT'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getTaxTypeAccess().getVATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaxTypeAccess().getVATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaxType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000790000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0011000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001F000000010030L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x001D000000010030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0019000000010030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0011000000010030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0011000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0033000000010000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0031000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000100000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0700000000010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0600000000010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}