
import java.io.*;
public class Magic
{
    int sum(int n)
    {
        int s=0;
        while(n!=0)
        {
          s=s+(n%10);
          n=n/10;
        }
        return s;
    }
    boolean check(int n)
    {
        while(n>9)
        {
            n=sum(n);
        }
        if(n==1)
        return true;
        else
        return false;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.");
        int n=Integer.parseInt(br.readLine());
        Magic magic=new Magic();
        if(magic.check(n)==true)
        System.out.println(n+" is a Magic no.");
        else 
        System.out.println(n+" is not a Magic no.");
    }
}

