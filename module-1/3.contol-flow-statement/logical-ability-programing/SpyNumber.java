class SpyNumber {
	public static void main(String[] args){
		int n = 125;
		int sum = 0;
		int product = 1;
		int r = 0;
		for(int t = n; t != 0; t = t/10) {
			r = t % 10;
			sum = sum + r;
			product = product * r;
		}
		if(sum == product) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not a spy number");
		}
		
	}

}