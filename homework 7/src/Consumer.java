class Consumer extends Thread 
{
	private Buffer buff;
	
	public Consumer(Buffer buff) {
		this.buff = buff;
	}
	
	public void run()
	{
		String message="";
		
		while (true)
		{
			message = buff.recieve();
		}
	}
	
}
