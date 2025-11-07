package VehicleLoanSystem;

public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String toString() {
        return super.toString() + " - Motor dengan " + jumlahRoda + " roda";
    }
    
}
