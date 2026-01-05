class SpecialNumber {
	public static void strong(int n) {
		int sum = 0;
		int product = 1;
		int r = 0;
		int temp = n;
		for(int i = temp; i != 0; i = i / 10) {
			r = i % 10;
			sum = sum + r;
			product = product * r;
		}
		if(n == (sum+product)) {
			System.out.println("Special number");
		}
		else {
			System.out.println("Not special number");
		}
	}

}