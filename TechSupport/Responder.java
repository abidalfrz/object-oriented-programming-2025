package TechSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
public class Responder {

    /** Objek untuk menghasilkan angka acak dalam pemilihan respons default. */
    private Random randomGenerator;

    /** 
     * Daftar respons umum (fallback responses) yang digunakan ketika 
     * sistem tidak menemukan kata kunci spesifik dalam input pengguna.
     */
    private ArrayList<String> defaultResponses;

    /**
     * Struktur data yang menyimpan pasangan kata kunci dan respons spesifik 
     * terkait permasalahan akademik yang sering terjadi.
     */
    private HashMap<String, String> responseMap;

    /**
     * Konstruktor untuk menginisialisasi objek {@code Responder}.
     * 
     * Konstruktor ini akan membuat objek generator acak, menginisialisasi daftar
     * respons umum dan peta respons kata kunci, serta secara otomatis memanggil
     * metode {@link #fillResponses()} dan {@link #fillResponseMap()} 
     * untuk mengisi data awal.
     * 
     */
    public Responder() {
        randomGenerator = new Random();
        defaultResponses = new ArrayList<>();
        responseMap = new HashMap<>();

        fillResponses();
        fillResponseMap();
    }

    /**
     * Menghasilkan respons yang sesuai berdasarkan kumpulan kata 
     * yang diperoleh dari input pengguna.
     * 
     * Metode ini akan memeriksa setiap kata yang diberikan dan mencocokkannya 
     * dengan kunci yang terdapat di dalam {@code responseMap}. 
     * Jika ditemukan kata kunci yang cocok, maka respons yang sesuai akan dikembalikan.
     * Jika tidak ditemukan, sistem akan menampilkan salah satu respons umum secara acak.
     * 
     *
     * @param words himpunan kata yang diambil dari input pengguna
     * @return respons yang relevan dalam bentuk {@code String}
     */
    public String generateResponse(Set<String> words) {
        for (String word : words) {
            if (responseMap.containsKey(word)) {
                return responseMap.get(word);
            }
        }

        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }

    /**
     * Mengisi daftar {@code defaultResponses} dengan kumpulan respons umum.
     * Respons ini digunakan ketika sistem tidak dapat mengenali konteks 
     * atau kata kunci dari permasalahan pengguna.
     */
    private void fillResponses() {
        defaultResponses.add("Bisa dijelaskan lebih detail masalah akademiknya?");
        defaultResponses.add("Apakah sudah mencoba logout dan login kembali ke sistem akademik?");
        defaultResponses.add("Pastikan data Anda sudah sesuai di portal mahasiswa.");
        defaultResponses.add("Silakan hubungi dosen pembimbing akademik untuk verifikasi.");
        defaultResponses.add("Sistem mungkin sedang sibuk, coba beberapa saat lagi.");
        defaultResponses.add("Coba pastikan koneksi internet Anda stabil.");
        defaultResponses.add("Apakah Anda sudah memperbarui data KRS sebelumnya?");
        defaultResponses.add("Silakan coba akses melalui browser berbeda.");
        defaultResponses.add("Untuk kasus seperti ini, Anda bisa menghubungi bagian akademik fakultas.");
    }

    /**
     * Mengisi {@code responseMap} dengan pasangan kata kunci dan respons 
     * yang spesifik terhadap berbagai permasalahan sistem akademik.
     * Setiap entri di dalam peta ini mewakili permasalahan umum seperti 
     * kelas penuh, login gagal, jadwal bentrok, hingga kendala server.
     */
    private void fillResponseMap() {
        responseMap.put("kelas", 
            "Kelas yang Anda pilih sudah penuh. Silakan pilih kelas lain atau hubungi admin jurusan untuk penambahan kuota.");
        responseMap.put("penuh", 
            "Kelas penuh. Sistem FRS tidak dapat menambahkan mata kuliah. Coba cari kelas alternatif dengan jadwal yang sama.");
        responseMap.put("nrp", 
            "NRP tidak sesuai dengan data mahasiswa. Pastikan Anda login menggunakan akun resmi kampus.");
        responseMap.put("login", 
            "Masalah login biasanya disebabkan karena NRP atau password salah. Coba reset password melalui portal akademik.");
        responseMap.put("dosen", 
            "Dosen pembimbing belum menyetujui FRS Anda. Mohon hubungi dosen PA agar disetujui.");
        responseMap.put("setuju", 
            "FRS belum disetujui. Silakan tunggu konfirmasi dari dosen pembimbing atau bagian akademik.");
        responseMap.put("jadwal", 
            "Jadwal bentrok terdeteksi. Silakan ubah salah satu mata kuliah agar tidak tumpang tindih.");
        responseMap.put("bentrok", 
            "Anda memiliki jadwal bentrok. Coba lihat menu 'Cek Konflik Jadwal' di sistem FRS.");
        responseMap.put("server", 
            "Server akademik sedang dalam perawatan. Silakan coba beberapa menit lagi.");
        responseMap.put("error", 
            "Terjadi error pada sistem. Coba refresh halaman atau hubungi helpdesk akademik.");
        responseMap.put("tambah", 
            "Anda belum bisa menambah mata kuliah karena FRS sudah disetujui. Hubungi dosen pembimbing untuk membuka kembali.");
        responseMap.put("hapus", 
            "Mata kuliah tidak dapat dihapus karena periode FRS telah ditutup. Silakan ajukan pembatalan manual ke akademik.");
    }
}
