import java.rmi.Remote;
import java.util.List;

public interface HistoryDB extends Remote{
    List<HistoryObject>  getHistory(String surname) throws Exception;
    List<HistoryObject>  getHistory(int code) throws Exception;
    boolean getUser(String user, String password) throws Exception;
}