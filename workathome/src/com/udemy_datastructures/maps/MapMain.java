package com.udemy_datastructures.maps;

public class MapMain {
	
	public static void main(String[] args) {
		
		MyMap map1 = new MyMap();
		map1.put("Eggs", 20);
		map1.put("Milk", 225);
		map1.put("Apple", 22);
		map1.put("Orange", 34);
		map1.put("Juice", 21231);
		
		map1.get("Juice");
		map1.get("Orange");
		
		map1.fetchWholeMap();
		
		map1.remove("Eggs");
		
		map1.fetchWholeMap();
		
//		System.out.println(map1.get("Milk"));
	}

}
