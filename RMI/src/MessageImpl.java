import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class MessageImpl extends UnicastRemoteObject implements Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4804675865338914646L;
	protected MessageImpl() throws RemoteException {
		super();
	}

//	public long add(long a, long b) throws RemoteException {
//		return a + b;
//	}
//	
//	public long sub(long a, long b) throws RemoteException {
//		return a - b;
//	}

	@Override
	public String sendMessage(String message) throws RemoteException {

		return message;
	}
}
