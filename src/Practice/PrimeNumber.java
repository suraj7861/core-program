package Practice;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		
		if((num == 0) || (num == 1)) {
			System.out.println(num+" :Number is not a prime number");
		}
		else {
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				System.out.println(num+" :Number is not a prime number");
				flag = 1;
				break;
			}
		  }
		}// end of if else
		if(flag == 0) {
			System.out.println(num+" :Number is a prime number");
		}// end if
		
	}

	}
