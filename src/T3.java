class Thread3 implements Runnable {
    public void run(){
        System.out.println("Thread created by implementing the Runnable Class!\n\n");
    }
}

public class T3 {
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        Thread t1 = new Thread(t);
        System.out.println("Custome Thread ->  :\n");
        t1.start();
    }
}
