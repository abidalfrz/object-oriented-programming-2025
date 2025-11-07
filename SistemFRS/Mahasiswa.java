package SistemFRS;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    // Attribut
    private String nama;
    private String nrp;
    private List<MataKuliah> mataKuliahList;
    
    // Constructor
    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
        this.mataKuliahList = new ArrayList<>();
    }

    // Ambil mata kuliah
    public void ambilMataKuliah(MataKuliah mk) {
        if (!mataKuliahList.contains(mk)) {
            mataKuliahList.add(mk);
            System.out.println(mk.getNama() + " berhasil diambil oleh " + nama + " (" + nrp + ")\n");
        } else {
            System.out.println(mk.getNama() + " sudah diambil oleh " + nama + " (" + nrp + ")\n");
        }
    }

    // Drop mata kuliah
    public void dropMataKuliah(MataKuliah mk) {
        if (mataKuliahList.remove(mk)) {
            System.out.println("\n" + mk.getNama() +" berhasil didrop oleh " + nama + " (" + nrp + ")\n");
        } else {
            System.out.println("\n" + mk.getNama() + " belum diambil oleh " + nama + " (" + nrp + ")\n");
        }
    }

    // Tampilkan mata kuliah
    public void displayMataKuliah() {
        System.out.println("\nNama: " + nama);
        System.out.println("NRP: " + nrp);
        System.out.println("Mata kuliah yang diambil: ");
        if (mataKuliahList.isEmpty()) {
            System.out.println("- Belum mengambil mata kuliah.");
        } else {
            for (MataKuliah mk : mataKuliahList) {
                mk.display();
            }
        }
    }
}