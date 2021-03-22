package br.ufc.crateus.sd.rmi.server;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import br.ufc.crateus.sd.rmi.client.Client;

public class MessengerServer {
	MessengerServer() {
		try {
			LocateRegistry.createRegistry(32001); 
			Server s = new ServerImpl();
			Naming.rebind("rmi://127.0.0.1:32001/MessengerService", s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MessengerServer();
	}
}