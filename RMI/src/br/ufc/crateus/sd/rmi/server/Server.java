package br.ufc.crateus.sd.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.ufc.crateus.sd.rmi.client.Client;

public interface Server extends Remote {
	public void addClient(Client c) throws RemoteException;
	public void messages(String message) throws RemoteException;

}
