package com.udemy_algorithms.dynamic_programming;

public class RobberProgram {

	public static void main(String[] args) {
		int[] intarray = new int[] { 2, 7, 9, 3, 1 };
		System.out.println(rob(intarray));
	}

	public static int rob(int[] nums) {
		// We are going to follow bottom up approach in DP.
		// Ref link : https://www.youtube.com/watch?v=ZwDDLAeeBM0
		if(nums.length == 0) {	// Default case where we dont have any house to rob
			return 0;
		}
		
		// The following is default template for bottom up approach in DP:
		int[] dp = new int[nums.length + 1];
		// Initialize the 0th and 1st element for the dp array:
		dp[0] = 0;	// if we rob 0 houses
		dp[1] = nums[0];	// if we rob 1 house - the first house.
		// Iterate over the rest:
		for(int i = 1; i < nums.length; i++) {
			dp[i+1] = Math.max(dp[i], dp[i - 1] + nums[i]);	
			// Important step:
			// Dp would have the max value at the last element in the dp array.
			// When we add another value to dp we check whether which is maximum of the following:
			// i) the last element at dp i.e. dp[i]
			// ii) the sum of last but 1 element of dp (dp(i - 1)) and current element in nums array (nums[i])
		}
		
		return dp[nums.length];
	}

}
