public class Pc extends Komputer{

    String rozmiarObudowy;
    public Pc(String nazwaProcesora, int iloscRam, String nazwaGpu) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
    }

    public Pc(String nazwaProcesora, int iloscRam, String nazwaGpu, String rozmiarObudowy) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.rozmiarObudowy = rozmiarObudowy;
    }

    @Override
    void wypiszParametry() {
        super.wypiszParametry();
        System.out.println(rozmiarObudowy);
    }
}
