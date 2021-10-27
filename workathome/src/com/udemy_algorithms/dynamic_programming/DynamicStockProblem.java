package com.udemy_algorithms.dynamic_programming;

public class DynamicStockProblem {

	public static void main(String[] args) {
		int[] intarray = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(buysell(intarray));
	}
	
	public static int buysell(int[] prices) {
		// Ref link : https://www.youtube.com/watch?v=3RHCb8LY-X4
		if(prices.length == 0) {
			return 0;
		}
		int min_val = Integer.MAX_VALUE;
		int max_profit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(min_val > prices[i]) {
				min_val = prices[i];
			} else if(max_profit < prices[i] - min_val) {
				max_profit = prices[i] - min_val;
			}
		}
		
		return max_profit;
	}

}
