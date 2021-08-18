class Furniture {
    int i;
    public void show(){
        System.out.println(i);
    }
}
class Sofa extends Furniture {
    int j;
    public void addCushion(){
        System.out.println(j);
    }
}


public class T {
    public static void main(String[] args) {
        Sofa obj = new Sofa();
        obj.i = 1;
        obj.j = 2;
        Furniture r ;
        r = obj;
        r.show();
    }
} 
class Zest{ 
    
}
