package jrJava.multi_threading_7_twoWayNetworking;

import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageSender {

	private PrintWriter pw; //sends msgs
	private Scanner scanner;

	public MessageSender(OutputStream os){
		pw = new PrintWriter(os);
		scanner = new Scanner(System.in);
	}

	public void send(){

		String message;
		System.out.println("Send message: ");
		while(true){
			message = scanner.nextLine();
			pw.println(message);
			pw.flush();
		}
	}

}
