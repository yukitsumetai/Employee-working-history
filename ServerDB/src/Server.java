
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends HistoryDbImpl {
    public Server() {}
    public static void main(String args[]) {
        try {
            HistoryDbImpl obj = new HistoryDbImpl();
            HistoryDB stub = (HistoryDB) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.createRegistry(4447);
            registry.bind("HistoryDB", stub);
            System.out.println("Server is up");
            HistoryDbImpl t=new HistoryDbImpl();
            System.out.println( t.getUser("silsil", "12345"));
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

        }
    }
