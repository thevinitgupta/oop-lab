class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int counter = 1;
        while(true){
            System.out.println(counter++);
            try {
                MyThread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class T1 {
    public static void main(String[] args) {
        MyThread t = new MyThread("My_Thread");

        //this stops the execution as soon as the main thread stops
        t.setDaemon(true);
        t.start();
    }
}
