class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int counter = 1;
        while(true){
            System.out.println("My Thread : "+counter++);
        }
    }
}

public class T1 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My_Thread");

        //this stops the execution as soon as the main thread stops
        t.start();
        int counter = 1;
        while(true){
            System.out.println("Main : "+counter++);
            Thread.yield();
        }
    }
}
