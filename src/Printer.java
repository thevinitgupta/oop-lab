public class Printer{

	long fact(int num){
		long factVal=1;
		for (long i=1;i<=num ;i++ ) {
			factVal*=i;
		}
		return factVal;
	}

	void sumSeries1(int x, int n){
		double sum=0.0d;
		for(int i=1;i<=n;i++){
			sum+=x/fact(i);
		}
		System.out.println("Sum of Series is "+sum);
	}

	void sumSeries2(int x, int n){
		double sum=0.0d;
		for(int i=1;i<=n;i++){
			sum+=Math.pow(x,i)/fact(i+1);
		}
		System.out.println("Sum of Series is "+sum);
	}

	void sumSeries3(int x, int n){
		double sum=0.0d;
		for(int i=1;i<=n;i++){
			sum+=(Math.pow(-1,i+1)*(Math.pow(x,i)/fact(i+1)));
		}
		System.out.println("Sum of Series is "+sum);
	}

	public static void main (String args[]){
		Printer obj=new Printer();

		obj.sumSeries1(3,5);
		obj.sumSeries2(10,5);
		obj.sumSeries3(7,7);
	}
}