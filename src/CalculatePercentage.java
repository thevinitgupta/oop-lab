abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks{
    double total = 0.0d;
    A(double m1,double m2,double m3){
        total = m1+m2+m3;
    }
    double getPercentage(){
        double per = total/3 ;
         return per;
    }
}
class B extends Marks{
    double total = 0.0d;
    B(double m1,double m2,double m3,double m4){
        total = m1+m2+m3+m4;
    }
    double getPercentage(){
        double per = total/4;
         return per;
    }
}
public class CalculatePercentage {
    public static void main(String args[]) {
        A marksA = new A(56,72,42);
        B marksB = new B(90,82,60,78);

        System.out.println("Percentage of Marks A gets -> "+ marksA.getPercentage());
        System.out.println("Percentage of Marks A gets -> "+marksB.getPercentage());
    }   
}
