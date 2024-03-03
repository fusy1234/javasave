public class Circle extends Figure{
    int r;
    @Override
    int calculatePerimeter(){
        double area=2*Math.PI*r;
        this.r=r;
        return (int) area;
    }

    public Circle(int r) {
        this.r = r;
    }

    double calculateArea(){
        double area = Math.PI*r*r;
        System.out.println(area);
        this.r=r;
        return area;
    }
}
