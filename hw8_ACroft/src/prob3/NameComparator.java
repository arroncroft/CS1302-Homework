// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 8
// Due:		4/25/16
package prob3;

import java.util.Comparator;

public class NameComparator implements Comparator<Player> {
	//compare: compares 2 players and returns them in order
	//	by name and then by points.
	@Override
	public int compare(Player player1, Player player2){
		if (player1.getName() != player2.getName())
			return player1.getName().compareTo(player2.getName());
		else if (player1.getPoints() < player2.getPoints())
			return -1;
		else if (player1.getPoints() > player2.getPoints())
			return 1;
		else
			return 0;
	}
}
