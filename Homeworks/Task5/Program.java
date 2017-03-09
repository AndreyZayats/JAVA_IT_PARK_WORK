import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[] a = new int[10];
		int result = 0;

		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < a.length; i++) {
			int b = scanner.nextInt();
			
			if(b == -1) {
				break;
			}

			result += b;
		}

		System.out.println(result);
	}
}