import java.util.*;
class TimePeriod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length you want to use in order to calculate the time period:-");
		double l=sc.nextDouble();
		System.out.println("Enter the acceleration you want to use in order to calculate the time period:-");
	    double g=sc.nextDouble();
		double tp=2*3.14159*Math.sqrt(l/g);
		System.out.println("The time period of a Simple Pendulum is "+tp);
		sc.close();
    }
}
