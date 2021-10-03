package Practice;

public class Power_Of_2 {

	public static void main(String[] args) {
		 //command-line argument 
		  int n = Integer.parseInt(args[0]);
	      int pow = 2;
	      
	      for(int i=0; i <= n; i++) {
	    	  if(i == 0) {
	    		System.out.println("power of 2^"+i+"="+ 1);  
	    	  }
	    	  else {
	    		  pow = pow * 2;
	    		  System.out.println("power of 2^"+i+"= " +pow);
	    	  }
	      }
	}

}
