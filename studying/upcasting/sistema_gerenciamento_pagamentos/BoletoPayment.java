class BoletoPayment extends Payment {
    private String boletoNumber;
    
    public BoletoPayment(double amount, String payerName, String boletoNumber) {
        super(amount, payerName);
        this.boletoNumber = boletoNumber;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing Boleto Payment for " + payerName + ", Amount: $" + amount + ", Boleto Number: " + boletoNumber);
    }
}
