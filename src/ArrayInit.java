import java.util.Scanner;

public class ArrayInit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n],sum =0;
        System.out.println("Enter array elements : ");
        try {
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Total : "+sum);
        }
        catch(Exception e){
            System.out.println("You entered bad data!");
        }
        sc.close();
    }
}
