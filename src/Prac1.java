public class Prac1 {
    void compute(int a,char option){
        if(option == 's'){
            System.out.println("Square = "+a*a);
        }
        else {
            System.out.println("Cube = "+a*a*a);
        }
    }
    void compute(double a,char option){
        if(option == 'v'){
            System.out.println("Volume of cube = "+a*a*a);
        }
        else {
            System.out.println("Diagonal of cube = "+Math.sqrt(3)*a);
        }
    }
    void compute(int a,int b,char option){
        if(option=='a'){
            System.out.println("Area of Rectangle = "+a*b);
        }
        else {
            System.out.println();
        }
    }
}
