package day7;

public class SumElementInArray {

	public static void main(String[] args) {
		int sum =0;
		int [] a = {1,2,3,4,5};
		for (int i=0;i < a.length; i++) {
			sum = sum +a[i];
			
		}
		System.out.println("Sum of numbers in an array ="+ sum);
	}
	

}
