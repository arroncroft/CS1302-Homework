// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 8
// Due:		4/25/16
package prob3;

public class Player {
	private String name;
	private int points;

	public Player(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "name=" + name + ", points=" + points;
	}
}
