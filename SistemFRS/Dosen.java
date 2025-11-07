package SistemFRS;

public class Dosen {
    // Attribut
    private String nama;
    private String nip;
    
    // Constructor
    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    // Get Nama Dosen
    public String getNama() {
        return nama;
    }
    
    // Get NIP Dosen
    public String getNIP() {
        return nip;
    }
    
    // Tampilkan Informasi Dosen
    public void display() {
        System.out.println("Dosen: " + nama );
        System.out.println("NIP: " + nip );
    }
} 