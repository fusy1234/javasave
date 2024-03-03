public class Laptop extends Komputer{
    boolean czyMaWbudowanaKamerke;
    public Laptop(String nazwaProcesora, int iloscRam, String nazwaGpu) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
    }

    public Laptop(String nazwaProcesora, int iloscRam, String nazwaGpu, boolean czyMaWbudowanaKamerke) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.czyMaWbudowanaKamerke = czyMaWbudowanaKamerke;
    }

    @Override
    void wypiszParametry() {
        super.wypiszParametry();
        System.out.println(czyMaWbudowanaKamerke);
    }
}
