class Con1 extends Thread {
   public void run(){
        while(true){
            try {
                System.out.println("Thread 1 is running!");
                Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
        }
    } 
}

class Con2 extends Thread {
    public void run(){
        while(true){
            try {
                System.out.println("Thread 2 is running!");
                Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
        } 
    } 
 }

public class T4 {
    public static void main(String[] args) {
        Con1 t1 = new Con1();
        Con2 t2 = new Con2();

        t1.start();
        t2.start();
    }
}
