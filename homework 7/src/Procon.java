public class Procon 
{
	public static void main(String[] args) {
		Buffer buff = new Buffer();
		
		Producer producer = new Producer(buff);
		Consumer consumer = new Consumer(buff);
		
		producer.start();
		
		consumer.start();
	}
}