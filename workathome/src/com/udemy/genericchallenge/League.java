package com.udemy.genericchallenge;

import java.util.*;

public class League<T extends Team>{
	
	private String name;
	
	private List<T> teamList = new ArrayList<>();
	
	public League(String name) {
		this.name = name;
	}
	
	public void addTeam(T team) {
		if(teamList.contains(team)) {
			System.out.println("The team already exists in the league");
		} else {
			teamList.add(team);
			System.out.println("Team " + team.getName() + " added to the league " + this.name);
		}
	}
	
	public void printTeamList() {
//		for()
//		Collections.sort(teamList);
	}
	

}
