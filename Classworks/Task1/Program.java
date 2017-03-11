import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a[] = {-3, 10, 11, 12, 15, -5};

		int min = a[0];
		int max = a[0];
		int minIndex = 0;
		int maxIndex = 0;
		int indexX = -1;
		int x = scanner.nextInt();

		for(int i = 1; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
				minIndex = i;
			}			
		}

		for(int j = 1; j < a.length; j++) {
			if(max < a[j]) {
				max = a[j];
				maxIndex = j;
			}
		}

		int temp = a[minIndex];
		a[minIndex] = a[maxIndex];
		a[maxIndex] = temp;

		for(int i = 0; i<a.length; i++) {
			
			if(a[i] == x) {
				indexX = i;
			}
		}

		System.out.println(indexX);
	}
}