class BankTransferPayment extends Payment {
    private String bankAccount;
    
    public BankTransferPayment(double amount, String payerName, String bankAccount) {
        super(amount, payerName);
        this.bankAccount = bankAccount;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing Bank Transfer Payment for " + payerName + ", Amount: $" + amount + ", Bank Account: " + bankAccount);
    }
}
