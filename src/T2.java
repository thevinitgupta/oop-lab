class Thread2 extends Thread {
    public Thread2(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread created by extending the Thread Class!\n\n");
    }
}

public class T2  {
    public static void main(String[] args) {
        Thread2 t = new Thread2("My Thread");
        System.out.println("Custome Thread -> "+t.getName()+" :\n");
        t.start();
    }
}
