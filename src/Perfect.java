import java.util.*;
public class Perfect {
    public static int sumOfFactors(int n){
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum +=i;
        }
        return sum;
    }
    public static Boolean isPerfect(int n){
        int sumFactor = sumOfFactors(n);
        if(sumFactor==n) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check if it is perfect:");
        int num = sc.nextInt();
        if(isPerfect(num)==true){
            System.out.println("It is a perfect number!");
        }
        else {
            System.out.println("It is not a perfect number!");
        }
        sc.close();
    }
}
