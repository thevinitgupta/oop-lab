interface Number {
    int findSqr(int n);
}

class Abc implements Number {
    public int findSqr(int n){
        return n*n;
    }
}
public class Square {
    public static void main(String args[]) {
        Abc num = new Abc();
        int sq1 = num.findSqr(-3);
        int sq2 = num.findSqr(10);
        System.out.println("Square of -3 = "+sq1);
        System.out.println("Square of 10 = "+sq2);
    }
}
