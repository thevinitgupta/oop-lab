import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=5;double A=0.0;
        System.out.println("Enter the sum");
        double P=sc.nextDouble();
        for(int i=1;i<=3;i++) {
            double I=(P*R*1)/100;
            A=P+I;
            if(i==3) {
                break;
            }
            else {
                System.out.println("Interest for year "+i+" Rs "+I);
                P=A;
            }
        }
        System.out.println("Amount after three years = Rs "+A);
        sc.close();
       }
}
