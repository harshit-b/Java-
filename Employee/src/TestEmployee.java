import java.util.Scanner;

public class TestEmployee {
	
	public static void main(String args[]) {
		String name,
			position;
		int id;
		
		Employee[] employees = new Employee [5];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter the employee name: ");
			name = input.next();
			System.out.print("Enter the employee ID: ");
			id = input.nextInt();
			System.out.print("Enter the employee position: ");
			position = input.next();
			employees[i] = new Employee(name, id, position); 
			
		}
		
		for(int i=0; i<3; i++) {
			employees[i].display();
		}

		
	}

}
