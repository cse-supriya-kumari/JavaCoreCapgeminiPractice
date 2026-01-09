class SoftwareTester extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software Tester";
		branch = "Jalandhar";
		company = "Test Yantra";
		city = "Amritshar";
		state = "Punjab";
		country = "India";
	}
	public void task() {
		System.out.println("Software Tester");
	}
	public reverseKT() {
		System.out.println("Explainion about  a latest Software tools and Development");
	}
	public void displaySoftwareTesterInfo() {
		System.out.println("Software Infoarmation: ");
		System.out.println("____________________________");
		System.out.println("ID: "+id);
		System.out.println("Name : "+name);
		System.out.println("Mail Id : "+mailId);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println("Department : "+ department);
		System.out.println("Branch : "+branch);
		System.out.println("company : "+company);
		System.out.println("DEsigenation : "+designation);
		System.out.println("Salary : "+salary);
		System.out.println("Role : "+role);
		System.out.println("Incentive : "+incentive);
		System.out.println("City : "+city);
		System.out.println("state : "+state);
		System.out.println("Countery : "+country);
	}
}