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
        System.out.println("GCD of 0 and 2 is "+cal.findGCD(0, 2)+"\n");
        System.out.println("GCD of -1 and -1 is "+cal.findGCD(-1,-1)+"\n");
        System.out.println("GCD of 40 and 60 is "+cal.findGCD(40,60)+"\n");
        System.out.println("GCD of -3 and -1 is "+cal.findGCD(-3,-1)+"\n");
    }
}
