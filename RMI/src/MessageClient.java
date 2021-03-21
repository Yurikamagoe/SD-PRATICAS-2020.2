import java.rmi.Naming;

public class MessageClient {
	public static void main(String[] args) {
		try {
			
			Message msg = (Message) Naming.lookup("rmi://127.0.0.1:32001/Message");
//			System.out.println("Adicao : " + msg.add(12, 11));
//			System.out.println("Sub : " + msg.sub(12, 11));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}