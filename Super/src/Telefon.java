public class Telefon extends Komputer{
    String marka;
    public Telefon(String nazwaProcesora, int iloscRam, String nazwaGpu) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
    }

    public Telefon(String nazwaProcesora, int iloscRam, String nazwaGpu, String marka) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.marka = marka;
    }

    @Override
    void wypiszParametry() {
        super.wypiszParametry();
        System.out.println(marka);
    }
}
