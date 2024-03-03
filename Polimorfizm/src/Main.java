
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Podaj bok kwadratu");
        int a=inp.nextInt();
        Figure kwadrat = new Square(a);
        System.out.println("Obwód : "+kwadrat.calculatePerimeter());
        System.out.println("Pole : "+ kwadrat.calculateArea());

        System.out.println("Podaj podstawę trójkąta");

        int p = inp.nextInt();
        System.out.println("Podaj pierwszy bok trójkąta");
        int h = inp.nextInt();
        System.out.println("Podaj drugi bok trójkąta");
        int c = inp.nextInt();
        Figure trojkat = new Triangle(p,h,c);
        System.out.println("Obwód : "+trojkat.calculatePerimeter());

        System.out.println("Pole : "+trojkat.calculateArea());


        System.out.println("podaj promień okręgu");
        int r = inp.nextInt();
        Figure kolo = new Circle(r);
        System.out.println("Obwód : "+kolo.calculatePerimeter());

        System.out.println("Pole : "+kolo.calculateArea());
        System.out.println("------------------------------------------");
        Figure[] zbiorMoichFigur = new Figure[3];

        zbiorMoichFigur[0] = kwadrat;
        zbiorMoichFigur[1] = trojkat;
        zbiorMoichFigur[2] = kolo;

        for(Figure figure : zbiorMoichFigur){
            System.out.println(figure.calculatePerimeter());
        }
        inp.close();



    }
}