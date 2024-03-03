public class Square extends Figure{
    int a;
@Override
    int calculatePerimeter(){
       int area = a*4;
        this.a=a;
        return area;



    }

    public Square(int a) {
        this.a = a;
    }

    @Override
    double calculateArea(){
        this.a=a;
        int area = a*a;
        return area;

    }
}
