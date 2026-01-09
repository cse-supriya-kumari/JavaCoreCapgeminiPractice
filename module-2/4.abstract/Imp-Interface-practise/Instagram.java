class Instagram extends SoftwareApplication {
	@Override
	public void open() {
		System.out.println("Instagram Opened");
	}
	@Override
	public void signUp() {
		System.out.println("Instagram signed Up");
	}
	@Override
	public void signIn() {
		System.out.println("Instagram signed In");
	}
	@Override
	public void signOut() {
		System.out.println("Instagram signed Out");
	}
	@Override
	public void close() {
		System.out.println("Instagram Closed");
	}

}