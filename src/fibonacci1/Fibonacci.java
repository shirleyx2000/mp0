package fibonacci1;

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
		return -1; // This is a dummy return value. You will have to change
					// this.
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

		int M = 60;
		long fibN; // to hold a Fibonacci number
		long startTime, endTime; // for timing the execution of the method
		for (int n = 0; n < M; ++n) {
			startTime = System.nanoTime();
			fibN = getFibonacci(n);
			endTime = System.nanoTime();
			System.out.println("Fibonacci(" + n + ") is " + fibN + ", and the computation took " + (endTime - startTime)
					+ " nanoseconds");

			// Note the use of the System.nanoTime() method. Find out more about
			// this and related methods. These methods are built-in with Java.

			// Ideally, to determine the running time of a method we should take
			// many samples and then compute the mean and other related
			// statistics. We are keeping things quite simple and possibly
			// inaccurate for now.

		}
	}

}
