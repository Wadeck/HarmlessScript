public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Command started with: " + String.join(", ", args));
		System.out.println();
		System.out.println("Highly intensive cryptomining...");
		for (int i = 0; i < 100; i++) {
			System.out.println("> mining... (" +(i+1)+ " / 100)");
			Thread.sleep(10);
		}
		System.out.println("Gather the money now !!!");
	}
}
	