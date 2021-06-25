import java.util.Scanner;

class ArithmeticException extends Exception{
    public String toString(){
        return "Exception Caught : Division by Zero";
    } 
}

public class Arithmetic {
    static void divide(int a, int b) {
        float c = 0;
        try{
            if(b==0){
                throw new ArithmeticException();
            }
            else {
                c = a/b;
                System.out.println("Value = "+c);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values to divide : a/b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        divide(a,b);
        sc.close();
    }
}
