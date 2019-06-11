import java.rmi.Remote;
import java.util.List;

public interface History extends Remote {
    List<HistoryObject>  getHistory(String surname) throws Exception;
    List<HistoryObject>  getHistory(int code);
    boolean login(String user, String password);
    boolean logout();
}
