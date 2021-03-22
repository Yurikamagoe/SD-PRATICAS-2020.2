package br.ufc.crateus.sd.rmi.client;
import java.rmi.Naming;
import java.util.Scanner;

import br.ufc.crateus.sd.rmi.server.Server;

public class MessengerClient {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String name = "";
		
		try {
			
			Server srv = (Server) Naming.lookup("rmi://127.0.0.1:32001/MessengerService");
			System.out.println("Digite seu nome:");
			name = s.nextLine();
			
			new Thread(new ClientImpl(name, srv)).run();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}