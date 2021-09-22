class Producer extends Thread{
	private Buffer buff;
	
	public Producer(Buffer buff) {
		this.buff = buff;
	}
	
	public void run() {
		while (true) {
			String[] Message =  {"add,5", "multiply,3", "multiply,1",
					"add,6", "add,8", "add,10", "multiply,11"		
					};
			
			for (int i=0; i<7; i++ ) {
				buff.send(Message[i]);
			}
			
			System.exit(1);
		}
	}
}
