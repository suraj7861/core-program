package practice;

public class PercentageOfHeadTail {

	public static void main(String[] args) {
		//To command-line argument
		int numberOfFlip = Integer.parseInt(args[0]);
		int totalFlip = numberOfFlip;
		//check number is greater than 0
		if(numberOfFlip <= 0) {
			System.out.println("The value of number of flip should be greater than 0");
			return;
		}
		int headCounter = 0;
		int tailCounter = 0;
		
		while(totalFlip > 0) {
			//get random values
			double flipVal = Math.random();
			if(flipVal < 0.5) {
				tailCounter ++;
			}
			else {
					headCounter ++;
				}
				totalFlip --;
			}
		    
			System.out.println("Head counter: " + headCounter);
		    System.out.println("tail counter: " + tailCounter);
		    
		    System.out.println("number Of Flip: " + numberOfFlip );
		    //calculate percentage of head and tail
			double headPercentage = (headCounter * 1.0 / numberOfFlip) * 100 ;
			double tailPercentage = (tailCounter * 1.0 / numberOfFlip) * 100 ;
			
			System.out.println("Head Percentage: " + headPercentage);
			System.out.println("Tail Percentage: " + tailPercentage);
		}

	}


