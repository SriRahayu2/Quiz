package edu.uph.pbo.pert6;

public class Matakuliah {
    String pel;

    public Matakuliah(String pel) {
        this.pel = pel;
    }

    public String getpel() {
        return this.pel;
    }

    public void setpel(String pel) {
        this.pel = pel;
    }

    
    @Override
    public String toString() {
        return "" + getpel();
    }

}