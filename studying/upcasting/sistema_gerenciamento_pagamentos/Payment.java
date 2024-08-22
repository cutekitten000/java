abstract class Payment {
    protected double amount;
    protected String payerName;
    
    public Payment(double amount, String payerName) {
        this.amount = amount;
        this.payerName = payerName;
    }
    
    public abstract void processPayment();
}
