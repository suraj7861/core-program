package Practice;

import java.util.Scanner;

public class Prime_Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i <= n/2; i++) {
			while((n % i) == 0 ) {
				System.out.println(i);
				n = n / i;
			}
		}

	}

}
