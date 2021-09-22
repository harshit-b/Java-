
public class CashPayment extends Payment {
	
	CashPayment(double a) {
		super(a);
	}
	void paymentDetails( ) {
		System.out.println("The payment amoount is: " + amount + ", paid in cash");
	}
	
}
