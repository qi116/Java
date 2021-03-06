package jrJava.multi_threading_8_networkChat;

import java.io.*;
import java.util.Scanner;

public class MessageReceiver implements Runnable {
	private Scanner scanner;
	private GUI gui;
	public MessageReceiver(InputStream is){
		scanner = new Scanner(is);
		
	}
	public void receive(){
		String message;
		while(true){
			message = scanner.nextLine();
			gui.addMessage(message);
		}
	}
	public void setGUI(GUI gui){
		this.gui = gui;
	}
	public void run(){
		receive();
	}
}
