package Practice;
import java.util.Scanner;
public class Harmonic_Number {

	public static void main(String[] args) {
		int n;
		//taking user input
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0) {
			System.out.println("Enter number greater than 0");
		}
		double sum = 0.0;
		
		for(int i = 1; i <= n; i++) {
			
			sum = sum +(double)(1/i);
			System.out.println("sum="+ sum);
		}
		System.out.println("nth harmonic value is: "+sum);
	}

}
