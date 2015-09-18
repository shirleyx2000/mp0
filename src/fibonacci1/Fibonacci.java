package fibonacci1;

import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {
	/**
	 * Return the n<sup>th</sup> Fibonacci number. The n<sup>th</sup> Fibonacci
	 * number is defined as follows:<br />
	 * Fibonacci( 0 ) = 0<br />
	 * Fibonacci( 1 ) = 1<br />
	 * Fibonacci( n ) = Fibonacci( n-1 ) + Fibonacci( n-2 ) for n > 1<br />
	 * 
	 * @param n
	 *            n >= 0 (Fibonacci numbers are defined only for non-negative
	 *            integers)
	 * @return the n<sup>th</sup> Fibonacci number
	 */
	public static long getFibonacci(int n) {
		// TODO: Implement this method
	    
	    /* Option 1: Recursion
	    if (n == 0)
	        return 0;
	    else if (n == 1)
	        return 1;
	    else
	        return getFibonacci(n-1) + getFibonacci(n-2);
	}  */
	
	    // Option 2: Iteration
        long current = 0;
        long next = 0;
        long prev = 0;
        int i = 0;
        
	    while (i <= n ) {
	        if ( i == 0 ) {
	            current = 0;
	        }
	        else if (i == 1) {
	            prev = 0;
	            current = 1; 
	        }
	        else {
	            next=current+prev; 
	            prev = current;
	            current = next; 
	        }
	        i++;
    	    }
	    
	    return current; 
		}
	

	/**
	 * This main method prints the first M Fibonacci numbers. It also computes
	 * the time taken to compute each Fibonacci number and prints the time taken
	 * as well.
	 * 
	 * @param args
	 *            This method does not use any arguments
	 */
	public static void main(String[] args) {
		// One should not have to modify this method other than to change the
		// value for M.
	    try 
	    {
	        FileWriter writer = new FileWriter("test3.csv");
	        
    		int M = 60;
    		long fibN; // to hold a Fibonacci number
    		long startTime, endTime; // for timing the execution of the method
    		for (int n = 0; n < M; ++n) {
    			startTime = System.nanoTime();
    			fibN = getFibonacci(n);
    			endTime = System.nanoTime();
    			System.out.println("Fibonacci(" + n + ") is " + fibN + ", and the computation took " + (endTime - startTime)
    					+ " nanoseconds");
    			
                writer.append(String.valueOf(n));
                writer.append(',');
                writer.append(String.valueOf(endTime - startTime));
                writer.append('\n');
                
    			// Note the use of the System.nanoTime() method. Find out more about
    			// this and related methods. These methods are built-in with Java.
    
    			// Ideally, to determine the running time of a method we should take
    			// many samples and then compute the mean and other related
    			// statistics. We are keeping things quite simple and possibly
    			// inaccurate for now.
    
    		}
            writer.flush();
            writer.close();
	    }
	    catch(IOException e) {
	        e.printStackTrace();
	    }
	}

}
