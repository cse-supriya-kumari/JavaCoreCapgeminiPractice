class AutobiographicalNumber {
	public static void main(String[] args) {
		int n = 2120;
		int count = 0;
		int sum = 0;
		int r = 0;
		for(int t = n; t != 0; t = t / 10 ) {
			r = t % 10;
			count++;
			sum = sum + r;
		}
		if(count == sum) {
			System.out.println("AutobiographicalNumber!");
		}
		else {
			System.out.println("Not AutobiographicalNumber!");
		}

	}

}