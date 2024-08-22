class CreditCardPayment extends Payment {
    private String cardNumber;
    
    public CreditCardPayment(double amount, String payerName, String cardNumber) {
        super(amount, payerName);
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment for " + payerName + ", Amount: $" + amount + ", Card Number: " + cardNumber);
    }
}
