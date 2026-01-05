class NeonNumber {
	public static void neon(int n) {
		int square  = n * n;
		int sum = 0;
		int r = 0;
		for(int i = square; i != 0; i = i / 10) {
			r = i % 10;
			sum = sum + r;
		}
		if(sum == n) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a neon number");
		}
	}

}