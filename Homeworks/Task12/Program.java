class Program {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 33, 123, 123},
               		 {4, 55, -6, 124, -10},
               		 {7, 8, 9, -125, -12},
                	 {-2, 11, -2, 33, 155},
                	 {22, 3, 50, 3, 6}};

        turnMatrix(a);
        
	}

	public static void turnMatrix(int a[][]) {
		for(int i = a.length-1; i >= 0; i--) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + " ");
			}

			System.out.println();
		}
	}
}