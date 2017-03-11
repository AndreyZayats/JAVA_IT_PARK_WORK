public class Program {
	
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		int z = sum(x, y);
		System.out.println(z);
	}

	public static int sum(int a, int b) {
		int sum = 0;

		for(int i = a; a<=b; a++) {
			sum += a;
		}

		return sum;
	}
}