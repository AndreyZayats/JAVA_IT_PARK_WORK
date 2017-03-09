import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        
        while(true) {
         	int a = scanner.nextInt();
            if(a <= 1) {
            	break;
            }
            if((isPrime(a) | a == 2 | a == 3))
            {
                result *= a;
            }
        }
        System.out.println(result);
    }

    public static boolean isPrime(int n)
    {
        for(int i = 2; i*i <= n; i++) {
            int a = n%i;
            if(a==0) {
                return false;
            }
        }

        return true;
    }
}