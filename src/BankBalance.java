abstract class Bank {
    abstract long getBalance();
}
class BankA extends Bank {
    long balance;
    BankA(long bal){
        balance = bal;
    }
    long getBalance(){
        return this.balance;
    }
}
class BankB extends Bank {
    long balance;
    BankB(long bal){
        balance = bal;
    }
    long getBalance(){
        return this.balance;
    }
}
class BankC extends Bank {
    long balance;
    BankC(long bal){
        balance = bal;
    }
    long getBalance(){
        return this.balance;
    }
}
public class BankBalance {
    public static void main(String args[]) {
        BankA A = new BankA(100);
        BankB B = new BankB(150);
        BankC C = new BankC(200);
    
        System.out.println("Balance in BankA ->"+A.getBalance());  
        System.out.println("Balance in BankB ->"+B.getBalance());  
        System.out.println("Balance in BankC ->"+C.getBalance());  
    }
}
