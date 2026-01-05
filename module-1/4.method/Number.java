class Number {
	public static void isDeficientPerfectAbundant(int n) {
		if(n > 0){
		int s = 0;
		for(int i = 1 ; i < n; i++) {
			if(n % i == 0) {
				s = s + i;
				}
			}
			if(s < n) {
				System.out.println(n+ " is a Deficient Number");
			}
			if(s == n ){
				System.out.println(n + " is a perfect Number");
			}
			if(s > n) {
				System.out.println(n + " is a Abundant Number");
			}
		}
		else {
			System.out.println("Invalid Number");
		}
	}
}
