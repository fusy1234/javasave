public class Triangle extends Figure{
    int a,b,c;
    @Override
    int calculatePerimeter(){
        double area = a+b+c;

        this.a=a;
        this.b=b;
        this.c=c;
        return (int) area;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea(){
        double p = (a+b+c)/2;
        double area = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));

        this.a=a;
        this.b=b;
        this.c=c;
        return area;
    }
}
