package Practice;

public class Swap_Variable {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp;
		temp = y;
		y = x;
		x = temp;
		System.out.println("Swapping values are x="+x+" y=" +y);
		
		//x = x + y;
		//y = y - x;
		//x = x - y;
		//System.out.println("Swapping values are x="+x+" y=" +y);

	}

}
