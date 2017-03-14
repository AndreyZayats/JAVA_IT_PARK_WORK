import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			int a = scanner.nextInt();
			if(a == -1) {
				break;
			}

			System.out.println(sumOfDigits(a));
		}
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		if(getCountOfDigits(n) > 1) {
			sum = n/(int) Math.pow(10, (getCountOfDigits(n)-1));
			for(int i = 1; i < getCountOfDigits(n); i++) {
				sum += n%Math.pow(10, i)/(int) Math.pow(10, i-1);
			}
		}

		else if(getCountOfDigits(n) == 1) {
			sum = n;
		}

		return sum;
	}

	public static int getCountOfDigits(int number) {
		int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
	}
}