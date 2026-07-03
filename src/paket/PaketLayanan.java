package paket;

public abstract class PaketLayanan {
    //ENCAPSULATION
    private String namaPaket;
    private double hargaPaket;

    //CONSTRUCTOR
    public PaketLayanan(String namaPaket, double hargaPaket) {
        this.namaPaket = namaPaket;
        this.hargaPaket = hargaPaket;
    }

    //ACCESSOR
    public String getNamaPaket() {
        return namaPaket;
    }

    public double getHargaPaket() {
        return hargaPaket;
    }

    //MUTATOR
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    //POLYMORPHISME
    public abstract double hitungTotal();
}