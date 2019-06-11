import java.io.Serializable;

public class HistoryObject implements Serializable {
   private Integer id;
    private String position;
    private String manager;
    private String hire;
    private String dismiss;
    private Integer code;
    static final long serialVersionUID = 1L;

    public HistoryObject(Integer id, String position, String manager, String date, String dismiss, Integer code) {
        this.id = id;
        this.position = position;
        this.manager = manager;
        this.hire = date;
        this.dismiss = dismiss;
        this.code = code;
    }


    public HistoryObject() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDate() {
        return hire;
    }

    public void setDate(String date) {
        this.hire = date;
    }

    public String getDismiss() {
        return dismiss;
    }

    public void setDismiss(String dismiss) {
        this.dismiss = dismiss;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
