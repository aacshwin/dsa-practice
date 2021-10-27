package sample;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CustomCollection {
	
	private static List<TimeObject> timeObjList = new ArrayList<>();
	private int size = 0;
	
	public void add(TimeObject timeObject) {
		if(size > 20) {
			System.out.println("You have reached maximum limit");
			return;
		}
		timeObjList.add(timeObject);
		this.size++;
	}
	
	public TimeObject delete(TimeObject timeObject) {
		long now = System.currentTimeMillis();
		if(timeObject.time - now >= timeObject.timeLimit) {
			timeObjList.remove(timeObject);
		} 
		return timeObject;
	}
	
	public void autoDelete() {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				
				long now = System.currentTimeMillis();
				timeObjList.forEach(obj -> {
					if(obj.time - now >= obj.timeLimit) {
						timeObjList.remove(obj);
					} 
				});
			}
		});
		
		t1.start();
		
		while(true) {
			
			try {
				Thread.sleep(1000);// this is wrong. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
	}
	

}
