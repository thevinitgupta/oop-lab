import java.io.*;
import java.util.Scanner;
public class Construct
{
    //Data member
    int a,b;
    Construct(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int sum()
    {
     return a+b;
    }
    void display()
    {
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
    }
    public static void max(Construct a,Construct b)
    {
       int max=a.sum()> b.sum() ? a.sum() : b.sum();
       System.out.println("Maximum  Sum is :"+max);
    }
    public static void main(String args[])throws IOException
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st coordinates:\n");
        x=sc.nextInt();
        y=sc.nextInt();
        Construct a= new Construct(x,y);
        System.out.println("Enter the 2nd coordinates:\n");
        x=sc.nextInt();
        y=sc.nextInt();
        Construct b=new Construct(x,y);
        max(a,b);
        sc.close();
    }
}
