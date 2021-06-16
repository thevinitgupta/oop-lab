import java.util.Scanner;

class NumberVal {
    static Boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int dig = n%10;
            rev = rev*10 + dig;
            n=n/10;
        }
        return rev;
    }
}
public class TwistedPrime { 
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rev = NumberVal.reverse(num);
        if(NumberVal.isPrime(num) && NumberVal.isPrime(rev)){
            System.out.println(num+" is a Twisted Prime Number");
        }
        else {
            System.out.println(num+" is not a Twisted Prime Number");
        }
        sc.close();
}
}
