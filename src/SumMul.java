import java.util.Scanner;

class Num {
    int sum(int n1, int n2){
        return n1+n2;
    }
    static int multiply(int n1,int n2){
        return n1*n2;
    }
}
public class SumMul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Num n = new Num();
        System.out.println("Enter 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : "+n.sum(a,b));
        System.out.println("Product : "+Num.multiply(a,b));
        sc.close();
    }
}
