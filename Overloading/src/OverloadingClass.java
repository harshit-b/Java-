
public class OverloadingClass {
	OverloadingClass(){}
	
	void overloadingMethod(double a) {
		System.out.println(a);
	}
	
	void overloadingMethod(int a, int b, int c ) {
		System.out.println("a, b and c: " + a + ", " + b + ", " + c);
	}
	
	void overloadingMethod(int a, int b) {
		System.out.println("The sum of number is: " + a + "+" + b + "=" + (a+b));
	}
	
	void overloadingMethod(String name, int age) {
		System.out.println(name + "is " + age + " years old.");
	}

}
