
public class DocumentTest {
	public static void main(String args[]) {
		Email email = new Email("Harshit", "Monty", "Hello", "World");
		File file = new File("Path", "Hello");
		System.out.println(ContainsKeyword(email, "No"));
		System.out.println(ContainsKeyword(file, "Hello"));
		
	}
	
	public static boolean ContainsKeyword(Document docObject, String keyword) {
		if (docObject.toString().indexOf(keyword,0) >= 0) 
			 return true ;
		 else 
			 return false;
		
	} 
}
