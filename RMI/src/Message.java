import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
	public String sendMessage(String message) throws RemoteException;
}
