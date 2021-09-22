
public class Employee {
	String Name;
	int ID;
	String Position;
	
	Employee(String name, int id, String position) {
		Name= name;
		ID=id;
		Position=position;
		
	}
	
	/*
	void EmployeeSet(String name, int id, String position) {
		Name = name;
		ID = id;
		Position = position;
	}
	*/
	
	void display() {
		System.out.println("Employee Name : " + Name);
		System.out.println("Employee ID : " + ID);
		System.out.println("Employee Position : " + Position + "\n\n");
		
	}
}
