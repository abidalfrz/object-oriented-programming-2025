package TechSupport;

import java.util.HashSet;
public class SupportSystem {
    
    /** Objek pembaca input pengguna. */
    private InputReader reader;

    /** Objek penghasil respons berdasarkan permasalahan akademik. */
    private Responder responder;

    /**
     * Konstruktor SupportSystem.
     * Membuat instance baru dari sistem dengan menginisialisasi
     * objek InputReader dan Responder agar siap digunakan dalam percakapan.
     */
    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Memulai sesi percakapan dengan pengguna.
     * Metode ini akan menampilkan pesan sambutan,
     * lalu memasuki loop interaktif untuk menerima input pengguna.
     * Percakapan akan berakhir ketika pengguna mengetik "bye" atau "keluar".
     */
    public void start() {
        boolean finished = false;
        printWelcome();

        while (!finished) {
            HashSet<String> input = reader.getInput();
            
            // Cek apakah pengguna ingin mengakhiri percakapan
            if (input.contains("bye") || input.contains("keluar")) {
                finished = true;
            } else {
                // Hasilkan respons berdasarkan input pengguna
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Menampilkan pesan sambutan awal kepada pengguna.
     * Berisi panduan singkat mengenai topik yang dapat ditanyakan
     * serta instruksi untuk keluar dari sistem.
     */
    private void printWelcome() {
        System.out.println("Welcome to Academic Support System.");
        System.out.println();
        System.out.println("Silakan jelaskan permasalahan Anda terkait FRS, login, jadwal, dan lain-lain.");
        System.out.println("Ketik 'bye' atau 'keluar' untuk mengakhiri percakapan.");
    }

    /**
     * Menampilkan pesan penutup setelah sesi percakapan berakhir.
     * Digunakan sebagai ucapan terima kasih dan tanda bahwa
     * sistem telah berhenti berjalan.
     */
    private void printGoodbye() {
        System.out.println("Terima kasih telah menggunakan layanan support system. Semoga membantu!");
    }

    /**
     * Titik awal program.
     * Membuat instance baru dari SupportSystem dan menjalankan metode start().
     *
     * @param args argumen baris perintah (tidak digunakan dalam implementasi ini)
     */
    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
