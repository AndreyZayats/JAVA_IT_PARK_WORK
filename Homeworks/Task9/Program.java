class Program {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 33, 123, 123},
               		 {4, 55, -6, 124, -10},
               		 {7, 8, 9, -125, -12},
                	 {-2, 11, -2, 33, 155},
                	 {22, 3, 50, 3, 6},
                	 {2, 4, 23, -11, -10}};

        findMin(a);
    }

    public static void findMin(int a[][]) {
        int min = 0;

        for(int i = 0; i < a.length; i++) {
            min = Integer.MAX_VALUE;
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] < min) {
                    min = a[i][j];
                }
            }
            System.out.println("MinElement in the " + (i+1) + " line is " + min);
        }
    }
}