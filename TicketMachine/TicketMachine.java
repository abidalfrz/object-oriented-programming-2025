package TicketMachine;
public class TicketMachine
{
    // Instance Fields
    private int price;
    private int balance;
    private int total;

    // Constructor
    public TicketMachine(int cost)
    {
        // Assignment Statement
        price = cost;
        balance = 0;
        total = 0;
    }

    // Method Function

    // Getter Price
    public int getPrice()
    {
        return price;
    }

    // Getter Balance
    public int getBalance()
    {
        return balance;
    }

    // Setter insertMoney
    public void insertMoney(int amount)
    {
        if(amount > 0){
            balance = balance + amount;
        }
        else{
            System.out.println("Use a positive amount" + amount);
        }
    }

    // Method to print ticket price
    public void printTicket()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        total = total + balance;

        balance = 0;
    }

    public static void main(String[] args)
    {
        TicketMachine machine = new TicketMachine(50);
        System.out.println("Ticket Price: " + machine.getPrice() + " cents");
        machine.insertMoney(70);
        System.out.println("Current Balance: " + machine.getBalance() + " cents");
        machine.printTicket();
        System.out.println("Current Balance after printing ticket: " + machine.getBalance() + " cents");
    }
} 
    

