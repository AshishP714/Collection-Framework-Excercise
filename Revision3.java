package Exercise;

import java.util.ArrayList;

public class Revision3 {

	public static void main(String[] args) {
		
		Car c = new Car();
		Animal a = new Animal();
		
		ArrayList<Object> arg = new ArrayList<Object>();
		
		arg.add(c);
		arg.add(a);
		
		System.out.println(arg);
	}
}