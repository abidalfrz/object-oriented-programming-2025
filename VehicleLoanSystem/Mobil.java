package VehicleLoanSystem;

public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String toString() {
        return super.toString() + " - Mobil dengan " + jumlahRoda + " roda";
    }
    
}
