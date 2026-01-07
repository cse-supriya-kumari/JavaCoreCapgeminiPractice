class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;
	static {
		city = "Jalandhar";
		state = "Punjab";
		country = "India";
		branch = "Amritsaar";
		department = "SoftwareDevelopment";
		company = "Capgemini";
	}
	SoftwareDeveloper
	(
		int id, String name, String mailId, long contactNumber, String designation,
		double salary, String role, double incentive
	) {
		super(id,name, mailId, contactNumber);
		this.designation = designation;
		this.salary = salary;
		this.role = role;
		this.incentive = incentive;
	}
	@Override
	public void reverseKT() {
		System.out.println("Explantion about latest SoftwareDevelopment tools and th");
	}
	@Override
	public void task() {
		System.out.println("Sogtware Developmant");
	}
	@Override
	public void employeeInfo() {
		System.out.println("Employee Information: ");
		System.out.println("____________________");
		System.out.println("ID : "+super.id);
		System.out.println("Name : "+super.name);
		System.out.println("Mail Id :"+super.mailId);
		System.out.println("contact Number : "+ super.contactNumber);
		System.out.println("Desigination : "+designation);
		System.out.println("Salary: "+this.salary);
		System.out.println("Role : "+this.role);
		System.out.println("Incentive : "+ this.incentive);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println("Branch : "+branch);
		System.out.println("Depatment  : "+department);
		System.out.println("Company : "+company);

		System.out.println();
	}
}