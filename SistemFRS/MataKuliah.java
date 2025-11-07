package SistemFRS;

public class MataKuliah {
    // Attribut
    private String nama;
    private Dosen dosen;
    private char kode;

    // Constructor
    public MataKuliah(String nama, Dosen dosen, char kode) {
        this.nama = nama;
        this.dosen = dosen;
        this.kode = kode;
    }

    // Get Nama Mata Kuliah
    public String getNama() {
        return nama;
    }
    
    // Get Dosen Pengampu
    public Dosen getDosen() {
        return dosen;
    }
    
    // Get Kode Mata Kuliah
    public char getKode() {
        return kode;
    }

    // Tampilkan Informasi Mata Kuliah
    public void display() {
        System.out.println("Nama: " + nama + "\nDosen: " + dosen.getNama() + "\nNIP: " + dosen.getNIP() + "\nKode: " + kode);
    }
}

