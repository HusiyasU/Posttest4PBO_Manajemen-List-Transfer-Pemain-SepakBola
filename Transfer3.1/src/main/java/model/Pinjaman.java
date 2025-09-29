package model;

public class Pinjaman extends Pemain implements Kontrak {
    private String klubTujuan;
    private int durasiBulan;

    public Pinjaman(String namaPemain, String asalTim, String klubTujuan, int durasiBulan) {
        super(namaPemain, asalTim);
        this.klubTujuan = klubTujuan;
        this.durasiBulan = durasiBulan;
    }

    public String getKlubTujuan() {
        return klubTujuan;
    }

    public void setKlubTujuan(String klubTujuan) {
        this.klubTujuan = klubTujuan;
    }

    public int getDurasiBulan() {
        return durasiBulan;
    }

    public void setDurasiBulan(int durasiBulan) {
        this.durasiBulan = durasiBulan;
    }

    // Overriding abstract method
    @Override
    public String getDetail() {
        return getNamaPemain() + " (" + getAsalTim() + ") dipinjamkan ke " +
                klubTujuan + " selama " + durasiBulan + " bulan";
    }

    // Implementasi interface
    @Override
    public String jenisKontrak() {
        return "Pinjaman";
    }
}
