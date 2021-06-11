
public class Date {
    public static void main(String args[]) {
        java.util.Calendar today = java.util.Calendar.getInstance();
        int month = today.get(java.util.Calendar.MONTH);
        System.out.println("Current Year :"+today.get(java.util.Calendar.YEAR));
        System.out.println("Current Month :"+ (month+1));
    }
}
