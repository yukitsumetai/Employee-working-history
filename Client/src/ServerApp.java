import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class ServerApp implements History {
    @Override
    public List<HistoryObject> getHistory(String surname) throws Exception {
        List<HistoryObject> list = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry(6879);
            HistoryDB stub = (HistoryDB) registry.lookup("HistoryDB");
            list = (List)stub.getHistory(surname);
        } catch (Exception e) {
            System.err.println("ServerApp exception: " + e.toString());
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<HistoryObject> getHistory(int code) {
        List<HistoryObject> list = new ArrayList<>();
        try {
            Registry registry = LocateRegistry.getRegistry(6879);
           HistoryDB stub = (HistoryDB) registry.lookup("HistoryDB");
            list = (List)stub.getHistory(code);
        } catch (Exception e) {
            System.err.println("ServerApp exception: " + e.toString());
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean login(String user, String password) {
        boolean exists=false;
      if (System.getSecurityManager() == null) {

          System.setSecurityManager(new SecurityManager());

      }
        try {
            Registry registry = LocateRegistry.getRegistry(4447);
            HistoryDB stub = (HistoryDB) registry.lookup("HistoryDB");
           exists = stub.getUser(user, password);
        } catch (Exception e) {
            System.err.println("ServerApp exception: " + e.toString());
            e.printStackTrace();
        }
        return exists;
    }

    @Override
    public boolean logout() {
        return false;
    }


    }
