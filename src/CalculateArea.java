abstract class Shaper{
    abstract double RectangleArea(double l,double b);
    abstract double SquareArea(double s);
    abstract double CircleArea(double r);
}

class Area extends Shaper{
    double RectangleArea(double l,double b){
        double area = l*b;
        return area;
    }
    double SquareArea(double s){
        double area =s*s;
        return area;
    }
    double CircleArea(double r){
        double area =3.14*r*r;
        return area;
    }
}
public class CalculateArea {
    public static void main(String args[]) {
        Area ar = new Area();
        System.out.println("Area of Rectangle -> "+ar.RectangleArea(5, 3));
        System.out.println("Area of Square -> "+ar.SquareArea(5));
        System.out.println("Area of Circle -> "+ar.CircleArea(3));
    }
}
