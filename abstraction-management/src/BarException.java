

public class BarException {
          public static void main(String args[]) {
        	  System.out.println("main method started");
        	  divide(1,0);
        	  System.out.println("main method ended");
        	   
                }
          
          
              public static void divide(int i,int j) {
        	  
        	  System.out.println("divide method started");
        	  
        	  try {
        		  System.out.println(i/j); 
        		  
        	  }catch(ArithmeticException e) {
        		  System.out.println("cannot divide the number by zero");
        	  }
        	  
        
        	  System.out.println("divide method ended");
        	  
        
          }
          
          
}
