import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int a = scanner.nextInt();
			if(a < 1) {
				break;
			}
			System.out.println(isPrime(a));
		}
	}

	public static boolean isPrime(int n) {
		for(int i = 2; i * i <= n; i++) {
			int a = n%i;
			if(a == 0) {
				return false;
			}
		}

		return true;
	}
}
