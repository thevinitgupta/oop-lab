class Calc {
    int findGCD(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a<0 || b<0) return -1;
        int c = a>b ? a%b : b%a;
        if(a>b){
            return findGCD(b,c);
        } 
        else {
            return findGCD(a,c);
        }
        
    }
}
public class GCD {
    public static void main(String args[]) {
        Calc cal = new Calc();
        System.out.println(cal.findGCD(0, 2));
        System.out.println(cal.findGCD(-1,-1));
        System.out.println(cal.findGCD(40,60));
        System.out.println(cal.findGCD(3,-1));
    }
}
