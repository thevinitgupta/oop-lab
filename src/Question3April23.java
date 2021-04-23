import java.util.*;
public class Question3April23 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of the article");
		double price=sc.nextDouble();
       System.out.println("Discount offered by the first shopkeeper(30% of Rs "+price+") is Rs "+(30*price)/100);
       double a=(20*price)/100;
       double c=price-a;
       double d=(10*c)/100;
       double e=a+d;
       System.out.println("Successive discount offered by the second shopkeeper(20% and 10% respectively of Rs "+price+") is Rs "+e);
       sc.close();
	}
}
