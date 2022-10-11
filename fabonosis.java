package armstrong;

public class fabonosis {
	public static void main(String[] args) {
		int h1, h2, h3;
		h1 = 0;
		h2 = 1;
		System.out.print(h1 + " " + h2);
		for (int i = 1; i <= 10; i++) {
			h3 = h1 + h2;
			System.out.print(" " + h3);
			h1 = h2;
			h2 = h3;

		}
	}
}
