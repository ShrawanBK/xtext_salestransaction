package xtext.sales.assignment3.transaction.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalesTransactionLexer extends Lexer {
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

    public InternalSalesTransactionLexer() {;} 
    public InternalSalesTransactionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSalesTransactionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSalesTransaction.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:11:7: ( 'company' )
            // InternalSalesTransaction.g:11:9: 'company'
            {
            match("company"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:12:7: ( '{' )
            // InternalSalesTransaction.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:13:7: ( 'codice' )
            // InternalSalesTransaction.g:13:9: 'codice'
            {
            match("codice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:14:7: ( 'stores' )
            // InternalSalesTransaction.g:14:9: 'stores'
            {
            match("stores"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:15:7: ( ',' )
            // InternalSalesTransaction.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:16:7: ( '}' )
            // InternalSalesTransaction.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:17:7: ( 'transactions' )
            // InternalSalesTransaction.g:17:9: 'transactions'
            {
            match("transactions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:18:7: ( 'address' )
            // InternalSalesTransaction.g:18:9: 'address'
            {
            match("address"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:19:7: ( 'street' )
            // InternalSalesTransaction.g:19:9: 'street'
            {
            match("street"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:20:7: ( 'city' )
            // InternalSalesTransaction.g:20:9: 'city'
            {
            match("city"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:21:7: ( 'country' )
            // InternalSalesTransaction.g:21:9: 'country'
            {
            match("country"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:22:7: ( 'telephone' )
            // InternalSalesTransaction.g:22:9: 'telephone'
            {
            match("telephone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:23:7: ( 'store' )
            // InternalSalesTransaction.g:23:9: 'store'
            {
            match("store"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:24:7: ( 'items' )
            // InternalSalesTransaction.g:24:9: 'items'
            {
            match("items"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:25:7: ( 'transaction' )
            // InternalSalesTransaction.g:25:9: 'transaction'
            {
            match("transaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:26:7: ( 'transactionNumber' )
            // InternalSalesTransaction.g:26:9: 'transactionNumber'
            {
            match("transactionNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:27:7: ( 'issuedDate' )
            // InternalSalesTransaction.g:27:9: 'issuedDate'
            {
            match("issuedDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:28:7: ( 'transactionType' )
            // InternalSalesTransaction.g:28:9: 'transactionType'
            {
            match("transactionType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:29:7: ( 'paymentMethod' )
            // InternalSalesTransaction.g:29:9: 'paymentMethod'
            {
            match("paymentMethod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:30:7: ( 'lineItems' )
            // InternalSalesTransaction.g:30:9: 'lineItems'
            {
            match("lineItems"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:31:7: ( 'item' )
            // InternalSalesTransaction.g:31:9: 'item'
            {
            match("item"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:32:7: ( 'code' )
            // InternalSalesTransaction.g:32:9: 'code'
            {
            match("code"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:33:7: ( 'batch' )
            // InternalSalesTransaction.g:33:9: 'batch'
            {
            match("batch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:34:7: ( 'description' )
            // InternalSalesTransaction.g:34:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:35:7: ( 'uom' )
            // InternalSalesTransaction.g:35:9: 'uom'
            {
            match("uom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:36:7: ( 'availableNumber' )
            // InternalSalesTransaction.g:36:9: 'availableNumber'
            {
            match("availableNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:37:7: ( 'isActive' )
            // InternalSalesTransaction.g:37:9: 'isActive'
            {
            match("isActive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:38:7: ( 'unitPrice' )
            // InternalSalesTransaction.g:38:9: 'unitPrice'
            {
            match("unitPrice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:39:7: ( '-' )
            // InternalSalesTransaction.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:40:7: ( '.' )
            // InternalSalesTransaction.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:41:7: ( 'E' )
            // InternalSalesTransaction.g:41:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:42:7: ( 'e' )
            // InternalSalesTransaction.g:42:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:43:7: ( 'price' )
            // InternalSalesTransaction.g:43:9: 'price'
            {
            match("price"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:44:7: ( 'sellingPrice' )
            // InternalSalesTransaction.g:44:9: 'sellingPrice'
            {
            match("sellingPrice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:45:7: ( 'true' )
            // InternalSalesTransaction.g:45:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:46:7: ( 'false' )
            // InternalSalesTransaction.g:46:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:47:7: ( 'EDate' )
            // InternalSalesTransaction.g:47:9: 'EDate'
            {
            match("EDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:48:7: ( 'customer' )
            // InternalSalesTransaction.g:48:9: 'customer'
            {
            match("customer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:49:7: ( 'surName' )
            // InternalSalesTransaction.g:49:9: 'surName'
            {
            match("surName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:50:7: ( 'identityNumber' )
            // InternalSalesTransaction.g:50:9: 'identityNumber'
            {
            match("identityNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:51:7: ( 'phoneNumber' )
            // InternalSalesTransaction.g:51:9: 'phoneNumber'
            {
            match("phoneNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:52:7: ( 'cashier' )
            // InternalSalesTransaction.g:52:9: 'cashier'
            {
            match("cashier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:53:7: ( 'employeeId' )
            // InternalSalesTransaction.g:53:9: 'employeeId'
            {
            match("employeeId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:54:7: ( 'lineItem' )
            // InternalSalesTransaction.g:54:9: 'lineItem'
            {
            match("lineItem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:55:7: ( 'quantity' )
            // InternalSalesTransaction.g:55:9: 'quantity'
            {
            match("quantity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:56:7: ( 'tax' )
            // InternalSalesTransaction.g:56:9: 'tax'
            {
            match("tax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:57:7: ( 'discount' )
            // InternalSalesTransaction.g:57:9: 'discount'
            {
            match("discount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:58:7: ( 'additionalCharge' )
            // InternalSalesTransaction.g:58:9: 'additionalCharge'
            {
            match("additionalCharge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:59:7: ( 'card' )
            // InternalSalesTransaction.g:59:9: 'card'
            {
            match("card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:60:7: ( 'cardNumber' )
            // InternalSalesTransaction.g:60:9: 'cardNumber'
            {
            match("cardNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:61:7: ( 'expiryDate' )
            // InternalSalesTransaction.g:61:9: 'expiryDate'
            {
            match("expiryDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:62:7: ( 'cardHolder' )
            // InternalSalesTransaction.g:62:9: 'cardHolder'
            {
            match("cardHolder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:63:7: ( 'taxType' )
            // InternalSalesTransaction.g:63:9: 'taxType'
            {
            match("taxType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:64:7: ( 'taxableAmount' )
            // InternalSalesTransaction.g:64:9: 'taxableAmount'
            {
            match("taxableAmount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:65:7: ( 'taxAmount' )
            // InternalSalesTransaction.g:65:9: 'taxAmount'
            {
            match("taxAmount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:66:7: ( 'percentage' )
            // InternalSalesTransaction.g:66:9: 'percentage'
            {
            match("percentage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:67:7: ( 'amount' )
            // InternalSalesTransaction.g:67:9: 'amount'
            {
            match("amount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:68:7: ( 'serviceCharge' )
            // InternalSalesTransaction.g:68:9: 'serviceCharge'
            {
            match("serviceCharge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:69:7: ( 'PCS' )
            // InternalSalesTransaction.g:69:9: 'PCS'
            {
            match("PCS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:70:7: ( 'KG' )
            // InternalSalesTransaction.g:70:9: 'KG'
            {
            match("KG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:71:7: ( 'LTR' )
            // InternalSalesTransaction.g:71:9: 'LTR'
            {
            match("LTR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:72:7: ( 'M' )
            // InternalSalesTransaction.g:72:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:73:7: ( 'CashSales' )
            // InternalSalesTransaction.g:73:9: 'CashSales'
            {
            match("CashSales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:74:7: ( 'CreditSales' )
            // InternalSalesTransaction.g:74:9: 'CreditSales'
            {
            match("CreditSales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:75:7: ( 'AdvancePaymentSales' )
            // InternalSalesTransaction.g:75:9: 'AdvancePaymentSales'
            {
            match("AdvancePaymentSales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:76:7: ( 'Cash' )
            // InternalSalesTransaction.g:76:9: 'Cash'
            {
            match("Cash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:77:7: ( 'Card' )
            // InternalSalesTransaction.g:77:9: 'Card'
            {
            match("Card"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:78:7: ( 'TaxExempt' )
            // InternalSalesTransaction.g:78:9: 'TaxExempt'
            {
            match("TaxExempt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:79:7: ( 'IncomeTax' )
            // InternalSalesTransaction.g:79:9: 'IncomeTax'
            {
            match("IncomeTax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:80:7: ( 'CorporateTax' )
            // InternalSalesTransaction.g:80:9: 'CorporateTax'
            {
            match("CorporateTax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:81:7: ( 'VAT' )
            // InternalSalesTransaction.g:81:9: 'VAT'
            {
            match("VAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2183:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSalesTransaction.g:2183:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSalesTransaction.g:2183:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSalesTransaction.g:2183:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSalesTransaction.g:2183:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSalesTransaction.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2185:10: ( ( '0' .. '9' )+ )
            // InternalSalesTransaction.g:2185:12: ( '0' .. '9' )+
            {
            // InternalSalesTransaction.g:2185:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSalesTransaction.g:2185:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2187:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSalesTransaction.g:2187:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSalesTransaction.g:2187:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSalesTransaction.g:2187:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSalesTransaction.g:2187:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSalesTransaction.g:2187:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSalesTransaction.g:2187:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSalesTransaction.g:2187:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSalesTransaction.g:2187:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSalesTransaction.g:2187:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSalesTransaction.g:2187:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2189:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSalesTransaction.g:2189:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSalesTransaction.g:2189:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSalesTransaction.g:2189:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2191:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSalesTransaction.g:2191:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSalesTransaction.g:2191:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSalesTransaction.g:2191:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSalesTransaction.g:2191:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSalesTransaction.g:2191:41: ( '\\r' )? '\\n'
                    {
                    // InternalSalesTransaction.g:2191:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSalesTransaction.g:2191:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2193:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSalesTransaction.g:2193:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSalesTransaction.g:2193:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSalesTransaction.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSalesTransaction.g:2195:16: ( . )
            // InternalSalesTransaction.g:2195:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSalesTransaction.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=78;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSalesTransaction.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSalesTransaction.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSalesTransaction.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSalesTransaction.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSalesTransaction.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSalesTransaction.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSalesTransaction.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSalesTransaction.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSalesTransaction.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSalesTransaction.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSalesTransaction.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSalesTransaction.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSalesTransaction.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSalesTransaction.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSalesTransaction.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSalesTransaction.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSalesTransaction.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSalesTransaction.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSalesTransaction.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSalesTransaction.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSalesTransaction.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSalesTransaction.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSalesTransaction.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSalesTransaction.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSalesTransaction.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSalesTransaction.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSalesTransaction.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSalesTransaction.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSalesTransaction.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalSalesTransaction.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalSalesTransaction.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalSalesTransaction.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalSalesTransaction.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalSalesTransaction.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalSalesTransaction.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalSalesTransaction.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalSalesTransaction.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalSalesTransaction.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalSalesTransaction.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalSalesTransaction.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalSalesTransaction.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalSalesTransaction.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalSalesTransaction.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalSalesTransaction.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalSalesTransaction.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalSalesTransaction.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalSalesTransaction.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalSalesTransaction.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalSalesTransaction.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalSalesTransaction.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalSalesTransaction.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalSalesTransaction.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalSalesTransaction.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalSalesTransaction.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalSalesTransaction.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalSalesTransaction.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalSalesTransaction.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalSalesTransaction.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalSalesTransaction.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalSalesTransaction.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalSalesTransaction.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalSalesTransaction.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalSalesTransaction.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalSalesTransaction.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalSalesTransaction.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalSalesTransaction.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalSalesTransaction.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalSalesTransaction.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalSalesTransaction.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalSalesTransaction.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalSalesTransaction.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalSalesTransaction.g:1:436: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 73 :
                // InternalSalesTransaction.g:1:444: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalSalesTransaction.g:1:453: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalSalesTransaction.g:1:465: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // InternalSalesTransaction.g:1:481: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // InternalSalesTransaction.g:1:497: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // InternalSalesTransaction.g:1:505: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\51\1\uffff\1\51\2\uffff\10\51\2\uffff\1\106\1\111\5\51\1\117\5\51\1\44\2\uffff\3\44\2\uffff\4\51\2\uffff\3\51\2\uffff\23\51\2\uffff\1\51\1\uffff\2\51\1\uffff\3\51\1\u0083\1\51\1\uffff\7\51\5\uffff\17\51\1\u00a0\17\51\1\u00b1\6\51\1\u00b8\1\uffff\1\u00b9\7\51\1\u00c1\2\51\1\u00c4\1\51\1\u00c6\2\51\1\u00cb\6\51\1\u00d2\4\51\1\uffff\4\51\1\u00dc\13\51\1\uffff\6\51\2\uffff\1\u00ef\1\u00f0\5\51\1\uffff\2\51\1\uffff\1\51\1\uffff\4\51\1\uffff\1\u00fe\5\51\1\uffff\10\51\1\u010c\1\uffff\4\51\1\u0111\3\51\1\u0115\3\51\1\u0119\2\51\1\u011c\2\51\2\uffff\6\51\1\u0125\5\51\1\u012b\1\uffff\1\u012c\13\51\1\u0138\1\uffff\4\51\1\uffff\3\51\1\uffff\3\51\1\uffff\2\51\1\uffff\7\51\1\u014c\1\uffff\1\u014d\1\51\1\u014f\2\51\2\uffff\2\51\1\u0154\2\51\1\u0157\2\51\1\u015a\2\51\1\uffff\23\51\2\uffff\1\u0170\1\uffff\4\51\1\uffff\2\51\1\uffff\2\51\1\uffff\3\51\1\u017c\4\51\1\u0182\1\51\1\u0184\3\51\1\u0188\6\51\1\uffff\5\51\1\u0194\1\51\1\u0196\3\51\1\uffff\4\51\1\u019e\1\uffff\1\51\1\uffff\1\u01a0\2\51\1\uffff\1\u01a3\3\51\1\u01a7\1\u01a8\1\u01a9\1\u01aa\3\51\1\uffff\1\51\1\uffff\2\51\1\u01b1\3\51\1\u01b5\1\uffff\1\51\1\uffff\1\u01b7\1\u01b8\1\uffff\3\51\4\uffff\2\51\1\u01c1\3\51\1\uffff\2\51\1\u01c7\1\uffff\1\u01c8\2\uffff\1\u01c9\2\51\1\u01cc\1\51\1\u01ce\2\51\1\uffff\5\51\3\uffff\1\u01d6\1\51\1\uffff\1\u01d8\1\uffff\2\51\1\u01db\3\51\1\u01df\1\uffff\1\51\1\uffff\2\51\1\uffff\2\51\1\u01e5\1\uffff\2\51\1\u01e8\1\51\1\u01ea\1\uffff\2\51\1\uffff\1\u01ed\1\uffff\1\51\1\u01ef\1\uffff\1\51\1\uffff\1\51\1\u01f2\1\uffff";
    static final String DFA12_eofS =
        "\u01f3\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\uffff\1\145\2\uffff\1\141\2\144\1\141\1\151\1\141\1\145\1\156\2\uffff\2\60\1\141\1\165\1\103\1\107\1\124\1\60\1\141\1\144\1\141\1\156\2\101\2\uffff\2\0\1\52\2\uffff\1\144\1\164\1\163\1\162\2\uffff\1\157\1\154\1\162\2\uffff\1\141\1\154\1\170\1\144\1\141\1\157\1\145\1\101\1\145\1\171\1\151\1\157\1\162\1\156\1\164\2\163\1\155\1\151\2\uffff\1\141\1\uffff\2\160\1\uffff\1\154\1\141\1\123\1\60\1\122\1\uffff\1\162\1\145\1\162\1\166\1\170\1\143\1\124\5\uffff\1\160\1\145\1\156\1\171\1\164\1\150\1\144\1\162\1\145\1\154\1\166\1\116\1\156\2\145\1\60\2\151\1\165\1\155\1\165\1\143\1\156\1\155\1\143\1\156\1\143\1\145\3\143\1\60\2\164\1\154\1\151\1\163\1\156\1\60\1\uffff\1\60\1\150\2\144\1\160\1\141\1\105\1\157\1\60\1\141\1\143\1\60\1\164\1\60\1\157\1\151\1\60\2\145\2\151\1\141\1\163\1\60\1\160\1\171\1\142\1\155\1\uffff\1\145\1\164\1\154\1\156\1\60\1\145\2\164\4\145\1\111\1\150\1\162\1\157\1\uffff\1\120\1\145\1\157\1\162\1\145\1\164\2\uffff\2\60\1\151\1\157\1\156\1\170\1\155\1\uffff\1\156\1\145\1\uffff\1\162\1\uffff\1\155\1\145\1\165\1\157\1\uffff\1\60\1\164\1\156\1\143\1\155\1\141\1\uffff\1\150\1\160\1\154\1\157\1\163\1\151\1\141\1\164\1\60\1\uffff\1\144\2\151\1\156\1\60\1\116\1\156\1\164\1\60\1\151\1\165\1\162\1\60\2\171\1\60\1\151\1\141\2\uffff\1\164\1\162\1\143\2\145\1\171\1\60\1\171\1\145\1\162\1\155\1\154\1\60\1\uffff\1\60\1\147\2\145\1\143\1\157\2\145\1\165\1\163\1\157\1\142\1\60\1\uffff\1\104\1\166\2\164\1\uffff\1\165\1\164\1\145\1\uffff\1\160\1\156\1\151\1\uffff\1\145\1\104\1\uffff\1\164\1\154\1\123\1\141\1\145\1\155\1\124\1\60\1\uffff\1\60\1\162\1\60\1\142\1\144\2\uffff\1\120\1\103\1\60\1\164\1\156\1\60\1\101\1\156\1\60\1\156\1\154\1\uffff\1\141\1\145\1\171\1\115\1\155\1\141\1\155\2\164\1\143\1\145\1\141\1\171\1\145\1\141\1\164\1\120\1\160\1\141\2\uffff\1\60\1\uffff\2\145\1\162\1\150\1\uffff\1\151\1\145\1\uffff\1\155\1\164\1\uffff\1\141\1\145\1\164\1\60\1\116\1\145\1\142\1\147\1\60\1\151\1\60\1\145\1\111\1\164\1\60\1\163\1\154\1\145\1\141\1\164\1\170\1\uffff\2\162\1\151\1\141\1\157\1\60\1\157\1\60\1\154\1\116\1\145\1\uffff\1\165\1\164\2\145\1\60\1\uffff\1\157\1\uffff\1\60\1\144\1\145\1\uffff\1\60\1\145\1\124\1\171\4\60\1\143\1\162\1\156\1\uffff\1\165\1\uffff\1\103\1\165\1\60\1\155\1\150\1\162\1\60\1\uffff\1\156\1\uffff\2\60\1\uffff\1\163\1\141\1\155\4\uffff\1\145\1\147\1\60\1\156\1\150\1\155\1\uffff\1\142\1\157\1\60\1\uffff\1\60\2\uffff\1\60\1\170\1\145\1\60\1\145\1\60\1\165\1\171\1\uffff\1\164\1\141\1\142\1\145\1\144\3\uffff\1\60\1\156\1\uffff\1\60\1\uffff\1\155\1\160\1\60\1\162\1\145\1\162\1\60\1\uffff\1\164\1\uffff\1\142\1\145\1\uffff\1\147\1\162\1\60\1\uffff\1\123\1\145\1\60\1\145\1\60\1\uffff\1\141\1\162\1\uffff\1\60\1\uffff\1\154\1\60\1\uffff\1\145\1\uffff\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\uffff\1\165\2\uffff\1\162\1\166\1\164\1\162\1\151\1\141\1\151\1\157\2\uffff\2\172\1\141\1\165\1\103\1\107\1\124\1\172\1\162\1\144\1\141\1\156\1\101\1\172\2\uffff\2\uffff\1\57\2\uffff\1\165\1\164\2\163\2\uffff\3\162\2\uffff\1\165\1\154\1\170\1\144\1\141\1\157\1\145\1\163\1\145\1\171\1\151\1\157\1\162\1\156\1\164\2\163\1\155\1\151\2\uffff\1\141\1\uffff\2\160\1\uffff\1\154\1\141\1\123\1\172\1\122\1\uffff\1\163\1\145\1\162\1\166\1\170\1\143\1\124\5\uffff\1\160\1\151\1\156\1\171\1\164\1\150\1\144\1\162\1\145\1\154\1\166\1\116\1\156\2\145\1\172\1\162\1\151\1\165\1\155\1\165\1\143\1\156\1\155\1\143\1\156\1\143\1\145\3\143\1\172\2\164\1\154\1\151\1\163\1\156\1\172\1\uffff\1\172\1\150\2\144\1\160\1\141\1\105\1\157\1\172\1\141\1\143\1\172\1\164\1\172\1\157\1\151\1\172\2\145\2\151\1\141\1\163\1\172\1\160\1\171\1\142\1\155\1\uffff\1\145\1\164\1\154\1\156\1\172\1\145\2\164\4\145\1\111\1\150\1\162\1\157\1\uffff\1\120\1\145\1\157\1\162\1\145\1\164\2\uffff\2\172\1\151\1\157\1\156\1\170\1\155\1\uffff\1\156\1\145\1\uffff\1\162\1\uffff\1\155\1\145\1\165\1\157\1\uffff\1\172\1\164\1\156\1\143\1\155\1\141\1\uffff\1\150\1\160\1\154\1\157\1\163\1\151\1\141\1\164\1\172\1\uffff\1\144\2\151\1\156\1\172\1\116\1\156\1\164\1\172\1\151\1\165\1\162\1\172\2\171\1\172\1\151\1\141\2\uffff\1\164\1\162\1\143\2\145\1\171\1\172\1\171\1\145\1\162\1\155\1\154\1\172\1\uffff\1\172\1\147\2\145\1\143\1\157\2\145\1\165\1\163\1\157\1\142\1\172\1\uffff\1\104\1\166\2\164\1\uffff\1\165\1\164\1\145\1\uffff\1\160\1\156\1\151\1\uffff\1\145\1\104\1\uffff\1\164\1\154\1\123\1\141\1\145\1\155\1\124\1\172\1\uffff\1\172\1\162\1\172\1\142\1\144\2\uffff\1\120\1\103\1\172\1\164\1\156\1\172\1\101\1\156\1\172\1\156\1\154\1\uffff\1\141\1\145\1\171\1\115\1\155\1\141\1\155\2\164\1\143\1\145\1\141\1\171\1\145\1\141\1\164\1\120\1\160\1\141\2\uffff\1\172\1\uffff\2\145\1\162\1\150\1\uffff\1\151\1\145\1\uffff\1\155\1\164\1\uffff\1\141\1\145\1\164\1\172\1\116\1\145\1\142\1\147\1\172\1\151\1\172\1\145\1\111\1\164\1\172\1\163\1\154\1\145\1\141\1\164\1\170\1\uffff\2\162\1\151\1\141\1\157\1\172\1\157\1\172\1\154\1\116\1\145\1\uffff\1\165\1\164\2\145\1\172\1\uffff\1\157\1\uffff\1\172\1\144\1\145\1\uffff\1\172\1\145\1\124\1\171\4\172\1\143\1\162\1\156\1\uffff\1\165\1\uffff\1\103\1\165\1\172\1\155\1\150\1\162\1\172\1\uffff\1\156\1\uffff\2\172\1\uffff\1\163\1\141\1\155\4\uffff\1\145\1\147\1\172\1\156\1\150\1\155\1\uffff\1\142\1\157\1\172\1\uffff\1\172\2\uffff\1\172\1\170\1\145\1\172\1\145\1\172\1\165\1\171\1\uffff\1\164\1\141\1\142\1\145\1\144\3\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\155\1\160\1\172\1\162\1\145\1\162\1\172\1\uffff\1\164\1\uffff\1\142\1\145\1\uffff\1\147\1\162\1\172\1\uffff\1\123\1\145\1\172\1\145\1\172\1\uffff\1\141\1\162\1\uffff\1\172\1\uffff\1\154\1\172\1\uffff\1\145\1\uffff\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\6\10\uffff\1\35\1\36\16\uffff\1\110\1\111\3\uffff\1\115\1\116\4\uffff\1\110\1\2\3\uffff\1\5\1\6\23\uffff\1\35\1\36\1\uffff\1\37\2\uffff\1\40\5\uffff\1\76\7\uffff\1\111\1\112\1\113\1\114\1\115\47\uffff\1\74\34\uffff\1\56\20\uffff\1\31\6\uffff\1\73\1\75\7\uffff\1\107\2\uffff\1\26\1\uffff\1\12\4\uffff\1\61\6\uffff\1\43\11\uffff\1\25\22\uffff\1\102\1\103\15\uffff\1\15\15\uffff\1\16\4\uffff\1\41\3\uffff\1\27\3\uffff\1\45\2\uffff\1\44\10\uffff\1\3\5\uffff\1\4\1\11\13\uffff\1\71\23\uffff\1\1\1\13\1\uffff\1\52\4\uffff\1\47\2\uffff\1\65\2\uffff\1\10\25\uffff\1\46\13\uffff\1\33\5\uffff\1\54\1\uffff\1\57\3\uffff\1\55\13\uffff\1\14\1\uffff\1\67\7\uffff\1\24\1\uffff\1\34\2\uffff\1\77\3\uffff\1\104\1\105\1\62\1\64\6\uffff\1\21\3\uffff\1\70\1\uffff\1\53\1\63\10\uffff\1\17\5\uffff\1\51\1\30\1\100\2\uffff\1\42\1\uffff\1\7\7\uffff\1\106\1\uffff\1\72\2\uffff\1\66\3\uffff\1\23\5\uffff\1\50\2\uffff\1\22\1\uffff\1\32\2\uffff\1\60\1\uffff\1\20\2\uffff\1\101";
    static final String DFA12_specialS =
        "\1\2\37\uffff\1\0\1\1\u01d1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\4\44\1\4\1\16\1\17\1\42\12\37\7\44\1\31\1\36\1\30\1\36\1\20\3\36\1\33\1\36\1\25\1\26\1\27\2\36\1\24\3\36\1\32\1\36\1\34\4\36\3\44\1\35\1\36\1\44\1\7\1\13\1\1\1\14\1\21\1\22\2\36\1\10\2\36\1\12\3\36\1\11\1\23\1\36\1\3\1\6\1\15\5\36\1\2\1\44\1\5\uff82\44",
            "\1\50\7\uffff\1\46\5\uffff\1\45\5\uffff\1\47",
            "",
            "\1\54\16\uffff\1\53\1\55",
            "",
            "",
            "\1\62\3\uffff\1\61\14\uffff\1\60",
            "\1\63\10\uffff\1\65\10\uffff\1\64",
            "\1\70\16\uffff\1\67\1\66",
            "\1\71\3\uffff\1\74\2\uffff\1\73\11\uffff\1\72",
            "\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100",
            "\1\102\1\101",
            "",
            "",
            "\12\51\7\uffff\3\51\1\105\26\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\14\51\1\107\12\51\1\110\2\51",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\120\15\uffff\1\122\2\uffff\1\121",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\130",
            "\0\130",
            "\1\131\4\uffff\1\132",
            "",
            "",
            "\1\135\10\uffff\1\134\7\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\142\1\141",
            "",
            "",
            "\1\143\2\uffff\1\144",
            "\1\145\5\uffff\1\146",
            "\1\147",
            "",
            "",
            "\1\150\23\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\161\61\uffff\1\160",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0084",
            "",
            "\1\u0086\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008f\3\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\51\7\uffff\1\u009f\22\51\1\u009d\6\51\4\uffff\1\51\1\uffff\1\u009e\31\51",
            "\1\u00a2\10\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c2",
            "\1\u00c3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c7",
            "\1\u00c8",
            "\12\51\7\uffff\7\51\1\u00ca\5\51\1\u00c9\14\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u00db\7\51",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\12\51\7\uffff\22\51\1\u00ee\7\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u00fd\7\51",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011a",
            "\1\u011b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u014e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0150",
            "\1\u0151",
            "",
            "",
            "\1\u0152",
            "\1\u0153",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0155",
            "\1\u0156",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0158",
            "\1\u0159",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u0181\7\51",
            "\1\u0183",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0195",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u019f",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01b6",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "",
            "",
            "",
            "\1\u01bc",
            "\1\u01bd",
            "\12\51\7\uffff\15\51\1\u01bf\5\51\1\u01c0\6\51\4\uffff\1\51\1\uffff\22\51\1\u01be\7\51",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01ca",
            "\1\u01cb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01cd",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01d7",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01e9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01ee",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01f0",
            "",
            "\1\u01f1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 88;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 88;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='s') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0=='i') ) {s = 8;}

                        else if ( (LA12_0=='p') ) {s = 9;}

                        else if ( (LA12_0=='l') ) {s = 10;}

                        else if ( (LA12_0=='b') ) {s = 11;}

                        else if ( (LA12_0=='d') ) {s = 12;}

                        else if ( (LA12_0=='u') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='.') ) {s = 15;}

                        else if ( (LA12_0=='E') ) {s = 16;}

                        else if ( (LA12_0=='e') ) {s = 17;}

                        else if ( (LA12_0=='f') ) {s = 18;}

                        else if ( (LA12_0=='q') ) {s = 19;}

                        else if ( (LA12_0=='P') ) {s = 20;}

                        else if ( (LA12_0=='K') ) {s = 21;}

                        else if ( (LA12_0=='L') ) {s = 22;}

                        else if ( (LA12_0=='M') ) {s = 23;}

                        else if ( (LA12_0=='C') ) {s = 24;}

                        else if ( (LA12_0=='A') ) {s = 25;}

                        else if ( (LA12_0=='T') ) {s = 26;}

                        else if ( (LA12_0=='I') ) {s = 27;}

                        else if ( (LA12_0=='V') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( (LA12_0=='B'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||LA12_0=='J'||(LA12_0>='N' && LA12_0<='O')||(LA12_0>='Q' && LA12_0<='S')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='o')||LA12_0=='r'||(LA12_0>='v' && LA12_0<='z')) ) {s = 30;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='\"') ) {s = 32;}

                        else if ( (LA12_0=='\'') ) {s = 33;}

                        else if ( (LA12_0=='/') ) {s = 34;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 35;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}