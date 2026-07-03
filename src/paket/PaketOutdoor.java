package paket;

//INHERITANCE
public class PaketOutdoor extends PaketLayanan {
    private double biayaTransportasi;

    //CONSTRUCTOR
    public PaketOutdoor(String namaPaket, double hargaPaket, double biayaTransportasi) {
        super(namaPaket, hargaPaket);
        this.biayaTransportasi = biayaTransportasi;
    }

    //ACCESSOR
    public double getBiayaTransportasi() {
        return biayaTransportasi;
    }

    //MUTATOR
    public void setBiayaTransportasi(double biayaTransportasi) {
        this.biayaTransportasi = biayaTransportasi;
    }

    //POLYMORPHISME
    @Override
    public double hitungTotal() {
        return getHargaPaket() + biayaTransportasi;
    }
}