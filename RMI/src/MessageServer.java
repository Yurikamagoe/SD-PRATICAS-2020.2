import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MessageServer {
	MessageServer() {
		try {
			LocateRegistry.createRegistry(32001); 
			Message msg = new MessageImpl();
			Naming.rebind("rmi://127.0.0.1:32001/Message", msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MessageServer();
	}
}