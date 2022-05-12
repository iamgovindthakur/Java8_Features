package functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

enum sex {
	M, F
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
class Employee {
	String name;
	int age;
	sex gender;

}

public class ComparatorExmples {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Govind", 24, sex.M));
		employeeList.add(new Employee("Sovan", 34, sex.M));
		employeeList.add(new Employee("Vikrant", 14, sex.M));
		employeeList.add(new Employee("Shashank", 26, sex.M));
		employeeList.add(new Employee("Anurag", 38, sex.M));

		// Name comparator
		Comparator<Employee> nameComparator = (Employee e1, Employee e2) -> {
			return e1.getName().compareTo(e2.getName());
			/* changing the e1 and e2 order will sort the list into descending order */
		};

		// Age comparator
		Comparator<Employee> ageComparator = (e1, e2) -> {
			return e1.getAge() - e2.getAge();
			/* changing the e1 and e2 order will sort the list into descending order */
		};
		
		//Comparable<Employee> ageComparable=(e) -> e.getAge()
		

		System.out.println("Comparing on Name");
		Collections.sort(employeeList, nameComparator);
		employeeList.forEach(System.out::println);
		System.out.println("Comparing on Age");
		Collections.sort(employeeList, ageComparator);
		employeeList.forEach(System.out::println);

		/*
		 * As we are using collections here so we can use in line comparator as we
		 * already know it is functional interface
		 */
		
		//sorting employee based on gender
		System.out.println("Comparing on Gender");
		Collections.sort(employeeList, (e1, e2) -> e1.getGender().compareTo(e2.gender));
		employeeList.forEach(System.out::println);
		
		
		
	}

}
