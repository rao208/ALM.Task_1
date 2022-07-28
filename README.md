# Credit Card Application

This application reads valid or invalid credit card number from the user and informs the name of the payment system of the card. If the credit card number is invalid, then the application lists errors

## Example

### Postive Test Case
    > Hello. Enter card number for validation:
    
    4234 1234 1234 1234
    
    > Card is valid. Payment system is 'VISA'
    
### Negative Test Case

    > Hello. Enter card number for validation:
    
    1234xzyq1111
    
    > Card is invalid.
    > Errors:
    > -> Valid credit card number is 16 digits
      -> Valid credit card number should be contain only digits
      -> Payment system cannot be determined
    
