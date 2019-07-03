package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(12));
		System.out.println(sum(12));
		int [] numbers = {12,1,3,4};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println(findAvg(numbers));
	}
	
	public static int fibo(int n){
		if(n==0 || n==1){
			return 1;
		}
		return (fibo(n-1)+fibo(n-2));
	}
	
	public static int sum(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum +=i;
		}
		return sum;
	}
	
	public static int findMin(int [] arr)
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int [] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findAvg(int [] arr){
		int sum = 0;
		for(int n=0; n<arr.length; n++){
			sum +=arr[n]; 
		}
		return sum/arr.length;
	}

}
