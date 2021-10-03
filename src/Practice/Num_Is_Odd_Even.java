package Practice;
import java.util.Scanner;
public class Num_Is_Odd_Even {
	public static void main(String[] args) {
		
		int num;
		//get user input
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//check num is even or odd
		if( (num % 2) == 0 ) {
			System.out.println(num+": The number is Even");
		}
		else {
			System.out.println(num+": The number is Odd");	
		}
	}

}
