class Program {
	public static void main(String[] args) {
		System.out.println(fib(15));
	}

	public static int fib(int n) {
		System.out.println("fib(" + n + ")");
		int a = 0;
		int b = 1;
		int i = 0;
		int sum = 1;
		 
		while(i < n) {	
			sum = a + b;
			a = b;
			b = sum;
			i++;
		}
		
		return sum;
	}
	
}