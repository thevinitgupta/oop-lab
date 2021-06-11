
interface First {
    default void show(){
        System.out.println("Default implementation of First Interface\n");
    }
}
interface Second {
    default void show(){
        System.out.println("Default implementation of Second Interface\n");  
    }
}

class Imp implements First,Second {
    public void show(){
        First.super.show();
        Second.super.show();
    }
}

public class Lab5Q1 {
    
    public static void main(String args[]) {
        Imp imp = new Imp();
        imp.show();
    }
}
