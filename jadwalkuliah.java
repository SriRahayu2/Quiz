package edu.uph.pbo.pert6;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<Mahasiswa> Mahasiswa = new ArrayList<Mahasiswa>();
    Dosen Dosen;
    Matakuliah Matakuliah;
    ruangan ruangan;

    public jadwalkuliah() {
    }

    public jadwalkuliah(ArrayList<Mahasiswa> Mahasiswa, Dosen Dosen, Matakuliah matakuliah, ruangan ruangan) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
        this.ruangan = ruangan;
    }

    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public Dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(Dosen Dosen) {
        this.Dosen = Dosen;
    }

    public Matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(Matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public ruangan getruangan() {
        return this.ruangan;
    }

    public void setruangan(ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        Mahasiswa.add(mhs);
    }

    public void tampilkanJadwalKuliah() {
        System.out.println("Jadwal Kuliah ");
        System.out.println("Nama Matakuliah : ");
            System.out.println(Matakuliah.toString());
        System.out.println("Dosen : ");
            System.out.println(Dosen.toString());
        System.out.println("Kelas :");
            System.out.println(ruangan.toString());
        System.out.println("Daftar Mahasiswa ");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
        for(Mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
    }
}

