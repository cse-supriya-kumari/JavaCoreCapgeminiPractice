class Ramanujan {
	public static void isRAmanujan(int n) {
		int sum = 0;
		int rev = 0;
		int r = 0;
		int count = 0;
		int product = 1;
		for(int t = n; t != 0; t = t/10){
			r = t % 10;
			sum = sum + r;
		}
		for (int p = sum; p != 0; p = p / 10) {
			int rem = p % 10;
			rev = (rev * 10) + rem;

		}
		if( (sum * rev) == n){
			System.out.println("Ramanujan number");
		}
		else {
			System.out.println("Not a ramanujan");
		}
	}

}