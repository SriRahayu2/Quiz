package edu.uph.pbo.pert6;

public class ruangan {
    String kelas;

    public ruangan(String kelas) {
        this.kelas = kelas;
    }

    public String getkelas() {
        return this.kelas;
    }

    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    
    @Override
    public String toString() {
        return "" + getkelas();
    }

}