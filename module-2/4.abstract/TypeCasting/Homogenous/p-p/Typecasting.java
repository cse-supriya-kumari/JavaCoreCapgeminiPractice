class Typecasting {
	public static void widening() {
		int i = 10;
		System.out.println("i is : "+i);
		double d = i;
		System.out.println("D is : "+d);
		System.out.println();
	}
	public static void narrowing() {
		double d = 23.34;
		System.out.println("d is : "+d);
		int i = (int)d;
		System.out.println("i is : "+i);
		System.out.println();
	}
}