import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);

		for(int i = 0 ; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if(a[i] == -1) {
				break;
			}
		}

		for(int i = 1; i < a.length/2; i++) {
			int temp = a[i-1];
			a[i-1] = a[a.length-i];
			a[a.length-i] = temp;
		}

		for(int b : a) {
			System.out.println(b);
		}
	}
}