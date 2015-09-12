package fibonacci2;
//import fibonacci1.Fibonacci.java

import java.util.Scanner;

public class CheckFib {

	/**
	 * Given an integer n, determine if it is a Fibonacci number or not.
	 * 
	 * @param n
	 *            the number to test for being a Fibonacci number or not.
	 * @return true if n is a Fibonacci number otherwise return false.
	 */
	public static boolean isFib( long n ) {
		// TODO: Implement this method
	    //base condition
	    long current, prev, next; 
	    current = prev = next = 0;
	    int i = 0; 
	    while (true) {
	        // Already passed the number
    	    if (current > n)
    	        return false;
    	    // Found the number
    	    else if (current == n)
    	        return true; 
    	    // Have yet to find the number
    	    else
    	        if ( i == 0 )
	                current = 0;
	            else if (i == 1) {
	                prev = 0;
	                current = 1; 
	            }
	            else
	                next=current+prev; 
	                prev = current;
	                current = next; 
	            i++; 
	    }
	}
	
	

	/**
	 * This main method asks a user to input an integer and then returns the
	 * result after checking if the input is a Fibonacci number or not.
	 * 
	 * @param args
	 *            This method does not need any arguments
	 */
	public static void main(String[] args) {

		// Notice how we read an integer in Java. This is one of many ways to
		// read an integer. The syntax can be elaborate. Soldier on!
		System.out.print("Enter an integer: ");
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		// Now that we have n, let us test it.
		if ( isFib( n ) )
			System.out.println(n+" is a Fibonacci number!");
		else
			System.out.println(n+" is not a Fibonacci number :-(");
        
	}

}
