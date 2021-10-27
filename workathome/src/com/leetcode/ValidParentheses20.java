package com.leetcode;

import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		System.out.println(isValid("{[]()}"));

	}

	public static boolean isValid(String s) {
		Stack<String> strStack = new Stack<>();
		for (String str : s.split("")) {
			if (str.equals("{") || str.equals("[") || str.equals("(")) {
				strStack.push(str);
			} else if (!strStack.isEmpty() && str.equals("}") && strStack.peek().equals("{")) {
				strStack.pop();
			} else if (!strStack.isEmpty() && str.equals(")") && strStack.peek().equals("(")) {
				strStack.pop();
			} else if (!strStack.isEmpty() && str.equals("]") && strStack.peek().equals("[")) {
				strStack.pop();
			} else {
				return false;
			}
		}
		return strStack.isEmpty();
	}

}
