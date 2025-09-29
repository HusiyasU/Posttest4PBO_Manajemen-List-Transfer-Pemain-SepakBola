package model;

public class Transfer extends Pemain implements Kontrak {
    private String klubTujuan;
    private double biayaTransfer;

    public Transfer(String namaPemain, String asalTim, String klubTujuan, double biayaTransfer) {
        super(namaPemain, asalTim);
        this.klubTujuan = klubTujuan;
        this.biayaTransfer = biayaTransfer;
    }

    public String getKlubTujuan() {
        return klubTujuan;
    }

    public void setKlubTujuan(String klubTujuan) {
        this.klubTujuan = klubTujuan;
    }

    public double getBiayaTransfer() {
        return biayaTransfer;
    }

    public void setBiayaTransfer(double biayaTransfer) {
        this.biayaTransfer = biayaTransfer;
    }

    // Overriding abstract method
    @Override
    public String getDetail() {
        return getNamaPemain() + " (" + getAsalTim() + ") -> " + klubTujuan +
                " | Biaya Transfer: €" + biayaTransfer + " juta";
    }

    // Implementasi interface
    @Override
    public String jenisKontrak() {
        return "Transfer Permanen";
    }
}
