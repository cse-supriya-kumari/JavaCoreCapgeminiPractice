class PrimeOrComposite {
	public static void isPrime(int n) {
	int c = 0;
	for(int i =2; i < n; i++) {
		if(n % i == 0) {
			c++;
		}

	}
	if(c == 0) {
		System.out.println("Prime");
	}
	else if (c > 0 ){

		System.out.println("composite");
	}
	else {
		System.out.println("Neither prime nor composite");
	}

}

}