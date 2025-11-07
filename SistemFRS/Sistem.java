package SistemFRS;

public class Sistem {
    public static void main(String[] args) {
        // Buat dosen
        Dosen dosen1 = new Dosen("Dini Adni Navastara, S.Kom., M.Sc.", "198510172015042001");
        Dosen dosen2 = new Dosen("Sarwosri, S.Kom., M.T.", "197608092001122001");
        Dosen dosen3 = new Dosen("Royyana Muslim Ijtihadie, S.Kom., M.Kom., Ph.D.", "197708242006041001");

        // Buat mata kuliah
        MataKuliah mk1 = new MataKuliah("Konsep Kecerdasan Artifisial", dosen1,'E');
        MataKuliah mk2 = new MataKuliah("Konsep Pengembangan Perangkat Lunak", dosen2, 'B');
        MataKuliah mk3 = new MataKuliah("Jaringan Komputer", dosen3, 'B');

        // Buat mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Muhammad Abid Baihaqi Al Faridzi", "5025241133");
        Mahasiswa mhs2 = new Mahasiswa("Hosea Felix Sanjaya", "5025241177");

        // Mengambil mata kuliah
        mhs1.ambilMataKuliah(mk1);
        mhs1.ambilMataKuliah(mk2);
        mhs1.ambilMataKuliah(mk3);
        mhs2.ambilMataKuliah(mk1);
        mhs2.ambilMataKuliah(mk3);
        mhs1.ambilMataKuliah(mk2);

        // Tampilkan mata kuliah
        mhs1.displayMataKuliah();
        mhs2.displayMataKuliah();

        // Drop mata kuliah
        mhs1.dropMataKuliah(mk2);

        // Tampilkan setelah drop
        mhs1.displayMataKuliah();
        
    }
}

