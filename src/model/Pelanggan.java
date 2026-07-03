package model;

public class Pelanggan {
    //ENCAPSULATION & ATRIBUT
    private String nama;
    private String noHp;
    private String email;

    //CONSTRUCTOR
    public Pelanggan(String nama, String noHp, String email) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
    }

    //ACCESSOR
    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }

    //MUTATOR
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}