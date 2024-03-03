public class Main {
    public static void main(String[] args) {

        Komputer komputer = new Komputer("Intel i7-13900K", 32, "RTX-3090");
        Pc pc = new Pc("Intel i3-13900K", 16, "RTX 3060", "Midi Tower");
        Telefon telefon = new Telefon("A17 Pro", 8, "A17 Pro", "IPhone");
        Laptop laptop = new Laptop("i9-13950HX", 64, "RTX 5000 Ada", false);

        komputer.wypiszParametry();
        System.out.println();

        pc.wypiszParametry();
        System.out.println();

        telefon.wypiszParametry();
        System.out.println();

        laptop.wypiszParametry();
        System.out.println();

    }
}