import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int result = 1;
        int sum = 0;

        while (a!=-1) {
            a = scanner.nextInt();
            if(a == -1) {
            	break;
            }
            
            if(getCountsOfDigits(a) > 1) {
                sum = a/(int) Math.pow(10, (getCountsOfDigits(a)-1));
                for(int i = 1; i < getCountsOfDigits(a); i++) {
                    sum += a%Math.pow(10, i)/(int) Math.pow(10, i-1);
                }
            }

            else if(getCountsOfDigits(a) == 1) {
                sum = a;
            }

            if (isPrime(sum)) {
                result *= a;
            }
            
        }
        System.out.println(result);
    }


    public static boolean isPrime(int n) {
        for(int i = 2; i*i <= n; i++) {
            int a = n%i;
            if(a==0) {
                return false;
            }
        }
        return true;
    }

    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}