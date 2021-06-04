import java.util.Scanner;

class Values {
    int a, b;
    Values(int a , int b){
        this.a = a;
        this.b = b;
    }
}
public class Swap {
    static Values swapper(Values v){
        int temp = v.a;
        v.a = v.b;
        v.b = temp;
        return v;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two numbers to swap: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        Values val = new Values(n1,n2);
        System.out.println("Before swapping : a -> "+val.a + " and b -> "+val.b);
        val = swapper(val);
        System.out.println("After swapping : a -> "+val.a + " and b -> "+val.b);
        sc.close();
    }
}
