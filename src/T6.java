//*Your program looks to use a lot of CPU but unless you have fewer cores than there are threads, you may not see any change in output order by setting your thread priorities. If there is a free CPU then even a lower priority thread will be scheduled to run.


class Prior1 extends Thread{
    public Prior1(String name){
        super(name);
    }
    public void run(){
            while(true){
                try {
                    System.out.println(this.getName()+" running!");
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }    
    }
}


public class T6 {
    public static void main(String[] args) {
        Prior1 t1 = new Prior1("CSE");
        t1.setPriority(8);
        Prior1 t2 = new Prior1("HIT");
        t2.setPriority(9);
        Prior1 t3 = new Prior1("Haldia");
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority of "+t1.getName()+" = "+t1.getPriority() );
        System.out.println("Priority of "+t2.getName()+" = "+t2.getPriority() );
        System.out.println("Priority of "+t3.getName()+" = "+t3.getPriority() );
        t1.start();
        t2.start();
        t3.start();
    }
}
