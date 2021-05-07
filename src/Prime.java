import java.util.*;
public class Prime {
    public static int isPrime(int num){
        int i=1;
        for(i=2;i<=(num/2);i++){
            if(num%i==0) return 0;
        }
        return 1;
    }
    public static int sumOfPrimeDigits(int num){
        int sum =0;
        while(num>0){
            int dig = num%10;
            if(isPrime(num)==1) {
                sum = sum+dig;
            }
            num = num/10;
        }
        return sum;
    }
    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers to check:");
        for(int i=0;i<10;i++){
            int a= sc.nextInt();
            int sum = sumOfPrimeDigits(a);
            if(isPrime(sum)==1 && isPrime(a)==1){
                System.out.println("Both number and Sum of Prime Digits are Prime!");
            }
            else {
                System.out.println("Sum of Prime Digits is not Prime!");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        check();
    }
}
