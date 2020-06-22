package javaDay19Work;
import java.lang.Object;

public class InterThreadExample {

	public static void main(String[] args) {
		Data data = new Data();
		Thread sender = new Thread(new Sender(data));
		Thread receiver = new Thread(new Receiver(data));
		sender.start();
		receiver.start();
	}

}
