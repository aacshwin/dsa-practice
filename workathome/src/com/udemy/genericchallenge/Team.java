package com.udemy.genericchallenge;

public abstract class Team {
	
	private String name;
	private int score;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
}
