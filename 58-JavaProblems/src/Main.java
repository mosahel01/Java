public class Main {
	public static void main(String[] args) {

		// System.out.println("Hello world");
		// System.out.println("Hello \"world\"");
		// System.out.println("Hello world\\");
		// System.out.println("\tHello world");
		// System.out.println("\nHello world");
		// System.out.println("\rHello world");

		sum(2, 4);
		int m = multiply(2, 4);
		int[] a = ArrayFromInt(2, 4, 6, 8);

		System.out.println(m);

		System.out.println(m);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d,", a[i]);
		}

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int[] ArrayFromInt(int a, int b, int c, int d) {
		int[] arr = new int[7];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;

		return arr;
	}

}
