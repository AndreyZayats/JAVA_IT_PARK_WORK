import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		int[] a = new int[10];
		int result = 0;

		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < a.length; i++) {
			int b = scanner.nextInt();
			
			if(b == -1) {
				break;
			}

			a[i] = b;

			result += a[i];
		}

		System.out.println(result);
	}
}