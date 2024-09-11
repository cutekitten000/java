package model.entities;

import java.time.LocalDateTime;

public class Installment {
    private LocalDateTime dueDate;
    private Double amount;

    public Installment(LocalDateTime dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public Double getAmount() {
        return amount;
    }
}
