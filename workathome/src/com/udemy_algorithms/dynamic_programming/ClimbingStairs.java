package com.udemy_algorithms.dynamic_programming;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		System.out.println(climb(50));
		// Climbing stairs is basically fibonacci..
	}

	private static int climb(int n) {
		int[] dp = new int[n + 1];
		
		dp[0] = 1; // When there is no steps, we dont climb(only change from fib series)
		dp[1] = 1; // when there is 1 step, we can climb with only 1 way.
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			System.out.print(dp[i] + "-");
		}
		//
		return dp[n];
	}

}
