package br.ufc.crateus.sd.rmi.client;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
	public void getMessage(String message) throws RemoteException;
}
