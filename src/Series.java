public class Series {
    double x =0.0d;
    int n=0;
    Series(double x1,int n1){
        x= x1;
        n = n1;
    }
    void printSum(){
        int i=1; 
        double term = 0.0d,sum = 0.0d;
        for(i=1;i<=n;i++){
            term = (Math.pow(x,i))/factorial(i+1);
            if(i%2==0){
                sum -= term; 
            }
            else {
                sum += term;
            }
        }
        System.out.println("Sum of series = "+sum);
    }
    int factorial(int num){
        int i=1,fact=1;
        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]) {
        Series series1 = new Series(2,5);
        series1.printSum();
    }
}
