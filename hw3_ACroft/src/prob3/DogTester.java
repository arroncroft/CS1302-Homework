// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob3;

public class DogTester {

	//main
	public static void main(String[] args) {
		//creates some Dog objects
		Dog d1 = new Dog();
		Dog d2 = new Dog("Lucky");
		Dog d3 = new Dog(7, "GG");
		Dog d4 = new Dog(12);
		//creates some WolfDog objects
		WolfDog w1 = new WolfDog(9001, 5, "Juno");
		WolfDog w2 = new WolfDog(10, 1);
		WolfDog w3 = new WolfDog(100, 5, "Venti");
		//prints out created objects
		System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" +
		w1 + "\n" + w2 + "\n" + w3);
	}
}
