package br.ufc.crateus.sd.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.ufc.crateus.sd.rmi.client.Client;

public class ServerImpl extends UnicastRemoteObject implements Server {

	private static final long serialVersionUID = 518874729652256368L;
	private List<Client> clients;

	protected ServerImpl() throws RemoteException{
		clients = new ArrayList<>();
	}

	@Override
	public synchronized void addClient(Client c) throws RemoteException {
		this.clients.add(c);
	}

	@Override
	public synchronized void messages(String message) throws RemoteException {
		for (Client client : clients) {
			client.getMessage(message);
		}
	}

	

}
