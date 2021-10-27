package com.udemy_datastructures.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyMap {
	
	private LinkedList<Data>[] dataList;
	
	public MyMap() {
		this.dataList = new LinkedList[10];
		for(int i = 0; i < dataList.length; i++) {
			dataList[i] = new LinkedList<>();
		}
	}

	public int hashFunction(String key) {
		return key.length() % dataList.length;
	}
	
	public void put(String key, Integer value) {
		int index = hashFunction(key);
		Data data = new Data(key, value);
		dataList[index].add(data);
	}
	
	public void get(String key) {
		int index = hashFunction(key);
		LinkedList<Data> ll = dataList[index];
		if(ll.size() == 1) {
			System.out.println(ll.getFirst().getInnerValue());
		} else {
			Iterator<Data> iter = ll.iterator();
			while(iter.hasNext()) {
				Data a = (Data)iter.next();
				if(a.getInnerKey().equals(key)) {
					System.out.println(a.getInnerValue());
				}
			}
		}
	}
	
	public void remove(String key) {
		LinkedList<Data> ll = dataList[hashFunction(key)];
		Iterator<Data> iter = ll.iterator();
		int index = 0;
		if(ll.size() == 1) {
			ll.remove();
		} else {
			while(iter.hasNext()) {
				Data data = iter.next();
				index++;
				if(data.getInnerKey().equals(key)) {
					break;
				}
			}
			ll.remove(index -1);
		}
		System.out.println("Removed key : " + key);
	}
	
	public void fetchWholeMap(){
		for(int i = 0; i < dataList.length; i++) {
			System.out.println("at position : " + i);
			Iterator<Data> iter = dataList[i].iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next());
				System.out.print(" -> ");
			}
		}
	}
	
	class Data {
		
		private String innerKey;
		private Integer innerValue;
		
		private Data(String key, Integer value) {
			this.innerKey = key;
			this.innerValue = value;
		}

		public String getInnerKey() {
			return innerKey;
		}
		
		public Integer getInnerValue() {
			return innerValue;
		}

		@Override
		public String toString() {
			return this.innerKey + " : " + this.innerValue;
		}	
		
	}

}
