package functionalInterfaces;

/*@FunctionalInterface is just for assuring we have only one abstract method in interface. if we have more than one it will throw error*/

/*Return type void*/
@FunctionalInterface
interface PrintSquare {
	public void printSquare(int n);
}

/* Return type integer */
@FunctionalInterface
interface ReturnSquare {
	public int returnSquare(int n);
}

public class ReturnTypeVoidAndInt {

	public static void main(String[] args) {

		PrintSquare P = n -> System.out.println(n);
		P.printSquare(7);

		ReturnSquare q = (int n) -> n * n;

		System.out.println(q.returnSquare(9));

		ReturnSquare R = n -> n * n;

		System.out.println(R.returnSquare(5));

	}

}
