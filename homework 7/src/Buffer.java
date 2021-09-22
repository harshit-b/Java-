class Buffer {
	private String Message;
	
	private boolean isMessageBufferFull;
	
	private boolean isResponseBufferFull;
	
	public Buffer () {
		
		this.isMessageBufferFull = true;
	}
	
	public synchronized void send(String Message) {
		
		while (!this.isMessageBufferFull) {
			try {
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		this.Message = Message;
		
		this.isMessageBufferFull = false;
		
		this.notify();
		
		System.out.print("Produced: " + Message + "\t\t");
	}
	
	public synchronized String recieve() {
		while (this.isMessageBufferFull) {
			try {
				
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		this.isMessageBufferFull = true;
		
		this.notify();
		
		String[] str_array = Message.split(",");
		
		String stringa = str_array[0];
		
		int num = Integer.parseInt (str_array[1]);
		
		if(stringa.startsWith("add") == true) {
			num = num+10;
		}
		
		if(stringa.startsWith("multiply") == true) {
			num = num*10;
		}
		
		System.out.println("consumed: " + num);
		
		return Message;
	}
	
	public synchronized void reply(String resp) {
		while (this.isResponseBufferFull) {
			try {
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.isMessageBufferFull = true;
		
		this.notify();
	}
}