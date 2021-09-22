
public class PaymentTest {
	public static void main(String args[]) {
		CashPayment payment1 = new CashPayment(20);
		CashPayment payment2 = new CashPayment(10);
		CreditCardPayment payment3 = new CreditCardPayment(20, "Harshit Bhargava", "3/2/2021", "4520012331827890");
		CreditCardPayment payment4 = new CreditCardPayment(10, "Hello World", "4/2/2021", "1098786534723874");
		
		payment1.paymentDetails();
		payment2.paymentDetails();
		payment3.paymentDetails();
		payment4.paymentDetails();		
	}
}
