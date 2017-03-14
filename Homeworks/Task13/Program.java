class Program {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 33, 123, 123},
               		 {4, 55, -6, 124, -10},
               		 {7, 8, 9, -125, -12},
                	 {-2, 11, -2, 33, 155},
                	 {22, 3, 50, 3, 6}};

        findMax(a);
	}

	public static void findMax(int a[][]) {
		for(int i = 0; i < a.length; i++) {
			int max = Integer.MIN_VALUE;
			for(int j = 0; j < a.length; j++) {
				if(a[j][i] > max) {
					max = a[j][i];
				}
			}
			System.out.println("MaxElement in the " + (i+1) + " column is " + max);
		}
	}
}