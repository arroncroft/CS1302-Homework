// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 3
// Due:		2/10/16

package prob3;

public class WolfDog extends Dog {
	//variables
	private int meanness;

	//constructors: the first one calls the one below
	//	it, which refers back to the superclass, Dog.
	public WolfDog(int meanness, int age){
		this(meanness, age, "wd");
	}

	public WolfDog(int meanness, int age, String name){
		super(age, name);
		this.meanness = meanness;
	}

	//toString: returns WolfDog's name, age, and meanness.
	@Override
	public String toString(){
		/**return "WolfDog-name: "+getName()+", Age: "+getAge()+", Meanness: "+meanness;**/
		String ret = "Wolf";
		ret += super.toString();
		ret += ", Meanness: "+meanness;
		return ret;
	}
}
