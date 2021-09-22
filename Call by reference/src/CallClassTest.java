
public class CallClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallClass o = new CallClass(10,5);
		System.out.println("This is an example of Call by Value: ");
		o.CallByValue(20,10);
		System.out.println("\nThis is an example of Call by Value: ");
		o.CallByReference(o);

	}

}
