package dev.andrylat.rao.cardvalidator;

import java.util.Scanner;

import static dev.andrylat.rao.cardvalidator.RegexCardValidator.isValidCard;

public class Main {
    public static void main(String[] args) throws Exception{

        creditCardValidation cardNumber = new creditCardValidation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Enter card number for validation:");
        cardNumber.setCardNumber(sc.nextLine());
        String validCardNumber = isValidCard(cardNumber.getCardNumber());
        String paymentSystem= CreditCard.determinePaymentSystem(validCardNumber);
        System.out.println("Card is valid. Payment system is "+paymentSystem);

    }
}
