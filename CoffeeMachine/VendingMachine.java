package CoffeeMachine;

import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachine {
    private Menu menu;
    private Inventory inventory;
    private ArrayList<Transaction> history;

    public VendingMachine() {
        menu = new Menu();
        inventory = new Inventory(20, 20, 20);
        history = new ArrayList<>();
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println();
            menu.showMenu();
            System.out.print("Pilih kopi (pilih 0 untuk keluar): ");
            int choice = input.nextInt();
            if (choice == 0) break;

            Coffee coffee = menu.getCoffee(choice - 1);
            if (coffee == null) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.println("1. Small\n2. Medium\n3. Large\nPilih ukuran: ");
            int sizeChoice = input.nextInt();
            Size size = switch (sizeChoice) {
                case 1 -> Size.SMALL;
                case 2 -> Size.MEDIUM;
                case 3 -> Size.LARGE;
                default -> Size.SMALL;
            };

            System.out.print("Tambah gula? (y/n): ");
            boolean addSugar = input.next().equalsIgnoreCase("y");
            System.out.print("Tambah susu? (y/n): ");
            boolean addMilk = input.next().equalsIgnoreCase("y");

            if (!inventory.hasEnough(size, addSugar, addMilk)) {
                System.out.println("Stok bahan tidak mencukupi! Hubungi admin untuk mengisi ulang stok.");
                break;
            }

            double total = coffee.getPrice(size) + (addSugar ? 500 : 0) + (addMilk ? 1000 : 0);
            System.out.println("Total harga: Rp " + total);
            System.out.print("Masukkan uang: Rp ");
            double payment = input.nextDouble();

            if (payment >= total) {
                inventory.useIngredients(size, addSugar, addMilk);
                double change = payment - total;
                System.out.println("Membuat kopi " + coffee.getName() + "...");
                System.out.println("Kopi telah dibuat! Kembalian: Rp " + change);
                history.add(new Transaction(coffee, size, total, payment));
            } else {
                System.out.println("Uang tidak cukup!");
            }
        }

        showHistory();
        System.out.println("Terima kasih telah menggunakan mesin kopi!");
    }

    public void showHistory() {
        System.out.println("\n" + "=".repeat(30) + " Riwayat Transaksi " + "=".repeat(30));
        if(history.isEmpty()){
            System.out.println("Belum ada transaksi.");
            return;
        }else{
            for(Transaction t : history){
                System.out.println(t);
            }
        }
        System.out.println("=".repeat(79));
        
    }
}
