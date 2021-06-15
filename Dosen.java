package edu.uph.pbo.pert6;

public class Dosen {
    String nama;
    boolean jekel;


    public Dosen(String nama, boolean jekel) {
        this.nama = nama;
        this.jekel = jekel;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJekel() {
        return this.jekel;
    }

    public boolean getJekel() {
        return this.jekel;
    }

    public void setJekel(boolean jekel) {
        this.jekel = jekel;
    }

    @Override
    public String toString() {
        return 
            "Nama Dosen     = " + getNama() + "\n" +

            "Jenis kelamin  = " + (isJekel()==true? "Wanita" : "Pria") + "\n " 
            ;
    }
}