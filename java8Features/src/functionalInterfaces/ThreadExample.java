package functionalInterfaces;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		Runnable R = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("I am Child Thread");
			}
		};
		Thread t = new Thread(R);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("I am Main Thread");
		}
	}

}
