import java.util.Calendar;
public class Date {
    public static void main(String args[]) {
        Calendar today = Calendar.getInstance();
        System.out.println("Current Year :"+today.get(Calendar.YEAR));
        System.out.println("Current Month :"+today.get(Calendar.MONTH));
    }
}
