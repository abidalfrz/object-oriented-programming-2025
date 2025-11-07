package CoffeeMachine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private Coffee coffee;
    private Size size;
    private double amountPaid;
    private double total;
    private String dateTime;

    public Transaction(Coffee coffee, Size size, double total, double amountPaid) {
        this.coffee = coffee;
        this.size = size;
        this.total = total;
        this.amountPaid = amountPaid;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dateTime = now.format(formatter);
        
    }

    @Override
    public String toString() {
        return "[" + dateTime + "] " + coffee.getName() + " (" + size + ")"
                + " | Total: Rp " + total + " | Bayar: Rp " + amountPaid;
    }
}


