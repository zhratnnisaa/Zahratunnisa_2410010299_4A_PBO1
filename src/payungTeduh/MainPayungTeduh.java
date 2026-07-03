package payungTeduh;

//IO SEDERHANA
import java.util.Scanner;

import model.Pelanggan;
import model.PemesananFoto;
import paket.PaketLayanan;
import paket.PaketIndoor;
import paket.PaketOutdoor;

public class MainPayungTeduh {

    //ARRAY
    static PemesananFoto[] antrean = new PemesananFoto[20];
    static int jumlahAntrean = 0;

    //DAFTAR PAKET
    static PaketLayanan[] daftarPaket ={
        new PaketIndoor("Minimalist Potrait", 350000),
        new PaketIndoor("Corporate Professional", 500000),    
        new PaketIndoor("Graduation Story", 600000),
        new PaketOutdoor("Family Warmth", 1350000, 150000),
        new PaketOutdoor("Eternal Love (Pre-Wedding)", 5000000, 200000)
    };

    static void tampilkanMenu() {
        System.out.println("\n---------- MENU UTAMA ----------");
        System.out.println("1. Lihat Paket");
        System.out.println("2. Pesan Sesi");
        System.out.println("3. Tampilkan Riwayat");
        System.out.println("4. Keluar");
        System.out.println("---------------------------------");
    }
    
    //IO SEDERHANA
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean lanjut = true;

        System.out.println("=====================================");
        System.out.println("  PAYUNG TEDUH STUDIO");
        System.out.println("  Booking & Session Management");
        System.out.println("=====================================");

        //PERULANGAN
        while (lanjut) {
            tampilkanMenu();

            int pilihan = -1;
            //ERROR HANDLING
            try {
                System.out.print("Pilih menu (1-4): ");
                String input = sc.nextLine();
                pilihan = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(">> Input harus berupa angka!\n");
                continue;
            }

            //SELEKSI
            switch (pilihan) {
                case 1:
                    lihatPaket();
                    break;
                case 2:
                    pesanSesi();
                    break;
                case 3:
                    tampilkanRiwayat();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("\nTerima kasih telah menggunakan layanan Studio Payung Teduh!");
                    System.out.println("Sampai jumpa di sesi pemotretan berikutnya :)");
                    break;
                default:
                    System.out.println(">> Menu tidak tersedia. Silakan pilih 1-4.\n");
            }
        }
        sc.close();
    }

    //MENU 1 : LIHAT PAKET
    static void lihatPaket() {
        System.out.println("\n=== DAFTAR PAKET LAYANAN STUDIO PAYUNG TEDUH ===");
        for (int i = 0; i < daftarPaket.length; i++) {
            PaketLayanan p = daftarPaket[i];
            System.out.println((i + 1) + ". " + p.getNamaPaket()
                    + " | Harga Dasar: Rp" + p.getHargaPaket());

            if (p instanceof PaketOutdoor) {
                PaketOutdoor outdoor = (PaketOutdoor) p;
                System.out.println("   (Outdoor, +Transportasi: Rp" + outdoor.getBiayaTransportasi() + ")");
            }
            System.out.println("   Total Estimasi: Rp" + p.hitungTotal());
        }
    }

    //MENU 2 : PESAN SESI
    static void pesanSesi() {
        if (jumlahAntrean >= antrean.length) {
            System.out.println(">> Maaf, antrean pemesanan sudah penuh hari ini!");
            return;
        }

        System.out.println("\n=== FORM PEMESANAN SESI FOTO ===");
        System.out.print("Nama Pelanggan  : ");
        String nama = sc.nextLine();
        System.out.print("No. HP          : ");
        String noHp = sc.nextLine();
        System.out.print("E-mail          : ");
        String email = sc.nextLine();

        lihatPaket();

        int pilihPaket = -1;
        //ERROR HANDLING
        try {
            System.out.print("Pilih nomor paket: ");
            pilihPaket = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(">> Input harus berupa angka! Pemesanan dibatalkan.\n");
            return;
        }

        if (pilihPaket < 1 || pilihPaket > daftarPaket.length) {
            System.out.println(">> Nomor paket tidak valid. Pemesanan dibatalkan.\n");
            return;
        }

        System.out.print("Tanggal Sesi (dd-mm-yyyy): ");
        String tanggal = sc.nextLine();

        Pelanggan pelangganBaru = new Pelanggan(nama, noHp, email);
        PaketLayanan paketTerpilih = daftarPaket[pilihPaket - 1];
        PemesananFoto pesananBaru = new PemesananFoto(pelangganBaru, paketTerpilih, tanggal);

        //ARRAY
        antrean[jumlahAntrean] = pesananBaru;
        jumlahAntrean++;

        System.out.println("\n>> Pemesanan berhasil dibuat!");
        pesananBaru.tampilkanDetail();
    }

   //MENU 3 : TAMPILKAN RIWAYAT
    static void tampilkanRiwayat() {
        System.out.println("\n=== RIWAYAT / ANTREAN PEMESANAN AKTIF ===");
        if (jumlahAntrean == 0) {
            System.out.println("Belum ada pemesanan yang tercatat.");
            return;
        }

        for (int i = 0; i < jumlahAntrean; i++) {
            System.out.println("\nPemesanan ke-" + (i + 1) + ":");
            antrean[i].tampilkanDetail();
        }
    }
}