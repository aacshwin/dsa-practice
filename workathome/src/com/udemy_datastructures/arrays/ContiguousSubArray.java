package com.udemy_datastructures.arrays;

public class ContiguousSubArray {

	public static void main(String[] args) {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		maxSubArray(nums);
	}

	public static int maxSubArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum > nums[i]) {
				sum += nums[i];
			}

			sum = Math.max(sum, nums[i]);
		}
		
		//Not yet done

		return sum;
	}

}
