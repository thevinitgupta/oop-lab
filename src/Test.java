//*java documentation -> https://docs.oracle.com/cd/A87860_01/doc/appdev.817/a77069/index.htm
public class Test {
    static int start = 2;
    final int end;
    public Test(int x){
        x = 4;
        end = x;
    }
    public void fly(int distace){
        System.out.print(end-start+" ");
        System.out.println(distace);
    }
    public static void main(String args[]){
       MyDLL m = new MyDLL();
        m.add(5);
        m.print();
        m.add(6);
        m.print();
        m.add(12);
        m.print();
        m.add(8);
        m.print();
        m.add(0);
        m.print();
    }
}
