package practice;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i <= n/2; i++) {
			while((n % i) == 0 ) {
				System.out.println("prime factors are :");
				System.out.println(i+" ");
				n = n / i;
			}
		}

	}

}
