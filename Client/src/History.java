import java.rmi.Remote;
import java.util.List;

public interface History extends Remote {
    List<HistoryObject>  getHistory(String surname) throws Exception;
    List<HistoryObject>  getHistory(int code);
    //feature
    HashMap<Integer> test = new HashMap();
    boolean login(String user, String password);
    boolean logout();
}
