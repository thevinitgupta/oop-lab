public class vaibhav {
    public static void main(String[] args) {
        System.out.println(Solution.multiply("123","456"));
        System.out.println(Solution.multiply("4","6"));
        System.out.println(Solution.multiply("123456789","987654321"));
    }
}

class Solution {
    public static String mlty(String num,String c){

    int carry =0;
    int k=0;
    String s="";
    int n=Integer.parseInt(c);

    for (int i=num.length()-1;i>=0 ;i-- ) {
        k=Integer.parseInt(num.charAt(i)+"")*n+carry;
        s=k%10+s;
        carry=k/10;
    }
    if(carry !=0)
    return (carry+s);

    return s;
}
public static String addd(String s,String t){

    String neww="";
    int ns=s.length(),nt=t.length();

    for (int i=0;i< ns-nt;i++)
        t="0"+t;

    int carry=0;
    for (int i=ns-1 ; i>=0 ; i-- ) {
        
        int r=carry+(Integer.parseInt(s.charAt(i)+""))+(Integer.parseInt(t.charAt(i)+""));
        neww=r%10+neww;
        carry=r/10;

    }

    if(carry!=0)
        return carry+neww;
    return neww;
}
public static String multiply(String num1, String num2) {
    String big=num1,small=num2;

    if(num1.length()!=num2.length()){
    big = num1.length()>num2.length()?num1:num2;
    small=num1.length()<num2.length()?num1:num2;
    }


    int nb=big.length();
    int ns=small.length();

    String s[]=new String[ns];
    int carry =0;

    for(int i=ns-1;i>=0;i--){

        String h=(small.charAt(i)+"");

        for(int m=i;m<ns-1;m++)
            h=h+"0";

        s[i]=mlty(big,h);//****************
       // System.out.println(h+"-"+s[i]);
    }
    

    //SUMING ARRAY

    String bg="",sml="";

    String sum="0";
    for (int i=0 ;i<ns ;i++ ) {
        bg=s[i];sml=sum;

        if(sum.length() != s[i].length() ){
    
            bg=  sum.length()>s[i].length()?sum:s[i];
            sml=sum.length()<s[i].length()?sum:s[i];
           // System.out.println("big - "+bg+" --- "+"small - "+sml);
    
        }
    
        sum=addd(bg,sml);
    
    }
    int i;
    int nn=sum.length();
    
    for (i=0;i<nn-1 ;i++ ) {
        if(sum.charAt(i)!='0')
            break;
        
    }

    return sum.substring(i);
    }
}
