package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContractService {
    public void processContract(Contract contract, Integer months) {
        OnlinePaymentService service = new PaypalService();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Parcelas:");
        for (int i = 0; i < months; i++) {
            double amount = service.interest(contract.getTotalValue() / months, i + 1);
            LocalDate installmentDate = contract.getDate().plusMonths(i);

            String formattedDate = installmentDate.format(fmt);

            System.out.println(formattedDate + " - " + String.format("%.2f", service.paymentFee(amount)));
        }
    }
}
