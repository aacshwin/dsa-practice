package com.udemy.generics;

import java.util.ArrayList;

public class Team<T extends Player> {
	
	private String name;
	private int win;
	private int loss;
	private int tie;
	private int played;
	ArrayList<T> playerList = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public void addPlayer(T player) {
		if(playerList.contains(player)) {
			System.out.println("Player already in team");
		} else {
			playerList.add(player);
			System.out.println("Player added to team");
		}
	}
	
	public void printTeam() {
		int i = 0;
		for(Player player: playerList) {
			i++;
			System.out.println(i + ":" + player.getName());
		}
	}
	
	public void playMatch(Team<T> opponent, int ourScore, int theirScore) {
		if(ourScore > theirScore) {
			win++;
		} else if(ourScore < theirScore) {
			loss++;
		} else {
			tie++;
		}
		played++;
		if(opponent != null) {
			playMatch(null, theirScore, ourScore);
		}
	}
	
	

}
