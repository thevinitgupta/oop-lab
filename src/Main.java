abstract class My {
    abstract void myDisplay();
}

class MyOuter {
    void meth(){

        //here we are not creating an object of My class as it is an abstract class. We are just creating a class to over ride the myDisplay abstract method. This is an anonymous class
        My m = new My(){
            void myDisplay(){
                System.out.println("Anonymous Inner Class...");
            }
        };
        m.myDisplay();
    }
}

class Outer {
    void display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Local Inner class...");
            }
        }
        Inner in = new Inner();
        in.innerDisplay();
    }
}

public class Main {
    public static void main(String args[]) {
        Outer out = new Outer();
        out.display();
        System.out.println();
        MyOuter mOut =new MyOuter();
        mOut.meth();
    }
}
