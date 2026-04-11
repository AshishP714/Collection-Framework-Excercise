package java8;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerDepartment {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Scanner scanner = new Scanner(System.in);

		System.err.println("How many employees :- ");
		int numberOfEmployee = scanner.nextInt();

		for (int i = 0; i < numberOfEmployee; i++) {
			System.out.println("Enter employee details :- " + (i + 1));

			System.out.print("Enter id : ");
			int id = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter name : ");
			String name = scanner.nextLine();

			System.out.print("Enter email : ");
			String email = scanner.next();

			System.out.print("Enter salary : ");
			double salary = scanner.nextDouble();

			System.out.print("Enter address : ");
			String address = scanner.next();

			Employee employee = new Employee(id, name, email, salary, address);

			employeeList.add(employee);
			
			System.out.println();
		}

		System.err.println("\nemployee List :- ");
		for (Employee emp : employeeList) {
			System.out.println(
					"[" + emp.id + ", " + emp.name + ", " + emp.email + ", " + emp.salary + ", " + emp.address + "]");
		}
	}
}