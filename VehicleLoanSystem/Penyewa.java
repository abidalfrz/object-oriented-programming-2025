package VehicleLoanSystem;

public class Penyewa {
    private String nama;
    private String alamat;
    private String noTelepon;
    private Kendaraan kendaraanDisewa;

    public Penyewa(String nama, String alamat, String noTelepon, Kendaraan kendaraanDisewa) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.kendaraanDisewa = kendaraanDisewa;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public Kendaraan getKendaraanDisewa() {
        return kendaraanDisewa;
    }

    @Override
    public String toString() {
        return "Penyewa: " + nama + ", Alamat: " + alamat + ", No Telepon: " + noTelepon +
               ", Kendaraan Disewa: [" + kendaraanDisewa.toString() + "]";
    }
    
}
