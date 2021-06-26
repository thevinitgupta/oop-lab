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
                    break;
                case 1 :
                    String s = null;
                    System.out.println(s.charAt(val));
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