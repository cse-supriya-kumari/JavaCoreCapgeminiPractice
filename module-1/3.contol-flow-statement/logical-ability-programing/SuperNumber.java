class SuperNumber {
	public static void main(String[] args) {
		int n = 1234;
		int even = 0;
		int odd = 0;
		int r = 0;
		for(int t = n; t != 0; t = t / 10){
			r = t % 10;
				if(r % 2 == 0){
				even = even + r;
			}
				else {
				odd = odd + r;
			}
			
		}
		if(even == odd){
			System.out.println("Super Number");
		}
		else {
			System.out.println("not a Super Number");
		}
		
		
	}
}