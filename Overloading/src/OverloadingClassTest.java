
public class OverloadingClassTest {

	public static void main(String[] args) {
		OverloadingClass overloading = new OverloadingClass();
		overloading.overloadingMethod(1.0);
		overloading.overloadingMethod(5,8,7);
		overloading.overloadingMethod(5,2);
		overloading.overloadingMethod("Anna", 29);
	}

}
