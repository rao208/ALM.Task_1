package dev.andrylat.rao.cardvalidator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCardValidator {

    /**
     * Checks if the field is a valid credit card number.
     *
     * @param cardIn The card number to validate.
     * @return Whether the card number is valid.
     */

    public static String isValidCard(final String cardIn) throws Exception {

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
        Pattern p = Pattern.compile("^4[0-9]{15}|(5[1-5]|3[5-8]|65)[0-9]{14}|(6011[0-9]{12})$"); // separate class
        Matcher m = p.matcher(cardIn);

        if (!m.matches()) {
            throw new Exception("Card number is invalid" + newLine +
                    "Error:" + newLine +
                    "Valid credit card number is 16 digits long" + newLine +
                    "Valid credit card number should be contain only digits" + newLine +
                    "Payment system cannot be determined");
        }

        return m.group();
    }
}
