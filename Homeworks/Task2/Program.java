import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int a = scanner.nextInt();

			count++;

			if(count%2 == 0) {
				sum+=a;
			}

			if(a == -1) {
				break;
			}
		}

		System.out.println(sum);
	}
}