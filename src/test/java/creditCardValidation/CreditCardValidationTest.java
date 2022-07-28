package creditCardValidation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.*;
import static org.hamcrest.core.StringStartsWith.*;

public class CreditCardValidationTest {

    creditCardValidation number = new creditCardValidation();

    @Test
    public void testCorrectLengthOfCreditCardNumber() {

        number.setCardNumber("5412123412341234");
        assertEquals(16, number.getCardNumber().length());
    }

    @Test
    public void testIncorrectLengthOfCreditCardNumber() {

        number.setCardNumber("5412121212122");
        assertNotEquals(16, number.getCardNumber().length());
    }

    @Test
    public void testCreditCardNumberOnlyNumber(){
        number.setCardNumber("1234xzyq1111");
        assertFalse(number.getCardNumber().matches("[0-9]"));
    }

    @Test
    public void testCreditCardNumberVisa(){

        number.setCardNumber("4123123412341234");
        assertTrue(number.getCardNumber().startsWith("4"));
    }

    @Test
    public void testCreditCardNumberMaster(){

        String [] validNumber = {"511144371144376",
                "521134113411347",
                "530000000000002",
                "548282246310005",
                "5511016011016011"};

        for(String number: validNumber){
            assertTrue(number.startsWith("51") || number.startsWith("52")
                    || number.startsWith("53") || number.startsWith("54") || number.startsWith("55"));
        }
    }

    @Test
    public void testCreditCardNumberDiners(){

        String [] validNumber = {"3689123412341234",
                "3852456745674567"};

        for(String number: validNumber){
            assertTrue(number.startsWith("36") || number.startsWith("38"));
        }
    }

    @Test
    public void testCreditCardNumberDiscover(){

        String [] validNumber = {"6011123412341234",
                "6552456745674567"};

        for(String number: validNumber){
            assertTrue(number.startsWith("6011") || number.startsWith("65"));
        }
    }

    @Test
    public void testCreditCardNumberJCB(){

        number.setCardNumber("3585985674125231");
        assertTrue(number.getCardNumber().startsWith("35"));

    }

    @Test
    public void testCreditCardNumberAmericanExpress(){
        String [] validNumber = {"3489123412341234",
                "3752456745674567"};

        for(String number: validNumber){
            assertTrue(number.startsWith("34") || number.startsWith("37"));
        }
    }
}