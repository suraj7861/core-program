package Practice;
import java.util.Scanner;
public class Largest_Num {

	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        int max = 0;
        //use ternary operator to find max 
        max = (num1 > num2) ? num1 : num2;
        
        max = (max > num3) ? max : num3;
        
        System.out.println("Largest number among "+ num1 +","+ num2+"," +num3 +" is: "+ max);
	}

}
