package TechSupport;

import java.util.HashSet;
import java.util.Scanner;
public class InputReader {
    /** Scanner digunakan untuk membaca input dari pengguna melalui konsol. */
    private Scanner reader;

    /**
     * Konstruktor InputReader.
     * 
     * Konstruktor ini menginisialisasi objek Scanner yang akan digunakan untuk membaca
     * input teks dari pengguna. Pemanggilan konstruktor ini dilakukan oleh kelas SupportSystem
     * saat sistem pertama kali dijalankan.
     */
    public InputReader() {
        reader = new Scanner(System.in);
    }

    /**
     * Membaca dan memproses input pengguna.
     * 
     * Metode ini menampilkan tanda prompt (">") sebagai indikasi agar pengguna mengetikkan input.
     * Setelah pengguna memasukkan teks, metode akan:
     * - Menghapus spasi di awal dan akhir input,
     * - Mengubah semua huruf menjadi huruf kecil (lowercase),
     * - Memisahkan input berdasarkan spasi menjadi array kata,
     * - Menyimpan setiap kata unik ke dalam struktur HashSet.
     * 
     * @return HashSet<String> kumpulan kata unik hasil pemrosesan input pengguna.
     */
    public HashSet<String> getInput() {
        System.out.print("> "); 
        String inputLine = reader.nextLine().trim().toLowerCase();
        String[] wordArray = inputLine.split(" ");

        HashSet<String> words = new HashSet<>();
        for (String word : wordArray) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        return words;
    }
}
