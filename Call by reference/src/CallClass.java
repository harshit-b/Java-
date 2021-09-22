
public class CallClass {
	int x,y;
	
	CallClass(int a, int b){
		x=a;
		y=b;
	}
	
	void CallByValue(int i, int j) {
		System.out.println("The sum of the numbers " + i + " and " + j + " is: " + (i+j));
	}
	
	void CallByReference(CallClass o) {
		System.out.println("The sum of the numbers " + o.x + " and " + o.y + " is: " + (o.x+o.y));
	}

}
