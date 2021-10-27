package com.udemy.generics;

public class GenericMain {
	
	public static void main(String[] args) {
		FootballPlayer messi = new FootballPlayer("Messi");
		CricketPlayer dhoni = new CricketPlayer("Dhoni");
		
		Team<FootballPlayer> manchesterUnited = new Team("ManchesterUnited");
		Team<FootballPlayer> manchesterUnited2 = new Team("ManchesterUnited2");
		
		Team<CricketPlayer> csk = new Team("Csk");
//		manchesterUnited.addPlayer(dhoni);
//		manchesterUnited.addPlayer(dhoni);
		manchesterUnited.addPlayer(messi);
		
		manchesterUnited.printTeam();
		
		manchesterUnited.playMatch(manchesterUnited2, 2, 1);
//		csk.playMatch(manchesterUnited, 2, 1);
		
	}

}
