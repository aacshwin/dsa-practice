package com.udemy_algorithms.dynamic_programming;

import java.util.HashSet;

public class LongestSubString {
	
	public static void main(String[] args) { 
		// Double pointer approach
		//Input = abcbbcbc
		String s = "abcbbcbc";
		int i = 0;
		int j = 0;
		int max = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(i));
				i++;
			}
			System.out.println(j + "," + i + ":" + set);
		}
		System.out.println(max);
	}

}
