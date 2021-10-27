package sample;

import java.time.LocalTime;

public class TimeObject {
	
	Long time;
	Long timeLimit;
	
	public TimeObject(long timeLimit) {
		this.timeLimit = timeLimit;
		this.time = System.currentTimeMillis();
	}

}
