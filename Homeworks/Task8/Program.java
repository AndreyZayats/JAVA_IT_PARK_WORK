class Program {
	public static void main(String[] args) {
		int a[][] = {{1, 2, 33, 123, 123},
					 {4, 55, -6, 124, -10},
					 {7, 8, 9, -125, -12},
					 {-2, 11, -204, 33, 155},
					 {22, -1, -50, 3, 6},
					 {2, 4, 23, -11, -10}};
		System.out.println(averageAr(a));
	}

	public static int averageAr(int a[][]) {
		int averageAr = 0;
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				averageAr += a[i][j];	
				count++;
			}			
		}

		System.out.println(averageAr + "/" + count);
		return averageAr/count;
	}
}