package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

	static List<Staff> StaffList = new ArrayList<>();

	static {
		StaffList.add(new Staff(1, "A"));
		StaffList.add(new Staff(2, "B"));
		StaffList.add(new Staff(3, "C"));
		StaffList.add(new Staff(4, "D"));
		StaffList.add(new Staff(5, "E"));
	}

	public static void main(String[] args) {

		Function<Integer, List<Staff>> modifyAllStaff = (num) -> {
			List<Staff> collect = StaffList.stream().map(staff -> new Staff(staff.getId() + 5, staff.getName()))
					.collect(Collectors.toList());

			return collect;
		};

		System.out.println(modifyAllStaff.apply(5));
		

	}

}
