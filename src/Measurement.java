import java.util.Scanner;
class Shape{
   double length, breadth;
   Shape(double l, double b){ 
      length = l;
      breadth= b;
    }
  Shape(double len){     
     length = breadth = len;
   }
  double calculate(){  
    return length * breadth ;
  }
}
 class Test1 extends Shape{    
   

double height;
Test1(double l,double h)
{
 super(l);
 this.length = l;
 this.height = h;
}
Test1(double l,double b,double h)
{
  super(l,b);
  this.length=l;
  this.breadth=b;
  this.height=h;
}
double calculate()
{
 return length*breadth*height; 
}


}

public class Measurement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides :");                                                            
        double l=sc.nextDouble(); 
        double b=sc.nextDouble(); 	
        double h=sc.nextDouble(); 
        Test1 myshape1 = new Test1(l,h);
        Test1 myshape2 = new Test1(l,b,h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2=myshape2.calculate();
        System.out.println("Area of shape : ");
        
        System.out.println(volume1);
        System.out.println("Volume of shape : ");
        System.out.println(volume2);
        sc.close();
        }
}

