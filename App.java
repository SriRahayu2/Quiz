import edu.uph.pbo.pert6.jadwalkuliah;
import edu.uph.pbo.pert6.Mahasiswa;
import edu.uph.pbo.pert6.Matakuliah;
import edu.uph.pbo.pert6.Dosen;
import edu.uph.pbo.pert6.ruangan;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Clavin", "01210121",false);
        Mahasiswa mhs2 = new Mahasiswa("SriRahayu", "01210121",true);
        Mahasiswa mhs3 = new Mahasiswa("Elvia", "01210121",true);

        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);  
        Dosen Dosen = new Dosen("Pak Ade", false);
        Matakuliah Matakuliah = new Matakuliah("Pemrograman Berorientasi Objek");
        ruangan ruangan = new ruangan("Malam");
        JadwalKuliah.setDosen(Dosen);
        JadwalKuliah.setMatakuliah(Matakuliah);
        JadwalKuliah.setruangan(ruangan);
        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}