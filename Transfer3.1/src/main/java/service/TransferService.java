package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Pemain;
import model.Transfer;
import model.Pinjaman;

public class TransferService {
    private ArrayList<Pemain> daftarTransfer = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // CREATE
    public void tambahTransfer() {
        System.out.println("\n=== Tambah Data Pemain ===");
        System.out.println("1. Transfer Permanen");
        System.out.println("2. Pinjaman");
        System.out.print("Pilih jenis: ");
        int jenis = sc.nextInt(); sc.nextLine();

        System.out.print("Nama pemain : ");
        String nama = sc.nextLine();
        System.out.print("Asal tim : ");
        String asal = sc.nextLine();

        if(jenis == 1){
            System.out.print("Tim baru tujuan : ");
            String tujuan = sc.nextLine();
            System.out.print("Biaya transfer pemain (Euro) : ");
            double biaya = sc.nextDouble(); sc.nextLine();
            Transfer t = new Transfer(nama, asal, tujuan, biaya);
            daftarTransfer.add(t);
        } else if(jenis == 2){
            System.out.print("Tim tujuan pinjaman : ");
            String tujuan = sc.nextLine();
            System.out.print("Durasi pinjaman (bulan): ");
            int durasi = sc.nextInt(); sc.nextLine();
            Pinjaman p = new Pinjaman(nama, asal, tujuan, durasi);
            daftarTransfer.add(p);
        } else {
            System.out.println("Jenis tidak valid!");
            return;
        }
        System.out.println("Data pemain berhasil ditambahkan!");
    }

    // READ
    public void lihatTransfer() {
        System.out.println("\n=== Daftar Pemain ===");
        if(daftarTransfer.isEmpty()){
            System.out.println("Belum ada data pemain...");
        } else {
            for (int i = 0; i < daftarTransfer.size(); i++) {
                Pemain p = daftarTransfer.get(i);
                System.out.println((i+1) + ". " + p.getDetail());
            }
        }
    }

    // UPDATE
    public void ubahTransfer() {
        lihatTransfer();
        if(daftarTransfer.isEmpty()) return;

        System.out.print("Pilih nomor yang mau diubah: ");
        int idx = sc.nextInt(); sc.nextLine();

        if(idx < 1 || idx > daftarTransfer.size()){
            System.out.println("Nomor tidak valid!");
        } else {
            Pemain p = daftarTransfer.get(idx-1);
            System.out.print("Nama pemain baru ("+p.getNamaPemain()+"): ");
            String nama = sc.nextLine();
            System.out.print("Asal tim baru ("+p.getAsalTim()+"): ");
            String asal = sc.nextLine();

            p.setNamaPemain(nama);
            p.setAsalTim(asal);

            if(p instanceof Transfer){
                Transfer t = (Transfer)p;
                System.out.print("Tujuan tim baru ("+t.getKlubTujuan()+"): ");
                String tujuan = sc.nextLine();
                System.out.print("Biaya transfer baru ("+t.getBiayaTransfer()+"): ");
                double biaya = sc.nextDouble(); sc.nextLine();
                t.setKlubTujuan(tujuan);
                t.setBiayaTransfer(biaya);
            } else if(p instanceof Pinjaman){
                Pinjaman pj = (Pinjaman)p;
                System.out.print("Tujuan pinjaman baru ("+pj.getKlubTujuan()+"): ");
                String tujuan = sc.nextLine();
                System.out.print("Durasi pinjaman baru ("+pj.getDurasiBulan()+"): ");
                int durasi = sc.nextInt(); sc.nextLine();
                pj.setKlubTujuan(tujuan);
                pj.setDurasiBulan(durasi);
            }
            System.out.println("Data berhasil diubah!");
        }
    }

    // DELETE
    public void hapusTransfer() {
        lihatTransfer();
        if(daftarTransfer.isEmpty()) return;

        System.out.print("Pilih nomor yang mau dihapus: ");
        int idx = sc.nextInt(); sc.nextLine();

        if(idx < 1 || idx > daftarTransfer.size()){
            System.out.println("Nomor tidak valid!");
        } else {
            daftarTransfer.remove(idx-1);
            System.out.println("Data pemain berhasil dihapus!");
        }
    }

    // SEARCH (Overloading untuk Polymorphism)
    public void cariTransfer(String keyword) {
        boolean ketemu = false;
        for (Pemain p : daftarTransfer){
            if(p.getNamaPemain().equalsIgnoreCase(keyword)){
                System.out.println("Ditemukan: " + p.getDetail());
                ketemu = true;
            }
        }
        if(!ketemu){
            System.out.println("Data tidak ditemukan...");
        }
    }

    public void cariTransfer(String keyword, String asalTim) { // Overloading
        boolean ketemu = false;
        for (Pemain p : daftarTransfer){
            if(p.getNamaPemain().equalsIgnoreCase(keyword) && 
               p.getAsalTim().equalsIgnoreCase(asalTim)){
                System.out.println("Ditemukan: " + p.getDetail());
                ketemu = true;
            }
        }
        if(!ketemu){
            System.out.println("Data tidak ditemukan...");
        }
    }
}
