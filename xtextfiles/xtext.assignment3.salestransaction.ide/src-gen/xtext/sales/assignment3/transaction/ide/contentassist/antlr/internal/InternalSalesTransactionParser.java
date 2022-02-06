package xtext.sales.assignment3.transaction.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.sales.assignment3.transaction.services.SalesTransactionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalesTransactionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'true'", "'false'", "'PCS'", "'KG'", "'LTR'", "'M'", "'CashSales'", "'CreditSales'", "'AdvancePaymentSales'", "'Cash'", "'Card'", "'TaxExempt'", "'IncomeTax'", "'CorporateTax'", "'VAT'", "'company'", "'{'", "'stores'", "'}'", "'codice'", "','", "'transactions'", "'address'", "'street'", "'city'", "'country'", "'telephone'", "'store'", "'items'", "'transaction'", "'transactionType'", "'paymentMethod'", "'lineItems'", "'transactionNumber'", "'issuedDate'", "'item'", "'uom'", "'availableNumber'", "'isActive'", "'unitPrice'", "'code'", "'batch'", "'description'", "'-'", "'.'", "'price'", "'sellingPrice'", "'customer'", "'surName'", "'identityNumber'", "'phoneNumber'", "'cashier'", "'employeeId'", "'lineItem'", "'quantity'", "'tax'", "'discount'", "'additionalCharge'", "'card'", "'cardHolder'", "'cardNumber'", "'expiryDate'", "'taxType'", "'taxableAmount'", "'taxAmount'", "'percentage'", "'amount'", "'serviceCharge'"
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

    	public void setGrammarAccess(SalesTransactionGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCompany"
    // InternalSalesTransaction.g:53:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:54:1: ( ruleCompany EOF )
            // InternalSalesTransaction.g:55:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalSalesTransaction.g:62:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:66:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalSalesTransaction.g:67:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalSalesTransaction.g:67:2: ( ( rule__Company__Group__0 ) )
            // InternalSalesTransaction.g:68:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalSalesTransaction.g:69:3: ( rule__Company__Group__0 )
            // InternalSalesTransaction.g:69:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEString"
    // InternalSalesTransaction.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:79:1: ( ruleEString EOF )
            // InternalSalesTransaction.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSalesTransaction.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSalesTransaction.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSalesTransaction.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSalesTransaction.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSalesTransaction.g:94:3: ( rule__EString__Alternatives )
            // InternalSalesTransaction.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAddress"
    // InternalSalesTransaction.g:103:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:104:1: ( ruleAddress EOF )
            // InternalSalesTransaction.g:105:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalSalesTransaction.g:112:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:116:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalSalesTransaction.g:117:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalSalesTransaction.g:117:2: ( ( rule__Address__Group__0 ) )
            // InternalSalesTransaction.g:118:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalSalesTransaction.g:119:3: ( rule__Address__Group__0 )
            // InternalSalesTransaction.g:119:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleStore"
    // InternalSalesTransaction.g:128:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:129:1: ( ruleStore EOF )
            // InternalSalesTransaction.g:130:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalSalesTransaction.g:137:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:141:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalSalesTransaction.g:142:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalSalesTransaction.g:142:2: ( ( rule__Store__Group__0 ) )
            // InternalSalesTransaction.g:143:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalSalesTransaction.g:144:3: ( rule__Store__Group__0 )
            // InternalSalesTransaction.g:144:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleTransaction"
    // InternalSalesTransaction.g:153:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:154:1: ( ruleTransaction EOF )
            // InternalSalesTransaction.g:155:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalSalesTransaction.g:162:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:166:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalSalesTransaction.g:167:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalSalesTransaction.g:167:2: ( ( rule__Transaction__Group__0 ) )
            // InternalSalesTransaction.g:168:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalSalesTransaction.g:169:3: ( rule__Transaction__Group__0 )
            // InternalSalesTransaction.g:169:4: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleItem"
    // InternalSalesTransaction.g:178:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:179:1: ( ruleItem EOF )
            // InternalSalesTransaction.g:180:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalSalesTransaction.g:187:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:191:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalSalesTransaction.g:192:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalSalesTransaction.g:192:2: ( ( rule__Item__Group__0 ) )
            // InternalSalesTransaction.g:193:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalSalesTransaction.g:194:3: ( rule__Item__Group__0 )
            // InternalSalesTransaction.g:194:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleEDouble"
    // InternalSalesTransaction.g:203:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:204:1: ( ruleEDouble EOF )
            // InternalSalesTransaction.g:205:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSalesTransaction.g:212:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:216:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSalesTransaction.g:217:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSalesTransaction.g:217:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSalesTransaction.g:218:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSalesTransaction.g:219:3: ( rule__EDouble__Group__0 )
            // InternalSalesTransaction.g:219:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePrice"
    // InternalSalesTransaction.g:228:1: entryRulePrice : rulePrice EOF ;
    public final void entryRulePrice() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:229:1: ( rulePrice EOF )
            // InternalSalesTransaction.g:230:1: rulePrice EOF
            {
             before(grammarAccess.getPriceRule()); 
            pushFollow(FOLLOW_1);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getPriceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrice"


    // $ANTLR start "rulePrice"
    // InternalSalesTransaction.g:237:1: rulePrice : ( ( rule__Price__Group__0 ) ) ;
    public final void rulePrice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:241:2: ( ( ( rule__Price__Group__0 ) ) )
            // InternalSalesTransaction.g:242:2: ( ( rule__Price__Group__0 ) )
            {
            // InternalSalesTransaction.g:242:2: ( ( rule__Price__Group__0 ) )
            // InternalSalesTransaction.g:243:3: ( rule__Price__Group__0 )
            {
             before(grammarAccess.getPriceAccess().getGroup()); 
            // InternalSalesTransaction.g:244:3: ( rule__Price__Group__0 )
            // InternalSalesTransaction.g:244:4: rule__Price__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Price__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPriceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrice"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSalesTransaction.g:253:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:254:1: ( ruleEBoolean EOF )
            // InternalSalesTransaction.g:255:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSalesTransaction.g:262:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:266:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSalesTransaction.g:267:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSalesTransaction.g:267:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSalesTransaction.g:268:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSalesTransaction.g:269:3: ( rule__EBoolean__Alternatives )
            // InternalSalesTransaction.g:269:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDate"
    // InternalSalesTransaction.g:278:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:279:1: ( ruleEDate EOF )
            // InternalSalesTransaction.g:280:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalSalesTransaction.g:287:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:291:2: ( ( 'EDate' ) )
            // InternalSalesTransaction.g:292:2: ( 'EDate' )
            {
            // InternalSalesTransaction.g:292:2: ( 'EDate' )
            // InternalSalesTransaction.g:293:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleCustomer"
    // InternalSalesTransaction.g:303:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:304:1: ( ruleCustomer EOF )
            // InternalSalesTransaction.g:305:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalSalesTransaction.g:312:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:316:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalSalesTransaction.g:317:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalSalesTransaction.g:317:2: ( ( rule__Customer__Group__0 ) )
            // InternalSalesTransaction.g:318:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalSalesTransaction.g:319:3: ( rule__Customer__Group__0 )
            // InternalSalesTransaction.g:319:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleCashier"
    // InternalSalesTransaction.g:328:1: entryRuleCashier : ruleCashier EOF ;
    public final void entryRuleCashier() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:329:1: ( ruleCashier EOF )
            // InternalSalesTransaction.g:330:1: ruleCashier EOF
            {
             before(grammarAccess.getCashierRule()); 
            pushFollow(FOLLOW_1);
            ruleCashier();

            state._fsp--;

             after(grammarAccess.getCashierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCashier"


    // $ANTLR start "ruleCashier"
    // InternalSalesTransaction.g:337:1: ruleCashier : ( ( rule__Cashier__Group__0 ) ) ;
    public final void ruleCashier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:341:2: ( ( ( rule__Cashier__Group__0 ) ) )
            // InternalSalesTransaction.g:342:2: ( ( rule__Cashier__Group__0 ) )
            {
            // InternalSalesTransaction.g:342:2: ( ( rule__Cashier__Group__0 ) )
            // InternalSalesTransaction.g:343:3: ( rule__Cashier__Group__0 )
            {
             before(grammarAccess.getCashierAccess().getGroup()); 
            // InternalSalesTransaction.g:344:3: ( rule__Cashier__Group__0 )
            // InternalSalesTransaction.g:344:4: rule__Cashier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCashierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCashier"


    // $ANTLR start "entryRuleLineItem"
    // InternalSalesTransaction.g:353:1: entryRuleLineItem : ruleLineItem EOF ;
    public final void entryRuleLineItem() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:354:1: ( ruleLineItem EOF )
            // InternalSalesTransaction.g:355:1: ruleLineItem EOF
            {
             before(grammarAccess.getLineItemRule()); 
            pushFollow(FOLLOW_1);
            ruleLineItem();

            state._fsp--;

             after(grammarAccess.getLineItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineItem"


    // $ANTLR start "ruleLineItem"
    // InternalSalesTransaction.g:362:1: ruleLineItem : ( ( rule__LineItem__Group__0 ) ) ;
    public final void ruleLineItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:366:2: ( ( ( rule__LineItem__Group__0 ) ) )
            // InternalSalesTransaction.g:367:2: ( ( rule__LineItem__Group__0 ) )
            {
            // InternalSalesTransaction.g:367:2: ( ( rule__LineItem__Group__0 ) )
            // InternalSalesTransaction.g:368:3: ( rule__LineItem__Group__0 )
            {
             before(grammarAccess.getLineItemAccess().getGroup()); 
            // InternalSalesTransaction.g:369:3: ( rule__LineItem__Group__0 )
            // InternalSalesTransaction.g:369:4: rule__LineItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineItem"


    // $ANTLR start "entryRuleCard"
    // InternalSalesTransaction.g:378:1: entryRuleCard : ruleCard EOF ;
    public final void entryRuleCard() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:379:1: ( ruleCard EOF )
            // InternalSalesTransaction.g:380:1: ruleCard EOF
            {
             before(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalSalesTransaction.g:387:1: ruleCard : ( ( rule__Card__Group__0 ) ) ;
    public final void ruleCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:391:2: ( ( ( rule__Card__Group__0 ) ) )
            // InternalSalesTransaction.g:392:2: ( ( rule__Card__Group__0 ) )
            {
            // InternalSalesTransaction.g:392:2: ( ( rule__Card__Group__0 ) )
            // InternalSalesTransaction.g:393:3: ( rule__Card__Group__0 )
            {
             before(grammarAccess.getCardAccess().getGroup()); 
            // InternalSalesTransaction.g:394:3: ( rule__Card__Group__0 )
            // InternalSalesTransaction.g:394:4: rule__Card__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleTax"
    // InternalSalesTransaction.g:403:1: entryRuleTax : ruleTax EOF ;
    public final void entryRuleTax() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:404:1: ( ruleTax EOF )
            // InternalSalesTransaction.g:405:1: ruleTax EOF
            {
             before(grammarAccess.getTaxRule()); 
            pushFollow(FOLLOW_1);
            ruleTax();

            state._fsp--;

             after(grammarAccess.getTaxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTax"


    // $ANTLR start "ruleTax"
    // InternalSalesTransaction.g:412:1: ruleTax : ( ( rule__Tax__Group__0 ) ) ;
    public final void ruleTax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:416:2: ( ( ( rule__Tax__Group__0 ) ) )
            // InternalSalesTransaction.g:417:2: ( ( rule__Tax__Group__0 ) )
            {
            // InternalSalesTransaction.g:417:2: ( ( rule__Tax__Group__0 ) )
            // InternalSalesTransaction.g:418:3: ( rule__Tax__Group__0 )
            {
             before(grammarAccess.getTaxAccess().getGroup()); 
            // InternalSalesTransaction.g:419:3: ( rule__Tax__Group__0 )
            // InternalSalesTransaction.g:419:4: rule__Tax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTax"


    // $ANTLR start "entryRuleDiscount"
    // InternalSalesTransaction.g:428:1: entryRuleDiscount : ruleDiscount EOF ;
    public final void entryRuleDiscount() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:429:1: ( ruleDiscount EOF )
            // InternalSalesTransaction.g:430:1: ruleDiscount EOF
            {
             before(grammarAccess.getDiscountRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscount();

            state._fsp--;

             after(grammarAccess.getDiscountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscount"


    // $ANTLR start "ruleDiscount"
    // InternalSalesTransaction.g:437:1: ruleDiscount : ( ( rule__Discount__Group__0 ) ) ;
    public final void ruleDiscount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:441:2: ( ( ( rule__Discount__Group__0 ) ) )
            // InternalSalesTransaction.g:442:2: ( ( rule__Discount__Group__0 ) )
            {
            // InternalSalesTransaction.g:442:2: ( ( rule__Discount__Group__0 ) )
            // InternalSalesTransaction.g:443:3: ( rule__Discount__Group__0 )
            {
             before(grammarAccess.getDiscountAccess().getGroup()); 
            // InternalSalesTransaction.g:444:3: ( rule__Discount__Group__0 )
            // InternalSalesTransaction.g:444:4: rule__Discount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Discount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscount"


    // $ANTLR start "entryRuleAdditionalCharge"
    // InternalSalesTransaction.g:453:1: entryRuleAdditionalCharge : ruleAdditionalCharge EOF ;
    public final void entryRuleAdditionalCharge() throws RecognitionException {
        try {
            // InternalSalesTransaction.g:454:1: ( ruleAdditionalCharge EOF )
            // InternalSalesTransaction.g:455:1: ruleAdditionalCharge EOF
            {
             before(grammarAccess.getAdditionalChargeRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalCharge();

            state._fsp--;

             after(grammarAccess.getAdditionalChargeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalCharge"


    // $ANTLR start "ruleAdditionalCharge"
    // InternalSalesTransaction.g:462:1: ruleAdditionalCharge : ( ( rule__AdditionalCharge__Group__0 ) ) ;
    public final void ruleAdditionalCharge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:466:2: ( ( ( rule__AdditionalCharge__Group__0 ) ) )
            // InternalSalesTransaction.g:467:2: ( ( rule__AdditionalCharge__Group__0 ) )
            {
            // InternalSalesTransaction.g:467:2: ( ( rule__AdditionalCharge__Group__0 ) )
            // InternalSalesTransaction.g:468:3: ( rule__AdditionalCharge__Group__0 )
            {
             before(grammarAccess.getAdditionalChargeAccess().getGroup()); 
            // InternalSalesTransaction.g:469:3: ( rule__AdditionalCharge__Group__0 )
            // InternalSalesTransaction.g:469:4: rule__AdditionalCharge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalChargeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalCharge"


    // $ANTLR start "ruleUoM"
    // InternalSalesTransaction.g:478:1: ruleUoM : ( ( rule__UoM__Alternatives ) ) ;
    public final void ruleUoM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:482:1: ( ( ( rule__UoM__Alternatives ) ) )
            // InternalSalesTransaction.g:483:2: ( ( rule__UoM__Alternatives ) )
            {
            // InternalSalesTransaction.g:483:2: ( ( rule__UoM__Alternatives ) )
            // InternalSalesTransaction.g:484:3: ( rule__UoM__Alternatives )
            {
             before(grammarAccess.getUoMAccess().getAlternatives()); 
            // InternalSalesTransaction.g:485:3: ( rule__UoM__Alternatives )
            // InternalSalesTransaction.g:485:4: rule__UoM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UoM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUoMAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUoM"


    // $ANTLR start "ruleTransactionType"
    // InternalSalesTransaction.g:494:1: ruleTransactionType : ( ( rule__TransactionType__Alternatives ) ) ;
    public final void ruleTransactionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:498:1: ( ( ( rule__TransactionType__Alternatives ) ) )
            // InternalSalesTransaction.g:499:2: ( ( rule__TransactionType__Alternatives ) )
            {
            // InternalSalesTransaction.g:499:2: ( ( rule__TransactionType__Alternatives ) )
            // InternalSalesTransaction.g:500:3: ( rule__TransactionType__Alternatives )
            {
             before(grammarAccess.getTransactionTypeAccess().getAlternatives()); 
            // InternalSalesTransaction.g:501:3: ( rule__TransactionType__Alternatives )
            // InternalSalesTransaction.g:501:4: rule__TransactionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransactionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransactionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransactionType"


    // $ANTLR start "rulePaymentMethod"
    // InternalSalesTransaction.g:510:1: rulePaymentMethod : ( ( rule__PaymentMethod__Alternatives ) ) ;
    public final void rulePaymentMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:514:1: ( ( ( rule__PaymentMethod__Alternatives ) ) )
            // InternalSalesTransaction.g:515:2: ( ( rule__PaymentMethod__Alternatives ) )
            {
            // InternalSalesTransaction.g:515:2: ( ( rule__PaymentMethod__Alternatives ) )
            // InternalSalesTransaction.g:516:3: ( rule__PaymentMethod__Alternatives )
            {
             before(grammarAccess.getPaymentMethodAccess().getAlternatives()); 
            // InternalSalesTransaction.g:517:3: ( rule__PaymentMethod__Alternatives )
            // InternalSalesTransaction.g:517:4: rule__PaymentMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PaymentMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPaymentMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentMethod"


    // $ANTLR start "ruleTaxType"
    // InternalSalesTransaction.g:526:1: ruleTaxType : ( ( rule__TaxType__Alternatives ) ) ;
    public final void ruleTaxType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:530:1: ( ( ( rule__TaxType__Alternatives ) ) )
            // InternalSalesTransaction.g:531:2: ( ( rule__TaxType__Alternatives ) )
            {
            // InternalSalesTransaction.g:531:2: ( ( rule__TaxType__Alternatives ) )
            // InternalSalesTransaction.g:532:3: ( rule__TaxType__Alternatives )
            {
             before(grammarAccess.getTaxTypeAccess().getAlternatives()); 
            // InternalSalesTransaction.g:533:3: ( rule__TaxType__Alternatives )
            // InternalSalesTransaction.g:533:4: rule__TaxType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaxType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaxTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaxType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSalesTransaction.g:541:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:545:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSalesTransaction.g:546:2: ( RULE_STRING )
                    {
                    // InternalSalesTransaction.g:546:2: ( RULE_STRING )
                    // InternalSalesTransaction.g:547:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:552:2: ( RULE_ID )
                    {
                    // InternalSalesTransaction.g:552:2: ( RULE_ID )
                    // InternalSalesTransaction.g:553:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalSalesTransaction.g:562:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:566:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSalesTransaction.g:567:2: ( 'E' )
                    {
                    // InternalSalesTransaction.g:567:2: ( 'E' )
                    // InternalSalesTransaction.g:568:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:573:2: ( 'e' )
                    {
                    // InternalSalesTransaction.g:573:2: ( 'e' )
                    // InternalSalesTransaction.g:574:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalSalesTransaction.g:583:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:587:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSalesTransaction.g:588:2: ( 'true' )
                    {
                    // InternalSalesTransaction.g:588:2: ( 'true' )
                    // InternalSalesTransaction.g:589:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:594:2: ( 'false' )
                    {
                    // InternalSalesTransaction.g:594:2: ( 'false' )
                    // InternalSalesTransaction.g:595:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__UoM__Alternatives"
    // InternalSalesTransaction.g:604:1: rule__UoM__Alternatives : ( ( ( 'PCS' ) ) | ( ( 'KG' ) ) | ( ( 'LTR' ) ) | ( ( 'M' ) ) );
    public final void rule__UoM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:608:1: ( ( ( 'PCS' ) ) | ( ( 'KG' ) ) | ( ( 'LTR' ) ) | ( ( 'M' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSalesTransaction.g:609:2: ( ( 'PCS' ) )
                    {
                    // InternalSalesTransaction.g:609:2: ( ( 'PCS' ) )
                    // InternalSalesTransaction.g:610:3: ( 'PCS' )
                    {
                     before(grammarAccess.getUoMAccess().getPCSEnumLiteralDeclaration_0()); 
                    // InternalSalesTransaction.g:611:3: ( 'PCS' )
                    // InternalSalesTransaction.g:611:4: 'PCS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getUoMAccess().getPCSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:615:2: ( ( 'KG' ) )
                    {
                    // InternalSalesTransaction.g:615:2: ( ( 'KG' ) )
                    // InternalSalesTransaction.g:616:3: ( 'KG' )
                    {
                     before(grammarAccess.getUoMAccess().getKGEnumLiteralDeclaration_1()); 
                    // InternalSalesTransaction.g:617:3: ( 'KG' )
                    // InternalSalesTransaction.g:617:4: 'KG'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getUoMAccess().getKGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:621:2: ( ( 'LTR' ) )
                    {
                    // InternalSalesTransaction.g:621:2: ( ( 'LTR' ) )
                    // InternalSalesTransaction.g:622:3: ( 'LTR' )
                    {
                     before(grammarAccess.getUoMAccess().getLTREnumLiteralDeclaration_2()); 
                    // InternalSalesTransaction.g:623:3: ( 'LTR' )
                    // InternalSalesTransaction.g:623:4: 'LTR'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getUoMAccess().getLTREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSalesTransaction.g:627:2: ( ( 'M' ) )
                    {
                    // InternalSalesTransaction.g:627:2: ( ( 'M' ) )
                    // InternalSalesTransaction.g:628:3: ( 'M' )
                    {
                     before(grammarAccess.getUoMAccess().getMEnumLiteralDeclaration_3()); 
                    // InternalSalesTransaction.g:629:3: ( 'M' )
                    // InternalSalesTransaction.g:629:4: 'M'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getUoMAccess().getMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UoM__Alternatives"


    // $ANTLR start "rule__TransactionType__Alternatives"
    // InternalSalesTransaction.g:637:1: rule__TransactionType__Alternatives : ( ( ( 'CashSales' ) ) | ( ( 'CreditSales' ) ) | ( ( 'AdvancePaymentSales' ) ) );
    public final void rule__TransactionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:641:1: ( ( ( 'CashSales' ) ) | ( ( 'CreditSales' ) ) | ( ( 'AdvancePaymentSales' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSalesTransaction.g:642:2: ( ( 'CashSales' ) )
                    {
                    // InternalSalesTransaction.g:642:2: ( ( 'CashSales' ) )
                    // InternalSalesTransaction.g:643:3: ( 'CashSales' )
                    {
                     before(grammarAccess.getTransactionTypeAccess().getCashSalesEnumLiteralDeclaration_0()); 
                    // InternalSalesTransaction.g:644:3: ( 'CashSales' )
                    // InternalSalesTransaction.g:644:4: 'CashSales'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransactionTypeAccess().getCashSalesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:648:2: ( ( 'CreditSales' ) )
                    {
                    // InternalSalesTransaction.g:648:2: ( ( 'CreditSales' ) )
                    // InternalSalesTransaction.g:649:3: ( 'CreditSales' )
                    {
                     before(grammarAccess.getTransactionTypeAccess().getCreditSalesEnumLiteralDeclaration_1()); 
                    // InternalSalesTransaction.g:650:3: ( 'CreditSales' )
                    // InternalSalesTransaction.g:650:4: 'CreditSales'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransactionTypeAccess().getCreditSalesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:654:2: ( ( 'AdvancePaymentSales' ) )
                    {
                    // InternalSalesTransaction.g:654:2: ( ( 'AdvancePaymentSales' ) )
                    // InternalSalesTransaction.g:655:3: ( 'AdvancePaymentSales' )
                    {
                     before(grammarAccess.getTransactionTypeAccess().getAdvancePaymentSalesEnumLiteralDeclaration_2()); 
                    // InternalSalesTransaction.g:656:3: ( 'AdvancePaymentSales' )
                    // InternalSalesTransaction.g:656:4: 'AdvancePaymentSales'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransactionTypeAccess().getAdvancePaymentSalesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransactionType__Alternatives"


    // $ANTLR start "rule__PaymentMethod__Alternatives"
    // InternalSalesTransaction.g:664:1: rule__PaymentMethod__Alternatives : ( ( ( 'Cash' ) ) | ( ( 'Card' ) ) );
    public final void rule__PaymentMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:668:1: ( ( ( 'Cash' ) ) | ( ( 'Card' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSalesTransaction.g:669:2: ( ( 'Cash' ) )
                    {
                    // InternalSalesTransaction.g:669:2: ( ( 'Cash' ) )
                    // InternalSalesTransaction.g:670:3: ( 'Cash' )
                    {
                     before(grammarAccess.getPaymentMethodAccess().getCashEnumLiteralDeclaration_0()); 
                    // InternalSalesTransaction.g:671:3: ( 'Cash' )
                    // InternalSalesTransaction.g:671:4: 'Cash'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPaymentMethodAccess().getCashEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:675:2: ( ( 'Card' ) )
                    {
                    // InternalSalesTransaction.g:675:2: ( ( 'Card' ) )
                    // InternalSalesTransaction.g:676:3: ( 'Card' )
                    {
                     before(grammarAccess.getPaymentMethodAccess().getCardEnumLiteralDeclaration_1()); 
                    // InternalSalesTransaction.g:677:3: ( 'Card' )
                    // InternalSalesTransaction.g:677:4: 'Card'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPaymentMethodAccess().getCardEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentMethod__Alternatives"


    // $ANTLR start "rule__TaxType__Alternatives"
    // InternalSalesTransaction.g:685:1: rule__TaxType__Alternatives : ( ( ( 'TaxExempt' ) ) | ( ( 'IncomeTax' ) ) | ( ( 'CorporateTax' ) ) | ( ( 'VAT' ) ) );
    public final void rule__TaxType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:689:1: ( ( ( 'TaxExempt' ) ) | ( ( 'IncomeTax' ) ) | ( ( 'CorporateTax' ) ) | ( ( 'VAT' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSalesTransaction.g:690:2: ( ( 'TaxExempt' ) )
                    {
                    // InternalSalesTransaction.g:690:2: ( ( 'TaxExempt' ) )
                    // InternalSalesTransaction.g:691:3: ( 'TaxExempt' )
                    {
                     before(grammarAccess.getTaxTypeAccess().getTaxExemptEnumLiteralDeclaration_0()); 
                    // InternalSalesTransaction.g:692:3: ( 'TaxExempt' )
                    // InternalSalesTransaction.g:692:4: 'TaxExempt'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxTypeAccess().getTaxExemptEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:696:2: ( ( 'IncomeTax' ) )
                    {
                    // InternalSalesTransaction.g:696:2: ( ( 'IncomeTax' ) )
                    // InternalSalesTransaction.g:697:3: ( 'IncomeTax' )
                    {
                     before(grammarAccess.getTaxTypeAccess().getIncomeTaxEnumLiteralDeclaration_1()); 
                    // InternalSalesTransaction.g:698:3: ( 'IncomeTax' )
                    // InternalSalesTransaction.g:698:4: 'IncomeTax'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxTypeAccess().getIncomeTaxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSalesTransaction.g:702:2: ( ( 'CorporateTax' ) )
                    {
                    // InternalSalesTransaction.g:702:2: ( ( 'CorporateTax' ) )
                    // InternalSalesTransaction.g:703:3: ( 'CorporateTax' )
                    {
                     before(grammarAccess.getTaxTypeAccess().getCorporateTaxEnumLiteralDeclaration_2()); 
                    // InternalSalesTransaction.g:704:3: ( 'CorporateTax' )
                    // InternalSalesTransaction.g:704:4: 'CorporateTax'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxTypeAccess().getCorporateTaxEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSalesTransaction.g:708:2: ( ( 'VAT' ) )
                    {
                    // InternalSalesTransaction.g:708:2: ( ( 'VAT' ) )
                    // InternalSalesTransaction.g:709:3: ( 'VAT' )
                    {
                     before(grammarAccess.getTaxTypeAccess().getVATEnumLiteralDeclaration_3()); 
                    // InternalSalesTransaction.g:710:3: ( 'VAT' )
                    // InternalSalesTransaction.g:710:4: 'VAT'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaxTypeAccess().getVATEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaxType__Alternatives"


    // $ANTLR start "rule__Company__Group__0"
    // InternalSalesTransaction.g:718:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:722:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalSalesTransaction.g:723:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalSalesTransaction.g:730:1: rule__Company__Group__0__Impl : ( 'company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:734:1: ( ( 'company' ) )
            // InternalSalesTransaction.g:735:1: ( 'company' )
            {
            // InternalSalesTransaction.g:735:1: ( 'company' )
            // InternalSalesTransaction.g:736:2: 'company'
            {
             before(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalSalesTransaction.g:745:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:749:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalSalesTransaction.g:750:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalSalesTransaction.g:757:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:761:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalSalesTransaction.g:762:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalSalesTransaction.g:762:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalSalesTransaction.g:763:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalSalesTransaction.g:764:2: ( rule__Company__NameAssignment_1 )
            // InternalSalesTransaction.g:764:3: rule__Company__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalSalesTransaction.g:772:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:776:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalSalesTransaction.g:777:2: rule__Company__Group__2__Impl rule__Company__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalSalesTransaction.g:784:1: rule__Company__Group__2__Impl : ( '{' ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:788:1: ( ( '{' ) )
            // InternalSalesTransaction.g:789:1: ( '{' )
            {
            // InternalSalesTransaction.g:789:1: ( '{' )
            // InternalSalesTransaction.g:790:2: '{'
            {
             before(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__3"
    // InternalSalesTransaction.g:799:1: rule__Company__Group__3 : rule__Company__Group__3__Impl rule__Company__Group__4 ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:803:1: ( rule__Company__Group__3__Impl rule__Company__Group__4 )
            // InternalSalesTransaction.g:804:2: rule__Company__Group__3__Impl rule__Company__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3"


    // $ANTLR start "rule__Company__Group__3__Impl"
    // InternalSalesTransaction.g:811:1: rule__Company__Group__3__Impl : ( ( rule__Company__Group_3__0 )? ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:815:1: ( ( ( rule__Company__Group_3__0 )? ) )
            // InternalSalesTransaction.g:816:1: ( ( rule__Company__Group_3__0 )? )
            {
            // InternalSalesTransaction.g:816:1: ( ( rule__Company__Group_3__0 )? )
            // InternalSalesTransaction.g:817:2: ( rule__Company__Group_3__0 )?
            {
             before(grammarAccess.getCompanyAccess().getGroup_3()); 
            // InternalSalesTransaction.g:818:2: ( rule__Company__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSalesTransaction.g:818:3: rule__Company__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Company__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompanyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3__Impl"


    // $ANTLR start "rule__Company__Group__4"
    // InternalSalesTransaction.g:826:1: rule__Company__Group__4 : rule__Company__Group__4__Impl rule__Company__Group__5 ;
    public final void rule__Company__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:830:1: ( rule__Company__Group__4__Impl rule__Company__Group__5 )
            // InternalSalesTransaction.g:831:2: rule__Company__Group__4__Impl rule__Company__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4"


    // $ANTLR start "rule__Company__Group__4__Impl"
    // InternalSalesTransaction.g:838:1: rule__Company__Group__4__Impl : ( ( rule__Company__AddressAssignment_4 )? ) ;
    public final void rule__Company__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:842:1: ( ( ( rule__Company__AddressAssignment_4 )? ) )
            // InternalSalesTransaction.g:843:1: ( ( rule__Company__AddressAssignment_4 )? )
            {
            // InternalSalesTransaction.g:843:1: ( ( rule__Company__AddressAssignment_4 )? )
            // InternalSalesTransaction.g:844:2: ( rule__Company__AddressAssignment_4 )?
            {
             before(grammarAccess.getCompanyAccess().getAddressAssignment_4()); 
            // InternalSalesTransaction.g:845:2: ( rule__Company__AddressAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSalesTransaction.g:845:3: rule__Company__AddressAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Company__AddressAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompanyAccess().getAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4__Impl"


    // $ANTLR start "rule__Company__Group__5"
    // InternalSalesTransaction.g:853:1: rule__Company__Group__5 : rule__Company__Group__5__Impl rule__Company__Group__6 ;
    public final void rule__Company__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:857:1: ( rule__Company__Group__5__Impl rule__Company__Group__6 )
            // InternalSalesTransaction.g:858:2: rule__Company__Group__5__Impl rule__Company__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5"


    // $ANTLR start "rule__Company__Group__5__Impl"
    // InternalSalesTransaction.g:865:1: rule__Company__Group__5__Impl : ( 'stores' ) ;
    public final void rule__Company__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:869:1: ( ( 'stores' ) )
            // InternalSalesTransaction.g:870:1: ( 'stores' )
            {
            // InternalSalesTransaction.g:870:1: ( 'stores' )
            // InternalSalesTransaction.g:871:2: 'stores'
            {
             before(grammarAccess.getCompanyAccess().getStoresKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getStoresKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5__Impl"


    // $ANTLR start "rule__Company__Group__6"
    // InternalSalesTransaction.g:880:1: rule__Company__Group__6 : rule__Company__Group__6__Impl rule__Company__Group__7 ;
    public final void rule__Company__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:884:1: ( rule__Company__Group__6__Impl rule__Company__Group__7 )
            // InternalSalesTransaction.g:885:2: rule__Company__Group__6__Impl rule__Company__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6"


    // $ANTLR start "rule__Company__Group__6__Impl"
    // InternalSalesTransaction.g:892:1: rule__Company__Group__6__Impl : ( '{' ) ;
    public final void rule__Company__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:896:1: ( ( '{' ) )
            // InternalSalesTransaction.g:897:1: ( '{' )
            {
            // InternalSalesTransaction.g:897:1: ( '{' )
            // InternalSalesTransaction.g:898:2: '{'
            {
             before(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6__Impl"


    // $ANTLR start "rule__Company__Group__7"
    // InternalSalesTransaction.g:907:1: rule__Company__Group__7 : rule__Company__Group__7__Impl rule__Company__Group__8 ;
    public final void rule__Company__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:911:1: ( rule__Company__Group__7__Impl rule__Company__Group__8 )
            // InternalSalesTransaction.g:912:2: rule__Company__Group__7__Impl rule__Company__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7"


    // $ANTLR start "rule__Company__Group__7__Impl"
    // InternalSalesTransaction.g:919:1: rule__Company__Group__7__Impl : ( ( rule__Company__StoreAssignment_7 ) ) ;
    public final void rule__Company__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:923:1: ( ( ( rule__Company__StoreAssignment_7 ) ) )
            // InternalSalesTransaction.g:924:1: ( ( rule__Company__StoreAssignment_7 ) )
            {
            // InternalSalesTransaction.g:924:1: ( ( rule__Company__StoreAssignment_7 ) )
            // InternalSalesTransaction.g:925:2: ( rule__Company__StoreAssignment_7 )
            {
             before(grammarAccess.getCompanyAccess().getStoreAssignment_7()); 
            // InternalSalesTransaction.g:926:2: ( rule__Company__StoreAssignment_7 )
            // InternalSalesTransaction.g:926:3: rule__Company__StoreAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Company__StoreAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getStoreAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7__Impl"


    // $ANTLR start "rule__Company__Group__8"
    // InternalSalesTransaction.g:934:1: rule__Company__Group__8 : rule__Company__Group__8__Impl rule__Company__Group__9 ;
    public final void rule__Company__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:938:1: ( rule__Company__Group__8__Impl rule__Company__Group__9 )
            // InternalSalesTransaction.g:939:2: rule__Company__Group__8__Impl rule__Company__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8"


    // $ANTLR start "rule__Company__Group__8__Impl"
    // InternalSalesTransaction.g:946:1: rule__Company__Group__8__Impl : ( ( rule__Company__Group_8__0 )* ) ;
    public final void rule__Company__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:950:1: ( ( ( rule__Company__Group_8__0 )* ) )
            // InternalSalesTransaction.g:951:1: ( ( rule__Company__Group_8__0 )* )
            {
            // InternalSalesTransaction.g:951:1: ( ( rule__Company__Group_8__0 )* )
            // InternalSalesTransaction.g:952:2: ( rule__Company__Group_8__0 )*
            {
             before(grammarAccess.getCompanyAccess().getGroup_8()); 
            // InternalSalesTransaction.g:953:2: ( rule__Company__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSalesTransaction.g:953:3: rule__Company__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Company__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8__Impl"


    // $ANTLR start "rule__Company__Group__9"
    // InternalSalesTransaction.g:961:1: rule__Company__Group__9 : rule__Company__Group__9__Impl rule__Company__Group__10 ;
    public final void rule__Company__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:965:1: ( rule__Company__Group__9__Impl rule__Company__Group__10 )
            // InternalSalesTransaction.g:966:2: rule__Company__Group__9__Impl rule__Company__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__9"


    // $ANTLR start "rule__Company__Group__9__Impl"
    // InternalSalesTransaction.g:973:1: rule__Company__Group__9__Impl : ( '}' ) ;
    public final void rule__Company__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:977:1: ( ( '}' ) )
            // InternalSalesTransaction.g:978:1: ( '}' )
            {
            // InternalSalesTransaction.g:978:1: ( '}' )
            // InternalSalesTransaction.g:979:2: '}'
            {
             before(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__9__Impl"


    // $ANTLR start "rule__Company__Group__10"
    // InternalSalesTransaction.g:988:1: rule__Company__Group__10 : rule__Company__Group__10__Impl rule__Company__Group__11 ;
    public final void rule__Company__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:992:1: ( rule__Company__Group__10__Impl rule__Company__Group__11 )
            // InternalSalesTransaction.g:993:2: rule__Company__Group__10__Impl rule__Company__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Company__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__10"


    // $ANTLR start "rule__Company__Group__10__Impl"
    // InternalSalesTransaction.g:1000:1: rule__Company__Group__10__Impl : ( ( rule__Company__Group_10__0 )? ) ;
    public final void rule__Company__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1004:1: ( ( ( rule__Company__Group_10__0 )? ) )
            // InternalSalesTransaction.g:1005:1: ( ( rule__Company__Group_10__0 )? )
            {
            // InternalSalesTransaction.g:1005:1: ( ( rule__Company__Group_10__0 )? )
            // InternalSalesTransaction.g:1006:2: ( rule__Company__Group_10__0 )?
            {
             before(grammarAccess.getCompanyAccess().getGroup_10()); 
            // InternalSalesTransaction.g:1007:2: ( rule__Company__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSalesTransaction.g:1007:3: rule__Company__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Company__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompanyAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__10__Impl"


    // $ANTLR start "rule__Company__Group__11"
    // InternalSalesTransaction.g:1015:1: rule__Company__Group__11 : rule__Company__Group__11__Impl ;
    public final void rule__Company__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1019:1: ( rule__Company__Group__11__Impl )
            // InternalSalesTransaction.g:1020:2: rule__Company__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__11"


    // $ANTLR start "rule__Company__Group__11__Impl"
    // InternalSalesTransaction.g:1026:1: rule__Company__Group__11__Impl : ( '}' ) ;
    public final void rule__Company__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1030:1: ( ( '}' ) )
            // InternalSalesTransaction.g:1031:1: ( '}' )
            {
            // InternalSalesTransaction.g:1031:1: ( '}' )
            // InternalSalesTransaction.g:1032:2: '}'
            {
             before(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__11__Impl"


    // $ANTLR start "rule__Company__Group_3__0"
    // InternalSalesTransaction.g:1042:1: rule__Company__Group_3__0 : rule__Company__Group_3__0__Impl rule__Company__Group_3__1 ;
    public final void rule__Company__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1046:1: ( rule__Company__Group_3__0__Impl rule__Company__Group_3__1 )
            // InternalSalesTransaction.g:1047:2: rule__Company__Group_3__0__Impl rule__Company__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_3__0"


    // $ANTLR start "rule__Company__Group_3__0__Impl"
    // InternalSalesTransaction.g:1054:1: rule__Company__Group_3__0__Impl : ( 'codice' ) ;
    public final void rule__Company__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1058:1: ( ( 'codice' ) )
            // InternalSalesTransaction.g:1059:1: ( 'codice' )
            {
            // InternalSalesTransaction.g:1059:1: ( 'codice' )
            // InternalSalesTransaction.g:1060:2: 'codice'
            {
             before(grammarAccess.getCompanyAccess().getCodiceKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCodiceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_3__0__Impl"


    // $ANTLR start "rule__Company__Group_3__1"
    // InternalSalesTransaction.g:1069:1: rule__Company__Group_3__1 : rule__Company__Group_3__1__Impl ;
    public final void rule__Company__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1073:1: ( rule__Company__Group_3__1__Impl )
            // InternalSalesTransaction.g:1074:2: rule__Company__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_3__1"


    // $ANTLR start "rule__Company__Group_3__1__Impl"
    // InternalSalesTransaction.g:1080:1: rule__Company__Group_3__1__Impl : ( ( rule__Company__CodiceAssignment_3_1 ) ) ;
    public final void rule__Company__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1084:1: ( ( ( rule__Company__CodiceAssignment_3_1 ) ) )
            // InternalSalesTransaction.g:1085:1: ( ( rule__Company__CodiceAssignment_3_1 ) )
            {
            // InternalSalesTransaction.g:1085:1: ( ( rule__Company__CodiceAssignment_3_1 ) )
            // InternalSalesTransaction.g:1086:2: ( rule__Company__CodiceAssignment_3_1 )
            {
             before(grammarAccess.getCompanyAccess().getCodiceAssignment_3_1()); 
            // InternalSalesTransaction.g:1087:2: ( rule__Company__CodiceAssignment_3_1 )
            // InternalSalesTransaction.g:1087:3: rule__Company__CodiceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__CodiceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getCodiceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_3__1__Impl"


    // $ANTLR start "rule__Company__Group_8__0"
    // InternalSalesTransaction.g:1096:1: rule__Company__Group_8__0 : rule__Company__Group_8__0__Impl rule__Company__Group_8__1 ;
    public final void rule__Company__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1100:1: ( rule__Company__Group_8__0__Impl rule__Company__Group_8__1 )
            // InternalSalesTransaction.g:1101:2: rule__Company__Group_8__0__Impl rule__Company__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__0"


    // $ANTLR start "rule__Company__Group_8__0__Impl"
    // InternalSalesTransaction.g:1108:1: rule__Company__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Company__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1112:1: ( ( ',' ) )
            // InternalSalesTransaction.g:1113:1: ( ',' )
            {
            // InternalSalesTransaction.g:1113:1: ( ',' )
            // InternalSalesTransaction.g:1114:2: ','
            {
             before(grammarAccess.getCompanyAccess().getCommaKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__0__Impl"


    // $ANTLR start "rule__Company__Group_8__1"
    // InternalSalesTransaction.g:1123:1: rule__Company__Group_8__1 : rule__Company__Group_8__1__Impl ;
    public final void rule__Company__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1127:1: ( rule__Company__Group_8__1__Impl )
            // InternalSalesTransaction.g:1128:2: rule__Company__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__1"


    // $ANTLR start "rule__Company__Group_8__1__Impl"
    // InternalSalesTransaction.g:1134:1: rule__Company__Group_8__1__Impl : ( ( rule__Company__StoreAssignment_8_1 ) ) ;
    public final void rule__Company__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1138:1: ( ( ( rule__Company__StoreAssignment_8_1 ) ) )
            // InternalSalesTransaction.g:1139:1: ( ( rule__Company__StoreAssignment_8_1 ) )
            {
            // InternalSalesTransaction.g:1139:1: ( ( rule__Company__StoreAssignment_8_1 ) )
            // InternalSalesTransaction.g:1140:2: ( rule__Company__StoreAssignment_8_1 )
            {
             before(grammarAccess.getCompanyAccess().getStoreAssignment_8_1()); 
            // InternalSalesTransaction.g:1141:2: ( rule__Company__StoreAssignment_8_1 )
            // InternalSalesTransaction.g:1141:3: rule__Company__StoreAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__StoreAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getStoreAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_8__1__Impl"


    // $ANTLR start "rule__Company__Group_10__0"
    // InternalSalesTransaction.g:1150:1: rule__Company__Group_10__0 : rule__Company__Group_10__0__Impl rule__Company__Group_10__1 ;
    public final void rule__Company__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1154:1: ( rule__Company__Group_10__0__Impl rule__Company__Group_10__1 )
            // InternalSalesTransaction.g:1155:2: rule__Company__Group_10__0__Impl rule__Company__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__0"


    // $ANTLR start "rule__Company__Group_10__0__Impl"
    // InternalSalesTransaction.g:1162:1: rule__Company__Group_10__0__Impl : ( 'transactions' ) ;
    public final void rule__Company__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1166:1: ( ( 'transactions' ) )
            // InternalSalesTransaction.g:1167:1: ( 'transactions' )
            {
            // InternalSalesTransaction.g:1167:1: ( 'transactions' )
            // InternalSalesTransaction.g:1168:2: 'transactions'
            {
             before(grammarAccess.getCompanyAccess().getTransactionsKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getTransactionsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__0__Impl"


    // $ANTLR start "rule__Company__Group_10__1"
    // InternalSalesTransaction.g:1177:1: rule__Company__Group_10__1 : rule__Company__Group_10__1__Impl rule__Company__Group_10__2 ;
    public final void rule__Company__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1181:1: ( rule__Company__Group_10__1__Impl rule__Company__Group_10__2 )
            // InternalSalesTransaction.g:1182:2: rule__Company__Group_10__1__Impl rule__Company__Group_10__2
            {
            pushFollow(FOLLOW_10);
            rule__Company__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__1"


    // $ANTLR start "rule__Company__Group_10__1__Impl"
    // InternalSalesTransaction.g:1189:1: rule__Company__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Company__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1193:1: ( ( '{' ) )
            // InternalSalesTransaction.g:1194:1: ( '{' )
            {
            // InternalSalesTransaction.g:1194:1: ( '{' )
            // InternalSalesTransaction.g:1195:2: '{'
            {
             before(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__1__Impl"


    // $ANTLR start "rule__Company__Group_10__2"
    // InternalSalesTransaction.g:1204:1: rule__Company__Group_10__2 : rule__Company__Group_10__2__Impl rule__Company__Group_10__3 ;
    public final void rule__Company__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1208:1: ( rule__Company__Group_10__2__Impl rule__Company__Group_10__3 )
            // InternalSalesTransaction.g:1209:2: rule__Company__Group_10__2__Impl rule__Company__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__2"


    // $ANTLR start "rule__Company__Group_10__2__Impl"
    // InternalSalesTransaction.g:1216:1: rule__Company__Group_10__2__Impl : ( ( rule__Company__TransactionAssignment_10_2 ) ) ;
    public final void rule__Company__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1220:1: ( ( ( rule__Company__TransactionAssignment_10_2 ) ) )
            // InternalSalesTransaction.g:1221:1: ( ( rule__Company__TransactionAssignment_10_2 ) )
            {
            // InternalSalesTransaction.g:1221:1: ( ( rule__Company__TransactionAssignment_10_2 ) )
            // InternalSalesTransaction.g:1222:2: ( rule__Company__TransactionAssignment_10_2 )
            {
             before(grammarAccess.getCompanyAccess().getTransactionAssignment_10_2()); 
            // InternalSalesTransaction.g:1223:2: ( rule__Company__TransactionAssignment_10_2 )
            // InternalSalesTransaction.g:1223:3: rule__Company__TransactionAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Company__TransactionAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getTransactionAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__2__Impl"


    // $ANTLR start "rule__Company__Group_10__3"
    // InternalSalesTransaction.g:1231:1: rule__Company__Group_10__3 : rule__Company__Group_10__3__Impl rule__Company__Group_10__4 ;
    public final void rule__Company__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1235:1: ( rule__Company__Group_10__3__Impl rule__Company__Group_10__4 )
            // InternalSalesTransaction.g:1236:2: rule__Company__Group_10__3__Impl rule__Company__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Company__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__3"


    // $ANTLR start "rule__Company__Group_10__3__Impl"
    // InternalSalesTransaction.g:1243:1: rule__Company__Group_10__3__Impl : ( ( rule__Company__Group_10_3__0 )* ) ;
    public final void rule__Company__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1247:1: ( ( ( rule__Company__Group_10_3__0 )* ) )
            // InternalSalesTransaction.g:1248:1: ( ( rule__Company__Group_10_3__0 )* )
            {
            // InternalSalesTransaction.g:1248:1: ( ( rule__Company__Group_10_3__0 )* )
            // InternalSalesTransaction.g:1249:2: ( rule__Company__Group_10_3__0 )*
            {
             before(grammarAccess.getCompanyAccess().getGroup_10_3()); 
            // InternalSalesTransaction.g:1250:2: ( rule__Company__Group_10_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSalesTransaction.g:1250:3: rule__Company__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Company__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__3__Impl"


    // $ANTLR start "rule__Company__Group_10__4"
    // InternalSalesTransaction.g:1258:1: rule__Company__Group_10__4 : rule__Company__Group_10__4__Impl ;
    public final void rule__Company__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1262:1: ( rule__Company__Group_10__4__Impl )
            // InternalSalesTransaction.g:1263:2: rule__Company__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__4"


    // $ANTLR start "rule__Company__Group_10__4__Impl"
    // InternalSalesTransaction.g:1269:1: rule__Company__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Company__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1273:1: ( ( '}' ) )
            // InternalSalesTransaction.g:1274:1: ( '}' )
            {
            // InternalSalesTransaction.g:1274:1: ( '}' )
            // InternalSalesTransaction.g:1275:2: '}'
            {
             before(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10__4__Impl"


    // $ANTLR start "rule__Company__Group_10_3__0"
    // InternalSalesTransaction.g:1285:1: rule__Company__Group_10_3__0 : rule__Company__Group_10_3__0__Impl rule__Company__Group_10_3__1 ;
    public final void rule__Company__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1289:1: ( rule__Company__Group_10_3__0__Impl rule__Company__Group_10_3__1 )
            // InternalSalesTransaction.g:1290:2: rule__Company__Group_10_3__0__Impl rule__Company__Group_10_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Company__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10_3__0"


    // $ANTLR start "rule__Company__Group_10_3__0__Impl"
    // InternalSalesTransaction.g:1297:1: rule__Company__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Company__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1301:1: ( ( ',' ) )
            // InternalSalesTransaction.g:1302:1: ( ',' )
            {
            // InternalSalesTransaction.g:1302:1: ( ',' )
            // InternalSalesTransaction.g:1303:2: ','
            {
             before(grammarAccess.getCompanyAccess().getCommaKeyword_10_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10_3__0__Impl"


    // $ANTLR start "rule__Company__Group_10_3__1"
    // InternalSalesTransaction.g:1312:1: rule__Company__Group_10_3__1 : rule__Company__Group_10_3__1__Impl ;
    public final void rule__Company__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1316:1: ( rule__Company__Group_10_3__1__Impl )
            // InternalSalesTransaction.g:1317:2: rule__Company__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10_3__1"


    // $ANTLR start "rule__Company__Group_10_3__1__Impl"
    // InternalSalesTransaction.g:1323:1: rule__Company__Group_10_3__1__Impl : ( ( rule__Company__TransactionAssignment_10_3_1 ) ) ;
    public final void rule__Company__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1327:1: ( ( ( rule__Company__TransactionAssignment_10_3_1 ) ) )
            // InternalSalesTransaction.g:1328:1: ( ( rule__Company__TransactionAssignment_10_3_1 ) )
            {
            // InternalSalesTransaction.g:1328:1: ( ( rule__Company__TransactionAssignment_10_3_1 ) )
            // InternalSalesTransaction.g:1329:2: ( rule__Company__TransactionAssignment_10_3_1 )
            {
             before(grammarAccess.getCompanyAccess().getTransactionAssignment_10_3_1()); 
            // InternalSalesTransaction.g:1330:2: ( rule__Company__TransactionAssignment_10_3_1 )
            // InternalSalesTransaction.g:1330:3: rule__Company__TransactionAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__TransactionAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getTransactionAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group_10_3__1__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalSalesTransaction.g:1339:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1343:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalSalesTransaction.g:1344:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalSalesTransaction.g:1351:1: rule__Address__Group__0__Impl : ( () ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1355:1: ( ( () ) )
            // InternalSalesTransaction.g:1356:1: ( () )
            {
            // InternalSalesTransaction.g:1356:1: ( () )
            // InternalSalesTransaction.g:1357:2: ()
            {
             before(grammarAccess.getAddressAccess().getAddressAction_0()); 
            // InternalSalesTransaction.g:1358:2: ()
            // InternalSalesTransaction.g:1358:3: 
            {
            }

             after(grammarAccess.getAddressAccess().getAddressAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalSalesTransaction.g:1366:1: rule__Address__Group__1 : rule__Address__Group__1__Impl rule__Address__Group__2 ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1370:1: ( rule__Address__Group__1__Impl rule__Address__Group__2 )
            // InternalSalesTransaction.g:1371:2: rule__Address__Group__1__Impl rule__Address__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Address__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalSalesTransaction.g:1378:1: rule__Address__Group__1__Impl : ( 'address' ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1382:1: ( ( 'address' ) )
            // InternalSalesTransaction.g:1383:1: ( 'address' )
            {
            // InternalSalesTransaction.g:1383:1: ( 'address' )
            // InternalSalesTransaction.g:1384:2: 'address'
            {
             before(grammarAccess.getAddressAccess().getAddressKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getAddressKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__2"
    // InternalSalesTransaction.g:1393:1: rule__Address__Group__2 : rule__Address__Group__2__Impl rule__Address__Group__3 ;
    public final void rule__Address__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1397:1: ( rule__Address__Group__2__Impl rule__Address__Group__3 )
            // InternalSalesTransaction.g:1398:2: rule__Address__Group__2__Impl rule__Address__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2"


    // $ANTLR start "rule__Address__Group__2__Impl"
    // InternalSalesTransaction.g:1405:1: rule__Address__Group__2__Impl : ( '{' ) ;
    public final void rule__Address__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1409:1: ( ( '{' ) )
            // InternalSalesTransaction.g:1410:1: ( '{' )
            {
            // InternalSalesTransaction.g:1410:1: ( '{' )
            // InternalSalesTransaction.g:1411:2: '{'
            {
             before(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2__Impl"


    // $ANTLR start "rule__Address__Group__3"
    // InternalSalesTransaction.g:1420:1: rule__Address__Group__3 : rule__Address__Group__3__Impl rule__Address__Group__4 ;
    public final void rule__Address__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1424:1: ( rule__Address__Group__3__Impl rule__Address__Group__4 )
            // InternalSalesTransaction.g:1425:2: rule__Address__Group__3__Impl rule__Address__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3"


    // $ANTLR start "rule__Address__Group__3__Impl"
    // InternalSalesTransaction.g:1432:1: rule__Address__Group__3__Impl : ( ( rule__Address__Group_3__0 )? ) ;
    public final void rule__Address__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1436:1: ( ( ( rule__Address__Group_3__0 )? ) )
            // InternalSalesTransaction.g:1437:1: ( ( rule__Address__Group_3__0 )? )
            {
            // InternalSalesTransaction.g:1437:1: ( ( rule__Address__Group_3__0 )? )
            // InternalSalesTransaction.g:1438:2: ( rule__Address__Group_3__0 )?
            {
             before(grammarAccess.getAddressAccess().getGroup_3()); 
            // InternalSalesTransaction.g:1439:2: ( rule__Address__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSalesTransaction.g:1439:3: rule__Address__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Address__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3__Impl"


    // $ANTLR start "rule__Address__Group__4"
    // InternalSalesTransaction.g:1447:1: rule__Address__Group__4 : rule__Address__Group__4__Impl rule__Address__Group__5 ;
    public final void rule__Address__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1451:1: ( rule__Address__Group__4__Impl rule__Address__Group__5 )
            // InternalSalesTransaction.g:1452:2: rule__Address__Group__4__Impl rule__Address__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4"


    // $ANTLR start "rule__Address__Group__4__Impl"
    // InternalSalesTransaction.g:1459:1: rule__Address__Group__4__Impl : ( ( rule__Address__Group_4__0 )? ) ;
    public final void rule__Address__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1463:1: ( ( ( rule__Address__Group_4__0 )? ) )
            // InternalSalesTransaction.g:1464:1: ( ( rule__Address__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:1464:1: ( ( rule__Address__Group_4__0 )? )
            // InternalSalesTransaction.g:1465:2: ( rule__Address__Group_4__0 )?
            {
             before(grammarAccess.getAddressAccess().getGroup_4()); 
            // InternalSalesTransaction.g:1466:2: ( rule__Address__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSalesTransaction.g:1466:3: rule__Address__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Address__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4__Impl"


    // $ANTLR start "rule__Address__Group__5"
    // InternalSalesTransaction.g:1474:1: rule__Address__Group__5 : rule__Address__Group__5__Impl rule__Address__Group__6 ;
    public final void rule__Address__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1478:1: ( rule__Address__Group__5__Impl rule__Address__Group__6 )
            // InternalSalesTransaction.g:1479:2: rule__Address__Group__5__Impl rule__Address__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5"


    // $ANTLR start "rule__Address__Group__5__Impl"
    // InternalSalesTransaction.g:1486:1: rule__Address__Group__5__Impl : ( ( rule__Address__Group_5__0 )? ) ;
    public final void rule__Address__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1490:1: ( ( ( rule__Address__Group_5__0 )? ) )
            // InternalSalesTransaction.g:1491:1: ( ( rule__Address__Group_5__0 )? )
            {
            // InternalSalesTransaction.g:1491:1: ( ( rule__Address__Group_5__0 )? )
            // InternalSalesTransaction.g:1492:2: ( rule__Address__Group_5__0 )?
            {
             before(grammarAccess.getAddressAccess().getGroup_5()); 
            // InternalSalesTransaction.g:1493:2: ( rule__Address__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSalesTransaction.g:1493:3: rule__Address__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Address__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5__Impl"


    // $ANTLR start "rule__Address__Group__6"
    // InternalSalesTransaction.g:1501:1: rule__Address__Group__6 : rule__Address__Group__6__Impl rule__Address__Group__7 ;
    public final void rule__Address__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1505:1: ( rule__Address__Group__6__Impl rule__Address__Group__7 )
            // InternalSalesTransaction.g:1506:2: rule__Address__Group__6__Impl rule__Address__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6"


    // $ANTLR start "rule__Address__Group__6__Impl"
    // InternalSalesTransaction.g:1513:1: rule__Address__Group__6__Impl : ( ( rule__Address__Group_6__0 )? ) ;
    public final void rule__Address__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1517:1: ( ( ( rule__Address__Group_6__0 )? ) )
            // InternalSalesTransaction.g:1518:1: ( ( rule__Address__Group_6__0 )? )
            {
            // InternalSalesTransaction.g:1518:1: ( ( rule__Address__Group_6__0 )? )
            // InternalSalesTransaction.g:1519:2: ( rule__Address__Group_6__0 )?
            {
             before(grammarAccess.getAddressAccess().getGroup_6()); 
            // InternalSalesTransaction.g:1520:2: ( rule__Address__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSalesTransaction.g:1520:3: rule__Address__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Address__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6__Impl"


    // $ANTLR start "rule__Address__Group__7"
    // InternalSalesTransaction.g:1528:1: rule__Address__Group__7 : rule__Address__Group__7__Impl ;
    public final void rule__Address__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1532:1: ( rule__Address__Group__7__Impl )
            // InternalSalesTransaction.g:1533:2: rule__Address__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7"


    // $ANTLR start "rule__Address__Group__7__Impl"
    // InternalSalesTransaction.g:1539:1: rule__Address__Group__7__Impl : ( '}' ) ;
    public final void rule__Address__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1543:1: ( ( '}' ) )
            // InternalSalesTransaction.g:1544:1: ( '}' )
            {
            // InternalSalesTransaction.g:1544:1: ( '}' )
            // InternalSalesTransaction.g:1545:2: '}'
            {
             before(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7__Impl"


    // $ANTLR start "rule__Address__Group_3__0"
    // InternalSalesTransaction.g:1555:1: rule__Address__Group_3__0 : rule__Address__Group_3__0__Impl rule__Address__Group_3__1 ;
    public final void rule__Address__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1559:1: ( rule__Address__Group_3__0__Impl rule__Address__Group_3__1 )
            // InternalSalesTransaction.g:1560:2: rule__Address__Group_3__0__Impl rule__Address__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_3__0"


    // $ANTLR start "rule__Address__Group_3__0__Impl"
    // InternalSalesTransaction.g:1567:1: rule__Address__Group_3__0__Impl : ( 'street' ) ;
    public final void rule__Address__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1571:1: ( ( 'street' ) )
            // InternalSalesTransaction.g:1572:1: ( 'street' )
            {
            // InternalSalesTransaction.g:1572:1: ( 'street' )
            // InternalSalesTransaction.g:1573:2: 'street'
            {
             before(grammarAccess.getAddressAccess().getStreetKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_3__0__Impl"


    // $ANTLR start "rule__Address__Group_3__1"
    // InternalSalesTransaction.g:1582:1: rule__Address__Group_3__1 : rule__Address__Group_3__1__Impl ;
    public final void rule__Address__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1586:1: ( rule__Address__Group_3__1__Impl )
            // InternalSalesTransaction.g:1587:2: rule__Address__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_3__1"


    // $ANTLR start "rule__Address__Group_3__1__Impl"
    // InternalSalesTransaction.g:1593:1: rule__Address__Group_3__1__Impl : ( ( rule__Address__StreetAssignment_3_1 ) ) ;
    public final void rule__Address__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1597:1: ( ( ( rule__Address__StreetAssignment_3_1 ) ) )
            // InternalSalesTransaction.g:1598:1: ( ( rule__Address__StreetAssignment_3_1 ) )
            {
            // InternalSalesTransaction.g:1598:1: ( ( rule__Address__StreetAssignment_3_1 ) )
            // InternalSalesTransaction.g:1599:2: ( rule__Address__StreetAssignment_3_1 )
            {
             before(grammarAccess.getAddressAccess().getStreetAssignment_3_1()); 
            // InternalSalesTransaction.g:1600:2: ( rule__Address__StreetAssignment_3_1 )
            // InternalSalesTransaction.g:1600:3: rule__Address__StreetAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__StreetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getStreetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_3__1__Impl"


    // $ANTLR start "rule__Address__Group_4__0"
    // InternalSalesTransaction.g:1609:1: rule__Address__Group_4__0 : rule__Address__Group_4__0__Impl rule__Address__Group_4__1 ;
    public final void rule__Address__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1613:1: ( rule__Address__Group_4__0__Impl rule__Address__Group_4__1 )
            // InternalSalesTransaction.g:1614:2: rule__Address__Group_4__0__Impl rule__Address__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_4__0"


    // $ANTLR start "rule__Address__Group_4__0__Impl"
    // InternalSalesTransaction.g:1621:1: rule__Address__Group_4__0__Impl : ( 'city' ) ;
    public final void rule__Address__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1625:1: ( ( 'city' ) )
            // InternalSalesTransaction.g:1626:1: ( 'city' )
            {
            // InternalSalesTransaction.g:1626:1: ( 'city' )
            // InternalSalesTransaction.g:1627:2: 'city'
            {
             before(grammarAccess.getAddressAccess().getCityKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_4__0__Impl"


    // $ANTLR start "rule__Address__Group_4__1"
    // InternalSalesTransaction.g:1636:1: rule__Address__Group_4__1 : rule__Address__Group_4__1__Impl ;
    public final void rule__Address__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1640:1: ( rule__Address__Group_4__1__Impl )
            // InternalSalesTransaction.g:1641:2: rule__Address__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_4__1"


    // $ANTLR start "rule__Address__Group_4__1__Impl"
    // InternalSalesTransaction.g:1647:1: rule__Address__Group_4__1__Impl : ( ( rule__Address__CityAssignment_4_1 ) ) ;
    public final void rule__Address__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1651:1: ( ( ( rule__Address__CityAssignment_4_1 ) ) )
            // InternalSalesTransaction.g:1652:1: ( ( rule__Address__CityAssignment_4_1 ) )
            {
            // InternalSalesTransaction.g:1652:1: ( ( rule__Address__CityAssignment_4_1 ) )
            // InternalSalesTransaction.g:1653:2: ( rule__Address__CityAssignment_4_1 )
            {
             before(grammarAccess.getAddressAccess().getCityAssignment_4_1()); 
            // InternalSalesTransaction.g:1654:2: ( rule__Address__CityAssignment_4_1 )
            // InternalSalesTransaction.g:1654:3: rule__Address__CityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__CityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getCityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_4__1__Impl"


    // $ANTLR start "rule__Address__Group_5__0"
    // InternalSalesTransaction.g:1663:1: rule__Address__Group_5__0 : rule__Address__Group_5__0__Impl rule__Address__Group_5__1 ;
    public final void rule__Address__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1667:1: ( rule__Address__Group_5__0__Impl rule__Address__Group_5__1 )
            // InternalSalesTransaction.g:1668:2: rule__Address__Group_5__0__Impl rule__Address__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_5__0"


    // $ANTLR start "rule__Address__Group_5__0__Impl"
    // InternalSalesTransaction.g:1675:1: rule__Address__Group_5__0__Impl : ( 'country' ) ;
    public final void rule__Address__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1679:1: ( ( 'country' ) )
            // InternalSalesTransaction.g:1680:1: ( 'country' )
            {
            // InternalSalesTransaction.g:1680:1: ( 'country' )
            // InternalSalesTransaction.g:1681:2: 'country'
            {
             before(grammarAccess.getAddressAccess().getCountryKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCountryKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_5__0__Impl"


    // $ANTLR start "rule__Address__Group_5__1"
    // InternalSalesTransaction.g:1690:1: rule__Address__Group_5__1 : rule__Address__Group_5__1__Impl ;
    public final void rule__Address__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1694:1: ( rule__Address__Group_5__1__Impl )
            // InternalSalesTransaction.g:1695:2: rule__Address__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_5__1"


    // $ANTLR start "rule__Address__Group_5__1__Impl"
    // InternalSalesTransaction.g:1701:1: rule__Address__Group_5__1__Impl : ( ( rule__Address__CountryAssignment_5_1 ) ) ;
    public final void rule__Address__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1705:1: ( ( ( rule__Address__CountryAssignment_5_1 ) ) )
            // InternalSalesTransaction.g:1706:1: ( ( rule__Address__CountryAssignment_5_1 ) )
            {
            // InternalSalesTransaction.g:1706:1: ( ( rule__Address__CountryAssignment_5_1 ) )
            // InternalSalesTransaction.g:1707:2: ( rule__Address__CountryAssignment_5_1 )
            {
             before(grammarAccess.getAddressAccess().getCountryAssignment_5_1()); 
            // InternalSalesTransaction.g:1708:2: ( rule__Address__CountryAssignment_5_1 )
            // InternalSalesTransaction.g:1708:3: rule__Address__CountryAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__CountryAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getCountryAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_5__1__Impl"


    // $ANTLR start "rule__Address__Group_6__0"
    // InternalSalesTransaction.g:1717:1: rule__Address__Group_6__0 : rule__Address__Group_6__0__Impl rule__Address__Group_6__1 ;
    public final void rule__Address__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1721:1: ( rule__Address__Group_6__0__Impl rule__Address__Group_6__1 )
            // InternalSalesTransaction.g:1722:2: rule__Address__Group_6__0__Impl rule__Address__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_6__0"


    // $ANTLR start "rule__Address__Group_6__0__Impl"
    // InternalSalesTransaction.g:1729:1: rule__Address__Group_6__0__Impl : ( 'telephone' ) ;
    public final void rule__Address__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1733:1: ( ( 'telephone' ) )
            // InternalSalesTransaction.g:1734:1: ( 'telephone' )
            {
            // InternalSalesTransaction.g:1734:1: ( 'telephone' )
            // InternalSalesTransaction.g:1735:2: 'telephone'
            {
             before(grammarAccess.getAddressAccess().getTelephoneKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getTelephoneKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_6__0__Impl"


    // $ANTLR start "rule__Address__Group_6__1"
    // InternalSalesTransaction.g:1744:1: rule__Address__Group_6__1 : rule__Address__Group_6__1__Impl ;
    public final void rule__Address__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1748:1: ( rule__Address__Group_6__1__Impl )
            // InternalSalesTransaction.g:1749:2: rule__Address__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_6__1"


    // $ANTLR start "rule__Address__Group_6__1__Impl"
    // InternalSalesTransaction.g:1755:1: rule__Address__Group_6__1__Impl : ( ( rule__Address__TelephoneAssignment_6_1 ) ) ;
    public final void rule__Address__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1759:1: ( ( ( rule__Address__TelephoneAssignment_6_1 ) ) )
            // InternalSalesTransaction.g:1760:1: ( ( rule__Address__TelephoneAssignment_6_1 ) )
            {
            // InternalSalesTransaction.g:1760:1: ( ( rule__Address__TelephoneAssignment_6_1 ) )
            // InternalSalesTransaction.g:1761:2: ( rule__Address__TelephoneAssignment_6_1 )
            {
             before(grammarAccess.getAddressAccess().getTelephoneAssignment_6_1()); 
            // InternalSalesTransaction.g:1762:2: ( rule__Address__TelephoneAssignment_6_1 )
            // InternalSalesTransaction.g:1762:3: rule__Address__TelephoneAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__TelephoneAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getTelephoneAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group_6__1__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalSalesTransaction.g:1771:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1775:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalSalesTransaction.g:1776:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalSalesTransaction.g:1783:1: rule__Store__Group__0__Impl : ( () ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1787:1: ( ( () ) )
            // InternalSalesTransaction.g:1788:1: ( () )
            {
            // InternalSalesTransaction.g:1788:1: ( () )
            // InternalSalesTransaction.g:1789:2: ()
            {
             before(grammarAccess.getStoreAccess().getStoreAction_0()); 
            // InternalSalesTransaction.g:1790:2: ()
            // InternalSalesTransaction.g:1790:3: 
            {
            }

             after(grammarAccess.getStoreAccess().getStoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalSalesTransaction.g:1798:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1802:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalSalesTransaction.g:1803:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalSalesTransaction.g:1810:1: rule__Store__Group__1__Impl : ( 'store' ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1814:1: ( ( 'store' ) )
            // InternalSalesTransaction.g:1815:1: ( 'store' )
            {
            // InternalSalesTransaction.g:1815:1: ( 'store' )
            // InternalSalesTransaction.g:1816:2: 'store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalSalesTransaction.g:1825:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1829:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalSalesTransaction.g:1830:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalSalesTransaction.g:1837:1: rule__Store__Group__2__Impl : ( ( rule__Store__NameAssignment_2 ) ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1841:1: ( ( ( rule__Store__NameAssignment_2 ) ) )
            // InternalSalesTransaction.g:1842:1: ( ( rule__Store__NameAssignment_2 ) )
            {
            // InternalSalesTransaction.g:1842:1: ( ( rule__Store__NameAssignment_2 ) )
            // InternalSalesTransaction.g:1843:2: ( rule__Store__NameAssignment_2 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_2()); 
            // InternalSalesTransaction.g:1844:2: ( rule__Store__NameAssignment_2 )
            // InternalSalesTransaction.g:1844:3: rule__Store__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Store__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalSalesTransaction.g:1852:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1856:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalSalesTransaction.g:1857:2: rule__Store__Group__3__Impl rule__Store__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Store__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalSalesTransaction.g:1864:1: rule__Store__Group__3__Impl : ( '{' ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1868:1: ( ( '{' ) )
            // InternalSalesTransaction.g:1869:1: ( '{' )
            {
            // InternalSalesTransaction.g:1869:1: ( '{' )
            // InternalSalesTransaction.g:1870:2: '{'
            {
             before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__Store__Group__4"
    // InternalSalesTransaction.g:1879:1: rule__Store__Group__4 : rule__Store__Group__4__Impl rule__Store__Group__5 ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1883:1: ( rule__Store__Group__4__Impl rule__Store__Group__5 )
            // InternalSalesTransaction.g:1884:2: rule__Store__Group__4__Impl rule__Store__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Store__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4"


    // $ANTLR start "rule__Store__Group__4__Impl"
    // InternalSalesTransaction.g:1891:1: rule__Store__Group__4__Impl : ( ( rule__Store__Group_4__0 )? ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1895:1: ( ( ( rule__Store__Group_4__0 )? ) )
            // InternalSalesTransaction.g:1896:1: ( ( rule__Store__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:1896:1: ( ( rule__Store__Group_4__0 )? )
            // InternalSalesTransaction.g:1897:2: ( rule__Store__Group_4__0 )?
            {
             before(grammarAccess.getStoreAccess().getGroup_4()); 
            // InternalSalesTransaction.g:1898:2: ( rule__Store__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSalesTransaction.g:1898:3: rule__Store__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Store__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoreAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4__Impl"


    // $ANTLR start "rule__Store__Group__5"
    // InternalSalesTransaction.g:1906:1: rule__Store__Group__5 : rule__Store__Group__5__Impl ;
    public final void rule__Store__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1910:1: ( rule__Store__Group__5__Impl )
            // InternalSalesTransaction.g:1911:2: rule__Store__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__5"


    // $ANTLR start "rule__Store__Group__5__Impl"
    // InternalSalesTransaction.g:1917:1: rule__Store__Group__5__Impl : ( '}' ) ;
    public final void rule__Store__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1921:1: ( ( '}' ) )
            // InternalSalesTransaction.g:1922:1: ( '}' )
            {
            // InternalSalesTransaction.g:1922:1: ( '}' )
            // InternalSalesTransaction.g:1923:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__5__Impl"


    // $ANTLR start "rule__Store__Group_4__0"
    // InternalSalesTransaction.g:1933:1: rule__Store__Group_4__0 : rule__Store__Group_4__0__Impl rule__Store__Group_4__1 ;
    public final void rule__Store__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1937:1: ( rule__Store__Group_4__0__Impl rule__Store__Group_4__1 )
            // InternalSalesTransaction.g:1938:2: rule__Store__Group_4__0__Impl rule__Store__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Store__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__0"


    // $ANTLR start "rule__Store__Group_4__0__Impl"
    // InternalSalesTransaction.g:1945:1: rule__Store__Group_4__0__Impl : ( 'items' ) ;
    public final void rule__Store__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1949:1: ( ( 'items' ) )
            // InternalSalesTransaction.g:1950:1: ( 'items' )
            {
            // InternalSalesTransaction.g:1950:1: ( 'items' )
            // InternalSalesTransaction.g:1951:2: 'items'
            {
             before(grammarAccess.getStoreAccess().getItemsKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getItemsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__0__Impl"


    // $ANTLR start "rule__Store__Group_4__1"
    // InternalSalesTransaction.g:1960:1: rule__Store__Group_4__1 : rule__Store__Group_4__1__Impl rule__Store__Group_4__2 ;
    public final void rule__Store__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1964:1: ( rule__Store__Group_4__1__Impl rule__Store__Group_4__2 )
            // InternalSalesTransaction.g:1965:2: rule__Store__Group_4__1__Impl rule__Store__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__1"


    // $ANTLR start "rule__Store__Group_4__1__Impl"
    // InternalSalesTransaction.g:1972:1: rule__Store__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Store__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1976:1: ( ( '{' ) )
            // InternalSalesTransaction.g:1977:1: ( '{' )
            {
            // InternalSalesTransaction.g:1977:1: ( '{' )
            // InternalSalesTransaction.g:1978:2: '{'
            {
             before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__1__Impl"


    // $ANTLR start "rule__Store__Group_4__2"
    // InternalSalesTransaction.g:1987:1: rule__Store__Group_4__2 : rule__Store__Group_4__2__Impl rule__Store__Group_4__3 ;
    public final void rule__Store__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:1991:1: ( rule__Store__Group_4__2__Impl rule__Store__Group_4__3 )
            // InternalSalesTransaction.g:1992:2: rule__Store__Group_4__2__Impl rule__Store__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Store__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__2"


    // $ANTLR start "rule__Store__Group_4__2__Impl"
    // InternalSalesTransaction.g:1999:1: rule__Store__Group_4__2__Impl : ( ( rule__Store__ItemAssignment_4_2 ) ) ;
    public final void rule__Store__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2003:1: ( ( ( rule__Store__ItemAssignment_4_2 ) ) )
            // InternalSalesTransaction.g:2004:1: ( ( rule__Store__ItemAssignment_4_2 ) )
            {
            // InternalSalesTransaction.g:2004:1: ( ( rule__Store__ItemAssignment_4_2 ) )
            // InternalSalesTransaction.g:2005:2: ( rule__Store__ItemAssignment_4_2 )
            {
             before(grammarAccess.getStoreAccess().getItemAssignment_4_2()); 
            // InternalSalesTransaction.g:2006:2: ( rule__Store__ItemAssignment_4_2 )
            // InternalSalesTransaction.g:2006:3: rule__Store__ItemAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Store__ItemAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getItemAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__2__Impl"


    // $ANTLR start "rule__Store__Group_4__3"
    // InternalSalesTransaction.g:2014:1: rule__Store__Group_4__3 : rule__Store__Group_4__3__Impl rule__Store__Group_4__4 ;
    public final void rule__Store__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2018:1: ( rule__Store__Group_4__3__Impl rule__Store__Group_4__4 )
            // InternalSalesTransaction.g:2019:2: rule__Store__Group_4__3__Impl rule__Store__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Store__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__3"


    // $ANTLR start "rule__Store__Group_4__3__Impl"
    // InternalSalesTransaction.g:2026:1: rule__Store__Group_4__3__Impl : ( ( rule__Store__Group_4_3__0 )* ) ;
    public final void rule__Store__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2030:1: ( ( ( rule__Store__Group_4_3__0 )* ) )
            // InternalSalesTransaction.g:2031:1: ( ( rule__Store__Group_4_3__0 )* )
            {
            // InternalSalesTransaction.g:2031:1: ( ( rule__Store__Group_4_3__0 )* )
            // InternalSalesTransaction.g:2032:2: ( rule__Store__Group_4_3__0 )*
            {
             before(grammarAccess.getStoreAccess().getGroup_4_3()); 
            // InternalSalesTransaction.g:2033:2: ( rule__Store__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSalesTransaction.g:2033:3: rule__Store__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Store__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStoreAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__3__Impl"


    // $ANTLR start "rule__Store__Group_4__4"
    // InternalSalesTransaction.g:2041:1: rule__Store__Group_4__4 : rule__Store__Group_4__4__Impl ;
    public final void rule__Store__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2045:1: ( rule__Store__Group_4__4__Impl )
            // InternalSalesTransaction.g:2046:2: rule__Store__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__4"


    // $ANTLR start "rule__Store__Group_4__4__Impl"
    // InternalSalesTransaction.g:2052:1: rule__Store__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Store__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2056:1: ( ( '}' ) )
            // InternalSalesTransaction.g:2057:1: ( '}' )
            {
            // InternalSalesTransaction.g:2057:1: ( '}' )
            // InternalSalesTransaction.g:2058:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4__4__Impl"


    // $ANTLR start "rule__Store__Group_4_3__0"
    // InternalSalesTransaction.g:2068:1: rule__Store__Group_4_3__0 : rule__Store__Group_4_3__0__Impl rule__Store__Group_4_3__1 ;
    public final void rule__Store__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2072:1: ( rule__Store__Group_4_3__0__Impl rule__Store__Group_4_3__1 )
            // InternalSalesTransaction.g:2073:2: rule__Store__Group_4_3__0__Impl rule__Store__Group_4_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4_3__0"


    // $ANTLR start "rule__Store__Group_4_3__0__Impl"
    // InternalSalesTransaction.g:2080:1: rule__Store__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Store__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2084:1: ( ( ',' ) )
            // InternalSalesTransaction.g:2085:1: ( ',' )
            {
            // InternalSalesTransaction.g:2085:1: ( ',' )
            // InternalSalesTransaction.g:2086:2: ','
            {
             before(grammarAccess.getStoreAccess().getCommaKeyword_4_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4_3__0__Impl"


    // $ANTLR start "rule__Store__Group_4_3__1"
    // InternalSalesTransaction.g:2095:1: rule__Store__Group_4_3__1 : rule__Store__Group_4_3__1__Impl ;
    public final void rule__Store__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2099:1: ( rule__Store__Group_4_3__1__Impl )
            // InternalSalesTransaction.g:2100:2: rule__Store__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4_3__1"


    // $ANTLR start "rule__Store__Group_4_3__1__Impl"
    // InternalSalesTransaction.g:2106:1: rule__Store__Group_4_3__1__Impl : ( ( rule__Store__ItemAssignment_4_3_1 ) ) ;
    public final void rule__Store__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2110:1: ( ( ( rule__Store__ItemAssignment_4_3_1 ) ) )
            // InternalSalesTransaction.g:2111:1: ( ( rule__Store__ItemAssignment_4_3_1 ) )
            {
            // InternalSalesTransaction.g:2111:1: ( ( rule__Store__ItemAssignment_4_3_1 ) )
            // InternalSalesTransaction.g:2112:2: ( rule__Store__ItemAssignment_4_3_1 )
            {
             before(grammarAccess.getStoreAccess().getItemAssignment_4_3_1()); 
            // InternalSalesTransaction.g:2113:2: ( rule__Store__ItemAssignment_4_3_1 )
            // InternalSalesTransaction.g:2113:3: rule__Store__ItemAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__ItemAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getItemAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group_4_3__1__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalSalesTransaction.g:2122:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2126:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalSalesTransaction.g:2127:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Transaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // InternalSalesTransaction.g:2134:1: rule__Transaction__Group__0__Impl : ( 'transaction' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2138:1: ( ( 'transaction' ) )
            // InternalSalesTransaction.g:2139:1: ( 'transaction' )
            {
            // InternalSalesTransaction.g:2139:1: ( 'transaction' )
            // InternalSalesTransaction.g:2140:2: 'transaction'
            {
             before(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // InternalSalesTransaction.g:2149:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2153:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalSalesTransaction.g:2154:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Transaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // InternalSalesTransaction.g:2161:1: rule__Transaction__Group__1__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2165:1: ( ( '{' ) )
            // InternalSalesTransaction.g:2166:1: ( '{' )
            {
            // InternalSalesTransaction.g:2166:1: ( '{' )
            // InternalSalesTransaction.g:2167:2: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // InternalSalesTransaction.g:2176:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2180:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalSalesTransaction.g:2181:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Transaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // InternalSalesTransaction.g:2188:1: rule__Transaction__Group__2__Impl : ( ( rule__Transaction__Group_2__0 )? ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2192:1: ( ( ( rule__Transaction__Group_2__0 )? ) )
            // InternalSalesTransaction.g:2193:1: ( ( rule__Transaction__Group_2__0 )? )
            {
            // InternalSalesTransaction.g:2193:1: ( ( rule__Transaction__Group_2__0 )? )
            // InternalSalesTransaction.g:2194:2: ( rule__Transaction__Group_2__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_2()); 
            // InternalSalesTransaction.g:2195:2: ( rule__Transaction__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSalesTransaction.g:2195:3: rule__Transaction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // InternalSalesTransaction.g:2203:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2207:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalSalesTransaction.g:2208:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Transaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // InternalSalesTransaction.g:2215:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__Group_3__0 )? ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2219:1: ( ( ( rule__Transaction__Group_3__0 )? ) )
            // InternalSalesTransaction.g:2220:1: ( ( rule__Transaction__Group_3__0 )? )
            {
            // InternalSalesTransaction.g:2220:1: ( ( rule__Transaction__Group_3__0 )? )
            // InternalSalesTransaction.g:2221:2: ( rule__Transaction__Group_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_3()); 
            // InternalSalesTransaction.g:2222:2: ( rule__Transaction__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSalesTransaction.g:2222:3: rule__Transaction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // InternalSalesTransaction.g:2230:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2234:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalSalesTransaction.g:2235:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Transaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // InternalSalesTransaction.g:2242:1: rule__Transaction__Group__4__Impl : ( 'transactionType' ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2246:1: ( ( 'transactionType' ) )
            // InternalSalesTransaction.g:2247:1: ( 'transactionType' )
            {
            // InternalSalesTransaction.g:2247:1: ( 'transactionType' )
            // InternalSalesTransaction.g:2248:2: 'transactionType'
            {
             before(grammarAccess.getTransactionAccess().getTransactionTypeKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTransactionTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // InternalSalesTransaction.g:2257:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2261:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalSalesTransaction.g:2262:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Transaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // InternalSalesTransaction.g:2269:1: rule__Transaction__Group__5__Impl : ( ( rule__Transaction__TransactionTypeAssignment_5 ) ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2273:1: ( ( ( rule__Transaction__TransactionTypeAssignment_5 ) ) )
            // InternalSalesTransaction.g:2274:1: ( ( rule__Transaction__TransactionTypeAssignment_5 ) )
            {
            // InternalSalesTransaction.g:2274:1: ( ( rule__Transaction__TransactionTypeAssignment_5 ) )
            // InternalSalesTransaction.g:2275:2: ( rule__Transaction__TransactionTypeAssignment_5 )
            {
             before(grammarAccess.getTransactionAccess().getTransactionTypeAssignment_5()); 
            // InternalSalesTransaction.g:2276:2: ( rule__Transaction__TransactionTypeAssignment_5 )
            // InternalSalesTransaction.g:2276:3: rule__Transaction__TransactionTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__TransactionTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getTransactionTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__6"
    // InternalSalesTransaction.g:2284:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2288:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // InternalSalesTransaction.g:2289:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Transaction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6"


    // $ANTLR start "rule__Transaction__Group__6__Impl"
    // InternalSalesTransaction.g:2296:1: rule__Transaction__Group__6__Impl : ( 'paymentMethod' ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2300:1: ( ( 'paymentMethod' ) )
            // InternalSalesTransaction.g:2301:1: ( 'paymentMethod' )
            {
            // InternalSalesTransaction.g:2301:1: ( 'paymentMethod' )
            // InternalSalesTransaction.g:2302:2: 'paymentMethod'
            {
             before(grammarAccess.getTransactionAccess().getPaymentMethodKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getPaymentMethodKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6__Impl"


    // $ANTLR start "rule__Transaction__Group__7"
    // InternalSalesTransaction.g:2311:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl rule__Transaction__Group__8 ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2315:1: ( rule__Transaction__Group__7__Impl rule__Transaction__Group__8 )
            // InternalSalesTransaction.g:2316:2: rule__Transaction__Group__7__Impl rule__Transaction__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Transaction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__7"


    // $ANTLR start "rule__Transaction__Group__7__Impl"
    // InternalSalesTransaction.g:2323:1: rule__Transaction__Group__7__Impl : ( ( rule__Transaction__PaymentMethodAssignment_7 ) ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2327:1: ( ( ( rule__Transaction__PaymentMethodAssignment_7 ) ) )
            // InternalSalesTransaction.g:2328:1: ( ( rule__Transaction__PaymentMethodAssignment_7 ) )
            {
            // InternalSalesTransaction.g:2328:1: ( ( rule__Transaction__PaymentMethodAssignment_7 ) )
            // InternalSalesTransaction.g:2329:2: ( rule__Transaction__PaymentMethodAssignment_7 )
            {
             before(grammarAccess.getTransactionAccess().getPaymentMethodAssignment_7()); 
            // InternalSalesTransaction.g:2330:2: ( rule__Transaction__PaymentMethodAssignment_7 )
            // InternalSalesTransaction.g:2330:3: rule__Transaction__PaymentMethodAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__PaymentMethodAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getPaymentMethodAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__7__Impl"


    // $ANTLR start "rule__Transaction__Group__8"
    // InternalSalesTransaction.g:2338:1: rule__Transaction__Group__8 : rule__Transaction__Group__8__Impl rule__Transaction__Group__9 ;
    public final void rule__Transaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2342:1: ( rule__Transaction__Group__8__Impl rule__Transaction__Group__9 )
            // InternalSalesTransaction.g:2343:2: rule__Transaction__Group__8__Impl rule__Transaction__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Transaction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__8"


    // $ANTLR start "rule__Transaction__Group__8__Impl"
    // InternalSalesTransaction.g:2350:1: rule__Transaction__Group__8__Impl : ( ( rule__Transaction__CustomerAssignment_8 )? ) ;
    public final void rule__Transaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2354:1: ( ( ( rule__Transaction__CustomerAssignment_8 )? ) )
            // InternalSalesTransaction.g:2355:1: ( ( rule__Transaction__CustomerAssignment_8 )? )
            {
            // InternalSalesTransaction.g:2355:1: ( ( rule__Transaction__CustomerAssignment_8 )? )
            // InternalSalesTransaction.g:2356:2: ( rule__Transaction__CustomerAssignment_8 )?
            {
             before(grammarAccess.getTransactionAccess().getCustomerAssignment_8()); 
            // InternalSalesTransaction.g:2357:2: ( rule__Transaction__CustomerAssignment_8 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSalesTransaction.g:2357:3: rule__Transaction__CustomerAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__CustomerAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getCustomerAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__8__Impl"


    // $ANTLR start "rule__Transaction__Group__9"
    // InternalSalesTransaction.g:2365:1: rule__Transaction__Group__9 : rule__Transaction__Group__9__Impl rule__Transaction__Group__10 ;
    public final void rule__Transaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2369:1: ( rule__Transaction__Group__9__Impl rule__Transaction__Group__10 )
            // InternalSalesTransaction.g:2370:2: rule__Transaction__Group__9__Impl rule__Transaction__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Transaction__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__9"


    // $ANTLR start "rule__Transaction__Group__9__Impl"
    // InternalSalesTransaction.g:2377:1: rule__Transaction__Group__9__Impl : ( ( rule__Transaction__CashierAssignment_9 )? ) ;
    public final void rule__Transaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2381:1: ( ( ( rule__Transaction__CashierAssignment_9 )? ) )
            // InternalSalesTransaction.g:2382:1: ( ( rule__Transaction__CashierAssignment_9 )? )
            {
            // InternalSalesTransaction.g:2382:1: ( ( rule__Transaction__CashierAssignment_9 )? )
            // InternalSalesTransaction.g:2383:2: ( rule__Transaction__CashierAssignment_9 )?
            {
             before(grammarAccess.getTransactionAccess().getCashierAssignment_9()); 
            // InternalSalesTransaction.g:2384:2: ( rule__Transaction__CashierAssignment_9 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==65) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSalesTransaction.g:2384:3: rule__Transaction__CashierAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__CashierAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getCashierAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__9__Impl"


    // $ANTLR start "rule__Transaction__Group__10"
    // InternalSalesTransaction.g:2392:1: rule__Transaction__Group__10 : rule__Transaction__Group__10__Impl rule__Transaction__Group__11 ;
    public final void rule__Transaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2396:1: ( rule__Transaction__Group__10__Impl rule__Transaction__Group__11 )
            // InternalSalesTransaction.g:2397:2: rule__Transaction__Group__10__Impl rule__Transaction__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Transaction__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__10"


    // $ANTLR start "rule__Transaction__Group__10__Impl"
    // InternalSalesTransaction.g:2404:1: rule__Transaction__Group__10__Impl : ( 'lineItems' ) ;
    public final void rule__Transaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2408:1: ( ( 'lineItems' ) )
            // InternalSalesTransaction.g:2409:1: ( 'lineItems' )
            {
            // InternalSalesTransaction.g:2409:1: ( 'lineItems' )
            // InternalSalesTransaction.g:2410:2: 'lineItems'
            {
             before(grammarAccess.getTransactionAccess().getLineItemsKeyword_10()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getLineItemsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__10__Impl"


    // $ANTLR start "rule__Transaction__Group__11"
    // InternalSalesTransaction.g:2419:1: rule__Transaction__Group__11 : rule__Transaction__Group__11__Impl rule__Transaction__Group__12 ;
    public final void rule__Transaction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2423:1: ( rule__Transaction__Group__11__Impl rule__Transaction__Group__12 )
            // InternalSalesTransaction.g:2424:2: rule__Transaction__Group__11__Impl rule__Transaction__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Transaction__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__11"


    // $ANTLR start "rule__Transaction__Group__11__Impl"
    // InternalSalesTransaction.g:2431:1: rule__Transaction__Group__11__Impl : ( '{' ) ;
    public final void rule__Transaction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2435:1: ( ( '{' ) )
            // InternalSalesTransaction.g:2436:1: ( '{' )
            {
            // InternalSalesTransaction.g:2436:1: ( '{' )
            // InternalSalesTransaction.g:2437:2: '{'
            {
             before(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__11__Impl"


    // $ANTLR start "rule__Transaction__Group__12"
    // InternalSalesTransaction.g:2446:1: rule__Transaction__Group__12 : rule__Transaction__Group__12__Impl rule__Transaction__Group__13 ;
    public final void rule__Transaction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2450:1: ( rule__Transaction__Group__12__Impl rule__Transaction__Group__13 )
            // InternalSalesTransaction.g:2451:2: rule__Transaction__Group__12__Impl rule__Transaction__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Transaction__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__12"


    // $ANTLR start "rule__Transaction__Group__12__Impl"
    // InternalSalesTransaction.g:2458:1: rule__Transaction__Group__12__Impl : ( ( rule__Transaction__LineItemAssignment_12 ) ) ;
    public final void rule__Transaction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2462:1: ( ( ( rule__Transaction__LineItemAssignment_12 ) ) )
            // InternalSalesTransaction.g:2463:1: ( ( rule__Transaction__LineItemAssignment_12 ) )
            {
            // InternalSalesTransaction.g:2463:1: ( ( rule__Transaction__LineItemAssignment_12 ) )
            // InternalSalesTransaction.g:2464:2: ( rule__Transaction__LineItemAssignment_12 )
            {
             before(grammarAccess.getTransactionAccess().getLineItemAssignment_12()); 
            // InternalSalesTransaction.g:2465:2: ( rule__Transaction__LineItemAssignment_12 )
            // InternalSalesTransaction.g:2465:3: rule__Transaction__LineItemAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__LineItemAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getLineItemAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__12__Impl"


    // $ANTLR start "rule__Transaction__Group__13"
    // InternalSalesTransaction.g:2473:1: rule__Transaction__Group__13 : rule__Transaction__Group__13__Impl rule__Transaction__Group__14 ;
    public final void rule__Transaction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2477:1: ( rule__Transaction__Group__13__Impl rule__Transaction__Group__14 )
            // InternalSalesTransaction.g:2478:2: rule__Transaction__Group__13__Impl rule__Transaction__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Transaction__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__13"


    // $ANTLR start "rule__Transaction__Group__13__Impl"
    // InternalSalesTransaction.g:2485:1: rule__Transaction__Group__13__Impl : ( ( rule__Transaction__Group_13__0 )* ) ;
    public final void rule__Transaction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2489:1: ( ( ( rule__Transaction__Group_13__0 )* ) )
            // InternalSalesTransaction.g:2490:1: ( ( rule__Transaction__Group_13__0 )* )
            {
            // InternalSalesTransaction.g:2490:1: ( ( rule__Transaction__Group_13__0 )* )
            // InternalSalesTransaction.g:2491:2: ( rule__Transaction__Group_13__0 )*
            {
             before(grammarAccess.getTransactionAccess().getGroup_13()); 
            // InternalSalesTransaction.g:2492:2: ( rule__Transaction__Group_13__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSalesTransaction.g:2492:3: rule__Transaction__Group_13__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Transaction__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__13__Impl"


    // $ANTLR start "rule__Transaction__Group__14"
    // InternalSalesTransaction.g:2500:1: rule__Transaction__Group__14 : rule__Transaction__Group__14__Impl rule__Transaction__Group__15 ;
    public final void rule__Transaction__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2504:1: ( rule__Transaction__Group__14__Impl rule__Transaction__Group__15 )
            // InternalSalesTransaction.g:2505:2: rule__Transaction__Group__14__Impl rule__Transaction__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__Transaction__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__14"


    // $ANTLR start "rule__Transaction__Group__14__Impl"
    // InternalSalesTransaction.g:2512:1: rule__Transaction__Group__14__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2516:1: ( ( '}' ) )
            // InternalSalesTransaction.g:2517:1: ( '}' )
            {
            // InternalSalesTransaction.g:2517:1: ( '}' )
            // InternalSalesTransaction.g:2518:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__14__Impl"


    // $ANTLR start "rule__Transaction__Group__15"
    // InternalSalesTransaction.g:2527:1: rule__Transaction__Group__15 : rule__Transaction__Group__15__Impl rule__Transaction__Group__16 ;
    public final void rule__Transaction__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2531:1: ( rule__Transaction__Group__15__Impl rule__Transaction__Group__16 )
            // InternalSalesTransaction.g:2532:2: rule__Transaction__Group__15__Impl rule__Transaction__Group__16
            {
            pushFollow(FOLLOW_21);
            rule__Transaction__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__15"


    // $ANTLR start "rule__Transaction__Group__15__Impl"
    // InternalSalesTransaction.g:2539:1: rule__Transaction__Group__15__Impl : ( ( rule__Transaction__CardAssignment_15 )? ) ;
    public final void rule__Transaction__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2543:1: ( ( ( rule__Transaction__CardAssignment_15 )? ) )
            // InternalSalesTransaction.g:2544:1: ( ( rule__Transaction__CardAssignment_15 )? )
            {
            // InternalSalesTransaction.g:2544:1: ( ( rule__Transaction__CardAssignment_15 )? )
            // InternalSalesTransaction.g:2545:2: ( rule__Transaction__CardAssignment_15 )?
            {
             before(grammarAccess.getTransactionAccess().getCardAssignment_15()); 
            // InternalSalesTransaction.g:2546:2: ( rule__Transaction__CardAssignment_15 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==72) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSalesTransaction.g:2546:3: rule__Transaction__CardAssignment_15
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transaction__CardAssignment_15();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getCardAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__15__Impl"


    // $ANTLR start "rule__Transaction__Group__16"
    // InternalSalesTransaction.g:2554:1: rule__Transaction__Group__16 : rule__Transaction__Group__16__Impl ;
    public final void rule__Transaction__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2558:1: ( rule__Transaction__Group__16__Impl )
            // InternalSalesTransaction.g:2559:2: rule__Transaction__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__16"


    // $ANTLR start "rule__Transaction__Group__16__Impl"
    // InternalSalesTransaction.g:2565:1: rule__Transaction__Group__16__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2569:1: ( ( '}' ) )
            // InternalSalesTransaction.g:2570:1: ( '}' )
            {
            // InternalSalesTransaction.g:2570:1: ( '}' )
            // InternalSalesTransaction.g:2571:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__16__Impl"


    // $ANTLR start "rule__Transaction__Group_2__0"
    // InternalSalesTransaction.g:2581:1: rule__Transaction__Group_2__0 : rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1 ;
    public final void rule__Transaction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2585:1: ( rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1 )
            // InternalSalesTransaction.g:2586:2: rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Transaction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__0"


    // $ANTLR start "rule__Transaction__Group_2__0__Impl"
    // InternalSalesTransaction.g:2593:1: rule__Transaction__Group_2__0__Impl : ( 'transactionNumber' ) ;
    public final void rule__Transaction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2597:1: ( ( 'transactionNumber' ) )
            // InternalSalesTransaction.g:2598:1: ( 'transactionNumber' )
            {
            // InternalSalesTransaction.g:2598:1: ( 'transactionNumber' )
            // InternalSalesTransaction.g:2599:2: 'transactionNumber'
            {
             before(grammarAccess.getTransactionAccess().getTransactionNumberKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTransactionNumberKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__0__Impl"


    // $ANTLR start "rule__Transaction__Group_2__1"
    // InternalSalesTransaction.g:2608:1: rule__Transaction__Group_2__1 : rule__Transaction__Group_2__1__Impl ;
    public final void rule__Transaction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2612:1: ( rule__Transaction__Group_2__1__Impl )
            // InternalSalesTransaction.g:2613:2: rule__Transaction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__1"


    // $ANTLR start "rule__Transaction__Group_2__1__Impl"
    // InternalSalesTransaction.g:2619:1: rule__Transaction__Group_2__1__Impl : ( ( rule__Transaction__TransactionNumberAssignment_2_1 ) ) ;
    public final void rule__Transaction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2623:1: ( ( ( rule__Transaction__TransactionNumberAssignment_2_1 ) ) )
            // InternalSalesTransaction.g:2624:1: ( ( rule__Transaction__TransactionNumberAssignment_2_1 ) )
            {
            // InternalSalesTransaction.g:2624:1: ( ( rule__Transaction__TransactionNumberAssignment_2_1 ) )
            // InternalSalesTransaction.g:2625:2: ( rule__Transaction__TransactionNumberAssignment_2_1 )
            {
             before(grammarAccess.getTransactionAccess().getTransactionNumberAssignment_2_1()); 
            // InternalSalesTransaction.g:2626:2: ( rule__Transaction__TransactionNumberAssignment_2_1 )
            // InternalSalesTransaction.g:2626:3: rule__Transaction__TransactionNumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__TransactionNumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getTransactionNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__1__Impl"


    // $ANTLR start "rule__Transaction__Group_3__0"
    // InternalSalesTransaction.g:2635:1: rule__Transaction__Group_3__0 : rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1 ;
    public final void rule__Transaction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2639:1: ( rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1 )
            // InternalSalesTransaction.g:2640:2: rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Transaction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__0"


    // $ANTLR start "rule__Transaction__Group_3__0__Impl"
    // InternalSalesTransaction.g:2647:1: rule__Transaction__Group_3__0__Impl : ( 'issuedDate' ) ;
    public final void rule__Transaction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2651:1: ( ( 'issuedDate' ) )
            // InternalSalesTransaction.g:2652:1: ( 'issuedDate' )
            {
            // InternalSalesTransaction.g:2652:1: ( 'issuedDate' )
            // InternalSalesTransaction.g:2653:2: 'issuedDate'
            {
             before(grammarAccess.getTransactionAccess().getIssuedDateKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getIssuedDateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__0__Impl"


    // $ANTLR start "rule__Transaction__Group_3__1"
    // InternalSalesTransaction.g:2662:1: rule__Transaction__Group_3__1 : rule__Transaction__Group_3__1__Impl ;
    public final void rule__Transaction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2666:1: ( rule__Transaction__Group_3__1__Impl )
            // InternalSalesTransaction.g:2667:2: rule__Transaction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__1"


    // $ANTLR start "rule__Transaction__Group_3__1__Impl"
    // InternalSalesTransaction.g:2673:1: rule__Transaction__Group_3__1__Impl : ( ( rule__Transaction__IssuedDateAssignment_3_1 ) ) ;
    public final void rule__Transaction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2677:1: ( ( ( rule__Transaction__IssuedDateAssignment_3_1 ) ) )
            // InternalSalesTransaction.g:2678:1: ( ( rule__Transaction__IssuedDateAssignment_3_1 ) )
            {
            // InternalSalesTransaction.g:2678:1: ( ( rule__Transaction__IssuedDateAssignment_3_1 ) )
            // InternalSalesTransaction.g:2679:2: ( rule__Transaction__IssuedDateAssignment_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getIssuedDateAssignment_3_1()); 
            // InternalSalesTransaction.g:2680:2: ( rule__Transaction__IssuedDateAssignment_3_1 )
            // InternalSalesTransaction.g:2680:3: rule__Transaction__IssuedDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__IssuedDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getIssuedDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__1__Impl"


    // $ANTLR start "rule__Transaction__Group_13__0"
    // InternalSalesTransaction.g:2689:1: rule__Transaction__Group_13__0 : rule__Transaction__Group_13__0__Impl rule__Transaction__Group_13__1 ;
    public final void rule__Transaction__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2693:1: ( rule__Transaction__Group_13__0__Impl rule__Transaction__Group_13__1 )
            // InternalSalesTransaction.g:2694:2: rule__Transaction__Group_13__0__Impl rule__Transaction__Group_13__1
            {
            pushFollow(FOLLOW_20);
            rule__Transaction__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_13__0"


    // $ANTLR start "rule__Transaction__Group_13__0__Impl"
    // InternalSalesTransaction.g:2701:1: rule__Transaction__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Transaction__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2705:1: ( ( ',' ) )
            // InternalSalesTransaction.g:2706:1: ( ',' )
            {
            // InternalSalesTransaction.g:2706:1: ( ',' )
            // InternalSalesTransaction.g:2707:2: ','
            {
             before(grammarAccess.getTransactionAccess().getCommaKeyword_13_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_13__0__Impl"


    // $ANTLR start "rule__Transaction__Group_13__1"
    // InternalSalesTransaction.g:2716:1: rule__Transaction__Group_13__1 : rule__Transaction__Group_13__1__Impl ;
    public final void rule__Transaction__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2720:1: ( rule__Transaction__Group_13__1__Impl )
            // InternalSalesTransaction.g:2721:2: rule__Transaction__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_13__1"


    // $ANTLR start "rule__Transaction__Group_13__1__Impl"
    // InternalSalesTransaction.g:2727:1: rule__Transaction__Group_13__1__Impl : ( ( rule__Transaction__LineItemAssignment_13_1 ) ) ;
    public final void rule__Transaction__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2731:1: ( ( ( rule__Transaction__LineItemAssignment_13_1 ) ) )
            // InternalSalesTransaction.g:2732:1: ( ( rule__Transaction__LineItemAssignment_13_1 ) )
            {
            // InternalSalesTransaction.g:2732:1: ( ( rule__Transaction__LineItemAssignment_13_1 ) )
            // InternalSalesTransaction.g:2733:2: ( rule__Transaction__LineItemAssignment_13_1 )
            {
             before(grammarAccess.getTransactionAccess().getLineItemAssignment_13_1()); 
            // InternalSalesTransaction.g:2734:2: ( rule__Transaction__LineItemAssignment_13_1 )
            // InternalSalesTransaction.g:2734:3: rule__Transaction__LineItemAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__LineItemAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getLineItemAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_13__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalSalesTransaction.g:2743:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2747:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalSalesTransaction.g:2748:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalSalesTransaction.g:2755:1: rule__Item__Group__0__Impl : ( 'item' ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2759:1: ( ( 'item' ) )
            // InternalSalesTransaction.g:2760:1: ( 'item' )
            {
            // InternalSalesTransaction.g:2760:1: ( 'item' )
            // InternalSalesTransaction.g:2761:2: 'item'
            {
             before(grammarAccess.getItemAccess().getItemKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalSalesTransaction.g:2770:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2774:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalSalesTransaction.g:2775:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalSalesTransaction.g:2782:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2786:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalSalesTransaction.g:2787:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalSalesTransaction.g:2787:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalSalesTransaction.g:2788:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalSalesTransaction.g:2789:2: ( rule__Item__NameAssignment_1 )
            // InternalSalesTransaction.g:2789:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalSalesTransaction.g:2797:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2801:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalSalesTransaction.g:2802:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalSalesTransaction.g:2809:1: rule__Item__Group__2__Impl : ( '{' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2813:1: ( ( '{' ) )
            // InternalSalesTransaction.g:2814:1: ( '{' )
            {
            // InternalSalesTransaction.g:2814:1: ( '{' )
            // InternalSalesTransaction.g:2815:2: '{'
            {
             before(grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalSalesTransaction.g:2824:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2828:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // InternalSalesTransaction.g:2829:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Item__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalSalesTransaction.g:2836:1: rule__Item__Group__3__Impl : ( ( rule__Item__Group_3__0 )? ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2840:1: ( ( ( rule__Item__Group_3__0 )? ) )
            // InternalSalesTransaction.g:2841:1: ( ( rule__Item__Group_3__0 )? )
            {
            // InternalSalesTransaction.g:2841:1: ( ( rule__Item__Group_3__0 )? )
            // InternalSalesTransaction.g:2842:2: ( rule__Item__Group_3__0 )?
            {
             before(grammarAccess.getItemAccess().getGroup_3()); 
            // InternalSalesTransaction.g:2843:2: ( rule__Item__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSalesTransaction.g:2843:3: rule__Item__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__4"
    // InternalSalesTransaction.g:2851:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2855:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // InternalSalesTransaction.g:2856:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Item__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4"


    // $ANTLR start "rule__Item__Group__4__Impl"
    // InternalSalesTransaction.g:2863:1: rule__Item__Group__4__Impl : ( ( rule__Item__Group_4__0 )? ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2867:1: ( ( ( rule__Item__Group_4__0 )? ) )
            // InternalSalesTransaction.g:2868:1: ( ( rule__Item__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:2868:1: ( ( rule__Item__Group_4__0 )? )
            // InternalSalesTransaction.g:2869:2: ( rule__Item__Group_4__0 )?
            {
             before(grammarAccess.getItemAccess().getGroup_4()); 
            // InternalSalesTransaction.g:2870:2: ( rule__Item__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==55) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSalesTransaction.g:2870:3: rule__Item__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4__Impl"


    // $ANTLR start "rule__Item__Group__5"
    // InternalSalesTransaction.g:2878:1: rule__Item__Group__5 : rule__Item__Group__5__Impl rule__Item__Group__6 ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2882:1: ( rule__Item__Group__5__Impl rule__Item__Group__6 )
            // InternalSalesTransaction.g:2883:2: rule__Item__Group__5__Impl rule__Item__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Item__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5"


    // $ANTLR start "rule__Item__Group__5__Impl"
    // InternalSalesTransaction.g:2890:1: rule__Item__Group__5__Impl : ( ( rule__Item__Group_5__0 )? ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2894:1: ( ( ( rule__Item__Group_5__0 )? ) )
            // InternalSalesTransaction.g:2895:1: ( ( rule__Item__Group_5__0 )? )
            {
            // InternalSalesTransaction.g:2895:1: ( ( rule__Item__Group_5__0 )? )
            // InternalSalesTransaction.g:2896:2: ( rule__Item__Group_5__0 )?
            {
             before(grammarAccess.getItemAccess().getGroup_5()); 
            // InternalSalesTransaction.g:2897:2: ( rule__Item__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==56) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSalesTransaction.g:2897:3: rule__Item__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Item__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5__Impl"


    // $ANTLR start "rule__Item__Group__6"
    // InternalSalesTransaction.g:2905:1: rule__Item__Group__6 : rule__Item__Group__6__Impl rule__Item__Group__7 ;
    public final void rule__Item__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2909:1: ( rule__Item__Group__6__Impl rule__Item__Group__7 )
            // InternalSalesTransaction.g:2910:2: rule__Item__Group__6__Impl rule__Item__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Item__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__6"


    // $ANTLR start "rule__Item__Group__6__Impl"
    // InternalSalesTransaction.g:2917:1: rule__Item__Group__6__Impl : ( 'uom' ) ;
    public final void rule__Item__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2921:1: ( ( 'uom' ) )
            // InternalSalesTransaction.g:2922:1: ( 'uom' )
            {
            // InternalSalesTransaction.g:2922:1: ( 'uom' )
            // InternalSalesTransaction.g:2923:2: 'uom'
            {
             before(grammarAccess.getItemAccess().getUomKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getUomKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__6__Impl"


    // $ANTLR start "rule__Item__Group__7"
    // InternalSalesTransaction.g:2932:1: rule__Item__Group__7 : rule__Item__Group__7__Impl rule__Item__Group__8 ;
    public final void rule__Item__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2936:1: ( rule__Item__Group__7__Impl rule__Item__Group__8 )
            // InternalSalesTransaction.g:2937:2: rule__Item__Group__7__Impl rule__Item__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Item__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__7"


    // $ANTLR start "rule__Item__Group__7__Impl"
    // InternalSalesTransaction.g:2944:1: rule__Item__Group__7__Impl : ( ( rule__Item__UomAssignment_7 ) ) ;
    public final void rule__Item__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2948:1: ( ( ( rule__Item__UomAssignment_7 ) ) )
            // InternalSalesTransaction.g:2949:1: ( ( rule__Item__UomAssignment_7 ) )
            {
            // InternalSalesTransaction.g:2949:1: ( ( rule__Item__UomAssignment_7 ) )
            // InternalSalesTransaction.g:2950:2: ( rule__Item__UomAssignment_7 )
            {
             before(grammarAccess.getItemAccess().getUomAssignment_7()); 
            // InternalSalesTransaction.g:2951:2: ( rule__Item__UomAssignment_7 )
            // InternalSalesTransaction.g:2951:3: rule__Item__UomAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Item__UomAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getUomAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__7__Impl"


    // $ANTLR start "rule__Item__Group__8"
    // InternalSalesTransaction.g:2959:1: rule__Item__Group__8 : rule__Item__Group__8__Impl rule__Item__Group__9 ;
    public final void rule__Item__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2963:1: ( rule__Item__Group__8__Impl rule__Item__Group__9 )
            // InternalSalesTransaction.g:2964:2: rule__Item__Group__8__Impl rule__Item__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Item__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__8"


    // $ANTLR start "rule__Item__Group__8__Impl"
    // InternalSalesTransaction.g:2971:1: rule__Item__Group__8__Impl : ( 'availableNumber' ) ;
    public final void rule__Item__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2975:1: ( ( 'availableNumber' ) )
            // InternalSalesTransaction.g:2976:1: ( 'availableNumber' )
            {
            // InternalSalesTransaction.g:2976:1: ( 'availableNumber' )
            // InternalSalesTransaction.g:2977:2: 'availableNumber'
            {
             before(grammarAccess.getItemAccess().getAvailableNumberKeyword_8()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getAvailableNumberKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__8__Impl"


    // $ANTLR start "rule__Item__Group__9"
    // InternalSalesTransaction.g:2986:1: rule__Item__Group__9 : rule__Item__Group__9__Impl rule__Item__Group__10 ;
    public final void rule__Item__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:2990:1: ( rule__Item__Group__9__Impl rule__Item__Group__10 )
            // InternalSalesTransaction.g:2991:2: rule__Item__Group__9__Impl rule__Item__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Item__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__9"


    // $ANTLR start "rule__Item__Group__9__Impl"
    // InternalSalesTransaction.g:2998:1: rule__Item__Group__9__Impl : ( ( rule__Item__AvailableNumberAssignment_9 ) ) ;
    public final void rule__Item__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3002:1: ( ( ( rule__Item__AvailableNumberAssignment_9 ) ) )
            // InternalSalesTransaction.g:3003:1: ( ( rule__Item__AvailableNumberAssignment_9 ) )
            {
            // InternalSalesTransaction.g:3003:1: ( ( rule__Item__AvailableNumberAssignment_9 ) )
            // InternalSalesTransaction.g:3004:2: ( rule__Item__AvailableNumberAssignment_9 )
            {
             before(grammarAccess.getItemAccess().getAvailableNumberAssignment_9()); 
            // InternalSalesTransaction.g:3005:2: ( rule__Item__AvailableNumberAssignment_9 )
            // InternalSalesTransaction.g:3005:3: rule__Item__AvailableNumberAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Item__AvailableNumberAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAvailableNumberAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__9__Impl"


    // $ANTLR start "rule__Item__Group__10"
    // InternalSalesTransaction.g:3013:1: rule__Item__Group__10 : rule__Item__Group__10__Impl rule__Item__Group__11 ;
    public final void rule__Item__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3017:1: ( rule__Item__Group__10__Impl rule__Item__Group__11 )
            // InternalSalesTransaction.g:3018:2: rule__Item__Group__10__Impl rule__Item__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Item__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__10"


    // $ANTLR start "rule__Item__Group__10__Impl"
    // InternalSalesTransaction.g:3025:1: rule__Item__Group__10__Impl : ( 'isActive' ) ;
    public final void rule__Item__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3029:1: ( ( 'isActive' ) )
            // InternalSalesTransaction.g:3030:1: ( 'isActive' )
            {
            // InternalSalesTransaction.g:3030:1: ( 'isActive' )
            // InternalSalesTransaction.g:3031:2: 'isActive'
            {
             before(grammarAccess.getItemAccess().getIsActiveKeyword_10()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getIsActiveKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__10__Impl"


    // $ANTLR start "rule__Item__Group__11"
    // InternalSalesTransaction.g:3040:1: rule__Item__Group__11 : rule__Item__Group__11__Impl rule__Item__Group__12 ;
    public final void rule__Item__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3044:1: ( rule__Item__Group__11__Impl rule__Item__Group__12 )
            // InternalSalesTransaction.g:3045:2: rule__Item__Group__11__Impl rule__Item__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__Item__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__11"


    // $ANTLR start "rule__Item__Group__11__Impl"
    // InternalSalesTransaction.g:3052:1: rule__Item__Group__11__Impl : ( ( rule__Item__IsActiveAssignment_11 ) ) ;
    public final void rule__Item__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3056:1: ( ( ( rule__Item__IsActiveAssignment_11 ) ) )
            // InternalSalesTransaction.g:3057:1: ( ( rule__Item__IsActiveAssignment_11 ) )
            {
            // InternalSalesTransaction.g:3057:1: ( ( rule__Item__IsActiveAssignment_11 ) )
            // InternalSalesTransaction.g:3058:2: ( rule__Item__IsActiveAssignment_11 )
            {
             before(grammarAccess.getItemAccess().getIsActiveAssignment_11()); 
            // InternalSalesTransaction.g:3059:2: ( rule__Item__IsActiveAssignment_11 )
            // InternalSalesTransaction.g:3059:3: rule__Item__IsActiveAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Item__IsActiveAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getIsActiveAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__11__Impl"


    // $ANTLR start "rule__Item__Group__12"
    // InternalSalesTransaction.g:3067:1: rule__Item__Group__12 : rule__Item__Group__12__Impl rule__Item__Group__13 ;
    public final void rule__Item__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3071:1: ( rule__Item__Group__12__Impl rule__Item__Group__13 )
            // InternalSalesTransaction.g:3072:2: rule__Item__Group__12__Impl rule__Item__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__Item__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__12"


    // $ANTLR start "rule__Item__Group__12__Impl"
    // InternalSalesTransaction.g:3079:1: rule__Item__Group__12__Impl : ( 'unitPrice' ) ;
    public final void rule__Item__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3083:1: ( ( 'unitPrice' ) )
            // InternalSalesTransaction.g:3084:1: ( 'unitPrice' )
            {
            // InternalSalesTransaction.g:3084:1: ( 'unitPrice' )
            // InternalSalesTransaction.g:3085:2: 'unitPrice'
            {
             before(grammarAccess.getItemAccess().getUnitPriceKeyword_12()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getUnitPriceKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__12__Impl"


    // $ANTLR start "rule__Item__Group__13"
    // InternalSalesTransaction.g:3094:1: rule__Item__Group__13 : rule__Item__Group__13__Impl rule__Item__Group__14 ;
    public final void rule__Item__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3098:1: ( rule__Item__Group__13__Impl rule__Item__Group__14 )
            // InternalSalesTransaction.g:3099:2: rule__Item__Group__13__Impl rule__Item__Group__14
            {
            pushFollow(FOLLOW_31);
            rule__Item__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__13"


    // $ANTLR start "rule__Item__Group__13__Impl"
    // InternalSalesTransaction.g:3106:1: rule__Item__Group__13__Impl : ( ( rule__Item__UnitPriceAssignment_13 ) ) ;
    public final void rule__Item__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3110:1: ( ( ( rule__Item__UnitPriceAssignment_13 ) ) )
            // InternalSalesTransaction.g:3111:1: ( ( rule__Item__UnitPriceAssignment_13 ) )
            {
            // InternalSalesTransaction.g:3111:1: ( ( rule__Item__UnitPriceAssignment_13 ) )
            // InternalSalesTransaction.g:3112:2: ( rule__Item__UnitPriceAssignment_13 )
            {
             before(grammarAccess.getItemAccess().getUnitPriceAssignment_13()); 
            // InternalSalesTransaction.g:3113:2: ( rule__Item__UnitPriceAssignment_13 )
            // InternalSalesTransaction.g:3113:3: rule__Item__UnitPriceAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Item__UnitPriceAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getUnitPriceAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__13__Impl"


    // $ANTLR start "rule__Item__Group__14"
    // InternalSalesTransaction.g:3121:1: rule__Item__Group__14 : rule__Item__Group__14__Impl ;
    public final void rule__Item__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3125:1: ( rule__Item__Group__14__Impl )
            // InternalSalesTransaction.g:3126:2: rule__Item__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__14"


    // $ANTLR start "rule__Item__Group__14__Impl"
    // InternalSalesTransaction.g:3132:1: rule__Item__Group__14__Impl : ( '}' ) ;
    public final void rule__Item__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3136:1: ( ( '}' ) )
            // InternalSalesTransaction.g:3137:1: ( '}' )
            {
            // InternalSalesTransaction.g:3137:1: ( '}' )
            // InternalSalesTransaction.g:3138:2: '}'
            {
             before(grammarAccess.getItemAccess().getRightCurlyBracketKeyword_14()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__14__Impl"


    // $ANTLR start "rule__Item__Group_3__0"
    // InternalSalesTransaction.g:3148:1: rule__Item__Group_3__0 : rule__Item__Group_3__0__Impl rule__Item__Group_3__1 ;
    public final void rule__Item__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3152:1: ( rule__Item__Group_3__0__Impl rule__Item__Group_3__1 )
            // InternalSalesTransaction.g:3153:2: rule__Item__Group_3__0__Impl rule__Item__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Item__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_3__0"


    // $ANTLR start "rule__Item__Group_3__0__Impl"
    // InternalSalesTransaction.g:3160:1: rule__Item__Group_3__0__Impl : ( 'code' ) ;
    public final void rule__Item__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3164:1: ( ( 'code' ) )
            // InternalSalesTransaction.g:3165:1: ( 'code' )
            {
            // InternalSalesTransaction.g:3165:1: ( 'code' )
            // InternalSalesTransaction.g:3166:2: 'code'
            {
             before(grammarAccess.getItemAccess().getCodeKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getCodeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_3__0__Impl"


    // $ANTLR start "rule__Item__Group_3__1"
    // InternalSalesTransaction.g:3175:1: rule__Item__Group_3__1 : rule__Item__Group_3__1__Impl ;
    public final void rule__Item__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3179:1: ( rule__Item__Group_3__1__Impl )
            // InternalSalesTransaction.g:3180:2: rule__Item__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_3__1"


    // $ANTLR start "rule__Item__Group_3__1__Impl"
    // InternalSalesTransaction.g:3186:1: rule__Item__Group_3__1__Impl : ( ( rule__Item__CodeAssignment_3_1 ) ) ;
    public final void rule__Item__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3190:1: ( ( ( rule__Item__CodeAssignment_3_1 ) ) )
            // InternalSalesTransaction.g:3191:1: ( ( rule__Item__CodeAssignment_3_1 ) )
            {
            // InternalSalesTransaction.g:3191:1: ( ( rule__Item__CodeAssignment_3_1 ) )
            // InternalSalesTransaction.g:3192:2: ( rule__Item__CodeAssignment_3_1 )
            {
             before(grammarAccess.getItemAccess().getCodeAssignment_3_1()); 
            // InternalSalesTransaction.g:3193:2: ( rule__Item__CodeAssignment_3_1 )
            // InternalSalesTransaction.g:3193:3: rule__Item__CodeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__CodeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getCodeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_3__1__Impl"


    // $ANTLR start "rule__Item__Group_4__0"
    // InternalSalesTransaction.g:3202:1: rule__Item__Group_4__0 : rule__Item__Group_4__0__Impl rule__Item__Group_4__1 ;
    public final void rule__Item__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3206:1: ( rule__Item__Group_4__0__Impl rule__Item__Group_4__1 )
            // InternalSalesTransaction.g:3207:2: rule__Item__Group_4__0__Impl rule__Item__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Item__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_4__0"


    // $ANTLR start "rule__Item__Group_4__0__Impl"
    // InternalSalesTransaction.g:3214:1: rule__Item__Group_4__0__Impl : ( 'batch' ) ;
    public final void rule__Item__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3218:1: ( ( 'batch' ) )
            // InternalSalesTransaction.g:3219:1: ( 'batch' )
            {
            // InternalSalesTransaction.g:3219:1: ( 'batch' )
            // InternalSalesTransaction.g:3220:2: 'batch'
            {
             before(grammarAccess.getItemAccess().getBatchKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getBatchKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_4__0__Impl"


    // $ANTLR start "rule__Item__Group_4__1"
    // InternalSalesTransaction.g:3229:1: rule__Item__Group_4__1 : rule__Item__Group_4__1__Impl ;
    public final void rule__Item__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3233:1: ( rule__Item__Group_4__1__Impl )
            // InternalSalesTransaction.g:3234:2: rule__Item__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_4__1"


    // $ANTLR start "rule__Item__Group_4__1__Impl"
    // InternalSalesTransaction.g:3240:1: rule__Item__Group_4__1__Impl : ( ( rule__Item__BatchAssignment_4_1 ) ) ;
    public final void rule__Item__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3244:1: ( ( ( rule__Item__BatchAssignment_4_1 ) ) )
            // InternalSalesTransaction.g:3245:1: ( ( rule__Item__BatchAssignment_4_1 ) )
            {
            // InternalSalesTransaction.g:3245:1: ( ( rule__Item__BatchAssignment_4_1 ) )
            // InternalSalesTransaction.g:3246:2: ( rule__Item__BatchAssignment_4_1 )
            {
             before(grammarAccess.getItemAccess().getBatchAssignment_4_1()); 
            // InternalSalesTransaction.g:3247:2: ( rule__Item__BatchAssignment_4_1 )
            // InternalSalesTransaction.g:3247:3: rule__Item__BatchAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__BatchAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getBatchAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_4__1__Impl"


    // $ANTLR start "rule__Item__Group_5__0"
    // InternalSalesTransaction.g:3256:1: rule__Item__Group_5__0 : rule__Item__Group_5__0__Impl rule__Item__Group_5__1 ;
    public final void rule__Item__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3260:1: ( rule__Item__Group_5__0__Impl rule__Item__Group_5__1 )
            // InternalSalesTransaction.g:3261:2: rule__Item__Group_5__0__Impl rule__Item__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Item__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_5__0"


    // $ANTLR start "rule__Item__Group_5__0__Impl"
    // InternalSalesTransaction.g:3268:1: rule__Item__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Item__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3272:1: ( ( 'description' ) )
            // InternalSalesTransaction.g:3273:1: ( 'description' )
            {
            // InternalSalesTransaction.g:3273:1: ( 'description' )
            // InternalSalesTransaction.g:3274:2: 'description'
            {
             before(grammarAccess.getItemAccess().getDescriptionKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_5__0__Impl"


    // $ANTLR start "rule__Item__Group_5__1"
    // InternalSalesTransaction.g:3283:1: rule__Item__Group_5__1 : rule__Item__Group_5__1__Impl ;
    public final void rule__Item__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3287:1: ( rule__Item__Group_5__1__Impl )
            // InternalSalesTransaction.g:3288:2: rule__Item__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_5__1"


    // $ANTLR start "rule__Item__Group_5__1__Impl"
    // InternalSalesTransaction.g:3294:1: rule__Item__Group_5__1__Impl : ( ( rule__Item__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Item__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3298:1: ( ( ( rule__Item__DescriptionAssignment_5_1 ) ) )
            // InternalSalesTransaction.g:3299:1: ( ( rule__Item__DescriptionAssignment_5_1 ) )
            {
            // InternalSalesTransaction.g:3299:1: ( ( rule__Item__DescriptionAssignment_5_1 ) )
            // InternalSalesTransaction.g:3300:2: ( rule__Item__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getItemAccess().getDescriptionAssignment_5_1()); 
            // InternalSalesTransaction.g:3301:2: ( rule__Item__DescriptionAssignment_5_1 )
            // InternalSalesTransaction.g:3301:3: rule__Item__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_5__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalSalesTransaction.g:3310:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3314:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSalesTransaction.g:3315:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalSalesTransaction.g:3322:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3326:1: ( ( ( '-' )? ) )
            // InternalSalesTransaction.g:3327:1: ( ( '-' )? )
            {
            // InternalSalesTransaction.g:3327:1: ( ( '-' )? )
            // InternalSalesTransaction.g:3328:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSalesTransaction.g:3329:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSalesTransaction.g:3329:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalSalesTransaction.g:3337:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3341:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSalesTransaction.g:3342:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalSalesTransaction.g:3349:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3353:1: ( ( ( RULE_INT )? ) )
            // InternalSalesTransaction.g:3354:1: ( ( RULE_INT )? )
            {
            // InternalSalesTransaction.g:3354:1: ( ( RULE_INT )? )
            // InternalSalesTransaction.g:3355:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSalesTransaction.g:3356:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSalesTransaction.g:3356:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalSalesTransaction.g:3364:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3368:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSalesTransaction.g:3369:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalSalesTransaction.g:3376:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3380:1: ( ( '.' ) )
            // InternalSalesTransaction.g:3381:1: ( '.' )
            {
            // InternalSalesTransaction.g:3381:1: ( '.' )
            // InternalSalesTransaction.g:3382:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalSalesTransaction.g:3391:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3395:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSalesTransaction.g:3396:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalSalesTransaction.g:3403:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3407:1: ( ( RULE_INT ) )
            // InternalSalesTransaction.g:3408:1: ( RULE_INT )
            {
            // InternalSalesTransaction.g:3408:1: ( RULE_INT )
            // InternalSalesTransaction.g:3409:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalSalesTransaction.g:3418:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3422:1: ( rule__EDouble__Group__4__Impl )
            // InternalSalesTransaction.g:3423:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalSalesTransaction.g:3429:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3433:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSalesTransaction.g:3434:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:3434:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSalesTransaction.g:3435:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSalesTransaction.g:3436:2: ( rule__EDouble__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=12 && LA30_0<=13)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSalesTransaction.g:3436:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalSalesTransaction.g:3445:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3449:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSalesTransaction.g:3450:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_34);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalSalesTransaction.g:3457:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3461:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSalesTransaction.g:3462:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSalesTransaction.g:3462:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSalesTransaction.g:3463:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSalesTransaction.g:3464:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSalesTransaction.g:3464:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalSalesTransaction.g:3472:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3476:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSalesTransaction.g:3477:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_34);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalSalesTransaction.g:3484:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3488:1: ( ( ( '-' )? ) )
            // InternalSalesTransaction.g:3489:1: ( ( '-' )? )
            {
            // InternalSalesTransaction.g:3489:1: ( ( '-' )? )
            // InternalSalesTransaction.g:3490:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSalesTransaction.g:3491:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSalesTransaction.g:3491:3: '-'
                    {
                    match(input,57,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalSalesTransaction.g:3499:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3503:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSalesTransaction.g:3504:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalSalesTransaction.g:3510:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3514:1: ( ( RULE_INT ) )
            // InternalSalesTransaction.g:3515:1: ( RULE_INT )
            {
            // InternalSalesTransaction.g:3515:1: ( RULE_INT )
            // InternalSalesTransaction.g:3516:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Price__Group__0"
    // InternalSalesTransaction.g:3526:1: rule__Price__Group__0 : rule__Price__Group__0__Impl rule__Price__Group__1 ;
    public final void rule__Price__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3530:1: ( rule__Price__Group__0__Impl rule__Price__Group__1 )
            // InternalSalesTransaction.g:3531:2: rule__Price__Group__0__Impl rule__Price__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Price__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__0"


    // $ANTLR start "rule__Price__Group__0__Impl"
    // InternalSalesTransaction.g:3538:1: rule__Price__Group__0__Impl : ( 'price' ) ;
    public final void rule__Price__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3542:1: ( ( 'price' ) )
            // InternalSalesTransaction.g:3543:1: ( 'price' )
            {
            // InternalSalesTransaction.g:3543:1: ( 'price' )
            // InternalSalesTransaction.g:3544:2: 'price'
            {
             before(grammarAccess.getPriceAccess().getPriceKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getPriceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__0__Impl"


    // $ANTLR start "rule__Price__Group__1"
    // InternalSalesTransaction.g:3553:1: rule__Price__Group__1 : rule__Price__Group__1__Impl rule__Price__Group__2 ;
    public final void rule__Price__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3557:1: ( rule__Price__Group__1__Impl rule__Price__Group__2 )
            // InternalSalesTransaction.g:3558:2: rule__Price__Group__1__Impl rule__Price__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Price__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__1"


    // $ANTLR start "rule__Price__Group__1__Impl"
    // InternalSalesTransaction.g:3565:1: rule__Price__Group__1__Impl : ( '{' ) ;
    public final void rule__Price__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3569:1: ( ( '{' ) )
            // InternalSalesTransaction.g:3570:1: ( '{' )
            {
            // InternalSalesTransaction.g:3570:1: ( '{' )
            // InternalSalesTransaction.g:3571:2: '{'
            {
             before(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__1__Impl"


    // $ANTLR start "rule__Price__Group__2"
    // InternalSalesTransaction.g:3580:1: rule__Price__Group__2 : rule__Price__Group__2__Impl rule__Price__Group__3 ;
    public final void rule__Price__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3584:1: ( rule__Price__Group__2__Impl rule__Price__Group__3 )
            // InternalSalesTransaction.g:3585:2: rule__Price__Group__2__Impl rule__Price__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Price__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__2"


    // $ANTLR start "rule__Price__Group__2__Impl"
    // InternalSalesTransaction.g:3592:1: rule__Price__Group__2__Impl : ( 'sellingPrice' ) ;
    public final void rule__Price__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3596:1: ( ( 'sellingPrice' ) )
            // InternalSalesTransaction.g:3597:1: ( 'sellingPrice' )
            {
            // InternalSalesTransaction.g:3597:1: ( 'sellingPrice' )
            // InternalSalesTransaction.g:3598:2: 'sellingPrice'
            {
             before(grammarAccess.getPriceAccess().getSellingPriceKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getSellingPriceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__2__Impl"


    // $ANTLR start "rule__Price__Group__3"
    // InternalSalesTransaction.g:3607:1: rule__Price__Group__3 : rule__Price__Group__3__Impl rule__Price__Group__4 ;
    public final void rule__Price__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3611:1: ( rule__Price__Group__3__Impl rule__Price__Group__4 )
            // InternalSalesTransaction.g:3612:2: rule__Price__Group__3__Impl rule__Price__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Price__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Price__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__3"


    // $ANTLR start "rule__Price__Group__3__Impl"
    // InternalSalesTransaction.g:3619:1: rule__Price__Group__3__Impl : ( ( rule__Price__SellingPriceAssignment_3 ) ) ;
    public final void rule__Price__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3623:1: ( ( ( rule__Price__SellingPriceAssignment_3 ) ) )
            // InternalSalesTransaction.g:3624:1: ( ( rule__Price__SellingPriceAssignment_3 ) )
            {
            // InternalSalesTransaction.g:3624:1: ( ( rule__Price__SellingPriceAssignment_3 ) )
            // InternalSalesTransaction.g:3625:2: ( rule__Price__SellingPriceAssignment_3 )
            {
             before(grammarAccess.getPriceAccess().getSellingPriceAssignment_3()); 
            // InternalSalesTransaction.g:3626:2: ( rule__Price__SellingPriceAssignment_3 )
            // InternalSalesTransaction.g:3626:3: rule__Price__SellingPriceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Price__SellingPriceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPriceAccess().getSellingPriceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__3__Impl"


    // $ANTLR start "rule__Price__Group__4"
    // InternalSalesTransaction.g:3634:1: rule__Price__Group__4 : rule__Price__Group__4__Impl ;
    public final void rule__Price__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3638:1: ( rule__Price__Group__4__Impl )
            // InternalSalesTransaction.g:3639:2: rule__Price__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Price__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__4"


    // $ANTLR start "rule__Price__Group__4__Impl"
    // InternalSalesTransaction.g:3645:1: rule__Price__Group__4__Impl : ( '}' ) ;
    public final void rule__Price__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3649:1: ( ( '}' ) )
            // InternalSalesTransaction.g:3650:1: ( '}' )
            {
            // InternalSalesTransaction.g:3650:1: ( '}' )
            // InternalSalesTransaction.g:3651:2: '}'
            {
             before(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPriceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalSalesTransaction.g:3661:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3665:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalSalesTransaction.g:3666:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalSalesTransaction.g:3673:1: rule__Customer__Group__0__Impl : ( () ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3677:1: ( ( () ) )
            // InternalSalesTransaction.g:3678:1: ( () )
            {
            // InternalSalesTransaction.g:3678:1: ( () )
            // InternalSalesTransaction.g:3679:2: ()
            {
             before(grammarAccess.getCustomerAccess().getCustomerAction_0()); 
            // InternalSalesTransaction.g:3680:2: ()
            // InternalSalesTransaction.g:3680:3: 
            {
            }

             after(grammarAccess.getCustomerAccess().getCustomerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalSalesTransaction.g:3688:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3692:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalSalesTransaction.g:3693:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalSalesTransaction.g:3700:1: rule__Customer__Group__1__Impl : ( 'customer' ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3704:1: ( ( 'customer' ) )
            // InternalSalesTransaction.g:3705:1: ( 'customer' )
            {
            // InternalSalesTransaction.g:3705:1: ( 'customer' )
            // InternalSalesTransaction.g:3706:2: 'customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalSalesTransaction.g:3715:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3719:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalSalesTransaction.g:3720:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalSalesTransaction.g:3727:1: rule__Customer__Group__2__Impl : ( ( rule__Customer__NameAssignment_2 ) ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3731:1: ( ( ( rule__Customer__NameAssignment_2 ) ) )
            // InternalSalesTransaction.g:3732:1: ( ( rule__Customer__NameAssignment_2 ) )
            {
            // InternalSalesTransaction.g:3732:1: ( ( rule__Customer__NameAssignment_2 ) )
            // InternalSalesTransaction.g:3733:2: ( rule__Customer__NameAssignment_2 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_2()); 
            // InternalSalesTransaction.g:3734:2: ( rule__Customer__NameAssignment_2 )
            // InternalSalesTransaction.g:3734:3: rule__Customer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Customer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalSalesTransaction.g:3742:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3746:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalSalesTransaction.g:3747:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalSalesTransaction.g:3754:1: rule__Customer__Group__3__Impl : ( '{' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3758:1: ( ( '{' ) )
            // InternalSalesTransaction.g:3759:1: ( '{' )
            {
            // InternalSalesTransaction.g:3759:1: ( '{' )
            // InternalSalesTransaction.g:3760:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalSalesTransaction.g:3769:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3773:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // InternalSalesTransaction.g:3774:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalSalesTransaction.g:3781:1: rule__Customer__Group__4__Impl : ( ( rule__Customer__Group_4__0 )? ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3785:1: ( ( ( rule__Customer__Group_4__0 )? ) )
            // InternalSalesTransaction.g:3786:1: ( ( rule__Customer__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:3786:1: ( ( rule__Customer__Group_4__0 )? )
            // InternalSalesTransaction.g:3787:2: ( rule__Customer__Group_4__0 )?
            {
             before(grammarAccess.getCustomerAccess().getGroup_4()); 
            // InternalSalesTransaction.g:3788:2: ( rule__Customer__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==62) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSalesTransaction.g:3788:3: rule__Customer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__5"
    // InternalSalesTransaction.g:3796:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3800:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // InternalSalesTransaction.g:3801:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5"


    // $ANTLR start "rule__Customer__Group__5__Impl"
    // InternalSalesTransaction.g:3808:1: rule__Customer__Group__5__Impl : ( ( rule__Customer__Group_5__0 )? ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3812:1: ( ( ( rule__Customer__Group_5__0 )? ) )
            // InternalSalesTransaction.g:3813:1: ( ( rule__Customer__Group_5__0 )? )
            {
            // InternalSalesTransaction.g:3813:1: ( ( rule__Customer__Group_5__0 )? )
            // InternalSalesTransaction.g:3814:2: ( rule__Customer__Group_5__0 )?
            {
             before(grammarAccess.getCustomerAccess().getGroup_5()); 
            // InternalSalesTransaction.g:3815:2: ( rule__Customer__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==63) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSalesTransaction.g:3815:3: rule__Customer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5__Impl"


    // $ANTLR start "rule__Customer__Group__6"
    // InternalSalesTransaction.g:3823:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl rule__Customer__Group__7 ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3827:1: ( rule__Customer__Group__6__Impl rule__Customer__Group__7 )
            // InternalSalesTransaction.g:3828:2: rule__Customer__Group__6__Impl rule__Customer__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6"


    // $ANTLR start "rule__Customer__Group__6__Impl"
    // InternalSalesTransaction.g:3835:1: rule__Customer__Group__6__Impl : ( ( rule__Customer__Group_6__0 )? ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3839:1: ( ( ( rule__Customer__Group_6__0 )? ) )
            // InternalSalesTransaction.g:3840:1: ( ( rule__Customer__Group_6__0 )? )
            {
            // InternalSalesTransaction.g:3840:1: ( ( rule__Customer__Group_6__0 )? )
            // InternalSalesTransaction.g:3841:2: ( rule__Customer__Group_6__0 )?
            {
             before(grammarAccess.getCustomerAccess().getGroup_6()); 
            // InternalSalesTransaction.g:3842:2: ( rule__Customer__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==64) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSalesTransaction.g:3842:3: rule__Customer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6__Impl"


    // $ANTLR start "rule__Customer__Group__7"
    // InternalSalesTransaction.g:3850:1: rule__Customer__Group__7 : rule__Customer__Group__7__Impl rule__Customer__Group__8 ;
    public final void rule__Customer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3854:1: ( rule__Customer__Group__7__Impl rule__Customer__Group__8 )
            // InternalSalesTransaction.g:3855:2: rule__Customer__Group__7__Impl rule__Customer__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7"


    // $ANTLR start "rule__Customer__Group__7__Impl"
    // InternalSalesTransaction.g:3862:1: rule__Customer__Group__7__Impl : ( ( rule__Customer__CardAssignment_7 )? ) ;
    public final void rule__Customer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3866:1: ( ( ( rule__Customer__CardAssignment_7 )? ) )
            // InternalSalesTransaction.g:3867:1: ( ( rule__Customer__CardAssignment_7 )? )
            {
            // InternalSalesTransaction.g:3867:1: ( ( rule__Customer__CardAssignment_7 )? )
            // InternalSalesTransaction.g:3868:2: ( rule__Customer__CardAssignment_7 )?
            {
             before(grammarAccess.getCustomerAccess().getCardAssignment_7()); 
            // InternalSalesTransaction.g:3869:2: ( rule__Customer__CardAssignment_7 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSalesTransaction.g:3869:3: rule__Customer__CardAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__CardAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getCardAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7__Impl"


    // $ANTLR start "rule__Customer__Group__8"
    // InternalSalesTransaction.g:3877:1: rule__Customer__Group__8 : rule__Customer__Group__8__Impl rule__Customer__Group__9 ;
    public final void rule__Customer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3881:1: ( rule__Customer__Group__8__Impl rule__Customer__Group__9 )
            // InternalSalesTransaction.g:3882:2: rule__Customer__Group__8__Impl rule__Customer__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__8"


    // $ANTLR start "rule__Customer__Group__8__Impl"
    // InternalSalesTransaction.g:3889:1: rule__Customer__Group__8__Impl : ( ( rule__Customer__CustomerAssignment_8 )? ) ;
    public final void rule__Customer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3893:1: ( ( ( rule__Customer__CustomerAssignment_8 )? ) )
            // InternalSalesTransaction.g:3894:1: ( ( rule__Customer__CustomerAssignment_8 )? )
            {
            // InternalSalesTransaction.g:3894:1: ( ( rule__Customer__CustomerAssignment_8 )? )
            // InternalSalesTransaction.g:3895:2: ( rule__Customer__CustomerAssignment_8 )?
            {
             before(grammarAccess.getCustomerAccess().getCustomerAssignment_8()); 
            // InternalSalesTransaction.g:3896:2: ( rule__Customer__CustomerAssignment_8 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSalesTransaction.g:3896:3: rule__Customer__CustomerAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__CustomerAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getCustomerAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__8__Impl"


    // $ANTLR start "rule__Customer__Group__9"
    // InternalSalesTransaction.g:3904:1: rule__Customer__Group__9 : rule__Customer__Group__9__Impl rule__Customer__Group__10 ;
    public final void rule__Customer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3908:1: ( rule__Customer__Group__9__Impl rule__Customer__Group__10 )
            // InternalSalesTransaction.g:3909:2: rule__Customer__Group__9__Impl rule__Customer__Group__10
            {
            pushFollow(FOLLOW_37);
            rule__Customer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__9"


    // $ANTLR start "rule__Customer__Group__9__Impl"
    // InternalSalesTransaction.g:3916:1: rule__Customer__Group__9__Impl : ( ( rule__Customer__CashierAssignment_9 )? ) ;
    public final void rule__Customer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3920:1: ( ( ( rule__Customer__CashierAssignment_9 )? ) )
            // InternalSalesTransaction.g:3921:1: ( ( rule__Customer__CashierAssignment_9 )? )
            {
            // InternalSalesTransaction.g:3921:1: ( ( rule__Customer__CashierAssignment_9 )? )
            // InternalSalesTransaction.g:3922:2: ( rule__Customer__CashierAssignment_9 )?
            {
             before(grammarAccess.getCustomerAccess().getCashierAssignment_9()); 
            // InternalSalesTransaction.g:3923:2: ( rule__Customer__CashierAssignment_9 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==65) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSalesTransaction.g:3923:3: rule__Customer__CashierAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__CashierAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getCashierAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__9__Impl"


    // $ANTLR start "rule__Customer__Group__10"
    // InternalSalesTransaction.g:3931:1: rule__Customer__Group__10 : rule__Customer__Group__10__Impl ;
    public final void rule__Customer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3935:1: ( rule__Customer__Group__10__Impl )
            // InternalSalesTransaction.g:3936:2: rule__Customer__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__10"


    // $ANTLR start "rule__Customer__Group__10__Impl"
    // InternalSalesTransaction.g:3942:1: rule__Customer__Group__10__Impl : ( '}' ) ;
    public final void rule__Customer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3946:1: ( ( '}' ) )
            // InternalSalesTransaction.g:3947:1: ( '}' )
            {
            // InternalSalesTransaction.g:3947:1: ( '}' )
            // InternalSalesTransaction.g:3948:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__10__Impl"


    // $ANTLR start "rule__Customer__Group_4__0"
    // InternalSalesTransaction.g:3958:1: rule__Customer__Group_4__0 : rule__Customer__Group_4__0__Impl rule__Customer__Group_4__1 ;
    public final void rule__Customer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3962:1: ( rule__Customer__Group_4__0__Impl rule__Customer__Group_4__1 )
            // InternalSalesTransaction.g:3963:2: rule__Customer__Group_4__0__Impl rule__Customer__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_4__0"


    // $ANTLR start "rule__Customer__Group_4__0__Impl"
    // InternalSalesTransaction.g:3970:1: rule__Customer__Group_4__0__Impl : ( 'surName' ) ;
    public final void rule__Customer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3974:1: ( ( 'surName' ) )
            // InternalSalesTransaction.g:3975:1: ( 'surName' )
            {
            // InternalSalesTransaction.g:3975:1: ( 'surName' )
            // InternalSalesTransaction.g:3976:2: 'surName'
            {
             before(grammarAccess.getCustomerAccess().getSurNameKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getSurNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_4__0__Impl"


    // $ANTLR start "rule__Customer__Group_4__1"
    // InternalSalesTransaction.g:3985:1: rule__Customer__Group_4__1 : rule__Customer__Group_4__1__Impl ;
    public final void rule__Customer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:3989:1: ( rule__Customer__Group_4__1__Impl )
            // InternalSalesTransaction.g:3990:2: rule__Customer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_4__1"


    // $ANTLR start "rule__Customer__Group_4__1__Impl"
    // InternalSalesTransaction.g:3996:1: rule__Customer__Group_4__1__Impl : ( ( rule__Customer__SurNameAssignment_4_1 ) ) ;
    public final void rule__Customer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4000:1: ( ( ( rule__Customer__SurNameAssignment_4_1 ) ) )
            // InternalSalesTransaction.g:4001:1: ( ( rule__Customer__SurNameAssignment_4_1 ) )
            {
            // InternalSalesTransaction.g:4001:1: ( ( rule__Customer__SurNameAssignment_4_1 ) )
            // InternalSalesTransaction.g:4002:2: ( rule__Customer__SurNameAssignment_4_1 )
            {
             before(grammarAccess.getCustomerAccess().getSurNameAssignment_4_1()); 
            // InternalSalesTransaction.g:4003:2: ( rule__Customer__SurNameAssignment_4_1 )
            // InternalSalesTransaction.g:4003:3: rule__Customer__SurNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__SurNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getSurNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_4__1__Impl"


    // $ANTLR start "rule__Customer__Group_5__0"
    // InternalSalesTransaction.g:4012:1: rule__Customer__Group_5__0 : rule__Customer__Group_5__0__Impl rule__Customer__Group_5__1 ;
    public final void rule__Customer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4016:1: ( rule__Customer__Group_5__0__Impl rule__Customer__Group_5__1 )
            // InternalSalesTransaction.g:4017:2: rule__Customer__Group_5__0__Impl rule__Customer__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_5__0"


    // $ANTLR start "rule__Customer__Group_5__0__Impl"
    // InternalSalesTransaction.g:4024:1: rule__Customer__Group_5__0__Impl : ( 'identityNumber' ) ;
    public final void rule__Customer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4028:1: ( ( 'identityNumber' ) )
            // InternalSalesTransaction.g:4029:1: ( 'identityNumber' )
            {
            // InternalSalesTransaction.g:4029:1: ( 'identityNumber' )
            // InternalSalesTransaction.g:4030:2: 'identityNumber'
            {
             before(grammarAccess.getCustomerAccess().getIdentityNumberKeyword_5_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getIdentityNumberKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_5__0__Impl"


    // $ANTLR start "rule__Customer__Group_5__1"
    // InternalSalesTransaction.g:4039:1: rule__Customer__Group_5__1 : rule__Customer__Group_5__1__Impl ;
    public final void rule__Customer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4043:1: ( rule__Customer__Group_5__1__Impl )
            // InternalSalesTransaction.g:4044:2: rule__Customer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_5__1"


    // $ANTLR start "rule__Customer__Group_5__1__Impl"
    // InternalSalesTransaction.g:4050:1: rule__Customer__Group_5__1__Impl : ( ( rule__Customer__IdentityNumberAssignment_5_1 ) ) ;
    public final void rule__Customer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4054:1: ( ( ( rule__Customer__IdentityNumberAssignment_5_1 ) ) )
            // InternalSalesTransaction.g:4055:1: ( ( rule__Customer__IdentityNumberAssignment_5_1 ) )
            {
            // InternalSalesTransaction.g:4055:1: ( ( rule__Customer__IdentityNumberAssignment_5_1 ) )
            // InternalSalesTransaction.g:4056:2: ( rule__Customer__IdentityNumberAssignment_5_1 )
            {
             before(grammarAccess.getCustomerAccess().getIdentityNumberAssignment_5_1()); 
            // InternalSalesTransaction.g:4057:2: ( rule__Customer__IdentityNumberAssignment_5_1 )
            // InternalSalesTransaction.g:4057:3: rule__Customer__IdentityNumberAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__IdentityNumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getIdentityNumberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_5__1__Impl"


    // $ANTLR start "rule__Customer__Group_6__0"
    // InternalSalesTransaction.g:4066:1: rule__Customer__Group_6__0 : rule__Customer__Group_6__0__Impl rule__Customer__Group_6__1 ;
    public final void rule__Customer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4070:1: ( rule__Customer__Group_6__0__Impl rule__Customer__Group_6__1 )
            // InternalSalesTransaction.g:4071:2: rule__Customer__Group_6__0__Impl rule__Customer__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_6__0"


    // $ANTLR start "rule__Customer__Group_6__0__Impl"
    // InternalSalesTransaction.g:4078:1: rule__Customer__Group_6__0__Impl : ( 'phoneNumber' ) ;
    public final void rule__Customer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4082:1: ( ( 'phoneNumber' ) )
            // InternalSalesTransaction.g:4083:1: ( 'phoneNumber' )
            {
            // InternalSalesTransaction.g:4083:1: ( 'phoneNumber' )
            // InternalSalesTransaction.g:4084:2: 'phoneNumber'
            {
             before(grammarAccess.getCustomerAccess().getPhoneNumberKeyword_6_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getPhoneNumberKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_6__0__Impl"


    // $ANTLR start "rule__Customer__Group_6__1"
    // InternalSalesTransaction.g:4093:1: rule__Customer__Group_6__1 : rule__Customer__Group_6__1__Impl ;
    public final void rule__Customer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4097:1: ( rule__Customer__Group_6__1__Impl )
            // InternalSalesTransaction.g:4098:2: rule__Customer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_6__1"


    // $ANTLR start "rule__Customer__Group_6__1__Impl"
    // InternalSalesTransaction.g:4104:1: rule__Customer__Group_6__1__Impl : ( ( rule__Customer__PhoneNumberAssignment_6_1 ) ) ;
    public final void rule__Customer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4108:1: ( ( ( rule__Customer__PhoneNumberAssignment_6_1 ) ) )
            // InternalSalesTransaction.g:4109:1: ( ( rule__Customer__PhoneNumberAssignment_6_1 ) )
            {
            // InternalSalesTransaction.g:4109:1: ( ( rule__Customer__PhoneNumberAssignment_6_1 ) )
            // InternalSalesTransaction.g:4110:2: ( rule__Customer__PhoneNumberAssignment_6_1 )
            {
             before(grammarAccess.getCustomerAccess().getPhoneNumberAssignment_6_1()); 
            // InternalSalesTransaction.g:4111:2: ( rule__Customer__PhoneNumberAssignment_6_1 )
            // InternalSalesTransaction.g:4111:3: rule__Customer__PhoneNumberAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__PhoneNumberAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getPhoneNumberAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_6__1__Impl"


    // $ANTLR start "rule__Cashier__Group__0"
    // InternalSalesTransaction.g:4120:1: rule__Cashier__Group__0 : rule__Cashier__Group__0__Impl rule__Cashier__Group__1 ;
    public final void rule__Cashier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4124:1: ( rule__Cashier__Group__0__Impl rule__Cashier__Group__1 )
            // InternalSalesTransaction.g:4125:2: rule__Cashier__Group__0__Impl rule__Cashier__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Cashier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__0"


    // $ANTLR start "rule__Cashier__Group__0__Impl"
    // InternalSalesTransaction.g:4132:1: rule__Cashier__Group__0__Impl : ( () ) ;
    public final void rule__Cashier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4136:1: ( ( () ) )
            // InternalSalesTransaction.g:4137:1: ( () )
            {
            // InternalSalesTransaction.g:4137:1: ( () )
            // InternalSalesTransaction.g:4138:2: ()
            {
             before(grammarAccess.getCashierAccess().getCashierAction_0()); 
            // InternalSalesTransaction.g:4139:2: ()
            // InternalSalesTransaction.g:4139:3: 
            {
            }

             after(grammarAccess.getCashierAccess().getCashierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__0__Impl"


    // $ANTLR start "rule__Cashier__Group__1"
    // InternalSalesTransaction.g:4147:1: rule__Cashier__Group__1 : rule__Cashier__Group__1__Impl rule__Cashier__Group__2 ;
    public final void rule__Cashier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4151:1: ( rule__Cashier__Group__1__Impl rule__Cashier__Group__2 )
            // InternalSalesTransaction.g:4152:2: rule__Cashier__Group__1__Impl rule__Cashier__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Cashier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__1"


    // $ANTLR start "rule__Cashier__Group__1__Impl"
    // InternalSalesTransaction.g:4159:1: rule__Cashier__Group__1__Impl : ( 'cashier' ) ;
    public final void rule__Cashier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4163:1: ( ( 'cashier' ) )
            // InternalSalesTransaction.g:4164:1: ( 'cashier' )
            {
            // InternalSalesTransaction.g:4164:1: ( 'cashier' )
            // InternalSalesTransaction.g:4165:2: 'cashier'
            {
             before(grammarAccess.getCashierAccess().getCashierKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getCashierAccess().getCashierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__1__Impl"


    // $ANTLR start "rule__Cashier__Group__2"
    // InternalSalesTransaction.g:4174:1: rule__Cashier__Group__2 : rule__Cashier__Group__2__Impl rule__Cashier__Group__3 ;
    public final void rule__Cashier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4178:1: ( rule__Cashier__Group__2__Impl rule__Cashier__Group__3 )
            // InternalSalesTransaction.g:4179:2: rule__Cashier__Group__2__Impl rule__Cashier__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Cashier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__2"


    // $ANTLR start "rule__Cashier__Group__2__Impl"
    // InternalSalesTransaction.g:4186:1: rule__Cashier__Group__2__Impl : ( ( rule__Cashier__NameAssignment_2 ) ) ;
    public final void rule__Cashier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4190:1: ( ( ( rule__Cashier__NameAssignment_2 ) ) )
            // InternalSalesTransaction.g:4191:1: ( ( rule__Cashier__NameAssignment_2 ) )
            {
            // InternalSalesTransaction.g:4191:1: ( ( rule__Cashier__NameAssignment_2 ) )
            // InternalSalesTransaction.g:4192:2: ( rule__Cashier__NameAssignment_2 )
            {
             before(grammarAccess.getCashierAccess().getNameAssignment_2()); 
            // InternalSalesTransaction.g:4193:2: ( rule__Cashier__NameAssignment_2 )
            // InternalSalesTransaction.g:4193:3: rule__Cashier__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCashierAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__2__Impl"


    // $ANTLR start "rule__Cashier__Group__3"
    // InternalSalesTransaction.g:4201:1: rule__Cashier__Group__3 : rule__Cashier__Group__3__Impl rule__Cashier__Group__4 ;
    public final void rule__Cashier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4205:1: ( rule__Cashier__Group__3__Impl rule__Cashier__Group__4 )
            // InternalSalesTransaction.g:4206:2: rule__Cashier__Group__3__Impl rule__Cashier__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Cashier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__3"


    // $ANTLR start "rule__Cashier__Group__3__Impl"
    // InternalSalesTransaction.g:4213:1: rule__Cashier__Group__3__Impl : ( '{' ) ;
    public final void rule__Cashier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4217:1: ( ( '{' ) )
            // InternalSalesTransaction.g:4218:1: ( '{' )
            {
            // InternalSalesTransaction.g:4218:1: ( '{' )
            // InternalSalesTransaction.g:4219:2: '{'
            {
             before(grammarAccess.getCashierAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCashierAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__3__Impl"


    // $ANTLR start "rule__Cashier__Group__4"
    // InternalSalesTransaction.g:4228:1: rule__Cashier__Group__4 : rule__Cashier__Group__4__Impl rule__Cashier__Group__5 ;
    public final void rule__Cashier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4232:1: ( rule__Cashier__Group__4__Impl rule__Cashier__Group__5 )
            // InternalSalesTransaction.g:4233:2: rule__Cashier__Group__4__Impl rule__Cashier__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Cashier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__4"


    // $ANTLR start "rule__Cashier__Group__4__Impl"
    // InternalSalesTransaction.g:4240:1: rule__Cashier__Group__4__Impl : ( ( rule__Cashier__Group_4__0 )? ) ;
    public final void rule__Cashier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4244:1: ( ( ( rule__Cashier__Group_4__0 )? ) )
            // InternalSalesTransaction.g:4245:1: ( ( rule__Cashier__Group_4__0 )? )
            {
            // InternalSalesTransaction.g:4245:1: ( ( rule__Cashier__Group_4__0 )? )
            // InternalSalesTransaction.g:4246:2: ( rule__Cashier__Group_4__0 )?
            {
             before(grammarAccess.getCashierAccess().getGroup_4()); 
            // InternalSalesTransaction.g:4247:2: ( rule__Cashier__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSalesTransaction.g:4247:3: rule__Cashier__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cashier__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCashierAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__4__Impl"


    // $ANTLR start "rule__Cashier__Group__5"
    // InternalSalesTransaction.g:4255:1: rule__Cashier__Group__5 : rule__Cashier__Group__5__Impl rule__Cashier__Group__6 ;
    public final void rule__Cashier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4259:1: ( rule__Cashier__Group__5__Impl rule__Cashier__Group__6 )
            // InternalSalesTransaction.g:4260:2: rule__Cashier__Group__5__Impl rule__Cashier__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__Cashier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__5"


    // $ANTLR start "rule__Cashier__Group__5__Impl"
    // InternalSalesTransaction.g:4267:1: rule__Cashier__Group__5__Impl : ( ( rule__Cashier__Group_5__0 )? ) ;
    public final void rule__Cashier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4271:1: ( ( ( rule__Cashier__Group_5__0 )? ) )
            // InternalSalesTransaction.g:4272:1: ( ( rule__Cashier__Group_5__0 )? )
            {
            // InternalSalesTransaction.g:4272:1: ( ( rule__Cashier__Group_5__0 )? )
            // InternalSalesTransaction.g:4273:2: ( rule__Cashier__Group_5__0 )?
            {
             before(grammarAccess.getCashierAccess().getGroup_5()); 
            // InternalSalesTransaction.g:4274:2: ( rule__Cashier__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSalesTransaction.g:4274:3: rule__Cashier__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cashier__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCashierAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__5__Impl"


    // $ANTLR start "rule__Cashier__Group__6"
    // InternalSalesTransaction.g:4282:1: rule__Cashier__Group__6 : rule__Cashier__Group__6__Impl rule__Cashier__Group__7 ;
    public final void rule__Cashier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4286:1: ( rule__Cashier__Group__6__Impl rule__Cashier__Group__7 )
            // InternalSalesTransaction.g:4287:2: rule__Cashier__Group__6__Impl rule__Cashier__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Cashier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__6"


    // $ANTLR start "rule__Cashier__Group__6__Impl"
    // InternalSalesTransaction.g:4294:1: rule__Cashier__Group__6__Impl : ( ( rule__Cashier__CustomerAssignment_6 )? ) ;
    public final void rule__Cashier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4298:1: ( ( ( rule__Cashier__CustomerAssignment_6 )? ) )
            // InternalSalesTransaction.g:4299:1: ( ( rule__Cashier__CustomerAssignment_6 )? )
            {
            // InternalSalesTransaction.g:4299:1: ( ( rule__Cashier__CustomerAssignment_6 )? )
            // InternalSalesTransaction.g:4300:2: ( rule__Cashier__CustomerAssignment_6 )?
            {
             before(grammarAccess.getCashierAccess().getCustomerAssignment_6()); 
            // InternalSalesTransaction.g:4301:2: ( rule__Cashier__CustomerAssignment_6 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSalesTransaction.g:4301:3: rule__Cashier__CustomerAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cashier__CustomerAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCashierAccess().getCustomerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__6__Impl"


    // $ANTLR start "rule__Cashier__Group__7"
    // InternalSalesTransaction.g:4309:1: rule__Cashier__Group__7 : rule__Cashier__Group__7__Impl rule__Cashier__Group__8 ;
    public final void rule__Cashier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4313:1: ( rule__Cashier__Group__7__Impl rule__Cashier__Group__8 )
            // InternalSalesTransaction.g:4314:2: rule__Cashier__Group__7__Impl rule__Cashier__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Cashier__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__7"


    // $ANTLR start "rule__Cashier__Group__7__Impl"
    // InternalSalesTransaction.g:4321:1: rule__Cashier__Group__7__Impl : ( ( rule__Cashier__CashierAssignment_7 )? ) ;
    public final void rule__Cashier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4325:1: ( ( ( rule__Cashier__CashierAssignment_7 )? ) )
            // InternalSalesTransaction.g:4326:1: ( ( rule__Cashier__CashierAssignment_7 )? )
            {
            // InternalSalesTransaction.g:4326:1: ( ( rule__Cashier__CashierAssignment_7 )? )
            // InternalSalesTransaction.g:4327:2: ( rule__Cashier__CashierAssignment_7 )?
            {
             before(grammarAccess.getCashierAccess().getCashierAssignment_7()); 
            // InternalSalesTransaction.g:4328:2: ( rule__Cashier__CashierAssignment_7 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSalesTransaction.g:4328:3: rule__Cashier__CashierAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cashier__CashierAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCashierAccess().getCashierAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__7__Impl"


    // $ANTLR start "rule__Cashier__Group__8"
    // InternalSalesTransaction.g:4336:1: rule__Cashier__Group__8 : rule__Cashier__Group__8__Impl ;
    public final void rule__Cashier__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4340:1: ( rule__Cashier__Group__8__Impl )
            // InternalSalesTransaction.g:4341:2: rule__Cashier__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__8"


    // $ANTLR start "rule__Cashier__Group__8__Impl"
    // InternalSalesTransaction.g:4347:1: rule__Cashier__Group__8__Impl : ( '}' ) ;
    public final void rule__Cashier__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4351:1: ( ( '}' ) )
            // InternalSalesTransaction.g:4352:1: ( '}' )
            {
            // InternalSalesTransaction.g:4352:1: ( '}' )
            // InternalSalesTransaction.g:4353:2: '}'
            {
             before(grammarAccess.getCashierAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCashierAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group__8__Impl"


    // $ANTLR start "rule__Cashier__Group_4__0"
    // InternalSalesTransaction.g:4363:1: rule__Cashier__Group_4__0 : rule__Cashier__Group_4__0__Impl rule__Cashier__Group_4__1 ;
    public final void rule__Cashier__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4367:1: ( rule__Cashier__Group_4__0__Impl rule__Cashier__Group_4__1 )
            // InternalSalesTransaction.g:4368:2: rule__Cashier__Group_4__0__Impl rule__Cashier__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Cashier__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_4__0"


    // $ANTLR start "rule__Cashier__Group_4__0__Impl"
    // InternalSalesTransaction.g:4375:1: rule__Cashier__Group_4__0__Impl : ( 'surName' ) ;
    public final void rule__Cashier__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4379:1: ( ( 'surName' ) )
            // InternalSalesTransaction.g:4380:1: ( 'surName' )
            {
            // InternalSalesTransaction.g:4380:1: ( 'surName' )
            // InternalSalesTransaction.g:4381:2: 'surName'
            {
             before(grammarAccess.getCashierAccess().getSurNameKeyword_4_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getCashierAccess().getSurNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_4__0__Impl"


    // $ANTLR start "rule__Cashier__Group_4__1"
    // InternalSalesTransaction.g:4390:1: rule__Cashier__Group_4__1 : rule__Cashier__Group_4__1__Impl ;
    public final void rule__Cashier__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4394:1: ( rule__Cashier__Group_4__1__Impl )
            // InternalSalesTransaction.g:4395:2: rule__Cashier__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_4__1"


    // $ANTLR start "rule__Cashier__Group_4__1__Impl"
    // InternalSalesTransaction.g:4401:1: rule__Cashier__Group_4__1__Impl : ( ( rule__Cashier__SurNameAssignment_4_1 ) ) ;
    public final void rule__Cashier__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4405:1: ( ( ( rule__Cashier__SurNameAssignment_4_1 ) ) )
            // InternalSalesTransaction.g:4406:1: ( ( rule__Cashier__SurNameAssignment_4_1 ) )
            {
            // InternalSalesTransaction.g:4406:1: ( ( rule__Cashier__SurNameAssignment_4_1 ) )
            // InternalSalesTransaction.g:4407:2: ( rule__Cashier__SurNameAssignment_4_1 )
            {
             before(grammarAccess.getCashierAccess().getSurNameAssignment_4_1()); 
            // InternalSalesTransaction.g:4408:2: ( rule__Cashier__SurNameAssignment_4_1 )
            // InternalSalesTransaction.g:4408:3: rule__Cashier__SurNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__SurNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCashierAccess().getSurNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_4__1__Impl"


    // $ANTLR start "rule__Cashier__Group_5__0"
    // InternalSalesTransaction.g:4417:1: rule__Cashier__Group_5__0 : rule__Cashier__Group_5__0__Impl rule__Cashier__Group_5__1 ;
    public final void rule__Cashier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4421:1: ( rule__Cashier__Group_5__0__Impl rule__Cashier__Group_5__1 )
            // InternalSalesTransaction.g:4422:2: rule__Cashier__Group_5__0__Impl rule__Cashier__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Cashier__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cashier__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_5__0"


    // $ANTLR start "rule__Cashier__Group_5__0__Impl"
    // InternalSalesTransaction.g:4429:1: rule__Cashier__Group_5__0__Impl : ( 'employeeId' ) ;
    public final void rule__Cashier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4433:1: ( ( 'employeeId' ) )
            // InternalSalesTransaction.g:4434:1: ( 'employeeId' )
            {
            // InternalSalesTransaction.g:4434:1: ( 'employeeId' )
            // InternalSalesTransaction.g:4435:2: 'employeeId'
            {
             before(grammarAccess.getCashierAccess().getEmployeeIdKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getCashierAccess().getEmployeeIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_5__0__Impl"


    // $ANTLR start "rule__Cashier__Group_5__1"
    // InternalSalesTransaction.g:4444:1: rule__Cashier__Group_5__1 : rule__Cashier__Group_5__1__Impl ;
    public final void rule__Cashier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4448:1: ( rule__Cashier__Group_5__1__Impl )
            // InternalSalesTransaction.g:4449:2: rule__Cashier__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_5__1"


    // $ANTLR start "rule__Cashier__Group_5__1__Impl"
    // InternalSalesTransaction.g:4455:1: rule__Cashier__Group_5__1__Impl : ( ( rule__Cashier__EmployeeIdAssignment_5_1 ) ) ;
    public final void rule__Cashier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4459:1: ( ( ( rule__Cashier__EmployeeIdAssignment_5_1 ) ) )
            // InternalSalesTransaction.g:4460:1: ( ( rule__Cashier__EmployeeIdAssignment_5_1 ) )
            {
            // InternalSalesTransaction.g:4460:1: ( ( rule__Cashier__EmployeeIdAssignment_5_1 ) )
            // InternalSalesTransaction.g:4461:2: ( rule__Cashier__EmployeeIdAssignment_5_1 )
            {
             before(grammarAccess.getCashierAccess().getEmployeeIdAssignment_5_1()); 
            // InternalSalesTransaction.g:4462:2: ( rule__Cashier__EmployeeIdAssignment_5_1 )
            // InternalSalesTransaction.g:4462:3: rule__Cashier__EmployeeIdAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Cashier__EmployeeIdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCashierAccess().getEmployeeIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__Group_5__1__Impl"


    // $ANTLR start "rule__LineItem__Group__0"
    // InternalSalesTransaction.g:4471:1: rule__LineItem__Group__0 : rule__LineItem__Group__0__Impl rule__LineItem__Group__1 ;
    public final void rule__LineItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4475:1: ( rule__LineItem__Group__0__Impl rule__LineItem__Group__1 )
            // InternalSalesTransaction.g:4476:2: rule__LineItem__Group__0__Impl rule__LineItem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LineItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__0"


    // $ANTLR start "rule__LineItem__Group__0__Impl"
    // InternalSalesTransaction.g:4483:1: rule__LineItem__Group__0__Impl : ( 'lineItem' ) ;
    public final void rule__LineItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4487:1: ( ( 'lineItem' ) )
            // InternalSalesTransaction.g:4488:1: ( 'lineItem' )
            {
            // InternalSalesTransaction.g:4488:1: ( 'lineItem' )
            // InternalSalesTransaction.g:4489:2: 'lineItem'
            {
             before(grammarAccess.getLineItemAccess().getLineItemKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getLineItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__0__Impl"


    // $ANTLR start "rule__LineItem__Group__1"
    // InternalSalesTransaction.g:4498:1: rule__LineItem__Group__1 : rule__LineItem__Group__1__Impl rule__LineItem__Group__2 ;
    public final void rule__LineItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4502:1: ( rule__LineItem__Group__1__Impl rule__LineItem__Group__2 )
            // InternalSalesTransaction.g:4503:2: rule__LineItem__Group__1__Impl rule__LineItem__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__LineItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__1"


    // $ANTLR start "rule__LineItem__Group__1__Impl"
    // InternalSalesTransaction.g:4510:1: rule__LineItem__Group__1__Impl : ( '{' ) ;
    public final void rule__LineItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4514:1: ( ( '{' ) )
            // InternalSalesTransaction.g:4515:1: ( '{' )
            {
            // InternalSalesTransaction.g:4515:1: ( '{' )
            // InternalSalesTransaction.g:4516:2: '{'
            {
             before(grammarAccess.getLineItemAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__1__Impl"


    // $ANTLR start "rule__LineItem__Group__2"
    // InternalSalesTransaction.g:4525:1: rule__LineItem__Group__2 : rule__LineItem__Group__2__Impl rule__LineItem__Group__3 ;
    public final void rule__LineItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4529:1: ( rule__LineItem__Group__2__Impl rule__LineItem__Group__3 )
            // InternalSalesTransaction.g:4530:2: rule__LineItem__Group__2__Impl rule__LineItem__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__LineItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__2"


    // $ANTLR start "rule__LineItem__Group__2__Impl"
    // InternalSalesTransaction.g:4537:1: rule__LineItem__Group__2__Impl : ( ( rule__LineItem__Group_2__0 )? ) ;
    public final void rule__LineItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4541:1: ( ( ( rule__LineItem__Group_2__0 )? ) )
            // InternalSalesTransaction.g:4542:1: ( ( rule__LineItem__Group_2__0 )? )
            {
            // InternalSalesTransaction.g:4542:1: ( ( rule__LineItem__Group_2__0 )? )
            // InternalSalesTransaction.g:4543:2: ( rule__LineItem__Group_2__0 )?
            {
             before(grammarAccess.getLineItemAccess().getGroup_2()); 
            // InternalSalesTransaction.g:4544:2: ( rule__LineItem__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSalesTransaction.g:4544:3: rule__LineItem__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineItem__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineItemAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__2__Impl"


    // $ANTLR start "rule__LineItem__Group__3"
    // InternalSalesTransaction.g:4552:1: rule__LineItem__Group__3 : rule__LineItem__Group__3__Impl rule__LineItem__Group__4 ;
    public final void rule__LineItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4556:1: ( rule__LineItem__Group__3__Impl rule__LineItem__Group__4 )
            // InternalSalesTransaction.g:4557:2: rule__LineItem__Group__3__Impl rule__LineItem__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__LineItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__3"


    // $ANTLR start "rule__LineItem__Group__3__Impl"
    // InternalSalesTransaction.g:4564:1: rule__LineItem__Group__3__Impl : ( 'quantity' ) ;
    public final void rule__LineItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4568:1: ( ( 'quantity' ) )
            // InternalSalesTransaction.g:4569:1: ( 'quantity' )
            {
            // InternalSalesTransaction.g:4569:1: ( 'quantity' )
            // InternalSalesTransaction.g:4570:2: 'quantity'
            {
             before(grammarAccess.getLineItemAccess().getQuantityKeyword_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getQuantityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__3__Impl"


    // $ANTLR start "rule__LineItem__Group__4"
    // InternalSalesTransaction.g:4579:1: rule__LineItem__Group__4 : rule__LineItem__Group__4__Impl rule__LineItem__Group__5 ;
    public final void rule__LineItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4583:1: ( rule__LineItem__Group__4__Impl rule__LineItem__Group__5 )
            // InternalSalesTransaction.g:4584:2: rule__LineItem__Group__4__Impl rule__LineItem__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__LineItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__4"


    // $ANTLR start "rule__LineItem__Group__4__Impl"
    // InternalSalesTransaction.g:4591:1: rule__LineItem__Group__4__Impl : ( ( rule__LineItem__QuantityAssignment_4 ) ) ;
    public final void rule__LineItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4595:1: ( ( ( rule__LineItem__QuantityAssignment_4 ) ) )
            // InternalSalesTransaction.g:4596:1: ( ( rule__LineItem__QuantityAssignment_4 ) )
            {
            // InternalSalesTransaction.g:4596:1: ( ( rule__LineItem__QuantityAssignment_4 ) )
            // InternalSalesTransaction.g:4597:2: ( rule__LineItem__QuantityAssignment_4 )
            {
             before(grammarAccess.getLineItemAccess().getQuantityAssignment_4()); 
            // InternalSalesTransaction.g:4598:2: ( rule__LineItem__QuantityAssignment_4 )
            // InternalSalesTransaction.g:4598:3: rule__LineItem__QuantityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__QuantityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getQuantityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__4__Impl"


    // $ANTLR start "rule__LineItem__Group__5"
    // InternalSalesTransaction.g:4606:1: rule__LineItem__Group__5 : rule__LineItem__Group__5__Impl rule__LineItem__Group__6 ;
    public final void rule__LineItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4610:1: ( rule__LineItem__Group__5__Impl rule__LineItem__Group__6 )
            // InternalSalesTransaction.g:4611:2: rule__LineItem__Group__5__Impl rule__LineItem__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__LineItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__5"


    // $ANTLR start "rule__LineItem__Group__5__Impl"
    // InternalSalesTransaction.g:4618:1: rule__LineItem__Group__5__Impl : ( 'item' ) ;
    public final void rule__LineItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4622:1: ( ( 'item' ) )
            // InternalSalesTransaction.g:4623:1: ( 'item' )
            {
            // InternalSalesTransaction.g:4623:1: ( 'item' )
            // InternalSalesTransaction.g:4624:2: 'item'
            {
             before(grammarAccess.getLineItemAccess().getItemKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getItemKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__5__Impl"


    // $ANTLR start "rule__LineItem__Group__6"
    // InternalSalesTransaction.g:4633:1: rule__LineItem__Group__6 : rule__LineItem__Group__6__Impl rule__LineItem__Group__7 ;
    public final void rule__LineItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4637:1: ( rule__LineItem__Group__6__Impl rule__LineItem__Group__7 )
            // InternalSalesTransaction.g:4638:2: rule__LineItem__Group__6__Impl rule__LineItem__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__LineItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__6"


    // $ANTLR start "rule__LineItem__Group__6__Impl"
    // InternalSalesTransaction.g:4645:1: rule__LineItem__Group__6__Impl : ( ( rule__LineItem__ItemAssignment_6 ) ) ;
    public final void rule__LineItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4649:1: ( ( ( rule__LineItem__ItemAssignment_6 ) ) )
            // InternalSalesTransaction.g:4650:1: ( ( rule__LineItem__ItemAssignment_6 ) )
            {
            // InternalSalesTransaction.g:4650:1: ( ( rule__LineItem__ItemAssignment_6 ) )
            // InternalSalesTransaction.g:4651:2: ( rule__LineItem__ItemAssignment_6 )
            {
             before(grammarAccess.getLineItemAccess().getItemAssignment_6()); 
            // InternalSalesTransaction.g:4652:2: ( rule__LineItem__ItemAssignment_6 )
            // InternalSalesTransaction.g:4652:3: rule__LineItem__ItemAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__ItemAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getItemAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__6__Impl"


    // $ANTLR start "rule__LineItem__Group__7"
    // InternalSalesTransaction.g:4660:1: rule__LineItem__Group__7 : rule__LineItem__Group__7__Impl rule__LineItem__Group__8 ;
    public final void rule__LineItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4664:1: ( rule__LineItem__Group__7__Impl rule__LineItem__Group__8 )
            // InternalSalesTransaction.g:4665:2: rule__LineItem__Group__7__Impl rule__LineItem__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__LineItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__7"


    // $ANTLR start "rule__LineItem__Group__7__Impl"
    // InternalSalesTransaction.g:4672:1: rule__LineItem__Group__7__Impl : ( ( rule__LineItem__Group_7__0 )? ) ;
    public final void rule__LineItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4676:1: ( ( ( rule__LineItem__Group_7__0 )? ) )
            // InternalSalesTransaction.g:4677:1: ( ( rule__LineItem__Group_7__0 )? )
            {
            // InternalSalesTransaction.g:4677:1: ( ( rule__LineItem__Group_7__0 )? )
            // InternalSalesTransaction.g:4678:2: ( rule__LineItem__Group_7__0 )?
            {
             before(grammarAccess.getLineItemAccess().getGroup_7()); 
            // InternalSalesTransaction.g:4679:2: ( rule__LineItem__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSalesTransaction.g:4679:3: rule__LineItem__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineItem__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineItemAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__7__Impl"


    // $ANTLR start "rule__LineItem__Group__8"
    // InternalSalesTransaction.g:4687:1: rule__LineItem__Group__8 : rule__LineItem__Group__8__Impl rule__LineItem__Group__9 ;
    public final void rule__LineItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4691:1: ( rule__LineItem__Group__8__Impl rule__LineItem__Group__9 )
            // InternalSalesTransaction.g:4692:2: rule__LineItem__Group__8__Impl rule__LineItem__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__LineItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__8"


    // $ANTLR start "rule__LineItem__Group__8__Impl"
    // InternalSalesTransaction.g:4699:1: rule__LineItem__Group__8__Impl : ( ( rule__LineItem__Group_8__0 )? ) ;
    public final void rule__LineItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4703:1: ( ( ( rule__LineItem__Group_8__0 )? ) )
            // InternalSalesTransaction.g:4704:1: ( ( rule__LineItem__Group_8__0 )? )
            {
            // InternalSalesTransaction.g:4704:1: ( ( rule__LineItem__Group_8__0 )? )
            // InternalSalesTransaction.g:4705:2: ( rule__LineItem__Group_8__0 )?
            {
             before(grammarAccess.getLineItemAccess().getGroup_8()); 
            // InternalSalesTransaction.g:4706:2: ( rule__LineItem__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==70) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSalesTransaction.g:4706:3: rule__LineItem__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineItem__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineItemAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__8__Impl"


    // $ANTLR start "rule__LineItem__Group__9"
    // InternalSalesTransaction.g:4714:1: rule__LineItem__Group__9 : rule__LineItem__Group__9__Impl rule__LineItem__Group__10 ;
    public final void rule__LineItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4718:1: ( rule__LineItem__Group__9__Impl rule__LineItem__Group__10 )
            // InternalSalesTransaction.g:4719:2: rule__LineItem__Group__9__Impl rule__LineItem__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__LineItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__9"


    // $ANTLR start "rule__LineItem__Group__9__Impl"
    // InternalSalesTransaction.g:4726:1: rule__LineItem__Group__9__Impl : ( ( rule__LineItem__Group_9__0 )? ) ;
    public final void rule__LineItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4730:1: ( ( ( rule__LineItem__Group_9__0 )? ) )
            // InternalSalesTransaction.g:4731:1: ( ( rule__LineItem__Group_9__0 )? )
            {
            // InternalSalesTransaction.g:4731:1: ( ( rule__LineItem__Group_9__0 )? )
            // InternalSalesTransaction.g:4732:2: ( rule__LineItem__Group_9__0 )?
            {
             before(grammarAccess.getLineItemAccess().getGroup_9()); 
            // InternalSalesTransaction.g:4733:2: ( rule__LineItem__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSalesTransaction.g:4733:3: rule__LineItem__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LineItem__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineItemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__9__Impl"


    // $ANTLR start "rule__LineItem__Group__10"
    // InternalSalesTransaction.g:4741:1: rule__LineItem__Group__10 : rule__LineItem__Group__10__Impl ;
    public final void rule__LineItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4745:1: ( rule__LineItem__Group__10__Impl )
            // InternalSalesTransaction.g:4746:2: rule__LineItem__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__10"


    // $ANTLR start "rule__LineItem__Group__10__Impl"
    // InternalSalesTransaction.g:4752:1: rule__LineItem__Group__10__Impl : ( '}' ) ;
    public final void rule__LineItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4756:1: ( ( '}' ) )
            // InternalSalesTransaction.g:4757:1: ( '}' )
            {
            // InternalSalesTransaction.g:4757:1: ( '}' )
            // InternalSalesTransaction.g:4758:2: '}'
            {
             before(grammarAccess.getLineItemAccess().getRightCurlyBracketKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group__10__Impl"


    // $ANTLR start "rule__LineItem__Group_2__0"
    // InternalSalesTransaction.g:4768:1: rule__LineItem__Group_2__0 : rule__LineItem__Group_2__0__Impl rule__LineItem__Group_2__1 ;
    public final void rule__LineItem__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4772:1: ( rule__LineItem__Group_2__0__Impl rule__LineItem__Group_2__1 )
            // InternalSalesTransaction.g:4773:2: rule__LineItem__Group_2__0__Impl rule__LineItem__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__LineItem__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_2__0"


    // $ANTLR start "rule__LineItem__Group_2__0__Impl"
    // InternalSalesTransaction.g:4780:1: rule__LineItem__Group_2__0__Impl : ( 'code' ) ;
    public final void rule__LineItem__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4784:1: ( ( 'code' ) )
            // InternalSalesTransaction.g:4785:1: ( 'code' )
            {
            // InternalSalesTransaction.g:4785:1: ( 'code' )
            // InternalSalesTransaction.g:4786:2: 'code'
            {
             before(grammarAccess.getLineItemAccess().getCodeKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getCodeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_2__0__Impl"


    // $ANTLR start "rule__LineItem__Group_2__1"
    // InternalSalesTransaction.g:4795:1: rule__LineItem__Group_2__1 : rule__LineItem__Group_2__1__Impl ;
    public final void rule__LineItem__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4799:1: ( rule__LineItem__Group_2__1__Impl )
            // InternalSalesTransaction.g:4800:2: rule__LineItem__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_2__1"


    // $ANTLR start "rule__LineItem__Group_2__1__Impl"
    // InternalSalesTransaction.g:4806:1: rule__LineItem__Group_2__1__Impl : ( ( rule__LineItem__CodeAssignment_2_1 ) ) ;
    public final void rule__LineItem__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4810:1: ( ( ( rule__LineItem__CodeAssignment_2_1 ) ) )
            // InternalSalesTransaction.g:4811:1: ( ( rule__LineItem__CodeAssignment_2_1 ) )
            {
            // InternalSalesTransaction.g:4811:1: ( ( rule__LineItem__CodeAssignment_2_1 ) )
            // InternalSalesTransaction.g:4812:2: ( rule__LineItem__CodeAssignment_2_1 )
            {
             before(grammarAccess.getLineItemAccess().getCodeAssignment_2_1()); 
            // InternalSalesTransaction.g:4813:2: ( rule__LineItem__CodeAssignment_2_1 )
            // InternalSalesTransaction.g:4813:3: rule__LineItem__CodeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__CodeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getCodeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_2__1__Impl"


    // $ANTLR start "rule__LineItem__Group_7__0"
    // InternalSalesTransaction.g:4822:1: rule__LineItem__Group_7__0 : rule__LineItem__Group_7__0__Impl rule__LineItem__Group_7__1 ;
    public final void rule__LineItem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4826:1: ( rule__LineItem__Group_7__0__Impl rule__LineItem__Group_7__1 )
            // InternalSalesTransaction.g:4827:2: rule__LineItem__Group_7__0__Impl rule__LineItem__Group_7__1
            {
            pushFollow(FOLLOW_42);
            rule__LineItem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_7__0"


    // $ANTLR start "rule__LineItem__Group_7__0__Impl"
    // InternalSalesTransaction.g:4834:1: rule__LineItem__Group_7__0__Impl : ( 'tax' ) ;
    public final void rule__LineItem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4838:1: ( ( 'tax' ) )
            // InternalSalesTransaction.g:4839:1: ( 'tax' )
            {
            // InternalSalesTransaction.g:4839:1: ( 'tax' )
            // InternalSalesTransaction.g:4840:2: 'tax'
            {
             before(grammarAccess.getLineItemAccess().getTaxKeyword_7_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getTaxKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_7__0__Impl"


    // $ANTLR start "rule__LineItem__Group_7__1"
    // InternalSalesTransaction.g:4849:1: rule__LineItem__Group_7__1 : rule__LineItem__Group_7__1__Impl ;
    public final void rule__LineItem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4853:1: ( rule__LineItem__Group_7__1__Impl )
            // InternalSalesTransaction.g:4854:2: rule__LineItem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_7__1"


    // $ANTLR start "rule__LineItem__Group_7__1__Impl"
    // InternalSalesTransaction.g:4860:1: rule__LineItem__Group_7__1__Impl : ( ( rule__LineItem__TaxAssignment_7_1 ) ) ;
    public final void rule__LineItem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4864:1: ( ( ( rule__LineItem__TaxAssignment_7_1 ) ) )
            // InternalSalesTransaction.g:4865:1: ( ( rule__LineItem__TaxAssignment_7_1 ) )
            {
            // InternalSalesTransaction.g:4865:1: ( ( rule__LineItem__TaxAssignment_7_1 ) )
            // InternalSalesTransaction.g:4866:2: ( rule__LineItem__TaxAssignment_7_1 )
            {
             before(grammarAccess.getLineItemAccess().getTaxAssignment_7_1()); 
            // InternalSalesTransaction.g:4867:2: ( rule__LineItem__TaxAssignment_7_1 )
            // InternalSalesTransaction.g:4867:3: rule__LineItem__TaxAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__TaxAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getTaxAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_7__1__Impl"


    // $ANTLR start "rule__LineItem__Group_8__0"
    // InternalSalesTransaction.g:4876:1: rule__LineItem__Group_8__0 : rule__LineItem__Group_8__0__Impl rule__LineItem__Group_8__1 ;
    public final void rule__LineItem__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4880:1: ( rule__LineItem__Group_8__0__Impl rule__LineItem__Group_8__1 )
            // InternalSalesTransaction.g:4881:2: rule__LineItem__Group_8__0__Impl rule__LineItem__Group_8__1
            {
            pushFollow(FOLLOW_43);
            rule__LineItem__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_8__0"


    // $ANTLR start "rule__LineItem__Group_8__0__Impl"
    // InternalSalesTransaction.g:4888:1: rule__LineItem__Group_8__0__Impl : ( 'discount' ) ;
    public final void rule__LineItem__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4892:1: ( ( 'discount' ) )
            // InternalSalesTransaction.g:4893:1: ( 'discount' )
            {
            // InternalSalesTransaction.g:4893:1: ( 'discount' )
            // InternalSalesTransaction.g:4894:2: 'discount'
            {
             before(grammarAccess.getLineItemAccess().getDiscountKeyword_8_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getDiscountKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_8__0__Impl"


    // $ANTLR start "rule__LineItem__Group_8__1"
    // InternalSalesTransaction.g:4903:1: rule__LineItem__Group_8__1 : rule__LineItem__Group_8__1__Impl ;
    public final void rule__LineItem__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4907:1: ( rule__LineItem__Group_8__1__Impl )
            // InternalSalesTransaction.g:4908:2: rule__LineItem__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_8__1"


    // $ANTLR start "rule__LineItem__Group_8__1__Impl"
    // InternalSalesTransaction.g:4914:1: rule__LineItem__Group_8__1__Impl : ( ( rule__LineItem__DiscountAssignment_8_1 ) ) ;
    public final void rule__LineItem__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4918:1: ( ( ( rule__LineItem__DiscountAssignment_8_1 ) ) )
            // InternalSalesTransaction.g:4919:1: ( ( rule__LineItem__DiscountAssignment_8_1 ) )
            {
            // InternalSalesTransaction.g:4919:1: ( ( rule__LineItem__DiscountAssignment_8_1 ) )
            // InternalSalesTransaction.g:4920:2: ( rule__LineItem__DiscountAssignment_8_1 )
            {
             before(grammarAccess.getLineItemAccess().getDiscountAssignment_8_1()); 
            // InternalSalesTransaction.g:4921:2: ( rule__LineItem__DiscountAssignment_8_1 )
            // InternalSalesTransaction.g:4921:3: rule__LineItem__DiscountAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__DiscountAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getDiscountAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_8__1__Impl"


    // $ANTLR start "rule__LineItem__Group_9__0"
    // InternalSalesTransaction.g:4930:1: rule__LineItem__Group_9__0 : rule__LineItem__Group_9__0__Impl rule__LineItem__Group_9__1 ;
    public final void rule__LineItem__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4934:1: ( rule__LineItem__Group_9__0__Impl rule__LineItem__Group_9__1 )
            // InternalSalesTransaction.g:4935:2: rule__LineItem__Group_9__0__Impl rule__LineItem__Group_9__1
            {
            pushFollow(FOLLOW_44);
            rule__LineItem__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineItem__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_9__0"


    // $ANTLR start "rule__LineItem__Group_9__0__Impl"
    // InternalSalesTransaction.g:4942:1: rule__LineItem__Group_9__0__Impl : ( 'additionalCharge' ) ;
    public final void rule__LineItem__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4946:1: ( ( 'additionalCharge' ) )
            // InternalSalesTransaction.g:4947:1: ( 'additionalCharge' )
            {
            // InternalSalesTransaction.g:4947:1: ( 'additionalCharge' )
            // InternalSalesTransaction.g:4948:2: 'additionalCharge'
            {
             before(grammarAccess.getLineItemAccess().getAdditionalChargeKeyword_9_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getLineItemAccess().getAdditionalChargeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_9__0__Impl"


    // $ANTLR start "rule__LineItem__Group_9__1"
    // InternalSalesTransaction.g:4957:1: rule__LineItem__Group_9__1 : rule__LineItem__Group_9__1__Impl ;
    public final void rule__LineItem__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4961:1: ( rule__LineItem__Group_9__1__Impl )
            // InternalSalesTransaction.g:4962:2: rule__LineItem__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_9__1"


    // $ANTLR start "rule__LineItem__Group_9__1__Impl"
    // InternalSalesTransaction.g:4968:1: rule__LineItem__Group_9__1__Impl : ( ( rule__LineItem__AdditionalChargeAssignment_9_1 ) ) ;
    public final void rule__LineItem__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4972:1: ( ( ( rule__LineItem__AdditionalChargeAssignment_9_1 ) ) )
            // InternalSalesTransaction.g:4973:1: ( ( rule__LineItem__AdditionalChargeAssignment_9_1 ) )
            {
            // InternalSalesTransaction.g:4973:1: ( ( rule__LineItem__AdditionalChargeAssignment_9_1 ) )
            // InternalSalesTransaction.g:4974:2: ( rule__LineItem__AdditionalChargeAssignment_9_1 )
            {
             before(grammarAccess.getLineItemAccess().getAdditionalChargeAssignment_9_1()); 
            // InternalSalesTransaction.g:4975:2: ( rule__LineItem__AdditionalChargeAssignment_9_1 )
            // InternalSalesTransaction.g:4975:3: rule__LineItem__AdditionalChargeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__LineItem__AdditionalChargeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLineItemAccess().getAdditionalChargeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__Group_9__1__Impl"


    // $ANTLR start "rule__Card__Group__0"
    // InternalSalesTransaction.g:4984:1: rule__Card__Group__0 : rule__Card__Group__0__Impl rule__Card__Group__1 ;
    public final void rule__Card__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:4988:1: ( rule__Card__Group__0__Impl rule__Card__Group__1 )
            // InternalSalesTransaction.g:4989:2: rule__Card__Group__0__Impl rule__Card__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Card__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0"


    // $ANTLR start "rule__Card__Group__0__Impl"
    // InternalSalesTransaction.g:4996:1: rule__Card__Group__0__Impl : ( 'card' ) ;
    public final void rule__Card__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5000:1: ( ( 'card' ) )
            // InternalSalesTransaction.g:5001:1: ( 'card' )
            {
            // InternalSalesTransaction.g:5001:1: ( 'card' )
            // InternalSalesTransaction.g:5002:2: 'card'
            {
             before(grammarAccess.getCardAccess().getCardKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__0__Impl"


    // $ANTLR start "rule__Card__Group__1"
    // InternalSalesTransaction.g:5011:1: rule__Card__Group__1 : rule__Card__Group__1__Impl rule__Card__Group__2 ;
    public final void rule__Card__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5015:1: ( rule__Card__Group__1__Impl rule__Card__Group__2 )
            // InternalSalesTransaction.g:5016:2: rule__Card__Group__1__Impl rule__Card__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Card__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1"


    // $ANTLR start "rule__Card__Group__1__Impl"
    // InternalSalesTransaction.g:5023:1: rule__Card__Group__1__Impl : ( '{' ) ;
    public final void rule__Card__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5027:1: ( ( '{' ) )
            // InternalSalesTransaction.g:5028:1: ( '{' )
            {
            // InternalSalesTransaction.g:5028:1: ( '{' )
            // InternalSalesTransaction.g:5029:2: '{'
            {
             before(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__1__Impl"


    // $ANTLR start "rule__Card__Group__2"
    // InternalSalesTransaction.g:5038:1: rule__Card__Group__2 : rule__Card__Group__2__Impl rule__Card__Group__3 ;
    public final void rule__Card__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5042:1: ( rule__Card__Group__2__Impl rule__Card__Group__3 )
            // InternalSalesTransaction.g:5043:2: rule__Card__Group__2__Impl rule__Card__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Card__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2"


    // $ANTLR start "rule__Card__Group__2__Impl"
    // InternalSalesTransaction.g:5050:1: rule__Card__Group__2__Impl : ( ( rule__Card__Group_2__0 )? ) ;
    public final void rule__Card__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5054:1: ( ( ( rule__Card__Group_2__0 )? ) )
            // InternalSalesTransaction.g:5055:1: ( ( rule__Card__Group_2__0 )? )
            {
            // InternalSalesTransaction.g:5055:1: ( ( rule__Card__Group_2__0 )? )
            // InternalSalesTransaction.g:5056:2: ( rule__Card__Group_2__0 )?
            {
             before(grammarAccess.getCardAccess().getGroup_2()); 
            // InternalSalesTransaction.g:5057:2: ( rule__Card__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==74) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSalesTransaction.g:5057:3: rule__Card__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Card__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__2__Impl"


    // $ANTLR start "rule__Card__Group__3"
    // InternalSalesTransaction.g:5065:1: rule__Card__Group__3 : rule__Card__Group__3__Impl rule__Card__Group__4 ;
    public final void rule__Card__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5069:1: ( rule__Card__Group__3__Impl rule__Card__Group__4 )
            // InternalSalesTransaction.g:5070:2: rule__Card__Group__3__Impl rule__Card__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Card__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3"


    // $ANTLR start "rule__Card__Group__3__Impl"
    // InternalSalesTransaction.g:5077:1: rule__Card__Group__3__Impl : ( ( rule__Card__Group_3__0 )? ) ;
    public final void rule__Card__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5081:1: ( ( ( rule__Card__Group_3__0 )? ) )
            // InternalSalesTransaction.g:5082:1: ( ( rule__Card__Group_3__0 )? )
            {
            // InternalSalesTransaction.g:5082:1: ( ( rule__Card__Group_3__0 )? )
            // InternalSalesTransaction.g:5083:2: ( rule__Card__Group_3__0 )?
            {
             before(grammarAccess.getCardAccess().getGroup_3()); 
            // InternalSalesTransaction.g:5084:2: ( rule__Card__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==75) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSalesTransaction.g:5084:3: rule__Card__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Card__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__3__Impl"


    // $ANTLR start "rule__Card__Group__4"
    // InternalSalesTransaction.g:5092:1: rule__Card__Group__4 : rule__Card__Group__4__Impl rule__Card__Group__5 ;
    public final void rule__Card__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5096:1: ( rule__Card__Group__4__Impl rule__Card__Group__5 )
            // InternalSalesTransaction.g:5097:2: rule__Card__Group__4__Impl rule__Card__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4"


    // $ANTLR start "rule__Card__Group__4__Impl"
    // InternalSalesTransaction.g:5104:1: rule__Card__Group__4__Impl : ( 'cardHolder' ) ;
    public final void rule__Card__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5108:1: ( ( 'cardHolder' ) )
            // InternalSalesTransaction.g:5109:1: ( 'cardHolder' )
            {
            // InternalSalesTransaction.g:5109:1: ( 'cardHolder' )
            // InternalSalesTransaction.g:5110:2: 'cardHolder'
            {
             before(grammarAccess.getCardAccess().getCardHolderKeyword_4()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardHolderKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__4__Impl"


    // $ANTLR start "rule__Card__Group__5"
    // InternalSalesTransaction.g:5119:1: rule__Card__Group__5 : rule__Card__Group__5__Impl rule__Card__Group__6 ;
    public final void rule__Card__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5123:1: ( rule__Card__Group__5__Impl rule__Card__Group__6 )
            // InternalSalesTransaction.g:5124:2: rule__Card__Group__5__Impl rule__Card__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Card__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5"


    // $ANTLR start "rule__Card__Group__5__Impl"
    // InternalSalesTransaction.g:5131:1: rule__Card__Group__5__Impl : ( ( rule__Card__CardHolderAssignment_5 ) ) ;
    public final void rule__Card__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5135:1: ( ( ( rule__Card__CardHolderAssignment_5 ) ) )
            // InternalSalesTransaction.g:5136:1: ( ( rule__Card__CardHolderAssignment_5 ) )
            {
            // InternalSalesTransaction.g:5136:1: ( ( rule__Card__CardHolderAssignment_5 ) )
            // InternalSalesTransaction.g:5137:2: ( rule__Card__CardHolderAssignment_5 )
            {
             before(grammarAccess.getCardAccess().getCardHolderAssignment_5()); 
            // InternalSalesTransaction.g:5138:2: ( rule__Card__CardHolderAssignment_5 )
            // InternalSalesTransaction.g:5138:3: rule__Card__CardHolderAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Card__CardHolderAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getCardHolderAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__5__Impl"


    // $ANTLR start "rule__Card__Group__6"
    // InternalSalesTransaction.g:5146:1: rule__Card__Group__6 : rule__Card__Group__6__Impl ;
    public final void rule__Card__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5150:1: ( rule__Card__Group__6__Impl )
            // InternalSalesTransaction.g:5151:2: rule__Card__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__6"


    // $ANTLR start "rule__Card__Group__6__Impl"
    // InternalSalesTransaction.g:5157:1: rule__Card__Group__6__Impl : ( '}' ) ;
    public final void rule__Card__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5161:1: ( ( '}' ) )
            // InternalSalesTransaction.g:5162:1: ( '}' )
            {
            // InternalSalesTransaction.g:5162:1: ( '}' )
            // InternalSalesTransaction.g:5163:2: '}'
            {
             before(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group__6__Impl"


    // $ANTLR start "rule__Card__Group_2__0"
    // InternalSalesTransaction.g:5173:1: rule__Card__Group_2__0 : rule__Card__Group_2__0__Impl rule__Card__Group_2__1 ;
    public final void rule__Card__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5177:1: ( rule__Card__Group_2__0__Impl rule__Card__Group_2__1 )
            // InternalSalesTransaction.g:5178:2: rule__Card__Group_2__0__Impl rule__Card__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_2__0"


    // $ANTLR start "rule__Card__Group_2__0__Impl"
    // InternalSalesTransaction.g:5185:1: rule__Card__Group_2__0__Impl : ( 'cardNumber' ) ;
    public final void rule__Card__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5189:1: ( ( 'cardNumber' ) )
            // InternalSalesTransaction.g:5190:1: ( 'cardNumber' )
            {
            // InternalSalesTransaction.g:5190:1: ( 'cardNumber' )
            // InternalSalesTransaction.g:5191:2: 'cardNumber'
            {
             before(grammarAccess.getCardAccess().getCardNumberKeyword_2_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardNumberKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_2__0__Impl"


    // $ANTLR start "rule__Card__Group_2__1"
    // InternalSalesTransaction.g:5200:1: rule__Card__Group_2__1 : rule__Card__Group_2__1__Impl ;
    public final void rule__Card__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5204:1: ( rule__Card__Group_2__1__Impl )
            // InternalSalesTransaction.g:5205:2: rule__Card__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_2__1"


    // $ANTLR start "rule__Card__Group_2__1__Impl"
    // InternalSalesTransaction.g:5211:1: rule__Card__Group_2__1__Impl : ( ( rule__Card__CardNumberAssignment_2_1 ) ) ;
    public final void rule__Card__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5215:1: ( ( ( rule__Card__CardNumberAssignment_2_1 ) ) )
            // InternalSalesTransaction.g:5216:1: ( ( rule__Card__CardNumberAssignment_2_1 ) )
            {
            // InternalSalesTransaction.g:5216:1: ( ( rule__Card__CardNumberAssignment_2_1 ) )
            // InternalSalesTransaction.g:5217:2: ( rule__Card__CardNumberAssignment_2_1 )
            {
             before(grammarAccess.getCardAccess().getCardNumberAssignment_2_1()); 
            // InternalSalesTransaction.g:5218:2: ( rule__Card__CardNumberAssignment_2_1 )
            // InternalSalesTransaction.g:5218:3: rule__Card__CardNumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Card__CardNumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getCardNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_2__1__Impl"


    // $ANTLR start "rule__Card__Group_3__0"
    // InternalSalesTransaction.g:5227:1: rule__Card__Group_3__0 : rule__Card__Group_3__0__Impl rule__Card__Group_3__1 ;
    public final void rule__Card__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5231:1: ( rule__Card__Group_3__0__Impl rule__Card__Group_3__1 )
            // InternalSalesTransaction.g:5232:2: rule__Card__Group_3__0__Impl rule__Card__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_3__0"


    // $ANTLR start "rule__Card__Group_3__0__Impl"
    // InternalSalesTransaction.g:5239:1: rule__Card__Group_3__0__Impl : ( 'expiryDate' ) ;
    public final void rule__Card__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5243:1: ( ( 'expiryDate' ) )
            // InternalSalesTransaction.g:5244:1: ( 'expiryDate' )
            {
            // InternalSalesTransaction.g:5244:1: ( 'expiryDate' )
            // InternalSalesTransaction.g:5245:2: 'expiryDate'
            {
             before(grammarAccess.getCardAccess().getExpiryDateKeyword_3_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getExpiryDateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_3__0__Impl"


    // $ANTLR start "rule__Card__Group_3__1"
    // InternalSalesTransaction.g:5254:1: rule__Card__Group_3__1 : rule__Card__Group_3__1__Impl ;
    public final void rule__Card__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5258:1: ( rule__Card__Group_3__1__Impl )
            // InternalSalesTransaction.g:5259:2: rule__Card__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_3__1"


    // $ANTLR start "rule__Card__Group_3__1__Impl"
    // InternalSalesTransaction.g:5265:1: rule__Card__Group_3__1__Impl : ( ( rule__Card__ExpiryDateAssignment_3_1 ) ) ;
    public final void rule__Card__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5269:1: ( ( ( rule__Card__ExpiryDateAssignment_3_1 ) ) )
            // InternalSalesTransaction.g:5270:1: ( ( rule__Card__ExpiryDateAssignment_3_1 ) )
            {
            // InternalSalesTransaction.g:5270:1: ( ( rule__Card__ExpiryDateAssignment_3_1 ) )
            // InternalSalesTransaction.g:5271:2: ( rule__Card__ExpiryDateAssignment_3_1 )
            {
             before(grammarAccess.getCardAccess().getExpiryDateAssignment_3_1()); 
            // InternalSalesTransaction.g:5272:2: ( rule__Card__ExpiryDateAssignment_3_1 )
            // InternalSalesTransaction.g:5272:3: rule__Card__ExpiryDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Card__ExpiryDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getExpiryDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_3__1__Impl"


    // $ANTLR start "rule__Tax__Group__0"
    // InternalSalesTransaction.g:5281:1: rule__Tax__Group__0 : rule__Tax__Group__0__Impl rule__Tax__Group__1 ;
    public final void rule__Tax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5285:1: ( rule__Tax__Group__0__Impl rule__Tax__Group__1 )
            // InternalSalesTransaction.g:5286:2: rule__Tax__Group__0__Impl rule__Tax__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__0"


    // $ANTLR start "rule__Tax__Group__0__Impl"
    // InternalSalesTransaction.g:5293:1: rule__Tax__Group__0__Impl : ( 'tax' ) ;
    public final void rule__Tax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5297:1: ( ( 'tax' ) )
            // InternalSalesTransaction.g:5298:1: ( 'tax' )
            {
            // InternalSalesTransaction.g:5298:1: ( 'tax' )
            // InternalSalesTransaction.g:5299:2: 'tax'
            {
             before(grammarAccess.getTaxAccess().getTaxKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getTaxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__0__Impl"


    // $ANTLR start "rule__Tax__Group__1"
    // InternalSalesTransaction.g:5308:1: rule__Tax__Group__1 : rule__Tax__Group__1__Impl rule__Tax__Group__2 ;
    public final void rule__Tax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5312:1: ( rule__Tax__Group__1__Impl rule__Tax__Group__2 )
            // InternalSalesTransaction.g:5313:2: rule__Tax__Group__1__Impl rule__Tax__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Tax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__1"


    // $ANTLR start "rule__Tax__Group__1__Impl"
    // InternalSalesTransaction.g:5320:1: rule__Tax__Group__1__Impl : ( '{' ) ;
    public final void rule__Tax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5324:1: ( ( '{' ) )
            // InternalSalesTransaction.g:5325:1: ( '{' )
            {
            // InternalSalesTransaction.g:5325:1: ( '{' )
            // InternalSalesTransaction.g:5326:2: '{'
            {
             before(grammarAccess.getTaxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__1__Impl"


    // $ANTLR start "rule__Tax__Group__2"
    // InternalSalesTransaction.g:5335:1: rule__Tax__Group__2 : rule__Tax__Group__2__Impl rule__Tax__Group__3 ;
    public final void rule__Tax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5339:1: ( rule__Tax__Group__2__Impl rule__Tax__Group__3 )
            // InternalSalesTransaction.g:5340:2: rule__Tax__Group__2__Impl rule__Tax__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Tax__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__2"


    // $ANTLR start "rule__Tax__Group__2__Impl"
    // InternalSalesTransaction.g:5347:1: rule__Tax__Group__2__Impl : ( 'taxType' ) ;
    public final void rule__Tax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5351:1: ( ( 'taxType' ) )
            // InternalSalesTransaction.g:5352:1: ( 'taxType' )
            {
            // InternalSalesTransaction.g:5352:1: ( 'taxType' )
            // InternalSalesTransaction.g:5353:2: 'taxType'
            {
             before(grammarAccess.getTaxAccess().getTaxTypeKeyword_2()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getTaxTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__2__Impl"


    // $ANTLR start "rule__Tax__Group__3"
    // InternalSalesTransaction.g:5362:1: rule__Tax__Group__3 : rule__Tax__Group__3__Impl rule__Tax__Group__4 ;
    public final void rule__Tax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5366:1: ( rule__Tax__Group__3__Impl rule__Tax__Group__4 )
            // InternalSalesTransaction.g:5367:2: rule__Tax__Group__3__Impl rule__Tax__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Tax__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__3"


    // $ANTLR start "rule__Tax__Group__3__Impl"
    // InternalSalesTransaction.g:5374:1: rule__Tax__Group__3__Impl : ( ( rule__Tax__TaxTypeAssignment_3 ) ) ;
    public final void rule__Tax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5378:1: ( ( ( rule__Tax__TaxTypeAssignment_3 ) ) )
            // InternalSalesTransaction.g:5379:1: ( ( rule__Tax__TaxTypeAssignment_3 ) )
            {
            // InternalSalesTransaction.g:5379:1: ( ( rule__Tax__TaxTypeAssignment_3 ) )
            // InternalSalesTransaction.g:5380:2: ( rule__Tax__TaxTypeAssignment_3 )
            {
             before(grammarAccess.getTaxAccess().getTaxTypeAssignment_3()); 
            // InternalSalesTransaction.g:5381:2: ( rule__Tax__TaxTypeAssignment_3 )
            // InternalSalesTransaction.g:5381:3: rule__Tax__TaxTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tax__TaxTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaxAccess().getTaxTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__3__Impl"


    // $ANTLR start "rule__Tax__Group__4"
    // InternalSalesTransaction.g:5389:1: rule__Tax__Group__4 : rule__Tax__Group__4__Impl rule__Tax__Group__5 ;
    public final void rule__Tax__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5393:1: ( rule__Tax__Group__4__Impl rule__Tax__Group__5 )
            // InternalSalesTransaction.g:5394:2: rule__Tax__Group__4__Impl rule__Tax__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Tax__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__4"


    // $ANTLR start "rule__Tax__Group__4__Impl"
    // InternalSalesTransaction.g:5401:1: rule__Tax__Group__4__Impl : ( 'taxableAmount' ) ;
    public final void rule__Tax__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5405:1: ( ( 'taxableAmount' ) )
            // InternalSalesTransaction.g:5406:1: ( 'taxableAmount' )
            {
            // InternalSalesTransaction.g:5406:1: ( 'taxableAmount' )
            // InternalSalesTransaction.g:5407:2: 'taxableAmount'
            {
             before(grammarAccess.getTaxAccess().getTaxableAmountKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getTaxableAmountKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__4__Impl"


    // $ANTLR start "rule__Tax__Group__5"
    // InternalSalesTransaction.g:5416:1: rule__Tax__Group__5 : rule__Tax__Group__5__Impl rule__Tax__Group__6 ;
    public final void rule__Tax__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5420:1: ( rule__Tax__Group__5__Impl rule__Tax__Group__6 )
            // InternalSalesTransaction.g:5421:2: rule__Tax__Group__5__Impl rule__Tax__Group__6
            {
            pushFollow(FOLLOW_49);
            rule__Tax__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__5"


    // $ANTLR start "rule__Tax__Group__5__Impl"
    // InternalSalesTransaction.g:5428:1: rule__Tax__Group__5__Impl : ( ( rule__Tax__TaxableAmountAssignment_5 ) ) ;
    public final void rule__Tax__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5432:1: ( ( ( rule__Tax__TaxableAmountAssignment_5 ) ) )
            // InternalSalesTransaction.g:5433:1: ( ( rule__Tax__TaxableAmountAssignment_5 ) )
            {
            // InternalSalesTransaction.g:5433:1: ( ( rule__Tax__TaxableAmountAssignment_5 ) )
            // InternalSalesTransaction.g:5434:2: ( rule__Tax__TaxableAmountAssignment_5 )
            {
             before(grammarAccess.getTaxAccess().getTaxableAmountAssignment_5()); 
            // InternalSalesTransaction.g:5435:2: ( rule__Tax__TaxableAmountAssignment_5 )
            // InternalSalesTransaction.g:5435:3: rule__Tax__TaxableAmountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tax__TaxableAmountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaxAccess().getTaxableAmountAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__5__Impl"


    // $ANTLR start "rule__Tax__Group__6"
    // InternalSalesTransaction.g:5443:1: rule__Tax__Group__6 : rule__Tax__Group__6__Impl rule__Tax__Group__7 ;
    public final void rule__Tax__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5447:1: ( rule__Tax__Group__6__Impl rule__Tax__Group__7 )
            // InternalSalesTransaction.g:5448:2: rule__Tax__Group__6__Impl rule__Tax__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Tax__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__6"


    // $ANTLR start "rule__Tax__Group__6__Impl"
    // InternalSalesTransaction.g:5455:1: rule__Tax__Group__6__Impl : ( 'taxAmount' ) ;
    public final void rule__Tax__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5459:1: ( ( 'taxAmount' ) )
            // InternalSalesTransaction.g:5460:1: ( 'taxAmount' )
            {
            // InternalSalesTransaction.g:5460:1: ( 'taxAmount' )
            // InternalSalesTransaction.g:5461:2: 'taxAmount'
            {
             before(grammarAccess.getTaxAccess().getTaxAmountKeyword_6()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getTaxAmountKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__6__Impl"


    // $ANTLR start "rule__Tax__Group__7"
    // InternalSalesTransaction.g:5470:1: rule__Tax__Group__7 : rule__Tax__Group__7__Impl rule__Tax__Group__8 ;
    public final void rule__Tax__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5474:1: ( rule__Tax__Group__7__Impl rule__Tax__Group__8 )
            // InternalSalesTransaction.g:5475:2: rule__Tax__Group__7__Impl rule__Tax__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Tax__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tax__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__7"


    // $ANTLR start "rule__Tax__Group__7__Impl"
    // InternalSalesTransaction.g:5482:1: rule__Tax__Group__7__Impl : ( ( rule__Tax__TaxAmountAssignment_7 ) ) ;
    public final void rule__Tax__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5486:1: ( ( ( rule__Tax__TaxAmountAssignment_7 ) ) )
            // InternalSalesTransaction.g:5487:1: ( ( rule__Tax__TaxAmountAssignment_7 ) )
            {
            // InternalSalesTransaction.g:5487:1: ( ( rule__Tax__TaxAmountAssignment_7 ) )
            // InternalSalesTransaction.g:5488:2: ( rule__Tax__TaxAmountAssignment_7 )
            {
             before(grammarAccess.getTaxAccess().getTaxAmountAssignment_7()); 
            // InternalSalesTransaction.g:5489:2: ( rule__Tax__TaxAmountAssignment_7 )
            // InternalSalesTransaction.g:5489:3: rule__Tax__TaxAmountAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Tax__TaxAmountAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaxAccess().getTaxAmountAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__7__Impl"


    // $ANTLR start "rule__Tax__Group__8"
    // InternalSalesTransaction.g:5497:1: rule__Tax__Group__8 : rule__Tax__Group__8__Impl ;
    public final void rule__Tax__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5501:1: ( rule__Tax__Group__8__Impl )
            // InternalSalesTransaction.g:5502:2: rule__Tax__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tax__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__8"


    // $ANTLR start "rule__Tax__Group__8__Impl"
    // InternalSalesTransaction.g:5508:1: rule__Tax__Group__8__Impl : ( '}' ) ;
    public final void rule__Tax__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5512:1: ( ( '}' ) )
            // InternalSalesTransaction.g:5513:1: ( '}' )
            {
            // InternalSalesTransaction.g:5513:1: ( '}' )
            // InternalSalesTransaction.g:5514:2: '}'
            {
             before(grammarAccess.getTaxAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaxAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__Group__8__Impl"


    // $ANTLR start "rule__Discount__Group__0"
    // InternalSalesTransaction.g:5524:1: rule__Discount__Group__0 : rule__Discount__Group__0__Impl rule__Discount__Group__1 ;
    public final void rule__Discount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5528:1: ( rule__Discount__Group__0__Impl rule__Discount__Group__1 )
            // InternalSalesTransaction.g:5529:2: rule__Discount__Group__0__Impl rule__Discount__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Discount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__0"


    // $ANTLR start "rule__Discount__Group__0__Impl"
    // InternalSalesTransaction.g:5536:1: rule__Discount__Group__0__Impl : ( 'discount' ) ;
    public final void rule__Discount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5540:1: ( ( 'discount' ) )
            // InternalSalesTransaction.g:5541:1: ( 'discount' )
            {
            // InternalSalesTransaction.g:5541:1: ( 'discount' )
            // InternalSalesTransaction.g:5542:2: 'discount'
            {
             before(grammarAccess.getDiscountAccess().getDiscountKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDiscountAccess().getDiscountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__0__Impl"


    // $ANTLR start "rule__Discount__Group__1"
    // InternalSalesTransaction.g:5551:1: rule__Discount__Group__1 : rule__Discount__Group__1__Impl rule__Discount__Group__2 ;
    public final void rule__Discount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5555:1: ( rule__Discount__Group__1__Impl rule__Discount__Group__2 )
            // InternalSalesTransaction.g:5556:2: rule__Discount__Group__1__Impl rule__Discount__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__Discount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__1"


    // $ANTLR start "rule__Discount__Group__1__Impl"
    // InternalSalesTransaction.g:5563:1: rule__Discount__Group__1__Impl : ( '{' ) ;
    public final void rule__Discount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5567:1: ( ( '{' ) )
            // InternalSalesTransaction.g:5568:1: ( '{' )
            {
            // InternalSalesTransaction.g:5568:1: ( '{' )
            // InternalSalesTransaction.g:5569:2: '{'
            {
             before(grammarAccess.getDiscountAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDiscountAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__1__Impl"


    // $ANTLR start "rule__Discount__Group__2"
    // InternalSalesTransaction.g:5578:1: rule__Discount__Group__2 : rule__Discount__Group__2__Impl rule__Discount__Group__3 ;
    public final void rule__Discount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5582:1: ( rule__Discount__Group__2__Impl rule__Discount__Group__3 )
            // InternalSalesTransaction.g:5583:2: rule__Discount__Group__2__Impl rule__Discount__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Discount__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__2"


    // $ANTLR start "rule__Discount__Group__2__Impl"
    // InternalSalesTransaction.g:5590:1: rule__Discount__Group__2__Impl : ( 'percentage' ) ;
    public final void rule__Discount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5594:1: ( ( 'percentage' ) )
            // InternalSalesTransaction.g:5595:1: ( 'percentage' )
            {
            // InternalSalesTransaction.g:5595:1: ( 'percentage' )
            // InternalSalesTransaction.g:5596:2: 'percentage'
            {
             before(grammarAccess.getDiscountAccess().getPercentageKeyword_2()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getDiscountAccess().getPercentageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__2__Impl"


    // $ANTLR start "rule__Discount__Group__3"
    // InternalSalesTransaction.g:5605:1: rule__Discount__Group__3 : rule__Discount__Group__3__Impl rule__Discount__Group__4 ;
    public final void rule__Discount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5609:1: ( rule__Discount__Group__3__Impl rule__Discount__Group__4 )
            // InternalSalesTransaction.g:5610:2: rule__Discount__Group__3__Impl rule__Discount__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__Discount__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__3"


    // $ANTLR start "rule__Discount__Group__3__Impl"
    // InternalSalesTransaction.g:5617:1: rule__Discount__Group__3__Impl : ( ( rule__Discount__PercentageAssignment_3 ) ) ;
    public final void rule__Discount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5621:1: ( ( ( rule__Discount__PercentageAssignment_3 ) ) )
            // InternalSalesTransaction.g:5622:1: ( ( rule__Discount__PercentageAssignment_3 ) )
            {
            // InternalSalesTransaction.g:5622:1: ( ( rule__Discount__PercentageAssignment_3 ) )
            // InternalSalesTransaction.g:5623:2: ( rule__Discount__PercentageAssignment_3 )
            {
             before(grammarAccess.getDiscountAccess().getPercentageAssignment_3()); 
            // InternalSalesTransaction.g:5624:2: ( rule__Discount__PercentageAssignment_3 )
            // InternalSalesTransaction.g:5624:3: rule__Discount__PercentageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Discount__PercentageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiscountAccess().getPercentageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__3__Impl"


    // $ANTLR start "rule__Discount__Group__4"
    // InternalSalesTransaction.g:5632:1: rule__Discount__Group__4 : rule__Discount__Group__4__Impl rule__Discount__Group__5 ;
    public final void rule__Discount__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5636:1: ( rule__Discount__Group__4__Impl rule__Discount__Group__5 )
            // InternalSalesTransaction.g:5637:2: rule__Discount__Group__4__Impl rule__Discount__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Discount__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__4"


    // $ANTLR start "rule__Discount__Group__4__Impl"
    // InternalSalesTransaction.g:5644:1: rule__Discount__Group__4__Impl : ( 'amount' ) ;
    public final void rule__Discount__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5648:1: ( ( 'amount' ) )
            // InternalSalesTransaction.g:5649:1: ( 'amount' )
            {
            // InternalSalesTransaction.g:5649:1: ( 'amount' )
            // InternalSalesTransaction.g:5650:2: 'amount'
            {
             before(grammarAccess.getDiscountAccess().getAmountKeyword_4()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getDiscountAccess().getAmountKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__4__Impl"


    // $ANTLR start "rule__Discount__Group__5"
    // InternalSalesTransaction.g:5659:1: rule__Discount__Group__5 : rule__Discount__Group__5__Impl rule__Discount__Group__6 ;
    public final void rule__Discount__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5663:1: ( rule__Discount__Group__5__Impl rule__Discount__Group__6 )
            // InternalSalesTransaction.g:5664:2: rule__Discount__Group__5__Impl rule__Discount__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Discount__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discount__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__5"


    // $ANTLR start "rule__Discount__Group__5__Impl"
    // InternalSalesTransaction.g:5671:1: rule__Discount__Group__5__Impl : ( ( rule__Discount__AmountAssignment_5 ) ) ;
    public final void rule__Discount__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5675:1: ( ( ( rule__Discount__AmountAssignment_5 ) ) )
            // InternalSalesTransaction.g:5676:1: ( ( rule__Discount__AmountAssignment_5 ) )
            {
            // InternalSalesTransaction.g:5676:1: ( ( rule__Discount__AmountAssignment_5 ) )
            // InternalSalesTransaction.g:5677:2: ( rule__Discount__AmountAssignment_5 )
            {
             before(grammarAccess.getDiscountAccess().getAmountAssignment_5()); 
            // InternalSalesTransaction.g:5678:2: ( rule__Discount__AmountAssignment_5 )
            // InternalSalesTransaction.g:5678:3: rule__Discount__AmountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Discount__AmountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDiscountAccess().getAmountAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__5__Impl"


    // $ANTLR start "rule__Discount__Group__6"
    // InternalSalesTransaction.g:5686:1: rule__Discount__Group__6 : rule__Discount__Group__6__Impl ;
    public final void rule__Discount__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5690:1: ( rule__Discount__Group__6__Impl )
            // InternalSalesTransaction.g:5691:2: rule__Discount__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discount__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__6"


    // $ANTLR start "rule__Discount__Group__6__Impl"
    // InternalSalesTransaction.g:5697:1: rule__Discount__Group__6__Impl : ( '}' ) ;
    public final void rule__Discount__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5701:1: ( ( '}' ) )
            // InternalSalesTransaction.g:5702:1: ( '}' )
            {
            // InternalSalesTransaction.g:5702:1: ( '}' )
            // InternalSalesTransaction.g:5703:2: '}'
            {
             before(grammarAccess.getDiscountAccess().getRightCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDiscountAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__Group__6__Impl"


    // $ANTLR start "rule__AdditionalCharge__Group__0"
    // InternalSalesTransaction.g:5713:1: rule__AdditionalCharge__Group__0 : rule__AdditionalCharge__Group__0__Impl rule__AdditionalCharge__Group__1 ;
    public final void rule__AdditionalCharge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5717:1: ( rule__AdditionalCharge__Group__0__Impl rule__AdditionalCharge__Group__1 )
            // InternalSalesTransaction.g:5718:2: rule__AdditionalCharge__Group__0__Impl rule__AdditionalCharge__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AdditionalCharge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__0"


    // $ANTLR start "rule__AdditionalCharge__Group__0__Impl"
    // InternalSalesTransaction.g:5725:1: rule__AdditionalCharge__Group__0__Impl : ( 'additionalCharge' ) ;
    public final void rule__AdditionalCharge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5729:1: ( ( 'additionalCharge' ) )
            // InternalSalesTransaction.g:5730:1: ( 'additionalCharge' )
            {
            // InternalSalesTransaction.g:5730:1: ( 'additionalCharge' )
            // InternalSalesTransaction.g:5731:2: 'additionalCharge'
            {
             before(grammarAccess.getAdditionalChargeAccess().getAdditionalChargeKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getAdditionalChargeAccess().getAdditionalChargeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__0__Impl"


    // $ANTLR start "rule__AdditionalCharge__Group__1"
    // InternalSalesTransaction.g:5740:1: rule__AdditionalCharge__Group__1 : rule__AdditionalCharge__Group__1__Impl rule__AdditionalCharge__Group__2 ;
    public final void rule__AdditionalCharge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5744:1: ( rule__AdditionalCharge__Group__1__Impl rule__AdditionalCharge__Group__2 )
            // InternalSalesTransaction.g:5745:2: rule__AdditionalCharge__Group__1__Impl rule__AdditionalCharge__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__AdditionalCharge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__1"


    // $ANTLR start "rule__AdditionalCharge__Group__1__Impl"
    // InternalSalesTransaction.g:5752:1: rule__AdditionalCharge__Group__1__Impl : ( '{' ) ;
    public final void rule__AdditionalCharge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5756:1: ( ( '{' ) )
            // InternalSalesTransaction.g:5757:1: ( '{' )
            {
            // InternalSalesTransaction.g:5757:1: ( '{' )
            // InternalSalesTransaction.g:5758:2: '{'
            {
             before(grammarAccess.getAdditionalChargeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAdditionalChargeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__1__Impl"


    // $ANTLR start "rule__AdditionalCharge__Group__2"
    // InternalSalesTransaction.g:5767:1: rule__AdditionalCharge__Group__2 : rule__AdditionalCharge__Group__2__Impl rule__AdditionalCharge__Group__3 ;
    public final void rule__AdditionalCharge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5771:1: ( rule__AdditionalCharge__Group__2__Impl rule__AdditionalCharge__Group__3 )
            // InternalSalesTransaction.g:5772:2: rule__AdditionalCharge__Group__2__Impl rule__AdditionalCharge__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__AdditionalCharge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__2"


    // $ANTLR start "rule__AdditionalCharge__Group__2__Impl"
    // InternalSalesTransaction.g:5779:1: rule__AdditionalCharge__Group__2__Impl : ( 'serviceCharge' ) ;
    public final void rule__AdditionalCharge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5783:1: ( ( 'serviceCharge' ) )
            // InternalSalesTransaction.g:5784:1: ( 'serviceCharge' )
            {
            // InternalSalesTransaction.g:5784:1: ( 'serviceCharge' )
            // InternalSalesTransaction.g:5785:2: 'serviceCharge'
            {
             before(grammarAccess.getAdditionalChargeAccess().getServiceChargeKeyword_2()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getAdditionalChargeAccess().getServiceChargeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__2__Impl"


    // $ANTLR start "rule__AdditionalCharge__Group__3"
    // InternalSalesTransaction.g:5794:1: rule__AdditionalCharge__Group__3 : rule__AdditionalCharge__Group__3__Impl rule__AdditionalCharge__Group__4 ;
    public final void rule__AdditionalCharge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5798:1: ( rule__AdditionalCharge__Group__3__Impl rule__AdditionalCharge__Group__4 )
            // InternalSalesTransaction.g:5799:2: rule__AdditionalCharge__Group__3__Impl rule__AdditionalCharge__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__AdditionalCharge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__3"


    // $ANTLR start "rule__AdditionalCharge__Group__3__Impl"
    // InternalSalesTransaction.g:5806:1: rule__AdditionalCharge__Group__3__Impl : ( ( rule__AdditionalCharge__ServiceChargeAssignment_3 ) ) ;
    public final void rule__AdditionalCharge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5810:1: ( ( ( rule__AdditionalCharge__ServiceChargeAssignment_3 ) ) )
            // InternalSalesTransaction.g:5811:1: ( ( rule__AdditionalCharge__ServiceChargeAssignment_3 ) )
            {
            // InternalSalesTransaction.g:5811:1: ( ( rule__AdditionalCharge__ServiceChargeAssignment_3 ) )
            // InternalSalesTransaction.g:5812:2: ( rule__AdditionalCharge__ServiceChargeAssignment_3 )
            {
             before(grammarAccess.getAdditionalChargeAccess().getServiceChargeAssignment_3()); 
            // InternalSalesTransaction.g:5813:2: ( rule__AdditionalCharge__ServiceChargeAssignment_3 )
            // InternalSalesTransaction.g:5813:3: rule__AdditionalCharge__ServiceChargeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__ServiceChargeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalChargeAccess().getServiceChargeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__3__Impl"


    // $ANTLR start "rule__AdditionalCharge__Group__4"
    // InternalSalesTransaction.g:5821:1: rule__AdditionalCharge__Group__4 : rule__AdditionalCharge__Group__4__Impl ;
    public final void rule__AdditionalCharge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5825:1: ( rule__AdditionalCharge__Group__4__Impl )
            // InternalSalesTransaction.g:5826:2: rule__AdditionalCharge__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalCharge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__4"


    // $ANTLR start "rule__AdditionalCharge__Group__4__Impl"
    // InternalSalesTransaction.g:5832:1: rule__AdditionalCharge__Group__4__Impl : ( '}' ) ;
    public final void rule__AdditionalCharge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5836:1: ( ( '}' ) )
            // InternalSalesTransaction.g:5837:1: ( '}' )
            {
            // InternalSalesTransaction.g:5837:1: ( '}' )
            // InternalSalesTransaction.g:5838:2: '}'
            {
             before(grammarAccess.getAdditionalChargeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAdditionalChargeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__Group__4__Impl"


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalSalesTransaction.g:5848:1: rule__Company__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5852:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:5853:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:5853:2: ( ruleEString )
            // InternalSalesTransaction.g:5854:3: ruleEString
            {
             before(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NameAssignment_1"


    // $ANTLR start "rule__Company__CodiceAssignment_3_1"
    // InternalSalesTransaction.g:5863:1: rule__Company__CodiceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Company__CodiceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5867:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:5868:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:5868:2: ( ruleEString )
            // InternalSalesTransaction.g:5869:3: ruleEString
            {
             before(grammarAccess.getCompanyAccess().getCodiceEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getCodiceEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__CodiceAssignment_3_1"


    // $ANTLR start "rule__Company__AddressAssignment_4"
    // InternalSalesTransaction.g:5878:1: rule__Company__AddressAssignment_4 : ( ruleAddress ) ;
    public final void rule__Company__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5882:1: ( ( ruleAddress ) )
            // InternalSalesTransaction.g:5883:2: ( ruleAddress )
            {
            // InternalSalesTransaction.g:5883:2: ( ruleAddress )
            // InternalSalesTransaction.g:5884:3: ruleAddress
            {
             before(grammarAccess.getCompanyAccess().getAddressAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getAddressAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__AddressAssignment_4"


    // $ANTLR start "rule__Company__StoreAssignment_7"
    // InternalSalesTransaction.g:5893:1: rule__Company__StoreAssignment_7 : ( ruleStore ) ;
    public final void rule__Company__StoreAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5897:1: ( ( ruleStore ) )
            // InternalSalesTransaction.g:5898:2: ( ruleStore )
            {
            // InternalSalesTransaction.g:5898:2: ( ruleStore )
            // InternalSalesTransaction.g:5899:3: ruleStore
            {
             before(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__StoreAssignment_7"


    // $ANTLR start "rule__Company__StoreAssignment_8_1"
    // InternalSalesTransaction.g:5908:1: rule__Company__StoreAssignment_8_1 : ( ruleStore ) ;
    public final void rule__Company__StoreAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5912:1: ( ( ruleStore ) )
            // InternalSalesTransaction.g:5913:2: ( ruleStore )
            {
            // InternalSalesTransaction.g:5913:2: ( ruleStore )
            // InternalSalesTransaction.g:5914:3: ruleStore
            {
             before(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getStoreStoreParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__StoreAssignment_8_1"


    // $ANTLR start "rule__Company__TransactionAssignment_10_2"
    // InternalSalesTransaction.g:5923:1: rule__Company__TransactionAssignment_10_2 : ( ruleTransaction ) ;
    public final void rule__Company__TransactionAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5927:1: ( ( ruleTransaction ) )
            // InternalSalesTransaction.g:5928:2: ( ruleTransaction )
            {
            // InternalSalesTransaction.g:5928:2: ( ruleTransaction )
            // InternalSalesTransaction.g:5929:3: ruleTransaction
            {
             before(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__TransactionAssignment_10_2"


    // $ANTLR start "rule__Company__TransactionAssignment_10_3_1"
    // InternalSalesTransaction.g:5938:1: rule__Company__TransactionAssignment_10_3_1 : ( ruleTransaction ) ;
    public final void rule__Company__TransactionAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5942:1: ( ( ruleTransaction ) )
            // InternalSalesTransaction.g:5943:2: ( ruleTransaction )
            {
            // InternalSalesTransaction.g:5943:2: ( ruleTransaction )
            // InternalSalesTransaction.g:5944:3: ruleTransaction
            {
             before(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getTransactionTransactionParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__TransactionAssignment_10_3_1"


    // $ANTLR start "rule__Address__StreetAssignment_3_1"
    // InternalSalesTransaction.g:5953:1: rule__Address__StreetAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Address__StreetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5957:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:5958:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:5958:2: ( ruleEString )
            // InternalSalesTransaction.g:5959:3: ruleEString
            {
             before(grammarAccess.getAddressAccess().getStreetEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressAccess().getStreetEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__StreetAssignment_3_1"


    // $ANTLR start "rule__Address__CityAssignment_4_1"
    // InternalSalesTransaction.g:5968:1: rule__Address__CityAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Address__CityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5972:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:5973:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:5973:2: ( ruleEString )
            // InternalSalesTransaction.g:5974:3: ruleEString
            {
             before(grammarAccess.getAddressAccess().getCityEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressAccess().getCityEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__CityAssignment_4_1"


    // $ANTLR start "rule__Address__CountryAssignment_5_1"
    // InternalSalesTransaction.g:5983:1: rule__Address__CountryAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Address__CountryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:5987:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:5988:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:5988:2: ( ruleEString )
            // InternalSalesTransaction.g:5989:3: ruleEString
            {
             before(grammarAccess.getAddressAccess().getCountryEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressAccess().getCountryEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__CountryAssignment_5_1"


    // $ANTLR start "rule__Address__TelephoneAssignment_6_1"
    // InternalSalesTransaction.g:5998:1: rule__Address__TelephoneAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Address__TelephoneAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6002:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6003:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6003:2: ( ruleEString )
            // InternalSalesTransaction.g:6004:3: ruleEString
            {
             before(grammarAccess.getAddressAccess().getTelephoneEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddressAccess().getTelephoneEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__TelephoneAssignment_6_1"


    // $ANTLR start "rule__Store__NameAssignment_2"
    // InternalSalesTransaction.g:6013:1: rule__Store__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Store__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6017:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6018:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6018:2: ( ruleEString )
            // InternalSalesTransaction.g:6019:3: ruleEString
            {
             before(grammarAccess.getStoreAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__NameAssignment_2"


    // $ANTLR start "rule__Store__ItemAssignment_4_2"
    // InternalSalesTransaction.g:6028:1: rule__Store__ItemAssignment_4_2 : ( ruleItem ) ;
    public final void rule__Store__ItemAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6032:1: ( ( ruleItem ) )
            // InternalSalesTransaction.g:6033:2: ( ruleItem )
            {
            // InternalSalesTransaction.g:6033:2: ( ruleItem )
            // InternalSalesTransaction.g:6034:3: ruleItem
            {
             before(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ItemAssignment_4_2"


    // $ANTLR start "rule__Store__ItemAssignment_4_3_1"
    // InternalSalesTransaction.g:6043:1: rule__Store__ItemAssignment_4_3_1 : ( ruleItem ) ;
    public final void rule__Store__ItemAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6047:1: ( ( ruleItem ) )
            // InternalSalesTransaction.g:6048:2: ( ruleItem )
            {
            // InternalSalesTransaction.g:6048:2: ( ruleItem )
            // InternalSalesTransaction.g:6049:3: ruleItem
            {
             before(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getItemItemParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ItemAssignment_4_3_1"


    // $ANTLR start "rule__Transaction__TransactionNumberAssignment_2_1"
    // InternalSalesTransaction.g:6058:1: rule__Transaction__TransactionNumberAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Transaction__TransactionNumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6062:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6063:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6063:2: ( ruleEString )
            // InternalSalesTransaction.g:6064:3: ruleEString
            {
             before(grammarAccess.getTransactionAccess().getTransactionNumberEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getTransactionNumberEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__TransactionNumberAssignment_2_1"


    // $ANTLR start "rule__Transaction__IssuedDateAssignment_3_1"
    // InternalSalesTransaction.g:6073:1: rule__Transaction__IssuedDateAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__Transaction__IssuedDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6077:1: ( ( ruleEDate ) )
            // InternalSalesTransaction.g:6078:2: ( ruleEDate )
            {
            // InternalSalesTransaction.g:6078:2: ( ruleEDate )
            // InternalSalesTransaction.g:6079:3: ruleEDate
            {
             before(grammarAccess.getTransactionAccess().getIssuedDateEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getIssuedDateEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__IssuedDateAssignment_3_1"


    // $ANTLR start "rule__Transaction__TransactionTypeAssignment_5"
    // InternalSalesTransaction.g:6088:1: rule__Transaction__TransactionTypeAssignment_5 : ( ruleTransactionType ) ;
    public final void rule__Transaction__TransactionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6092:1: ( ( ruleTransactionType ) )
            // InternalSalesTransaction.g:6093:2: ( ruleTransactionType )
            {
            // InternalSalesTransaction.g:6093:2: ( ruleTransactionType )
            // InternalSalesTransaction.g:6094:3: ruleTransactionType
            {
             before(grammarAccess.getTransactionAccess().getTransactionTypeTransactionTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTransactionType();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getTransactionTypeTransactionTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__TransactionTypeAssignment_5"


    // $ANTLR start "rule__Transaction__PaymentMethodAssignment_7"
    // InternalSalesTransaction.g:6103:1: rule__Transaction__PaymentMethodAssignment_7 : ( rulePaymentMethod ) ;
    public final void rule__Transaction__PaymentMethodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6107:1: ( ( rulePaymentMethod ) )
            // InternalSalesTransaction.g:6108:2: ( rulePaymentMethod )
            {
            // InternalSalesTransaction.g:6108:2: ( rulePaymentMethod )
            // InternalSalesTransaction.g:6109:3: rulePaymentMethod
            {
             before(grammarAccess.getTransactionAccess().getPaymentMethodPaymentMethodEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePaymentMethod();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getPaymentMethodPaymentMethodEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__PaymentMethodAssignment_7"


    // $ANTLR start "rule__Transaction__CustomerAssignment_8"
    // InternalSalesTransaction.g:6118:1: rule__Transaction__CustomerAssignment_8 : ( ruleCustomer ) ;
    public final void rule__Transaction__CustomerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6122:1: ( ( ruleCustomer ) )
            // InternalSalesTransaction.g:6123:2: ( ruleCustomer )
            {
            // InternalSalesTransaction.g:6123:2: ( ruleCustomer )
            // InternalSalesTransaction.g:6124:3: ruleCustomer
            {
             before(grammarAccess.getTransactionAccess().getCustomerCustomerParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getCustomerCustomerParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__CustomerAssignment_8"


    // $ANTLR start "rule__Transaction__CashierAssignment_9"
    // InternalSalesTransaction.g:6133:1: rule__Transaction__CashierAssignment_9 : ( ruleCashier ) ;
    public final void rule__Transaction__CashierAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6137:1: ( ( ruleCashier ) )
            // InternalSalesTransaction.g:6138:2: ( ruleCashier )
            {
            // InternalSalesTransaction.g:6138:2: ( ruleCashier )
            // InternalSalesTransaction.g:6139:3: ruleCashier
            {
             before(grammarAccess.getTransactionAccess().getCashierCashierParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCashier();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getCashierCashierParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__CashierAssignment_9"


    // $ANTLR start "rule__Transaction__LineItemAssignment_12"
    // InternalSalesTransaction.g:6148:1: rule__Transaction__LineItemAssignment_12 : ( ruleLineItem ) ;
    public final void rule__Transaction__LineItemAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6152:1: ( ( ruleLineItem ) )
            // InternalSalesTransaction.g:6153:2: ( ruleLineItem )
            {
            // InternalSalesTransaction.g:6153:2: ( ruleLineItem )
            // InternalSalesTransaction.g:6154:3: ruleLineItem
            {
             before(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleLineItem();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__LineItemAssignment_12"


    // $ANTLR start "rule__Transaction__LineItemAssignment_13_1"
    // InternalSalesTransaction.g:6163:1: rule__Transaction__LineItemAssignment_13_1 : ( ruleLineItem ) ;
    public final void rule__Transaction__LineItemAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6167:1: ( ( ruleLineItem ) )
            // InternalSalesTransaction.g:6168:2: ( ruleLineItem )
            {
            // InternalSalesTransaction.g:6168:2: ( ruleLineItem )
            // InternalSalesTransaction.g:6169:3: ruleLineItem
            {
             before(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLineItem();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getLineItemLineItemParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__LineItemAssignment_13_1"


    // $ANTLR start "rule__Transaction__CardAssignment_15"
    // InternalSalesTransaction.g:6178:1: rule__Transaction__CardAssignment_15 : ( ruleCard ) ;
    public final void rule__Transaction__CardAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6182:1: ( ( ruleCard ) )
            // InternalSalesTransaction.g:6183:2: ( ruleCard )
            {
            // InternalSalesTransaction.g:6183:2: ( ruleCard )
            // InternalSalesTransaction.g:6184:3: ruleCard
            {
             before(grammarAccess.getTransactionAccess().getCardCardParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getCardCardParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__CardAssignment_15"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalSalesTransaction.g:6193:1: rule__Item__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6197:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6198:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6198:2: ( ruleEString )
            // InternalSalesTransaction.g:6199:3: ruleEString
            {
             before(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__CodeAssignment_3_1"
    // InternalSalesTransaction.g:6208:1: rule__Item__CodeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Item__CodeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6212:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6213:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6213:2: ( ruleEString )
            // InternalSalesTransaction.g:6214:3: ruleEString
            {
             before(grammarAccess.getItemAccess().getCodeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getCodeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__CodeAssignment_3_1"


    // $ANTLR start "rule__Item__BatchAssignment_4_1"
    // InternalSalesTransaction.g:6223:1: rule__Item__BatchAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Item__BatchAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6227:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6228:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6228:2: ( ruleEString )
            // InternalSalesTransaction.g:6229:3: ruleEString
            {
             before(grammarAccess.getItemAccess().getBatchEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getBatchEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__BatchAssignment_4_1"


    // $ANTLR start "rule__Item__DescriptionAssignment_5_1"
    // InternalSalesTransaction.g:6238:1: rule__Item__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Item__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6242:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6243:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6243:2: ( ruleEString )
            // InternalSalesTransaction.g:6244:3: ruleEString
            {
             before(grammarAccess.getItemAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Item__UomAssignment_7"
    // InternalSalesTransaction.g:6253:1: rule__Item__UomAssignment_7 : ( ruleUoM ) ;
    public final void rule__Item__UomAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6257:1: ( ( ruleUoM ) )
            // InternalSalesTransaction.g:6258:2: ( ruleUoM )
            {
            // InternalSalesTransaction.g:6258:2: ( ruleUoM )
            // InternalSalesTransaction.g:6259:3: ruleUoM
            {
             before(grammarAccess.getItemAccess().getUomUoMEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUoM();

            state._fsp--;

             after(grammarAccess.getItemAccess().getUomUoMEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UomAssignment_7"


    // $ANTLR start "rule__Item__AvailableNumberAssignment_9"
    // InternalSalesTransaction.g:6268:1: rule__Item__AvailableNumberAssignment_9 : ( ruleEDouble ) ;
    public final void rule__Item__AvailableNumberAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6272:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6273:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6273:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6274:3: ruleEDouble
            {
             before(grammarAccess.getItemAccess().getAvailableNumberEDoubleParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getItemAccess().getAvailableNumberEDoubleParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__AvailableNumberAssignment_9"


    // $ANTLR start "rule__Item__IsActiveAssignment_11"
    // InternalSalesTransaction.g:6283:1: rule__Item__IsActiveAssignment_11 : ( ruleEBoolean ) ;
    public final void rule__Item__IsActiveAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6287:1: ( ( ruleEBoolean ) )
            // InternalSalesTransaction.g:6288:2: ( ruleEBoolean )
            {
            // InternalSalesTransaction.g:6288:2: ( ruleEBoolean )
            // InternalSalesTransaction.g:6289:3: ruleEBoolean
            {
             before(grammarAccess.getItemAccess().getIsActiveEBooleanParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getItemAccess().getIsActiveEBooleanParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__IsActiveAssignment_11"


    // $ANTLR start "rule__Item__UnitPriceAssignment_13"
    // InternalSalesTransaction.g:6298:1: rule__Item__UnitPriceAssignment_13 : ( rulePrice ) ;
    public final void rule__Item__UnitPriceAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6302:1: ( ( rulePrice ) )
            // InternalSalesTransaction.g:6303:2: ( rulePrice )
            {
            // InternalSalesTransaction.g:6303:2: ( rulePrice )
            // InternalSalesTransaction.g:6304:3: rulePrice
            {
             before(grammarAccess.getItemAccess().getUnitPricePriceParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            rulePrice();

            state._fsp--;

             after(grammarAccess.getItemAccess().getUnitPricePriceParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__UnitPriceAssignment_13"


    // $ANTLR start "rule__Price__SellingPriceAssignment_3"
    // InternalSalesTransaction.g:6313:1: rule__Price__SellingPriceAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Price__SellingPriceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6317:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6318:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6318:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6319:3: ruleEDouble
            {
             before(grammarAccess.getPriceAccess().getSellingPriceEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPriceAccess().getSellingPriceEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Price__SellingPriceAssignment_3"


    // $ANTLR start "rule__Customer__NameAssignment_2"
    // InternalSalesTransaction.g:6328:1: rule__Customer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Customer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6332:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6333:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6333:2: ( ruleEString )
            // InternalSalesTransaction.g:6334:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_2"


    // $ANTLR start "rule__Customer__SurNameAssignment_4_1"
    // InternalSalesTransaction.g:6343:1: rule__Customer__SurNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Customer__SurNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6347:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6348:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6348:2: ( ruleEString )
            // InternalSalesTransaction.g:6349:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getSurNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getSurNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__SurNameAssignment_4_1"


    // $ANTLR start "rule__Customer__IdentityNumberAssignment_5_1"
    // InternalSalesTransaction.g:6358:1: rule__Customer__IdentityNumberAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Customer__IdentityNumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6362:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6363:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6363:2: ( ruleEString )
            // InternalSalesTransaction.g:6364:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getIdentityNumberEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getIdentityNumberEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__IdentityNumberAssignment_5_1"


    // $ANTLR start "rule__Customer__PhoneNumberAssignment_6_1"
    // InternalSalesTransaction.g:6373:1: rule__Customer__PhoneNumberAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Customer__PhoneNumberAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6377:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6378:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6378:2: ( ruleEString )
            // InternalSalesTransaction.g:6379:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getPhoneNumberEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getPhoneNumberEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__PhoneNumberAssignment_6_1"


    // $ANTLR start "rule__Customer__CardAssignment_7"
    // InternalSalesTransaction.g:6388:1: rule__Customer__CardAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Customer__CardAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6392:1: ( ( ( ruleEString ) ) )
            // InternalSalesTransaction.g:6393:2: ( ( ruleEString ) )
            {
            // InternalSalesTransaction.g:6393:2: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6394:3: ( ruleEString )
            {
             before(grammarAccess.getCustomerAccess().getCardCardCrossReference_7_0()); 
            // InternalSalesTransaction.g:6395:3: ( ruleEString )
            // InternalSalesTransaction.g:6396:4: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getCardCardEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getCardCardEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getCardCardCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__CardAssignment_7"


    // $ANTLR start "rule__Customer__CustomerAssignment_8"
    // InternalSalesTransaction.g:6407:1: rule__Customer__CustomerAssignment_8 : ( ruleCustomer ) ;
    public final void rule__Customer__CustomerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6411:1: ( ( ruleCustomer ) )
            // InternalSalesTransaction.g:6412:2: ( ruleCustomer )
            {
            // InternalSalesTransaction.g:6412:2: ( ruleCustomer )
            // InternalSalesTransaction.g:6413:3: ruleCustomer
            {
             before(grammarAccess.getCustomerAccess().getCustomerCustomerParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getCustomerCustomerParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__CustomerAssignment_8"


    // $ANTLR start "rule__Customer__CashierAssignment_9"
    // InternalSalesTransaction.g:6422:1: rule__Customer__CashierAssignment_9 : ( ruleCashier ) ;
    public final void rule__Customer__CashierAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6426:1: ( ( ruleCashier ) )
            // InternalSalesTransaction.g:6427:2: ( ruleCashier )
            {
            // InternalSalesTransaction.g:6427:2: ( ruleCashier )
            // InternalSalesTransaction.g:6428:3: ruleCashier
            {
             before(grammarAccess.getCustomerAccess().getCashierCashierParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCashier();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getCashierCashierParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__CashierAssignment_9"


    // $ANTLR start "rule__Cashier__NameAssignment_2"
    // InternalSalesTransaction.g:6437:1: rule__Cashier__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Cashier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6441:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6442:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6442:2: ( ruleEString )
            // InternalSalesTransaction.g:6443:3: ruleEString
            {
             before(grammarAccess.getCashierAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCashierAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__NameAssignment_2"


    // $ANTLR start "rule__Cashier__SurNameAssignment_4_1"
    // InternalSalesTransaction.g:6452:1: rule__Cashier__SurNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Cashier__SurNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6456:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6457:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6457:2: ( ruleEString )
            // InternalSalesTransaction.g:6458:3: ruleEString
            {
             before(grammarAccess.getCashierAccess().getSurNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCashierAccess().getSurNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__SurNameAssignment_4_1"


    // $ANTLR start "rule__Cashier__EmployeeIdAssignment_5_1"
    // InternalSalesTransaction.g:6467:1: rule__Cashier__EmployeeIdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Cashier__EmployeeIdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6471:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6472:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6472:2: ( ruleEString )
            // InternalSalesTransaction.g:6473:3: ruleEString
            {
             before(grammarAccess.getCashierAccess().getEmployeeIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCashierAccess().getEmployeeIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__EmployeeIdAssignment_5_1"


    // $ANTLR start "rule__Cashier__CustomerAssignment_6"
    // InternalSalesTransaction.g:6482:1: rule__Cashier__CustomerAssignment_6 : ( ruleCustomer ) ;
    public final void rule__Cashier__CustomerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6486:1: ( ( ruleCustomer ) )
            // InternalSalesTransaction.g:6487:2: ( ruleCustomer )
            {
            // InternalSalesTransaction.g:6487:2: ( ruleCustomer )
            // InternalSalesTransaction.g:6488:3: ruleCustomer
            {
             before(grammarAccess.getCashierAccess().getCustomerCustomerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCashierAccess().getCustomerCustomerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__CustomerAssignment_6"


    // $ANTLR start "rule__Cashier__CashierAssignment_7"
    // InternalSalesTransaction.g:6497:1: rule__Cashier__CashierAssignment_7 : ( ruleCashier ) ;
    public final void rule__Cashier__CashierAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6501:1: ( ( ruleCashier ) )
            // InternalSalesTransaction.g:6502:2: ( ruleCashier )
            {
            // InternalSalesTransaction.g:6502:2: ( ruleCashier )
            // InternalSalesTransaction.g:6503:3: ruleCashier
            {
             before(grammarAccess.getCashierAccess().getCashierCashierParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCashier();

            state._fsp--;

             after(grammarAccess.getCashierAccess().getCashierCashierParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cashier__CashierAssignment_7"


    // $ANTLR start "rule__LineItem__CodeAssignment_2_1"
    // InternalSalesTransaction.g:6512:1: rule__LineItem__CodeAssignment_2_1 : ( ruleEString ) ;
    public final void rule__LineItem__CodeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6516:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6517:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6517:2: ( ruleEString )
            // InternalSalesTransaction.g:6518:3: ruleEString
            {
             before(grammarAccess.getLineItemAccess().getCodeEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getCodeEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__CodeAssignment_2_1"


    // $ANTLR start "rule__LineItem__QuantityAssignment_4"
    // InternalSalesTransaction.g:6527:1: rule__LineItem__QuantityAssignment_4 : ( ruleEDouble ) ;
    public final void rule__LineItem__QuantityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6531:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6532:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6532:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6533:3: ruleEDouble
            {
             before(grammarAccess.getLineItemAccess().getQuantityEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getQuantityEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__QuantityAssignment_4"


    // $ANTLR start "rule__LineItem__ItemAssignment_6"
    // InternalSalesTransaction.g:6542:1: rule__LineItem__ItemAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__LineItem__ItemAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6546:1: ( ( ( ruleEString ) ) )
            // InternalSalesTransaction.g:6547:2: ( ( ruleEString ) )
            {
            // InternalSalesTransaction.g:6547:2: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6548:3: ( ruleEString )
            {
             before(grammarAccess.getLineItemAccess().getItemItemCrossReference_6_0()); 
            // InternalSalesTransaction.g:6549:3: ( ruleEString )
            // InternalSalesTransaction.g:6550:4: ruleEString
            {
             before(grammarAccess.getLineItemAccess().getItemItemEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getItemItemEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getLineItemAccess().getItemItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__ItemAssignment_6"


    // $ANTLR start "rule__LineItem__TaxAssignment_7_1"
    // InternalSalesTransaction.g:6561:1: rule__LineItem__TaxAssignment_7_1 : ( ruleTax ) ;
    public final void rule__LineItem__TaxAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6565:1: ( ( ruleTax ) )
            // InternalSalesTransaction.g:6566:2: ( ruleTax )
            {
            // InternalSalesTransaction.g:6566:2: ( ruleTax )
            // InternalSalesTransaction.g:6567:3: ruleTax
            {
             before(grammarAccess.getLineItemAccess().getTaxTaxParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTax();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getTaxTaxParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__TaxAssignment_7_1"


    // $ANTLR start "rule__LineItem__DiscountAssignment_8_1"
    // InternalSalesTransaction.g:6576:1: rule__LineItem__DiscountAssignment_8_1 : ( ruleDiscount ) ;
    public final void rule__LineItem__DiscountAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6580:1: ( ( ruleDiscount ) )
            // InternalSalesTransaction.g:6581:2: ( ruleDiscount )
            {
            // InternalSalesTransaction.g:6581:2: ( ruleDiscount )
            // InternalSalesTransaction.g:6582:3: ruleDiscount
            {
             before(grammarAccess.getLineItemAccess().getDiscountDiscountParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiscount();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getDiscountDiscountParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__DiscountAssignment_8_1"


    // $ANTLR start "rule__LineItem__AdditionalChargeAssignment_9_1"
    // InternalSalesTransaction.g:6591:1: rule__LineItem__AdditionalChargeAssignment_9_1 : ( ruleAdditionalCharge ) ;
    public final void rule__LineItem__AdditionalChargeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6595:1: ( ( ruleAdditionalCharge ) )
            // InternalSalesTransaction.g:6596:2: ( ruleAdditionalCharge )
            {
            // InternalSalesTransaction.g:6596:2: ( ruleAdditionalCharge )
            // InternalSalesTransaction.g:6597:3: ruleAdditionalCharge
            {
             before(grammarAccess.getLineItemAccess().getAdditionalChargeAdditionalChargeParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalCharge();

            state._fsp--;

             after(grammarAccess.getLineItemAccess().getAdditionalChargeAdditionalChargeParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineItem__AdditionalChargeAssignment_9_1"


    // $ANTLR start "rule__Card__CardNumberAssignment_2_1"
    // InternalSalesTransaction.g:6606:1: rule__Card__CardNumberAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Card__CardNumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6610:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6611:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6611:2: ( ruleEString )
            // InternalSalesTransaction.g:6612:3: ruleEString
            {
             before(grammarAccess.getCardAccess().getCardNumberEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardAccess().getCardNumberEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__CardNumberAssignment_2_1"


    // $ANTLR start "rule__Card__ExpiryDateAssignment_3_1"
    // InternalSalesTransaction.g:6621:1: rule__Card__ExpiryDateAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Card__ExpiryDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6625:1: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6626:2: ( ruleEString )
            {
            // InternalSalesTransaction.g:6626:2: ( ruleEString )
            // InternalSalesTransaction.g:6627:3: ruleEString
            {
             before(grammarAccess.getCardAccess().getExpiryDateEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardAccess().getExpiryDateEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__ExpiryDateAssignment_3_1"


    // $ANTLR start "rule__Card__CardHolderAssignment_5"
    // InternalSalesTransaction.g:6636:1: rule__Card__CardHolderAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Card__CardHolderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6640:1: ( ( ( ruleEString ) ) )
            // InternalSalesTransaction.g:6641:2: ( ( ruleEString ) )
            {
            // InternalSalesTransaction.g:6641:2: ( ( ruleEString ) )
            // InternalSalesTransaction.g:6642:3: ( ruleEString )
            {
             before(grammarAccess.getCardAccess().getCardHolderCustomerCrossReference_5_0()); 
            // InternalSalesTransaction.g:6643:3: ( ruleEString )
            // InternalSalesTransaction.g:6644:4: ruleEString
            {
             before(grammarAccess.getCardAccess().getCardHolderCustomerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardAccess().getCardHolderCustomerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCardAccess().getCardHolderCustomerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__CardHolderAssignment_5"


    // $ANTLR start "rule__Tax__TaxTypeAssignment_3"
    // InternalSalesTransaction.g:6655:1: rule__Tax__TaxTypeAssignment_3 : ( ruleTaxType ) ;
    public final void rule__Tax__TaxTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6659:1: ( ( ruleTaxType ) )
            // InternalSalesTransaction.g:6660:2: ( ruleTaxType )
            {
            // InternalSalesTransaction.g:6660:2: ( ruleTaxType )
            // InternalSalesTransaction.g:6661:3: ruleTaxType
            {
             before(grammarAccess.getTaxAccess().getTaxTypeTaxTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTaxType();

            state._fsp--;

             after(grammarAccess.getTaxAccess().getTaxTypeTaxTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__TaxTypeAssignment_3"


    // $ANTLR start "rule__Tax__TaxableAmountAssignment_5"
    // InternalSalesTransaction.g:6670:1: rule__Tax__TaxableAmountAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Tax__TaxableAmountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6674:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6675:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6675:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6676:3: ruleEDouble
            {
             before(grammarAccess.getTaxAccess().getTaxableAmountEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTaxAccess().getTaxableAmountEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__TaxableAmountAssignment_5"


    // $ANTLR start "rule__Tax__TaxAmountAssignment_7"
    // InternalSalesTransaction.g:6685:1: rule__Tax__TaxAmountAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Tax__TaxAmountAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6689:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6690:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6690:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6691:3: ruleEDouble
            {
             before(grammarAccess.getTaxAccess().getTaxAmountEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTaxAccess().getTaxAmountEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tax__TaxAmountAssignment_7"


    // $ANTLR start "rule__Discount__PercentageAssignment_3"
    // InternalSalesTransaction.g:6700:1: rule__Discount__PercentageAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Discount__PercentageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6704:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6705:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6705:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6706:3: ruleEDouble
            {
             before(grammarAccess.getDiscountAccess().getPercentageEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDiscountAccess().getPercentageEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__PercentageAssignment_3"


    // $ANTLR start "rule__Discount__AmountAssignment_5"
    // InternalSalesTransaction.g:6715:1: rule__Discount__AmountAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Discount__AmountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6719:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6720:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6720:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6721:3: ruleEDouble
            {
             before(grammarAccess.getDiscountAccess().getAmountEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDiscountAccess().getAmountEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discount__AmountAssignment_5"


    // $ANTLR start "rule__AdditionalCharge__ServiceChargeAssignment_3"
    // InternalSalesTransaction.g:6730:1: rule__AdditionalCharge__ServiceChargeAssignment_3 : ( ruleEDouble ) ;
    public final void rule__AdditionalCharge__ServiceChargeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalesTransaction.g:6734:1: ( ( ruleEDouble ) )
            // InternalSalesTransaction.g:6735:2: ( ruleEDouble )
            {
            // InternalSalesTransaction.g:6735:2: ( ruleEDouble )
            // InternalSalesTransaction.g:6736:3: ruleEDouble
            {
             before(grammarAccess.getAdditionalChargeAccess().getServiceChargeEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAdditionalChargeAccess().getServiceChargeEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalCharge__ServiceChargeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001280000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001E100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000400000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01C4000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0600000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xE000000100000030L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x6000000100000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}