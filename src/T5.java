class Con3 extends Thread{
    public Con3(String name){
        super(name);
    }
    public void run(){
        int count=1;
        while(true){
            try {
                System.out.println("Thread 1 :"+count++);
            }
            catch(Exception e){
                
            }
           
        }
    }
}


class Con4 extends Thread{
    public Con4(String name){
        super(name);
    }
    public void run(){
        int count=1;
        while(true){
            try {
                System.out.println("Thread 2 :"+count++);
            }
            catch(Exception e){
                
            }
           
        }
    }
}

public class T5 {
    public static void main(String[] args) {
       Con3 t1 = new Con3("First Thread!");
       t1.start();
       Con4 t2 = new Con4("Second Thread!");
       
       try {
            t1.join(1000);
       }
       catch(InterruptedException e){

       }

       t2.start();
       int count=1;
       
       while(true){
        try {
            System.out.println("Main Thread :"+count++);
            System.out.println("Thread 1 is alive : "+t1.isAlive());
            System.out.println("Thread 2 is alive : "+t2.isAlive());
            Thread.yield();
        }
        catch(Exception e){    
        }
    }
       
    }
}
