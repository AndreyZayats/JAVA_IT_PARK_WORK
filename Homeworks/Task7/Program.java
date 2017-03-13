class Program {
	public static void main(String[] args) {
		int a[] = {1, 2, 1, 3, 4, 5, 3, 4, 2};
		System.out.println(locMaxCount(a));
	}

	public static int locMaxCount(int a[]) {
		int locMaxCount = 0;

		for(int i = 1; i <= a.length-2; i++) {
			if(i > a[i-1] & i > a[i+1]) {
				locMaxCount++;
			}	
		}

		return locMaxCount;
	}
}