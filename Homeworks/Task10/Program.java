class Program {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 33, 123, 123},
               		 {4, 55, -6, 124, -10},
               		 {7, 8, 9, -125, -12},
                	 {-2, 11, -2, 33, 155},
                	 {22, 3, 50, 3, 6}};

        nullMainDiag(a);

	}

	public static void nullMainDiag(int a[][]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i == j) {
					a[i][j] = 0;
				}
			}
		}

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}