
public class FullTime extends Employee {
	double payPerMonth;
	
	FullTime(int ID, String name, double payPerMonth) {
		super(ID, name);
		this.payPerMonth = payPerMonth;
	}
	
	void printData() {
		System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Salary (per hour): " + payPerMonth + "\n");
	}
}
