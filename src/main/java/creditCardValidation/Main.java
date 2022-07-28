package creditCardValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        creditCardValidation cardNumber = new creditCardValidation();
        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello. Enter card number for validation:");

        cardNumber.setCardNumber(sc.nextLine());

        Matcher m = Pattern.compile("\\d{16}").matcher(cardNumber.getCardNumber());

        if (!m.matches()) {
            System.out.println("Card number is invalid");
            System.out.println("Error:" + newLine +
                    "Valid credit card number is 16 digits long" + newLine +
                    "Valid credit card number should be contain only digits" + newLine +
                    "Payment system cannot be determined");
        } else {
            if (cardNumber.getCardNumber().startsWith("4")) {
                System.out.println("Card is valid. Payment system is 'VISA'");
            } else if (cardNumber.getCardNumber().startsWith("51") || cardNumber.getCardNumber().startsWith("52")
                    || cardNumber.getCardNumber().startsWith("53") || cardNumber.getCardNumber().startsWith("54")
                    || cardNumber.getCardNumber().startsWith("55")) {
                System.out.println("Card is valid. Payment system is 'Mastercard'");
            } else if (cardNumber.getCardNumber().startsWith("36") || cardNumber.getCardNumber().startsWith("38")) {
                System.out.println("Card is valid. Payment system is 'Diners Club'");
            } else if (cardNumber.getCardNumber().startsWith("6011") || cardNumber.getCardNumber().startsWith("65")) {
                System.out.println("Card is valid. Payment system is 'Discover'");
            } else if (cardNumber.getCardNumber().startsWith("35")) {
                System.out.println("Card is valid. Payment system is 'JCB'");
            } else if (cardNumber.getCardNumber().startsWith("34") || cardNumber.getCardNumber().startsWith("37")) {
                System.out.println("Card is valid. Payment system is 'American Express'");
            } else {
                System.out.println("Card number is invalid");
                System.out.println("Errors:" + newLine +
                        "Valid credit card number is 16 digits" + newLine +
                        "Valid credit card number should be contain only digits" + newLine +
                        "Payment system cannot be determined");
            }

        }
    }
}
