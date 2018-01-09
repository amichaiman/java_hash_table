package lab9;

public class Timer 
{
	// Data members
	private long startTime, // Time that the timer was started
	 stopTime; // Time that the timer was stopped
	
	
	
	// Start and stop the timer
	//Precondition: None.
	//Postcondition: Marks the beginning of a time interval (starts the timer).
	public void start ( )
	{ 
		startTime = System.currentTimeMillis();
	}
	
	
	
	
	//Precondition: The beginning of a time interval has been marked.
	//Postcondition: Marks the end of a time interval (stops the timer).
	public void stop ( )
	{ 
		stopTime = System.currentTimeMillis();
	}
	
	
	
	
	// Compute the elapsed time (in milliseconds)
	//Precondition: The beginning and end of a time interval have been marked.
	//Postcondition: Returns the length of the time interval in milliseconds.
	public long elapsedTime ( )
	{
		return stopTime - startTime; 
	}
} // class Timer