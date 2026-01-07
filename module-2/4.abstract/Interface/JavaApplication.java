class JavaApplication {
	public static void execution() {
		System.out.println(SuperInterface.c);
		SuperInterface.sm();

		System.out.println();


		System.out.println(SubConcereteClass.c);
		SubConcereteClass subConcereteClass = new SubConcereteClass();
		subConcereteClass.nsm();

	}

}