
public class CreditCardPayment extends Payment {
	String name, date, number;
	
	CreditCardPayment(double a, String name, String date, String number) {
		super(a);
		this.name=name;
		this.date=date;
		this.number=number;	
	}
	
	void paymentDetails() {
		System.out.println("The payment amoount is: " + amount + ", paid by card");
		System.out.println("Cardholder information: ");
		System.out.println("Name: " + name);
		System.out.println("Date: " + date);
		System.out.println("Number: " + number);
	}
}
