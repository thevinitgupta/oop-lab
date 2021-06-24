import java.util.Scanner;

class LowBalance extends Exception{
    public String toString(){
        return "Balance cannot be less than 5000";
    }
}

public class BankBalancer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance :");
        int balance = sc.nextInt();
        try {
            if(balance<5000) {
                throw new LowBalance();
            }
            else {
                System.out.println("Balance : "+balance);
            }
        }
        catch(LowBalance e){
            System.out.println(e);
        }
        finally {
            sc.close();
        }
        
    }
}
