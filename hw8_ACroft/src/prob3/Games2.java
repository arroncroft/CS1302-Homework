// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 8
// Due:		4/25/16
package prob3;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Games2 {
	//main method
	public static void main(String[] args){
		//create players
		Player p1 = new Player("Benito", 33);
		Player p2 = new Player("Quincy", 14);
		Player p3 = new Player("Lean", 22);
		Player p4 = new Player("Carly", 41);
		Player p5 = new Player("Pepper", 18);

		//create set, add players, compare by name then points
		TreeSet<Player> team = new TreeSet<>(new NameComparator());
		team.addAll(Arrays.asList(p1,p2,p3,p4,p5));
		System.out.println("\nPlayers sorted by name:");
		for(Player p : team) System.out.println(p);

		//create set, add players, compare by points then name
		team = new TreeSet<>(new PointsComparator());
		team.addAll(Arrays.asList(p1,p2,p3,p4,p5));
		System.out.println("\nPlayers sorted by points:");
		for(Player p : team) System.out.println(p);

		//test getPlayersAbove method
		Set<Player> big = getPlayersAbove(team,20);
		System.out.println("\nPlayers with a lot of points:");
		for(Player p : big) System.out.println(p);
	}

	//getPlayersAbove: accepts a set of players and a score value, and returns
	//	all players in the set that had equal to or more points than that.
	public static Set<Player> getPlayersAbove(TreeSet<Player> players,int val){
		TreeSet<Player> ret = new TreeSet<>(new PointsComparator());
		Player dummy = new Player("Dummy",val);
		ret.addAll(players.tailSet(dummy));
		return ret;
	}
}
