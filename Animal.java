package Exercise;

public class Animal {

	public String type = "Dog";
	public String name = "Sheru";
	public int age = 8;
	public String color = "White";

	@Override
	public String toString() {
		return "Type :- " + type + " Name :- " + name + " Age :- " + age + " Color :- " + color;
	}
}
