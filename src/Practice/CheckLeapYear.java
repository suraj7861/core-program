package practice;
import java.util.Scanner;
public class CheckLeapYear {
	public static void main(String[] args) {
		  
		  int year;
	      System.out.println("Enter an Year : ");
          // use Scanner Class to take input From User
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
          // use if statement to check condition
	      if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	      System.out.println(year +": Year is leap year");
	      }
	      else {
	    	  System.out.println(year +": Year is not leap year");
	      }
	}
}
