import java.util.Random;

class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " " + count(ages));
		}
		// вывести на экран количество людей, с возрастами от 0 до 120
		

	}

	public static int count(int ages[]) {
		int count = 0;

		for(int i = 0; i < ages.length; ) 
		{
			if(ages[0] == ages[i]) {
				count++;
			}
			i++;
		}
		return count;
	}
}