
public class Payment {
	double amount;
	
	Payment(double a) {
		amount = a;
	}
	
	void setPayment(double amount) {
		this.amount = amount;
	}
	double getPayment() {
		return amount;
	}
	void paymentDetails() {
		System.out.println("The payment amoount is: $" + amount);
	}

}
