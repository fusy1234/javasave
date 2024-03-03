public class Komputer {
    String nazwaProcesora;
    int iloscRam;
    String nazwaGpu;

    public Komputer(String nazwaProcesora, int iloscRam, String nazwaGpu) {
        this.nazwaProcesora = nazwaProcesora;
        this.iloscRam = iloscRam;
        this.nazwaGpu = nazwaGpu;
    }

    void wypiszParametry(){
        System.out.println(nazwaProcesora);
        System.out.println(iloscRam);
        System.out.println(nazwaGpu);
    }
}
