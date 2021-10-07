package practice;
import java.util.Scanner;
public class AlphabetVowelOrConsonant {

	public static void main(String[] args) {
				//use scanner to get user inputs
				Scanner sc= new Scanner(System.in);
				
				System.out.println("Enter Alphabet to check Vowel or Constant: ");  
				 char alpha = sc.next().charAt(0);
				//if condition to check alpha is vowel or consonant
				if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
				  alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
					
					System.out.println(alpha+" is a vowel ");
					}
				else {
					System.out.println(alpha+" is a constant ");
					}			
			}
		}

