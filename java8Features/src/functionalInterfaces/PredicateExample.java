package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	static List<Staff> StaffList = new ArrayList<>();

	static {
		StaffList.add(new Staff(1, "A"));
		StaffList.add(new Staff(2, "B"));
		StaffList.add(new Staff(3, "C"));
		StaffList.add(new Staff(4, "D"));
		StaffList.add(new Staff(5, "E"));
	}

	public static void main(String[] args) {

		Predicate<Staff> returnOddID = (staff) -> staff.getId() % 2 != 0;

		StaffList.forEach(staff -> {

			if (returnOddID.test(staff))
				System.out.println(staff);
		});

	}

}
