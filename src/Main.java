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

class Persona {
    String name;
    int age;
    Persona(String n, int a){
        this.name = n;
        this.age = a;
    }
    void walk(){
        System.out.println(name+" is walking!");
    }
    //! method overloading or polymorphism
    void walk(int steps){
        System.out.println(name+" is walking "+steps+" steps!");
    }
}

public class Main {
    public static void main(String args[]) {
        Outer out = new Outer();
        out.display();
        System.out.println();
        MyOuter mOut =new MyOuter();
        mOut.meth();
        Persona p1 = new Persona("Vinit",20);
        p1.walk();
        p1.walk(30);
    }
}
