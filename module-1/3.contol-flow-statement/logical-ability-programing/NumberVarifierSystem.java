class NumberVarifierSystem {
	public static void main(String[] args) {
		int n = 456;
		if((n < 0) && (n % 2 == 0)) {
			System.out.println(n + " is a negative and even number");
		}
		if((n < 0 ) && (n % 2 != 0)) {
			System.out.println(n + " is a Negative and odd number");
		}
		if((n == 0 ) && (n % 2 == 0) && (n / 2 == 0)) {
			System.out.println(n + "is a nuteral number");
		}
		if((n > 0) && (n % 2 == 0)) {
			System.out.println(n+" is a positive even number");
		}
		if((n > 0) && (n % 2 != 0)) {
			System.out.println(n + "is a positive and odd");
		}
	}

}