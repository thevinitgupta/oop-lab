import java.util.*;
public class Discounts {
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the printed price of the camera");
	  double p=sc.nextDouble();
	System.out.println("Price left after 10% discount on the printed price of the camera");
    double d=((10*p)/100);
    double dis=p-d;
    System.out.println(dis);
    System.out.println("Price left after 6% GST on the remaining amount");
    double g=((6*dis)/100);
    double gst=dis-g;
    System.out.println(gst);
    System.out.println("The amount to be paid by the customer is:-");
    System.out.println(gst);
    sc.close();
	}
}
