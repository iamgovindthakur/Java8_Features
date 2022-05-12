package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lombok.Data;

@Data
class Staff {
	private int id;
	private String name;

	public Staff(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + "]";
	}

}

public class ConsumerExample {

	static List<Staff> StaffList = new ArrayList<>();

	static {
		StaffList.add(new Staff(1, "A"));
		StaffList.add(new Staff(2, "B"));
		StaffList.add(new Staff(3, "C"));
		StaffList.add(new Staff(4, "D"));
		StaffList.add(new Staff(5, "E"));
	}

	public static void main(String[] args) {

		Consumer<List<Staff>> printAllStaff = (List<Staff> StaffList) -> StaffList.forEach(System.out::println);

		printAllStaff.accept(StaffList);

	}

}
