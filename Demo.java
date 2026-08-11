package RevisionCodes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Tushar", 55000));
		list.add(new Employee(102, "Abhijeet", 60000));
		list.add(new Employee(103, "Ashish", 40000));
		list.add(new Employee(104, "Shubham", 47000));
		list.add(new Employee(105, "Saurabh", 50000));
			
		Employee emolpyee = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		System.out.println("Higest paid employee :- " + emolpyee);
		
		List<Employee> list2 = list.stream().filter(e -> e.getEname().equals("Ashish")).collect(Collectors.toList());
		System.out.println("Employee with name :- " + list2);
		
		List<Employee> list3 = list.stream().filter(e -> e.getEmpid() == 101).collect(Collectors.toList());
		System.out.println("Fatching employee with id :- " + list3);
		
		
	}
}