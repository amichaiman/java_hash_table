// Test program for the methods in the Timer ADT
import java.io.*;

public class TestTimer {
	public static void main(String args[]) throws Exception {
		Timer checkTimer = new Timer();
		// Timer
		long timeInterval;
		
		
		// Time interval to pause
		// Initialize reader - To read a character at a time
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		// Initialize the tokenizer - To read tokens
		StreamTokenizer tokens = new StreamTokenizer(reader);
		
		
		// Get the time interval.
		System.out.println();
		System.out.print("Time interval to pause ( in milliseconds ) : ");
		tokens.nextToken();
		timeInterval = (long) tokens.nval;
		
		
		// Measure the time interval.
		checkTimer.start();
		Thread.sleep(timeInterval);
		checkTimer.stop();
		// Start the timer
		// Pause for the approximate time interv// Stop the timer
		System.out.println("Measured time interval (ms) : " + checkTimer.elapsedTime());
	}
} // TestTimer
