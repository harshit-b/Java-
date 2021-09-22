
public class Employee {
	String name;
	int ID;
	
	Employee(int ID, String name){
		this.ID = ID;
		this.name = name;
	}
	
	void printData() {
		System.out.println("ID: " + ID);
		System.out.println("Name: " + ID + "\n");
		
	}
}
