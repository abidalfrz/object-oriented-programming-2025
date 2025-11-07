package VehicleLoanSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Penyewa> daftarPenyewa;
    private Scanner scanner;
    private List<Kendaraan> daftarKendaraan;

    public Menu() {
        daftarPenyewa = new ArrayList<>();
        scanner = new Scanner(System.in);
        daftarKendaraan = new ArrayList<>();
        initKendaraan();
    }
    private void initKendaraan() {
        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2020, 4));
        daftarKendaraan.add(new Motor("Yamaha", "NMAX", 2021, 2));
        daftarKendaraan.add(new Sepeda("Polygon", "Strattos S3", 2019, "Road Bike"));
        daftarKendaraan.add(new Mobil("Honda", "Civic", 2019, 4));
        daftarKendaraan.add(new Motor("Honda", "CBR150R", 2020, 2));
        daftarKendaraan.add(new Sepeda("Giant", "ATX", 2018, "Mountain Bike"));
    }

    public void displayMenu() {
        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("=".repeat(10) + " Menu Sistem Penyewaan Kendaraan " + "=".repeat(10));
            System.out.println("1. Tambah Penyewa");
            System.out.println("2. Tampilkan Daftar Penyewa");
            System.out.println("3. Hapus Penyewa");
            System.out.println("0. Keluar");
        

            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahPenyewa();
                    break;
                case 2:
                    tampilkanDaftarPenyewa();
                    break;
                case 3:
                    hapusPenyewa();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    
    private void tambahPenyewa() {
        System.out.print("Masukkan nama penyewa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan alamat penyewa: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan nomor telepon penyewa: ");
        String telp = scanner.nextLine();

        System.out.println("Pilih kendaraan yang akan disewa:");
        for (int i = 0; i < daftarKendaraan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKendaraan.get(i));
        }
        System.out.print("Nomor kendaraan: ");
        int nomorKendaraan = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        if (nomorKendaraan < 1 || nomorKendaraan > daftarKendaraan.size()) {
            System.out.println("Nomor kendaraan tidak valid.");
            return;
        }

        Kendaraan kendaraanDipilih = daftarKendaraan.get(nomorKendaraan - 1);
        Penyewa penyewaBaru = new Penyewa(nama, alamat, telp, kendaraanDipilih);
        daftarPenyewa.add(penyewaBaru);
        System.out.println("Penyewa berhasil ditambahkan.");

        // hapus kendaraan dari daftar tersedia
        daftarKendaraan.remove(kendaraanDipilih);
    }

    private void tampilkanDaftarPenyewa() {
        if (daftarPenyewa.isEmpty()) {
            System.out.println("Belum ada penyewa.");
            return;
        }

        System.out.println("=".repeat(10) + " Daftar Penyewa " + "=".repeat(10));
        for (Penyewa penyewa : daftarPenyewa) {
            System.out.println(penyewa);
        }
    }

    private void hapusPenyewa() {
        System.out.print("Masukkan nama penyewa yang akan dihapus: ");
        String nama = scanner.nextLine();

        Penyewa penyewaDihapus = null;
        for (Penyewa penyewa : daftarPenyewa) {
            if (penyewa.getNama().equalsIgnoreCase(nama)) {
                penyewaDihapus = penyewa;
                break;
            }
        }

        if (penyewaDihapus != null) {
            daftarPenyewa.remove(penyewaDihapus);
            System.out.println("Penyewa berhasil dihapus.");
        } else {
            System.out.println("Penyewa tidak ditemukan.");
        }
    }

}
