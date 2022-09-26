package dev.andrylat.rao.cardvalidator;

import java.util.List;

public enum CreditCard {

    VISA(List.of("4"), "Visa"),
    MasterCard(List.of("51","52","53","54","55"), "Mastercard"),
    DinerClub(List.of("36", "38"), "Diners Club "),
    Discover(List.of("6011", "65"), "Discover"),
    JCB(List.of("35"), "JCB"),
    AmericanExpress(List.of("34", "37"), "American Express");

    final List<String> prefixes;
    final String paymentSystemName;

    // create

    CreditCard(List<String> prefixes, String paymentSystemName) {

        this.prefixes = prefixes;
        this.paymentSystemName = paymentSystemName;

    }

    public static String determinePaymentSystem(String cardNumber) {

        // go through all values of enum and check prefixes

        for (CreditCard value : CreditCard.values()) {
            for (String prefix : value.prefixes) {
                if (cardNumber.startsWith(prefix)) {
                    return value.paymentSystemName;
                }
            }
        }

        return null;
    }
}
