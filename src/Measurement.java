class Shape{
    double length = 0.0d,breadth = 0.0d;
    Shape(double l,double b){
        length = l;
        breadth = b;
    }
    Shape(double s){
        length = s;
        breadth = s;
    }
    double calculate(){
        return length*breadth;
    }
}
class Test1 extends Shape{
    double height;
    Test1(double l, double b, double h){
        super(l,b);
        height = h;
    }
    Test1(double l, double h){
        super(l);
        height = h;
    }
    double calculate(){
        double area = super.calculate();
        return area*height;
    }
}
public class Measurement {
    public static void main(String args[]) {
        Shape square = new Shape(5);
        Shape rectangle = new Shape(4,5);
        Test1 cube = new Test1(5,5);   
        Test1 cuboid = new Test1(4,5,5);
        System.out.println("Area of square : "+square.calculate());   
        System.out.println("Area of rectangle : "+rectangle.calculate());   
        System.out.println("Volume of cube : "+cube.calculate());   
        System.out.println("Volume of cuboid : "+cuboid.calculate());   
    }
}
