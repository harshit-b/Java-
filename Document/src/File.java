
public class File extends Document{
	String pathname, all_text;
	
	File (String pathname, String text) {
		super(text);
		this.pathname = pathname;
	}
	
	void setText(String pathname, String text) {
		this.text=text;
		this.pathname=pathname;
	}
	
	void getText() {
		System.out.println("Pathname: " + pathname);
		System.out.println("Text in the file: " + text);
		
	}
	
	public String toString() {
		all_text = pathname+text;
		return all_text;
	}
}
