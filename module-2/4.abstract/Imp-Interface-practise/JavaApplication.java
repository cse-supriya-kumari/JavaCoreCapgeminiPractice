class JavaApplication {
	public static void execution() {
		Instagram instagram = new Instagram();
		instagram.open();
		instagram.signUp();
		instagram.signIn();
		instagram.signOut();
		instagram.close();

		System.out.println();
		
		Facebook facebook = new Facebook();
		facebook.open();
		facebook.signUp();
		facebook.signIn();
		facebook.signOut();
		facebook.close();


	}
}