package main;

import java.util.Scanner;
import service.TransferService;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransferService service = new TransferService();
        int pilihan;

        do {
            System.out.println("\n=== MANAJEMEN LIST TRANSFER & PINJAMAN PEMAIN SEPAK BOLA ===");
            System.out.println("1. Tambah Data Pemain");
            System.out.println("2. Lihat Daftar Pemain");
            System.out.println("3. Ubah Data Pemain");
            System.out.println("4. Hapus Data Pemain");
            System.out.println("5. Cari Data Pemain");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    service.tambahTransfer();
                    break;
                case 2:
                    service.lihatTransfer();
                    break;
                case 3:
                    service.ubahTransfer();
                    break;
                case 4:
                    service.hapusTransfer();
                    break;
                case 5:
                    System.out.print("Masukkan nama pemain: ");
                    String nama = sc.nextLine();
                    System.out.print("Cari dengan asal tim juga? (y/n): ");
                    String opsi = sc.nextLine();
                    if(opsi.equalsIgnoreCase("y")){
                        System.out.print("Masukkan asal tim: ");
                        String asal = sc.nextLine();
                        service.cariTransfer(nama, asal);
                    } else {
                        service.cariTransfer(nama);
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 6);

        sc.close();
    }
}
