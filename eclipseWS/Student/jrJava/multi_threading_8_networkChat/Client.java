package jrJava.multi_threading_8_networkChat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		
		GUI gui = new GUI("Client");

		
		Socket s = new Socket("", 5454);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		MessageSender sender = new MessageSender(os);
		MessageReceiver receiver = new MessageReceiver(is);
		
		receiver.setGUI(gui);
		gui.setMessageSender(sender);
		
		Thread t1 = new Thread(receiver);
		t1.start();
		
	}

}
