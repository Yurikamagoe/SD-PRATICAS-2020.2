package br.ufc.crateus.sd.rmi.client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufc.crateus.sd.rmi.server.Server;

public class ClientImpl extends UnicastRemoteObject implements Client, Runnable {
	
	private static final long serialVersionUID = 4804675865338914646L;
	
	private String name = "";
	private Server s;
	
	protected ClientImpl() throws RemoteException {
		super();
	}

	public ClientImpl(String name, Server s) throws RemoteException {
		this.name = name;
		this.s = s;
		s.addClient(this);
	}

	@Override
	public void getMessage(String message) throws RemoteException {
		System.out.println(message+"\n");
	}
	

	@Override
	public void run() {
		Scanner sc =new Scanner(System.in);
		String message = "";
		
		while(true) {
			System.out.print("Digite sua mensagem, "+name+": \n");
			message = sc.nextLine();
			
			try {
				s.messages(name+" diz: "+message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}



	
}
