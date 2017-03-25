class RationalNumber {
	public static void main(String[] args) {
		RationalNumber number = new RationalNumber(3, 6);
		System.out.println(number.normalize());
	}	
	//поля
	int numerator;
	int denominator;

	RationalNumber() {
		numerator = 0;
		denominator = 1;
	}

	RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	double normalize() {
		return (double) numerator / denominator;
	}
}