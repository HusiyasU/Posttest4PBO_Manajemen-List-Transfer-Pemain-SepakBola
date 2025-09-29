package model;

// Abstract class
public abstract class Pemain {
    private String namaPemain;
    private String asalTim;

    public Pemain(String namaPemain, String asalTim) {
        this.namaPemain = namaPemain;
        this.asalTim = asalTim;
    }

    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getAsalTim() {
        return asalTim;
    }

    public void setAsalTim(String asalTim) {
        this.asalTim = asalTim;
    }

    // Abstract method → wajib dioverride di subclass
    public abstract String getDetail();

    @Override
    public String toString() {
        return getDetail();
    }
}
