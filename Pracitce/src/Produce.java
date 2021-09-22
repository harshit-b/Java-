import java.lang.*;
import java.util.*;


class Producer extends Thread{
	private Buffer buff;
	
	public Producer(Buffer buff) {
		this.buff = buff;
	}
	
	public void run() {
		while (true) {
			String[] Message =  {"add(),1", "multiply(),1", "multiply(),2",
					"add(),3", "add(),3", "add(),4", "multiply(),3"		
					};
			
			for (int i=0; i<7; i++ ) {
				buff.send(Message[i]);
			}
			
			System.exit(1);
		}
	}
}

class Consumer extends Thread 
{
	private Buffer buff;
	
	public Consumer(Buffer buff) {
		this.buff = buff;
	}
	
	public void run()
	{
		String msg;
		
		//Loop
		while (true)
		{
			//Call method
			msg = buff.recieve()
		}
	}
	
}

public class Procon 
{
	public static void main(String[] args) {
		Buffer buff = new Buffer();
		
		Producer pro = new Producer(buff);
		Consumer con = new Consumer(buff);
		
		pro.start();
		
		con.start();
	}
}

class Buffer {
	private String Message;
	
	private String Response;
	
	private boolean messageBufferFull;
	
	private boolean responseBufferFull;
	
	public Buffer () {
		
		this.messageBufferFull = true;
	}
	
	public synchronized void send(String Message) {
		
		while (!this.messageBufferFull) {
			try {
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		this.Message = Message;
		
		this.messageBufferFull = false;
		
		this.notify();
		
		System.out.print("Produced: " + Message);
	}
	
	public synchronized String recieve() {
		while (this.messageBufferFull) {
			try {
				
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		this.messageBufferFull = true;
		
		this.notify();
		
		String[] str_array = Message.split(",");
		
		String stringa = str_array[0];
		
		int num = Integer.parseInt (str_array[1]);
		
		if(stringa.startsWith("add()") == true) {
			num = num+10;
		}
		
		if(stringa.startsWith("multiply()") == true) {
			num = num*10;
		}
		
		System.out.println("consumed: " + num);
		
		return Message;
	}
	
	public synchronized void reply(String resp) {
		while (this.responseBufferFull) {
			try {
				this.wait();
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.messageBufferFull = true;
		
		this.notify();
	}
}