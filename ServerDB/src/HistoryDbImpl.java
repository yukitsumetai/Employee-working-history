import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HistoryDbImpl implements HistoryDB {
    String DB_URL = "jdbc:mysql://localhost:3306/projectspring";

    // Database credentials
    String USER = "ekochuro";
    String PASS = "moon2207";
    Connection conn = null;
    Statement stmt = null;

    @Override
    public boolean getUser(String user, String password) throws Exception {
        boolean result=false;
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        stmt = conn.createStatement();
        String sql = "SELECT * FROM employees WHERE login =\"" + user + "\" AND psw =\"" + password + "\"";
        ResultSet rs = stmt.executeQuery(sql);

        //Extract data from result set
       if (rs.next()) result=true;
        rs.close();
        return result;
    }

    @Override
    public List<HistoryObject> getHistory(String surname) throws Exception{
        List<HistoryObject> list = new ArrayList<HistoryObject>();
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT * FROM employeehistory LEFT JOIN employees AS e  on code=e.code WHERE last_name =\"" + surname + "\"";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("id");
            String position = rs.getString("position");
            String manager = rs.getString("manager");
            String hire = rs.getString("hire");
            String dismiss = rs.getString("dismiss");
            int code2= rs.getInt("code");

            // Setting the values
            HistoryObject history = new HistoryObject(id, position, manager, hire, dismiss, code2);
            list.add(history);
        }
        rs.close();
        return list;
    }


    @Override
    public List<HistoryObject> getHistory(int code) throws Exception {
        List<HistoryObject> list = new ArrayList<HistoryObject>();
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT * FROM employeehistory WHERE code =\"" + code + "\"";
        ResultSet rs = stmt.executeQuery(sql);

        //Extract data from result set
        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("id");
            String position = rs.getString("position");
            String manager = rs.getString("manager");
            String hire = rs.getString("hire");
            String dismiss = rs.getString("dismiss");
            int code2= rs.getInt("code");

            // Setting the values
            HistoryObject history = new HistoryObject(id, position, manager, hire, dismiss, code2);
            list.add(history);
        }
        rs.close();
        return list;
    }

}
