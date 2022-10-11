package armstrong;

public class armstrong1 {
	public static void main(String[] args) {
		int y = 153;
		int count = 0;
		int t = y;
		int r = 1;
		int n = 1;
		int sum = 0;
		int i = 1;
		while (y > 0) {
			n = y % 10;
			count++;
			y = y / 10;

		}
		y = t;
		r = 1;
		sum = 0;
		while (y > 0) {
			n = y % 10;
			r = 1;
			for (i = 1; i <= count; i++) {
				r = r * n;
			}
			sum = sum + r;
			y = y / 10;

		}
		if (t == sum)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
