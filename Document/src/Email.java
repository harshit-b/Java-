
public class Email extends Document{
	String sender, recipient, title, body, all_text;
	
	Email(String sender, String recipient, String title, String body) {
		super(body);
		this.sender=sender;
		this.recipient=recipient;
		this.title=title;
	}
	
	void setText(String sender, String recipient, String title, String body) {
		text=body;
		this.sender=sender;
		this.recipient=recipient;
		this.title=title;
	}
	
	void getText() {
		System.out.println("Sender: " + sender);
		System.out.println("Recipient: " + recipient);
		System.out.println("Title: " + title);
		System.out.println("message: " + text);
	}
	
	public String toString() {
		all_text = sender+recipient+title+text;
		return all_text;
	}

}
