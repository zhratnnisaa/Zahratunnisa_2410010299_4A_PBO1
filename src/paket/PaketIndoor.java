package paket;

//INHERITANCE
public class PaketIndoor extends PaketLayanan {

    //CONSTRUCTOR
    public PaketIndoor(String namaPaket, double hargaPaket) {
        super(namaPaket, hargaPaket);
    }

    //POLYMORPHISME
    @Override
    public double hitungTotal() {
        return getHargaPaket();
    }
}