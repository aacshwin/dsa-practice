package com.udemy_datastructures.stacks;

import java.util.Stack;

public class PalindromeWithStack {

	public static void main(String[] args) {

		String a = "ihello";

		System.out.println(checkPalin(a.toLowerCase()));

	}

	public static boolean checkPalin(String inputStr) {
		String[] input = inputStr.split("");
		Stack<String> stack = new Stack<>();
		String outputString = "";
		inputStr = "";
		for (int i = 0; i < input.length; i++) {
			if (!input[i].equals(" ") && !input[i].equals("?") && !input[i].equals(".") && !input[i].equals("!")
					&& !input[i].equals(",")) {
				stack.push(input[i]);
				inputStr = inputStr.concat(input[i]);
			}
		}

		while (!stack.isEmpty()) {
			outputString = outputString.concat(stack.pop());
		}
		System.out.println(inputStr);
		System.out.println(outputString);
		return outputString.equals(inputStr);
	}

}
