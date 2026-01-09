class TypeCasting {
	public static void upCatingDowncasting() {
		Employee employee ;
		employee = new SoftwareDeveloper();

		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.longBreak();
		employee.logout();
		employee.exit();


		SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)employee;
		softwareDeveloper.displaySoftwareDeveloperInfo();
		softwareDeveloper.reverseKT();
		softwareDeveloper.task();
	}
}