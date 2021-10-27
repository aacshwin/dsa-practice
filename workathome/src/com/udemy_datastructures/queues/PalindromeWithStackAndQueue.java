package com.udemy_datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeWithStackAndQueue {

	public static void main(String[] args) {

		String a = "I Did, Did i ?";

		System.out.println(checkPalin(a.toLowerCase()));

	}

	public static boolean checkPalin(String inputStr) {
		String[] input = inputStr.split("");
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		String outputString = "";
		inputStr = "";
		for (int i = 0; i < input.length; i++) {
			if (!input[i].equals(" ") && !input[i].equals("?") && !input[i].equals(".") && !input[i].equals("!")
					&& !input[i].equals(",")) {
				stack.push(input[i]);
				queue.add(input[i]);
			}
		}
		
		String qstr = "";
		String sstr = "";
		while(!stack.isEmpty()) {
			qstr = qstr.concat(queue.remove());
			sstr = sstr.concat(stack.pop());
		}

		System.out.println(qstr);
		System.out.println(sstr);
		return qstr.equals(sstr);
	}

}
