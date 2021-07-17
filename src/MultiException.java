import java.util.Scanner;

public class MultiException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 1000,val = 0;
        System.out.println("Enter a value :");
        val = sc.nextInt();
        sc.close();
        float res = 0;
        try {
            switch (val) {
                case 0:
                    res = n/val;
                    System.out.println("result = "+res);
                    break;
                case 1 :
                    String str = null;
                    System.out.println(str.charAt(1));
                default:
                    System.out.println("No Exception!");
                    break;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   
}