
public class PartTime extends Employee {
	double payPerHour;
	
	PartTime(int ID, String name, double payPerHour) {
		super(ID, name);
		this.payPerHour = payPerHour;
	}
	
	void printData() {
		System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Salary (per hour): " + payPerHour + "\n");
	}
}
