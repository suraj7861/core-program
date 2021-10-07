package practice;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		  int divider, divisor;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter an number for divider : ");
	      divider = sc.nextInt();
	      System.out.println("Enter an number for divider : ");
	      divisor = sc.nextInt();
	      int result = 0;
	      int quotient, Rem;
	      result = (divider / divisor);
	      quotient = result;
	      System.out.println("quotient is: "+quotient );
	      result = divider % divisor;
	      Rem = result;
	      System.out.println("quotient is: "+Rem );

	}

}
