package VehicleLoanSystem;

public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    @Override
    public String toString() {
        return super.toString() + " - Sepeda jenis " + jenisSepeda;
    }
    
}
