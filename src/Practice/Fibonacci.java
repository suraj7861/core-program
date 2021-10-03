package Practice;

public class Fibonacci {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		int n = 9;
		
		System.out.print(" "+num1+" "+num2);
		
		for(int i =2; i < n; i++) {
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
			
		}
		
		

	}

}
