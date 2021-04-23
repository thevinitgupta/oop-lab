import java.util.*;
public class Sales {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nominalVal = 10;
        int annDividend = 2000;
        int divPercent = 10;
        int currentShares = (annDividend*100)/(nominalVal*divPercent);
        System.out.println("Current Number of Shares = "+currentShares);
        System.out.println("Required Number of Shares = "+(3000-currentShares));
        sc.close();
    }
}
