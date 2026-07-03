package model;

import paket.PaketLayanan;

public class PemesananFoto {
    //ENCAPSULATION & ATRIBUT
    private Pelanggan pelanggan;
    private PaketLayanan paketDipilih;
    private String tanggalSesi;

    //CONSTRUCTOR
    public PemesananFoto(Pelanggan pelanggan, PaketLayanan paketDipilih, String tanggalSesi) {
        this.pelanggan = pelanggan;
        this.paketDipilih = paketDipilih;
        this.tanggalSesi = tanggalSesi;
    }

    //ACCESSOR
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public PaketLayanan getPaketDipilih() {
        return paketDipilih;
    }

    public String getTanggalSesi() {
        return tanggalSesi;
    }

    //MUTATOR
    public void setPaketDipilih(PaketLayanan paketDipilih) {
        this.paketDipilih = paketDipilih;
    }

    public void setTanggalSesi(String tanggalSesi) {
        this.tanggalSesi = tanggalSesi;
    }

    //MENAMPILKAN INFO
    public void tampilkanDetail() {
        System.out.println("Nama Pelanggan   : " + pelanggan.getNama());
        System.out.println("No. HP           : " + pelanggan.getNoHp());
        System.out.println("E-mail           : "+ pelanggan.getEmail());
        System.out.println("Paket Dipilih    : " + paketDipilih.getNamaPaket());
        System.out.println("Tanggal Sesi     : " + tanggalSesi);
        System.out.println("Total Biaya      : Rp" + paketDipilih.hitungTotal());
    }
}