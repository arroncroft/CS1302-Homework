package Human;

public class Human {
	//data fields
	private int age;
	private String name;
	private char gender;
	private double weight; //in pounds

	//constructor
	public Human(int age, String name, char gender, double weight){
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void changeGender(Human human) {
		if (human.gender == 'm'){
			human.gender = 'f';
		}
		else {
			human.gender = 'm';
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "age=" + age + ", name=" + name + ", gender=" + gender + ", weight=" + weight;
	}
}
