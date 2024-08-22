import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        
        List<Payment> payments = new ArrayList<>();
        
        payments.add(new CreditCardPayment(150.00, "John Doe", "**** **** **** 1234"));
        payments.add(new BankTransferPayment(1000.00, "Alice Smith", "123456-7"));
        payments.add(new BoletoPayment(200.00, "Bob Brown", "789123456789"));
        
        for (Payment payment : payments) {
            payment.processPayment();
        }
        
    }
}
