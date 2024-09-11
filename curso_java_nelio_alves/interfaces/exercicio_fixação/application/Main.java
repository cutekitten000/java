package application;

import model.entities.Contract;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double amount = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int installment = sc.nextInt();

        Contract contract = new Contract(number, date, amount);

        ContractService contractService = new ContractService();
        contractService.processContract(contract, installment);

        sc.close();
    }
}
